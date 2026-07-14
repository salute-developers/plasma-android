package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.VariationProp
import com.sdds.plugin.themebuilder.internal.components.base.BindingType
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.Gradient
import com.sdds.plugin.themebuilder.internal.components.base.Shadow
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Value
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName

internal class UniversalComposeVariationGenerator(
    private val componentMeta: ComponentMeta,
    private val mapperRegistry: PropertyMapperRegistry,
    private val themeClassName: String,
    private val themePackage: String,
    private val dimensionsConfig: DimensionsConfig,
    private val namespace: String,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val componentPackage: String,
    private val outputLocation: KtFileBuilder.OutputLocation,
    componentName: String,
    styleBuilderName: String? = null,
    private val styleBuilderFactoryFunName: String = "builder",
    private val componentStylePackage: String = "com.sdds.compose.uikit",
    private val multiplatform: Boolean = false,
) : ComponentStyleGenerator<UniversalComponentConfig> {

    private val camelComponentName: String = componentName.toCamelCase()
    private val ktFileName: String = "${camelComponentName}Styles"
    private val baseWrapperInterfaceName = "Wrapper$camelComponentName"
    private val rFile by unsafeLazy { ClassName(namespace, "R") }

    private val ktFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(
            fileName = ktFileName,
            fullPackageName = componentPackage,
        ).also {
            it.addSuppressAnnotation(
                "UndocumentedPublicClass",
                "UndocumentedPublicProperty",
                "ktlint:standard:max-line-length",
            )
        }
    }

    private val styleBuilderType: ClassName =
        ClassName(componentStylePackage, styleBuilderName ?: "${camelComponentName}StyleBuilder")

    private val styleType: ClassName = run {
        val styleQualifiedName = componentMeta.styleQualifiedName
            .ifBlank { componentMeta.qualifiedName.removeSuffix("Builder") }
        val pkg = styleQualifiedName.substringBeforeLast(".")
        val simpleName = styleQualifiedName.substringAfterLast(".")
        ClassName(pkg, simpleName)
    }

    private val paramOverloads: List<List<PropertyMeta>> by unsafeLazy {
        val grouped = linkedMapOf<String, MutableList<PropertyMeta>>()
        componentMeta.params.forEach { meta ->
            grouped.getOrPut(meta.id) { mutableListOf() }.add(meta)
        }
        grouped.values.toList()
    }

    override fun generate(config: UniversalComponentConfig): ComponentStyleGenerator.Result {
        val configuredViewBinding = config.bindings.firstOrNull { it.type == BindingType.VIEW }
        val viewPropName = configuredViewBinding?.name ?: "view"
        val componentProps = config.bindings.map { binding ->
            VariationProp(
                name = binding.name,
                values = binding.values,
                defaultValue = binding.defaultValue,
            )
        }

        val importCollector = ImportCollector()
        val mappers = mapperRegistry.createMappers(importCollector)

        with(ktFileBuilder) {
            addCommonImports()
            componentMeta.stateEnum?.let { stateEnum ->
                val pkg = stateEnum.qualifiedName.substringBeforeLast(".")
                addImport(pkg, listOf(stateEnum.simpleName))
            }
        }

        val processor = VariationTreeProcessor(
            camelComponentName = camelComponentName,
            componentStyleName = styleType.simpleName,
            styleBuilderType = styleBuilderType,
            styleType = styleType,
            baseWrapperInterfaceName = baseWrapperInterfaceName,
            styleBuilderFactoryFunName = styleBuilderFactoryFunName,
            ktFileBuilder = ktFileBuilder,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = componentPackage,
            outputLocation = outputLocation,
        )

        val result = processor.process(
            config = config,
            componentProps = componentProps,
            viewPropName = viewPropName,
            configuredViewBinding = configuredViewBinding,
            builderCallsProvider = { props, variationId ->
                (props as? UniversalPropertyOwner)
                    ?.let { propsToBuilderCalls(it, variationId, mappers) }
                    .orEmpty()
            },
        )

        importCollector.importList.forEach { import ->
            ktFileBuilder.addImport(import.pck, listOf(import.name))
        }
        ktFileBuilder.build(outputLocation)

        return ComponentStyleGenerator.Result.Compose(
            styleName = camelComponentName,
            variations = result.variations,
            componentPackage = componentPackage,
            styleClassName = styleType,
            styleBuilderClassName = styleBuilderType,
            props = result.componentProps,
            variationProps = result.variationProps,
        )
    }

    @Suppress("UNCHECKED_CAST", "CyclomaticComplexMethod")
    private fun propsToBuilderCalls(
        props: UniversalPropertyOwner,
        variationId: String,
        mappers: PropertyMapperRegistry.Mappers,
    ): List<String> {
        val tree = PropGroupTree()

        paramOverloads.forEach { overloads ->
            val fallbackMeta = overloads.maxByOrNull { it.overloadPriority() } ?: return@forEach
            val value: Stateful<*, *> = props.getValue(fallbackMeta) ?: return@forEach
            val meta = overloads.selectOverload(value)
            val call: String = when (meta) {
                is ColorPropertyMeta -> mappers.colorMapper.map(meta, value as Color, variationId)
                is DimensionPropertyMeta -> mappers.dimensionMapper.map(meta, value as Dimension, variationId)
                is TypographyPropertyMeta -> mappers.typographyMapper.map(meta, value as Typography, variationId)
                is ShapePropertyMeta -> mappers.shapeMapper.map(meta, value as Shape, variationId)
                is ShadowPropertyMeta -> mappers.shadowMapper.map(meta, value as Shadow, variationId)
                is BooleanPropertyMeta -> mappers.booleanMapper.map(meta, value as Value, variationId)
                is IntegerPropertyMeta -> mappers.integerMapper.map(meta, value as Value, variationId)
                is FloatPropertyMeta -> mappers.floatMapper.map(meta, value as FloatValue, variationId)
                is IconPropertyMeta -> mappers.iconMapper.map(meta, value as Value, variationId)
                is ComponentPropertyMeta ->
                    mappers.componentStyleMapper.map(meta, value as ComponentStyle<*>, variationId)
                is ValuePropertyMeta -> mappers.valueMapper.map(meta, value as Value, variationId)
                is UnknownPropertyMeta -> return@forEach
            }
            if (call.isNotBlank()) tree.add(meta.group, call)
        }

        return tree.render()
    }

    private fun KtFileBuilder.addCommonImports() {
        addImport(packageName = themePackage, names = listOf(themeClassName))
        addImport(packageName = themePackage, names = listOf("singleColor"))
        addImport(
            packageName = "com.sdds.compose.uikit",
            names = listOfNotNull(
                "adjustBy",
                "multiplyAlpha",
                if (styleBuilderFactoryFunName != "builder") styleBuilderFactoryFunName else null,
            ),
        )
        addImport(packageName = "com.sdds.compose.uikit.style", names = listOf("wrap", "style", "modify"))
        addImport(packageName = "androidx.compose.runtime", names = listOf("Composable"))
        addImport(packageName = "androidx.compose.ui.unit", names = listOf("dp"))
        // painterResource в стиль не эмитится (стиль хранит источник, painter резолвят компоненты).
        // В Android-режиме импорт сохраняется для обратной совместимости golden-вывода;
        // в CMP-режиме он не нужен и был бы Android-only (androidx.compose.ui.res).
        if (!multiplatform) {
            addImport(packageName = "androidx.compose.ui.res", names = listOf("painterResource"))
        }
        addImport(packageName = "com.sdds.compose.uikit.graphics", names = listOf("asLayered"))
        addImport(packageName = "androidx.compose.ui.graphics", names = listOf("SolidColor", "Brush"))
        addImport(
            packageName = "com.sdds.compose.uikit.interactions",
            names = listOf("InteractiveState", "asInteractive", "asStatefulValue"),
        )
        // Ветка fromResources опирается на dimensionResource/R (Android-only) — в CMP не выполняется.
        if (dimensionsConfig.fromResources && !multiplatform) {
            addImport(KtFileBuilder.TypeLocalDensity)
            addImport(KtFileBuilder.TypeDimensionResource)
            addImport(rFile)
        }
    }

    private fun String.toCamelCase(): String {
        val segments = split(".", "-", "_")
        val result = StringBuilder()
        for (i in segments.indices) {
            val seg = segments[i]
            val prev = segments.getOrNull(i - 1)
            if (seg.all { it.isDigit() } && prev != null && prev.all { it.isDigit() }) {
                result.append("x")
                result.append(seg)
            } else {
                result.append(seg.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() })
            }
        }
        return result.toString()
    }
}

