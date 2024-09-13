package com.sdds.playground.sandbox.chip

import android.os.Parcelable
import android.view.Gravity
import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R
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
    val variant: ChipVariant = ChipVariant.ChipLDefault,
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val hasClose: Boolean = true,
    val enabled: Boolean = true,
    val gapMode: GapMode = GapMode.Wide,
    val isWrapped: Boolean = false,
    val quantity: Int = 3,
    val gravityMode: GravityMode = GravityMode.Start,
    val checkedState: ViewState = ViewState.ACCENT,
    val selectionMode: ChipGroup.SelectionMode = ChipGroup.SelectionMode.Single,
) : Parcelable

/**
 * Горизонтальное выравнивание в группе
 */
@Parcelize
internal enum class GravityMode(val gravity: Int) : Parcelable {
    Start(Gravity.START or Gravity.CENTER_VERTICAL),
    End(Gravity.END or Gravity.CENTER_VERTICAL),
}

/**
 * Варианты компонента Chip
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class ChipVariant(@StyleRes val styleRes: Int) : Parcelable {
    ChipLDefault(R.style.Theme_Sandbox_ComponentOverlays_ChipLDefault),
    ChipLSecondary(R.style.Theme_Sandbox_ComponentOverlays_ChipLSecondary),
    ChipLAccent(R.style.Theme_Sandbox_ComponentOverlays_ChipLAccent),
    ChipLPilledDefault(R.style.Theme_Sandbox_ComponentOverlays_ChipLPilledDefault),
    ChipLPilledSecondary(R.style.Theme_Sandbox_ComponentOverlays_ChipLPilledSecondary),
    ChipLPilledAccent(R.style.Theme_Sandbox_ComponentOverlays_ChipLPilledAccent),
    ChipMDefault(R.style.Theme_Sandbox_ComponentOverlays_ChipMDefault),
    ChipMSecondary(R.style.Theme_Sandbox_ComponentOverlays_ChipMSecondary),
    ChipMAccent(R.style.Theme_Sandbox_ComponentOverlays_ChipMAccent),
    ChipMPilledDefault(R.style.Theme_Sandbox_ComponentOverlays_ChipMPilledDefault),
    ChipMPilledSecondary(R.style.Theme_Sandbox_ComponentOverlays_ChipMPilledSecondary),
    ChipMPilledAccent(R.style.Theme_Sandbox_ComponentOverlays_ChipMPilledAccent),
    ChipSDefault(R.style.Theme_Sandbox_ComponentOverlays_ChipSDefault),
    ChipSSecondary(R.style.Theme_Sandbox_ComponentOverlays_ChipSSecondary),
    ChipSAccent(R.style.Theme_Sandbox_ComponentOverlays_ChipSAccent),
    ChipSPilledDefault(R.style.Theme_Sandbox_ComponentOverlays_ChipSPilledDefault),
    ChipSPilledSecondary(R.style.Theme_Sandbox_ComponentOverlays_ChipSPilledSecondary),
    ChipSPilledAccent(R.style.Theme_Sandbox_ComponentOverlays_ChipSPilledAccent),
    ChipXSDefault(R.style.Theme_Sandbox_ComponentOverlays_ChipXSDefault),
    ChipXSSecondary(R.style.Theme_Sandbox_ComponentOverlays_ChipXSSecondary),
    ChipXSAccent(R.style.Theme_Sandbox_ComponentOverlays_ChipXSAccent),
    ChipXSPilledDefault(R.style.Theme_Sandbox_ComponentOverlays_ChipXSPilledDefault),
    ChipXSPilledSecondary(R.style.Theme_Sandbox_ComponentOverlays_ChipXSPilledSecondary),
    ChipXSPilledAccent(R.style.Theme_Sandbox_ComponentOverlays_ChipXSPilledAccent),
}

/**
 * Режим отступа между Chip в ChipGroup
 * @property styleRes ресурс стиля
 */
@Parcelize
internal enum class GapMode(@StyleRes val styleRes: Int) : Parcelable {
    Wide(R.style.Theme_Sandbox_ComponentOverlays_ChipGroupWide),
    Dense(R.style.Theme_Sandbox_ComponentOverlays_ChipGroupDense),
}
