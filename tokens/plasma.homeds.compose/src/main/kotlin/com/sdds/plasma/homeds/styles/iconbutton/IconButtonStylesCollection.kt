// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.iconbutton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента IconButton
 */
public enum class IconButtonStyles(
    public val key: String,
) {
    IconButtonLDefault("IconButton.L.Default"),
    IconButtonLSecondary("IconButton.L.Secondary"),
    IconButtonLDark("IconButton.L.Dark"),
    IconButtonLNegative("IconButton.L.Negative"),
    IconButtonLWarning("IconButton.L.Warning"),
    IconButtonLAccent("IconButton.L.Accent"),
    IconButtonLClear("IconButton.L.Clear"),
    IconButtonMDefault("IconButton.M.Default"),
    IconButtonMSecondary("IconButton.M.Secondary"),
    IconButtonMDark("IconButton.M.Dark"),
    IconButtonMNegative("IconButton.M.Negative"),
    IconButtonMWarning("IconButton.M.Warning"),
    IconButtonMAccent("IconButton.M.Accent"),
    IconButtonMClear("IconButton.M.Clear"),
    IconButtonSDefault("IconButton.S.Default"),
    IconButtonSSecondary("IconButton.S.Secondary"),
    IconButtonSDark("IconButton.S.Dark"),
    IconButtonSNegative("IconButton.S.Negative"),
    IconButtonSWarning("IconButton.S.Warning"),
    IconButtonSAccent("IconButton.S.Accent"),
    IconButtonSClear("IconButton.S.Clear"),
    IconButtonXsDefault("IconButton.Xs.Default"),
    IconButtonXsSecondary("IconButton.Xs.Secondary"),
    IconButtonXsDark("IconButton.Xs.Dark"),
    IconButtonXsNegative("IconButton.Xs.Negative"),
    IconButtonXsWarning("IconButton.Xs.Warning"),
    IconButtonXsAccent("IconButton.Xs.Accent"),
    IconButtonXsClear("IconButton.Xs.Clear"),
    ;

    /**
     * Typed API для подбора стиля icon-button
     */
    public companion object
}

/**
 * Возможные значения свойства size для icon-button
 */
public enum class IconButtonSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для icon-button
 */
public enum class IconButtonView {
    Default,
    Secondary,
    Dark,
    Negative,
    Warning,
    Accent,
    Clear,
}

/**
 * Возвращает [ButtonStyle] для [IconButtonStyles]
 */
@Composable
public fun IconButtonStyles.style(modify: @Composable IconButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        IconButtonStyles.IconButtonLDefault -> IconButton.L.Default
        IconButtonStyles.IconButtonLSecondary -> IconButton.L.Secondary
        IconButtonStyles.IconButtonLDark -> IconButton.L.Dark
        IconButtonStyles.IconButtonLNegative -> IconButton.L.Negative
        IconButtonStyles.IconButtonLWarning -> IconButton.L.Warning
        IconButtonStyles.IconButtonLAccent -> IconButton.L.Accent
        IconButtonStyles.IconButtonLClear -> IconButton.L.Clear
        IconButtonStyles.IconButtonMDefault -> IconButton.M.Default
        IconButtonStyles.IconButtonMSecondary -> IconButton.M.Secondary
        IconButtonStyles.IconButtonMDark -> IconButton.M.Dark
        IconButtonStyles.IconButtonMNegative -> IconButton.M.Negative
        IconButtonStyles.IconButtonMWarning -> IconButton.M.Warning
        IconButtonStyles.IconButtonMAccent -> IconButton.M.Accent
        IconButtonStyles.IconButtonMClear -> IconButton.M.Clear
        IconButtonStyles.IconButtonSDefault -> IconButton.S.Default
        IconButtonStyles.IconButtonSSecondary -> IconButton.S.Secondary
        IconButtonStyles.IconButtonSDark -> IconButton.S.Dark
        IconButtonStyles.IconButtonSNegative -> IconButton.S.Negative
        IconButtonStyles.IconButtonSWarning -> IconButton.S.Warning
        IconButtonStyles.IconButtonSAccent -> IconButton.S.Accent
        IconButtonStyles.IconButtonSClear -> IconButton.S.Clear
        IconButtonStyles.IconButtonXsDefault -> IconButton.Xs.Default
        IconButtonStyles.IconButtonXsSecondary -> IconButton.Xs.Secondary
        IconButtonStyles.IconButtonXsDark -> IconButton.Xs.Dark
        IconButtonStyles.IconButtonXsNegative -> IconButton.Xs.Negative
        IconButtonStyles.IconButtonXsWarning -> IconButton.Xs.Warning
        IconButtonStyles.IconButtonXsAccent -> IconButton.Xs.Accent
        IconButtonStyles.IconButtonXsClear -> IconButton.Xs.Clear
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IconButtonStyles] для icon-button
 */
public fun IconButtonStyles.Companion.resolve(
    size: IconButtonSize = IconButtonSize.L,
    view: IconButtonView = IconButtonView.Default,
): IconButtonStyles = when {
    size == IconButtonSize.L && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonLDefault
    size == IconButtonSize.L && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonLSecondary
    size == IconButtonSize.L && view == IconButtonView.Dark -> IconButtonStyles.IconButtonLDark
    size == IconButtonSize.L && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonLNegative
    size == IconButtonSize.L && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonLWarning
    size == IconButtonSize.L && view == IconButtonView.Accent -> IconButtonStyles.IconButtonLAccent
    size == IconButtonSize.L && view == IconButtonView.Clear -> IconButtonStyles.IconButtonLClear
    size == IconButtonSize.M && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonMDefault
    size == IconButtonSize.M && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonMSecondary
    size == IconButtonSize.M && view == IconButtonView.Dark -> IconButtonStyles.IconButtonMDark
    size == IconButtonSize.M && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonMNegative
    size == IconButtonSize.M && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonMWarning
    size == IconButtonSize.M && view == IconButtonView.Accent -> IconButtonStyles.IconButtonMAccent
    size == IconButtonSize.M && view == IconButtonView.Clear -> IconButtonStyles.IconButtonMClear
    size == IconButtonSize.S && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonSDefault
    size == IconButtonSize.S && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonSSecondary
    size == IconButtonSize.S && view == IconButtonView.Dark -> IconButtonStyles.IconButtonSDark
    size == IconButtonSize.S && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonSNegative
    size == IconButtonSize.S && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonSWarning
    size == IconButtonSize.S && view == IconButtonView.Accent -> IconButtonStyles.IconButtonSAccent
    size == IconButtonSize.S && view == IconButtonView.Clear -> IconButtonStyles.IconButtonSClear
    size == IconButtonSize.Xs && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonXsDefault
    size == IconButtonSize.Xs && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonXsSecondary
    size == IconButtonSize.Xs && view == IconButtonView.Dark -> IconButtonStyles.IconButtonXsDark
    size == IconButtonSize.Xs && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonXsNegative
    size == IconButtonSize.Xs && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonXsWarning
    size == IconButtonSize.Xs && view == IconButtonView.Accent ->
        IconButtonStyles.IconButtonXsAccent
    size == IconButtonSize.Xs && view == IconButtonView.Clear -> IconButtonStyles.IconButtonXsClear
    else -> error("Unsupported icon-button style combination")
}

/**
 * Возвращает [ButtonStyle] для icon-button
 */
@Composable
public fun IconButtonStyles.Companion.style(
    size: IconButtonSize = IconButtonSize.L,
    view: IconButtonView = IconButtonView.Default,
    modify: @Composable IconButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, view).style(modify)
