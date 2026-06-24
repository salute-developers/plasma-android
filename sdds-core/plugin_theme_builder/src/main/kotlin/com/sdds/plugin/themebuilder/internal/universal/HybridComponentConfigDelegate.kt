package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.ComponentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.ComponentInfo
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.StyleGeneratorDependencies
import com.sdds.plugin.themebuilder.internal.components.base.Component
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import java.io.File

/**
 * Делегат, использующий [universalDelegate] для Compose-генерации и [fallback] для View-генерации.
 * Применяется для компонентов, у которых есть [ComponentMeta], но View-генератор ещё не переведён
 * на универсальный механизм.
 */
internal class HybridComponentConfigDelegate<C : Config<out PropertyOwner>>(
    private val universalDelegate: UniversalComponentConfigDelegate,
    private val fallback: ComponentConfigDelegate<C>,
) : ComponentConfigDelegate<C>() {

    override fun parseConfig(file: File): C = error("unreachable: both generate methods are overridden")

    override fun createComposeGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<C>? = null

    override fun createViewGenerator(
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentStyleGenerator<C>? = null

    override fun generateComposeStyles(
        file: File,
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentInfo? = universalDelegate.generateComposeStyles(file, deps, component)

    override fun generateViewSystemStyles(
        file: File,
        deps: StyleGeneratorDependencies,
        component: Component,
    ): ComponentInfo? = fallback.generateViewSystemStyles(file, deps, component)
}
