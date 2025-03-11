package com.sdds.plugin.themebuilder.internal.components.badge.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.badge.BadgeProperties
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Генератор вариаций Badge на Compose
 */
internal class BadgeComposeVariationGenerator(
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
) : ComposeVariationGenerator<BadgeProperties>(
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
    override val componentStyleName = "BadgeStyle"

    override fun propsToBuilderCalls(
        props: BadgeProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            labelStyleCall(props),
            colorCall(props),
            dimensionsCall(props, variationId),
        )
    }

    private fun shapeCall(props: BadgeProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun labelStyleCall(props: BadgeProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun colorCall(props: BadgeProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                props.startContentColor?.let {
                    appendLine(getColor("startContentColor", it))
                }
                props.endContentColor?.let {
                    appendLine(getColor("endContentColor", it))
                }
                props.contentColor?.let {
                    appendLine(getColor("contentColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun BadgeProperties.hasColors(): Boolean {
        return backgroundColor != null ||
            labelColor != null ||
            startContentColor != null ||
            endContentColor != null ||
            contentColor != null
    }

    private fun dimensionsCall(
        props: BadgeProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.height?.let {
                    appendDimension("height", it, variationId)
                }
                props.startContentSize?.let {
                    appendDimension("startContentSize", it, variationId)
                }
                props.endContentSize?.let {
                    appendDimension("endContentSize", it, variationId)
                }
                props.startContentMargin?.let {
                    appendDimension("startContentMargin", it, variationId)
                }
                props.endContentMargin?.let {
                    appendDimension("endContentMargin", it, variationId)
                }
                props.startPadding?.let {
                    appendDimension("startPadding", it, variationId)
                }
                props.endPadding?.let {
                    appendDimension("endPadding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun BadgeProperties.hasDimensions(): Boolean {
        return height != null ||
            startContentSize != null ||
            endContentSize != null ||
            startContentMargin != null ||
            endContentMargin != null ||
            startPadding != null ||
            endPadding != null
    }
}
