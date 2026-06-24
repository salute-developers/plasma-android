// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.basicbutton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента BasicButton
 */
public enum class BasicButtonStyles(
    public val key: String,
) {
    BasicButtonXlDefault("BasicButton.Xl.Default"),
    BasicButtonXlSecondary("BasicButton.Xl.Secondary"),
    BasicButtonXlAccent("BasicButton.Xl.Accent"),
    BasicButtonXlPositive("BasicButton.Xl.Positive"),
    BasicButtonXlNegative("BasicButton.Xl.Negative"),
    BasicButtonXlWarning("BasicButton.Xl.Warning"),
    BasicButtonXlClear("BasicButton.Xl.Clear"),
    BasicButtonXlDark("BasicButton.Xl.Dark"),
    BasicButtonXlBlack("BasicButton.Xl.Black"),
    BasicButtonXlWhite("BasicButton.Xl.White"),
    BasicButtonLDefault("BasicButton.L.Default"),
    BasicButtonLSecondary("BasicButton.L.Secondary"),
    BasicButtonLAccent("BasicButton.L.Accent"),
    BasicButtonLPositive("BasicButton.L.Positive"),
    BasicButtonLNegative("BasicButton.L.Negative"),
    BasicButtonLWarning("BasicButton.L.Warning"),
    BasicButtonLClear("BasicButton.L.Clear"),
    BasicButtonLDark("BasicButton.L.Dark"),
    BasicButtonLBlack("BasicButton.L.Black"),
    BasicButtonLWhite("BasicButton.L.White"),
    BasicButtonMDefault("BasicButton.M.Default"),
    BasicButtonMSecondary("BasicButton.M.Secondary"),
    BasicButtonMAccent("BasicButton.M.Accent"),
    BasicButtonMPositive("BasicButton.M.Positive"),
    BasicButtonMNegative("BasicButton.M.Negative"),
    BasicButtonMWarning("BasicButton.M.Warning"),
    BasicButtonMClear("BasicButton.M.Clear"),
    BasicButtonMDark("BasicButton.M.Dark"),
    BasicButtonMBlack("BasicButton.M.Black"),
    BasicButtonMWhite("BasicButton.M.White"),
    BasicButtonSDefault("BasicButton.S.Default"),
    BasicButtonSSecondary("BasicButton.S.Secondary"),
    BasicButtonSAccent("BasicButton.S.Accent"),
    BasicButtonSPositive("BasicButton.S.Positive"),
    BasicButtonSNegative("BasicButton.S.Negative"),
    BasicButtonSWarning("BasicButton.S.Warning"),
    BasicButtonSClear("BasicButton.S.Clear"),
    BasicButtonSDark("BasicButton.S.Dark"),
    BasicButtonSBlack("BasicButton.S.Black"),
    BasicButtonSWhite("BasicButton.S.White"),
    BasicButtonXsDefault("BasicButton.Xs.Default"),
    BasicButtonXsSecondary("BasicButton.Xs.Secondary"),
    BasicButtonXsAccent("BasicButton.Xs.Accent"),
    BasicButtonXsPositive("BasicButton.Xs.Positive"),
    BasicButtonXsNegative("BasicButton.Xs.Negative"),
    BasicButtonXsWarning("BasicButton.Xs.Warning"),
    BasicButtonXsClear("BasicButton.Xs.Clear"),
    BasicButtonXsDark("BasicButton.Xs.Dark"),
    BasicButtonXsBlack("BasicButton.Xs.Black"),
    BasicButtonXsWhite("BasicButton.Xs.White"),
    BasicButtonXxsDefault("BasicButton.Xxs.Default"),
    BasicButtonXxsSecondary("BasicButton.Xxs.Secondary"),
    BasicButtonXxsAccent("BasicButton.Xxs.Accent"),
    BasicButtonXxsPositive("BasicButton.Xxs.Positive"),
    BasicButtonXxsNegative("BasicButton.Xxs.Negative"),
    BasicButtonXxsWarning("BasicButton.Xxs.Warning"),
    BasicButtonXxsClear("BasicButton.Xxs.Clear"),
    BasicButtonXxsDark("BasicButton.Xxs.Dark"),
    BasicButtonXxsBlack("BasicButton.Xxs.Black"),
    BasicButtonXxsWhite("BasicButton.Xxs.White"),
    ;

    /**
     * Typed API для подбора стиля basic-button
     */
    public companion object
}

/**
 * Возможные значения свойства size для basic-button
 */
