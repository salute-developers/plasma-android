package com.sdds.plugin.themebuilder.internal.components.dropdownmenu.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.dropdownmenu.DropdownMenuProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class DropdownMenuComposeVariationGenerator(
    private val listStylesPackage: String,
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
) : ComposeVariationGenerator<DropdownMenuProperties>(
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

    override fun KtFileBuilder.onAddImports() {
        addImport("androidx.compose.ui.graphics", listOf("SolidColor"))
    }

    override val componentStyleName: String = "DropdownMenuStyle"

    override fun propsToBuilderCalls(
        props: DropdownMenuProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        shapeCall(props, variationId),
        shadowCall(props),
        colorsCall(props),
        dimensionsCall(props, variationId),
        listStyleCall(props, ktFileBuilder),
        dividerStyleCall(props, ktFileBuilder),
    )

    private fun listStyleCall(
        props: DropdownMenuProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.listStyle?.let {
            ".listStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    listStylesPackage,
                )
            }.style())"
        }
    }

    private fun dividerStyleCall(
        props: DropdownMenuProperties,
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

    private fun shapeCall(props: DropdownMenuProperties, variationId: String): String? {
        return props.shape?.let {
            getShape(it, variationId)
        }
    }

    private fun shadowCall(props: DropdownMenuProperties): String? {
        return props.shadow?.let {
            getShadow(it)
        }
    }

    private fun colorsCall(props: DropdownMenuProperties): String? {
        return if (props.hasColors()) {
            buildString {
                appendLine(".colors {")
                props.backgroundColor?.let {
                    appendLine(getGradientOrWrappedColor("backgroundColor", it))
                }
                props.strokeColor?.let {
                    appendLine(getGradientOrWrappedColor("strokeColor", it))
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun dimensionsCall(
        props: DropdownMenuProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.width?.let {
                    appendDimension("width", it, variationId)
                }
                props.offset?.let {
                    appendDimension("offset", it, variationId)
                }
                props.strokeWidth?.let {
                    appendDimension("stroke_width", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun DropdownMenuProperties.hasDimensions(): Boolean {
        return width != null ||
            offset != null ||
            strokeWidth != null
    }

    private fun DropdownMenuProperties.hasColors() = backgroundColor != null || strokeColor != null
}
