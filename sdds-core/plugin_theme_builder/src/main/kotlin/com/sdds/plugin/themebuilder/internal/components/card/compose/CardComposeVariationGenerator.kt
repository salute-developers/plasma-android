package com.sdds.plugin.themebuilder.internal.components.card.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.card.CardProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Генератор вариаций Card на Compose
 */
internal class CardComposeVariationGenerator(
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
) : ComposeVariationGenerator<CardProperties>(
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
    override val componentStyleName = "CardStyle"

    override fun propsToBuilderCalls(
        props: CardProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            colorsCall(props),
            dimensionsCall(props, variationId),
        )
    }

    private fun shapeCall(props: CardProperties, variationId: String): String? {
        return if (props.hasShape()) {
            buildString {
                props.shape?.let {
                    appendLine(getShape(it, variationId))
                }
                props.contentShape?.let {
                    appendLine(getShape(it, variationId, "contentShape"))
                }
            }
        } else {
            null
        }
    }

    private fun colorsCall(props: CardProperties): String? {
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

    private fun CardProperties.hasColors(): Boolean {
        return backgroundColor != null
    }

    private fun dimensionsCall(
        props: CardProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.paddingTop?.let {
                    appendDimension("paddingTop", it, variationId)
                }
                props.paddingBottom?.let {
                    appendDimension("paddingBottom", it, variationId)
                }
                props.paddingStart?.let {
                    appendDimension("paddingStart", it, variationId)
                }
                props.paddingEnd?.let {
                    appendDimension("paddingEnd", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CardProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null
    }

    private fun CardProperties.hasShape(): Boolean {
        return shape != null || contentShape != null
    }
}
