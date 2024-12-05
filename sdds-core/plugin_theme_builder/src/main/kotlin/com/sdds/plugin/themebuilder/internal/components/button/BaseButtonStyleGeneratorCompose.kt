package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.ComposeComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

/**
 * Базовый класс для генераторов стилей кнопок (Basic/Icon/Link)
 * @see ComposeComponentStyleGenerator
 */
internal abstract class BaseButtonStyleGeneratorCompose<T : ComponentConfig>(
    private val themeClassName: String,
    themePackage: String,
    dimensionsConfig: DimensionsConfig,
    dimensAggregator: DimensAggregator,
    resourceReferenceProvider: ResourceReferenceProvider,
    namespace: String,
    ktFileBuilderFactory: KtFileBuilderFactory,
    componentPackage: String,
    outputLocation: KtFileBuilder.OutputLocation,
) : ComposeComponentStyleGenerator<T>(
    themeClassName = themeClassName,
    themePackage = themePackage,
    dimensionsConfig = dimensionsConfig,
    dimensAggregator = dimensAggregator,
    resourceReferenceProvider = resourceReferenceProvider,
    namespace = namespace,
    ktFileBuilderFactory = ktFileBuilderFactory,
    componentPackage = componentPackage,
    outputLocation = outputLocation,
) {
    override fun addCode(config: T, ktFileBuilder: KtFileBuilder) {
        ktFileBuilder.addImport(
            packageName = "com.sdds.compose.uikit",
            names = listOf("Button"),
        )
    }

    protected fun ButtonComponentConfig.Size.getHeight(size: String): String {
        return getDimension("height", height, size)
    }

    protected fun ButtonComponentConfig.Size.getPaddingStart(size: String): String {
        return getDimension("padding_start", paddingStart, size)
    }

    protected fun ButtonComponentConfig.Size.getPaddingEnd(size: String): String {
        return getDimension("padding_end", paddingEnd, size)
    }

    protected fun ButtonComponentConfig.Size.getMinWidth(size: String): String {
        return getDimension("min_width", minWidth, size)
    }

    protected fun ButtonComponentConfig.Size.getIconSize(size: String): String {
        return getDimension("icon_size", iconSize, size)
    }

    protected fun ButtonComponentConfig.Size.getSpinnerSize(size: String): String {
        return getDimension("spinner_size", spinnerSize, size)
    }

    protected fun ButtonComponentConfig.Size.getIconMargin(size: String): String {
        return getDimension("icon_margin", iconMargin ?: 0f, size)
    }

    protected fun ButtonComponentConfig.Size.getValueMargin(size: String): String {
        return getDimension("value_margin", valueMargin ?: 0f, size)
    }

    protected fun ButtonComponentConfig.Size.shapeAdjustmentIfNeed(size: String): String {
        return shape?.adjustment?.let {
            ".adjustBy(all = ${getShapeAdjustment(size)})"
        }.orEmpty()
    }

    private fun ButtonComponentConfig.Size.getShapeAdjustment(size: String): String {
        return getDimension(
            dimenName = "shapeAdjustment",
            dimenValue = shape?.adjustment ?: 0f,
            size = size,
        )
    }

    private fun getLoadingAlpha(
        colorData: ButtonComponentConfig.ColorScheme,
        invariant: ButtonComponentConfig.Invariant?,
    ): String {
        return (
            colorData.loadingAlpha?.toString()
                ?: invariant?.loadingAlpha?.toString()
                ?: "0"
            ) + "f"
    }

    protected fun ButtonComponentConfig.ColorScheme.getBackgroundColor(
        invariant: ButtonComponentConfig.Invariant?,
    ): String {
        val bgColor = backgroundColor ?: invariant?.backgroundColor
        return bgColor?.let {
            "backgroundColor($themeClassName.colors.${bgColor.default.toKtTokenName()}" +
                ".${it.asInteractiveFragment})\n"
        }.orEmpty()
    }

    protected fun ButtonComponentConfig.ColorScheme.getContentColor(): String {
        return "contentColor($themeClassName.colors.${contentColor.default.toKtTokenName()}" +
            ".${contentColor.asInteractiveFragment})\n"
    }

    protected fun ButtonComponentConfig.ColorScheme.getValueColor(): String {
        return valueColor?.let {
            "valueColor($themeClassName.colors.${valueColor.default.toKtTokenName()}" +
                ".${it.asInteractiveFragment})\n"
        }.orEmpty()
    }

    private val ButtonComponentConfig.Color.asInteractiveFragment: String
        get() = if (states.isNullOrEmpty()) {
            "asInteractive()"
        } else {
            "asInteractive(${getAsInteractiveParameters()})"
        }

    protected fun ButtonComponentConfig.ColorScheme.getSpinnerMode(
        invariant: ButtonComponentConfig.Invariant?,
    ): String {
        return "spinnerMode(Button.SpinnerMode.SemitransparentContent(${
            getLoadingAlpha(this, invariant)
        }))\n"
    }
}
