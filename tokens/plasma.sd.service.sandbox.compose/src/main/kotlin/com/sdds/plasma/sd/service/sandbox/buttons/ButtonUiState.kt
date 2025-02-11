package com.sdds.plasma.sd.service.sandbox.buttons

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.button.basic.Accent
import com.sdds.plasma.sd.service.styles.button.basic.Black
import com.sdds.plasma.sd.service.styles.button.basic.Clear
import com.sdds.plasma.sd.service.styles.button.basic.Dark
import com.sdds.plasma.sd.service.styles.button.basic.Default
import com.sdds.plasma.sd.service.styles.button.basic.L
import com.sdds.plasma.sd.service.styles.button.basic.M
import com.sdds.plasma.sd.service.styles.button.basic.Negative
import com.sdds.plasma.sd.service.styles.button.basic.Positive
import com.sdds.plasma.sd.service.styles.button.basic.S
import com.sdds.plasma.sd.service.styles.button.basic.Secondary
import com.sdds.plasma.sd.service.styles.button.basic.Warning
import com.sdds.plasma.sd.service.styles.button.basic.White
import com.sdds.plasma.sd.service.styles.button.basic.WrapperBasicButtonView
import com.sdds.plasma.sd.service.styles.button.basic.Xs
import com.sdds.plasma.sd.service.styles.button.icon.Accent
import com.sdds.plasma.sd.service.styles.button.icon.Black
import com.sdds.plasma.sd.service.styles.button.icon.Clear
import com.sdds.plasma.sd.service.styles.button.icon.Dark
import com.sdds.plasma.sd.service.styles.button.icon.Default
import com.sdds.plasma.sd.service.styles.button.icon.L
import com.sdds.plasma.sd.service.styles.button.icon.M
import com.sdds.plasma.sd.service.styles.button.icon.Negative
import com.sdds.plasma.sd.service.styles.button.icon.Pilled
import com.sdds.plasma.sd.service.styles.button.icon.Positive
import com.sdds.plasma.sd.service.styles.button.icon.S
import com.sdds.plasma.sd.service.styles.button.icon.Secondary
import com.sdds.plasma.sd.service.styles.button.icon.Warning
import com.sdds.plasma.sd.service.styles.button.icon.White
import com.sdds.plasma.sd.service.styles.button.icon.WrapperIconButtonView
import com.sdds.plasma.sd.service.styles.button.icon.Xs
import com.sdds.plasma.sd.service.styles.button.link.Accent
import com.sdds.plasma.sd.service.styles.button.link.Default
import com.sdds.plasma.sd.service.styles.button.link.L
import com.sdds.plasma.sd.service.styles.button.link.M
import com.sdds.plasma.sd.service.styles.button.link.Negative
import com.sdds.plasma.sd.service.styles.button.link.Positive
import com.sdds.plasma.sd.service.styles.button.link.S
import com.sdds.plasma.sd.service.styles.button.link.Secondary
import com.sdds.plasma.sd.service.styles.button.link.Warning
import com.sdds.plasma.sd.service.styles.button.link.WrapperLinkButtonView
import com.sdds.plasma.sd.service.styles.button.link.Xs
import com.sdds.icons.R.drawable as Icons

/**
 * Состояние кнопки
 * @property state стиль кнопки [State]
 * @property icon положение и ресурс иконки кнопки [ButtonIcon]
 * @property buttonLabel подпись кнопки
 * @property buttonValue значение кнопки
 * @property spacing способ группировки контента в кнопке [Button.Spacing]
 * @property enabled включена ли кнопка
 * @property loading индикация загрузки
 */
internal data class ButtonUiState(
    val state: State = State.Default,
    val variant: ButtonVariant = ButtonVariant.ButtonM,
    val icon: ButtonIcon = ButtonIcon.Start,
    val buttonLabel: String = "Label",
    val buttonValue: String? = null,
    val spacing: Button.Spacing = Button.Spacing.Packed,
    val enabled: Boolean = true,
    val loading: Boolean = false,
)

@Composable
internal fun ButtonUiState.basicButtonStyle(): ButtonStyle {
    return when (variant) {
        ButtonVariant.ButtonL,
        ButtonVariant.ButtonLPilled,
        -> BasicButton.L

        ButtonVariant.ButtonM,
        ButtonVariant.ButtonMPilled,
        -> BasicButton.M

        ButtonVariant.ButtonS,
        ButtonVariant.ButtonSPilled,
        -> BasicButton.S

        ButtonVariant.ButtonXS,
        ButtonVariant.ButtonXSPilled,
        -> BasicButton.Xs
    }
        .applyState(state)
}

@Composable
internal fun ButtonUiState.iconButtonStyle(): ButtonStyle {
    return when (variant) {
        ButtonVariant.ButtonL -> IconButton.L
        ButtonVariant.ButtonLPilled -> IconButton.L.Pilled
        ButtonVariant.ButtonM -> IconButton.M
        ButtonVariant.ButtonMPilled -> IconButton.M.Pilled
        ButtonVariant.ButtonS -> IconButton.S
        ButtonVariant.ButtonSPilled -> IconButton.S.Pilled
        ButtonVariant.ButtonXS -> IconButton.Xs
        ButtonVariant.ButtonXSPilled -> IconButton.Xs.Pilled
    }
        .applyState(state)
}

@Composable
internal fun ButtonUiState.linkButtonStyle(): ButtonStyle {
    return when (variant) {
        ButtonVariant.ButtonL,
        ButtonVariant.ButtonLPilled,
        -> LinkButton.L

        ButtonVariant.ButtonM,
        ButtonVariant.ButtonMPilled,
        -> LinkButton.M

        ButtonVariant.ButtonS,
        ButtonVariant.ButtonSPilled,
        -> LinkButton.S

        ButtonVariant.ButtonXS,
        ButtonVariant.ButtonXSPilled,
        -> LinkButton.Xs
    }
        .applyState(state)
}

internal enum class ButtonVariant {
    ButtonL,
    ButtonLPilled,
    ButtonM,
    ButtonMPilled,
    ButtonS,
    ButtonSPilled,
    ButtonXS,
    ButtonXSPilled,
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

/**
 * Стиль отображения кнопки
 */
internal enum class State {
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

@Composable
private fun WrapperBasicButtonView.applyState(state: State): ButtonStyle {
    return when (state) {
        State.Default -> Default
        State.Secondary -> Secondary
        State.Accent -> Accent
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        State.Clear -> Clear
        State.Dark -> Dark
        State.Black -> Black
        State.White -> White
    }.style()
}

@Composable
private fun WrapperIconButtonView.applyState(state: State): ButtonStyle {
    return when (state) {
        State.Default -> Default
        State.Secondary -> Secondary
        State.Accent -> Accent
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        State.Clear -> Clear
        State.Dark -> Dark
        State.Black -> Black
        State.White -> White
    }.style()
}

@Composable
private fun WrapperLinkButtonView.applyState(state: State): ButtonStyle {
    return when (state) {
        State.Default -> Default
        State.Secondary -> Secondary
        State.Accent -> Accent
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        else -> Default
    }.style()
}
