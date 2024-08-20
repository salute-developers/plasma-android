package com.sdds.playground.sandbox.switcher

import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R

/**
 * Состояние switch
 *
 * @property variant стиль компонента
 * @property active состояние switch
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли switch
 */
internal data class SwitchUiState(
    val variant: SwitchVariant = SwitchVariant.SwitchL,
    val active: Boolean = false,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
)

/**
 * Стили вариаций компонента Switch
 * @property styleRes ресурс стиля
 */
internal enum class SwitchVariant(@StyleRes val styleRes: Int) {
    SwitchL(R.style.Theme_Sandbox_ComponentOverlays_SwitchL),
    SwitchM(R.style.Theme_Sandbox_ComponentOverlays_SwitchM),
    SwitchS(R.style.Theme_Sandbox_ComponentOverlays_SwitchS),
}
