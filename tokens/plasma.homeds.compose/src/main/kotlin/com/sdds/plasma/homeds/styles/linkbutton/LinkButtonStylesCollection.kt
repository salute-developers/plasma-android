// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.linkbutton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента LinkButton
 */
public enum class LinkButtonStyles(
    public val key: String,
) {
    LinkButtonXlDefault("LinkButton.Xl.Default"),
    LinkButtonXlSecondary("LinkButton.Xl.Secondary"),
    LinkButtonXlAccent("LinkButton.Xl.Accent"),
    LinkButtonXlPositive("LinkButton.Xl.Positive"),
    LinkButtonXlNegative("LinkButton.Xl.Negative"),
    LinkButtonXlWarning("LinkButton.Xl.Warning"),
    LinkButtonXlInfo("LinkButton.Xl.Info"),
    LinkButtonLDefault("LinkButton.L.Default"),
    LinkButtonLSecondary("LinkButton.L.Secondary"),
    LinkButtonLAccent("LinkButton.L.Accent"),
    LinkButtonLPositive("LinkButton.L.Positive"),
    LinkButtonLNegative("LinkButton.L.Negative"),
    LinkButtonLWarning("LinkButton.L.Warning"),
    LinkButtonLInfo("LinkButton.L.Info"),
    LinkButtonMDefault("LinkButton.M.Default"),
    LinkButtonMSecondary("LinkButton.M.Secondary"),
    LinkButtonMAccent("LinkButton.M.Accent"),
    LinkButtonMPositive("LinkButton.M.Positive"),
    LinkButtonMNegative("LinkButton.M.Negative"),
    LinkButtonMWarning("LinkButton.M.Warning"),
    LinkButtonMInfo("LinkButton.M.Info"),
    LinkButtonSDefault("LinkButton.S.Default"),
    LinkButtonSSecondary("LinkButton.S.Secondary"),
    LinkButtonSAccent("LinkButton.S.Accent"),
    LinkButtonSPositive("LinkButton.S.Positive"),
    LinkButtonSNegative("LinkButton.S.Negative"),
    LinkButtonSWarning("LinkButton.S.Warning"),
    LinkButtonSInfo("LinkButton.S.Info"),
    LinkButtonXsDefault("LinkButton.Xs.Default"),
    LinkButtonXsSecondary("LinkButton.Xs.Secondary"),
    LinkButtonXsAccent("LinkButton.Xs.Accent"),
    LinkButtonXsPositive("LinkButton.Xs.Positive"),
    LinkButtonXsNegative("LinkButton.Xs.Negative"),
    LinkButtonXsWarning("LinkButton.Xs.Warning"),
    LinkButtonXsInfo("LinkButton.Xs.Info"),
    LinkButtonXxsDefault("LinkButton.Xxs.Default"),
    LinkButtonXxsSecondary("LinkButton.Xxs.Secondary"),
    LinkButtonXxsAccent("LinkButton.Xxs.Accent"),
    LinkButtonXxsPositive("LinkButton.Xxs.Positive"),
    LinkButtonXxsNegative("LinkButton.Xxs.Negative"),
    LinkButtonXxsWarning("LinkButton.Xxs.Warning"),
    LinkButtonXxsInfo("LinkButton.Xxs.Info"),
    ;

    /**
     * Typed API для подбора стиля link-button
     */
    public companion object
}

/**
 * Возможные значения свойства size для link-button
 */
