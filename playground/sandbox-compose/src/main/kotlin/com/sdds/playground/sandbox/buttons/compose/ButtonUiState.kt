package com.sdds.playground.sandbox.buttons.compose

import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.playground.sandbox.core.compose.UiState
import com.sdds.icons.R.drawable as Icons

/**
 * Состояние кнопки
 * @property icon положение и ресурс иконки кнопки [ButtonIcon]
 * @property buttonLabel подпись кнопки
 * @property buttonValue значение кнопки
 * @property spacing способ группировки контента в кнопке [ButtonSpacing]
 * @property enabled включена ли кнопка
 * @property loading индикация загрузки
 */
internal data class ButtonUiState(
    override val variant: String = "",
    val icon: ButtonIcon = ButtonIcon.Start,
    val buttonLabel: String = "Label",
    val buttonValue: String? = null,
    val spacing: ButtonSpacing = ButtonSpacing.Packed,
    val enabled: Boolean = true,
    val loading: Boolean = false,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Иконка кнопки
 */
internal sealed class ButtonIcon(val iconId: Int = Icons.ic_plasma_24) {

    /**
     * Иконка вначале кнопки
     */
    object Start : ButtonIcon()

    /**
     * Иконка вконце кнопки
     */
    object End : ButtonIcon()

    /**
     * Отсутствие иконки
     */
    object No : ButtonIcon(0)
}
