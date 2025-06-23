package com.sdds.plugin.themebuilder.internal.components.segment

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.segment.compose.SegmentComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.segment.view.SegmentStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

internal class SegmentConfigDelegate : ComponentConfigDelegate<SegmentConfig>() {

    override fun parseConfig(file: File): SegmentConfig {
        return file.decode<SegmentConfig>(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<SegmentConfig>? =
        SegmentStyleGeneratorView(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
        )

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<SegmentConfig>? {
        return SegmentComposeVariationGenerator(
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
            segmentItemStylesPackage = "${deps.packageResolver.getPackage(TargetPackage.STYLES)}.segmentitem",
        )
    }
}
