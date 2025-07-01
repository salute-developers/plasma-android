package com.sdds.plugin.themebuilder.internal.components.accordion

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

internal class AccordionItemConfigDelegate : ComponentConfigDelegate<AccordionItemConfig>() {
    override fun parseConfig(file: File): AccordionItemConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = null

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = AccordionItemComposeVariationGenerator(
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
