package com.sdds.plugin.themebuilder.internal.components.segment.item.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.counter.CounterProperties
import com.sdds.plugin.themebuilder.internal.components.segment.item.SegmentItemProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class SegmentItemComposeVariationGenerator(
    private val counterStylesPackage: String,
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
) : ComposeVariationGenerator<SegmentItemProperties>(
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
    override fun KtFileBuilder.onAddImports() {
        addImport("com.sdds.compose.uikit.style", listOf("modify"))
    }

    override fun propsToBuilderCalls(
        props: SegmentItemProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            labelStyleCall(props),
            valueStyleCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
            counterStyleCall(props, ktFileBuilder),
        )
    }

    private fun shapeCall(props: SegmentItemProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun labelStyleCall(props: SegmentItemProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun valueStyleCall(props: SegmentItemProperties): String? {
        return props.valueStyle?.let {
            getTypography("valueStyle", it)
        }
    }

    private fun counterStyleCall(
        props: SegmentItemProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.counterStyle?.let { counterStyle ->
            val componentProps = counterStyle.props?.let { ".modify { ${counterColorsCall(it)} }" }.orEmpty()
            ".counterStyle(${
                counterStyle.value.getComponentStyle(
                    ktFileBuilder,
                    counterStylesPackage,
                )
            }$componentProps.style())"
        }
    }

    // TODO: https://github.com/salute-developers/plasma-android/issues/298
    private fun counterColorsCall(props: CounterProperties): String? {
        return if (props.hasCounterColors()) {
            buildString {
                appendLine("colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.textColor?.let {
                    appendLine(getColor("textColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    // TODO: https://github.com/salute-developers/plasma-android/issues/298
    private fun CounterProperties.hasCounterColors(): Boolean {
        return backgroundColor != null || textColor != null
    }

    private fun colorsCall(props: SegmentItemProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                props.valueColor?.let {
                    appendLine(getColor("valueColor", it))
                }
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.startContentColor?.let {
                    appendLine(getColor("startContentColor", it))
                }
                props.endContentColor?.let {
                    appendLine(getColor("endContentColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: SegmentItemProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.minWidth?.let {
                    appendDimension("min_width", it, variationId)
                }
                props.minHeight?.let {
                    appendDimension("min_height", it, variationId)
                }
                props.paddingStart?.let {
                    appendDimension("padding_start", it, variationId)
                }
                props.paddingEnd?.let {
                    appendDimension("padding_end", it, variationId)
                }
                props.iconMargin?.let {
                    appendDimension("start_content_padding", it, variationId)
                }
                props.counterMargin?.let {
                    appendDimension("end_content_padding", it, variationId)
                }
                props.startContentSize?.let {
                    appendDimension("start_content_size", it, variationId)
                }
                props.endContentSize?.let {
                    appendDimension("end_content_size", it, variationId)
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

    private fun SegmentItemProperties.hasColors(): Boolean {
        return labelColor != null ||
            valueColor != null ||
            backgroundColor != null ||
            startContentColor != null ||
            endContentColor != null
    }

    private fun SegmentItemProperties.hasDimensions(): Boolean {
        return minWidth != null ||
            minHeight != null ||
            paddingStart != null ||
            paddingEnd != null ||
            iconMargin != null ||
            counterMargin != null ||
            startContentSize != null ||
            endContentSize != null ||
            valueMargin != null
    }
}
