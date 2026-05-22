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
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.KSValueParameter
import com.sdds.api.info.ksp.internal.ComponentMeta
import com.sdds.api.info.ksp.internal.EnumValueInfo
import com.sdds.api.info.ksp.internal.ParameterMeta
import com.sdds.api.info.ksp.internal.StateEnum
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

    private enum class ParameterType {
        SHAPE,
        COLOR,
        TYPOGRAPHY,
        DIMENSION,
        COMPONENT_STYLE,
        FLOAT,
        INTEGER,
        BOOLEAN,
        ICON,
        VALUE,
        UNKNOWN,
    }

    private val components = mutableListOf<ComponentMeta>()

    override fun process(resolver: Resolver): List<KSAnnotated> {
        val stateEnumsByComponent = collectStateEnumsByComponent(resolver)

        resolver
            .getSymbolsWithAnnotation(API_INFO_ANNOTATION)
            .filterIsInstance<KSClassDeclaration>()
            .filter { it.classKind == ClassKind.INTERFACE }
            .forEach { classDeclaration ->
                processStyleBuilder(
                    classDeclaration = classDeclaration,
                    stateEnumsByComponent = stateEnumsByComponent,
                )?.let { components.add(it) }
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

    private fun processStyleBuilder(
        classDeclaration: KSClassDeclaration,
        stateEnumsByComponent: Map<String, StateEnum>,
    ): ComponentMeta? {
        val qualifiedName = classDeclaration.qualifiedName?.asString() ?: return null
        val componentName = extractComponentName(classDeclaration.simpleName.asString())

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
            componentName = componentName,
            qualifiedName = qualifiedName,
            resolvedTypes = collectedTypes.sorted(),
            stateEnum = stateEnumsByComponent[componentName],
            params = params,
            sourceFile = classDeclaration.containingFile,
        )
    }

    private fun collectStateEnumsByComponent(resolver: Resolver): Map<String, StateEnum> =
        resolver
            .getSymbolsWithAnnotation(STATE_SET_INFO_ANNOTATION)
            .filterIsInstance<KSClassDeclaration>()
            .filter { it.classKind == ClassKind.ENUM_CLASS }
            .flatMap { enumDeclaration ->
                val stateEnum = enumDeclaration.toStateEnum()

                enumDeclaration.stateSetComponentNames()
                    .ifEmpty { listOf(enumDeclaration.defaultComponentNameFromStateEnum()) }
                    .filter { it.isNotBlank() }
                    .map { componentName -> componentName to stateEnum }
            }
            .toMap()

    private fun KSClassDeclaration.toStateEnum(): StateEnum {
        val qualifiedName = qualifiedName?.asString().orEmpty()
        val simpleName = simpleName.asString()

        return StateEnum(
            qualifiedName = qualifiedName,
            simpleName = simpleName,
            values = declarations
                .filterIsInstance<KSClassDeclaration>()
                .filter { it.classKind == ClassKind.ENUM_ENTRY }
                .map { enumEntry ->
                    val name = enumEntry.simpleName.asString()

                    EnumValueInfo(
                        name = name,
                        configName = enumEntry.stateConfigName().ifBlank { name },
                    )
                }
                .toList(),
        )
    }

    private fun KSClassDeclaration.stateSetComponentNames(): List<String> =
        annotations
            .firstOrNull { it.hasQualifiedName(STATE_SET_INFO_ANNOTATION) }
            ?.argumentValue<String>("components")
            .orEmpty()
            .split(",", ";", "|", " ")
            .map { it.trim() }
            .filter { it.isNotBlank() }

    private fun KSClassDeclaration.stateConfigName(): String =
        annotations
            .firstOrNull { it.hasQualifiedName(STATE_INFO_ANNOTATION) }
            ?.argumentValue<String>("configName")
            .orEmpty()

    private fun KSClassDeclaration.defaultComponentNameFromStateEnum(): String =
        simpleName.asString()
            .removeSuffix("StateSet")
            .removeSuffix("States")
            .removeSuffix("State")

    private fun KSAnnotation.hasQualifiedName(qualifiedName: String): Boolean =
        annotationType.resolve()
            .declaration
            .qualifiedName
            ?.asString() == qualifiedName

    private inline fun <reified T> KSAnnotation.argumentValue(name: String): T? =
        arguments
            .firstOrNull { it.name?.asString() == name }
            ?.value as? T
            ?: arguments
                .firstOrNull()
                ?.value as? T

    private fun KSType.unwrapStatefulValue(): KSType =
        if (declaration.qualifiedName?.asString() == STATEFUL_VALUE) {
            arguments.firstOrNull()
                ?.type
                ?.resolve()
                ?: this
        } else {
            this
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

    @Suppress("ReturnCount")
    private fun collectSimpleParam(
        func: KSFunctionDeclaration,
        param: KSValueParameter,
        paramType: KSType,
        group: String,
        collectedTypes: LinkedHashSet<String>,
    ): ParameterMeta? {
        val actualQualifiedName = paramType.declaration.qualifiedName?.asString() ?: return null
        val actualSimpleName = paramType.declaration.simpleName.asString()

        val effectiveParamType = paramType.unwrapStatefulValue()
        val effectiveQualifiedName = effectiveParamType.declaration.qualifiedName?.asString() ?: return null
        val effectiveSimpleName = effectiveParamType.declaration.simpleName.asString()

        collectedTypes.add(actualQualifiedName)
        collectedTypes.add(effectiveQualifiedName)

        paramType.arguments.forEach { arg ->
            arg.type?.resolve()?.declaration?.qualifiedName?.asString()
                ?.let { collectedTypes.add(it) }
        }

        val type = classifyType(
            simpleName = effectiveSimpleName,
            qualifiedName = effectiveQualifiedName,
            paramType = effectiveParamType,
            param = param,
        )

        val paramName = param.name?.asString() ?: return null
        val methodName = func.simpleName.asString()

        return ParameterMeta(
            type = type.name.lowercase(),
            id = func.propertyName() ?: methodName,
            methodName = methodName,
            paramName = paramName,
            paramQualifiedType = actualQualifiedName,
            paramSimpleType = actualSimpleName,
            group = group,
            values = if (type == ParameterType.VALUE) extractEnumValues(effectiveParamType) else emptyList(),
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
        param: KSValueParameter,
    ): ParameterType = when {
        isEnumClass(paramType) -> ParameterType.VALUE
        isComponentStyle(simpleName, qualifiedName) -> ParameterType.COMPONENT_STYLE
        isDrawableRes(param) -> ParameterType.ICON
        SHAPE_KEYWORDS.any { simpleName.contains(it) } -> ParameterType.SHAPE
        COLOR_KEYWORDS.any { simpleName.contains(it) } -> ParameterType.COLOR
        TYPOGRAPHY_KEYWORDS.any { simpleName.contains(it) } -> ParameterType.TYPOGRAPHY
        DIMENSION_KEYWORDS.any { simpleName.contains(it) } -> ParameterType.DIMENSION
        qualifiedName == "kotlin.Float" -> ParameterType.FLOAT
        qualifiedName == "kotlin.Boolean" -> ParameterType.BOOLEAN
        qualifiedName == "kotlin.Int" -> ParameterType.INTEGER
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

    private fun isDrawableRes(param: KSValueParameter): Boolean =
        param.annotations.any {
            it.annotationType.resolve()
                .declaration
                .qualifiedName
                ?.asString() == DRAWABLE_RES
        }

    private fun extractComponentName(builderName: String) =
        builderName.removeSuffix("StyleBuilder").removeSuffix("Builder")

    companion object {
        private const val STATEFUL_VALUE = "com.sdds.compose.uikit.interactions.StatefulValue"
        private const val API_INFO_ANNOTATION = "com.sdds.api.info.compose.ApiInfo"
        private const val STATE_SET_INFO_ANNOTATION = "com.sdds.api.info.compose.StateSetInfo"
        private const val STATE_INFO_ANNOTATION = "com.sdds.api.info.compose.StateInfo"
        private const val DRAWABLE_RES = "androidx.annotation.DrawableRes"
        private const val GROUP_ROOT = "root"
        private val SKIP_METHODS = setOf("equals", "hashCode", "toString", "style", "build")
        private val SHAPE_KEYWORDS = setOf("Shape")
        private val COLOR_KEYWORDS = setOf("Color", "Brush", "InteractiveColor")
        private val TYPOGRAPHY_KEYWORDS = setOf("TextStyle", "Typography", "Font")
        private val DIMENSION_KEYWORDS =
            setOf("Dp", "Dimension", "Padding", "Size", "Width", "Height", "Radius", "Diameter")
    }
}
