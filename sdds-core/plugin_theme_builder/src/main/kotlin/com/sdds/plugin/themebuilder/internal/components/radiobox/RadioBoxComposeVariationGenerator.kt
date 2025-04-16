package com.sdds.plugin.themebuilder.internal.components.radiobox

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class RadioBoxComposeVariationGenerator(
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
) : ComposeVariationGenerator<RadioBoxProperties>(
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
            "checked" -> "RadioBoxStates.Checked"
            else -> throw IllegalStateException("Unknown state $state for Radiobox")
        }
    }

    override fun KtFileBuilder.onAddImports() {
        addImport("com.sdds.compose.uikit", listOf("RadioBoxStates"))
    }

    override fun propsToBuilderCalls(
        props: RadioBoxProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> = listOfNotNull(
        shapeCall(props, variationId),
        labelStyleCall(props),
        descriptionStyleCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        disableAlphaCall(props),
    )

    private fun shapeCall(props: RadioBoxProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun labelStyleCall(props: RadioBoxProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun descriptionStyleCall(props: RadioBoxProperties): String? {
        return props.descriptionStyle?.let {
            getTypography("descriptionStyle", it)
        }
    }

    private fun disableAlphaCall(props: RadioBoxProperties): String? {
        return props.disableAlpha?.let {
            ".disableAlpha(${it.value}f)"
        }
    }

    private fun colorsCall(props: RadioBoxProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colorValues {")
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                props.descriptionColor?.let {
                    appendLine(getColor("descriptionColor", it))
                }
                props.toggleColor?.let {
                    appendLine(getColor("toggleColor", it))
                }
                props.toggleIconColor?.let {
                    appendLine(getColor("toggleIconColor", it))
                }
                props.toggleBorderColor?.let {
                    appendLine(getColor("toggleBorderColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: RadioBoxProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensionValues {")
                props.toggleWidth?.let {
                    appendDimension("toggle_width", it, variationId)
                }
                props.toggleHeight?.let {
                    appendDimension("toggle_height", it, variationId)
                }
                props.toggleIconHeight?.let {
                    appendDimension("toggle_icon_height", it, variationId)
                }
                props.toggleIconWidth?.let {
                    appendDimension("toggle_icon_width", it, variationId)
                }
                props.toggleBorderOffset?.let {
                    appendDimension("toggle_border_offset", it, variationId)
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

    private fun RadioBoxProperties.hasDimensions(): Boolean {
        return toggleBorderOffset != null ||
            togglePadding != null ||
            textPadding != null ||
            descriptionPadding != null ||
            toggleWidth != null ||
            toggleHeight != null ||
            toggleIconWidth != null ||
            toggleIconHeight != null
    }

    private fun RadioBoxProperties.hasColors(): Boolean {
        return toggleColor != null ||
            toggleBorderColor != null ||
            toggleIconColor != null ||
            descriptionColor != null ||
            labelColor != null
    }
}
