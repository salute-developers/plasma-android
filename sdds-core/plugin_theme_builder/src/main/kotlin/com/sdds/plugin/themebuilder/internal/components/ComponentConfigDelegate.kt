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
        if (component.isExcludedForCompose) return null
        val config: C = _config ?: parseConfig(file)
        return generateCompose(config, deps, component)
    }

    fun generateViewSystemStyles(
        file: File,
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentInfo? {
        if (component.isExcludedForViewSystem) return null
        val config: C = _config ?: parseConfig(file)
        return generateView(config, deps, component)
    }

    private fun generateCompose(config: C, deps: StyleGeneratorDependencies, component: Component): ComponentInfo? {
        val generator = createComposeGenerator(deps, component) ?: return null
        val result = generator.generate(config)
        return ComponentInfo(
            component.componentName,
            component.componentName.techToCamelCase(),
            result.styleName,
            result.variations.map {
                VariationInfo(
                    it.key,
                    composeReference = it.value,
                )
            },
        )
    }

    private fun generateView(config: C, deps: StyleGeneratorDependencies, component: Component): ComponentInfo? {
        val generator = createViewGenerator(deps, component) ?: return null
        val result = generator.generate(config) as ComponentStyleGenerator.Result.Xml
        return ComponentInfo(
            component.componentName,
            result.coreName,
            result.styleName,
            result.variations.map {
                VariationInfo(
                    it.key,
                    viewReference = it.value,
                    viewOverlayReference = result.overlays[it.key],
                )
            },
        )
    }
}