public enum class BasicButtonSize {
    Xl,
    L,
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства view для basic-button
 */
public enum class BasicButtonView {
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
 * Возвращает [ButtonStyle] для [BasicButtonStyles]
 */
@Composable
public fun BasicButtonStyles.style(modify: @Composable BasicButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        BasicButtonStyles.BasicButtonXlDefault -> BasicButton.Xl.Default
        BasicButtonStyles.BasicButtonXlSecondary -> BasicButton.Xl.Secondary
        BasicButtonStyles.BasicButtonXlAccent -> BasicButton.Xl.Accent
        BasicButtonStyles.BasicButtonXlPositive -> BasicButton.Xl.Positive
        BasicButtonStyles.BasicButtonXlNegative -> BasicButton.Xl.Negative
        BasicButtonStyles.BasicButtonXlWarning -> BasicButton.Xl.Warning
        BasicButtonStyles.BasicButtonXlClear -> BasicButton.Xl.Clear
        BasicButtonStyles.BasicButtonXlDark -> BasicButton.Xl.Dark
        BasicButtonStyles.BasicButtonXlBlack -> BasicButton.Xl.Black
        BasicButtonStyles.BasicButtonXlWhite -> BasicButton.Xl.White
        BasicButtonStyles.BasicButtonLDefault -> BasicButton.L.Default
        BasicButtonStyles.BasicButtonLSecondary -> BasicButton.L.Secondary
        BasicButtonStyles.BasicButtonLAccent -> BasicButton.L.Accent
        BasicButtonStyles.BasicButtonLPositive -> BasicButton.L.Positive
        BasicButtonStyles.BasicButtonLNegative -> BasicButton.L.Negative
        BasicButtonStyles.BasicButtonLWarning -> BasicButton.L.Warning
        BasicButtonStyles.BasicButtonLClear -> BasicButton.L.Clear
        BasicButtonStyles.BasicButtonLDark -> BasicButton.L.Dark
        BasicButtonStyles.BasicButtonLBlack -> BasicButton.L.Black
        BasicButtonStyles.BasicButtonLWhite -> BasicButton.L.White
        BasicButtonStyles.BasicButtonMDefault -> BasicButton.M.Default
        BasicButtonStyles.BasicButtonMSecondary -> BasicButton.M.Secondary
        BasicButtonStyles.BasicButtonMAccent -> BasicButton.M.Accent
        BasicButtonStyles.BasicButtonMPositive -> BasicButton.M.Positive
        BasicButtonStyles.BasicButtonMNegative -> BasicButton.M.Negative
        BasicButtonStyles.BasicButtonMWarning -> BasicButton.M.Warning
        BasicButtonStyles.BasicButtonMClear -> BasicButton.M.Clear
        BasicButtonStyles.BasicButtonMDark -> BasicButton.M.Dark
        BasicButtonStyles.BasicButtonMBlack -> BasicButton.M.Black
        BasicButtonStyles.BasicButtonMWhite -> BasicButton.M.White
        BasicButtonStyles.BasicButtonSDefault -> BasicButton.S.Default
        BasicButtonStyles.BasicButtonSSecondary -> BasicButton.S.Secondary
        BasicButtonStyles.BasicButtonSAccent -> BasicButton.S.Accent
        BasicButtonStyles.BasicButtonSPositive -> BasicButton.S.Positive
        BasicButtonStyles.BasicButtonSNegative -> BasicButton.S.Negative
        BasicButtonStyles.BasicButtonSWarning -> BasicButton.S.Warning
        BasicButtonStyles.BasicButtonSClear -> BasicButton.S.Clear
        BasicButtonStyles.BasicButtonSDark -> BasicButton.S.Dark
        BasicButtonStyles.BasicButtonSBlack -> BasicButton.S.Black
        BasicButtonStyles.BasicButtonSWhite -> BasicButton.S.White
        BasicButtonStyles.BasicButtonXsDefault -> BasicButton.Xs.Default
        BasicButtonStyles.BasicButtonXsSecondary -> BasicButton.Xs.Secondary
        BasicButtonStyles.BasicButtonXsAccent -> BasicButton.Xs.Accent
        BasicButtonStyles.BasicButtonXsPositive -> BasicButton.Xs.Positive
        BasicButtonStyles.BasicButtonXsNegative -> BasicButton.Xs.Negative
        BasicButtonStyles.BasicButtonXsWarning -> BasicButton.Xs.Warning
        BasicButtonStyles.BasicButtonXsClear -> BasicButton.Xs.Clear
        BasicButtonStyles.BasicButtonXsDark -> BasicButton.Xs.Dark
        BasicButtonStyles.BasicButtonXsBlack -> BasicButton.Xs.Black
        BasicButtonStyles.BasicButtonXsWhite -> BasicButton.Xs.White
        BasicButtonStyles.BasicButtonXxsDefault -> BasicButton.Xxs.Default
        BasicButtonStyles.BasicButtonXxsSecondary -> BasicButton.Xxs.Secondary
        BasicButtonStyles.BasicButtonXxsAccent -> BasicButton.Xxs.Accent
        BasicButtonStyles.BasicButtonXxsPositive -> BasicButton.Xxs.Positive
        BasicButtonStyles.BasicButtonXxsNegative -> BasicButton.Xxs.Negative
        BasicButtonStyles.BasicButtonXxsWarning -> BasicButton.Xxs.Warning
        BasicButtonStyles.BasicButtonXxsClear -> BasicButton.Xxs.Clear
        BasicButtonStyles.BasicButtonXxsDark -> BasicButton.Xxs.Dark
        BasicButtonStyles.BasicButtonXxsBlack -> BasicButton.Xxs.Black
        BasicButtonStyles.BasicButtonXxsWhite -> BasicButton.Xxs.White
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [BasicButtonStyles] для basic-button
 */
public fun BasicButtonStyles.Companion.resolve(
    size: BasicButtonSize = BasicButtonSize.Xl,
    view: BasicButtonView = BasicButtonView.Default,
): BasicButtonStyles = when {
    size == BasicButtonSize.Xl && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonXlDefault
    size == BasicButtonSize.Xl && view == BasicButtonView.Secondary ->
        BasicButtonStyles.BasicButtonXlSecondary
    size == BasicButtonSize.Xl && view == BasicButtonView.Accent ->
        BasicButtonStyles.BasicButtonXlAccent
    size == BasicButtonSize.Xl && view == BasicButtonView.Positive ->
        BasicButtonStyles.BasicButtonXlPositive
    size == BasicButtonSize.Xl && view == BasicButtonView.Negative ->
        BasicButtonStyles.BasicButtonXlNegative
    size == BasicButtonSize.Xl && view == BasicButtonView.Warning ->
        BasicButtonStyles.BasicButtonXlWarning
    size == BasicButtonSize.Xl && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonXlClear
    size == BasicButtonSize.Xl && view == BasicButtonView.Dark ->
        BasicButtonStyles.BasicButtonXlDark
    size == BasicButtonSize.Xl && view == BasicButtonView.Black ->
        BasicButtonStyles.BasicButtonXlBlack
    size == BasicButtonSize.Xl && view == BasicButtonView.White ->
        BasicButtonStyles.BasicButtonXlWhite
    size == BasicButtonSize.L && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonLDefault
    size == BasicButtonSize.L && view == BasicButtonView.Secondary ->
        BasicButtonStyles.BasicButtonLSecondary
    size == BasicButtonSize.L && view == BasicButtonView.Accent ->
        BasicButtonStyles.BasicButtonLAccent
    size == BasicButtonSize.L && view == BasicButtonView.Positive ->
        BasicButtonStyles.BasicButtonLPositive
    size == BasicButtonSize.L && view == BasicButtonView.Negative ->
        BasicButtonStyles.BasicButtonLNegative
    size == BasicButtonSize.L && view == BasicButtonView.Warning ->
        BasicButtonStyles.BasicButtonLWarning
    size == BasicButtonSize.L && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonLClear
    size == BasicButtonSize.L && view == BasicButtonView.Dark -> BasicButtonStyles.BasicButtonLDark
    size == BasicButtonSize.L && view == BasicButtonView.Black ->
        BasicButtonStyles.BasicButtonLBlack
    size == BasicButtonSize.L && view == BasicButtonView.White ->
        BasicButtonStyles.BasicButtonLWhite
    size == BasicButtonSize.M && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonMDefault
    size == BasicButtonSize.M && view == BasicButtonView.Secondary ->
        BasicButtonStyles.BasicButtonMSecondary
    size == BasicButtonSize.M && view == BasicButtonView.Accent ->
        BasicButtonStyles.BasicButtonMAccent
    size == BasicButtonSize.M && view == BasicButtonView.Positive ->
        BasicButtonStyles.BasicButtonMPositive
    size == BasicButtonSize.M && view == BasicButtonView.Negative ->
        BasicButtonStyles.BasicButtonMNegative
    size == BasicButtonSize.M && view == BasicButtonView.Warning ->
        BasicButtonStyles.BasicButtonMWarning
    size == BasicButtonSize.M && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonMClear
    size == BasicButtonSize.M && view == BasicButtonView.Dark -> BasicButtonStyles.BasicButtonMDark
    size == BasicButtonSize.M && view == BasicButtonView.Black ->
        BasicButtonStyles.BasicButtonMBlack
    size == BasicButtonSize.M && view == BasicButtonView.White ->
        BasicButtonStyles.BasicButtonMWhite
    size == BasicButtonSize.S && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonSDefault
    size == BasicButtonSize.S && view == BasicButtonView.Secondary ->
        BasicButtonStyles.BasicButtonSSecondary
    size == BasicButtonSize.S && view == BasicButtonView.Accent ->
        BasicButtonStyles.BasicButtonSAccent
    size == BasicButtonSize.S && view == BasicButtonView.Positive ->
        BasicButtonStyles.BasicButtonSPositive
    size == BasicButtonSize.S && view == BasicButtonView.Negative ->
        BasicButtonStyles.BasicButtonSNegative
    size == BasicButtonSize.S && view == BasicButtonView.Warning ->
        BasicButtonStyles.BasicButtonSWarning
    size == BasicButtonSize.S && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonSClear
    size == BasicButtonSize.S && view == BasicButtonView.Dark -> BasicButtonStyles.BasicButtonSDark
    size == BasicButtonSize.S && view == BasicButtonView.Black ->
        BasicButtonStyles.BasicButtonSBlack
    size == BasicButtonSize.S && view == BasicButtonView.White ->
        BasicButtonStyles.BasicButtonSWhite
    size == BasicButtonSize.Xs && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonXsDefault
    size == BasicButtonSize.Xs && view == BasicButtonView.Secondary ->
        BasicButtonStyles.BasicButtonXsSecondary
    size == BasicButtonSize.Xs && view == BasicButtonView.Accent ->
        BasicButtonStyles.BasicButtonXsAccent
    size == BasicButtonSize.Xs && view == BasicButtonView.Positive ->
        BasicButtonStyles.BasicButtonXsPositive
    size == BasicButtonSize.Xs && view == BasicButtonView.Negative ->
        BasicButtonStyles.BasicButtonXsNegative
    size == BasicButtonSize.Xs && view == BasicButtonView.Warning ->
        BasicButtonStyles.BasicButtonXsWarning
    size == BasicButtonSize.Xs && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonXsClear
    size == BasicButtonSize.Xs && view == BasicButtonView.Dark ->
        BasicButtonStyles.BasicButtonXsDark
    size == BasicButtonSize.Xs && view == BasicButtonView.Black ->
        BasicButtonStyles.BasicButtonXsBlack
    size == BasicButtonSize.Xs && view == BasicButtonView.White ->
        BasicButtonStyles.BasicButtonXsWhite
    size == BasicButtonSize.Xxs && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonXxsDefault
    size == BasicButtonSize.Xxs && view == BasicButtonView.Secondary ->
        BasicButtonStyles.BasicButtonXxsSecondary
    size == BasicButtonSize.Xxs && view == BasicButtonView.Accent ->
        BasicButtonStyles.BasicButtonXxsAccent
    size == BasicButtonSize.Xxs && view == BasicButtonView.Positive ->
        BasicButtonStyles.BasicButtonXxsPositive
    size == BasicButtonSize.Xxs && view == BasicButtonView.Negative ->
        BasicButtonStyles.BasicButtonXxsNegative
    size == BasicButtonSize.Xxs && view == BasicButtonView.Warning ->
        BasicButtonStyles.BasicButtonXxsWarning
    size == BasicButtonSize.Xxs && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonXxsClear
    size == BasicButtonSize.Xxs && view == BasicButtonView.Dark ->
        BasicButtonStyles.BasicButtonXxsDark
    size == BasicButtonSize.Xxs && view == BasicButtonView.Black ->
        BasicButtonStyles.BasicButtonXxsBlack
    size == BasicButtonSize.Xxs && view == BasicButtonView.White ->
        BasicButtonStyles.BasicButtonXxsWhite
    else -> error("Unsupported basic-button style combination")
}

/**
 * Возвращает [ButtonStyle] для basic-button
 */
@Composable
public fun BasicButtonStyles.Companion.style(
    size: BasicButtonSize = BasicButtonSize.Xl,
    view: BasicButtonView = BasicButtonView.Default,
    modify: @Composable BasicButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, view).style(modify)
