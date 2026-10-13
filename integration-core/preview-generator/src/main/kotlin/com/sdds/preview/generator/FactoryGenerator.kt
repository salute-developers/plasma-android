package com.sdds.preview.generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName
import java.io.File

internal const val GENERATED_PACKAGE = "com.sdds.preview.compose.generated"
private const val SDK_PACKAGE = "com.sdds.preview.compose"
private const val CONTRACT_PACKAGE = "com.sdds.preview.contract"

private val GENERATED_FACTORY = ClassName(SDK_PACKAGE, "GeneratedStyleFactory")
private val STATE_MAP = ClassName(SDK_PACKAGE, "PreviewStateMap")
private val STYLE_CONTEXT = ClassName(SDK_PACKAGE, "PreviewStyleContext")
private val THEME = ClassName(SDK_PACKAGE, "PreparedComposeTheme")
private val PROPERTY_VALUE = ClassName(CONTRACT_PACKAGE, "PreviewPropertyValue")
private val PAYLOAD = ClassName(CONTRACT_PACKAGE, "PreviewPayload")
private val COMPOSABLE = ClassName("androidx.compose.runtime", "Composable")
private val BRUSH = ClassName("androidx.compose.ui.graphics", "Brush")
private val COLOR = ClassName("androidx.compose.ui.graphics", "Color")
private val VALUE_STATE = ClassName("com.sdds.compose.uikit.interactions", "ValueState")

private fun sdk(name: String) = MemberName(SDK_PACKAGE, name)

/** Формат с неразрывными пробелами: KotlinPoet иначе переносит строки по пробелам и ломает `?.let { ... }`. */
private fun cb(format: String, vararg args: Any?): CodeBlock = CodeBlock.of(format.replace(" ", "·"), *args)

private fun CodeBlock.Builder.addNb(format: String, vararg args: Any?): CodeBlock.Builder =
    add(format.replace(" ", "·"), *args)

/** Порождает исходники сгенерированных фабрик и реестра фабрик. */
internal class FactoryGenerator(private val components: List<ComponentMeta>) {

    /** Записывает по файлу на компонент и файл реестра в [outputDir]. */
    fun generate(outputDir: File) {
        components.forEach { component -> componentFile(component).writeTo(outputDir) }
        registryFile().writeTo(outputDir)
    }

    private fun factoryName(component: ComponentMeta) = "${component.componentName}PreviewStyleFactory"

    private fun registryFile(): FileSpec {
        val map = CodeBlock.builder().add("mapOf(\n").indent()
        components.forEach { map.add("%S to %L,\n", it.componentName, factoryName(it)) }
        map.unindent().add(")")
        val registry = TypeSpec.objectBuilder("GeneratedPreviewStyleFactories")
            .addModifiers(KModifier.INTERNAL)
            .addProperty(
                PropertySpec.builder(
                    "all",
                    Map::class.asClassName().parameterizedBy(
                        String::class.asTypeName(),
                        GENERATED_FACTORY.parameterizedBy(com.squareup.kotlinpoet.STAR),
                    ),
                ).initializer(map.build()).build(),
            )
            .build()
        return FileSpec.builder(GENERATED_PACKAGE, "GeneratedPreviewStyleFactories").addType(registry).build()
    }

    private fun componentFile(component: ComponentMeta): FileSpec {
        val styleClass = ClassName.bestGuess(component.styleQualifiedName)
        val unsupported = mutableSetOf<String>()
        val statesProperty = stateMapProperty(component)
        val build = FunSpec.builder("build")
            .addModifiers(KModifier.OVERRIDE)
            .addAnnotation(COMPOSABLE)
            .addParameter(
                "properties",
                Map::class.asClassName().parameterizedBy(String::class.asTypeName(), PROPERTY_VALUE),
            )
            .addParameter("theme", THEME)
            .addParameter("context", STYLE_CONTEXT)
            .returns(styleClass)
            .addCode(buildBody(component, styleClass, unsupported))
            .build()
        val create = FunSpec.builder("create")
            .addModifiers(KModifier.OVERRIDE)
            .addAnnotation(COMPOSABLE)
            .addParameter("payload", PAYLOAD)
            .addParameter("theme", THEME)
            .returns(styleClass)
            .addStatement(
                "return build(payload.component.properties, theme, payload.%M(%T.all))",
                sdk("styleContext"),
                ClassName(GENERATED_PACKAGE, "GeneratedPreviewStyleFactories"),
            )
            .build()
        val type = TypeSpec.objectBuilder(factoryName(component))
            .addModifiers(KModifier.INTERNAL)
            .addSuperinterface(GENERATED_FACTORY.parameterizedBy(styleClass))
            .addProperty(
                PropertySpec.builder("componentName", String::class, KModifier.OVERRIDE)
                    .initializer("%S", component.componentName).build(),
            )
            .addProperty(statesProperty)
            .addProperty(
                PropertySpec.builder(
                    "unsupportedProperties",
                    Set::class.asClassName().parameterizedBy(String::class.asTypeName()),
                    KModifier.OVERRIDE,
                ).initializer("setOf(%L)", unsupportedLiteral(component)).build(),
            )
            .addFunction(build)
            .addFunction(create)
            .build()
        return FileSpec.builder(GENERATED_PACKAGE, factoryName(component))
            .addAnnotation(
                AnnotationSpec.builder(Suppress::class)
                    .addMember("%S", "DEPRECATION")
                    .addMember("%S", "UNCHECKED_CAST")
                    .addMember("%S", "UNUSED_VARIABLE")
                    .build(),
            )
            .addType(type)
            .build()
    }