private const val GROUP_ROOT = "root"

internal fun PropertyMeta.overloadPriority(): Int = when {
    "StatefulValue" in paramQualifiedType -> 2
    "InteractiveColor" in paramQualifiedType -> 1
    else -> 0
}

internal fun List<PropertyMeta>.selectOverload(value: Stateful<*, *>): PropertyMeta {
    val colorOverloads = filterIsInstance<ColorPropertyMeta>()
    if (value is Color && colorOverloads.isNotEmpty()) {
        val compatible = if (value.requiresBrush) {
            colorOverloads.filter { it.acceptsBrush }
        } else {
            colorOverloads
        }
        val selected = (compatible.ifEmpty { colorOverloads })
            .maxByOrNull { it.colorOverloadPriority() }
            ?: colorOverloads.first()
        return selected.copy(
            hasInteractiveColorOverload = colorOverloads.any {
                it.acceptsInteractiveColor && it.methodName == selected.methodName
            },
            hasBrushOverload = colorOverloads.any { it.acceptsBrush },
        )
    }
    return maxByOrNull { it.overloadPriority() } ?: first()
}

private val Color.requiresBrush: Boolean
    get() = this is Gradient ||
        states.orEmpty().any { it.type == "gradient" }

private fun ColorPropertyMeta.colorOverloadPriority(): Int = when {
    "StatefulValue" in paramQualifiedType -> 3
    acceptsInteractiveColor -> 2
    acceptsColor -> 1
    acceptsBrush -> 0
    else -> -1
}

