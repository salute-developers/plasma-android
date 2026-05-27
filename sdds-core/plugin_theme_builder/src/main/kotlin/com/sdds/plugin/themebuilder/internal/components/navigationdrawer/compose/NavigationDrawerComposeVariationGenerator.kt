package com.sdds.plugin.themebuilder.internal.components.navigationdrawer.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.navigationdrawer.NavigationDrawerProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class NavigationDrawerComposeVariationGenerator(
    private val itemStylesPackage: String,
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
) : ComposeVariationGenerator<NavigationDrawerProperties>(
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
    override val componentStyleName: String = "NavigationDrawerStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
        addImport("com.sdds.compose.uikit", listOf("NavigationDrawerValue"))
    }

    override fun getCustomState(state: String): String {
        return when (state) {
            "expanded" -> "NavigationDrawerValue.Expanded"
            "collapsed" -> "NavigationDrawerValue.Collapsed"
            else -> throw IllegalStateException("Unknown state $state for CheckBox")
        }
    }

    override fun propsToBuilderCalls(
        props: NavigationDrawerProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        props.shape?.let { getShape(it, variationId) },
        props.shadow?.let { getShadow(it) },
        colorsCall(props),
        dimensionsCall(props, variationId),
        itemStyleCall(props, ktFileBuilder),
    )

    private fun colorsCall(props: NavigationDrawerProperties): String? {
        return if (props.backgroundColor != null || props.selectorColor != null) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("backgroundColor", it))
                }
                props.selectorColor?.let {
                    appendLine(getGradientOrWrappedColor("selectorColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: NavigationDrawerProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.width?.let { appendDimension("width", it, variationId) }
                props.paddingStart?.let { appendDimension("padding_start", it, variationId) }
                props.paddingEnd?.let { appendDimension("padding_end", it, variationId) }
                props.paddingTop?.let { appendDimension("padding_top", it, variationId) }
                props.paddingBottom?.let { appendDimension("padding_bottom", it, variationId) }
                props.itemSpacing?.let { appendDimension("item_spacing", it, variationId) }
                props.headerSpacing?.let { appendDimension("header_spacing", it, variationId) }
                props.footerSpacing?.let { appendDimension("footer_spacing", it, variationId) }
                props.selectorPaddingStart?.let { appendDimension("selector_padding_start", it, variationId) }
                props.selectorPaddingEnd?.let { appendDimension("selector_padding_end", it, variationId) }
                append("}")
            }
        } else {
            null
        }
    }

    private fun itemStyleCall(
        props: NavigationDrawerProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.itemStyle?.let {
            ".itemStyle(${it.value.getComponentStyle(ktFileBuilder, itemStylesPackage)}.style())"
        }
    }

    private fun NavigationDrawerProperties.hasDimensions(): Boolean {
        return width != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            itemSpacing != null ||
            headerSpacing != null ||
            footerSpacing != null ||
            selectorPaddingStart != null ||
            selectorPaddingEnd != null
    }
}
