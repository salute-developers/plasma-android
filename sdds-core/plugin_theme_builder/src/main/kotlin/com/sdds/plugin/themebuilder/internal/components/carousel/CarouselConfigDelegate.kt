package com.sdds.plugin.themebuilder.internal.components.carousel

import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.carousel.view.CarouselStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import java.io.File

internal class CarouselConfigDelegate : ComponentConfigDelegate<CarouselConfig>() {
    override fun parseConfig(file: File): CarouselConfig {
        return file.decode<CarouselConfig>(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<CarouselConfig> {
        return CarouselStyleGeneratorView(
            xmlBuilderFactory = deps.xmlBuilderFactory,
            resourceReferenceProvider = deps.resourceReferenceProvider,
            dimensAggregator = deps.dimensAggregator,
            outputResDir = deps.outputResDir,
            resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
            viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
            colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
            styleComponentName = component.styleName.techToCamelCase(),

        )
    }

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<CarouselConfig>? = null
}
