package com.sdds.plugin.themebuilder.internal.components.button.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.button.ButtonProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Генератор вариаций Button на Compose
 */
internal class ButtonComposeVariationGenerator(
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
    styleBuilderFactoryFunName: String,
) : ComposeVariationGenerator<ButtonProperties>(
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
    styleBuilderFactoryFunName = styleBuilderFactoryFunName,
) {

    override val componentStyleName = "ButtonStyle"
    override fun propsToBuilderCalls(
        props: ButtonProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            labelStyleCall(props),
            valueStyleCall(props),
            dimensionsCall(props, variationId),
            colorsCall(props),
            loadingAlphaCall(props),
            disableAlphaCall(props),
        )
    }

    private fun shapeCall(props: ButtonProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun labelStyleCall(props: ButtonProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun valueStyleCall(props: ButtonProperties): String? {
        return props.valueStyle?.let {
            getTypography("valueStyle", it)
        }
    }

    private fun loadingAlphaCall(props: ButtonProperties): String? {
        return props.loadingAlpha?.let {
            ".loadingAlpha(${it.value}f)"
        }
    }

    private fun disableAlphaCall(props: ButtonProperties): String? {
        return props.disableAlpha?.let {
            ".disableAlpha(${it.value}f)"
        }
    }

    private fun colorsCall(props: ButtonProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.spinnerColor?.let {
                    appendLine(getColor("spinnerColor", it))
                }
                props.iconColor?.let {
                    appendLine(getColor("iconColor", it))
                }
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                props.valueColor?.let {
                    appendLine(getColor("valueColor", it))
                }
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ButtonProperties.hasColors(): Boolean {
        return labelColor != null ||
            spinnerColor != null ||
            iconColor != null ||
            valueColor != null ||
            backgroundColor != null
    }

    private fun dimensionsCall(
        props: ButtonProperties,
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
                props.minWidth?.let {
                    appendDimension("min_width", it, variationId)
                }
                props.iconSize?.let {
                    appendDimension("icon_size", it, variationId)
                }
                props.spinnerSize?.let {
                    appendDimension("spinner_size", it, variationId)
                }
                props.spinnerStrokeWidth?.let {
                    appendDimension("spinner_stroke_width", it, variationId)
                }
                props.iconMargin?.let {
                    appendDimension("icon_margin", it, variationId)
                }
                props.valueMargin?.let {
                    appendDimension("value_margin", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ButtonProperties.hasDimensions(): Boolean {
        return height != null ||
            paddingStart != null ||
            paddingEnd != null ||
            minWidth != null ||
            iconSize != null ||
            spinnerSize != null ||
            spinnerStrokeWidth != null ||
            iconMargin != null ||
            valueMargin != null
    }
}
