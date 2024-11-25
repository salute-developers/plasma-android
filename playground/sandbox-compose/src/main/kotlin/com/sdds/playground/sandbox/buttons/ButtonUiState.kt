package com.sdds.playground.sandbox.buttons

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.serv.styles.buttons.Accent
import com.sdds.serv.styles.buttons.Black
import com.sdds.serv.styles.buttons.Clear
import com.sdds.serv.styles.buttons.Dark
import com.sdds.serv.styles.buttons.Default
import com.sdds.serv.styles.buttons.L
import com.sdds.serv.styles.buttons.M
import com.sdds.serv.styles.buttons.Negative
import com.sdds.serv.styles.buttons.Pilled
import com.sdds.serv.styles.buttons.Positive
import com.sdds.serv.styles.buttons.S
import com.sdds.serv.styles.buttons.Secondary
import com.sdds.serv.styles.buttons.Warning
import com.sdds.serv.styles.buttons.White
import com.sdds.serv.styles.buttons.Xs
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
private fun BasicButtonStyleBuilder.applyColorStyle(style: Style): BasicButtonStyleBuilder {
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
private fun IconButtonStyleBuilder.applyColorStyle(style: Style): IconButtonStyleBuilder {
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
private fun LinkButtonStyleBuilder.applyColorStyle(style: Style): LinkButtonStyleBuilder {
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

@Composable
internal fun ButtonUiState.linkButtonStyle(): ButtonStyle {
    val styleBuilder = when (size) {
        Size.L -> LinkButton.L
        Size.M -> LinkButton.M
        Size.S -> LinkButton.S
        Size.XS -> LinkButton.Xs
    }
    return styleBuilder
        .applyColorStyle(style)
        .style()
}
