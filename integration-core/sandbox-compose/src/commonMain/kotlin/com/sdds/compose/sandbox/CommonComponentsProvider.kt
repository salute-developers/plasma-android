package com.sdds.compose.sandbox

import com.sdds.compose.uikit.style.Style
import com.sdds.sandbox.Component
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider

/**
 * Провайдер общих компонентов.
 * Здесь регистрируются компоненты, которые всегда есть во всех дизайн-системах
 */
object CommonComponentsProvider : ComponentProvider() {
    override val generated: Map<ComponentKey, Component<*>> =
        listOf(
            Component(
                ComponentKey.Text,
                CommonComponentsVariationsCompose,
            ),
            Component(
                ComponentKey.Icon,
                CommonComponentsVariationsCompose,
            ),
        ).associateBy { it.key }
}

/**
 * Заглушка для компонентов без стилей
 */
object NoStyle : Style

private object CommonComponentsVariationsCompose : ComposeStyleProvider<NoStyle>() {
    override val variations: Map<String, ComposeStyleReference<NoStyle>> =
        mapOf("Default" to ComposeStyleReference { NoStyle })
}
