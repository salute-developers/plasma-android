package com.sdds.plugin.themebuilder.internal.components.aiheader

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.aiheader.compose.AiHeaderComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import java.io.File

private const val ICON_BUTTON_PACKAGE_SUFFIX = "iconbutton"
private const val BUTTON_GROUP_PACKAGE_SUFFIX = "buttongroup"
private const val AI_HEADER_STYLE_PACKAGE = "com.sdds.compose.uikit.ai"

internal class AiHeaderConfigDelegate : ComponentConfigDelegate<AiHeaderConfig>() {

    override fun parseConfig(file: File): AiHeaderConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<AiHeaderConfig>? = null

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = AiHeaderComposeVariationGenerator(
        iconButtonStylesPackage = "${deps.packageResolver.getPackage(
            TargetPackage.STYLES,
        )}.$ICON_BUTTON_PACKAGE_SUFFIX",
        buttonGroupStylesPackage = "${deps.packageResolver.getPackage(
            TargetPackage.STYLES,
        )}.$BUTTON_GROUP_PACKAGE_SUFFIX",
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
        componentStylePackage = AI_HEADER_STYLE_PACKAGE,
    )
}
