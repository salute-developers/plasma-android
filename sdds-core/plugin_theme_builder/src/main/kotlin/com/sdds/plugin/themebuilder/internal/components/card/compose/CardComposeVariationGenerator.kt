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

    override fun KtFileBuilder.onAddImports() {
        addImport("com.sdds.compose.uikit", listOf("CardOrientation"))
    }

    override fun propsToBuilderCalls(
        props: CardProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            orientationCall(props),
            labelStyleCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
        )
    }

    private fun orientationCall(props: CardProperties): String? {
        return props.orientation?.let {
            val enumValue = when {
                it.value.equals("vertical", ignoreCase = true) -> "Vertical"
                else -> "Horizontal"
            }
            ".orientation(CardOrientation.$enumValue)"
        }
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

    private fun labelStyleCall(props: CardProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun colorsCall(props: CardProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CardProperties.hasColors(): Boolean {
        return backgroundColor != null ||
            labelColor != null
    }

    @Suppress("CyclomaticComplexMethod")
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
                props.contentPaddingTop?.let {
                    appendDimension("contentPaddingTop", it, variationId)
                }
                props.contentPaddingBottom?.let {
                    appendDimension("contentPaddingBottom", it, variationId)
                }
                props.contentPaddingStart?.let {
                    appendDimension("contentPaddingStart", it, variationId)
                }
                props.contentPaddingEnd?.let {
                    appendDimension("contentPaddingEnd", it, variationId)
                }
                props.contentMinWidth?.let {
                    appendDimension("contentMinWidth", it, variationId)
                }
                props.contentMinHeight?.let {
                    appendDimension("contentMinHeight", it, variationId)
                }
                props.contentMaxWidth?.let {
                    appendDimension("contentMaxWidth", it, variationId)
                }
                props.contentMaxHeight?.let {
                    appendDimension("contentMaxHeight", it, variationId)
                }
                props.mainAxisGap?.let {
                    appendDimension("mainAxisGap", it, variationId)
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
            paddingBottom != null ||
            contentPaddingStart != null ||
            contentPaddingEnd != null ||
            contentPaddingTop != null ||
            contentPaddingBottom != null ||
            contentMinWidth != null ||
            contentMinHeight != null ||
            contentMaxWidth != null ||
            contentMaxHeight != null ||
            mainAxisGap != null
    }

    private fun CardProperties.hasShape(): Boolean {
        return shape != null || contentShape != null
    }
}
