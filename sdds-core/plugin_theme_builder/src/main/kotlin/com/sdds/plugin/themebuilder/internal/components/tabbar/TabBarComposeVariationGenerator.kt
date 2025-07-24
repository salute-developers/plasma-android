package com.sdds.plugin.themebuilder.internal.components.tabbar

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class TabBarComposeVariationGenerator(
    private val tabBarItemStylesPackage: String,
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
) : ComposeVariationGenerator<TabBarProperties>(
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
    override val componentStyleName: String = "TabBarStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("com.sdds.compose.uikit", listOf("TabBarLabelPlacement"))
    }

    override fun propsToBuilderCalls(
        props: TabBarProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            topShapeCall(props, variationId),
            bottomShapeCall(props, variationId),
            shadowCall(props),
            colorsCall(props),
            dimensionsCall(props, variationId),
            tabBarItemStyleCall(props, ktFileBuilder),
        )
    }

    private fun shadowCall(props: TabBarProperties): String? {
        return props.shadow?.let {
            getShadow(it)
        }
    }

    private fun tabBarItemStyleCall(
        props: TabBarProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.tabBarItemStyle?.let {
            ".tabBarItemStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    tabBarItemStylesPackage,
                )
            }.style())"
        }
    }

    private fun topShapeCall(props: TabBarProperties, variationId: String): String? {
        return props.topShape?.let {
            getShape(it, variationId, "topShape")
        }
    }

    private fun bottomShapeCall(props: TabBarProperties, variationId: String): String? {
        return props.bottomShape?.let {
            getShape(it, variationId, "bottomShape")
        }
    }

    private fun colorsCall(props: TabBarProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getColor("backgroundColor", it))
                }
                props.dividerColor?.let {
                    appendLine(getColor("dividerColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: TabBarProperties,
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
                props.contentPaddingStart?.let {
                    appendDimension("content_padding_start", it, variationId)
                }
                props.contentPaddingEnd?.let {
                    appendDimension("content_padding_end", it, variationId)
                }
                props.contentPaddingTop?.let {
                    appendDimension("content_padding_top", it, variationId)
                }
                props.contentPaddingBottom?.let {
                    appendDimension("content_padding_bottom", it, variationId)
                }
                props.itemSpacing?.let {
                    appendDimension("item_spacing", it, variationId)
                }
                props.dividerThickness?.let {
                    appendDimension("divider_thickness", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun TabBarProperties.hasDimensions(): Boolean {
        return paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            contentPaddingStart != null ||
            contentPaddingEnd != null ||
            contentPaddingTop != null ||
            contentPaddingBottom != null ||
            itemSpacing != null ||
            dividerThickness != null
    }

    private fun TabBarProperties.hasColors() =
        backgroundColor != null || dividerColor != null
}
