// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.finai.styles.linkbutton

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
    LinkButtonSDefault("LinkButton.S.Default"),
    LinkButtonSSecondary("LinkButton.S.Secondary"),
    LinkButtonSAccent("LinkButton.S.Accent"),
    LinkButtonSPositive("LinkButton.S.Positive"),
    LinkButtonSNegative("LinkButton.S.Negative"),
    LinkButtonSWarning("LinkButton.S.Warning"),
    LinkButtonXsDefault("LinkButton.Xs.Default"),
    LinkButtonXsSecondary("LinkButton.Xs.Secondary"),
    LinkButtonXsAccent("LinkButton.Xs.Accent"),
    LinkButtonXsPositive("LinkButton.Xs.Positive"),
    LinkButtonXsNegative("LinkButton.Xs.Negative"),
    LinkButtonXsWarning("LinkButton.Xs.Warning"),
    LinkButtonXxsDefault("LinkButton.Xxs.Default"),
    LinkButtonXxsSecondary("LinkButton.Xxs.Secondary"),
    LinkButtonXxsAccent("LinkButton.Xxs.Accent"),
    LinkButtonXxsPositive("LinkButton.Xxs.Positive"),
    LinkButtonXxsNegative("LinkButton.Xxs.Negative"),
    LinkButtonXxsWarning("LinkButton.Xxs.Warning"),
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
}

/**
 * Возвращает [ButtonStyle] для [LinkButtonStyles]
 */
@Composable
public fun LinkButtonStyles.style(modify: @Composable LinkButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        LinkButtonStyles.LinkButtonSDefault -> LinkButton.S.Default
        LinkButtonStyles.LinkButtonSSecondary -> LinkButton.S.Secondary
        LinkButtonStyles.LinkButtonSAccent -> LinkButton.S.Accent
        LinkButtonStyles.LinkButtonSPositive -> LinkButton.S.Positive
        LinkButtonStyles.LinkButtonSNegative -> LinkButton.S.Negative
        LinkButtonStyles.LinkButtonSWarning -> LinkButton.S.Warning
        LinkButtonStyles.LinkButtonXsDefault -> LinkButton.Xs.Default
        LinkButtonStyles.LinkButtonXsSecondary -> LinkButton.Xs.Secondary
        LinkButtonStyles.LinkButtonXsAccent -> LinkButton.Xs.Accent
        LinkButtonStyles.LinkButtonXsPositive -> LinkButton.Xs.Positive
        LinkButtonStyles.LinkButtonXsNegative -> LinkButton.Xs.Negative
        LinkButtonStyles.LinkButtonXsWarning -> LinkButton.Xs.Warning
        LinkButtonStyles.LinkButtonXxsDefault -> LinkButton.Xxs.Default
        LinkButtonStyles.LinkButtonXxsSecondary -> LinkButton.Xxs.Secondary
        LinkButtonStyles.LinkButtonXxsAccent -> LinkButton.Xxs.Accent
        LinkButtonStyles.LinkButtonXxsPositive -> LinkButton.Xxs.Positive
        LinkButtonStyles.LinkButtonXxsNegative -> LinkButton.Xxs.Negative
        LinkButtonStyles.LinkButtonXxsWarning -> LinkButton.Xxs.Warning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [LinkButtonStyles] для link-button
 */
public fun LinkButtonStyles.Companion.resolve(
    size: LinkButtonSize = LinkButtonSize.S,
    view: LinkButtonView = LinkButtonView.Default,
): LinkButtonStyles = when {
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
    else -> error("Unsupported link-button style combination")
}

/**
 * Возвращает [ButtonStyle] для link-button
 */
@Composable
public fun LinkButtonStyles.Companion.style(
    size: LinkButtonSize = LinkButtonSize.S,
    view: LinkButtonView = LinkButtonView.Default,
    modify: @Composable LinkButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, view).style(modify)
