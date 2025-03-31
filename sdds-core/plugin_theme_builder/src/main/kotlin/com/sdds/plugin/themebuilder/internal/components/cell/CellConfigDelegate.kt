package com.sdds.plugin.themebuilder.internal.components.cell

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.cell.compose.CellComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import java.io.File

internal class CellConfigDelegate : ComponentConfigDelegate<CellConfig>() {
    override fun parseConfig(file: File): CellConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<CellConfig>? = null

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<CellConfig>? {
        return CellComposeVariationGenerator(
            themeClassName = deps.themeClassName,
            themePackage = deps.packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = deps.dimensionsConfig,
            dimensAggregator = deps.dimensAggregator,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            namespace = deps.namespace,
            ktFileBuilderFactory = deps.ktFileBuilderFactory,
            componentPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.${component.packageName}",
            componentName = component.styleName,
            outputLocation = KtFileBuilder.OutputLocation.Directory(deps.outputDir),
            avatarStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.avatar",
            iconButtonStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.iconbutton",
            checkBoxStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.checkbox",
            radioBoxStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.radiobox",
            switchStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.switcher",
        )
    }
}
