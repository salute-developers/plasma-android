package com.sdds.plugin.themebuilder.internal.components.autocomplete.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.autocomplete.AutoCompleteProperties
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class AutoCompleteComposeVariationGenerator(
    private val textFieldStylesPackage: String,
    private val dropdownStylesPackage: String,
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
) : ComposeVariationGenerator<AutoCompleteProperties>(
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

    override val componentStyleName: String = "AutocompleteStyle"

    override fun propsToBuilderCalls(
        props: AutoCompleteProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        textFieldStyleCall(props, ktFileBuilder),
        dropdownStyleCall(props, ktFileBuilder),
    )

    private fun textFieldStyleCall(
        props: AutoCompleteProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.textFieldStyle?.let {
            ".textFieldStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    textFieldStylesPackage,
                )
            }.style())"
        }
    }

    private fun dropdownStyleCall(
        props: AutoCompleteProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.dropdownStyle?.let {
            ".dropdownStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    dropdownStylesPackage,
                )
            }.style())"
        }
    }
}
