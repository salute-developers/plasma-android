package com.sdds.plugin.themebuilder.internal.components.navigationdrawer.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.navigationdrawer.NavigationDrawerItemProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class NavigationDrawerItemComposeVariationGenerator(
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
) : ComposeVariationGenerator<NavigationDrawerItemProperties>(
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
    override val componentStyleName: String = "NavigationDrawerItemStyle"

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
        props: NavigationDrawerItemProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        props.shape?.let { getShape(it, variationId) },
        textStyleCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        badgeStyleCall(props, ktFileBuilder),
        counterStyleCall(props, ktFileBuilder),
    )

    private fun textStyleCall(props: NavigationDrawerItemProperties): String? {
        return props.titleStyle?.let { getTypography("titleStyle", it) }
    }

    private fun colorsCall(props: NavigationDrawerItemProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let { appendLine(getGradientOrWrappedColor("backgroundColor", it)) }
                props.titleColor?.let { appendLine(getColor("titleColor", it)) }
                props.iconColor?.let { appendLine(getGradientOrWrappedColor("iconColor", it)) }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: NavigationDrawerItemProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.minHeight?.let { appendDimension("min_height", it, variationId) }
                props.iconSize?.let { appendDimension("icon_size", it, variationId) }
                props.indicatorOffsetX?.let { appendDimension("indicator_offset_x", it, variationId) }
                props.indicatorOffsetY?.let { appendDimension("indicator_offset_y", it, variationId) }
                props.paddingStart?.let { appendDimension("padding_start", it, variationId) }
                props.paddingEnd?.let { appendDimension("padding_end", it, variationId) }
                props.paddingTop?.let { appendDimension("padding_top", it, variationId) }
                props.paddingBottom?.let { appendDimension("padding_bottom", it, variationId) }
                props.contentPaddingStart?.let { appendDimension("content_padding_start", it, variationId) }
                props.contentPaddingEnd?.let { appendDimension("content_padding_end", it, variationId) }
                append("}")
            }
        } else {
            null
        }
    }

    private fun badgeStyleCall(
        props: NavigationDrawerItemProperties,
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

    private fun counterStyleCall(
        props: NavigationDrawerItemProperties,
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

    private fun NavigationDrawerItemProperties.hasColors(): Boolean {
        return backgroundColor != null ||
            titleColor != null ||
            iconColor != null
    }

    private fun NavigationDrawerItemProperties.hasDimensions(): Boolean {
        return minHeight != null ||
            iconSize != null ||
            indicatorOffsetX != null ||
            indicatorOffsetY != null ||
            paddingStart != null ||
            paddingEnd != null ||
            paddingTop != null ||
            paddingBottom != null ||
            contentPaddingStart != null ||
            contentPaddingEnd != null
    }
}
