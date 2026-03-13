package com.sdds.testing.vs.select

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment
import kotlinx.parcelize.Parcelize

/**
 * UI-состояние компонента Select для тестовых стендов.
 *
 * Описывает внешний вид, выравнивание и дополнительные опции отображения,
 * такие как индикатор загрузки и экран пустого состояния.
 * @property variant Название варианта компонента, влияющее на стилизацию.
 * @property appearance Внешний вид компонента.
 * @property showLoading Показывать ли индикатор загрузки.
 * @property withEmptyState Отображать ли секцию пустого состояния при отсутствии списка
 * @property triggerAlignment Выравнивание поля Select относительно экрана.
 * @property dropdownPlacementMode Режим расположения Dropdown
 */
data class SelectUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val showLoading: Boolean = false,
    val withEmptyState: Boolean = true,
    val triggerType: TriggerType = TriggerType.TextField,
    val triggerAlignment: PopoverTriggerAlignment = PopoverTriggerAlignment.CENTER,
    val dropdownPlacementMode: PopoverPlacementMode = PopoverPlacementMode.LOOSE,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Тип триггера в [Select]
 */
@Parcelize
enum class TriggerType : Parcelable {
    TextField, Button
}
