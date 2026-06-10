// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.iconbutton

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
    IconButtonXlDefault("IconButton.Xl.Default"),
    IconButtonXlSecondary("IconButton.Xl.Secondary"),
    IconButtonXlAccent("IconButton.Xl.Accent"),
    IconButtonXlPositive("IconButton.Xl.Positive"),
    IconButtonXlNegative("IconButton.Xl.Negative"),
    IconButtonXlWarning("IconButton.Xl.Warning"),
    IconButtonXlClear("IconButton.Xl.Clear"),
    IconButtonXlDark("IconButton.Xl.Dark"),
    IconButtonXlBlack("IconButton.Xl.Black"),
    IconButtonXlWhite("IconButton.Xl.White"),
    IconButtonXlPilledDefault("IconButton.Xl.Pilled.Default"),
    IconButtonXlPilledSecondary("IconButton.Xl.Pilled.Secondary"),
    IconButtonXlPilledAccent("IconButton.Xl.Pilled.Accent"),
    IconButtonXlPilledPositive("IconButton.Xl.Pilled.Positive"),
    IconButtonXlPilledNegative("IconButton.Xl.Pilled.Negative"),
    IconButtonXlPilledWarning("IconButton.Xl.Pilled.Warning"),
    IconButtonXlPilledClear("IconButton.Xl.Pilled.Clear"),
    IconButtonXlPilledDark("IconButton.Xl.Pilled.Dark"),
    IconButtonXlPilledBlack("IconButton.Xl.Pilled.Black"),
    IconButtonXlPilledWhite("IconButton.Xl.Pilled.White"),
    IconButtonLDefault("IconButton.L.Default"),
    IconButtonLSecondary("IconButton.L.Secondary"),
    IconButtonLAccent("IconButton.L.Accent"),
    IconButtonLPositive("IconButton.L.Positive"),
    IconButtonLNegative("IconButton.L.Negative"),
    IconButtonLWarning("IconButton.L.Warning"),
    IconButtonLClear("IconButton.L.Clear"),
    IconButtonLDark("IconButton.L.Dark"),
    IconButtonLBlack("IconButton.L.Black"),
    IconButtonLWhite("IconButton.L.White"),
    IconButtonLPilledDefault("IconButton.L.Pilled.Default"),
    IconButtonLPilledSecondary("IconButton.L.Pilled.Secondary"),
    IconButtonLPilledAccent("IconButton.L.Pilled.Accent"),
    IconButtonLPilledPositive("IconButton.L.Pilled.Positive"),
    IconButtonLPilledNegative("IconButton.L.Pilled.Negative"),
    IconButtonLPilledWarning("IconButton.L.Pilled.Warning"),
    IconButtonLPilledClear("IconButton.L.Pilled.Clear"),
    IconButtonLPilledDark("IconButton.L.Pilled.Dark"),
    IconButtonLPilledBlack("IconButton.L.Pilled.Black"),
    IconButtonLPilledWhite("IconButton.L.Pilled.White"),
    IconButtonMDefault("IconButton.M.Default"),
    IconButtonMSecondary("IconButton.M.Secondary"),
    IconButtonMAccent("IconButton.M.Accent"),
    IconButtonMPositive("IconButton.M.Positive"),
    IconButtonMNegative("IconButton.M.Negative"),
    IconButtonMWarning("IconButton.M.Warning"),
    IconButtonMClear("IconButton.M.Clear"),
    IconButtonMDark("IconButton.M.Dark"),
    IconButtonMBlack("IconButton.M.Black"),
    IconButtonMWhite("IconButton.M.White"),
    IconButtonMPilledDefault("IconButton.M.Pilled.Default"),
    IconButtonMPilledSecondary("IconButton.M.Pilled.Secondary"),
    IconButtonMPilledAccent("IconButton.M.Pilled.Accent"),
    IconButtonMPilledPositive("IconButton.M.Pilled.Positive"),
    IconButtonMPilledNegative("IconButton.M.Pilled.Negative"),
    IconButtonMPilledWarning("IconButton.M.Pilled.Warning"),
    IconButtonMPilledClear("IconButton.M.Pilled.Clear"),
    IconButtonMPilledDark("IconButton.M.Pilled.Dark"),
    IconButtonMPilledBlack("IconButton.M.Pilled.Black"),
    IconButtonMPilledWhite("IconButton.M.Pilled.White"),
    IconButtonSDefault("IconButton.S.Default"),
    IconButtonSSecondary("IconButton.S.Secondary"),
    IconButtonSAccent("IconButton.S.Accent"),
    IconButtonSPositive("IconButton.S.Positive"),
    IconButtonSNegative("IconButton.S.Negative"),
    IconButtonSWarning("IconButton.S.Warning"),
    IconButtonSClear("IconButton.S.Clear"),
    IconButtonSDark("IconButton.S.Dark"),
    IconButtonSBlack("IconButton.S.Black"),
    IconButtonSWhite("IconButton.S.White"),
    IconButtonSPilledDefault("IconButton.S.Pilled.Default"),
    IconButtonSPilledSecondary("IconButton.S.Pilled.Secondary"),
    IconButtonSPilledAccent("IconButton.S.Pilled.Accent"),
    IconButtonSPilledPositive("IconButton.S.Pilled.Positive"),
    IconButtonSPilledNegative("IconButton.S.Pilled.Negative"),
    IconButtonSPilledWarning("IconButton.S.Pilled.Warning"),
    IconButtonSPilledClear("IconButton.S.Pilled.Clear"),
    IconButtonSPilledDark("IconButton.S.Pilled.Dark"),
    IconButtonSPilledBlack("IconButton.S.Pilled.Black"),
    IconButtonSPilledWhite("IconButton.S.Pilled.White"),
    IconButtonXsDefault("IconButton.Xs.Default"),
    IconButtonXsSecondary("IconButton.Xs.Secondary"),
    IconButtonXsAccent("IconButton.Xs.Accent"),
    IconButtonXsPositive("IconButton.Xs.Positive"),
    IconButtonXsNegative("IconButton.Xs.Negative"),
    IconButtonXsWarning("IconButton.Xs.Warning"),
    IconButtonXsClear("IconButton.Xs.Clear"),
    IconButtonXsDark("IconButton.Xs.Dark"),
    IconButtonXsBlack("IconButton.Xs.Black"),
    IconButtonXsWhite("IconButton.Xs.White"),
    IconButtonXsPilledDefault("IconButton.Xs.Pilled.Default"),
    IconButtonXsPilledSecondary("IconButton.Xs.Pilled.Secondary"),
    IconButtonXsPilledAccent("IconButton.Xs.Pilled.Accent"),
    IconButtonXsPilledPositive("IconButton.Xs.Pilled.Positive"),
    IconButtonXsPilledNegative("IconButton.Xs.Pilled.Negative"),
    IconButtonXsPilledWarning("IconButton.Xs.Pilled.Warning"),
    IconButtonXsPilledClear("IconButton.Xs.Pilled.Clear"),
    IconButtonXsPilledDark("IconButton.Xs.Pilled.Dark"),
    IconButtonXsPilledBlack("IconButton.Xs.Pilled.Black"),
    IconButtonXsPilledWhite("IconButton.Xs.Pilled.White"),
    IconButtonXxsDefault("IconButton.Xxs.Default"),
    IconButtonXxsSecondary("IconButton.Xxs.Secondary"),
    IconButtonXxsAccent("IconButton.Xxs.Accent"),
    IconButtonXxsPositive("IconButton.Xxs.Positive"),
    IconButtonXxsNegative("IconButton.Xxs.Negative"),
    IconButtonXxsWarning("IconButton.Xxs.Warning"),
    IconButtonXxsClear("IconButton.Xxs.Clear"),
    IconButtonXxsDark("IconButton.Xxs.Dark"),
    IconButtonXxsBlack("IconButton.Xxs.Black"),
    IconButtonXxsWhite("IconButton.Xxs.White"),
    IconButtonXxsPilledDefault("IconButton.Xxs.Pilled.Default"),
    IconButtonXxsPilledSecondary("IconButton.Xxs.Pilled.Secondary"),
    IconButtonXxsPilledAccent("IconButton.Xxs.Pilled.Accent"),
    IconButtonXxsPilledPositive("IconButton.Xxs.Pilled.Positive"),
    IconButtonXxsPilledNegative("IconButton.Xxs.Pilled.Negative"),
    IconButtonXxsPilledWarning("IconButton.Xxs.Pilled.Warning"),
    IconButtonXxsPilledClear("IconButton.Xxs.Pilled.Clear"),
    IconButtonXxsPilledDark("IconButton.Xxs.Pilled.Dark"),
    IconButtonXxsPilledBlack("IconButton.Xxs.Pilled.Black"),
    IconButtonXxsPilledWhite("IconButton.Xxs.Pilled.White"),
    AiHeaderEmbeddedIconButtonXlDefault("AiHeaderEmbeddedIconButton.Xl.Default"),
    AiHeaderEmbeddedIconButtonXlSecondary("AiHeaderEmbeddedIconButton.Xl.Secondary"),
    AiHeaderEmbeddedIconButtonXlAccent("AiHeaderEmbeddedIconButton.Xl.Accent"),
    AiHeaderEmbeddedIconButtonXlPositive("AiHeaderEmbeddedIconButton.Xl.Positive"),
    AiHeaderEmbeddedIconButtonXlNegative("AiHeaderEmbeddedIconButton.Xl.Negative"),
    AiHeaderEmbeddedIconButtonXlWarning("AiHeaderEmbeddedIconButton.Xl.Warning"),
    AiHeaderEmbeddedIconButtonXlInfo("AiHeaderEmbeddedIconButton.Xl.Info"),
    AiHeaderEmbeddedIconButtonLDefault("AiHeaderEmbeddedIconButton.L.Default"),
    AiHeaderEmbeddedIconButtonLSecondary("AiHeaderEmbeddedIconButton.L.Secondary"),
    AiHeaderEmbeddedIconButtonLAccent("AiHeaderEmbeddedIconButton.L.Accent"),
    AiHeaderEmbeddedIconButtonLPositive("AiHeaderEmbeddedIconButton.L.Positive"),
    AiHeaderEmbeddedIconButtonLNegative("AiHeaderEmbeddedIconButton.L.Negative"),
    AiHeaderEmbeddedIconButtonLWarning("AiHeaderEmbeddedIconButton.L.Warning"),
    AiHeaderEmbeddedIconButtonLInfo("AiHeaderEmbeddedIconButton.L.Info"),
    AiHeaderEmbeddedIconButtonMDefault("AiHeaderEmbeddedIconButton.M.Default"),
    AiHeaderEmbeddedIconButtonMSecondary("AiHeaderEmbeddedIconButton.M.Secondary"),
    AiHeaderEmbeddedIconButtonMAccent("AiHeaderEmbeddedIconButton.M.Accent"),
    AiHeaderEmbeddedIconButtonMPositive("AiHeaderEmbeddedIconButton.M.Positive"),
    AiHeaderEmbeddedIconButtonMNegative("AiHeaderEmbeddedIconButton.M.Negative"),
    AiHeaderEmbeddedIconButtonMWarning("AiHeaderEmbeddedIconButton.M.Warning"),
    AiHeaderEmbeddedIconButtonMInfo("AiHeaderEmbeddedIconButton.M.Info"),
    AiHeaderEmbeddedIconButtonSDefault("AiHeaderEmbeddedIconButton.S.Default"),
    AiHeaderEmbeddedIconButtonSSecondary("AiHeaderEmbeddedIconButton.S.Secondary"),
    AiHeaderEmbeddedIconButtonSAccent("AiHeaderEmbeddedIconButton.S.Accent"),
    AiHeaderEmbeddedIconButtonSPositive("AiHeaderEmbeddedIconButton.S.Positive"),
    AiHeaderEmbeddedIconButtonSNegative("AiHeaderEmbeddedIconButton.S.Negative"),
    AiHeaderEmbeddedIconButtonSWarning("AiHeaderEmbeddedIconButton.S.Warning"),
    AiHeaderEmbeddedIconButtonSInfo("AiHeaderEmbeddedIconButton.S.Info"),
    EmbeddedIconButtonLDefault("EmbeddedIconButton.L.Default"),
    EmbeddedIconButtonLSecondary("EmbeddedIconButton.L.Secondary"),
    EmbeddedIconButtonLAccent("EmbeddedIconButton.L.Accent"),
    EmbeddedIconButtonLPositive("EmbeddedIconButton.L.Positive"),
    EmbeddedIconButtonLNegative("EmbeddedIconButton.L.Negative"),
    EmbeddedIconButtonLWarning("EmbeddedIconButton.L.Warning"),
    EmbeddedIconButtonLInfo("EmbeddedIconButton.L.Info"),
    EmbeddedIconButtonMDefault("EmbeddedIconButton.M.Default"),
    EmbeddedIconButtonMSecondary("EmbeddedIconButton.M.Secondary"),
    EmbeddedIconButtonMAccent("EmbeddedIconButton.M.Accent"),
    EmbeddedIconButtonMPositive("EmbeddedIconButton.M.Positive"),
    EmbeddedIconButtonMNegative("EmbeddedIconButton.M.Negative"),
    EmbeddedIconButtonMWarning("EmbeddedIconButton.M.Warning"),
    EmbeddedIconButtonMInfo("EmbeddedIconButton.M.Info"),
    EmbeddedIconButtonSDefault("EmbeddedIconButton.S.Default"),
    EmbeddedIconButtonSSecondary("EmbeddedIconButton.S.Secondary"),
    EmbeddedIconButtonSAccent("EmbeddedIconButton.S.Accent"),
    EmbeddedIconButtonSPositive("EmbeddedIconButton.S.Positive"),
    EmbeddedIconButtonSNegative("EmbeddedIconButton.S.Negative"),
    EmbeddedIconButtonSWarning("EmbeddedIconButton.S.Warning"),
    EmbeddedIconButtonSInfo("EmbeddedIconButton.S.Info"),
    EmbeddedIconButtonXsDefault("EmbeddedIconButton.Xs.Default"),
    EmbeddedIconButtonXsSecondary("EmbeddedIconButton.Xs.Secondary"),
    EmbeddedIconButtonXsAccent("EmbeddedIconButton.Xs.Accent"),
    EmbeddedIconButtonXsPositive("EmbeddedIconButton.Xs.Positive"),
    EmbeddedIconButtonXsNegative("EmbeddedIconButton.Xs.Negative"),
    EmbeddedIconButtonXsWarning("EmbeddedIconButton.Xs.Warning"),
    EmbeddedIconButtonXsInfo("EmbeddedIconButton.Xs.Info"),
    ;

    /**
     * Typed API для подбора стиля icon-button
     */
    public object Default

    /**
     * Typed API для подбора стиля ai-header-embedded-icon-button
     */
    public object AiHeaderEmbeddedIconButton

    /**
     * Typed API для подбора стиля embedded-icon-button
     */
    public object EmbeddedIconButton
}

