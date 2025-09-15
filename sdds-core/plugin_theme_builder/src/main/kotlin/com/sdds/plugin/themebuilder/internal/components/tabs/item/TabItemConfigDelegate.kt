package com.sdds.plugin.themebuilder.internal.components.tabs.item

import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.tabs.item.view.IconTabItemStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.components.tabs.item.view.TabItemStyleGeneratorView
import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.utils.decode
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import java.io.File

internal enum class TabItemComponent {
    TabItem,
    IconTabItem,
}

internal class TabItemConfigDelegate(
    private val tabItemComponent: TabItemComponent,
) : ComponentConfigDelegate<TabItemConfig>() {

    override fun parseConfig(file: File): TabItemConfig {
        return file.decode<TabItemConfig>(Serializer.componentConfig)
    }

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<TabItemConfig>? =
        when (tabItemComponent) {
            TabItemComponent.TabItem -> TabItemStyleGeneratorView(
                xmlBuilderFactory = deps.xmlBuilderFactory,
                resourceReferenceProvider = deps.resourceReferenceProvider,
                dimensAggregator = deps.dimensAggregator,
                outputResDir = deps.outputResDir,
                resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
                colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
                viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
                styleComponentName = component.styleName.techToCamelCase(),
            )

            TabItemComponent.IconTabItem -> IconTabItemStyleGeneratorView(
                xmlBuilderFactory = deps.xmlBuilderFactory,
                resourceReferenceProvider = deps.resourceReferenceProvider,
                dimensAggregator = deps.dimensAggregator,
                outputResDir = deps.outputResDir,
                resourcePrefix = deps.resourcePrefixConfig.resourcePrefix,
                colorStateListGeneratorFactory = deps.colorStateListGeneratorFactory,
                viewColorStateGeneratorFactory = deps.viewColorStateGeneratorFactory,
                styleComponentName = component.styleName.techToCamelCase(),
            )
        }

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<TabItemConfig>? = null
}
