package com.sdds.testing.vs.popover

import android.os.Parcelable
import android.view.Gravity
import com.sdds.testing.vs.UiState
import com.sdds.uikit.Popover
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента [Popover]
 * @property variant вариация компонента
 * @property placement расположение компонента
 * @property placementMode режим расположения компонента
 * @property alignment выравнивание
 * @property triggerAlignment выравнивание тригера
 * @property triggerCentered выравнивание хвостика по центру тригера
 * @property tailEnabled включен ли хвостик
 * @property autoDismiss включено ли автоматическое закрытие [Popover]
 * @author Малышев Александр on 19.05.2025
 */
@Parcelize
data class PopoverUiState(
    override val variant: String = "",
    val placement: PopoverPlacement = PopoverPlacement.START,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.LOOSE,
    val alignment: PopoverAlignment = PopoverAlignment.START,
    val triggerAlignment: PopoverTriggerAlignment = PopoverTriggerAlignment.CENTER,
    val triggerCentered: Boolean = false,
    val tailEnabled: Boolean = true,
    val autoDismiss: Boolean = false,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Тип расположения [Popover]
 */
@Parcelize
enum class PopoverPlacement : Parcelable {
    START,
    TOP,
    END,
    BOTTOM,
}

/**
 * Преобразует [PopoverPlacement] в [Popover] placement
 */
fun PopoverPlacement.toPlacement(): Int = when (this) {
    PopoverPlacement.START -> Popover.PLACEMENT_START
    PopoverPlacement.TOP -> Popover.PLACEMENT_TOP
    PopoverPlacement.END -> Popover.PLACEMENT_END
    PopoverPlacement.BOTTOM -> Popover.PLACEMENT_BOTTOM
}

/**
 * Режим расположения [Popover]
 */
@Parcelize
enum class PopoverPlacementMode : Parcelable {
    LOOSE,
    STRICT,
}

/**
 * Преобразует [PopoverPlacementMode] в [Popover] placementMode
 */
fun PopoverPlacementMode.toPlacementMode(): Int = when (this) {
    PopoverPlacementMode.LOOSE -> Popover.PLACEMENT_MODE_LOOSE
    PopoverPlacementMode.STRICT -> Popover.PLACEMENT_MODE_STRICT
}

/**
 * Тип выравнивания [Popover] относительно тригера
 */
@Parcelize
enum class PopoverAlignment : Parcelable {
    START,
    CENTER,
    END,
}

/**
 * Преобразует [PopoverAlignment] в [Popover] alignment
 */
fun PopoverAlignment.toAlignment(): Int = when (this) {
    PopoverAlignment.START -> Popover.ALIGNMENT_START
    PopoverAlignment.CENTER -> Popover.ALIGNMENT_CENTER
    PopoverAlignment.END -> Popover.ALIGNMENT_END
}

/**
 * Тип выравнивания [Popover] относительно тригера
 */
@Parcelize
enum class PopoverTriggerAlignment : Parcelable {
    START_TOP,
    START_CENTER,
    START_BOTTOM,
    CENTER_TOP,
    CENTER,
    CENTER_BOTTOM,
    END_TOP,
    END_CENTER,
    END_BOTTOM,
}

/**
 * Преобразует [PopoverTriggerAlignment] в [Gravity]
 */
fun PopoverTriggerAlignment.toGravity(): Int {
    return when (this) {
        PopoverTriggerAlignment.START_TOP -> Gravity.START or Gravity.TOP
        PopoverTriggerAlignment.START_CENTER -> Gravity.START or Gravity.CENTER_VERTICAL
        PopoverTriggerAlignment.START_BOTTOM -> Gravity.START or Gravity.BOTTOM
        PopoverTriggerAlignment.CENTER_TOP -> Gravity.CENTER_HORIZONTAL or Gravity.TOP
        PopoverTriggerAlignment.CENTER_BOTTOM -> Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM
        PopoverTriggerAlignment.CENTER -> Gravity.CENTER
        PopoverTriggerAlignment.END_TOP -> Gravity.END or Gravity.TOP
        PopoverTriggerAlignment.END_CENTER -> Gravity.END or Gravity.CENTER_VERTICAL
        PopoverTriggerAlignment.END_BOTTOM -> Gravity.END or Gravity.BOTTOM
    }
}
