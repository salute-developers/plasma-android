package com.sdds.playground.sandbox.chip

import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R

/**
 * Состояние компонента Chip
 * @property variant стиль варианта компонента
 * @property label текст
 * @property contentLeft контент слева
 * @property hasClose иконка закрытия
 * @property enabled включен ли чип
 */
internal data class ChipUiState(
    val variant: ChipVariant = ChipVariant.ChipLDefault,
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val hasClose: Boolean = true,
    val enabled: Boolean = true,
)

/**
 * Варианты компонента Chip
 * @property styleRes ресурс стиля
 */
internal enum class ChipVariant(@StyleRes val styleRes: Int) {
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
