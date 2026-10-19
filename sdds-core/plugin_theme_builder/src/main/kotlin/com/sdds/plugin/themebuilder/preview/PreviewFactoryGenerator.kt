package com.sdds.plugin.themebuilder.preview

import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeBooleanPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeColorPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeDimensionPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeFloatPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeIconPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeIntegerPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposePropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeShadowPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeShapePropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeTypographyPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeValuePropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.acceptsBrush
import com.sdds.plugin.themebuilder.internal.universal.compose.acceptsInteractiveColor
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
internal class PreviewFactoryGenerator(private val components: List<ComposeComponentMeta>) {

    /** Записывает по файлу на компонент и файл реестра в [outputDir]. */
    fun generate(outputDir: File) {
        components.forEach { component -> componentFile(component).writeTo(outputDir) }
        registryFile().writeTo(outputDir)
    }

    private fun factoryName(component: ComposeComponentMeta) = "${component.componentName}PreviewStyleFactory"

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

    private fun componentFile(component: ComposeComponentMeta): FileSpec {
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
            .addProperty(
                PropertySpec.builder("styleQualifiedName", String::class, KModifier.OVERRIDE)
                    .initializer("%S", component.styleQualifiedName).build(),
            )
            .addProperty(statesProperty)
            .addProperty(
                PropertySpec.builder(
                    "unsupportedProperties",
                    Set::class.asClassName().parameterizedBy(String::class.asTypeName()),
                    KModifier.OVERRIDE,
                ).initializer("setOf(%L)", unsupportedLiteral(component)).build(),
            )
            .addProperty(
                PropertySpec.builder(
                    "gradientUnsupportedProperties",
                    Set::class.asClassName().parameterizedBy(String::class.asTypeName()),
                    KModifier.OVERRIDE,
                ).initializer("setOf(%L)", gradientUnsupportedLiteral(component)).build(),
            )
            .addProperty(
                PropertySpec.builder(
                    "iconProperties",
                    Set::class.asClassName().parameterizedBy(String::class.asTypeName()),
                    KModifier.OVERRIDE,
                ).initializer("setOf(%L)", iconPropertiesLiteral(component)).build(),
            )
            .addProperty(
                PropertySpec.builder(
                    "nestedStyleTypes",
                    Map::class.asClassName().parameterizedBy(String::class.asTypeName(), String::class.asTypeName()),
                    KModifier.OVERRIDE,
                ).initializer("mapOf(%L)", nestedStyleTypesLiteral(component)).build(),
            )
            .addProperty(
                PropertySpec.builder(
                    "registry",
                    Map::class.asClassName().parameterizedBy(
                        String::class.asTypeName(),
                        GENERATED_FACTORY.parameterizedBy(com.squareup.kotlinpoet.STAR),
                    ),
                    KModifier.OVERRIDE,
                ).getter(
                    FunSpec.getterBuilder()
                        .addStatement("return %T.all", ClassName(GENERATED_PACKAGE, "GeneratedPreviewStyleFactories"))
                        .build(),
                ).build(),
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

    /** Цветовые свойства без перегрузки с `Brush`: градиент для них пропускается. */
    private fun gradientUnsupportedLiteral(component: ComposeComponentMeta): String =
        supportedParams(component).filterIsInstance<ComposeColorPropertyMeta>().groupBy { it.id }
            .filterValues { overloads -> overloads.selectBrushOverload() == null }
            .keys.sorted().joinToString(", ") { "\"$it\"" }

    /** Свойство-стиль и ожидаемый класс стиля: по ним SDK проверяет вложенные стили до отрисовки. */
    private fun nestedStyleTypesLiteral(component: ComposeComponentMeta): String =
        supportedParams(component).filter { it is ComposeComponentPropertyMeta }.groupBy { it.id }
            .toSortedMap()
            .map { (id, overloads) -> "\"$id\" to \"${overloads.selectPreviewOverload().paramQualifiedType}\"" }
            .joinToString(", ")

    private fun supportedParams(component: ComposeComponentMeta) =
        component.params.filter { it.deprecated == null && it.isSupportedValueType() }

    private fun unsupportedLiteral(component: ComposeComponentMeta): String =
        supportedParams(component).filter { it is ComposeShadowPropertyMeta }.map { it.id }.distinct()
            .joinToString(", ") { "\"$it\"" }

    /** Свойства-иконки: имя, которого нет в реестре плагина, даёт предупреждение `unknown_icon`. */
    private fun iconPropertiesLiteral(component: ComposeComponentMeta): String =
        supportedParams(component).filter { it is ComposeIconPropertyMeta }.map { it.id }.distinct().sorted()
            .joinToString(", ") { "\"$it\"" }

    private fun stateMapProperty(component: ComposeComponentMeta): PropertySpec {
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

    private fun buildBody(
        component: ComposeComponentMeta,
        styleClass: ClassName,
        unsupported: MutableSet<String>,
    ): CodeBlock {
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
    private fun statementFor(overloads: List<ComposePropertyMeta>, unsupported: MutableSet<String>): CodeBlock? {
        val first = overloads.first()
        return when (first) {
            is ComposeDimensionPropertyMeta -> typed(overloads, "dpValue")
            is ComposeTypographyPropertyMeta -> typed(overloads, "typographyValue")
            is ComposeShapePropertyMeta -> typed(overloads, "shapeValue")
            is ComposeFloatPropertyMeta -> primitive(overloads.selectPreviewOverload(), "floatValue")
            is ComposeBooleanPropertyMeta -> primitive(overloads.selectPreviewOverload(), "booleanValue")
            is ComposeIntegerPropertyMeta -> primitive(overloads.selectPreviewOverload(), "intValue")
            is ComposeValuePropertyMeta -> enumValue(overloads.selectPreviewOverload())
            is ComposeComponentPropertyMeta -> nestedStyle(overloads.selectPreviewOverload())
            is ComposeColorPropertyMeta -> color(overloads.filterIsInstance<ComposeColorPropertyMeta>())
            is ComposeIconPropertyMeta -> icon(overloads.selectPreviewOverload())
            is ComposeShadowPropertyMeta -> {
                unsupported += first.id
                null
            }
            else -> null
        }
    }

    /** Префикс вызова: корневые методы вызываются на `builder.`, методы групп внутри блока группы без префикса. */
    private var prefix = ""

    private fun call(param: ComposePropertyMeta) = prefix + param.methodName

    private fun property(param: ComposePropertyMeta) = cb("properties[%S]", param.id)

    private fun typed(overloads: List<ComposePropertyMeta>, resolver: String): CodeBlock {
        val sel = overloads.selectPreviewOverload()
        val value = if (sel.isStateful) {
            cb("it.%M<%T>(states)", sdk("toStateful"), valueType(sel))
        } else {
            cb("it.base")
        }
        return cb("%L?.%M(theme)?.let { %L(%L) }", property(sel), sdk(resolver), call(sel), value)
    }

    private fun primitive(sel: ComposePropertyMeta, reader: String): CodeBlock =
        cb("%L?.%M()?.let { %L(it) }", property(sel), sdk(reader), call(sel))

    private fun enumValue(sel: ComposePropertyMeta): CodeBlock? {
        val values = (sel as? ComposeValuePropertyMeta)?.values.orEmpty()
        if (values.isEmpty()) return null
        val enumClass = ClassName.bestGuess(sel.paramQualifiedType)
        val branches = CodeBlock.builder()
        values.forEach { value ->
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

    /** Иконка по имени из payload: `ImageSource` строит реестр плагина, неизвестное имя оставляет значение билдера. */
    private fun icon(sel: ComposePropertyMeta): CodeBlock =
        cb("%L?.%M(theme)?.let { %L(it) }", property(sel), sdk("iconValue"), call(sel))

    private fun nestedStyle(sel: ComposePropertyMeta): CodeBlock =
        cb(
            "%L?.%M<%T>(theme, context)?.let { %L(it) }",
            property(sel),
            sdk("nestedStyle"),
            ClassName.bestGuess(sel.paramQualifiedType),
            call(sel),
        )

    private fun color(overloads: List<ComposeColorPropertyMeta>): CodeBlock {
        val solid = overloads.selectSolidColorOverload()
        val brush = overloads.selectBrushOverload()
        val solidCall = colorCall(solid)
        val gradientBranch = brush?.let { colorCall(it, gradient = true) }
        val body = CodeBlock.builder()
        // Если для градиента и для сплошного цвета выбрана одна и та же перегрузка, ветвление не нужно.
        if (gradientBranch != null && gradientBranch.toString() == solidCall.toString()) {
            body.addNb("%L?.let { v -> %L }", property(solid), solidCall)
            return body.build()
        }
        body.addNb("%L?.let { v -> ", property(solid))
        if (gradientBranch != null) {
            body.addNb("if (v.%M(theme)) { %L } else { %L } }", sdk("hasGradient"), gradientBranch, solidCall)
        } else {
            body.addNb("if (!v.%M(theme)) { %L } }", sdk("hasGradient"), solidCall)
        }
        return body.build()
    }

    private fun colorCall(sel: ComposeColorPropertyMeta, gradient: Boolean = false): CodeBlock {
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

    private fun valueType(sel: ComposePropertyMeta): ClassName =
        ClassName.bestGuess(sel.previewValueType.ifBlank { sel.paramQualifiedType })
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

private val EXPECTED_VALUE_TYPES: Map<Class<out ComposePropertyMeta>, Set<String>> = mapOf(
    ComposeDimensionPropertyMeta::class.java to setOf("androidx.compose.ui.unit.Dp"),
    ComposeTypographyPropertyMeta::class.java to setOf("androidx.compose.ui.text.TextStyle"),
    ComposeShapePropertyMeta::class.java to
        setOf("androidx.compose.foundation.shape.CornerBasedShape", "androidx.compose.ui.graphics.Shape"),
)

/**
 * В мете встречаются свойства, чей вид не соответствует принимаемому значению (например, `dimensions` у
 * `AvatarGroup` принимает объект `AvatarGroupDimensions`). Такие перегрузки не относятся к виду свойства
 * и пропускаются.
 */
internal fun ComposePropertyMeta.isSupportedValueType(): Boolean {
    val expected = EXPECTED_VALUE_TYPES[javaClass] ?: return true
    return previewValueType.isBlank() || previewValueType in expected
}
