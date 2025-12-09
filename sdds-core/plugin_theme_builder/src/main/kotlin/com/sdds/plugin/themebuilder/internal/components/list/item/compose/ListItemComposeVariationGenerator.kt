package com.sdds.plugin.themebuilder.internal.components.list.item.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.list.item.ListItemProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class ListItemComposeVariationGenerator(
    private val counterStylePackage: String,
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
) : ComposeVariationGenerator<ListItemProperties>(
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

    override val componentStyleName: String = "ListItemStyle"

    override fun propsToBuilderCalls(
        props: ListItemProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            titleStyleCall(props),
            subtitleStyleCall(props),
            labelStyleCall(props),
            disclosureIconCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
            counterStyleCall(props, ktFileBuilder),
        )
    }

    private fun shapeCall(props: ListItemProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun dimensionsCall(
        props: ListItemProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.contentPaddingEnd?.let {
                    appendDimension("content_padding_end", it, variationId)
                }
                props.contentPaddingStart?.let {
                    appendDimension("content_padding_start", it, variationId)
                }
                props.height?.let {
                    appendDimension("height", it, variationId)
                }
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

    private fun counterStyleCall(props: ListItemProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.counterStyle?.let {
            ".counterStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    counterStylePackage,
                )
            }.style())"
        }
    }

    private fun ListItemProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            contentPaddingEnd != null ||
            height != null
    }

    private fun colorsCall(props: ListItemProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.titleColor?.let {
                    appendLine(getColor("titleColor", it))
                }
                props.subtitleColor?.let {
                    appendLine(getColor("subtitleColor", it))
                }
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.disclosureIconColor?.let {
                    appendLine(getColor("disclosureIconColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ListItemProperties.hasColors(): Boolean {
        return backgroundColor != null ||
            titleColor != null ||
            disclosureIconColor != null
    }

    private fun titleStyleCall(props: ListItemProperties): String? {
        return props.titleStyle?.let {
            getTypography("titleStyle", it)
        }
    }

    private fun subtitleStyleCall(props: ListItemProperties): String? {
        return props.subtitleStyle?.let {
            getTypography("subtitleStyle", it)
        }
    }

    private fun labelStyleCall(props: ListItemProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun disclosureIconCall(props: ListItemProperties): String? {
        return props.disclosureIcon?.let {
            getIconAsDrawableRes("disclosureIcon", it)
        }
    }
}
