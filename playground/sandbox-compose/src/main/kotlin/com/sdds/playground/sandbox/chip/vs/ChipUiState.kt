package com.sdds.playground.sandbox.chip.vs

import android.os.Parcelable
import android.view.Gravity
import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.core.vs.UiState
import com.sdds.serv.R
import com.sdds.uikit.ChipGroup
import com.sdds.uikit.viewstate.ViewState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Chip
 * @property variant стиль варианта компонента
 * @property label текст
 * @property contentLeft контент слева
 * @property hasClose иконка закрытия
 * @property enabled включен ли чип
 * @property gapMode режим отступа в группе чипов
 * @property isWrapped включен ли перенос строки
 * @property quantity количество Chip в группе
 * @property gravityMode горизонтальное выравнивание в группе
 * @property checkedState [ViewState] для Chip в состоянии isChecked == true
 * @property selectionMode режим выбора Chip в группе
 */
@Parcelize
internal data class ChipUiState(
    override val variant: String = "",
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val hasClose: Boolean = true,
    val enabled: Boolean = true,
    val isWrapped: Boolean = false,
    val quantity: Int = 3,
    val gravityMode: GravityMode = GravityMode.Start,
    val checkedState: CheckedState = CheckedState.Accent,
    val selectionMode: ChipGroup.SelectionMode = ChipGroup.SelectionMode.Single,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Состояния выбранного Chip
 */
@Parcelize
internal enum class CheckedState(val viewState: ViewState) : Parcelable {
    Default(ViewState.PRIMARY),
    Secondary(ViewState.SECONDARY),
    Accent(ViewState.ACCENT),
}

/**
 * Горизонтальное выравнивание в группе
 */
@Parcelize
internal enum class GravityMode(val gravity: Int) : Parcelable {
    Start(Gravity.START or Gravity.CENTER_VERTICAL),
    End(Gravity.END or Gravity.CENTER_VERTICAL),
}

/**
 * Режим отступа между Chip в ChipGroup
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class GapMode(@StyleRes val styleRes: Int) : Parcelable {
    Wide(R.style.Serv_Sdds_ComponentOverlays_ChipGroupWide),
    Dense(R.style.Serv_Sdds_ComponentOverlays_ChipGroupDense),
}
