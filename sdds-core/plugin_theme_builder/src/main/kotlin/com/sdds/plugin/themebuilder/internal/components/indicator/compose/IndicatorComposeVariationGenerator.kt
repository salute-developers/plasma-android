package com.sdds.plugin.themebuilder.internal.components.indicator.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Генератор вариаций Indicator на Compose
 */
internal class IndicatorComposeVariationGenerator(
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
) : ComposeVariationGenerator<IndicatorProperties>(
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
    override val componentStyleName = "IndicatorStyle"

    override fun propsToBuilderCalls(
        props: IndicatorProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            colorCall(props),
            dimensionsCall(props, variationId),
        )
    }

    private fun shapeCall(props: IndicatorProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun colorCall(props: IndicatorProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".color {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun IndicatorProperties.hasColors(): Boolean {
        return backgroundColor != null
    }

    private fun dimensionsCall(
        props: IndicatorProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.height?.let {
                    appendDimension("height", it, variationId)
                }
                props.width?.let {
                    appendDimension("width", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun IndicatorProperties.hasDimensions(): Boolean {
        return height != null || width != null
    }
}