public enum class LinkButtonSize {
    Xl,
    L,
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства view для link-button
 */
public enum class LinkButtonView {
    Default,
    Secondary,
    Accent,
    Positive,
    Negative,
    Warning,
    Info,
}

/**
 * Возвращает [ButtonStyle] для [LinkButtonStyles]
 */
@Composable
public fun LinkButtonStyles.style(modify: @Composable LinkButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        LinkButtonStyles.LinkButtonXlDefault -> LinkButton.Xl.Default
        LinkButtonStyles.LinkButtonXlSecondary -> LinkButton.Xl.Secondary
        LinkButtonStyles.LinkButtonXlAccent -> LinkButton.Xl.Accent
        LinkButtonStyles.LinkButtonXlPositive -> LinkButton.Xl.Positive
        LinkButtonStyles.LinkButtonXlNegative -> LinkButton.Xl.Negative
        LinkButtonStyles.LinkButtonXlWarning -> LinkButton.Xl.Warning
        LinkButtonStyles.LinkButtonXlInfo -> LinkButton.Xl.Info
        LinkButtonStyles.LinkButtonLDefault -> LinkButton.L.Default
        LinkButtonStyles.LinkButtonLSecondary -> LinkButton.L.Secondary
        LinkButtonStyles.LinkButtonLAccent -> LinkButton.L.Accent
        LinkButtonStyles.LinkButtonLPositive -> LinkButton.L.Positive
        LinkButtonStyles.LinkButtonLNegative -> LinkButton.L.Negative
        LinkButtonStyles.LinkButtonLWarning -> LinkButton.L.Warning
        LinkButtonStyles.LinkButtonLInfo -> LinkButton.L.Info
        LinkButtonStyles.LinkButtonMDefault -> LinkButton.M.Default
        LinkButtonStyles.LinkButtonMSecondary -> LinkButton.M.Secondary
        LinkButtonStyles.LinkButtonMAccent -> LinkButton.M.Accent
        LinkButtonStyles.LinkButtonMPositive -> LinkButton.M.Positive
        LinkButtonStyles.LinkButtonMNegative -> LinkButton.M.Negative
        LinkButtonStyles.LinkButtonMWarning -> LinkButton.M.Warning
        LinkButtonStyles.LinkButtonMInfo -> LinkButton.M.Info
        LinkButtonStyles.LinkButtonSDefault -> LinkButton.S.Default
        LinkButtonStyles.LinkButtonSSecondary -> LinkButton.S.Secondary
        LinkButtonStyles.LinkButtonSAccent -> LinkButton.S.Accent
        LinkButtonStyles.LinkButtonSPositive -> LinkButton.S.Positive
        LinkButtonStyles.LinkButtonSNegative -> LinkButton.S.Negative
        LinkButtonStyles.LinkButtonSWarning -> LinkButton.S.Warning
        LinkButtonStyles.LinkButtonSInfo -> LinkButton.S.Info
        LinkButtonStyles.LinkButtonXsDefault -> LinkButton.Xs.Default
        LinkButtonStyles.LinkButtonXsSecondary -> LinkButton.Xs.Secondary
        LinkButtonStyles.LinkButtonXsAccent -> LinkButton.Xs.Accent
        LinkButtonStyles.LinkButtonXsPositive -> LinkButton.Xs.Positive
        LinkButtonStyles.LinkButtonXsNegative -> LinkButton.Xs.Negative
        LinkButtonStyles.LinkButtonXsWarning -> LinkButton.Xs.Warning
        LinkButtonStyles.LinkButtonXsInfo -> LinkButton.Xs.Info
        LinkButtonStyles.LinkButtonXxsDefault -> LinkButton.Xxs.Default
        LinkButtonStyles.LinkButtonXxsSecondary -> LinkButton.Xxs.Secondary
        LinkButtonStyles.LinkButtonXxsAccent -> LinkButton.Xxs.Accent
        LinkButtonStyles.LinkButtonXxsPositive -> LinkButton.Xxs.Positive
        LinkButtonStyles.LinkButtonXxsNegative -> LinkButton.Xxs.Negative
        LinkButtonStyles.LinkButtonXxsWarning -> LinkButton.Xxs.Warning
        LinkButtonStyles.LinkButtonXxsInfo -> LinkButton.Xxs.Info
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [LinkButtonStyles] для link-button
 */
public fun LinkButtonStyles.Companion.resolve(
    size: LinkButtonSize = LinkButtonSize.Xl,
    view: LinkButtonView = LinkButtonView.Default,
): LinkButtonStyles = when {
    size == LinkButtonSize.Xl && view == LinkButtonView.Default ->
        LinkButtonStyles.LinkButtonXlDefault
    size == LinkButtonSize.Xl && view == LinkButtonView.Secondary ->
        LinkButtonStyles.LinkButtonXlSecondary
    size == LinkButtonSize.Xl && view == LinkButtonView.Accent ->
        LinkButtonStyles.LinkButtonXlAccent
    size == LinkButtonSize.Xl && view == LinkButtonView.Positive ->
        LinkButtonStyles.LinkButtonXlPositive
    size == LinkButtonSize.Xl && view == LinkButtonView.Negative ->
        LinkButtonStyles.LinkButtonXlNegative
    size == LinkButtonSize.Xl && view == LinkButtonView.Warning ->
        LinkButtonStyles.LinkButtonXlWarning
    size == LinkButtonSize.Xl && view == LinkButtonView.Info -> LinkButtonStyles.LinkButtonXlInfo
    size == LinkButtonSize.L && view == LinkButtonView.Default ->
        LinkButtonStyles.LinkButtonLDefault
    size == LinkButtonSize.L && view == LinkButtonView.Secondary ->
        LinkButtonStyles.LinkButtonLSecondary
    size == LinkButtonSize.L && view == LinkButtonView.Accent -> LinkButtonStyles.LinkButtonLAccent
    size == LinkButtonSize.L && view == LinkButtonView.Positive ->
        LinkButtonStyles.LinkButtonLPositive
    size == LinkButtonSize.L && view == LinkButtonView.Negative ->
        LinkButtonStyles.LinkButtonLNegative
    size == LinkButtonSize.L && view == LinkButtonView.Warning ->
        LinkButtonStyles.LinkButtonLWarning
    size == LinkButtonSize.L && view == LinkButtonView.Info -> LinkButtonStyles.LinkButtonLInfo
    size == LinkButtonSize.M && view == LinkButtonView.Default ->
        LinkButtonStyles.LinkButtonMDefault
    size == LinkButtonSize.M && view == LinkButtonView.Secondary ->
        LinkButtonStyles.LinkButtonMSecondary
    size == LinkButtonSize.M && view == LinkButtonView.Accent -> LinkButtonStyles.LinkButtonMAccent
    size == LinkButtonSize.M && view == LinkButtonView.Positive ->
        LinkButtonStyles.LinkButtonMPositive
    size == LinkButtonSize.M && view == LinkButtonView.Negative ->
        LinkButtonStyles.LinkButtonMNegative
    size == LinkButtonSize.M && view == LinkButtonView.Warning ->
        LinkButtonStyles.LinkButtonMWarning
    size == LinkButtonSize.M && view == LinkButtonView.Info -> LinkButtonStyles.LinkButtonMInfo
    size == LinkButtonSize.S && view == LinkButtonView.Default ->
        LinkButtonStyles.LinkButtonSDefault
    size == LinkButtonSize.S && view == LinkButtonView.Secondary ->
        LinkButtonStyles.LinkButtonSSecondary
    size == LinkButtonSize.S && view == LinkButtonView.Accent -> LinkButtonStyles.LinkButtonSAccent
    size == LinkButtonSize.S && view == LinkButtonView.Positive ->
        LinkButtonStyles.LinkButtonSPositive
    size == LinkButtonSize.S && view == LinkButtonView.Negative ->
        LinkButtonStyles.LinkButtonSNegative
    size == LinkButtonSize.S && view == LinkButtonView.Warning ->
        LinkButtonStyles.LinkButtonSWarning
    size == LinkButtonSize.S && view == LinkButtonView.Info -> LinkButtonStyles.LinkButtonSInfo
    size == LinkButtonSize.Xs && view == LinkButtonView.Default ->
        LinkButtonStyles.LinkButtonXsDefault
    size == LinkButtonSize.Xs && view == LinkButtonView.Secondary ->
        LinkButtonStyles.LinkButtonXsSecondary
    size == LinkButtonSize.Xs && view == LinkButtonView.Accent ->
        LinkButtonStyles.LinkButtonXsAccent
    size == LinkButtonSize.Xs && view == LinkButtonView.Positive ->
        LinkButtonStyles.LinkButtonXsPositive
    size == LinkButtonSize.Xs && view == LinkButtonView.Negative ->
        LinkButtonStyles.LinkButtonXsNegative
    size == LinkButtonSize.Xs && view == LinkButtonView.Warning ->
        LinkButtonStyles.LinkButtonXsWarning
    size == LinkButtonSize.Xs && view == LinkButtonView.Info -> LinkButtonStyles.LinkButtonXsInfo
    size == LinkButtonSize.Xxs && view == LinkButtonView.Default ->
        LinkButtonStyles.LinkButtonXxsDefault
    size == LinkButtonSize.Xxs && view == LinkButtonView.Secondary ->
        LinkButtonStyles.LinkButtonXxsSecondary
    size == LinkButtonSize.Xxs && view == LinkButtonView.Accent ->
        LinkButtonStyles.LinkButtonXxsAccent
    size == LinkButtonSize.Xxs && view == LinkButtonView.Positive ->
        LinkButtonStyles.LinkButtonXxsPositive
    size == LinkButtonSize.Xxs && view == LinkButtonView.Negative ->
        LinkButtonStyles.LinkButtonXxsNegative
    size == LinkButtonSize.Xxs && view == LinkButtonView.Warning ->
        LinkButtonStyles.LinkButtonXxsWarning
    size == LinkButtonSize.Xxs && view == LinkButtonView.Info -> LinkButtonStyles.LinkButtonXxsInfo
    else -> error("Unsupported link-button style combination")
}

/**
 * Возвращает [ButtonStyle] для link-button
 */
@Composable
public fun LinkButtonStyles.Companion.style(
    size: LinkButtonSize = LinkButtonSize.Xl,
    view: LinkButtonView = LinkButtonView.Default,
    modify: @Composable LinkButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, view).style(modify)
