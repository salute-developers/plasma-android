package com.sdds.plugin.themebuilder.internal.components.popover

import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.popover.view.PopoverStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import java.io.File

internal class PopoverConfigDelegate : ComponentConfigDelegate<PopoverConfig>() {
    override fun parseConfig(file: File): PopoverConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = PopoverStyleGeneratorView(
        xmlBuilderFactory = deps.xmlBuilderFactory,
        resourceReferenceProvider = deps.resourceReferenceProvider,
        dimensAggregator = deps.dimensAggregator,
        outputResDir = deps.outputResDir,
        resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
        viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
        colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
    )

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = null
}
