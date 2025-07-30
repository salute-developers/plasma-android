package com.sdds.plugin.themebuilder.internal.components.scrollbar.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.scrollbar.ScrollBarProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class ScrollBarComposeVariationGenerator(
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
) : ComposeVariationGenerator<ScrollBarProperties>(
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

    override fun propsToBuilderCalls(
        props: ScrollBarProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        hoverExpandCall(props),
        shapeCall(props, variationId),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun hoverExpandCall(props: ScrollBarProperties): String? {
        return props.hoverExpandFactor?.let {
            ".hoverExpandFactor(${it.value}f)"
        }
    }

    private fun shapeCall(props: ScrollBarProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun colorsCall(props: ScrollBarProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.thumbColor?.let {
                    appendLine(getColor("thumbColor", it))
                }
                props.trackColor?.let {
                    appendLine(getColor("trackColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: ScrollBarProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.width?.let {
                    appendDimension("width", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ScrollBarProperties.hasDimensions(): Boolean {
        return width != null
    }

    private fun ScrollBarProperties.hasColors(): Boolean {
        return thumbColor != null || trackColor != null
    }
}
