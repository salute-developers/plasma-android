package com.sdds.plugin.themebuilder.internal.components.tabbar.item

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class TabBarItemComposeVariationGenerator(
    private val indicatorStylesPackage: String,
    private val badgeStylesPackage: String,
    private val counterStylesPackage: String,
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
) : ComposeVariationGenerator<TabBarItemProperties>(
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
    override val componentStyleName: String = "TabBarItemStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("com.sdds.compose.uikit", listOf("TabBarLabelPlacement"))
    }

    override fun propsToBuilderCalls(
        props: TabBarItemProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            shapeCall(props, variationId),
            labelStyleCall(props),
            labelPlacementCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
            indicatorStyleCall(props, ktFileBuilder),
            counterStyleCall(props, ktFileBuilder),
            badgeStyleCall(props, ktFileBuilder),
        )
    }

    private fun labelStyleCall(props: TabBarItemProperties): String? {
        return props.labelStyle?.let {
            getTypography("labelStyle", it)
        }
    }

    private fun labelPlacementCall(props: TabBarItemProperties): String? {
        return props.labelPlacement?.let {
            val enumValue = when {
                it.value.equals("none", ignoreCase = true) -> "None"
                else -> "Bottom"
            }
            ".labelPlacement(TabBarLabelPlacement.$enumValue)"
        }
    }

    private fun indicatorStyleCall(
        props: TabBarItemProperties,
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

    private fun counterStyleCall(
        props: TabBarItemProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.counterStyle?.let {
            ".counterStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    counterStylesPackage,
                )
            }.style())"
        }
    }

    private fun badgeStyleCall(
        props: TabBarItemProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.badgeStyle?.let {
            ".badgeStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    badgeStylesPackage,
                )
            }.style())"
        }
    }

    private fun shapeCall(props: TabBarItemProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun colorsCall(props: TabBarItemProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it, forceStatefulSuffix = true))
                }
                props.labelColor?.let {
                    appendLine(getColor("labelColor", it, forceStatefulSuffix = true))
                }
                props.iconColor?.let {
                    appendLine(getColor("iconColor", it, forceStatefulSuffix = true))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: TabBarItemProperties,
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
                props.labelPadding?.let {
                    appendDimension("label_padding", it, variationId)
                }
                props.iconSize?.let {
                    appendDimension("icon_size", it, variationId)
                }
                props.minHeight?.let {
                    appendDimension("min_height", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun TabBarItemProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            labelPadding != null ||
            iconSize != null ||
            minHeight != null
    }

    private fun TabBarItemProperties.hasColors() =
        backgroundColor != null ||
            labelColor != null ||
            iconColor != null
}
