package com.sdds.plugin.themebuilder.internal.components.select.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.select.SelectProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class SelectComposeVariationGenerator(
    private val textFieldStylesPackage: String,
    private val buttonStylesPackage: String,
    private val dropdownStylesPackage: String,
    private val selectItemStylesPackage: String,
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
) : ComposeVariationGenerator<SelectProperties>(
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

    override val componentStyleName: String = "SelectStyle"

    override fun propsToBuilderCalls(
        props: SelectProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        textFieldStyleCall(props, ktFileBuilder),
        buttonStyleCall(props, ktFileBuilder),
        selectItemStyleCall(props, ktFileBuilder),
        dropdownStyleCall(props, ktFileBuilder),
    )

    private fun textFieldStyleCall(
        props: SelectProperties,
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

    private fun buttonStyleCall(
        props: SelectProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.buttonStyle?.let {
            ".buttonStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    buttonStylesPackage,
                )
            }.style())"
        }
    }

    private fun dropdownStyleCall(
        props: SelectProperties,
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

    private fun selectItemStyleCall(
        props: SelectProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.selectItemStyle?.let {
            ".selectItemStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    selectItemStylesPackage,
                )
            }.style())"
        }
    }
}
