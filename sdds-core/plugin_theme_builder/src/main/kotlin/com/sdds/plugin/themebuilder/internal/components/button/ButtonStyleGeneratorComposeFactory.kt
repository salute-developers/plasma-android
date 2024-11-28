package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase

internal class ButtonStyleGeneratorComposeFactory(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    themeName: String,
    packageResolver: PackageResolver,
) {

    private val componentPackage = "${packageResolver.getPackage(TargetPackage.STYLES)}.button"
    private val themePackage = packageResolver.getPackage(TargetPackage.THEME)
    private val themeClassName = "${themeName.snakeToCamelCase()}Theme"

    fun createBasicButtonGenerator(): BasicButtonStyleGeneratorCompose {
        return BasicButtonStyleGeneratorCompose(
            outputLocation = outputLocation,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = componentPackage,
            themeClassName = themeClassName,
            themePackage = themePackage,
        )
    }

    fun createIconButtonGenerator(): IconButtonStyleGeneratorCompose {
        return IconButtonStyleGeneratorCompose(
            outputLocation = outputLocation,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = componentPackage,
            themeClassName = themeClassName,
            themePackage = themePackage,
        )
    }

    fun createLinkButtonGenerator(): LinkButtonStyleGeneratorCompose {
        return LinkButtonStyleGeneratorCompose(
            outputLocation = outputLocation,
            ktFileBuilderFactory = ktFileBuilderFactory,
            componentPackage = componentPackage,
            themeClassName = themeClassName,
            themePackage = themePackage,
        )
    }
}
