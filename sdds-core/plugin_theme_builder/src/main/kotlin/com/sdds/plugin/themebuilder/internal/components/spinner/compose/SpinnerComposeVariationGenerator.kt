package com.sdds.plugin.themebuilder.internal.components.spinner.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.spinner.SpinnerProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class SpinnerComposeVariationGenerator(
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
) : ComposeVariationGenerator<SpinnerProperties>(
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

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
        addImport("com.sdds.compose.uikit", listOf("SpinnerStrokeCap"))
    }

    override fun propsToBuilderCalls(
        props: SpinnerProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        angleCall(props),
        strokeCapCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun angleCall(props: SpinnerProperties): String? {
        return props.angle?.let {
            ".angle(${it.value}f)"
        }
    }

    private fun strokeCapCall(props: SpinnerProperties): String? {
        return props.strokeCap?.let {
            val enumValue = when {
                it.value.equals("round", ignoreCase = true) -> "Round"
                it.value.equals("square", ignoreCase = true) -> "Square"
                else -> throw ThemeBuilderException("Wrong SpinnerStrokeCap value: $it")
            }
            ".strokeCap(SpinnerStrokeCap.$enumValue)"
        }
    }

    private fun colorsCall(props: SpinnerProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.startColor?.let {
                    appendLine(getColor("startColor", it))
                }
                props.endColor?.let {
                    appendLine(getColor("endColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: SpinnerProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.size?.let {
                    appendDimension("size", it, variationId)
                }
                props.padding?.let {
                    appendDimension("padding", it, variationId)
                }
                props.strokeWidth?.let {
                    appendDimension("stroke_width", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun SpinnerProperties.hasDimensions() =
        size != null ||
            padding != null ||
            strokeWidth != null

    private fun SpinnerProperties.hasColors() =
        backgroundColor != null ||
            startColor != null ||
            endColor != null
}
