package com.sdds.plugin.themebuilder.internal.components.carousel.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.carousel.CarouselProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class CarouselComposeVariationGenerator(
    private val indicatorStylesPackage: String,
    private val prevButtonStylesPackage: String,
    private val nextButtonStylesPackage: String,
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
) : ComposeVariationGenerator<CarouselProperties>(
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

    override val componentStyleName: String = "CarouselStyle"

    override fun KtFileBuilder.onAddImports() {
        addImport("com.sdds.compose.uikit", listOf("CarouselButtonsPlacement"))
    }

    override fun propsToBuilderCalls(
        props: CarouselProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        buttonsPlacementCall(props),
        prevButtonIconCall(props),
        nextButtonIconCall(props),
        indicatorStyleCall(props, ktFileBuilder),
        prevButtonStyleCall(props, ktFileBuilder),
        nextButtonStyleCall(props, ktFileBuilder),
        dimensionsCall(props, variationId),
    )

    private fun prevButtonIconCall(props: CarouselProperties): String? {
        return props.prevButtonIcon?.let {
            getIconAsDrawableRes("prevButtonIcon", it)
        }
    }

    private fun nextButtonIconCall(props: CarouselProperties): String? {
        return props.nextButtonIcon?.let {
            getIconAsDrawableRes("nextButtonIcon", it)
        }
    }

    private fun indicatorStyleCall(
        props: CarouselProperties,
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

    private fun prevButtonStyleCall(
        props: CarouselProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.prevButtonStyle?.let {
            ".prevButtonStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    prevButtonStylesPackage,
                )
            }.style())"
        }
    }

    private fun nextButtonStyleCall(
        props: CarouselProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.nextButtonStyle?.let {
            ".nextButtonStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    nextButtonStylesPackage,
                )
            }.style())"
        }
    }

    private fun dimensionsCall(
        props: CarouselProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.gap?.let {
                    appendDimension("gap", it, variationId)
                }
                props.prevButtonPadding?.let {
                    appendDimension("prev_button_padding", it, variationId)
                }
                props.nextButtonPadding?.let {
                    appendDimension("next_button_padding", it, variationId)
                }
                props.indicatorPadding?.let {
                    appendDimension("indicator_padding", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun buttonsPlacementCall(props: CarouselProperties): String? {
        return props.buttonsPlacement?.let {
            val enumValue = when {
                it.value.equals("inner", ignoreCase = true) -> "Inner"
                it.value.equals("outer", ignoreCase = true) -> "Outer"
                else -> throw ThemeBuilderException("")
            }
            ".buttonsPlacement(CarouselButtonsPlacement.$enumValue)"
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun CarouselProperties.hasDimensions(): Boolean {
        return gap != null ||
            indicatorPadding != null ||
            nextButtonPadding != null ||
            prevButtonPadding != null
    }
}
