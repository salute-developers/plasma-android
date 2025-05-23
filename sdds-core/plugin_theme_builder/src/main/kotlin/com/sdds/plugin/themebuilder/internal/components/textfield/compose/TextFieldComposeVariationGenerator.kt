package com.sdds.plugin.themebuilder.internal.components.textfield.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.capitalized

/**
 * Генератор вариаций TextField на Compose
 */
internal class TextFieldComposeVariationGenerator(
    private val textFieldType: TextFieldType,
    private val chipGroupStylesPackage: String,
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
) : ComposeVariationGenerator<TextFieldProperties>(
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
    enum class TextFieldType {
        TextField,
        TextArea,
    }

    override val componentStyleName = "TextFieldStyle"

    override fun propsToBuilderCalls(
        props: TextFieldProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            indicatorAlignmentCall(props),
            dimensionsCall(props, variationId),
            captionStyleCall(props),
            labelStyleCall(props),
            valueStyleCall(props),
            prefixStyleCall(props),
            suffixStyleCall(props),
            placeholderStyleCall(props),
            counterStyleCall(props),
            optionalStyleCall(props),
            chipGroupStyleCall(props, ktFileBuilder),
            labelPlacementCall(props),
            captionPlacementCall(props),
            counterPlacementCall(props),
            colorsCall(props),
            fieldTypeCall(props),
            scrollBarCall(props, variationId),
        )
    }

    override fun KtFileBuilder.onAddImports() {
        addImport(
            "com.sdds.compose.uikit",
            listOf(
                "TextFieldType",
                "TextFieldLabelPlacement",
                "TextFieldHelperTextPlacement",
                "TextFieldIndicatorAlignmentMode",
            ),
        )
    }

    override fun invariantBuilderCalls() = listOf(singleLineCall())

    private fun indicatorAlignmentCall(props: TextFieldProperties): String? {
        return props.indicatorAlignmentMode?.let {
            ".indicatorAlignmentMode(TextFieldIndicatorAlignmentMode.${it.value.capitalized()})"
        }
    }

    private fun singleLineCall(): String {
        return when (textFieldType) {
            TextFieldType.TextField -> ".singleLine(true)"
            TextFieldType.TextArea -> ".singleLine(false)"
        }
    }

    private fun scrollBarCall(props: TextFieldProperties, variationId: String): String? {
        return if (textFieldType == TextFieldType.TextArea && props.hasScrollBar()) {
            buildString {
                appendLine(".scrollBar {")
                props.scrollBarThickness?.let {
                    appendDimension("scroll_bar_thickness", it, variationId)
                }
                props.scrollBarPaddingTop?.let {
                    appendDimension("scroll_bar_padding_top", it, variationId)
                }
                props.scrollBarPaddingBottom?.let {
                    appendDimension("scroll_bar_padding_bottom", it, variationId)
                }
                props.scrollBarPaddingEnd?.let {
                    appendDimension("scroll_bar_padding_end", it, variationId)
                }
                props.scrollBarTrackColor?.let {
                    appendLine(getColor("scrollBarTrackColor", it))
                }
                props.scrollBarThumbColor?.let {
                    appendLine(getColor("scrollBarThumbColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun TextFieldProperties.hasScrollBar(): Boolean {
        return scrollBarThickness != null ||
            scrollBarPaddingTop != null ||
            scrollBarPaddingBottom != null ||
            scrollBarPaddingEnd != null ||
            scrollBarTrackColor != null ||
            scrollBarThumbColor != null
    }

    private fun fieldTypeCall(props: TextFieldProperties): String? {
        return props.fieldType?.let {
            val enumValue = when {
                it.value.equals("requiredStart", ignoreCase = true) -> "RequiredStart"
                it.value.equals("requiredEnd", ignoreCase = true) -> "RequiredEnd"
                else -> null
            }
            return@let enumValue?.let { ".fieldType(TextFieldType.$enumValue)" }
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun TextFieldProperties.hasColors(): Boolean {
        return labelColor != null ||
            labelColorReadOnly != null ||
            optionalColor != null ||
            optionalColorReadOnly != null ||
            valueColor != null ||
            valueColorReadOnly != null ||
            placeholderColor != null ||
            placeholderColorReadOnly != null ||
            indicatorColor != null ||
            indicatorColorReadOnly != null ||
            startContentColor != null ||
            startContentColorReadOnly != null ||
            endContentColor != null ||
            endContentColorReadOnly != null ||
            captionColor != null ||
            captionColorReadOnly != null ||
            counterColor != null ||
            counterColorReadOnly != null ||
            backgroundColor != null ||
            backgroundColorReadOnly != null ||
            cursorColor != null ||
            cursorColorReadOnly != null ||
            dividerColor != null ||
            dividerColorReadOnly != null ||
            prefixColor != null ||
            suffixColor != null ||
            prefixColorReadOnly != null ||
            suffixColorReadOnly != null
    }

    @Suppress("LongMethod", "CyclomaticComplexMethod")
    private fun colorsCall(props: TextFieldProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                props.labelColorReadOnly?.let {
                    appendLine(getColor("labelColorReadOnly", it))
                }
                props.optionalColor?.let {
                    appendLine(getColor("optionalColor", it))
                }
                props.optionalColorReadOnly?.let {
                    appendLine(getColor("optionalColorReadOnly", it))
                }
                props.valueColor?.let {
                    appendLine(getColor("valueColor", it))
                }
                props.valueColorReadOnly?.let {
                    appendLine(getColor("valueColorReadOnly", it))
                }
                props.placeholderColor?.let {
                    appendLine(getColor("placeholderColor", it))
                }
                props.placeholderColorReadOnly?.let {
                    appendLine(getColor("placeholderColorReadOnly", it))
                }
                props.indicatorColor?.let {
                    appendLine(getColor("indicatorColor", it))
                }
                props.indicatorColorReadOnly?.let {
                    appendLine(getColor("indicatorColorReadOnly", it))
                }
                props.startContentColor?.let {
                    appendLine(getColor("startContentColor", it))
                }
                props.startContentColorReadOnly?.let {
                    appendLine(getColor("startContentColorReadOnly", it))
                }
                props.endContentColor?.let {
                    appendLine(getColor("endContentColor", it))
                }
                props.endContentColorReadOnly?.let {
                    appendLine(getColor("endContentColorReadOnly", it))
                }
                props.captionColor?.let {
                    appendLine(getColor("captionColor", it))
                }
                props.captionColorReadOnly?.let {
                    appendLine(getColor("captionColorReadOnly", it))
                }
                props.counterColor?.let {
                    appendLine(getColor("counterColor", it))
                }
                props.counterColorReadOnly?.let {
                    appendLine(getColor("counterColorReadOnly", it))
                }
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.backgroundColorReadOnly?.let {
                    appendLine(getColor("backgroundColorReadOnly", it))
                }
                props.cursorColor?.let {
                    appendLine(getColor("cursorColor", it))
                }
                props.cursorColorReadOnly?.let {
                    appendLine(getColor("cursorColorReadOnly", it))
                }
                props.dividerColor?.let {
                    appendLine(getColor("dividerColor", it))
                }
                props.dividerColorReadOnly?.let {
                    appendLine(getColor("dividerColorReadOnly", it))
                }
                props.prefixColor?.let {
                    appendLine(getColor("prefixColor", it))
                }
                props.suffixColor?.let {
                    appendLine(getColor("suffixColor", it))
                }
                props.prefixColorReadOnly?.let {
                    appendLine(getColor("prefixColorReadOnly", it))
                }
                props.suffixColorReadOnly?.let {
                    appendLine(getColor("suffixColorReadOnly", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun labelPlacementCall(props: TextFieldProperties): String? {
        return props.labelPlacement?.let {
            val enumValue = when {
                it.value.equals("inner", ignoreCase = true) -> "Inner"
                it.value.equals("outer", ignoreCase = true) -> "Outer"
                else -> "None"
            }
            ".labelPlacement(TextFieldLabelPlacement.$enumValue)"
        }
    }

    private fun captionPlacementCall(props: TextFieldProperties): String? {
        return props.captionPlacement?.let {
            val enumValue = when {
                it.value.equals("inner", ignoreCase = true) -> "Inner"
                it.value.equals("outer", ignoreCase = true) -> "Outer"
                else -> return@let null
            }
            ".captionPlacement(TextFieldHelperTextPlacement.$enumValue)"
        }
    }

    private fun counterPlacementCall(props: TextFieldProperties): String? {
        return props.counterPlacement?.let {
            val enumValue = when {
                it.value.equals("inner", ignoreCase = true) -> "Inner"
                it.value.equals("outer", ignoreCase = true) -> "Outer"
                else -> return@let null
            }
            ".counterPlacement(TextFieldHelperTextPlacement.$enumValue)"
        }
    }

    private fun chipGroupStyleCall(
        props: TextFieldProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.chipGroupStyle?.let {
            ".chipGroupStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    chipGroupStylesPackage,
                )
            }.style())"
        }
    }

    private fun shapeCall(props: TextFieldProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    @Suppress("LongMethod", "CyclomaticComplexMethod")
    private fun dimensionsCall(
        props: TextFieldProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.boxPaddingStart?.let {
                    appendDimension("box_padding_start", it, variationId)
                }
                props.boxPaddingEnd?.let {
                    appendDimension("box_padding_end", it, variationId)
                }
                props.boxPaddingTop?.let {
                    appendDimension("box_padding_top", it, variationId)
                }
                props.boxPaddingBottom?.let {
                    appendDimension("box_padding_bottom", it, variationId)
                }
                props.boxMinHeight?.let {
                    appendDimension("box_min_height", it, variationId)
                }
                props.alignmentMinHeight?.let {
                    appendDimension("alignment_line_height", it, variationId)
                }
                props.labelPadding?.let {
                    appendDimension("label_padding", it, variationId)
                }
                props.optionalPadding?.let {
                    appendDimension("optional_padding", it, variationId)
                }
                props.helperTextPadding?.let {
                    appendDimension("helper_text_padding", it, variationId)
                }
                props.startContentPadding?.let {
                    appendDimension("start_content_padding", it, variationId)
                }
                props.endContentPadding?.let {
                    appendDimension("end_content_padding", it, variationId)
                }
                props.chipsPadding?.let {
                    appendDimension("chips_padding", it, variationId)
                }
                props.chipsPaddingTop?.let {
                    appendDimension("chips_padding_top", it, variationId)
                }
                props.chipsPaddingBottom?.let {
                    appendDimension("chips_padding_bottom", it, variationId)
                }
                props.chipsPaddingStart?.let {
                    appendDimension("chips_padding_start", it, variationId)
                }
                props.chipsPaddingEnd?.let {
                    appendDimension("chips_padding_end", it, variationId)
                }
                props.startContentSize?.let {
                    appendDimension("start_content_size", it, variationId)
                }
                props.endContentSize?.let {
                    appendDimension("end_content_size", it, variationId)
                }
                if (props.hasIndicatorDimensions()) {
                    append(
                        buildString {
                            appendLine("indicatorDimensions {")
                            props.indicatorOffsetX?.let {
                                appendDimension("horizontal_padding", it, variationId)
                            }
                            props.indicatorOffsetY?.let {
                                appendDimension("vertical_padding", it, variationId)
                            }
                            props.indicatorSize?.let {
                                appendDimension("indicator_size", it, variationId)
                            }
                            appendLine("}")
                        },
                    )
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun captionStyleCall(props: TextFieldProperties): String? {
        return props.captionStyle?.let {
            getTypography("captionStyle", it)
        }
    }

    private fun optionalStyleCall(props: TextFieldProperties): String? {
        return props.optionalStyle?.let {
            getTypography("optionalStyle", it)
        }
    }

    private fun counterStyleCall(props: TextFieldProperties): String? {
        return props.counterStyle?.let {
            getTypography("counterStyle", it)
        }
    }

    private fun labelStyleCall(props: TextFieldProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun valueStyleCall(props: TextFieldProperties): String? {
        return props.valueStyle?.let {
            getTypography("valueStyle", it)
        }
    }

    private fun prefixStyleCall(props: TextFieldProperties): String? {
        return props.prefixStyle?.let {
            getTypography("prefixStyle", it)
        }
    }

    private fun suffixStyleCall(props: TextFieldProperties): String? {
        return props.suffixStyle?.let {
            getTypography("suffixStyle", it)
        }
    }

    private fun placeholderStyleCall(props: TextFieldProperties): String? {
        return props.placeholderStyle?.let {
            getTypography("placeholderStyle", it)
        }
    }

    private fun TextFieldProperties.hasIndicatorDimensions(): Boolean {
        return indicatorSize != null ||
            indicatorOffsetX != null ||
            indicatorOffsetY != null
    }

    @Suppress("CyclomaticComplexMethod")
    private fun TextFieldProperties.hasDimensions(): Boolean {
        return boxPaddingStart != null ||
            boxPaddingEnd != null ||
            boxPaddingTop != null ||
            boxPaddingBottom != null ||
            boxMinHeight != null ||
            alignmentMinHeight != null ||
            chipsPadding != null ||
            chipsPaddingStart != null ||
            chipsPaddingEnd != null ||
            chipsPaddingTop != null ||
            chipsPaddingBottom != null ||
            labelPadding != null ||
            optionalPadding != null ||
            indicatorSize != null ||
            indicatorOffsetX != null ||
            indicatorOffsetY != null ||
            startContentSize != null ||
            startContentPadding != null ||
            endContentSize != null ||
            endContentPadding != null ||
            helperTextPadding != null ||
            dividerHeight != null
    }
}
