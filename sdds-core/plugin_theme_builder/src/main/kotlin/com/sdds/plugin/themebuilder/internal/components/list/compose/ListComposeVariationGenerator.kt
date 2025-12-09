package com.sdds.plugin.themebuilder.internal.components.list.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.list.ListProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class ListComposeVariationGenerator(
    private val listItemStylesPackage: String,
    private val dividerStylesPackage: String,
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
) : ComposeVariationGenerator<ListProperties>(
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
    override val componentStyleName: String = "ListStyle"

    override fun propsToBuilderCalls(
        props: ListProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            listItemStyleCall(props, ktFileBuilder),
            dividerStyleCall(props, ktFileBuilder),
            dimensionsCall(props, variationId),
            colorsCall(props),
            shapeCall(props, variationId),
        )
    }

    private fun shapeCall(props: ListProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun listItemStyleCall(props: ListProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.listItemStyle?.let {
            ".listItemStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    listItemStylesPackage,
                )
            }.style())"
        }
    }

    private fun dividerStyleCall(props: ListProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.dividerStyle?.let {
            ".dividerStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    dividerStylesPackage,
                )
            }.style())"
        }
    }

    private fun dimensionsCall(
        props: ListProperties,
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
                props.gap?.let {
                    appendDimension("gap", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun colorsCall(props: ListProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ListProperties.hasColors(): Boolean {
        return backgroundColor != null
    }

    private fun ListProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            gap != null
    }
}
