package com.sdds.plugin.themebuilder.internal.components.wheel.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.wheel.WheelProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class WheelComposeVariationGenerator(
    private val dividerStylesPackage: String,
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
) : ComposeVariationGenerator<WheelProperties>(
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

    override val componentStyleName: String = "WheelStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport(
            "com.sdds.compose.uikit",
            listOf(
                "WheelAlignment",
            ),
        )
    }

    override fun propsToBuilderCalls(
        props: WheelProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        controlIconUpCall(props),
        controlIconDownCall(props),
        itemTextStyleCall(props),
        itemTextAfterStyleCall(props),
        descriptionStyleCall(props),
        itemAlignmentCall(props),
        wheelCountCall(props),
        visibleItemsCountCall(props),
        dividerStyleCall(props, ktFileBuilder),
        colorsCall(props),
        dimensionsCall(props, variationId),
    )

    private fun controlIconUpCall(props: WheelProperties): String? {
        return props.controlIconUp?.let {
            getIconAsDrawableRes("controlIconUp", it)
        }
    }

    private fun wheelCountCall(props: WheelProperties): String? {
        return props.wheelCount?.let {
            ".wheelCount(${it.value})"
        }
    }

    private fun visibleItemsCountCall(props: WheelProperties): String? {
        return props.visibleItemsCount?.let {
            ".visibleItemsCount(${it.value})"
        }
    }

    private fun controlIconDownCall(props: WheelProperties): String? {
        return props.controlIconDown?.let {
            getIconAsDrawableRes("controlIconDown", it)
        }
    }

    private fun itemTextStyleCall(props: WheelProperties): String? {
        return props.itemTextStyle?.let {
            getTypography("itemTextStyle", it)
        }
    }

    private fun itemTextAfterStyleCall(props: WheelProperties): String? {
        return props.itemTextAfterStyle?.let {
            getTypography("itemTextAfterStyle", it)
        }
    }

    private fun descriptionStyleCall(props: WheelProperties): String? {
        return props.descriptionStyle?.let {
            getTypography("descriptionStyle", it)
        }
    }

    private fun colorsCall(props: WheelProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.itemTextColor?.let {
                    appendLine(getColor("itemTextColor", it))
                }
                props.itemTextAfterColor?.let {
                    appendLine(getColor("itemTextAfterColor", it))
                }
                props.descriptionColor?.let {
                    appendLine(getColor("descriptionColor", it))
                }
                props.controlIconUpColor?.let {
                    appendLine(getColor("controlIconUpColor", it))
                }
                props.controlIconDownColor?.let {
                    appendLine(getColor("controlIconDownColor", it))
                }
                props.separatorColor?.let {
                    appendLine(getColor("separatorColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dividerStyleCall(
        props: WheelProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.dividerStyle?.let {
            ".dividerStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    dividerStylesPackage,
                )
            }.style())"
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun dimensionsCall(
        props: WheelProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.itemTextAfterPadding?.let {
                    appendDimension("item_text_after_padding", it, variationId)
                }
                props.descriptionPadding?.let {
                    appendDimension("description_padding", it, variationId)
                }
                props.separatorSpacing?.let {
                    appendDimension("separator_spacing", it, variationId)
                }
                props.itemMinSpacing?.let {
                    appendDimension("item_min_spacing", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun WheelProperties.hasDimensions(): Boolean {
        return itemTextAfterPadding != null ||
            descriptionPadding != null ||
            separatorSpacing != null ||
            itemMinSpacing != null
    }

    private fun WheelProperties.hasColors() =
        controlIconUpColor != null ||
            controlIconDownColor != null ||
            itemTextColor != null ||
            itemTextAfterColor != null ||
            descriptionColor != null ||
            separatorColor != null

    private fun itemAlignmentCall(props: WheelProperties): String? {
        return props.itemAlignment?.let {
            val enumValue = when {
                it.value.equals("start", ignoreCase = true) -> "Start"
                it.value.equals("center", ignoreCase = true) -> "Center"
                it.value.equals("end", ignoreCase = true) -> "End"
                it.value.equals("mixed", ignoreCase = true) -> "Mixed"
                else -> "Center"
            }
            ".itemAlignment(WheelAlignment.$enumValue)"
        }
    }
}
