package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import java.io.File
import java.io.Serializable

internal abstract class ComponentConfigDelegate<C : Config<out PropertyOwner>> : Serializable {

    private var _config: C? = null

    protected abstract fun parseConfig(file: File): C

    protected abstract fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<C>?

    protected abstract fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<C>?

    fun generateComposeStyles(
        file: File,
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentInfo? {
        val config: C = _config ?: parseConfig(file)
        generateCompose(config, deps, component)
        return if (component.isExcludedForCompose) {
            null
        } else {
            getComponentInfo(component, deps, config)
        }
    }

    fun generateViewSystemStyles(
        file: File,
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentInfo? {
        val config: C = _config ?: parseConfig(file)
        generateView(config, deps, component)
        return if (component.isExcludedForViewSystem) {
            null
        } else {
            getComponentInfo(component, deps, config)
        }
    }

    private fun generateCompose(config: C, deps: StyleGeneratorDependencies, component: Component) {
        if (component.isExcludedForCompose) return
        createComposeGenerator(deps, component)?.generate(config)
    }

    private fun generateView(config: C, deps: StyleGeneratorDependencies, component: Component) {
        if (component.isExcludedForViewSystem) return
        createViewGenerator(deps, component)?.generate(config)
    }

    private fun getComponentInfo(
        component: Component,
        deps: StyleGeneratorDependencies,
        config: C,
    ): ComponentInfo {
        val styleName = component.styleName.techToCamelCase()
        val coreName = component.componentName.techToCamelCase()
        val variationsInfo = deps
            .variationsInfoProviderFactory
            .create(styleName)
            .getVariationsInfo(config = config)
        val componentInfo = ComponentInfo(coreName, styleName, variationsInfo)
        return componentInfo
    }
}
