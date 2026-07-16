package com.sdds.plasma.homeds.integration.custom

import com.sdds.sandbox.Component
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider

/**
 *  Компоненты
 */
object PlasmaHomedsComposeCustomComponents : ComponentProvider() {

    override val generated: Map<ComponentKey, Component<*>> =
        listOf(
            Component(
                ComponentKey.NumberPanel,
                mapOf(
                    "NumberPanel" to PlasmaHomedsNumberPanelVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
