package com.sdds.plugin.themebuilder.internal.components.aiheader.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.aiheader.AiHeaderProperties
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class AiHeaderComposeVariationGenerator(
    private val iconButtonStylesPackage: String,
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
    styleBuilderName: String,
    componentStylePackage: String,
) : ComposeVariationGenerator<AiHeaderProperties>(
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
    styleBuilderName = styleBuilderName,
    componentStylePackage = componentStylePackage,
) {

    override val componentStyleName: String = "AiHeaderStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
    }

    override fun propsToBuilderCalls(
        props: AiHeaderProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        titleStyleCall(props),
        subtitleStyleCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        startButtonStyleCall(props, ktFileBuilder),
        endButtonStyleCall(props, ktFileBuilder),
    )

    private fun shapeCall(props: AiHeaderProperties, variationId: String): String? {
        return props.shape?.let { getShape(it, variationId) }
    }

    private fun titleStyleCall(props: AiHeaderProperties): String? {
        return props.titleStyle?.let { getTypography("titleStyle", it) }
    }

    private fun subtitleStyleCall(props: AiHeaderProperties): String? {
        return props.subtitleStyle?.let { getTypography("subtitleStyle", it) }
    }

    private fun startButtonStyleCall(
        props: AiHeaderProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.startButtonStyle?.let {
            ".startButtonStyle(${
                it.value.getComponentStyle(ktFileBuilder, iconButtonStylesPackage)
            }.style())"
        }
    }

    private fun endButtonStyleCall(
        props: AiHeaderProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.endButtonStyle?.let {
            ".endButtonStyle(${
                it.value.getComponentStyle(ktFileBuilder, iconButtonStylesPackage)
            }.style())"
        }
    }

    private fun colorsCall(props: AiHeaderProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("backgroundColor", it))
                }
                props.titleColor?.let {
                    appendLine(getGradientOrWrappedColor("titleColor", it))
                }
                props.subtitleColor?.let {
                    appendLine(getGradientOrWrappedColor("subtitleColor", it))
                }
                props.dividerColor?.let {
                    appendLine(getGradientOrWrappedColor("dividerColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(props: AiHeaderProperties, variationId: String): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.paddingStart?.let { appendDimension("padding_start", it, variationId) }
                props.paddingEnd?.let { appendDimension("padding_end", it, variationId) }
                props.paddingTop?.let { appendDimension("padding_top", it, variationId) }
                props.paddingBottom?.let { appendDimension("padding_bottom", it, variationId) }
                props.textPaddingStart?.let { appendDimension("text_padding_start", it, variationId) }
                props.textPaddingEnd?.let { appendDimension("text_padding_end", it, variationId) }
                props.textPaddingTop?.let { appendDimension("text_padding_top", it, variationId) }
                props.textPaddingBottom?.let { appendDimension("text_padding_bottom", it, variationId) }
                props.subtitlePadding?.let { appendDimension("subtitle_padding", it, variationId) }
                props.dividerThickness?.let { appendDimension("divider_thickness", it, variationId) }
                append("}")
            }
        } else {
            null
        }
    }

    private fun AiHeaderProperties.hasColors(): Boolean =
        backgroundColor != null ||
            titleColor != null ||
            subtitleColor != null ||
            dividerColor != null

    private fun AiHeaderProperties.hasDimensions(): Boolean =
        paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            textPaddingStart != null ||
            textPaddingEnd != null ||
            textPaddingTop != null ||
            textPaddingBottom != null ||
            subtitlePadding != null ||
            dividerThickness != null
}
