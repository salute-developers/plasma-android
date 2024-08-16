package com.sdds.playground.sandbox.radiobox

import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R

/**
 * Состояние RadioBox
 * @property variant вариация компонента
 * @property checked состояние выбора RadioBox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли RadioBox
 */
internal data class RadioBoxUiState(
    val variant: RadioBoxVariant = RadioBoxVariant.RadioBoxM,
    val checked: Boolean = false,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
)

/**
 * Стили вариаций компонента RadioBox
 * @property styleRes ресурс стиля
 */
internal enum class RadioBoxVariant(@StyleRes val styleRes: Int) {
    RadioBoxM(R.style.Theme_Sandbox_ComponentOverlays_RadioBoxM),
    RadioBoxS(R.style.Theme_Sandbox_ComponentOverlays_RadioBoxS),
}
