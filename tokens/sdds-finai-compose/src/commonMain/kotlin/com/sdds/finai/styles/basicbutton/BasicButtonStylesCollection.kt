// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.finai.styles.basicbutton

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
    size: BasicButtonSize = BasicButtonSize.S,
    view: BasicButtonView = BasicButtonView.Default,
): BasicButtonStyles = when {
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
    size: BasicButtonSize = BasicButtonSize.S,
    view: BasicButtonView = BasicButtonView.Default,
    modify: @Composable BasicButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, view).style(modify)
