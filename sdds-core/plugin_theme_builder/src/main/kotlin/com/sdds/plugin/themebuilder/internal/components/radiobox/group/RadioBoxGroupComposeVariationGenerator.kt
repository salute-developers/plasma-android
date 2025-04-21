package com.sdds.plugin.themebuilder.internal.components.radiobox.group

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class RadioBoxGroupComposeVariationGenerator(
    private val radioBoxStylesPackage: String,
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
) : ComposeVariationGenerator<RadioBoxGroupProperties>(
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
) {

    override fun propsToBuilderCalls(
        props: RadioBoxGroupProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> = listOfNotNull(
        radioBoxStyleCall(props, ktFileBuilder),
        dimensionsCall(props, variationId),
    )

    private fun dimensionsCall(
        props: RadioBoxGroupProperties,
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

    private fun radioBoxStyleCall(
        props: RadioBoxGroupProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.radioBoxStyle?.let {
            ".radioBoxStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    radioBoxStylesPackage,
                )
            }.style())"
        }
    }
}
