package com.sdds.plugin.themebuilder.internal.components.emptystate

import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.emptystate.view.EmptyStateStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import java.io.File

internal class EmptyStateConfigDelegate : ComponentConfigDelegate<EmptyStateConfig>() {
    override fun parseConfig(file: File): EmptyStateConfig {
        return file.decode(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = EmptyStateStyleGeneratorView(
        xmlBuilderFactory = deps.xmlBuilderFactory,
        resourceReferenceProvider = deps.resourceReferenceProvider,
        dimensAggregator = deps.dimensAggregator,
        outputResDir = deps.outputResDir,
        resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
        viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
        colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
        styleComponentName = component.styleName.techToCamelCase(),
    )

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ) = null
}
