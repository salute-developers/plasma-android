package com.sdds.plugin.themebuilder.internal.components.select.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.select.SelectItemProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class SelectItemComposeVariationGenerator(
    private val cellStylesPackage: String,
    private val checkboxStylesPackage: String,
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
) : ComposeVariationGenerator<SelectItemProperties>(
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

    override val componentStyleName: String = "SelectItemStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport(
            "com.sdds.compose.uikit",
            listOf(
                "SelectItemType",
            ),
        )
    }

    override fun propsToBuilderCalls(
        props: SelectItemProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        disableAlphaCall(props),
        iconCall(props),
        itemTypeCall(props),
        cellStyleCall(props, ktFileBuilder),
        checkboxStyleCall(props, ktFileBuilder),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun shapeCall(props: SelectItemProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId, "shape")
        }
    }

    private fun disableAlphaCall(props: SelectItemProperties): String? {
        return props.disableAlpha?.let {
            ".disableAlpha(${it.value}f)"
        }
    }

    private fun itemTypeCall(props: SelectItemProperties): String? {
        return props.itemType?.let {
            val enumValue = when {
                it.value.equals("single", ignoreCase = true) -> "Single"
                it.value.equals("multiple", ignoreCase = true) -> "Multiple"
                else -> throw ThemeBuilderException("Unknown itemType ${it.value} for SelectItem")
            }
            ".itemType(SelectItemType.$enumValue)"
        }
    }

    private fun iconCall(props: SelectItemProperties): String? {
        return props.icon?.let {
            getIconAsDrawableRes("icon", it)
        }
    }

    private fun dimensionsCall(
        props: SelectItemProperties,
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
                props.controlMargin?.let {
                    appendDimension("control_margin", it, variationId)
                }
                props.controlSize?.let {
                    appendDimension("control_size", it, variationId)
                }
                props.height?.let {
                    appendDimension("height", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun SelectItemProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            controlMargin != null ||
            controlSize != null ||
            height != null
    }

    private fun colorsCall(props: SelectItemProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.iconColor?.let {
                    appendLine(getColor("iconColor", it))
                }
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun SelectItemProperties.hasColors(): Boolean {
        return iconColor != null || backgroundColor != null
    }

    private fun cellStyleCall(
        props: SelectItemProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.cellStyle?.let {
            ".cellStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    cellStylesPackage,
                )
            }.style())"
        }
    }

    private fun checkboxStyleCall(
        props: SelectItemProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.checkboxStyle?.let {
            ".checkboxStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    checkboxStylesPackage,
                )
            }.style())"
        }
    }
}
