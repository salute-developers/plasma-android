package com.sdds.api.info.ksp

import com.google.devtools.ksp.getDeclaredFunctions
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.KSValueParameter
import com.sdds.api.info.ksp.internal.ComponentMeta
import com.sdds.api.info.ksp.internal.ParameterMeta
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.IOException

/**
 * Провайдер KSP-процессора, отвечающий за создание экземпляра [ApiInfoProcessor].
 */
class ApiInfoProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return ApiInfoProcessor(environment.codeGenerator, environment.logger, environment.options)
    }
}

/**
 * KSP-процессор, собирающий метаинформацию о API-компонентах,
 * помеченных аннотацией `@ApiInfo`.
 *
 * Процессор:
 * - находит интерфейсы, аннотированные `@ApiInfo`;
 * - анализирует их методы и параметры;
 * - определяет типы параметров;
 * - рекурсивно разворачивает builder-lambda структуры;
 * - формирует JSON-файл с описанием компонентов.
 *
 * Результат сохраняется в файл:
 * `sdds/api/uikit-api-meta.json`.
 *
 * @property codeGenerator генератор файлов KSP.
 * @property logger логгер KSP.
 * @param options параметры процессора.
 */
class ApiInfoProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger,
    options: Map<String, String>,
) : SymbolProcessor {

    private enum class ParameterType { SHAPE, COLOR, TYPOGRAPHY, DIMENSION, COMPONENT_STYLE, PRIMITIVE, VALUE, UNKNOWN }

    private val components = mutableListOf<ComponentMeta>()

    override fun process(resolver: Resolver): List<KSAnnotated> {
        resolver
            .getSymbolsWithAnnotation("com.sdds.api.info.compose.ApiInfo")
            .filterIsInstance<KSClassDeclaration>()
            .filter { it.classKind == ClassKind.INTERFACE }
            .forEach { classDeclaration ->
                processStyleBuilder(classDeclaration)?.let { components.add(it) }
            }
        return emptyList()
    }

    @Suppress("SpreadOperator")
    override fun finish() {
        if (components.isEmpty()) return
        val json = Json { prettyPrint = true }
        val allSourceFiles = components.mapNotNull { it.sourceFile }.toTypedArray()
        try {
            codeGenerator.createNewFile(
                dependencies = Dependencies(aggregating = true, *allSourceFiles),
                packageName = "sdds/api",
                fileName = "uikit-api-meta",
                extensionName = "json",
            ).writer().use { it.write(json.encodeToString(components)) }
        } catch (e: FileAlreadyExistsException) {
            logger.warn("uikit-api-meta.json already exists, skipping")
        } catch (e: IOException) {
            logger.error("Failed to write meta: ${e::class.simpleName}: ${e.message}")
        }
    }

    private fun processStyleBuilder(classDeclaration: KSClassDeclaration): ComponentMeta? {
        val qualifiedName = classDeclaration.qualifiedName?.asString() ?: return null
        val collectedTypes = linkedSetOf<String>()
        val params = mutableListOf<ParameterMeta>()

        classDeclaration.getDeclaredFunctions()
            .filter { it.simpleName.asString() !in SKIP_METHODS && !it.isDeprecated() }
            .forEach { func ->
                val param = func.parameters.firstOrNull() ?: return@forEach
                val paramType = param.type.resolve()

                if (paramType.isExtensionFunctionType()) {
                    val group = func.simpleName.asString()
                    flattenBuilderLambda(paramType, group, collectedTypes)
                        .let { params.addAll(it) }
                } else {
                    collectSimpleParam(func, param, paramType, GROUP_ROOT, collectedTypes)
                        ?.let { params.add(it) }
                }
            }

        return ComponentMeta(
            componentName = extractComponentName(classDeclaration.simpleName.asString()),
            qualifiedName = qualifiedName,
            resolvedTypes = collectedTypes.sorted(),
            params = params,
            sourceFile = classDeclaration.containingFile,
        )
    }

    private fun flattenBuilderLambda(
        lambdaType: KSType,
        group: String,
        collectedTypes: LinkedHashSet<String>,
    ): List<ParameterMeta> {
        val receiverDeclaration = lambdaType.arguments
            .firstOrNull()
            ?.type
            ?.resolve()
            ?.declaration as? KSClassDeclaration
            ?: return emptyList()

        if (receiverDeclaration.classKind != ClassKind.INTERFACE) return emptyList()

        val result = mutableListOf<ParameterMeta>()

        receiverDeclaration
            .getDeclaredFunctions()
            .filter { it.simpleName.asString() !in SKIP_METHODS && !it.isDeprecated() }
            .forEach { func ->
                val param = func.parameters.firstOrNull() ?: return@forEach
                val paramType = param.type.resolve()

                if (paramType.isExtensionFunctionType()) {
                    val nestedGroup = "$group.${func.simpleName.asString()}"
                    result.addAll(flattenBuilderLambda(paramType, nestedGroup, collectedTypes))
                } else {
                    collectSimpleParam(func, param, paramType, group, collectedTypes)
                        ?.let { result.add(it) }
                }
            }

        return result
    }

    private fun collectSimpleParam(
        func: KSFunctionDeclaration,
        param: KSValueParameter,
        paramType: KSType,
        group: String,
        collectedTypes: LinkedHashSet<String>,
    ): ParameterMeta? {
        val qualifiedName = paramType.declaration.qualifiedName?.asString() ?: return null
        val simpleName = paramType.declaration.simpleName.asString()

        collectedTypes.add(qualifiedName)
        paramType.arguments.forEach { arg ->
            arg.type?.resolve()?.declaration?.qualifiedName?.asString()
                ?.let { collectedTypes.add(it) }
        }

        val type = classifyType(simpleName, qualifiedName, paramType)

        val paramName = param.name?.asString() ?: return null
        val methodName = func.simpleName.asString()

        return ParameterMeta(
            type = type.name.lowercase(),
            id = func.propertyName() ?: methodName,
            methodName = methodName,
            paramName = paramName,
            paramQualifiedType = qualifiedName,
            paramSimpleType = simpleName,
            group = group,
            values = if (type == ParameterType.VALUE) extractEnumValues(paramType) else emptyList(),
        )
    }

    private fun KSFunctionDeclaration.propertyName(): String? =
        annotations
            .firstOrNull {
                it.annotationType.resolve()
                    .declaration
                    .qualifiedName
                    ?.asString() == "com.sdds.api.info.compose.Property"
            }
            ?.arguments
            ?.firstOrNull { it.name?.asString() == "name" }
            ?.value as? String

    private fun extractEnumValues(paramType: KSType): List<String> =
        (paramType.declaration as? KSClassDeclaration)
            ?.declarations
            ?.filterIsInstance<KSClassDeclaration>()
            ?.filter { it.classKind == ClassKind.ENUM_ENTRY }
            ?.map { it.simpleName.asString() }
            ?.toList()
            ?: emptyList()

    private fun classifyType(
        simpleName: String,
        qualifiedName: String,
        paramType: KSType,
    ): ParameterType = when {
        isEnumClass(paramType) -> ParameterType.VALUE
        isComponentStyle(simpleName, qualifiedName) -> ParameterType.COMPONENT_STYLE
        SHAPE_KEYWORDS.any { simpleName.contains(it) } -> ParameterType.SHAPE
        COLOR_KEYWORDS.any { simpleName.contains(it) } -> ParameterType.COLOR
        TYPOGRAPHY_KEYWORDS.any { simpleName.contains(it) } -> ParameterType.TYPOGRAPHY
        DIMENSION_KEYWORDS.any { simpleName.contains(it) } -> ParameterType.DIMENSION
        qualifiedName in PRIMITIVE_TYPES -> ParameterType.PRIMITIVE
        else -> ParameterType.UNKNOWN
    }

    private fun KSType.isExtensionFunctionType(): Boolean =
        annotations.any {
            it.annotationType.resolve()
                .declaration
                .qualifiedName
                ?.asString() == "kotlin.ExtensionFunctionType"
        }

    private fun KSFunctionDeclaration.isDeprecated(): Boolean =
        annotations.any {
            it.annotationType.resolve()
                .declaration
                .qualifiedName
                ?.asString() == "kotlin.Deprecated"
        }

    private fun isEnumClass(paramType: KSType): Boolean =
        (paramType.declaration as? KSClassDeclaration)?.classKind == ClassKind.ENUM_CLASS

    private fun isComponentStyle(simpleName: String, qualifiedName: String): Boolean =
        simpleName.endsWith("Style") && qualifiedName.startsWith("com.sdds.compose.uikit.")

    private fun extractComponentName(builderName: String) =
        builderName.removeSuffix("StyleBuilder").removeSuffix("Builder")

    companion object {
        private const val GROUP_ROOT = "root"
        private val SKIP_METHODS = setOf("equals", "hashCode", "toString", "style", "build")
        private val SHAPE_KEYWORDS = setOf("Shape")
        private val COLOR_KEYWORDS = setOf("Color", "Brush", "InteractiveColor")
        private val TYPOGRAPHY_KEYWORDS = setOf("TextStyle", "Typography", "Font")
        private val DIMENSION_KEYWORDS =
            setOf("Dp", "Dimension", "Padding", "Size", "Width", "Height", "Radius", "Diameter")
        private val PRIMITIVE_TYPES = setOf(
            "kotlin.Boolean",
            "kotlin.Float",
            "kotlin.Double",
            "kotlin.Int",
            "kotlin.Long",
            "kotlin.String",
        )
    }
}
