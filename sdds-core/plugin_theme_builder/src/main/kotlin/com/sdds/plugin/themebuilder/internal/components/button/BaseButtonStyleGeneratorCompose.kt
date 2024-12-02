package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.ComposeComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import java.util.Locale

/**
 * Базовый класс для генераторов стилей кнопок (Basic/Icon/Link)
 * @see ComposeComponentStyleGenerator
 */
internal abstract class BaseButtonStyleGeneratorCompose<T : ComponentConfig>(
    dimensionsConfig: DimensionsConfig,
    dimensAggregator: DimensAggregator,
    resourceReferenceProvider: ResourceReferenceProvider,
    namespace: String,
    ktFileBuilderFactory: KtFileBuilderFactory,
    componentPackage: String,
    outputLocation: KtFileBuilder.OutputLocation,
) : ComposeComponentStyleGenerator<T>(
    dimensionsConfig = dimensionsConfig,
    dimensAggregator = dimensAggregator,
    resourceReferenceProvider = resourceReferenceProvider,
    namespace = namespace,
    ktFileBuilderFactory = ktFileBuilderFactory,
    componentPackage = componentPackage,
    outputLocation = outputLocation,
) {
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

    protected fun String.toKtTokenName(): String =
        techToCamelCase().decapitalize(Locale.getDefault())

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
}
