package com.sdds.plugin.themebuilder.internal.components.button

import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.button.compose.ButtonComposeVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.button.view.BasicButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.button.view.IconButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.button.view.LinkButtonStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decapitalized
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import java.io.File

internal class ButtonConfigDelegate(
    private val buttonType: ButtonType,
) : ComponentConfigDelegate<ButtonConfig>() {

    enum class ButtonType {
        Basic,
        Icon,
        Link,
    }

    override fun parseConfig(file: File): ButtonConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<ButtonConfig>? {
        return when (buttonType) {
            ButtonType.Basic -> createBasicButtonViewGenerator(deps)
            ButtonType.Icon -> createIconButtonViewGenerator(deps)
            ButtonType.Link -> createLinkButtonViewGenerator(deps)
        }
    }

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<ButtonConfig>? {
        return ButtonComposeVariationGenerator(
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
            styleBuilderFactoryFunName = "${component.componentName.techToCamelCase().decapitalized()}Builder",
        )
    }

    private fun createBasicButtonViewGenerator(
        deps: StyleGeneratorDependencies,
    ): ComponentStyleGenerator<ButtonConfig> {
        return BasicButtonStyleGeneratorView(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
        )
    }

    private fun createIconButtonViewGenerator(
        deps: StyleGeneratorDependencies,
    ): ComponentStyleGenerator<ButtonConfig> {
        return IconButtonStyleGeneratorView(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            attrPrefix = deps.resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
        )
    }

    private fun createLinkButtonViewGenerator(
        deps: StyleGeneratorDependencies,
    ): ComponentStyleGenerator<ButtonConfig> {
        return LinkButtonStyleGeneratorView(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            attrPrefix = deps.resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
        )
    }
}
