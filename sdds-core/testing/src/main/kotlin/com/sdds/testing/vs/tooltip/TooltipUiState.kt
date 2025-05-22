package com.sdds.testing.vs.tooltip

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.testing.vs.popover.PopoverAlignment
import com.sdds.testing.vs.popover.PopoverPlacement
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента [Tooltip]
 * @property variant вариация компонента
 * @property placement расположение компонента
 * @property placementMode режим расположения компонента
 * @property alignment выравнивание
 * @property triggerAlignment выравнивание тригера
 * @property triggerCentered выравнивание хвостика по центру тригера
 * @property tailEnabled включен ли хвостик
 * @property autoDismiss включено ли автоматическое закрытие [Tooltip]
 * @property text текст в [Tooltip]
 * @property contentStart включает/выключает контент в начале [Tooltip]
 * @author Малышев Александр on 19.05.2025
 */
@Parcelize
data class TooltipUiState(
    override val variant: String = "",
    val placement: PopoverPlacement = PopoverPlacement.START,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.LOOSE,
    val alignment: PopoverAlignment = PopoverAlignment.START,
    val triggerAlignment: PopoverTriggerAlignment = PopoverTriggerAlignment.CENTER,
    val triggerCentered: Boolean = false,
    val tailEnabled: Boolean = true,
    val autoDismiss: Boolean = false,
    val text: String = "Tooltip Text you can\nreplace",
    val contentStart: Boolean = true,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
