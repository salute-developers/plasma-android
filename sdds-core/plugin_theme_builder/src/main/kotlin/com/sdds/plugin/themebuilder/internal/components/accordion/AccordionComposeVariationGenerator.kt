package com.sdds.plugin.themebuilder.internal.components.accordion

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class AccordionComposeVariationGenerator(
    private val dividerStylesPackage: String,
    private val accordionItemStylesPackage: String,
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
) : ComposeVariationGenerator<AccordionProperties>(
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

    override val componentStyleName: String = "AccordionStyle"

    override fun propsToBuilderCalls(
        props: AccordionProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        dividerStyleCall(props, ktFileBuilder),
        accordionItemStyleCall(props, ktFileBuilder),
        dimensionsCall(props, variationId),
    )

    private fun dividerStyleCall(
        props: AccordionProperties,
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

    private fun accordionItemStyleCall(
        props: AccordionProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.accordionItemStyle?.let {
            ".accordionItemStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    accordionItemStylesPackage,
                )
            }.style())"
        }
    }

    private fun dimensionsCall(
        props: AccordionProperties,
        variationId: String,
    ): String? {
        return if (props.itemSpacing != null) {
            buildString {
                appendLine(".dimensions {")
                appendDimension("item_spacing", props.itemSpacing, variationId)
                append("}")
            }
        } else {
            null
        }
    }
}
