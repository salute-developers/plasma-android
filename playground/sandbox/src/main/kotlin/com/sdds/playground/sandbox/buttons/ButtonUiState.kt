package com.sdds.playground.sandbox.buttons

import com.sdds.compose.uikit.Button
import com.sdds.icons.R.drawable as Icons

/**
 * Состояние кнопки
 * @property style стиль кнопки [SandboxButton.Style]
 * @property size размер кнопки [SandboxButton.Size]
 * @property icon положение и ресурс иконки кнопки [ButtonIcon]
 * @property shape форма кнопки (справедливо только для StarIconButton) [SandboxButton.IconButtonShape]
 * @property buttonLabel подпись кнопки
 * @property buttonValue значение кнопки
 * @property spacing способ группировки контента в кнопке [Button.Spacing]
 * @property enabled включена ли кнопка
 * @property loading индикация загрузки
 */
internal data class ButtonUiState(
    val style: SandboxButton.Style = SandboxButton.Style.Default,
    val size: SandboxButton.Size = SandboxButton.Size.L,
    val icon: ButtonIcon = ButtonIcon.Start,
    val shape: SandboxButton.IconButtonShape = SandboxButton.IconButtonShape.Rounded,
    val buttonLabel: String = "Label",
    val buttonValue: String? = null,
    val spacing: Button.Spacing = Button.Spacing.Packed,
    val enabled: Boolean = true,
    val loading: Boolean = false,
)

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