    private fun unsupportedLiteral(component: ComponentMeta): String =
        component.params.filter { it.type == "icon" || it.type == "shadow" }.map { it.id }.distinct()
            .joinToString(", ") { "\"$it\"" }

    private fun stateMapProperty(component: ComponentMeta): PropertySpec {
        val entries = CodeBlock.builder()
        val stateEnum = component.stateEnum
        if (stateEnum != null) {
            val enumClass = ClassName.bestGuess(stateEnum.qualifiedName)
            stateEnum.values.forEach { value ->
                entries.add("%S to %T.%L, ", value.configName.lowercase(), enumClass, value.name)
            }
        }
        return PropertySpec.builder("states", STATE_MAP, KModifier.OVERRIDE)
            .initializer(
                if (stateEnum != null) {
                    CodeBlock.of("%T(mapOf<String, %T>(%L))", STATE_MAP, VALUE_STATE, entries.build())
                } else {
                    CodeBlock.of("%T()", STATE_MAP)
                },
            )
            .build()
    }

    private fun buildBody(component: ComponentMeta, styleClass: ClassName, unsupported: MutableSet<String>): CodeBlock {
        val code = CodeBlock.builder()
        if (component.builderFunName.isNotBlank()) {
            code.addStatement(
                "val builder = %T.%M()",
                styleClass,
                MemberName(styleClass.packageName, component.builderFunName),
            )
        } else {
            code.addStatement("val builder = %T.builder()", styleClass)
        }
        val tree = GroupTree()
        val supported = component.params.filter { it.deprecated == null && it.isSupportedValueType() }
        supported.groupBy { it.group to it.id }.values.forEach { overloads ->
            val group = overloads.first().group
            prefix = if (group.isBlank() || group == "root") "builder." else ""
            val statement = statementFor(overloads, unsupported) ?: return@forEach
            tree.add(overloads.first().group, statement)
        }
        tree.render(code)
        code.addStatement("return builder.style()")
        return code.build()
    }

    @Suppress("CyclomaticComplexMethod")
    private fun statementFor(overloads: List<ParamMeta>, unsupported: MutableSet<String>): CodeBlock? {
        val first = overloads.first()
        return when (first.type) {
            "dimension" -> typed(overloads, "dpValue")
            "typography" -> typed(overloads, "typographyValue")
            "shape" -> typed(overloads, "shapeValue")
            "float" -> primitive(overloads.selectOverload(), "floatValue")
            "boolean" -> primitive(overloads.selectOverload(), "booleanValue")
            "integer" -> primitive(overloads.selectOverload(), "intValue")
            "value" -> enumValue(overloads.selectOverload())
            "component_style" -> nestedStyle(overloads.selectOverload())
            "color" -> color(overloads)
            "icon", "shadow" -> {
                unsupported += first.id
                null
            }
            else -> null
        }
    }

    /** Префикс вызова: корневые методы вызываются на `builder.`, методы групп внутри блока группы без префикса. */
    private var prefix = ""

    private fun call(param: ParamMeta) = prefix + param.methodName

    private fun property(param: ParamMeta) = cb("properties[%S]", param.id)

    private fun typed(overloads: List<ParamMeta>, resolver: String): CodeBlock {
        val sel = overloads.selectOverload()
        val value = if (sel.isStateful) {
            cb("it.%M<%T>(states)", sdk("toStateful"), valueType(sel))
        } else {
            cb("it.base")
        }
        return cb("%L?.%M(theme)?.let { %L(%L) }", property(sel), sdk(resolver), call(sel), value)
    }

    private fun primitive(sel: ParamMeta, reader: String): CodeBlock =
        cb("%L?.%M()?.let { %L(it) }", property(sel), sdk(reader), call(sel))

