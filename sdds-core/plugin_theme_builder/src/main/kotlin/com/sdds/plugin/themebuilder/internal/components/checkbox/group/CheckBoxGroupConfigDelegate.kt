package com.sdds.plugin.themebuilder.internal.components.checkbox.group

import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.checkbox.group.view.CheckBoxGroupStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import java.io.File

internal class CheckBoxGroupConfigDelegate : ComponentConfigDelegate<CheckBoxGroupConfig>() {
    override fun parseConfig(file: File): CheckBoxGroupConfig {
        return file.decode(Serializer.componentConfig)
    }
    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component
    ): ComponentStyleGenerator<CheckBoxGroupConfig>? {
        return CheckBoxGroupStyleGeneratorView(
        xmlBuilderFactory = deps.xmlBuilderFactory,
        resourceReferenceProvider = deps.resourceReferenceProvider,
        dimensAggregator = deps.dimensAggregator,
        outputResDir = deps.outputResDir,
        resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
        viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
        colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
        )
    }

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component
    ): ComponentStyleGenerator<CheckBoxGroupConfig>? {
        return null
    }
}