package com.sdds.plugin.themebuilder.internal.components.segment

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class SegmentComposeVariationGenerator(
    private val segmentItemStylesPackage: String,
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
) : ComposeVariationGenerator<SegmentProperties>(
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
        props: SegmentProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            colorsCall(props),
            dimensionsCall(props, variationId),
            segmentItemStyleCall(props, ktFileBuilder),
        )
    }

    private fun shapeCall(props: SegmentProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun segmentItemStyleCall(
        props: SegmentProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.segmentItemStyle?.let {
            ".segmentItemStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    segmentItemStylesPackage,
                )
            }.style())"
        }
    }

    private fun colorsCall(props: SegmentProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: SegmentProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
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
                append("}")
            }
        } else {
            null
        }
    }

    private fun SegmentProperties.hasColors(): Boolean {
        return backgroundColor != null
    }

    private fun SegmentProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null
    }
}