    private fun enumValue(sel: ParamMeta): CodeBlock? {
        if (sel.values.isEmpty()) return null
        val enumClass = ClassName.bestGuess(sel.paramQualifiedType)
        val branches = CodeBlock.builder()
        sel.values.forEach { value ->
            branches.addNb("%S -> %T.%L; ", value.configName.lowercase(), enumClass, value.name)
        }
        return cb(
            "%L?.%M()?.let { name -> when (name.lowercase()) { %Lelse -> null } }?.let { %L(it) }",
            property(sel),
            sdk("stringValue"),
            branches.build(),
            call(sel),
        )
    }

    private fun nestedStyle(sel: ParamMeta): CodeBlock =
        cb(
            "%L?.%M<%T>(theme, context)?.let { %L(it) }",
            property(sel),
            sdk("nestedStyle"),
            ClassName.bestGuess(sel.paramQualifiedType),
            call(sel),
        )

    private fun color(overloads: List<ParamMeta>): CodeBlock {
        val solid = overloads.selectSolidColorOverload()
        val brush = overloads.selectBrushOverload()
        val solidCall = colorCall(solid)
        val gradientBranch = brush?.let { colorCall(it, gradient = true) }
        val body = CodeBlock.builder()
        body.addNb("%L?.let { v -> ", property(solid))
        if (gradientBranch != null) {
            body.addNb("if (v.%M(theme)) { %L } else { %L } }", sdk("hasGradient"), gradientBranch, solidCall)
        } else {
            body.addNb("if (!v.%M(theme)) { %L } }", sdk("hasGradient"), solidCall)
        }
        return body.build()
    }

    private fun colorCall(sel: ParamMeta, gradient: Boolean = false): CodeBlock {
        val method = call(sel)
        return when {
            sel.isStateful && sel.acceptsBrush ->
                cb("v.%M(theme)?.let { %L(it.%M<%T>(states)) }", sdk("brushValue"), method, sdk("toStateful"), BRUSH)
            sel.isStateful ->
                cb("v.%M(theme)?.let { %L(it.%M<%T>(states)) }", sdk("colorValue"), method, sdk("toStateful"), COLOR)
            sel.acceptsInteractiveColor ->
                cb("v.%M(theme)?.let { %L(it.%M(states)) }", sdk("colorValue"), method, sdk("toInteractiveColor"))
            sel.acceptsBrush || gradient ->
                cb("v.%M(theme)?.let { %L(it.base) }", sdk("brushValue"), method)
            else ->
                cb("v.%M(theme)?.let { %L(it.base) }", sdk("colorValue"), method)
        }
    }

    private fun valueType(sel: ParamMeta): ClassName =
        ClassName.bestGuess(sel.valueQualifiedType.ifBlank { sel.paramQualifiedType })
}

/** Дерево групп вызовов: `root` вызывается на билдере, остальные внутри блоков `group { ... }`. */
private class GroupTree {
    private val rootCalls = mutableListOf<CodeBlock>()
    private val groups = linkedMapOf<String, Node>()

    fun add(group: String, call: CodeBlock) {
        if (group.isBlank() || group == "root") {
            rootCalls += call
            return
        }
        val segments = group.split(".")
        groups.getOrPut(segments.first()) { Node() }.add(segments.drop(1), call)
    }

    fun render(code: CodeBlock.Builder) {
        rootCalls.forEach { call -> code.addStatement("%L", call) }
        groups.forEach { (name, node) ->
            code.beginControlFlow("builder.%L", name)
            node.render(code)
            code.endControlFlow()
        }
    }

    private class Node {
        val calls = mutableListOf<CodeBlock>()
        val children = linkedMapOf<String, Node>()

        fun add(rest: List<String>, call: CodeBlock) {
            if (rest.isEmpty()) calls += call else children.getOrPut(rest.first()) { Node() }.add(rest.drop(1), call)
        }

        fun render(code: CodeBlock.Builder) {
            calls.forEach { code.addStatement("%L", it) }
            children.forEach { (name, node) ->
                code.beginControlFlow("%L", name)
                node.render(code)
                code.endControlFlow()
            }
        }
    }
}

private val EXPECTED_VALUE_TYPES: Map<String, Set<String>> = mapOf(
    "dimension" to setOf("androidx.compose.ui.unit.Dp"),
    "typography" to setOf("androidx.compose.ui.text.TextStyle"),
    "shape" to setOf("androidx.compose.foundation.shape.CornerBasedShape", "androidx.compose.ui.graphics.Shape"),
)

/**
 * В мете встречаются свойства, чей `type` не соответствует принимаемому значению (например, `dimensions` у
 * `AvatarGroup`
 * принимает объект `AvatarGroupDimensions`). Такие перегрузки не относятся к виду свойства и пропускаются.
 */
private fun ParamMeta.isSupportedValueType(): Boolean {
    val expected = EXPECTED_VALUE_TYPES[type] ?: return true
    return valueQualifiedType.isBlank() || valueQualifiedType in expected
}
