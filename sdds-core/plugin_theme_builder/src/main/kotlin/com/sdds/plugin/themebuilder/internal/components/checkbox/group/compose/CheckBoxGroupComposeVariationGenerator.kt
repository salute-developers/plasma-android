package com.sdds.plugin.themebuilder.internal.components.checkbox.group.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.checkbox.group.CheckBoxGroupProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class CheckBoxGroupComposeVariationGenerator(
    private val checkBoxStylesPackage: String,
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
) : ComposeVariationGenerator<CheckBoxGroupProperties>(
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
        props: CheckBoxGroupProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> = listOfNotNull(
        checkBoxStyleCall(props, ktFileBuilder),
        dimensionsCall(props, variationId),
    )

    private fun dimensionsCall(
        props: CheckBoxGroupProperties,
        variationId: String,
    ): String? {
        val hasDimensions = props.itemSpacing != null || props.itemOffset != null
        return if (hasDimensions) {
            buildString {
                appendLine(".dimensions {")
                props.itemSpacing?.let {
                    appendDimension("item_spacing", it, variationId)
                }
                props.itemOffset?.let {
                    appendDimension("item_offset", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun checkBoxStyleCall(
        props: CheckBoxGroupProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.checkBoxStyle?.let {
            ".checkBoxStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    checkBoxStylesPackage,
                )
            }.style())"
        }
    }
}
