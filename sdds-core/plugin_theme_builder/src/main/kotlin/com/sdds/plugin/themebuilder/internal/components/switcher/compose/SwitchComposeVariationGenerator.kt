package com.sdds.plugin.themebuilder.internal.components.switcher.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.switcher.SwitchProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class SwitchComposeVariationGenerator(
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
) : ComposeVariationGenerator<SwitchProperties>(
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

    override fun getCustomState(state: String): String {
        return when (state) {
            "checked" -> "SwitchStates.Checked"
            else -> throw IllegalStateException("Unknown state $state for Switch")
        }
    }

    override fun KtFileBuilder.onAddImports() {
        addImport("com.sdds.compose.uikit", listOf("SwitchStates"))
    }

    override fun propsToBuilderCalls(
        props: SwitchProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        toggleTrackShapeCall(props, variationId),
        toggleThumbShapeCall(props, variationId),
        labelStyleCall(props),
        descriptionStyleCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        disableAlphaCall(props),
    )

    private fun labelStyleCall(props: SwitchProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun descriptionStyleCall(props: SwitchProperties): String? {
        return props.descriptionStyle?.let {
            getTypography("descriptionStyle", it)
        }
    }

    private fun toggleTrackShapeCall(props: SwitchProperties, variationId: String): String? {
        return props.toggleTrackShape?.let {
            getShape(it, variationId, "toggleTrackShape")
        }
    }

    private fun toggleThumbShapeCall(props: SwitchProperties, variationId: String): String? {
        return props.toggleThumbShape?.let {
            getShape(it, variationId, "toggleThumbShape")
        }
    }

    private fun disableAlphaCall(props: SwitchProperties): String? {
        return props.disableAlpha?.let {
            ".disableAlpha(${it.value}f)"
        }
    }

    private fun colorsCall(props: SwitchProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colorValues {")
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                props.descriptionColor?.let {
                    appendLine(getColor("descriptionColor", it))
                }
                props.toggleTrackColor?.let {
                    appendLine(getColor("toggleTrackColor", it))
                }
                props.toggleTrackBorderColor?.let {
                    appendLine(getColor("toggleTrackBorderColor", it))
                }
                props.toggleThumbColor?.let {
                    appendLine(getColor("toggleThumbColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: SwitchProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensionValues {")
                props.toggleTrackWidth?.let {
                    appendDimension("toggle_track_width", it, variationId)
                }
                props.toggleTrackHeight?.let {
                    appendDimension("toggle_track_height", it, variationId)
                }
                props.toggleThumbWidth?.let {
                    appendDimension("toggle_thumb_width", it, variationId)
                }
                props.toggleThumbHeight?.let {
                    appendDimension("toggle_thumb_height", it, variationId)
                }
                props.togglePadding?.let {
                    appendDimension("toggle_padding", it, variationId)
                }
                props.textPadding?.let {
                    appendDimension("text_padding", it, variationId)
                }
                props.descriptionPadding?.let {
                    appendDimension("description_padding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun SwitchProperties.hasDimensions(): Boolean {
        return toggleTrackWidth != null ||
            toggleTrackHeight != null ||
            toggleThumbWidth != null ||
            toggleThumbHeight != null ||
            togglePadding != null ||
            textPadding != null ||
            descriptionPadding != null
    }

    private fun SwitchProperties.hasColors(): Boolean {
        return labelColor != null ||
            descriptionColor != null ||
            toggleTrackColor != null ||
            toggleTrackBorderColor != null ||
            toggleThumbColor != null
    }
}
