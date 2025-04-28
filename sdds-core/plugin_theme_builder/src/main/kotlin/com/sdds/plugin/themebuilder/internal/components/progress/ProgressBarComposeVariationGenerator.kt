package com.sdds.plugin.themebuilder.internal.components.progress

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class ProgressBarComposeVariationGenerator(
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
) : ComposeVariationGenerator<ProgressBarProperties>(
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

    override fun propsToBuilderCalls(
        props: ProgressBarProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        indicatorShapeCall(props, variationId),
        backgroundShapeCall(props, variationId),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun indicatorShapeCall(props: ProgressBarProperties, variationId: String): String? {
        return props.indicatorShape?.let {
            getShape(it, variationId, "indicatorShape")
        }
    }

    private fun backgroundShapeCall(props: ProgressBarProperties, variationId: String): String? {
        return props.backgroundShape?.let {
            getShape(it, variationId, "backgroundShape")
        }
    }

    private fun colorsCall(props: ProgressBarProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colorValues {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.indicatorColor?.let {
                    appendLine(getColor("indicatorColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: ProgressBarProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensionValues {")
                props.indicatorHeight?.let {
                    appendDimension("indicator_height", it, variationId)
                }
                props.backgroundHeight?.let {
                    appendDimension("background_height", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ProgressBarProperties.hasDimensions(): Boolean {
        return indicatorHeight != null || backgroundHeight != null
    }

    private fun ProgressBarProperties.hasColors(): Boolean {
        return backgroundColor != null || indicatorColor != null
    }
}