/**
 * Возможные значения свойства size для icon-button
 */
public enum class IconButtonDefaultSize {
    Xl,
    L,
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства shape для icon-button
 */
public enum class IconButtonDefaultShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для icon-button
 */
public enum class IconButtonDefaultView {
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
 * Возможные значения свойства size для ai-header-embedded-icon-button
 */
public enum class AiHeaderEmbeddedIconButtonSize {
    Xl,
    L,
    M,
    S,
}

/**
 * Возможные значения свойства view для ai-header-embedded-icon-button
 */
public enum class AiHeaderEmbeddedIconButtonView {
    Default,
    Secondary,
    Accent,
    Positive,
    Negative,
    Warning,
    Clear,
    Info,
}

/**
 * Возможные значения свойства size для embedded-icon-button
 */
public enum class EmbeddedIconButtonSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для embedded-icon-button
 */
public enum class EmbeddedIconButtonView {
    Default,
    Secondary,
    Accent,
    Positive,
    Negative,
    Warning,
    Clear,
    Info,
}

/**
 * Возвращает [ButtonStyle] для [IconButtonStyles]
 */
@Composable
public fun IconButtonStyles.style(modify: @Composable IconButtonStyleBuilder.() -> Unit = {}): ButtonStyle {
    val builder = when (this) {
        IconButtonStyles.IconButtonXlDefault -> IconButton.Xl.Default
        IconButtonStyles.IconButtonXlSecondary -> IconButton.Xl.Secondary
        IconButtonStyles.IconButtonXlAccent -> IconButton.Xl.Accent
        IconButtonStyles.IconButtonXlPositive -> IconButton.Xl.Positive
        IconButtonStyles.IconButtonXlNegative -> IconButton.Xl.Negative
        IconButtonStyles.IconButtonXlWarning -> IconButton.Xl.Warning
        IconButtonStyles.IconButtonXlClear -> IconButton.Xl.Clear
        IconButtonStyles.IconButtonXlDark -> IconButton.Xl.Dark
        IconButtonStyles.IconButtonXlBlack -> IconButton.Xl.Black
        IconButtonStyles.IconButtonXlWhite -> IconButton.Xl.White
        IconButtonStyles.IconButtonXlPilledDefault -> IconButton.Xl.Pilled.Default
        IconButtonStyles.IconButtonXlPilledSecondary -> IconButton.Xl.Pilled.Secondary
        IconButtonStyles.IconButtonXlPilledAccent -> IconButton.Xl.Pilled.Accent
        IconButtonStyles.IconButtonXlPilledPositive -> IconButton.Xl.Pilled.Positive
        IconButtonStyles.IconButtonXlPilledNegative -> IconButton.Xl.Pilled.Negative
        IconButtonStyles.IconButtonXlPilledWarning -> IconButton.Xl.Pilled.Warning
        IconButtonStyles.IconButtonXlPilledClear -> IconButton.Xl.Pilled.Clear
        IconButtonStyles.IconButtonXlPilledDark -> IconButton.Xl.Pilled.Dark
        IconButtonStyles.IconButtonXlPilledBlack -> IconButton.Xl.Pilled.Black
        IconButtonStyles.IconButtonXlPilledWhite -> IconButton.Xl.Pilled.White
        IconButtonStyles.IconButtonLDefault -> IconButton.L.Default
        IconButtonStyles.IconButtonLSecondary -> IconButton.L.Secondary
        IconButtonStyles.IconButtonLAccent -> IconButton.L.Accent
        IconButtonStyles.IconButtonLPositive -> IconButton.L.Positive
        IconButtonStyles.IconButtonLNegative -> IconButton.L.Negative
        IconButtonStyles.IconButtonLWarning -> IconButton.L.Warning
        IconButtonStyles.IconButtonLClear -> IconButton.L.Clear
        IconButtonStyles.IconButtonLDark -> IconButton.L.Dark
        IconButtonStyles.IconButtonLBlack -> IconButton.L.Black
        IconButtonStyles.IconButtonLWhite -> IconButton.L.White
        IconButtonStyles.IconButtonLPilledDefault -> IconButton.L.Pilled.Default
        IconButtonStyles.IconButtonLPilledSecondary -> IconButton.L.Pilled.Secondary
        IconButtonStyles.IconButtonLPilledAccent -> IconButton.L.Pilled.Accent
        IconButtonStyles.IconButtonLPilledPositive -> IconButton.L.Pilled.Positive
        IconButtonStyles.IconButtonLPilledNegative -> IconButton.L.Pilled.Negative
        IconButtonStyles.IconButtonLPilledWarning -> IconButton.L.Pilled.Warning
        IconButtonStyles.IconButtonLPilledClear -> IconButton.L.Pilled.Clear
        IconButtonStyles.IconButtonLPilledDark -> IconButton.L.Pilled.Dark
        IconButtonStyles.IconButtonLPilledBlack -> IconButton.L.Pilled.Black
        IconButtonStyles.IconButtonLPilledWhite -> IconButton.L.Pilled.White
        IconButtonStyles.IconButtonMDefault -> IconButton.M.Default
        IconButtonStyles.IconButtonMSecondary -> IconButton.M.Secondary
        IconButtonStyles.IconButtonMAccent -> IconButton.M.Accent
        IconButtonStyles.IconButtonMPositive -> IconButton.M.Positive
        IconButtonStyles.IconButtonMNegative -> IconButton.M.Negative
        IconButtonStyles.IconButtonMWarning -> IconButton.M.Warning
        IconButtonStyles.IconButtonMClear -> IconButton.M.Clear
        IconButtonStyles.IconButtonMDark -> IconButton.M.Dark
        IconButtonStyles.IconButtonMBlack -> IconButton.M.Black
        IconButtonStyles.IconButtonMWhite -> IconButton.M.White
        IconButtonStyles.IconButtonMPilledDefault -> IconButton.M.Pilled.Default
        IconButtonStyles.IconButtonMPilledSecondary -> IconButton.M.Pilled.Secondary
        IconButtonStyles.IconButtonMPilledAccent -> IconButton.M.Pilled.Accent
        IconButtonStyles.IconButtonMPilledPositive -> IconButton.M.Pilled.Positive
        IconButtonStyles.IconButtonMPilledNegative -> IconButton.M.Pilled.Negative
        IconButtonStyles.IconButtonMPilledWarning -> IconButton.M.Pilled.Warning
        IconButtonStyles.IconButtonMPilledClear -> IconButton.M.Pilled.Clear
        IconButtonStyles.IconButtonMPilledDark -> IconButton.M.Pilled.Dark
        IconButtonStyles.IconButtonMPilledBlack -> IconButton.M.Pilled.Black
        IconButtonStyles.IconButtonMPilledWhite -> IconButton.M.Pilled.White
        IconButtonStyles.IconButtonSDefault -> IconButton.S.Default
        IconButtonStyles.IconButtonSSecondary -> IconButton.S.Secondary
        IconButtonStyles.IconButtonSAccent -> IconButton.S.Accent
        IconButtonStyles.IconButtonSPositive -> IconButton.S.Positive
        IconButtonStyles.IconButtonSNegative -> IconButton.S.Negative
        IconButtonStyles.IconButtonSWarning -> IconButton.S.Warning
        IconButtonStyles.IconButtonSClear -> IconButton.S.Clear
        IconButtonStyles.IconButtonSDark -> IconButton.S.Dark
        IconButtonStyles.IconButtonSBlack -> IconButton.S.Black
        IconButtonStyles.IconButtonSWhite -> IconButton.S.White
        IconButtonStyles.IconButtonSPilledDefault -> IconButton.S.Pilled.Default
        IconButtonStyles.IconButtonSPilledSecondary -> IconButton.S.Pilled.Secondary
        IconButtonStyles.IconButtonSPilledAccent -> IconButton.S.Pilled.Accent
        IconButtonStyles.IconButtonSPilledPositive -> IconButton.S.Pilled.Positive
        IconButtonStyles.IconButtonSPilledNegative -> IconButton.S.Pilled.Negative
        IconButtonStyles.IconButtonSPilledWarning -> IconButton.S.Pilled.Warning
        IconButtonStyles.IconButtonSPilledClear -> IconButton.S.Pilled.Clear
        IconButtonStyles.IconButtonSPilledDark -> IconButton.S.Pilled.Dark
        IconButtonStyles.IconButtonSPilledBlack -> IconButton.S.Pilled.Black
        IconButtonStyles.IconButtonSPilledWhite -> IconButton.S.Pilled.White
        IconButtonStyles.IconButtonXsDefault -> IconButton.Xs.Default
        IconButtonStyles.IconButtonXsSecondary -> IconButton.Xs.Secondary
        IconButtonStyles.IconButtonXsAccent -> IconButton.Xs.Accent
        IconButtonStyles.IconButtonXsPositive -> IconButton.Xs.Positive
        IconButtonStyles.IconButtonXsNegative -> IconButton.Xs.Negative
        IconButtonStyles.IconButtonXsWarning -> IconButton.Xs.Warning
        IconButtonStyles.IconButtonXsClear -> IconButton.Xs.Clear
        IconButtonStyles.IconButtonXsDark -> IconButton.Xs.Dark
        IconButtonStyles.IconButtonXsBlack -> IconButton.Xs.Black
        IconButtonStyles.IconButtonXsWhite -> IconButton.Xs.White
        IconButtonStyles.IconButtonXsPilledDefault -> IconButton.Xs.Pilled.Default
        IconButtonStyles.IconButtonXsPilledSecondary -> IconButton.Xs.Pilled.Secondary
        IconButtonStyles.IconButtonXsPilledAccent -> IconButton.Xs.Pilled.Accent
        IconButtonStyles.IconButtonXsPilledPositive -> IconButton.Xs.Pilled.Positive
        IconButtonStyles.IconButtonXsPilledNegative -> IconButton.Xs.Pilled.Negative
        IconButtonStyles.IconButtonXsPilledWarning -> IconButton.Xs.Pilled.Warning
        IconButtonStyles.IconButtonXsPilledClear -> IconButton.Xs.Pilled.Clear
        IconButtonStyles.IconButtonXsPilledDark -> IconButton.Xs.Pilled.Dark
        IconButtonStyles.IconButtonXsPilledBlack -> IconButton.Xs.Pilled.Black
        IconButtonStyles.IconButtonXsPilledWhite -> IconButton.Xs.Pilled.White
        IconButtonStyles.IconButtonXxsDefault -> IconButton.Xxs.Default
        IconButtonStyles.IconButtonXxsSecondary -> IconButton.Xxs.Secondary
        IconButtonStyles.IconButtonXxsAccent -> IconButton.Xxs.Accent
        IconButtonStyles.IconButtonXxsPositive -> IconButton.Xxs.Positive
        IconButtonStyles.IconButtonXxsNegative -> IconButton.Xxs.Negative
        IconButtonStyles.IconButtonXxsWarning -> IconButton.Xxs.Warning
        IconButtonStyles.IconButtonXxsClear -> IconButton.Xxs.Clear
        IconButtonStyles.IconButtonXxsDark -> IconButton.Xxs.Dark
        IconButtonStyles.IconButtonXxsBlack -> IconButton.Xxs.Black
        IconButtonStyles.IconButtonXxsWhite -> IconButton.Xxs.White
        IconButtonStyles.IconButtonXxsPilledDefault -> IconButton.Xxs.Pilled.Default
        IconButtonStyles.IconButtonXxsPilledSecondary -> IconButton.Xxs.Pilled.Secondary
        IconButtonStyles.IconButtonXxsPilledAccent -> IconButton.Xxs.Pilled.Accent
        IconButtonStyles.IconButtonXxsPilledPositive -> IconButton.Xxs.Pilled.Positive
        IconButtonStyles.IconButtonXxsPilledNegative -> IconButton.Xxs.Pilled.Negative
        IconButtonStyles.IconButtonXxsPilledWarning -> IconButton.Xxs.Pilled.Warning
        IconButtonStyles.IconButtonXxsPilledClear -> IconButton.Xxs.Pilled.Clear
        IconButtonStyles.IconButtonXxsPilledDark -> IconButton.Xxs.Pilled.Dark
        IconButtonStyles.IconButtonXxsPilledBlack -> IconButton.Xxs.Pilled.Black
        IconButtonStyles.IconButtonXxsPilledWhite -> IconButton.Xxs.Pilled.White
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlDefault -> AiHeaderEmbeddedIconButton.Xl.Default
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlSecondary ->
            AiHeaderEmbeddedIconButton.Xl.Secondary
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlAccent -> AiHeaderEmbeddedIconButton.Xl.Accent
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlPositive ->
            AiHeaderEmbeddedIconButton.Xl.Positive
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlNegative ->
            AiHeaderEmbeddedIconButton.Xl.Negative
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlWarning -> AiHeaderEmbeddedIconButton.Xl.Warning
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlInfo -> AiHeaderEmbeddedIconButton.Xl.Info
        IconButtonStyles.AiHeaderEmbeddedIconButtonLDefault -> AiHeaderEmbeddedIconButton.L.Default
        IconButtonStyles.AiHeaderEmbeddedIconButtonLSecondary ->
            AiHeaderEmbeddedIconButton.L.Secondary
        IconButtonStyles.AiHeaderEmbeddedIconButtonLAccent -> AiHeaderEmbeddedIconButton.L.Accent
        IconButtonStyles.AiHeaderEmbeddedIconButtonLPositive -> AiHeaderEmbeddedIconButton.L.Positive
        IconButtonStyles.AiHeaderEmbeddedIconButtonLNegative -> AiHeaderEmbeddedIconButton.L.Negative
        IconButtonStyles.AiHeaderEmbeddedIconButtonLWarning -> AiHeaderEmbeddedIconButton.L.Warning
        IconButtonStyles.AiHeaderEmbeddedIconButtonLInfo -> AiHeaderEmbeddedIconButton.L.Info
        IconButtonStyles.AiHeaderEmbeddedIconButtonMDefault -> AiHeaderEmbeddedIconButton.M.Default
        IconButtonStyles.AiHeaderEmbeddedIconButtonMSecondary ->
            AiHeaderEmbeddedIconButton.M.Secondary
        IconButtonStyles.AiHeaderEmbeddedIconButtonMAccent -> AiHeaderEmbeddedIconButton.M.Accent
        IconButtonStyles.AiHeaderEmbeddedIconButtonMPositive -> AiHeaderEmbeddedIconButton.M.Positive
        IconButtonStyles.AiHeaderEmbeddedIconButtonMNegative -> AiHeaderEmbeddedIconButton.M.Negative
        IconButtonStyles.AiHeaderEmbeddedIconButtonMWarning -> AiHeaderEmbeddedIconButton.M.Warning
        IconButtonStyles.AiHeaderEmbeddedIconButtonMInfo -> AiHeaderEmbeddedIconButton.M.Info
        IconButtonStyles.AiHeaderEmbeddedIconButtonSDefault -> AiHeaderEmbeddedIconButton.S.Default
        IconButtonStyles.AiHeaderEmbeddedIconButtonSSecondary ->
            AiHeaderEmbeddedIconButton.S.Secondary
        IconButtonStyles.AiHeaderEmbeddedIconButtonSAccent -> AiHeaderEmbeddedIconButton.S.Accent
        IconButtonStyles.AiHeaderEmbeddedIconButtonSPositive -> AiHeaderEmbeddedIconButton.S.Positive
        IconButtonStyles.AiHeaderEmbeddedIconButtonSNegative -> AiHeaderEmbeddedIconButton.S.Negative
        IconButtonStyles.AiHeaderEmbeddedIconButtonSWarning -> AiHeaderEmbeddedIconButton.S.Warning
        IconButtonStyles.AiHeaderEmbeddedIconButtonSInfo -> AiHeaderEmbeddedIconButton.S.Info
        IconButtonStyles.EmbeddedIconButtonLDefault -> EmbeddedIconButton.L.Default
        IconButtonStyles.EmbeddedIconButtonLSecondary -> EmbeddedIconButton.L.Secondary
        IconButtonStyles.EmbeddedIconButtonLAccent -> EmbeddedIconButton.L.Accent
        IconButtonStyles.EmbeddedIconButtonLPositive -> EmbeddedIconButton.L.Positive
        IconButtonStyles.EmbeddedIconButtonLNegative -> EmbeddedIconButton.L.Negative
        IconButtonStyles.EmbeddedIconButtonLWarning -> EmbeddedIconButton.L.Warning
        IconButtonStyles.EmbeddedIconButtonLInfo -> EmbeddedIconButton.L.Info
        IconButtonStyles.EmbeddedIconButtonMDefault -> EmbeddedIconButton.M.Default
        IconButtonStyles.EmbeddedIconButtonMSecondary -> EmbeddedIconButton.M.Secondary
        IconButtonStyles.EmbeddedIconButtonMAccent -> EmbeddedIconButton.M.Accent
        IconButtonStyles.EmbeddedIconButtonMPositive -> EmbeddedIconButton.M.Positive
        IconButtonStyles.EmbeddedIconButtonMNegative -> EmbeddedIconButton.M.Negative
        IconButtonStyles.EmbeddedIconButtonMWarning -> EmbeddedIconButton.M.Warning
        IconButtonStyles.EmbeddedIconButtonMInfo -> EmbeddedIconButton.M.Info
        IconButtonStyles.EmbeddedIconButtonSDefault -> EmbeddedIconButton.S.Default
        IconButtonStyles.EmbeddedIconButtonSSecondary -> EmbeddedIconButton.S.Secondary
        IconButtonStyles.EmbeddedIconButtonSAccent -> EmbeddedIconButton.S.Accent
        IconButtonStyles.EmbeddedIconButtonSPositive -> EmbeddedIconButton.S.Positive
        IconButtonStyles.EmbeddedIconButtonSNegative -> EmbeddedIconButton.S.Negative
        IconButtonStyles.EmbeddedIconButtonSWarning -> EmbeddedIconButton.S.Warning
        IconButtonStyles.EmbeddedIconButtonSInfo -> EmbeddedIconButton.S.Info
        IconButtonStyles.EmbeddedIconButtonXsDefault -> EmbeddedIconButton.Xs.Default
        IconButtonStyles.EmbeddedIconButtonXsSecondary -> EmbeddedIconButton.Xs.Secondary
        IconButtonStyles.EmbeddedIconButtonXsAccent -> EmbeddedIconButton.Xs.Accent
        IconButtonStyles.EmbeddedIconButtonXsPositive -> EmbeddedIconButton.Xs.Positive
        IconButtonStyles.EmbeddedIconButtonXsNegative -> EmbeddedIconButton.Xs.Negative
        IconButtonStyles.EmbeddedIconButtonXsWarning -> EmbeddedIconButton.Xs.Warning
        IconButtonStyles.EmbeddedIconButtonXsInfo -> EmbeddedIconButton.Xs.Info
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IconButtonStyles] для icon-button
 */
public fun IconButtonStyles.Default.resolve(
    size: IconButtonDefaultSize = IconButtonDefaultSize.Xl,
    shape: IconButtonDefaultShape = IconButtonDefaultShape.Default,
    view: IconButtonDefaultView = IconButtonDefaultView.Default,
): IconButtonStyles = when {
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Default -> IconButtonStyles.IconButtonXlPilledDefault
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Secondary -> IconButtonStyles.IconButtonXlPilledSecondary
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Accent -> IconButtonStyles.IconButtonXlPilledAccent
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Positive -> IconButtonStyles.IconButtonXlPilledPositive
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Negative -> IconButtonStyles.IconButtonXlPilledNegative
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Warning -> IconButtonStyles.IconButtonXlPilledWarning
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Clear -> IconButtonStyles.IconButtonXlPilledClear
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Dark -> IconButtonStyles.IconButtonXlPilledDark
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Black -> IconButtonStyles.IconButtonXlPilledBlack
    size == IconButtonDefaultSize.Xl && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.White -> IconButtonStyles.IconButtonXlPilledWhite
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Default -> IconButtonStyles.IconButtonLPilledDefault
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Secondary -> IconButtonStyles.IconButtonLPilledSecondary
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Accent -> IconButtonStyles.IconButtonLPilledAccent
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Positive -> IconButtonStyles.IconButtonLPilledPositive
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Negative -> IconButtonStyles.IconButtonLPilledNegative
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Warning -> IconButtonStyles.IconButtonLPilledWarning
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Clear -> IconButtonStyles.IconButtonLPilledClear
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Dark -> IconButtonStyles.IconButtonLPilledDark
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Black -> IconButtonStyles.IconButtonLPilledBlack
    size == IconButtonDefaultSize.L && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.White -> IconButtonStyles.IconButtonLPilledWhite
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Default -> IconButtonStyles.IconButtonMPilledDefault
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Secondary -> IconButtonStyles.IconButtonMPilledSecondary
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Accent -> IconButtonStyles.IconButtonMPilledAccent
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Positive -> IconButtonStyles.IconButtonMPilledPositive
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Negative -> IconButtonStyles.IconButtonMPilledNegative
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Warning -> IconButtonStyles.IconButtonMPilledWarning
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Clear -> IconButtonStyles.IconButtonMPilledClear
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Dark -> IconButtonStyles.IconButtonMPilledDark
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Black -> IconButtonStyles.IconButtonMPilledBlack
    size == IconButtonDefaultSize.M && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.White -> IconButtonStyles.IconButtonMPilledWhite
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Default -> IconButtonStyles.IconButtonSPilledDefault
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Secondary -> IconButtonStyles.IconButtonSPilledSecondary
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Accent -> IconButtonStyles.IconButtonSPilledAccent
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Positive -> IconButtonStyles.IconButtonSPilledPositive
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Negative -> IconButtonStyles.IconButtonSPilledNegative
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Warning -> IconButtonStyles.IconButtonSPilledWarning
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Clear -> IconButtonStyles.IconButtonSPilledClear
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Dark -> IconButtonStyles.IconButtonSPilledDark
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Black -> IconButtonStyles.IconButtonSPilledBlack
    size == IconButtonDefaultSize.S && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.White -> IconButtonStyles.IconButtonSPilledWhite
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Default -> IconButtonStyles.IconButtonXsPilledDefault
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Secondary -> IconButtonStyles.IconButtonXsPilledSecondary
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Accent -> IconButtonStyles.IconButtonXsPilledAccent
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Positive -> IconButtonStyles.IconButtonXsPilledPositive
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Negative -> IconButtonStyles.IconButtonXsPilledNegative
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Warning -> IconButtonStyles.IconButtonXsPilledWarning
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Clear -> IconButtonStyles.IconButtonXsPilledClear
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Dark -> IconButtonStyles.IconButtonXsPilledDark
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Black -> IconButtonStyles.IconButtonXsPilledBlack
    size == IconButtonDefaultSize.Xs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.White -> IconButtonStyles.IconButtonXsPilledWhite
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Default -> IconButtonStyles.IconButtonXxsPilledDefault
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Secondary -> IconButtonStyles.IconButtonXxsPilledSecondary
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Accent -> IconButtonStyles.IconButtonXxsPilledAccent
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Positive -> IconButtonStyles.IconButtonXxsPilledPositive
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Negative -> IconButtonStyles.IconButtonXxsPilledNegative
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Warning -> IconButtonStyles.IconButtonXxsPilledWarning
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Clear -> IconButtonStyles.IconButtonXxsPilledClear
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Dark -> IconButtonStyles.IconButtonXxsPilledDark
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.Black -> IconButtonStyles.IconButtonXxsPilledBlack
    size == IconButtonDefaultSize.Xxs && shape == IconButtonDefaultShape.Pilled && view ==
        IconButtonDefaultView.White -> IconButtonStyles.IconButtonXxsPilledWhite
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.Default ->
        IconButtonStyles.IconButtonXlDefault
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.Secondary ->
        IconButtonStyles.IconButtonXlSecondary
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.Accent ->
        IconButtonStyles.IconButtonXlAccent
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.Positive ->
        IconButtonStyles.IconButtonXlPositive
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.Negative ->
        IconButtonStyles.IconButtonXlNegative
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.Warning ->
        IconButtonStyles.IconButtonXlWarning
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.Clear ->
        IconButtonStyles.IconButtonXlClear
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.Dark ->
        IconButtonStyles.IconButtonXlDark
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.Black ->
        IconButtonStyles.IconButtonXlBlack
    size == IconButtonDefaultSize.Xl && view == IconButtonDefaultView.White ->
        IconButtonStyles.IconButtonXlWhite
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.Default ->
        IconButtonStyles.IconButtonLDefault
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.Secondary ->
        IconButtonStyles.IconButtonLSecondary
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.Accent ->
        IconButtonStyles.IconButtonLAccent
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.Positive ->
        IconButtonStyles.IconButtonLPositive
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.Negative ->
        IconButtonStyles.IconButtonLNegative
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.Warning ->
        IconButtonStyles.IconButtonLWarning
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.Clear ->
        IconButtonStyles.IconButtonLClear
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.Dark ->
        IconButtonStyles.IconButtonLDark
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.Black ->
        IconButtonStyles.IconButtonLBlack
    size == IconButtonDefaultSize.L && view == IconButtonDefaultView.White ->
        IconButtonStyles.IconButtonLWhite
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.Default ->
        IconButtonStyles.IconButtonMDefault
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.Secondary ->
        IconButtonStyles.IconButtonMSecondary
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.Accent ->
        IconButtonStyles.IconButtonMAccent
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.Positive ->
        IconButtonStyles.IconButtonMPositive
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.Negative ->
        IconButtonStyles.IconButtonMNegative
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.Warning ->
        IconButtonStyles.IconButtonMWarning
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.Clear ->
        IconButtonStyles.IconButtonMClear
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.Dark ->
        IconButtonStyles.IconButtonMDark
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.Black ->
        IconButtonStyles.IconButtonMBlack
    size == IconButtonDefaultSize.M && view == IconButtonDefaultView.White ->
        IconButtonStyles.IconButtonMWhite
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.Default ->
        IconButtonStyles.IconButtonSDefault
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.Secondary ->
        IconButtonStyles.IconButtonSSecondary
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.Accent ->
        IconButtonStyles.IconButtonSAccent
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.Positive ->
        IconButtonStyles.IconButtonSPositive
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.Negative ->
        IconButtonStyles.IconButtonSNegative
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.Warning ->
        IconButtonStyles.IconButtonSWarning
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.Clear ->
        IconButtonStyles.IconButtonSClear
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.Dark ->
        IconButtonStyles.IconButtonSDark
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.Black ->
        IconButtonStyles.IconButtonSBlack
    size == IconButtonDefaultSize.S && view == IconButtonDefaultView.White ->
        IconButtonStyles.IconButtonSWhite
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.Default ->
        IconButtonStyles.IconButtonXsDefault
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.Secondary ->
        IconButtonStyles.IconButtonXsSecondary
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.Accent ->
        IconButtonStyles.IconButtonXsAccent
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.Positive ->
        IconButtonStyles.IconButtonXsPositive
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.Negative ->
        IconButtonStyles.IconButtonXsNegative
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.Warning ->
        IconButtonStyles.IconButtonXsWarning
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.Clear ->
        IconButtonStyles.IconButtonXsClear
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.Dark ->
        IconButtonStyles.IconButtonXsDark
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.Black ->
        IconButtonStyles.IconButtonXsBlack
    size == IconButtonDefaultSize.Xs && view == IconButtonDefaultView.White ->
        IconButtonStyles.IconButtonXsWhite
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.Default ->
        IconButtonStyles.IconButtonXxsDefault
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.Secondary ->
        IconButtonStyles.IconButtonXxsSecondary
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.Accent ->
        IconButtonStyles.IconButtonXxsAccent
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.Positive ->
        IconButtonStyles.IconButtonXxsPositive
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.Negative ->
        IconButtonStyles.IconButtonXxsNegative
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.Warning ->
        IconButtonStyles.IconButtonXxsWarning
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.Clear ->
        IconButtonStyles.IconButtonXxsClear
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.Dark ->
        IconButtonStyles.IconButtonXxsDark
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.Black ->
        IconButtonStyles.IconButtonXxsBlack
    size == IconButtonDefaultSize.Xxs && view == IconButtonDefaultView.White ->
        IconButtonStyles.IconButtonXxsWhite
    else -> error("Unsupported icon-button style combination")
}

/**
 * Возвращает [ButtonStyle] для icon-button
 */
@Composable
public fun IconButtonStyles.Default.style(
    size: IconButtonDefaultSize = IconButtonDefaultSize.Xl,
    shape: IconButtonDefaultShape = IconButtonDefaultShape.Default,
    view: IconButtonDefaultView = IconButtonDefaultView.Default,
    modify: @Composable IconButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, shape, view).style(modify)

/**
 * Возвращает экземпляр [IconButtonStyles] для ai-header-embedded-icon-button
 */
public fun IconButtonStyles.AiHeaderEmbeddedIconButton.resolve(
    size: AiHeaderEmbeddedIconButtonSize =
        AiHeaderEmbeddedIconButtonSize.M,
    view: AiHeaderEmbeddedIconButtonView =
        AiHeaderEmbeddedIconButtonView.Default,
): IconButtonStyles = when {
    size == AiHeaderEmbeddedIconButtonSize.Xl && view == AiHeaderEmbeddedIconButtonView.Default ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlDefault
    size == AiHeaderEmbeddedIconButtonSize.Xl && view == AiHeaderEmbeddedIconButtonView.Secondary ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlSecondary
    size == AiHeaderEmbeddedIconButtonSize.Xl && view == AiHeaderEmbeddedIconButtonView.Accent ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlAccent
    size == AiHeaderEmbeddedIconButtonSize.Xl && view == AiHeaderEmbeddedIconButtonView.Positive ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlPositive
    size == AiHeaderEmbeddedIconButtonSize.Xl && view == AiHeaderEmbeddedIconButtonView.Negative ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlNegative
    size == AiHeaderEmbeddedIconButtonSize.Xl && view == AiHeaderEmbeddedIconButtonView.Warning ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlWarning
    size == AiHeaderEmbeddedIconButtonSize.Xl && view == AiHeaderEmbeddedIconButtonView.Info ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonXlInfo
    size == AiHeaderEmbeddedIconButtonSize.L && view == AiHeaderEmbeddedIconButtonView.Default ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonLDefault
    size == AiHeaderEmbeddedIconButtonSize.L && view == AiHeaderEmbeddedIconButtonView.Secondary ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonLSecondary
    size == AiHeaderEmbeddedIconButtonSize.L && view == AiHeaderEmbeddedIconButtonView.Accent ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonLAccent
    size == AiHeaderEmbeddedIconButtonSize.L && view == AiHeaderEmbeddedIconButtonView.Positive ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonLPositive
    size == AiHeaderEmbeddedIconButtonSize.L && view == AiHeaderEmbeddedIconButtonView.Negative ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonLNegative
    size == AiHeaderEmbeddedIconButtonSize.L && view == AiHeaderEmbeddedIconButtonView.Warning ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonLWarning
    size == AiHeaderEmbeddedIconButtonSize.L && view == AiHeaderEmbeddedIconButtonView.Info ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonLInfo
    size == AiHeaderEmbeddedIconButtonSize.M && view == AiHeaderEmbeddedIconButtonView.Default ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonMDefault
    size == AiHeaderEmbeddedIconButtonSize.M && view == AiHeaderEmbeddedIconButtonView.Secondary ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonMSecondary
    size == AiHeaderEmbeddedIconButtonSize.M && view == AiHeaderEmbeddedIconButtonView.Accent ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonMAccent
    size == AiHeaderEmbeddedIconButtonSize.M && view == AiHeaderEmbeddedIconButtonView.Positive ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonMPositive
    size == AiHeaderEmbeddedIconButtonSize.M && view == AiHeaderEmbeddedIconButtonView.Negative ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonMNegative
    size == AiHeaderEmbeddedIconButtonSize.M && view == AiHeaderEmbeddedIconButtonView.Warning ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonMWarning
    size == AiHeaderEmbeddedIconButtonSize.M && view == AiHeaderEmbeddedIconButtonView.Info ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonMInfo
    size == AiHeaderEmbeddedIconButtonSize.S && view == AiHeaderEmbeddedIconButtonView.Default ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonSDefault
    size == AiHeaderEmbeddedIconButtonSize.S && view == AiHeaderEmbeddedIconButtonView.Secondary ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonSSecondary
    size == AiHeaderEmbeddedIconButtonSize.S && view == AiHeaderEmbeddedIconButtonView.Accent ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonSAccent
    size == AiHeaderEmbeddedIconButtonSize.S && view == AiHeaderEmbeddedIconButtonView.Positive ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonSPositive
    size == AiHeaderEmbeddedIconButtonSize.S && view == AiHeaderEmbeddedIconButtonView.Negative ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonSNegative
    size == AiHeaderEmbeddedIconButtonSize.S && view == AiHeaderEmbeddedIconButtonView.Warning ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonSWarning
    size == AiHeaderEmbeddedIconButtonSize.S && view == AiHeaderEmbeddedIconButtonView.Info ->
        IconButtonStyles.AiHeaderEmbeddedIconButtonSInfo
    else -> error("Unsupported ai-header-embedded-icon-button style combination")
}

/**
 * Возвращает [ButtonStyle] для ai-header-embedded-icon-button
 */
@Composable
public fun IconButtonStyles.AiHeaderEmbeddedIconButton.style(
    size: AiHeaderEmbeddedIconButtonSize = AiHeaderEmbeddedIconButtonSize.M,
    view: AiHeaderEmbeddedIconButtonView = AiHeaderEmbeddedIconButtonView.Default,
    modify: @Composable IconButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, view).style(modify)

/**
 * Возвращает экземпляр [IconButtonStyles] для embedded-icon-button
 */
public fun IconButtonStyles.EmbeddedIconButton.resolve(
    size: EmbeddedIconButtonSize =
        EmbeddedIconButtonSize.M,
    view: EmbeddedIconButtonView = EmbeddedIconButtonView.Default,
): IconButtonStyles = when {
    size == EmbeddedIconButtonSize.L && view == EmbeddedIconButtonView.Default ->
        IconButtonStyles.EmbeddedIconButtonLDefault
    size == EmbeddedIconButtonSize.L && view == EmbeddedIconButtonView.Secondary ->
        IconButtonStyles.EmbeddedIconButtonLSecondary
    size == EmbeddedIconButtonSize.L && view == EmbeddedIconButtonView.Accent ->
        IconButtonStyles.EmbeddedIconButtonLAccent
    size == EmbeddedIconButtonSize.L && view == EmbeddedIconButtonView.Positive ->
        IconButtonStyles.EmbeddedIconButtonLPositive
    size == EmbeddedIconButtonSize.L && view == EmbeddedIconButtonView.Negative ->
        IconButtonStyles.EmbeddedIconButtonLNegative
    size == EmbeddedIconButtonSize.L && view == EmbeddedIconButtonView.Warning ->
        IconButtonStyles.EmbeddedIconButtonLWarning
    size == EmbeddedIconButtonSize.L && view == EmbeddedIconButtonView.Info ->
        IconButtonStyles.EmbeddedIconButtonLInfo
    size == EmbeddedIconButtonSize.M && view == EmbeddedIconButtonView.Default ->
        IconButtonStyles.EmbeddedIconButtonMDefault
    size == EmbeddedIconButtonSize.M && view == EmbeddedIconButtonView.Secondary ->
        IconButtonStyles.EmbeddedIconButtonMSecondary
    size == EmbeddedIconButtonSize.M && view == EmbeddedIconButtonView.Accent ->
        IconButtonStyles.EmbeddedIconButtonMAccent
    size == EmbeddedIconButtonSize.M && view == EmbeddedIconButtonView.Positive ->
        IconButtonStyles.EmbeddedIconButtonMPositive
    size == EmbeddedIconButtonSize.M && view == EmbeddedIconButtonView.Negative ->
        IconButtonStyles.EmbeddedIconButtonMNegative
    size == EmbeddedIconButtonSize.M && view == EmbeddedIconButtonView.Warning ->
        IconButtonStyles.EmbeddedIconButtonMWarning
    size == EmbeddedIconButtonSize.M && view == EmbeddedIconButtonView.Info ->
        IconButtonStyles.EmbeddedIconButtonMInfo
    size == EmbeddedIconButtonSize.S && view == EmbeddedIconButtonView.Default ->
        IconButtonStyles.EmbeddedIconButtonSDefault
    size == EmbeddedIconButtonSize.S && view == EmbeddedIconButtonView.Secondary ->
        IconButtonStyles.EmbeddedIconButtonSSecondary
    size == EmbeddedIconButtonSize.S && view == EmbeddedIconButtonView.Accent ->
        IconButtonStyles.EmbeddedIconButtonSAccent
    size == EmbeddedIconButtonSize.S && view == EmbeddedIconButtonView.Positive ->
        IconButtonStyles.EmbeddedIconButtonSPositive
    size == EmbeddedIconButtonSize.S && view == EmbeddedIconButtonView.Negative ->
        IconButtonStyles.EmbeddedIconButtonSNegative
    size == EmbeddedIconButtonSize.S && view == EmbeddedIconButtonView.Warning ->
        IconButtonStyles.EmbeddedIconButtonSWarning
    size == EmbeddedIconButtonSize.S && view == EmbeddedIconButtonView.Info ->
        IconButtonStyles.EmbeddedIconButtonSInfo
    size == EmbeddedIconButtonSize.Xs && view == EmbeddedIconButtonView.Default ->
        IconButtonStyles.EmbeddedIconButtonXsDefault
    size == EmbeddedIconButtonSize.Xs && view == EmbeddedIconButtonView.Secondary ->
        IconButtonStyles.EmbeddedIconButtonXsSecondary
    size == EmbeddedIconButtonSize.Xs && view == EmbeddedIconButtonView.Accent ->
        IconButtonStyles.EmbeddedIconButtonXsAccent
    size == EmbeddedIconButtonSize.Xs && view == EmbeddedIconButtonView.Positive ->
        IconButtonStyles.EmbeddedIconButtonXsPositive
    size == EmbeddedIconButtonSize.Xs && view == EmbeddedIconButtonView.Negative ->
        IconButtonStyles.EmbeddedIconButtonXsNegative
    size == EmbeddedIconButtonSize.Xs && view == EmbeddedIconButtonView.Warning ->
        IconButtonStyles.EmbeddedIconButtonXsWarning
    size == EmbeddedIconButtonSize.Xs && view == EmbeddedIconButtonView.Info ->
        IconButtonStyles.EmbeddedIconButtonXsInfo
    else -> error("Unsupported embedded-icon-button style combination")
}

/**
 * Возвращает [ButtonStyle] для embedded-icon-button
 */
@Composable
public fun IconButtonStyles.EmbeddedIconButton.style(
    size: EmbeddedIconButtonSize = EmbeddedIconButtonSize.M,
    view: EmbeddedIconButtonView = EmbeddedIconButtonView.Default,
    modify: @Composable IconButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, view).style(modify)
