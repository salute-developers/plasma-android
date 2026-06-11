// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.iconbutton

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
public enum class IconButtonShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для icon-button
 */
public enum class IconButtonView {
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
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IconButtonStyles] для icon-button
 */
public fun IconButtonStyles.Companion.resolve(
    size: IconButtonSize = IconButtonSize.Xl,
    shape: IconButtonShape = IconButtonShape.Default,
    view: IconButtonView = IconButtonView.Default,
): IconButtonStyles = when {
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Default -> IconButtonStyles.IconButtonXlPilledDefault
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Secondary -> IconButtonStyles.IconButtonXlPilledSecondary
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view == IconButtonView.Accent ->
        IconButtonStyles.IconButtonXlPilledAccent
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Positive -> IconButtonStyles.IconButtonXlPilledPositive
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Negative -> IconButtonStyles.IconButtonXlPilledNegative
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Warning -> IconButtonStyles.IconButtonXlPilledWarning
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonXlPilledClear
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view == IconButtonView.Dark ->
        IconButtonStyles.IconButtonXlPilledDark
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view == IconButtonView.Black ->
        IconButtonStyles.IconButtonXlPilledBlack
    size == IconButtonSize.Xl && shape == IconButtonShape.Pilled && view == IconButtonView.White ->
        IconButtonStyles.IconButtonXlPilledWhite
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonLPilledDefault
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Secondary -> IconButtonStyles.IconButtonLPilledSecondary
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view == IconButtonView.Accent ->
        IconButtonStyles.IconButtonLPilledAccent
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Positive -> IconButtonStyles.IconButtonLPilledPositive
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Negative -> IconButtonStyles.IconButtonLPilledNegative
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonLPilledWarning
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonLPilledClear
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view == IconButtonView.Dark ->
        IconButtonStyles.IconButtonLPilledDark
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view == IconButtonView.Black ->
        IconButtonStyles.IconButtonLPilledBlack
    size == IconButtonSize.L && shape == IconButtonShape.Pilled && view == IconButtonView.White ->
        IconButtonStyles.IconButtonLPilledWhite
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonMPilledDefault
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Secondary -> IconButtonStyles.IconButtonMPilledSecondary
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view == IconButtonView.Accent ->
        IconButtonStyles.IconButtonMPilledAccent
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Positive -> IconButtonStyles.IconButtonMPilledPositive
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Negative -> IconButtonStyles.IconButtonMPilledNegative
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonMPilledWarning
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonMPilledClear
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view == IconButtonView.Dark ->
        IconButtonStyles.IconButtonMPilledDark
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view == IconButtonView.Black ->
        IconButtonStyles.IconButtonMPilledBlack
    size == IconButtonSize.M && shape == IconButtonShape.Pilled && view == IconButtonView.White ->
        IconButtonStyles.IconButtonMPilledWhite
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonSPilledDefault
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Secondary -> IconButtonStyles.IconButtonSPilledSecondary
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view == IconButtonView.Accent ->
        IconButtonStyles.IconButtonSPilledAccent
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Positive -> IconButtonStyles.IconButtonSPilledPositive
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Negative -> IconButtonStyles.IconButtonSPilledNegative
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonSPilledWarning
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonSPilledClear
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view == IconButtonView.Dark ->
        IconButtonStyles.IconButtonSPilledDark
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view == IconButtonView.Black ->
        IconButtonStyles.IconButtonSPilledBlack
    size == IconButtonSize.S && shape == IconButtonShape.Pilled && view == IconButtonView.White ->
        IconButtonStyles.IconButtonSPilledWhite
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Default -> IconButtonStyles.IconButtonXsPilledDefault
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Secondary -> IconButtonStyles.IconButtonXsPilledSecondary
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view == IconButtonView.Accent ->
        IconButtonStyles.IconButtonXsPilledAccent
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Positive -> IconButtonStyles.IconButtonXsPilledPositive
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Negative -> IconButtonStyles.IconButtonXsPilledNegative
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Warning -> IconButtonStyles.IconButtonXsPilledWarning
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonXsPilledClear
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view == IconButtonView.Dark ->
        IconButtonStyles.IconButtonXsPilledDark
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view == IconButtonView.Black ->
        IconButtonStyles.IconButtonXsPilledBlack
    size == IconButtonSize.Xs && shape == IconButtonShape.Pilled && view == IconButtonView.White ->
        IconButtonStyles.IconButtonXsPilledWhite
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Default -> IconButtonStyles.IconButtonXxsPilledDefault
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Secondary -> IconButtonStyles.IconButtonXxsPilledSecondary
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Accent -> IconButtonStyles.IconButtonXxsPilledAccent
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Positive -> IconButtonStyles.IconButtonXxsPilledPositive
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Negative -> IconButtonStyles.IconButtonXxsPilledNegative
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view ==
        IconButtonView.Warning -> IconButtonStyles.IconButtonXxsPilledWarning
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonXxsPilledClear
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view == IconButtonView.Dark ->
        IconButtonStyles.IconButtonXxsPilledDark
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view == IconButtonView.Black ->
        IconButtonStyles.IconButtonXxsPilledBlack
    size == IconButtonSize.Xxs && shape == IconButtonShape.Pilled && view == IconButtonView.White ->
        IconButtonStyles.IconButtonXxsPilledWhite
    size == IconButtonSize.Xl && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonXlDefault
    size == IconButtonSize.Xl && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonXlSecondary
    size == IconButtonSize.Xl && view == IconButtonView.Accent ->
        IconButtonStyles.IconButtonXlAccent
    size == IconButtonSize.Xl && view == IconButtonView.Positive ->
        IconButtonStyles.IconButtonXlPositive
    size == IconButtonSize.Xl && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonXlNegative
    size == IconButtonSize.Xl && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonXlWarning
    size == IconButtonSize.Xl && view == IconButtonView.Clear -> IconButtonStyles.IconButtonXlClear
    size == IconButtonSize.Xl && view == IconButtonView.Dark -> IconButtonStyles.IconButtonXlDark
    size == IconButtonSize.Xl && view == IconButtonView.Black -> IconButtonStyles.IconButtonXlBlack
    size == IconButtonSize.Xl && view == IconButtonView.White -> IconButtonStyles.IconButtonXlWhite
    size == IconButtonSize.L && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonLDefault
    size == IconButtonSize.L && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonLSecondary
    size == IconButtonSize.L && view == IconButtonView.Accent -> IconButtonStyles.IconButtonLAccent
    size == IconButtonSize.L && view == IconButtonView.Positive ->
        IconButtonStyles.IconButtonLPositive
    size == IconButtonSize.L && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonLNegative
    size == IconButtonSize.L && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonLWarning
    size == IconButtonSize.L && view == IconButtonView.Clear -> IconButtonStyles.IconButtonLClear
    size == IconButtonSize.L && view == IconButtonView.Dark -> IconButtonStyles.IconButtonLDark
    size == IconButtonSize.L && view == IconButtonView.Black -> IconButtonStyles.IconButtonLBlack
    size == IconButtonSize.L && view == IconButtonView.White -> IconButtonStyles.IconButtonLWhite
    size == IconButtonSize.M && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonMDefault
    size == IconButtonSize.M && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonMSecondary
    size == IconButtonSize.M && view == IconButtonView.Accent -> IconButtonStyles.IconButtonMAccent
    size == IconButtonSize.M && view == IconButtonView.Positive ->
        IconButtonStyles.IconButtonMPositive
    size == IconButtonSize.M && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonMNegative
    size == IconButtonSize.M && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonMWarning
    size == IconButtonSize.M && view == IconButtonView.Clear -> IconButtonStyles.IconButtonMClear
    size == IconButtonSize.M && view == IconButtonView.Dark -> IconButtonStyles.IconButtonMDark
    size == IconButtonSize.M && view == IconButtonView.Black -> IconButtonStyles.IconButtonMBlack
    size == IconButtonSize.M && view == IconButtonView.White -> IconButtonStyles.IconButtonMWhite
    size == IconButtonSize.S && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonSDefault
    size == IconButtonSize.S && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonSSecondary
    size == IconButtonSize.S && view == IconButtonView.Accent -> IconButtonStyles.IconButtonSAccent
    size == IconButtonSize.S && view == IconButtonView.Positive ->
        IconButtonStyles.IconButtonSPositive
    size == IconButtonSize.S && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonSNegative
    size == IconButtonSize.S && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonSWarning
    size == IconButtonSize.S && view == IconButtonView.Clear -> IconButtonStyles.IconButtonSClear
    size == IconButtonSize.S && view == IconButtonView.Dark -> IconButtonStyles.IconButtonSDark
    size == IconButtonSize.S && view == IconButtonView.Black -> IconButtonStyles.IconButtonSBlack
    size == IconButtonSize.S && view == IconButtonView.White -> IconButtonStyles.IconButtonSWhite
    size == IconButtonSize.Xs && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonXsDefault
    size == IconButtonSize.Xs && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonXsSecondary
    size == IconButtonSize.Xs && view == IconButtonView.Accent ->
        IconButtonStyles.IconButtonXsAccent
    size == IconButtonSize.Xs && view == IconButtonView.Positive ->
        IconButtonStyles.IconButtonXsPositive
    size == IconButtonSize.Xs && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonXsNegative
    size == IconButtonSize.Xs && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonXsWarning
    size == IconButtonSize.Xs && view == IconButtonView.Clear -> IconButtonStyles.IconButtonXsClear
    size == IconButtonSize.Xs && view == IconButtonView.Dark -> IconButtonStyles.IconButtonXsDark
    size == IconButtonSize.Xs && view == IconButtonView.Black -> IconButtonStyles.IconButtonXsBlack
    size == IconButtonSize.Xs && view == IconButtonView.White -> IconButtonStyles.IconButtonXsWhite
    size == IconButtonSize.Xxs && view == IconButtonView.Default ->
        IconButtonStyles.IconButtonXxsDefault
    size == IconButtonSize.Xxs && view == IconButtonView.Secondary ->
        IconButtonStyles.IconButtonXxsSecondary
    size == IconButtonSize.Xxs && view == IconButtonView.Accent ->
        IconButtonStyles.IconButtonXxsAccent
    size == IconButtonSize.Xxs && view == IconButtonView.Positive ->
        IconButtonStyles.IconButtonXxsPositive
    size == IconButtonSize.Xxs && view == IconButtonView.Negative ->
        IconButtonStyles.IconButtonXxsNegative
    size == IconButtonSize.Xxs && view == IconButtonView.Warning ->
        IconButtonStyles.IconButtonXxsWarning
    size == IconButtonSize.Xxs && view == IconButtonView.Clear ->
        IconButtonStyles.IconButtonXxsClear
    size == IconButtonSize.Xxs && view == IconButtonView.Dark -> IconButtonStyles.IconButtonXxsDark
    size == IconButtonSize.Xxs && view == IconButtonView.Black ->
        IconButtonStyles.IconButtonXxsBlack
    size == IconButtonSize.Xxs && view == IconButtonView.White ->
        IconButtonStyles.IconButtonXxsWhite
    else -> error("Unsupported icon-button style combination")
}

/**
 * Возвращает [ButtonStyle] для icon-button
 */
@Composable
public fun IconButtonStyles.Companion.style(
    size: IconButtonSize = IconButtonSize.Xl,
    shape: IconButtonShape = IconButtonShape.Default,
    view: IconButtonView = IconButtonView.Default,
    modify: @Composable IconButtonStyleBuilder.() -> Unit = {},
): ButtonStyle = resolve(size, shape, view).style(modify)
