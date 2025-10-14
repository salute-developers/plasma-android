package com.sdds.testing.vs.chip

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.ChipGroup
import com.sdds.uikit.FlowLayout
import com.sdds.uikit.viewstate.ViewState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Chip
 * @property variant стиль варианта компонента
 * @property label текст
 * @property contentLeft контент слева
 * @property hasClose иконка закрытия
 * @property enabled включен ли чип
 * @property isWrapped включен ли перенос строки
 * @property quantity количество Chip в группе
 * @property gravityMode горизонтальное выравнивание в группе
 * @property checkedState [ViewState] для Chip в состоянии isChecked == true
 * @property selectionMode режим выбора Chip в группе
 */
@Parcelize
data class ChipUiState(
    override val variant: String = "",
    override val appearance: String = "",
    override val colorVariant: String = "",
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val hasClose: Boolean = true,
    val enabled: Boolean = true,
    val isWrapped: Boolean = false,
    val quantity: Int = 3,
    val gravityMode: GravityMode = GravityMode.Start,
    val selectionMode: ChipGroup.SelectionMode = ChipGroup.SelectionMode.Single,
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }

    override fun updateColorVariant(colorVariant: String): UiState {
        return copy(colorVariant = colorVariant)
    }
}

/**
 * Горизонтальное выравнивание в группе
 * @property arrangement значение выравнивания
 */
@Parcelize
enum class GravityMode(val arrangement: Int) : Parcelable {
    Start(FlowLayout.ARRANGEMENT_START),
    Center(FlowLayout.ARRANGEMENT_CENTER),
    End(FlowLayout.ARRANGEMENT_END),
}
