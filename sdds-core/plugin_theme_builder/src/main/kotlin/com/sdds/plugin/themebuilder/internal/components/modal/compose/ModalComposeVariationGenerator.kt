package com.sdds.plugin.themebuilder.internal.components.modal.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.modal.ModalProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class ModalComposeVariationGenerator(
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
    private val overlayStylesPackage: String,
) : ComposeVariationGenerator<ModalProperties>(
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
        props: ModalProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        shadowCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        overlayStyleCall(props, ktFileBuilder),
    )

    private fun overlayStyleCall(
        props: ModalProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.overlayStyle?.let {
            ".overlayStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    overlayStylesPackage,
                )
            }.style())"
        }
    }

    private fun shapeCall(props: ModalProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun shadowCall(props: ModalProperties): String? {
        return props.shadow?.let {
            getShadow(it)
        }
    }

    private fun colorsCall(props: ModalProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("backgroundColor", it))
                }
                props.closeColor?.let {
                    appendLine(getColor("closeColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: ModalProperties,
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
                props.closeSize?.let {
                    appendDimension("close_size", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ModalProperties.hasDimensions(): Boolean {
        return closeSize != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null
    }

    private fun ModalProperties.hasColors() = backgroundColor != null ||
        closeColor != null
}
