package com.sdds.plugin.themebuilder.internal.components.tabs

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.tabs.compose.TabsComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.tabs.view.TabsStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

internal class TabsConfigDelegate : ComponentConfigDelegate<TabsConfig>() {

    override fun parseConfig(file: File): TabsConfig {
        return file.decode<TabsConfig>(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<TabsConfig>? =
        TabsStyleGeneratorView(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
            styleComponentName = component.styleName.techToCamelCase(),
        )

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<TabsConfig>? {
        return TabsComposeVariationGenerator(
            themeClassName = deps.themeClassName,
            themePackage = deps.packageResolver.getPackage(TargetPackage.THEME),
            dimensionsConfig = deps.dimensionsConfig,
            dimensAggregator = deps.dimensAggregator,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            namespace = deps.namespace,
            ktFileBuilderFactory = deps.ktFileBuilderFactory,
            componentPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.${component.packageName}",
            componentName = component.styleName.techToSnakeCase(),
            outputLocation = KtFileBuilder.OutputLocation.Directory(deps.outputDir),
            dividerStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.divider",
            tabItemStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.tabitem",
            iconTabItemStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.icontabitem",
            dropDownMenuStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.dropdownmenu",
        )
    }
}
