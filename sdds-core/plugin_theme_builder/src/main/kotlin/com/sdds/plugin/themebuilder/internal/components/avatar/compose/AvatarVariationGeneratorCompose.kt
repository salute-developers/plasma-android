package com.sdds.plugin.themebuilder.internal.components.avatar.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.avatar.AvatarProperties
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.combine
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class AvatarVariationGeneratorCompose(
    private val badgeStylePackage: String,
    private val counterStylePackage: String,
    private val statusStylePackage: String,
    themeClassName: String,
    themePackage: String,
    dimensionsConfig: DimensionsConfig,
    dimensAggregator: DimensAggregator,
    resourceReferenceProvider: ResourceReferenceProvider,
    namespace: String,
    ktFileBuilderFactory: KtFileBuilderFactory,
    componentPackage: String,
    outputLocation: KtFileBuilder.OutputLocation,
    componentName: String,
) : ComposeVariationGenerator<AvatarProperties>(
    themeClassName = themeClassName,
    themePackage = themePackage,
    dimensionsConfig = dimensionsConfig,
    dimensAggregator = dimensAggregator,
    resourceReferenceProvider = resourceReferenceProvider,
    namespace = namespace,
    ktFileBuilderFactory = ktFileBuilderFactory,
    componentPackage = componentPackage,
    outputLocation = outputLocation,
    componentName = componentName,
) {

    override fun KtFileBuilder.onAddImports() {
        addImport("com.sdds.compose.uikit", listOf("AvatarStatus"))
    }

    override fun propsToBuilderCalls(
        props: AvatarProperties,
        ktFileBuilder: KtFileBuilder,
        variationNode: VariationNode<AvatarProperties>,
        variationId: String,
    ): List<String> = listOfNotNull(
        shapeCall(props, variationId),
        dimensionCall(props, variationId),
        colorsCall(props),
        textStyleCall(props),
        badgeStyleCall(props, ktFileBuilder),
        counterStyleCall(props, ktFileBuilder),
        statusStyleCall(variationNode.mergedProps, ktFileBuilder),
    )

    private fun shapeCall(props: AvatarProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun textStyleCall(props: AvatarProperties): String? {
        return props.textStyle?.let {
            getTypography("textStyle", it)
        }
    }

    private fun dimensionCall(props: AvatarProperties, variationId: String): String? {
        if (!props.hasDimensions()) return null
        return buildString {
            appendLine(".dimensions {")
            props.width?.let {
                appendDimension("width", it, variationId)
            }
            props.height?.let {
                appendDimension("height", it, variationId)
            }
            props.statusOffsetX?.let {
                appendDimension("statusOffsetX", it, variationId)
            }
            props.statusOffsetY?.let {
                appendDimension("statusOffsetY", it, variationId)
            }
            append("}")
        }
    }

    private fun colorsCall(props: AvatarProperties): String? {
        if (!props.hasColors()) return null
        return buildString {
            appendLine(".colors {")
            props.background?.let { appendLine(getColor("backgroundColor", it)) }
            props.textColor?.let { appendLine(getColor("textColor", it)) }
            append("}")
        }
    }

    private fun badgeStyleCall(
        props: AvatarProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.badgeStyle?.let {
            ".badgeStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    badgeStylePackage,
                )
            }.style())"
        }
    }

    private fun counterStyleCall(
        props: AvatarProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.counterStyle?.let {
            ".counterStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    counterStylePackage,
                )
            }.style())"
        }
    }

    private fun statusStyleCall(
        props: AvatarProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.statusStyle?.let { statusStyle ->
            val componentProps = statusColorsCall(props) ?: return null
            ".statusStyle(${
                statusStyle.value.getComponentStyle(
                    ktFileBuilder,
                    statusStylePackage,
                )
            }$componentProps.style())"
        }
    }

    private fun statusColorsCall(props: AvatarProperties): String? {
        if (props.activeStatusColor == null && props.inactiveStatusColor == null) return null
        val combined = props.inactiveStatusColor?.combine(props.activeStatusColor, "AvatarStatus.Active")
            ?: return null
        return buildString {
            appendLine(".modify {")
            appendLine("color {")
            appendLine(getColor("backgroundColor", combined))
            appendLine("}")
            appendLine("}")
        }
    }

    private fun AvatarProperties.hasDimensions(): Boolean {
        return width != null ||
            height != null ||
            statusOffsetX != null ||
            statusOffsetY != null
    }

    private fun AvatarProperties.hasColors(): Boolean {
        return background != null || textColor != null
    }
}
