package com.sdds.plugin.themebuilder.internal.components.tooltip.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.tooltip.TooltipProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class TooltipComposeVariationGenerator(
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
) : ComposeVariationGenerator<TooltipProperties>(
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
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
    }

    override fun propsToBuilderCalls(
        props: TooltipProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        textStyleCall(props),
        shadowCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun textStyleCall(props: TooltipProperties): String? {
        return props.textStyle?.let {
            getTypography("textStyle", it)
        }
    }

    private fun shapeCall(props: TooltipProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun shadowCall(props: TooltipProperties): String? {
        return props.shadow?.let {
            getShadow(it)
        }
    }

    private fun colorsCall(props: TooltipProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("backgroundColor", it))
                }
                props.textColor?.let {
                    appendLine(getGradientOrWrappedColor("textColor", it))
                }
                props.contentStartColor?.let {
                    appendLine(getColor("contentStartColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: TooltipProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.contentStartSize?.let {
                    appendDimension("content_start_size", it, variationId)
                }
                props.contentStartPadding?.let {
                    appendDimension("content_start_padding", it, variationId)
                }
                props.paddingStart?.let {
                    appendDimension("padding_start", it, variationId)
                }
                props.paddingEnd?.let {
                    appendDimension("padding_end", it, variationId)
                }
                props.paddingTop?.let {
                    appendDimension("padding_top", it, variationId)
                }
                props.paddingBottom?.let {
                    appendDimension("padding_bottom", it, variationId)
                }
                props.offset?.let {
                    appendDimension("offset", it, variationId)
                }
                props.tailWidth?.let {
                    appendDimension("tail_width", it, variationId)
                }
                props.tailHeight?.let {
                    appendDimension("tail_height", it, variationId)
                }
                props.tailPadding?.let {
                    appendDimension("tail_padding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun TooltipProperties.hasDimensions(): Boolean {
        return contentStartSize != null ||
            contentStartPadding != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            offset != null ||
            tailHeight != null ||
            tailWidth != null ||
            tailPadding != null
    }

    private fun TooltipProperties.hasColors() = backgroundColor != null ||
        contentStartColor != null ||
        textColor != null
}