private val ColorPropertyMeta.acceptsBrush: Boolean
    get() = valueQualifiedType == BRUSH_TYPE ||
        (valueQualifiedType.isBlank() && "Brush" in paramQualifiedType)

private val ColorPropertyMeta.acceptsInteractiveColor: Boolean
    get() = valueQualifiedType == INTERACTIVE_COLOR_TYPE ||
        (valueQualifiedType.isBlank() && "InteractiveColor" in paramQualifiedType)

private val ColorPropertyMeta.acceptsColor: Boolean
    get() = valueQualifiedType == COLOR_TYPE ||
        (valueQualifiedType.isBlank() && paramQualifiedType == COLOR_TYPE)

private const val BRUSH_TYPE = "androidx.compose.ui.graphics.Brush"
private const val COLOR_TYPE = "androidx.compose.ui.graphics.Color"
private const val INTERACTIVE_COLOR_TYPE = "com.sdds.compose.uikit.interactions.InteractiveColor"

internal class PropGroupTree {
    private val rootCalls = mutableListOf<String>()
    private val topGroups = linkedMapOf<String, PropGroupNode>()

    fun add(group: String, call: String) {
        if (group.isBlank() || group == GROUP_ROOT) {
            rootCalls.add(call)
            return
        }
        val segments = group.split(".")
        val node = topGroups.getOrPut(segments[0]) { PropGroupNode() }
        node.add(segments.drop(1), call)
    }

    fun render(): List<String> = buildList {
        rootCalls.forEach { add(".$it") }
        topGroups.forEach { (name, node) -> add(node.renderAsTopBlock(name)) }
    }
}

internal class PropGroupNode {
    private val calls = mutableListOf<String>()
    private val children = linkedMapOf<String, PropGroupNode>()

    fun add(remainingSegments: List<String>, call: String) {
        if (remainingSegments.isEmpty()) {
            calls.add(call)
        } else {
            children.getOrPut(remainingSegments[0]) { PropGroupNode() }
                .add(remainingSegments.drop(1), call)
        }
    }

    fun renderAsTopBlock(name: String): String = buildString {
        appendLine(".$name {")
        renderContent()
        append("}")
    }

    private fun renderAsNestedBlock(name: String): String = buildString {
        appendLine("$name {")
        renderContent()
        append("}")
    }

    private fun StringBuilder.renderContent() {
        calls.forEach { appendLine(it) }
        children.forEach { (name, child) -> appendLine(child.renderAsNestedBlock(name)) }
    }
}
