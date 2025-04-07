package com.sdds.plugin.themebuilder.internal.components.divider.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.divider.DividerProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Генератор вариаций Divider на Compose
 */
internal class DividerComposeVariationGenerator(
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
) : ComposeVariationGenerator<DividerProperties>(
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
    override val componentStyleName = "DividerStyle"

    override fun propsToBuilderCalls(
        props: DividerProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            colorCall(props),
            dimensionsCall(props, variationId),
        )
    }

    private fun shapeCall(props: DividerProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun colorCall(props: DividerProperties): String? {
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

    private fun DividerProperties.hasColors(): Boolean {
        return backgroundColor != null
    }

    private fun dimensionsCall(
        props: DividerProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.thickness?.let {
                    appendDimension("thickness", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun DividerProperties.hasDimensions(): Boolean {
        return thickness != null
    }
}
