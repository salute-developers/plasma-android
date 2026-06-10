package com.sdds.plugin.themebuilder.internal.components.dropzone

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class DropZoneComposeVariationGenerator(
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
    private val overlayStylesPackage: String,
) : ComposeVariationGenerator<DropZoneProperties>(
    themeClassName = themeClassName,
    themePackage = themePackage,
    dimensionsConfig = dimensionsConfig,
    dimensAggregator = dimensAggregator,
    resourceReferenceProvider = resourceReferenceProvider,
    namespace = namespace,
    styleBuilderName = styleBuilderName,
    ktFileBuilderFactory = ktFileBuilderFactory,
    componentPackage = componentPackage,
    outputLocation = outputLocation,
    componentName = componentName,
) {

    override val componentStyleName: String = "DropZoneStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
        addImport(
            "com.sdds.compose.uikit",
            listOf(
                "DropZoneIconPlacement",
                "DropZoneBorderType",
                "DropZoneState",
            ),
        )
    }

    override fun propsToBuilderCalls(
        props: DropZoneProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        borderTypeCall(props),
        iconPlacementCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        disableAlphaCall(props),
        overlayStyleCall(props, ktFileBuilder),
        titleStyleCall(props),
        descriptionStyleCall(props),
    )

    override fun getCustomState(state: String): String {
        return when (state) {
            "dragging-over" -> "DropZoneState.DraggingOver"
            else -> throw IllegalStateException("Unknown state $state for DropZone")
        }
    }

    private fun disableAlphaCall(props: DropZoneProperties): String? {
        return props.disableAlpha?.let {
            ".disableAlpha(${it.value}f)"
        }
    }

    private fun overlayStyleCall(
        props: DropZoneProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.overlayStyle?.let {
            ".overlayStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    overlayStylesPackage,
                )
            }.style())"
        }
    }

    private fun borderTypeCall(props: DropZoneProperties): String? {
        return props.borderType?.let {
            val enumValue = when {
                it.value.equals("dashes", ignoreCase = true) -> "Dashes"
                else -> "None"
            }
            ".borderType(DropZoneBorderType.$enumValue)"
        }
    }

    private fun iconPlacementCall(props: DropZoneProperties): String? {
        return props.iconPlacement?.let {
            val enumValue = when {
                it.value.equals("top", ignoreCase = true) -> "Top"
                it.value.equals("start", ignoreCase = true) -> "Start"
                else -> "None"
            }
            ".iconPlacement(DropZoneIconPlacement.$enumValue)"
        }
    }

    private fun shapeCall(props: DropZoneProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun colorsCall(props: DropZoneProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("background", it))
                }
                props.iconColor?.let {
                    appendLine(getColor("iconColor", it))
                }
                props.titleColor?.let {
                    appendLine(getColor("titleColor", it))
                }
                props.descriptionColor?.let {
                    appendLine(getColor("descriptionColor", it))
                }
                props.borderColor?.let {
                    appendLine(getColor("borderColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun titleStyleCall(props: DropZoneProperties): String? {
        return props.titleStyle?.let {
            getTypography("titleStyle", it)
        }
    }

    private fun descriptionStyleCall(props: DropZoneProperties): String? {
        return props.descriptionStyle?.let {
            getTypography("descriptionStyle", it)
        }
    }

    private fun dimensionsCall(
        props: DropZoneProperties,
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
                props.iconSize?.let {
                    appendDimension("icon_size", it, variationId)
                }
                props.borderThickness?.let {
                    appendDimension("border_thickness", it, variationId)
                }
                props.borderDashGap?.let {
                    appendDimension("border_dash_width", it, variationId)
                }
                props.borderDashWidth?.let {
                    appendDimension("border_dash_gap", it, variationId)
                }
                props.iconPadding?.let {
                    appendDimension("icon_padding", it, variationId)
                }
                props.gap?.let {
                    appendDimension("gap", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun DropZoneProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            iconSize != null ||
            borderThickness != null ||
            borderDashGap != null ||
            borderDashWidth != null ||
            iconPadding != null ||
            gap != null
    }

    private fun DropZoneProperties.hasColors() =
        backgroundColor != null ||
            iconColor != null ||
            titleColor != null ||
            descriptionColor != null ||
            borderColor != null
}
