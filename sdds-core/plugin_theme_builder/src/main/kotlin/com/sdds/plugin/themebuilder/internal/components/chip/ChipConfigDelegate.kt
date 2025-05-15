package com.sdds.plugin.themebuilder.internal.components.chip

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.chip.compose.ChipComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.chip.vs.ChipStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

internal class ChipConfigDelegate : ComponentConfigDelegate<ChipConfig>() {
    override fun parseConfig(file: File): ChipConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = ChipStyleGeneratorView(
        xmlBuilderFactory = deps.xmlBuilderFactory,
        resourceReferenceProvider = deps.resourceReferenceProvider,
        dimensAggregator = deps.dimensAggregator,
        outputResDir = deps.outputResDir,
        styleComponentName = component.styleName.techToCamelCase(),
        resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
        colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
        viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
    )

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = ChipComposeVariationGenerator(
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
    )
}
