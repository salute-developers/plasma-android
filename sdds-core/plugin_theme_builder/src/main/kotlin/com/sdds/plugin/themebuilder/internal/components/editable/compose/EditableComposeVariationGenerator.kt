package com.sdds.plugin.themebuilder.internal.components.editable.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.editable.EditableProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class EditableComposeVariationGenerator(
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
) : ComposeVariationGenerator<EditableProperties>(
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
        props: EditableProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        colorsCall(props),
        textStyleCall(props),
        dimensionsCall(props, variationId),
    )

    private fun textStyleCall(props: EditableProperties): String? {
        return props.textStyle?.let {
            getTypography("textStyle", it)
        }
    }

    private fun colorsCall(props: EditableProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.iconColor?.let {
                    appendLine(getColor("iconColor", it))
                }
                props.textColor?.let {
                    appendLine(getColor("textColor", it))
                }
                props.cursorColor?.let {
                    appendLine(getColor("cursorColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: EditableProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.iconSize?.let {
                    appendDimension("icon_size", it, variationId)
                }
                props.iconMargin?.let {
                    appendDimension("icon_margin", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun EditableProperties.hasDimensions(): Boolean {
        return iconSize != null || iconMargin != null
    }

    private fun EditableProperties.hasColors() =
        iconColor != null ||
            textColor != null ||
            cursorColor != null
}
