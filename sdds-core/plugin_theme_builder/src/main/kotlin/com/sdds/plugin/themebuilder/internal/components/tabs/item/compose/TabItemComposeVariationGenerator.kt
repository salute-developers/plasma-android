package com.sdds.plugin.themebuilder.internal.components.tabs.item.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.tabs.item.TabItemProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class TabItemComposeVariationGenerator(
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
) : ComposeVariationGenerator<TabItemProperties>(
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
    styleBuilderName = "TabItemStyleBuilder",
) {

    override val componentStyleName: String = "TabItemStyle"

    override fun propsToBuilderCalls(
        props: TabItemProperties,
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
            actionIconCall(props),
            disableAlphaCall(props),
        )
    }

    private fun disableAlphaCall(props: TabItemProperties): String? {
        return props.disableAlpha?.let {
            ".disableAlpha(${it.value}f)"
        }
    }

    private fun actionIconCall(props: TabItemProperties): String? {
        return props.actionIcon?.let {
            getIconAsDrawableRes("actionIcon", it)
        }
    }

    private fun shapeCall(props: TabItemProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun labelStyleCall(props: TabItemProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun valueStyleCall(props: TabItemProperties): String? {
        return props.valueStyle?.let {
            getTypography("valueStyle", it)
        }
    }

    private fun counterStyleCall(props: TabItemProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.counterStyle?.let {
            ".counterStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    counterStylesPackage,
                )
            }.style())"
        }
    }

    private fun colorsCall(props: TabItemProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it, forceStatefulSuffix = true))
                }
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it, forceStatefulSuffix = true))
                }
                props.valueColor?.let {
                    appendLine(getColor("valueColor", it, forceStatefulSuffix = true))
                }
                props.startContentColor?.let {
                    appendLine(getColor("startContentColor", it, forceStatefulSuffix = true))
                }
                props.endContentColor?.let {
                    appendLine(getColor("endContentColor", it, forceStatefulSuffix = true))
                }
                props.actionColor?.let {
                    appendLine(getColor("actionColor", it, forceStatefulSuffix = true))
                }
                append("}")
            }
        } else {
            null
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun dimensionsCall(
        props: TabItemProperties,
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
                props.startContentSize?.let {
                    appendDimension("start_content_size", it, variationId)
                }
                props.endContentSize?.let {
                    appendDimension("end_content_size", it, variationId)
                }
                props.iconPadding?.let {
                    appendDimension("icon_padding", it, variationId)
                }
                props.counterPadding?.let {
                    appendDimension("counter_padding", it, variationId)
                }
                props.valuePadding?.let {
                    appendDimension("value_padding", it, variationId)
                }
                props.actionPadding?.let {
                    appendDimension("action_padding", it, variationId)
                }
                props.actionSize?.let {
                    appendDimension("action_size", it, variationId)
                }
                props.counterOffsetX?.let {
                    appendDimension("counter_offset_x", it, variationId)
                }
                props.counterOffsetY?.let {
                    appendDimension("counter_offset_y", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun TabItemProperties.hasColors(): Boolean {
        return labelColor != null ||
            valueColor != null ||
            backgroundColor != null ||
            startContentColor != null ||
            endContentColor != null ||
            actionColor != null
    }

    private fun TabItemProperties.hasDimensions(): Boolean {
        return minWidth != null ||
            minHeight != null ||
            paddingStart != null ||
            paddingEnd != null ||
            startContentSize != null ||
            endContentSize != null ||
            iconPadding != null ||
            counterPadding != null ||
            valuePadding != null ||
            actionPadding != null ||
            actionSize != null ||
            counterOffsetX != null ||
            counterOffsetY != null
    }
}
