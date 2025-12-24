package com.sdds.plugin.themebuilder.internal.components.slider.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.slider.SliderProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class SliderComposeVariationGenerator(
    private val tooltipStylesPackage: String,
    themeClassName: String,
    private val themePackage: String,
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

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
        addImport(getInternalClassType("singleColor", themePackage))
        addImport(
            "com.sdds.compose.uikit",
            listOf(
                "SliderOrientation",
                "TitleAlignment",
                "LabelAlignment",
                "SliderAlignment",
                "LimitLabelAlignment",
                "SlideDirection",
                "ValuePlacement",
            ),
        )
    }

    override val componentStyleName: String = "SliderStyle"

    override fun propsToBuilderCalls(
        props: SliderProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        tooltipStyleCall(props, ktFileBuilder),
        titleStyleCall(props),
        limitLabelStyleCall(props),
        orientationCall(props),
        titleAlignmentCall(props),
        labelAlignmentCall(props),
        alignmentCall(props),
        limitLabelAlignmentCall(props),
        slideDirectionCall(props),
        valuePlacementCall(props),
        shapeCall(props, variationId),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun tooltipStyleCall(props: SliderProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.tooltipStyle?.let {
            ".tooltipStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    tooltipStylesPackage,
                )
            }.style())"
        }
    }

    private fun titleStyleCall(props: SliderProperties): String? {
        return props.titleStyle?.let {
            getTypography("titleStyle", it)
        }
    }

    private fun limitLabelStyleCall(props: SliderProperties): String? {
        return props.limitLabelStyle?.let {
            getTypography("limitLabelStyle", it)
        }
    }

    private fun orientationCall(props: SliderProperties): String? {
        return props.orientation?.let {
            val enumValue = when {
                it.value.equals("vertical", ignoreCase = true) -> "Vertical"
                else -> "Horizontal"
            }
            ".orientation(SliderOrientation.$enumValue)"
        }
    }

    private fun titleAlignmentCall(props: SliderProperties): String? {
        return props.textAlignment?.let {
            val enumValue = when {
                it.value.equals("none", ignoreCase = true) -> "None"
                it.value.equals("start", ignoreCase = true) -> "Start"
                else -> "End"
            }
            ".titleAlignment(TitleAlignment.$enumValue)"
        }
    }

    private fun labelAlignmentCall(props: SliderProperties): String? {
        return props.labelAlignment?.let {
            val enumValue = when {
                it.value.equals("top", ignoreCase = true) -> "Top"
                it.value.equals("center", ignoreCase = true) -> "Center"
                else -> "Bottom"
            }
            ".labelAlignment(LabelAlignment.$enumValue)"
        }
    }

    private fun alignmentCall(props: SliderProperties): String? {
        return props.alignment?.let {
            val enumValue = when {
                it.value.equals("start", ignoreCase = true) -> "Start"
                it.value.equals("center", ignoreCase = true) -> "Center"
                else -> "End"
            }
            ".alignment(SliderAlignment.$enumValue)"
        }
    }

    private fun limitLabelAlignmentCall(props: SliderProperties): String? {
        return props.limitLabelAlignment?.let {
            val enumValue = when {
                it.value.equals("start", ignoreCase = true) -> "Start"
                it.value.equals("center", ignoreCase = true) -> "Center"
                else -> "End"
            }
            ".limitLabelAlignment(LimitLabelAlignment.$enumValue)"
        }
    }

    private fun slideDirectionCall(props: SliderProperties): String? {
        return props.slideDirection?.let {
            val enumValue = when {
                it.value.equals("reversed", ignoreCase = true) -> "Reversed"
                else -> "Normal"
            }
            ".slideDirection(SlideDirection.$enumValue)"
        }
    }

    private fun valuePlacementCall(props: SliderProperties): String? {
        return props.valuePlacement?.let {
            val enumValue = when {
                it.value.equals("start", ignoreCase = true) -> "Start"
                it.value.equals("top", ignoreCase = true) -> "Top"
                it.value.equals("bottom", ignoreCase = true) -> "Bottom"
                else -> "End"
            }
            ".valuePlacement(ValuePlacement.$enumValue)"
        }
    }

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
                props.thumbStrokeColor?.let {
                    appendLine(getGradientOrWrappedColor("thumbStrokeColor", it))
                }
                props.iconColor?.let {
                    appendLine(getColor("iconColor", it))
                }
                props.titleColor?.let {
                    appendLine(getColor("titleColor", it))
                }
                props.limitLabelColor?.let {
                    appendLine(getColor("limitLabelColor", it))
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
                props.iconSize?.let {
                    appendDimension("icon_size", it, variationId)
                }
                props.labelMargin?.let {
                    appendDimension("label_margin", it, variationId)
                }
                props.limitLabelMargin?.let {
                    appendDimension("limit_label_margin", it, variationId)
                }
                props.titleMargin?.let {
                    appendDimension("title_margin", it, variationId)
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
            thumbStrokeWidth != null ||
            iconSize != null ||
            labelMargin != null ||
            limitLabelMargin != null ||
            titleMargin != null
    }

    private fun SliderProperties.hasColors(): Boolean {
        return thumbColor != null ||
            trackColor != null ||
            indicatorColor != null ||
            thumbStrokeColor != null ||
            iconColor != null ||
            titleColor != null ||
            limitLabelColor != null
    }

    private fun SliderProperties.hasShape(): Boolean {
        return trackShape != null ||
            indicatorShape != null ||
            thumbShape != null
    }
}
