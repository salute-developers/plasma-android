package com.sdds.playground.sandbox.buttons

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.ButtonStyleBuilder
import com.sdds.compose.uikit.IconButton
import com.sdds.icons.R.drawable as Icons

/**
 * Состояние кнопки
 * @property style стиль кнопки [Style]
 * @property size размер кнопки [Size]
 * @property icon положение и ресурс иконки кнопки [ButtonIcon]
 * @property shape форма кнопки (справедливо только для StarIconButton) [IconButtonShape]
 * @property buttonLabel подпись кнопки
 * @property buttonValue значение кнопки
 * @property spacing способ группировки контента в кнопке [Button.Spacing]
 * @property enabled включена ли кнопка
 * @property loading индикация загрузки
 */
internal data class ButtonUiState(
    val style: Style = Style.Default,
    val size: Size = Size.L,
    val icon: ButtonIcon = ButtonIcon.Start,
    val shape: IconButtonShape = IconButtonShape.Rounded,
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

/**
 * Размеры кнопки
 */
enum class Size {
    L, M, S, XS
}

/**
 * Стиль отображения кнопки
 */
enum class Style {
    Default,
    Secondary,
    Accent,
    Positive,
    Negative,
    Warning,
    Clear,
    Dark,
    Black,
    White,
}

/**
 * Форма кнопки [IconButton]
 */
enum class IconButtonShape {
    /**
     * Скругленные края
     */
    Rounded,

    /**
     * Круглая форма
     */
    Circle,
}

@Composable
private fun ButtonStyleBuilder.applyColorStyle(style: Style): ButtonStyleBuilder {
    return when (style) {
        Style.Default -> Default
        Style.Secondary -> Secondary
        Style.Accent -> Accent
        Style.Positive -> Positive
        Style.Negative -> Negative
        Style.Warning -> Warning
        Style.Clear -> Clear
        Style.Dark -> Dark
        Style.Black -> Black
        Style.White -> White
    }
}

@Composable
internal fun ButtonUiState.basicButtonStyle(): ButtonStyle {
    val styleBuilder = when (size) {
        Size.L -> BasicButton.L
        Size.M -> BasicButton.M
        Size.S -> BasicButton.S
        Size.XS -> BasicButton.Xs
    }
    return styleBuilder.applyColorStyle(style).style()
}

@Composable
internal fun ButtonUiState.iconButtonStyle(): ButtonStyle {
    val styleBuilder = when (size) {
        Size.L -> IconButton.L
        Size.M -> IconButton.M
        Size.S -> IconButton.S
        Size.XS -> IconButton.Xs
    }
    return styleBuilder
        .applyColorStyle(style)
        .let {
            if (shape == IconButtonShape.Circle) {
                it.Pilled
            } else {
                it
            }
        }
        .style()
}
