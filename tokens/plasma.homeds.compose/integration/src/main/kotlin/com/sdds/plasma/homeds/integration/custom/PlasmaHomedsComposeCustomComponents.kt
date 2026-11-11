package com.sdds.plasma.homeds.integration.custom

import com.sdds.sandbox.Component
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.ComponentProvider

/**
 *  Ключ для компонента NumberPanel
 */
val NumberPanelKey = ComponentKey("NumberPanel", ComponentKey.BasicButton.group)

/**
 *  Ключ для компонента Bubble
 */
val BubbleKey = ComponentKey("Bubble", ComponentKey.Overlay.group)

/**
 *  Ключ для компонента ProductCard
 */
val ProductCardKey = ComponentKey("ProductCard", ComponentKey.Card.group)

/**
 *  Ключ для компонента ProductBottomSheet
 */
val ProductBottomSheetKey = ComponentKey("ProductBottomSheet", ComponentKey.Overlay.group)

/**
 *  Ключ для компонента ProductFormItem
 */
val ProductFormItemKey = ComponentKey("ProductFormItem", ComponentKey.BasicButton.group)

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
            Component(
                ProductCardKey,
                mapOf(
                    "ProductCard" to PlasmaHomedsProductCardVariationsCompose,
                ),
            ),
            Component(
                ProductBottomSheetKey,
                mapOf(
                    "ProductBottomSheet" to PlasmaHomedsProductBottomSheetVariationsCompose,
                ),
            ),
            Component(
                ProductFormItemKey,
                mapOf(
                    "ProductFormItem" to PlasmaHomedsProductFormItemVariationsCompose,
                ),
            ),
        ).associateBy { it.key }
}
