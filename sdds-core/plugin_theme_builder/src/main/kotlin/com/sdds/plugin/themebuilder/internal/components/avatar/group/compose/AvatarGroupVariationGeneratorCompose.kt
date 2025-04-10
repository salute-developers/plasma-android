package com.sdds.plugin.themebuilder.internal.components.avatar.group.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.avatar.group.AvatarGroupProperties
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class AvatarGroupVariationGeneratorCompose(
    private val avatarStylePackage: String,
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
) : ComposeVariationGenerator<AvatarGroupProperties>(
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
        props: AvatarGroupProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> = listOfNotNull(
        dimensionCall(props, variationId),
        avatarStyleCall(props, ktFileBuilder),
    )

    private fun dimensionCall(props: AvatarGroupProperties, variationId: String): String? {
        if (!props.hasDimensions()) return null
        return buildString {
            appendLine(".dimensions {")
            props.itemSpacing?.let {
                appendDimension("itemSpacing", it, variationId)
            }
            props.itemOffset?.let {
                appendDimension("itemOffset", it, variationId)
            }
            append("}")
        }
    }

    private fun avatarStyleCall(
        props: AvatarGroupProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.avatarStyle?.let {
            ".avatarStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    avatarStylePackage,
                )
            }.style())"
        }
    }

    private fun AvatarGroupProperties.hasDimensions(): Boolean {
        return itemOffset != null || itemSpacing != null
    }
}
