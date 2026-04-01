package com.sdds.uikit.fixtures.stories.dropdownmenu

import android.os.Parcelable
import com.sdds.sandbox.StoryUiState
import com.sdds.uikit.fixtures.UiState
import com.sdds.uikit.fixtures.stories.popover.PopoverAlignment
import com.sdds.uikit.fixtures.stories.popover.PopoverPlacement
import com.sdds.uikit.fixtures.stories.popover.PopoverPlacementMode
import com.sdds.uikit.fixtures.stories.popover.PopoverTriggerAlignment
import kotlinx.parcelize.Parcelize

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
@Parcelize
@StoryUiState
data class DropdownMenuUiState(
    override val variant: String = "",
    override val appearance: String = "",
    override val colorVariant: String = "",
    val amount: Int = 3,
    val itemTitle: String = "Title",
    val hasDisclosure: Boolean = true,
    val itemDividerEnabled: Boolean = false,
    val placement: PopoverPlacement = PopoverPlacement.BOTTOM,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.LOOSE,
    val alignment: PopoverAlignment = PopoverAlignment.CENTER,
    val triggerAlignment: PopoverTriggerAlignment = PopoverTriggerAlignment.CENTER,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }

    override fun updateColorVariant(colorVariant: String): UiState {
        return copy(colorVariant = colorVariant)
    }
}
