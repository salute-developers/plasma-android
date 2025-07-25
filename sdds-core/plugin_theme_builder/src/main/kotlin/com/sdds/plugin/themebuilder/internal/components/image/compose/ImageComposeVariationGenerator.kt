package com.sdds.plugin.themebuilder.internal.components.image.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.image.ImageProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.capitalized

internal class ImageComposeVariationGenerator(
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
) : ComposeVariationGenerator<ImageProperties>(
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

    override fun getVariationName(variationId: String?): String {
        return variationId?.let {
            val segments = it.split("_")
            if (segments.size == 3) {
                "${segments[0].capitalized()}${segments[1]}x${segments[2]}"
            } else {
                variationId
            }
        }.orEmpty()
    }

    override fun propsToBuilderCalls(
        props: ImageProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        ratioCall(props),
    )

    private fun ratioCall(props: ImageProperties): String? {
        return if (props.width != null && props.height != null) {
            val ratio = props.width.value / props.height.value
            ".ratio(${ratio}f)"
        } else {
            null
        }
    }
}
