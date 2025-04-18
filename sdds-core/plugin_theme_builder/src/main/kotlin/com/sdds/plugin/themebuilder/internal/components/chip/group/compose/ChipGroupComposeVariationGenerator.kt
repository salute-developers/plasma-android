package com.sdds.plugin.themebuilder.internal.components.chip.group.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.chip.group.ChipGroupProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class ChipGroupComposeVariationGenerator(
    private val chipStylesPackage: String,
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
) : ComposeVariationGenerator<ChipGroupProperties>(
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
    styleBuilderName = "ChipGroupStyleBuilder",
) {

    override val componentStyleName: String = "ChipGroupStyle"

    override fun propsToBuilderCalls(
        props: ChipGroupProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ): List<String> {
        return listOfNotNull(
            dimensionsCall(props, variationId),
            chipStyleCall(props, ktFileBuilder),
            disableAlphaCall(props),
        )
    }

    private fun dimensionsCall(
        props: ChipGroupProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.gap?.let {
                    appendDimension("gap", it, variationId)
                }
                props.lineSpacing?.let {
                    appendDimension("line_spacing", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ChipGroupProperties.hasDimensions(): Boolean {
        return gap != null || lineSpacing != null
    }

    private fun disableAlphaCall(props: ChipGroupProperties): String? {
        return props.disableAlpha?.let {
            ".disableAlpha(${it.value}f)"
        }
    }

    private fun chipStyleCall(props: ChipGroupProperties, ktFileBuilder: KtFileBuilder): String? {
        return props.chipStyle?.let {
            ".chipStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    chipStylesPackage,
                )
            }.style())"
        }
    }
}
