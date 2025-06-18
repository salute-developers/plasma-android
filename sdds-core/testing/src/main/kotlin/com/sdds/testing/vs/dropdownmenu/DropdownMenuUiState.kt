package com.sdds.testing.vs.dropdownmenu

import com.sdds.testing.vs.UiState
import com.sdds.testing.vs.popover.PopoverAlignment
import com.sdds.testing.vs.popover.PopoverPlacement
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment

/**
 * Состояние компонента DropdownMenu
 * @property variant вариация стиля
 * @property colorVariant вариация цвета
 * @property amount кол-во элементов
 * @property itemTitle заголовок элемента
 * @property hasDisclosure наличие индикатора доп. информации
 * @property itemDividerEnabled включает/выключает разделитель между элементами
 * @property placement расположение компонента
 * @property placementMode режим расположения компонента
 * @property alignment выравнивание
 * @property triggerAlignment выравнивание тригера
 */
data class DropdownMenuUiState(
    override val variant: String = "",
    override val colorVariant: String = "",
    val amount: Int = 3,
    val itemTitle: String = "Title",
    val hasDisclosure: Boolean = true,
    val itemDividerEnabled: Boolean = false,
    val placement: PopoverPlacement = PopoverPlacement.BOTTOM,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.LOOSE,
    val alignment: PopoverAlignment = PopoverAlignment.CENTER,
    val triggerAlignment: PopoverTriggerAlignment = PopoverTriggerAlignment.CENTER,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }

    override fun updateColorVariant(colorVariant: String): UiState {
        return copy(colorVariant = colorVariant)
    }
}
