package com.sdds.plugin.themebuilder.internal.components.codeinput.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.codeinput.CodeInputProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Генератор вариаций CodeInput на Compose
 */
internal class CodeInputComposeVariationGenerator(
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
) : ComposeVariationGenerator<CodeInputProperties>(
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
        addImport("com.sdds.compose.uikit", listOf("CodeInputStates"))
    }

    override fun getCustomState(state: String): String {
        return when (state) {
            "error" -> "CodeInputStates.Error"
            else -> throw IllegalStateException("Unknown state $state for CodeInput")
        }
    }

    override fun mapInteractionState(state: InteractiveState): String {
        return when (state) {
            InteractiveState.Focused -> "CodeInputStates.Focused"
            else -> super.mapInteractionState(state)
        }
    }

    override fun propsToBuilderCalls(
        props: CodeInputProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            codeStyleCall(props),
            captionStyleCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
        )
    }

    private fun codeStyleCall(props: CodeInputProperties): String? {
        return props.codeStyle?.let {
            getTypography("codeStyle", it)
        }
    }

    private fun captionStyleCall(props: CodeInputProperties): String? {
        return props.captionStyle?.let {
            getTypography("captionStyle", it)
        }
    }

    private fun colorsCall(props: CodeInputProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.codeColor?.let {
                    appendLine(getColor("codeColor", it, true))
                }
                props.captionColor?.let {
                    appendLine(getColor("captionColor", it, true))
                }
                props.fillColor?.let {
                    appendLine(getColor("fillColor", it, true))
                }
                props.strokeColor?.let {
                    appendLine(getColor("strokeColor", it, true))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CodeInputProperties.hasColors(): Boolean {
        return codeColor != null ||
            captionColor != null ||
            fillColor != null ||
            strokeColor != null
    }

    private fun dimensionsCall(
        props: CodeInputProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.dotSize?.let {
                    appendDimension("circle_size", it, variationId)
                }
                props.strokeWidth?.let {
                    appendDimension("stroke_width", it, variationId)
                }
                props.itemHeight?.let {
                    appendDimension("item_height", it, variationId)
                }
                props.itemWidth?.let {
                    appendDimension("item_width", it, variationId)
                }
                props.itemSpacing?.let {
                    appendDimension("item_spacing", it, variationId)
                }
                props.groupSpacing?.let {
                    appendDimension("group_spacing", it, variationId)
                }
                props.captionPadding?.let {
                    appendDimension("caption_padding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CodeInputProperties.hasDimensions(): Boolean {
        return dotSize != null ||
            strokeWidth != null ||
            itemHeight != null ||
            itemWidth != null ||
            itemSpacing != null ||
            groupSpacing != null ||
            captionPadding != null
    }
}
