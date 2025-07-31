package com.sdds.plugin.themebuilder.internal.components.loader.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.loader.LoaderProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class LoaderComposeVariationGenerator(
    private val spinnerStylesPackage: String,
    private val circularProgressStylesPackage: String,
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
) : ComposeVariationGenerator<LoaderProperties>(
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
    override fun propsToBuilderCalls(
        props: LoaderProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            spinnerStyleCall(props, ktFileBuilder),
            circularProgressStyleCall(props, ktFileBuilder),
        )
    }

    private fun spinnerStyleCall(props: LoaderProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.spinnerStyle?.let {
            ".spinnerStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    spinnerStylesPackage,
                )
            }.style())"
        }
    }

    private fun circularProgressStyleCall(props: LoaderProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.circularProgressStyle?.let {
            ".circularProgressStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    circularProgressStylesPackage,
                )
            }.style())"
        }
    }
}
