package com.sdds.plugin.themebuilder.internal.components.badge

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.badge.compose.BadgeComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.badge.view.BadgeStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.badge.view.IconBadgeStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decapitalized
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

internal class BadgeConfigDelegate(
    private val badgeType: BadgeType,
) : ComponentConfigDelegate<BadgeConfig>() {

    enum class BadgeType {
        Basic,
        Icon,
    }
    override fun parseConfig(file: File): BadgeConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<BadgeConfig>? {
        return when (badgeType) {
            BadgeType.Basic -> createBadgeViewGenerator(deps, component)
            BadgeType.Icon -> createIconBadgeViewGenerator(deps, component)
        }
    }

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<BadgeConfig>? {
        return BadgeComposeVariationGenerator(
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
            styleBuilderName = "${component.componentName.techToCamelCase()}StyleBuilder",
            styleBuilderFactoryFunName = "${component.componentName.techToCamelCase().decapitalized()}Builder",
        )
    }

    private fun createBadgeViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<BadgeConfig> {
        return BadgeStyleGeneratorView(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            styleComponentName = component.styleName.techToCamelCase(),
            resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
        )
    }

    private fun createIconBadgeViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<BadgeConfig> {
        return IconBadgeStyleGeneratorView(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            styleComponentName = component.styleName.techToCamelCase(),
            attrPrefix = deps.resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
        )
    }
}
