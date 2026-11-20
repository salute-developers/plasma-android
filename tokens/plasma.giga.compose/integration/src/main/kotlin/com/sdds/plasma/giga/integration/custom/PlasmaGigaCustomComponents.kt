package com.sdds.plasma.giga.integration.custom

import com.sdds.sandbox.Component
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider

/**
 *  Ключ для компонента ProductModal
 */
val ProductModalKey = ComponentKey("ProductModal", ComponentKey.Modal.group)

/**
 *  Компоненты
 */
object PlasmaGigaCustomComponents : ComponentProvider() {

    override val generated: Map<ComponentKey, Component<*>> =
        listOf(
            Component(
                ProductModalKey,
                mapOf(
                    "ProductModal" to PlasmaGigaProductModalVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
