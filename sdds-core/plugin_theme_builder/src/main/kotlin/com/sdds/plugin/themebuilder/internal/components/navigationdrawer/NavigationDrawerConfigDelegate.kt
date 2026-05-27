package com.sdds.plugin.themebuilder.internal.components.navigationdrawer

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.navigationdrawer.compose.NavigationDrawerComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

internal class NavigationDrawerConfigDelegate : ComponentConfigDelegate<NavigationDrawerConfig>() {
    override fun parseConfig(file: File): NavigationDrawerConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<NavigationDrawerConfig>? = null

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<NavigationDrawerConfig> {
        return NavigationDrawerComposeVariationGenerator(
            itemStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.navigationdraweritem",
            themeClassName = deps.themeClassName,
            themePackage = deps.packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = deps.dimensionsConfig,
            dimensAggregator = deps.dimensAggregator,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            namespace = deps.namespace,
            ktFileBuilderFactory = deps.ktFileBuilderFactory,
            componentPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.${component.packageName}",
            componentName = component.styleName.techToSnakeCase(),
            styleBuilderName = "${component.componentName.techToCamelCase()}StyleBuilder",
            outputLocation = KtFileBuilder.OutputLocation.Directory(deps.outputDir),
        )
    }
}
