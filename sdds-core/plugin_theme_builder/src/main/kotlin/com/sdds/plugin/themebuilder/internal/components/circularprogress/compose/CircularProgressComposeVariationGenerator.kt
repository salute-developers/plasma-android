package com.sdds.plugin.themebuilder.internal.components.circularprogress.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.circularprogress.CircularProgressProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class CircularProgressComposeVariationGenerator(
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
) : ComposeVariationGenerator<CircularProgressProperties>(
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
    }

    override fun propsToBuilderCalls(
        props: CircularProgressProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        valueStyleCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        valueEnabledCall(props),
        trackEnabledCall(props),
    )

    private fun valueEnabledCall(props: CircularProgressProperties): String? {
        return props.valueEnabled?.let {
            ".valueEnabled(${it.value})"
        }
    }

    private fun trackEnabledCall(props: CircularProgressProperties): String? {
        return props.trackEnabled?.let {
            ".trackEnabled(${it.value})"
        }
    }

    private fun valueStyleCall(props: CircularProgressProperties): String? {
        return props.valueStyle?.let {
            getTypography("valueStyle", it)
        }
    }

    private fun colorsCall(props: CircularProgressProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.indicatorColor?.let {
                    appendLine(getGradientOrWrappedColor("indicatorColor", it))
                }
                props.trackColor?.let {
                    appendLine(getGradientOrWrappedColor("trackColor", it))
                }
                props.valueColor?.let {
                    appendLine(getGradientOrWrappedColor("valueColor", it))
                }
                props.valueSuffixColor?.let {
                    appendLine(getGradientOrWrappedColor("valueSuffixColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: CircularProgressProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.width?.let {
                    appendDimension("width", it, variationId)
                }
                props.height?.let {
                    appendDimension("height", it, variationId)
                }
                props.trackThickness?.let {
                    appendDimension("track_thickness", it, variationId)
                }
                props.progressThickness?.let {
                    appendDimension("progress_thickness", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CircularProgressProperties.hasDimensions(): Boolean {
        return width != null ||
            height != null ||
            trackThickness != null ||
            progressThickness != null
    }

    private fun CircularProgressProperties.hasColors(): Boolean {
        return indicatorColor != null ||
            trackColor != null ||
            valueColor != null ||
            valueSuffixColor != null
    }
}
