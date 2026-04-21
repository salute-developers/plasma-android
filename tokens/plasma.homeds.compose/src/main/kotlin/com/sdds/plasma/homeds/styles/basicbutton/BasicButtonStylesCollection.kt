// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.basicbutton

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
    BasicButtonMDefault("BasicButton.M.Default"),
    BasicButtonMSecondary("BasicButton.M.Secondary"),
    BasicButtonMDark("BasicButton.M.Dark"),
    BasicButtonMNegative("BasicButton.M.Negative"),
    BasicButtonMWarning("BasicButton.M.Warning"),
    BasicButtonMAccent("BasicButton.M.Accent"),
    BasicButtonMClear("BasicButton.M.Clear"),
    BasicButtonSDefault("BasicButton.S.Default"),
    BasicButtonSSecondary("BasicButton.S.Secondary"),
    BasicButtonSDark("BasicButton.S.Dark"),
    BasicButtonSNegative("BasicButton.S.Negative"),
    BasicButtonSWarning("BasicButton.S.Warning"),
    BasicButtonSAccent("BasicButton.S.Accent"),
    BasicButtonSClear("BasicButton.S.Clear"),
    BasicButtonXsDefault("BasicButton.Xs.Default"),
    BasicButtonXsSecondary("BasicButton.Xs.Secondary"),
    BasicButtonXsDark("BasicButton.Xs.Dark"),
    BasicButtonXsNegative("BasicButton.Xs.Negative"),
    BasicButtonXsWarning("BasicButton.Xs.Warning"),
    BasicButtonXsAccent("BasicButton.Xs.Accent"),
    BasicButtonXsClear("BasicButton.Xs.Clear"),
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
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для basic-button
 */
public enum class BasicButtonView {
    Default,
    Secondary,
    Dark,
    Negative,
    Warning,
    Accent,
    Clear,
}

/**
 * Возвращает [ButtonStyle] для [BasicButtonStyles]
 */
@Composable
public fun BasicButtonStyles.style(modify: @Composable BasicButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        BasicButtonStyles.BasicButtonMDefault -> BasicButton.M.Default
        BasicButtonStyles.BasicButtonMSecondary -> BasicButton.M.Secondary
        BasicButtonStyles.BasicButtonMDark -> BasicButton.M.Dark
        BasicButtonStyles.BasicButtonMNegative -> BasicButton.M.Negative
        BasicButtonStyles.BasicButtonMWarning -> BasicButton.M.Warning
        BasicButtonStyles.BasicButtonMAccent -> BasicButton.M.Accent
        BasicButtonStyles.BasicButtonMClear -> BasicButton.M.Clear
        BasicButtonStyles.BasicButtonSDefault -> BasicButton.S.Default
        BasicButtonStyles.BasicButtonSSecondary -> BasicButton.S.Secondary
        BasicButtonStyles.BasicButtonSDark -> BasicButton.S.Dark
        BasicButtonStyles.BasicButtonSNegative -> BasicButton.S.Negative
        BasicButtonStyles.BasicButtonSWarning -> BasicButton.S.Warning
        BasicButtonStyles.BasicButtonSAccent -> BasicButton.S.Accent
        BasicButtonStyles.BasicButtonSClear -> BasicButton.S.Clear
        BasicButtonStyles.BasicButtonXsDefault -> BasicButton.Xs.Default
        BasicButtonStyles.BasicButtonXsSecondary -> BasicButton.Xs.Secondary
        BasicButtonStyles.BasicButtonXsDark -> BasicButton.Xs.Dark
        BasicButtonStyles.BasicButtonXsNegative -> BasicButton.Xs.Negative
        BasicButtonStyles.BasicButtonXsWarning -> BasicButton.Xs.Warning
        BasicButtonStyles.BasicButtonXsAccent -> BasicButton.Xs.Accent
        BasicButtonStyles.BasicButtonXsClear -> BasicButton.Xs.Clear
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [BasicButtonStyles] для basic-button
 */
public fun BasicButtonStyles.Companion.resolve(size: BasicButtonSize, view: BasicButtonView): BasicButtonStyles = when {
    size == BasicButtonSize.M && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonMDefault
    size == BasicButtonSize.M && view == BasicButtonView.Secondary ->
        BasicButtonStyles.BasicButtonMSecondary
    size == BasicButtonSize.M && view == BasicButtonView.Dark -> BasicButtonStyles.BasicButtonMDark
    size == BasicButtonSize.M && view == BasicButtonView.Negative ->
        BasicButtonStyles.BasicButtonMNegative
    size == BasicButtonSize.M && view == BasicButtonView.Warning ->
        BasicButtonStyles.BasicButtonMWarning
    size == BasicButtonSize.M && view == BasicButtonView.Accent ->
        BasicButtonStyles.BasicButtonMAccent
    size == BasicButtonSize.M && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonMClear
    size == BasicButtonSize.S && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonSDefault
    size == BasicButtonSize.S && view == BasicButtonView.Secondary ->
        BasicButtonStyles.BasicButtonSSecondary
    size == BasicButtonSize.S && view == BasicButtonView.Dark -> BasicButtonStyles.BasicButtonSDark
    size == BasicButtonSize.S && view == BasicButtonView.Negative ->
        BasicButtonStyles.BasicButtonSNegative
    size == BasicButtonSize.S && view == BasicButtonView.Warning ->
        BasicButtonStyles.BasicButtonSWarning
    size == BasicButtonSize.S && view == BasicButtonView.Accent ->
        BasicButtonStyles.BasicButtonSAccent
    size == BasicButtonSize.S && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonSClear
    size == BasicButtonSize.Xs && view == BasicButtonView.Default ->
        BasicButtonStyles.BasicButtonXsDefault
    size == BasicButtonSize.Xs && view == BasicButtonView.Secondary ->
        BasicButtonStyles.BasicButtonXsSecondary
    size == BasicButtonSize.Xs && view == BasicButtonView.Dark ->
        BasicButtonStyles.BasicButtonXsDark
    size == BasicButtonSize.Xs && view == BasicButtonView.Negative ->
        BasicButtonStyles.BasicButtonXsNegative
    size == BasicButtonSize.Xs && view == BasicButtonView.Warning ->
        BasicButtonStyles.BasicButtonXsWarning
    size == BasicButtonSize.Xs && view == BasicButtonView.Accent ->
        BasicButtonStyles.BasicButtonXsAccent
    size == BasicButtonSize.Xs && view == BasicButtonView.Clear ->
        BasicButtonStyles.BasicButtonXsClear
    else -> error("Unsupported basic-button style combination")
}

/**
 * Возвращает [ButtonStyle] для basic-button
 */
@Composable
public fun BasicButtonStyles.Companion.style(
    size: BasicButtonSize,
    view: BasicButtonView,
    modify: @Composable BasicButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, view).style(modify)
