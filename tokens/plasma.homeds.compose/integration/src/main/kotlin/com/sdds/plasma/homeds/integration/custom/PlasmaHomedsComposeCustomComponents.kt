package com.sdds.plasma.homeds.integration.custom

import com.sdds.sandbox.Component
import com.sdds.sandbox.ComponentGroup
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider

/**
 *  Ключ для компонента NumberPanel
 */
val NumberPanelKey = ComponentKey("NumberPanel", ComponentGroup("Data Entry", 1))

/**
 *  Ключ для компонента Bubble
 */
val BubbleKey = ComponentKey("Bubble", ComponentKey.Overlay.group)

/**
 *  Компоненты
 */
object PlasmaHomedsComposeCustomComponents : ComponentProvider() {

    override val generated: Map<ComponentKey, Component<*>> =
        listOf(
            Component(
                NumberPanelKey,
                mapOf(
                    "NumberPanel" to PlasmaHomedsNumberPanelVariationsCompose,
                ),
            ),
            Component(
                BubbleKey,
                mapOf(
                    "Bubble" to PlasmaHomedsBubbleVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
