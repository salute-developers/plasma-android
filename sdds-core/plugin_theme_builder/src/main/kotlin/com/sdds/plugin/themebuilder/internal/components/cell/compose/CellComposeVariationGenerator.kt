package com.sdds.plugin.themebuilder.internal.components.cell.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.cell.CellProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.squareup.kotlinpoet.ClassName

internal class CellComposeVariationGenerator(
    private val avatarStylesPackage: String,
    private val iconButtonStylesPackage: String,
    private val checkBoxStylesPackage: String,
    private val radioBoxStylesPackage: String,
    private val switchStylesPackage: String,
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
) : ComposeVariationGenerator<CellProperties>(
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
        props: CellProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            labelStyleCall(props),
            titleStyleCall(props),
            subtitleStyleCall(props),
            disclosureTextStyleCall(props),
            disclosureIconCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
            avatarStyleCall(props, ktFileBuilder),
            iconButtonStyleCall(props, ktFileBuilder),
            checkBoxStyleCall(props, ktFileBuilder),
            radioBoxStyleCall(props, ktFileBuilder),
            switchStyleCall(props, ktFileBuilder),
        )
    }

    override fun KtFileBuilder.onAddImports() {
        addImport(ClassName("com.sdds.compose.uikit", "Avatar"))
        addImport(ClassName("com.sdds.compose.uikit", "CheckBox"))
        addImport(ClassName("com.sdds.compose.uikit", "RadioBox"))
        addImport(ClassName("com.sdds.compose.uikit", "IconButton"))
        addImport(ClassName("com.sdds.compose.uikit", "Switch"))
    }

    private fun avatarStyleCall(props: CellProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.avatarStyle?.let {
            ".avatarStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    avatarStylesPackage,
                )
            }.style())"
        }
    }

    private fun iconButtonStyleCall(props: CellProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.iconButtonStyle?.let {
            ".iconButtonStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    iconButtonStylesPackage,
                )
            }.style())"
        }
    }

    private fun checkBoxStyleCall(props: CellProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.checkBoxStyle?.let {
            ".checkBoxStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    checkBoxStylesPackage,
                )
            }.style())"
        }
    }

    private fun radioBoxStyleCall(props: CellProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.radioBoxStyle?.let {
            ".radioBoxStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    radioBoxStylesPackage,
                )
            }.style())"
        }
    }

    private fun switchStyleCall(props: CellProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.switchStyle?.let {
            ".switchStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    switchStylesPackage,
                )
            }.style())"
        }
    }

    private fun dimensionsCall(
        props: CellProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.contentPaddingStart?.let {
                    appendDimension("content_padding_start", it, variationId)
                }
                props.contentPaddingEnd?.let {
                    appendDimension("content_padding_end", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CellProperties.hasDimensions(): Boolean {
        return contentPaddingStart != null ||
            contentPaddingEnd != null
    }

    private fun colorsCall(props: CellProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it))
                }
                props.titleColor?.let {
                    appendLine(getColor("titleColor", it))
                }
                props.subtitleColor?.let {
                    appendLine(getColor("subtitleColor", it))
                }
                props.disclosureTextColor?.let {
                    appendLine(getColor("disclosureTextColor", it))
                }
                props.disclosureIconColor?.let {
                    appendLine(getColor("disclosureIconColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun CellProperties.hasColors(): Boolean {
        return labelColor != null ||
            titleColor != null ||
            subtitleColor != null ||
            disclosureIconColor != null ||
            disclosureTextColor != null
    }

    private fun labelStyleCall(props: CellProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun titleStyleCall(props: CellProperties): String? {
        return props.titleStyle?.let {
            getTypography("titleStyle", it)
        }
    }

    private fun subtitleStyleCall(props: CellProperties): String? {
        return props.subtitleStyle?.let {
            getTypography("subtitleStyle", it)
        }
    }

    private fun disclosureTextStyleCall(props: CellProperties): String? {
        return props.disclosureTextStyle?.let {
            getTypography("disclosureTextStyle", it)
        }
    }

    private fun disclosureIconCall(props: CellProperties): String? {
        return props.disclosureIcon?.let {
            getIcon("disclosureIcon", it)
        }
    }
}
