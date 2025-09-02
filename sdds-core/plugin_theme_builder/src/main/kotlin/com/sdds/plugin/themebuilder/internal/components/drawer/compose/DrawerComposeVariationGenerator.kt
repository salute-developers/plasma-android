package com.sdds.plugin.themebuilder.internal.components.drawer.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.drawer.DrawerProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class DrawerComposeVariationGenerator(
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
) : ComposeVariationGenerator<DrawerProperties>(
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

    override val componentStyleName: String = "DrawerStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
        addImport("com.sdds.compose.uikit", listOf("CloseIconPlacement"))
        addImport("com.sdds.compose.uikit", listOf("CloseIconAlignment"))
    }

    override fun propsToBuilderCalls(
        props: DrawerProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        shadowCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        closeIconCall(props),
        closeIconPlacementCall(props),
        closeIconAlignmentCall(props),
    )

    private fun closeIconPlacementCall(props: DrawerProperties): String? {
        return props.closeIconPlacement?.let {
            val enumValue = when {
                it.value.equals("inner", ignoreCase = true) -> "Inner"
                it.value.equals("outer", ignoreCase = true) -> "Outer"
                else -> "None"
            }
            ".closeIconPlacement(CloseIconPlacement.$enumValue)"
        }
    }

    private fun closeIconAlignmentCall(props: DrawerProperties): String? {
        return props.closeIconAlignment?.let {
            val enumValue = when {
                it.value.equals("start", ignoreCase = true) -> "Start"
                else -> "End"
            }
            ".closeIconAlignment(CloseIconAlignment.$enumValue)"
        }
    }

    private fun shapeCall(props: DrawerProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun shadowCall(props: DrawerProperties): String? {
        return props.shadow?.let {
            getShadow(it)
        }
    }

    private fun colorsCall(props: DrawerProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("background", it))
                }
                props.closeColor?.let {
                    appendLine(getColor("closeIconColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: DrawerProperties,
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
                props.strokeSize?.let {
                    appendDimension("stroke_width", it, variationId)
                }
                props.peekSize?.let {
                    appendDimension("peek_size", it, variationId)
                }
                props.closeIconHeaderPadding?.let {
                    appendDimension("close_icon_header_padding", it, variationId)
                }
                props.closeIconOffsetX?.let {
                    appendDimension("close_icon_offset_x", it, variationId)
                }
                props.closeIconOffsetY?.let {
                    appendDimension("close_icon_offset_y", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun closeIconCall(props: DrawerProperties): String? {
        return props.closeIcon?.let {
            getIconAsDrawableRes("closeIconRes", it)
        }
    }

    private fun DrawerProperties.hasDimensions(): Boolean {
        return strokeSize != null ||
            peekSize != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            closeIconHeaderPadding != null ||
            closeIconOffsetX != null ||
            closeIconOffsetY != null
    }

    private fun DrawerProperties.hasColors() =
        backgroundColor != null || closeColor != null || strokeColor != null
}
