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
 *  Ключ для компонента NumberPanel
 */
val CardWithNumbersKey = ComponentKey("CardWithNumbers", ComponentGroup("Data Display", 0))

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
                CardWithNumbersKey,
                mapOf(
                    "CardWithNumbers" to PlasmaHomedsCardWithNumbersVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
