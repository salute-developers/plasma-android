package com.sdds.plugin.themebuilder.internal.components.form.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.form.FormItemProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class FormItemComposeVariationGenerator(
    private val indicatorStylesPackage: String,
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
) : ComposeVariationGenerator<FormItemProperties>(
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

    override val componentStyleName: String = "FormItemStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport(
            "com.sdds.compose.uikit",
            listOf(
                "FormTitlePlacement",
                "FormBottomTextAlignment",
                "FormIndicatorAlignment",
                "IndicatorMode",
                "FormType",
            ),
        )
    }

    override fun propsToBuilderCalls(
        props: FormItemProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        disableAlphaCall(props),
        hintIconCall(props),
        titleStyleCall(props),
        captionStyleCall(props),
        titleCaptionStyleCall(props),
        counterStyleCall(props),
        optionalStyleCall(props),
        titlePlacementCall(props),
        bottomTextAlignmentCall(props),
        indicatorAlignmentCall(props),
        indicatorModeCall(props),
        formTypeCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        indicatorStyleCall(props, ktFileBuilder),
    )

    private fun disableAlphaCall(props: FormItemProperties): String? {
        return props.disableAlpha?.let {
            ".disableAlpha(${it.value}f)"
        }
    }

    private fun hintIconCall(props: FormItemProperties): String? {
        return props.hintIcon?.let {
            getIconAsDrawableRes("hintIcon", it)
        }
    }

    private fun titleStyleCall(props: FormItemProperties): String? {
        return props.titleStyle?.let {
            getTypography("titleStyle", it)
        }
    }

    private fun captionStyleCall(props: FormItemProperties): String? {
        return props.captionStyle?.let {
            getTypography("captionStyle", it)
        }
    }

    private fun titleCaptionStyleCall(props: FormItemProperties): String? {
        return props.titleCaptionStyle?.let {
            getTypography("titleCaptionStyle", it)
        }
    }

    private fun counterStyleCall(props: FormItemProperties): String? {
        return props.counterStyle?.let {
            getTypography("counterStyle", it)
        }
    }

    private fun optionalStyleCall(props: FormItemProperties): String? {
        return props.optionalStyle?.let {
            getTypography("optionalStyle", it)
        }
    }

    private fun colorsCall(props: FormItemProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.hintColor?.let {
                    appendLine(getColor("hintColor", it))
                }
                props.optionalColor?.let {
                    appendLine(getColor("optionalColor", it))
                }
                props.captionColor?.let {
                    appendLine(getColor("captionColor", it))
                }
                props.titleCaptionColor?.let {
                    appendLine(getColor("titleCaptionColor", it))
                }
                props.titleColor?.let {
                    appendLine(getColor("titleColor", it))
                }
                props.counterColor?.let {
                    appendLine(getColor("counterColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun indicatorStyleCall(
        props: FormItemProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.indicatorStyle?.let {
            ".indicatorStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    indicatorStylesPackage,
                )
            }.style())"
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun dimensionsCall(
        props: FormItemProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.hintHeight?.let {
                    appendDimension("hint_height", it, variationId)
                }
                props.hintWidth?.let {
                    appendDimension("hint_width", it, variationId)
                }
                props.titleBlockPadding?.let {
                    appendDimension("title_block_padding", it, variationId)
                }
                props.titleBlockSpacing?.let {
                    appendDimension("title_block_spacing", it, variationId)
                }
                props.titleBlockWidth?.let {
                    appendDimension("title_block_width", it, variationId)
                }
                props.titleCaptionPadding?.let {
                    appendDimension("title_caption_padding", it, variationId)
                }
                props.indicatorOffsetX?.let {
                    appendDimension("indicator_offset_x", it, variationId)
                }
                props.indicatorOffsetY?.let {
                    appendDimension("indicator_offset_y", it, variationId)
                }
                props.captionPadding?.let {
                    appendDimension("caption_padding", it, variationId)
                }
                props.counterPadding?.let {
                    appendDimension("counter_padding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun FormItemProperties.hasDimensions(): Boolean {
        return hintHeight != null ||
            hintWidth != null ||
            titleBlockPadding != null ||
            titleBlockSpacing != null ||
            titleBlockWidth != null ||
            titleCaptionPadding != null ||
            indicatorOffsetX != null ||
            indicatorOffsetY != null ||
            captionPadding != null ||
            counterPadding != null
    }

    private fun FormItemProperties.hasColors() =
        hintColor != null ||
            captionColor != null ||
            optionalColor != null ||
            titleCaptionColor != null ||
            counterColor != null ||
            titleColor != null

    private fun titlePlacementCall(props: FormItemProperties): String? {
        return props.titlePlacement?.let {
            val enumValue = when {
                it.value.equals("title-start", ignoreCase = true) -> "Start"
                it.value.equals("title-top", ignoreCase = true) -> "Top"
                else -> "None"
            }
            ".titlePlacement(FormTitlePlacement.$enumValue)"
        }
    }

    private fun bottomTextAlignmentCall(props: FormItemProperties): String? {
        return props.bottomTextAlignment?.let {
            val enumValue = when {
                it.value.equals("center", ignoreCase = true) -> "Center"
                it.value.equals("edge", ignoreCase = true) -> "Edge"
                else -> throw ThemeBuilderException("Unknown bottomTextAlignment ${it.value} for FormItem")
            }
            ".bottomTextAlignment(FormBottomTextAlignment.$enumValue)"
        }
    }

    private fun indicatorAlignmentCall(props: FormItemProperties): String? {
        return props.indicatorAlignment?.let {
            val enumValue = when {
                it.value.equals("top-start", ignoreCase = true) -> "TopStart"
                it.value.equals("top-center", ignoreCase = true) -> "TopCenter"
                it.value.equals("top-end", ignoreCase = true) -> "TopEnd"
                it.value.equals("center-start", ignoreCase = true) -> "CenterStart"
                it.value.equals("center", ignoreCase = true) -> "Center"
                it.value.equals("center-end", ignoreCase = true) -> "CenterEnd"
                it.value.equals("bottom-start", ignoreCase = true) -> "BottomStart"
                it.value.equals("bottom-center", ignoreCase = true) -> "BottomCenter"
                it.value.equals("bottom-end", ignoreCase = true) -> "BottomEnd"
                else -> throw ThemeBuilderException("Unknown indicatorAlignment ${it.value} for FormItem")
            }
            ".indicatorAlignment(FormIndicatorAlignment.$enumValue)"
        }
    }

    private fun indicatorModeCall(props: FormItemProperties): String? {
        return props.indicatorAlignmentMode?.let {
            val enumValue = when {
                it.value.equals("inner", ignoreCase = true) -> "Inner"
                it.value.equals("outer", ignoreCase = true) -> "Outer"
                else -> throw ThemeBuilderException("Unknown indicatorAlignmentMode ${it.value} for FormItem")
            }
            ".indicatorAlignmentMode(IndicatorMode.$enumValue)"
        }
    }

    private fun formTypeCall(props: FormItemProperties): String? {
        return props.formItemType?.let {
            val enumValue = when {
                it.value.equals("required", ignoreCase = true) -> "Required"
                it.value.equals("optional", ignoreCase = true) -> "Optional"
                else -> throw ThemeBuilderException("Unknown formItemType ${it.value} for FormItem")
            }
            ".formItemType(FormType.$enumValue)"
        }
    }
}
