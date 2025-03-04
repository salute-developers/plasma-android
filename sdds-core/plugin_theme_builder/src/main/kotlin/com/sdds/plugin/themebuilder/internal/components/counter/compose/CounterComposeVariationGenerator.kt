package com.sdds.plugin.themebuilder.internal.components.counter.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.counter.CounterProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Генератор вариаций Counter на Compose
 */
internal class CounterComposeVariationGenerator(
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
) : ComposeVariationGenerator<CounterProperties>(
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
    override val componentStyleName = "CounterStyle"

    override fun propsToBuilderCalls(
        props: CounterProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            textStyleCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
        )
    }

    private fun shapeCall(props: CounterProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun textStyleCall(props: CounterProperties): String? {
        return props.labelStyle?.let {
            getTypography("textStyle", it)
        }
    }

    private fun colorsCall(props: CounterProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
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

    private fun CounterProperties.hasColors(): Boolean {
        return backgroundColor != null || textColor != null
    }

    private fun dimensionsCall(
        props: CounterProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.minHeight?.let {
                    appendDimension("minHeight", it, variationId)
                }
                props.minWidth?.let {
                    appendDimension("minWidth", it, variationId)
                }
                props.paddingLeft?.let {
                    appendDimension("paddingStart", it, variationId)
                }
                props.paddingRight?.let {
                    appendDimension("paddingEnd", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CounterProperties.hasDimensions(): Boolean {
        return minHeight != null ||
            minWidth != null ||
            paddingLeft != null ||
            paddingRight != null
    }
}
