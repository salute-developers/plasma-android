package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.components.base.Component
import java.io.File
import java.io.Serializable

internal abstract class ComponentConfigDelegate<C : ComponentConfig> : Serializable {

    protected abstract fun parseConfig(file: File): C

    protected abstract fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<C>?

    protected abstract fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<C>?

    fun generate(
        file: File,
        deps: StyleGeneratorDependencies,
        target: ThemeBuilderTarget,
        component: Component,
    ) {
        val config: C = parseConfig(file)
        when (target) {
            ThemeBuilderTarget.VIEW_SYSTEM -> generateView(config, deps, component)
            ThemeBuilderTarget.COMPOSE -> generateCompose(config, deps, component)
            ThemeBuilderTarget.ALL -> {
                generateView(config, deps, component)
                generateCompose(config, deps, component)
            }
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
}
