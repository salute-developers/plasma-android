package com.sdds.playground.sandbox.checkbox

import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R
import com.sdds.uikit.CheckBox

/**
 * Состояние checkbox
 * @property variant вариация компонента [CheckBox]
 * @property state состояние checkbox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли checkbox
 */
internal data class CheckBoxUiState(
    val variant: CheckBoxVariant = CheckBoxVariant.CheckBoxM,
    val state: CheckBox.ToggleableState = CheckBox.ToggleableState.INDETERMINATE,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
)

/**
 * Стили вариаций компонента [CheckBox]
 * @property styleRes ресурс стиля
 */
internal enum class CheckBoxVariant(@StyleRes val styleRes: Int) {
    CheckBoxM(R.style.Theme_Sandbox_ComponentOverlays_CheckBoxM),
    CheckBoxS(R.style.Theme_Sandbox_ComponentOverlays_CheckBoxS),
}
