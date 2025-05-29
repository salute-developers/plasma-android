package com.sdds.plugin.themebuilder.internal.components.toast.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.toast.ToastProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class ToastComposeVariationGenerator(
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
) : ComposeVariationGenerator<ToastProperties>(
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
        props: ToastProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        textStyleCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun textStyleCall(props: ToastProperties): String? {
        return props.textStyle?.let {
            getTypography("textStyle", it)
        }
    }

    private fun shapeCall(props: ToastProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun colorsCall(props: ToastProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("backgroundColor", it))
                }
                props.textColor?.let {
                    appendLine(getColor("textColor", it))
                }
                props.contentStartColor?.let {
                    appendLine(getColor("contentStartColor", it))
                }
                props.contentEndColor?.let {
                    appendLine(getColor("contentEndColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: ToastProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.contentStartSize?.let {
                    appendDimension("content_start_size", it, variationId)
                }
                props.contentEndSize?.let {
                    appendDimension("content_end_size", it, variationId)
                }
                props.contentStartPadding?.let {
                    appendDimension("content_start_padding", it, variationId)
                }
                props.contentEndPadding?.let {
                    appendDimension("content_end_padding", it, variationId)
                }
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
                append("}")
            }
        } else {
            null
        }
    }

    private fun ToastProperties.hasDimensions(): Boolean {
        return contentStartSize != null ||
            contentStartPadding != null ||
            contentEndPadding != null ||
            contentEndSize != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null
    }

    private fun ToastProperties.hasColors() = backgroundColor != null ||
        contentStartColor != null ||
        contentEndColor != null ||
        textColor != null
}
