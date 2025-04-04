package com.sdds.plugin.themebuilder.internal.components.chip.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.chip.ChipProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class ChipComposeVariationGenerator(
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
) : ComposeVariationGenerator<ChipProperties>(
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
    styleBuilderName = "ChipStyleBuilder",
) {

    override val componentStyleName = "ChipStyle"

    override fun propsToBuilderCalls(
        props: ChipProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        labelStyleCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        disableAlphaCall(props),
    )

    private fun shapeCall(props: ChipProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun labelStyleCall(props: ChipProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun disableAlphaCall(props: ChipProperties): String? {
        return props.disableAlpha?.let {
            ".disableAlpha(${it.value}f)"
        }
    }

    private fun colorsCall(props: ChipProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.contentStartColor?.let {
                    appendLine(getColor("contentStartColor", it))
                }
                props.contentEndColor?.let {
                    appendLine(getColor("contentEndColor", it))
                }
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: ChipProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.height?.let {
                    appendDimension("height", it, variationId)
                }
                props.paddingStart?.let {
                    appendDimension("padding_start", it, variationId)
                }
                props.paddingEnd?.let {
                    appendDimension("padding_end", it, variationId)
                }
                props.contentStartPadding?.let {
                    appendDimension("content_start_padding", it, variationId)
                }
                props.contentEndPadding?.let {
                    appendDimension("content_end_padding", it, variationId)
                }
                props.contentStartSize?.let {
                    appendDimension("content_start_size", it, variationId)
                }
                props.contentEndSize?.let {
                    appendDimension("content_end_size", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ChipProperties.hasDimensions(): Boolean {
        return height != null ||
            paddingStart != null ||
            paddingEnd != null ||
            contentStartPadding != null ||
            contentStartSize != null ||
            contentEndPadding != null ||
            contentEndSize != null
    }

    private fun ChipProperties.hasColors(): Boolean {
        return backgroundColor != null ||
            contentStartColor != null ||
            contentEndColor != null ||
            labelColor != null
    }
}
