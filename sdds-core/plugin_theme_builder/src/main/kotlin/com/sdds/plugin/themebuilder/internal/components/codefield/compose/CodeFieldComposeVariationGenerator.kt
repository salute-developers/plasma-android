package com.sdds.plugin.themebuilder.internal.components.codefield.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.codefield.CodeFieldProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Генератор вариаций CodeField на Compose
 */
internal class CodeFieldComposeVariationGenerator(
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
) : ComposeVariationGenerator<CodeFieldProperties>(
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
            "activated" -> "InteractiveState.Activated"
            else -> throw IllegalStateException("Unknown state $state for CodeField")
        }
    }

    override fun propsToBuilderCalls(
        props: CodeFieldProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            itemShapeCall(props, variationId),
            groupShapeCall(props, variationId),
            valueStyleCall(props),
            captionStyleCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
        )
    }

    private fun itemShapeCall(props: CodeFieldProperties, variationId: String): String? {
        return props.itemShape?.let {
            getShape(it, variationId, "itemShape")
        }
    }

    private fun groupShapeCall(props: CodeFieldProperties, variationId: String): String? {
        return props.groupShape?.let {
            getShape(it, variationId, "groupShape")
        }
    }

    private fun valueStyleCall(props: CodeFieldProperties): String? {
        return props.valueStyle?.let {
            getTypography("valueStyle", it)
        }
    }

    private fun captionStyleCall(props: CodeFieldProperties): String? {
        return props.captionStyle?.let {
            getTypography("captionStyle", it)
        }
    }

    private fun colorsCall(props: CodeFieldProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.valueColor?.let {
                    appendLine(getColor("valueColor", it, true))
                }
                props.captionColor?.let {
                    appendLine(getColor("captionColor", it, true))
                }
                props.dotColor?.let {
                    appendLine(getColor("dotColor", it, true))
                }
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it, true))
                }
                props.cursorColor?.let {
                    appendLine(getColor("cursorColor", it, true))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CodeFieldProperties.hasColors(): Boolean {
        return valueColor != null ||
            captionColor != null ||
            dotColor != null ||
            backgroundColor != null ||
            cursorColor != null
    }

    private fun dimensionsCall(
        props: CodeFieldProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.dotSize?.let {
                    appendDimension("dot_size", it, variationId)
                }
                props.height?.let {
                    appendDimension("height", it, variationId)
                }
                props.width?.let {
                    appendDimension("width", it, variationId)
                }
                props.itemSpacing?.let {
                    appendDimension("item_spacing", it, variationId)
                }
                props.groupSpacing?.let {
                    appendDimension("group_spacing", it, variationId)
                }
                props.captionSpacing?.let {
                    appendDimension("caption_spacing", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CodeFieldProperties.hasDimensions(): Boolean {
        return dotSize != null ||
            height != null ||
            width != null ||
            itemSpacing != null ||
            groupSpacing != null ||
            captionSpacing != null
    }
}
