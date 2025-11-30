package com.sdds.plugin.themebuilder.internal.components.slider.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.slider.SliderProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class SliderComposeVariationGenerator(
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
) : ComposeVariationGenerator<SliderProperties>(
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
) {

    override val componentStyleName: String = "SliderStyle"

    override fun propsToBuilderCalls(
        props: SliderProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun shapeCall(props: SliderProperties, variationId: String): String? {
        return if (props.hasShape()) {
            buildString {
                props.trackShape?.let {
                    appendLine(getShape(it, variationId))
                }
                props.indicatorShape?.let {
                    appendLine(getShape(it, variationId, "indicatorShape"))
                }
                props.thumbShape?.let {
                    appendLine(getShape(it, variationId, "thumbShape"))
                }
            }
        } else {
            null
        }
    }

    private fun colorsCall(props: SliderProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.thumbColor?.let {
                    appendLine(getColor("thumbColor", it))
                }
                props.trackColor?.let {
                    appendLine(getColor("trackColor", it))
                }
                props.indicatorColor?.let {
                    appendLine(getColor("indicatorColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: SliderProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.trackThickness?.let {
                    appendDimension("track_thickness", it, variationId)
                }
                props.indicatorThickness?.let {
                    appendDimension("indicator_thickness", it, variationId)
                }
                props.thumbSize?.let {
                    appendDimension("thumb_size", it, variationId)
                }
                props.thumbStrokeWidth?.let {
                    appendDimension("thumb_stroke_width", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun SliderProperties.hasDimensions(): Boolean {
        return trackThickness != null ||
                indicatorThickness != null ||
                thumbSize != null ||
                thumbStrokeWidth != null
    }

    private fun SliderProperties.hasColors(): Boolean {
        return thumbColor != null ||
                trackColor != null ||
                indicatorColor != null
    }

    private fun SliderProperties.hasShape(): Boolean {
        return trackShape != null ||
                indicatorShape != null ||
                thumbShape != null
    }
}

