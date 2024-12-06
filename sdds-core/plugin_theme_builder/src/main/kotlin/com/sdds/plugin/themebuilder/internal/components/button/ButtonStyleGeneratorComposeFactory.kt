package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase

internal class ButtonStyleGeneratorComposeFactory(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    themeName: String,
    packageResolver: PackageResolver,
    private val namespace: String,
    private val dimensionsConfig: DimensionsConfig,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) {

    private val commonComponentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.button"
    private val themePackage = packageResolver.getPackage(TargetPackage.THEME)
    private val themeClassName = "${themeName.snakeToCamelCase()}Theme"

    fun createBasicButtonGenerator(): BasicButtonStyleGeneratorCompose {
        return BasicButtonStyleGeneratorCompose(
            outputLocation = outputLocation,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = "$commonComponentPackage.basic",
            themeClassName = themeClassName,
            themePackage = themePackage,
            namespace = namespace,
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
        )
    }

    fun createIconButtonGenerator(): IconButtonStyleGeneratorCompose {
        return IconButtonStyleGeneratorCompose(
            outputLocation = outputLocation,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = "$commonComponentPackage.icon",
            themeClassName = themeClassName,
            themePackage = themePackage,
            namespace = namespace,
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
        )
    }

    fun createLinkButtonGenerator(): LinkButtonStyleGeneratorCompose {
        return LinkButtonStyleGeneratorCompose(
            outputLocation = outputLocation,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = "$commonComponentPackage.link",
            themeClassName = themeClassName,
            themePackage = themePackage,
            namespace = namespace,
            dimensionsConfig = dimensionsConfig,
            dimensAggregator = dimensAggregator,
            resourceReferenceProvider = resourceReferenceProvider,
        )
    }
}
