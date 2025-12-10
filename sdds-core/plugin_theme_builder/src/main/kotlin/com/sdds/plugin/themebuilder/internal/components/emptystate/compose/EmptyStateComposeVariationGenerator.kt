package com.sdds.plugin.themebuilder.internal.components.emptystate.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.emptystate.EmptyStateProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class EmptyStateComposeVariationGenerator(
    private val buttonStylesPackage: String,
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
) : ComposeVariationGenerator<EmptyStateProperties>(
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
    override fun propsToBuilderCalls(
        props: EmptyStateProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        colorsCall(props),
        descriptionStyleCall(props),
        dimensionsCall(props, variationId),
        buttonStyleCall(props, ktFileBuilder),
    )

    private fun buttonStyleCall(
        props: EmptyStateProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.buttonStyle?.let {
            ".buttonStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    buttonStylesPackage,
                )
            }.style())"
        }
    }

    private fun descriptionStyleCall(props: EmptyStateProperties): String? {
        return props.descriptionStyle?.let {
            getTypography("descriptionStyle", it)
        }
    }

    private fun colorsCall(props: EmptyStateProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.iconColor?.let {
                    appendLine(getColor("iconColor", it))
                }
                props.descriptionColor?.let {
                    appendLine(getColor("descriptionColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: EmptyStateProperties,
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
                props.descriptionPadding?.let {
                    appendDimension("description_padding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun EmptyStateProperties.hasDimensions(): Boolean {
        return descriptionPadding != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null
    }

    private fun EmptyStateProperties.hasColors() = iconColor != null || descriptionColor != null
}
