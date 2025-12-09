package com.sdds.plugin.themebuilder.internal.components.buttongroup.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.base.compose.ComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.buttongroup.ButtonGroupProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider

internal class ButtonGroupComposeVariationGenerator(
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
    private val packageResolver: PackageResolver,
) : ComposeVariationGenerator<ButtonGroupProperties>(
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

    override val componentStyleName: String = "ButtonGroupStyle"

    override fun propsToBuilderCalls(
        props: ButtonGroupProperties,
        ktFileBuilder: KtFileBuilder,
        variationId: String,
    ) = listOfNotNull(
        internalShapeCall(props, variationId),
        externalShapeCall(props, variationId),
        dimensionsCall(props, variationId),
        buttonStyleCall(props, ktFileBuilder),
    )

    private fun buttonStyleCall(
        props: ButtonGroupProperties,
        ktFileBuilder: KtFileBuilder,
    ): String? {
        return props.buttonStyle?.let {
            val buttonType = it.value.split("-").firstOrNull()
            val buttonStylesPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.${buttonType}button"
            ".buttonStyle(${
                it.value.getComponentStyle(
                    ktFileBuilder,
                    buttonStylesPackage,
                )
            }.style())"
        }
    }

    private fun internalShapeCall(props: ButtonGroupProperties, variationId: String): String? {
        return props.internalShape?.let {
            getShape(it, variationId, "internalShape")
        }
    }

    private fun externalShapeCall(props: ButtonGroupProperties, variationId: String): String? {
        return props.externalShape?.let {
            getShape(it, variationId, "externalShape")
        }
    }

    private fun dimensionsCall(
        props: ButtonGroupProperties,
        variationId: String,
    ): String? {
        return if (props.hasDimensions()) {
            buildString {
                appendLine(".dimensions {")
                props.spacing?.let {
                    appendDimension("spacing", it, variationId)
                }
                append("}")
            }
        } else {
            null
        }
    }

    private fun ButtonGroupProperties.hasDimensions(): Boolean {
        return spacing != null
    }
}
