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
}

/**
 * Возвращает [ButtonStyle] для [LinkButtonStyles]
 */
@Composable
public fun LinkButtonStyles.style(modifyAction: @Composable LinkButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
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
    return builder.modify(modifyAction).style()
}
