// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.badge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Badge
 */
public enum class BadgeStyles(
    public val key: String,
) {
    BadgeClearLDefault("BadgeClear.L.Default"),
    BadgeClearLAccent("BadgeClear.L.Accent"),
    BadgeClearLNegative("BadgeClear.L.Negative"),
    BadgeClearLPositive("BadgeClear.L.Positive"),
    BadgeClearLWarning("BadgeClear.L.Warning"),
    BadgeClearLDark("BadgeClear.L.Dark"),
    BadgeClearLLight("BadgeClear.L.Light"),
    BadgeClearLPilledDefault("BadgeClear.L.Pilled.Default"),
    BadgeClearLPilledAccent("BadgeClear.L.Pilled.Accent"),
    BadgeClearLPilledNegative("BadgeClear.L.Pilled.Negative"),
    BadgeClearLPilledPositive("BadgeClear.L.Pilled.Positive"),
    BadgeClearLPilledWarning("BadgeClear.L.Pilled.Warning"),
    BadgeClearLPilledDark("BadgeClear.L.Pilled.Dark"),
    BadgeClearLPilledLight("BadgeClear.L.Pilled.Light"),
    BadgeClearMDefault("BadgeClear.M.Default"),
    BadgeClearMAccent("BadgeClear.M.Accent"),
    BadgeClearMNegative("BadgeClear.M.Negative"),
    BadgeClearMPositive("BadgeClear.M.Positive"),
    BadgeClearMWarning("BadgeClear.M.Warning"),
    BadgeClearMDark("BadgeClear.M.Dark"),
    BadgeClearMLight("BadgeClear.M.Light"),
    BadgeClearMPilledDefault("BadgeClear.M.Pilled.Default"),
    BadgeClearMPilledAccent("BadgeClear.M.Pilled.Accent"),
    BadgeClearMPilledNegative("BadgeClear.M.Pilled.Negative"),
    BadgeClearMPilledPositive("BadgeClear.M.Pilled.Positive"),
    BadgeClearMPilledWarning("BadgeClear.M.Pilled.Warning"),
    BadgeClearMPilledDark("BadgeClear.M.Pilled.Dark"),
    BadgeClearMPilledLight("BadgeClear.M.Pilled.Light"),
    BadgeClearSDefault("BadgeClear.S.Default"),
    BadgeClearSAccent("BadgeClear.S.Accent"),
    BadgeClearSNegative("BadgeClear.S.Negative"),
    BadgeClearSPositive("BadgeClear.S.Positive"),
    BadgeClearSWarning("BadgeClear.S.Warning"),
    BadgeClearSDark("BadgeClear.S.Dark"),
    BadgeClearSLight("BadgeClear.S.Light"),
    BadgeClearSPilledDefault("BadgeClear.S.Pilled.Default"),
    BadgeClearSPilledAccent("BadgeClear.S.Pilled.Accent"),
    BadgeClearSPilledNegative("BadgeClear.S.Pilled.Negative"),
    BadgeClearSPilledPositive("BadgeClear.S.Pilled.Positive"),
    BadgeClearSPilledWarning("BadgeClear.S.Pilled.Warning"),
    BadgeClearSPilledDark("BadgeClear.S.Pilled.Dark"),
    BadgeClearSPilledLight("BadgeClear.S.Pilled.Light"),
    BadgeClearXsDefault("BadgeClear.Xs.Default"),
    BadgeClearXsAccent("BadgeClear.Xs.Accent"),
    BadgeClearXsNegative("BadgeClear.Xs.Negative"),
    BadgeClearXsPositive("BadgeClear.Xs.Positive"),
    BadgeClearXsWarning("BadgeClear.Xs.Warning"),
    BadgeClearXsDark("BadgeClear.Xs.Dark"),
    BadgeClearXsLight("BadgeClear.Xs.Light"),
    BadgeClearXsPilledDefault("BadgeClear.Xs.Pilled.Default"),
    BadgeClearXsPilledAccent("BadgeClear.Xs.Pilled.Accent"),
    BadgeClearXsPilledNegative("BadgeClear.Xs.Pilled.Negative"),
    BadgeClearXsPilledPositive("BadgeClear.Xs.Pilled.Positive"),
    BadgeClearXsPilledWarning("BadgeClear.Xs.Pilled.Warning"),
    BadgeClearXsPilledDark("BadgeClear.Xs.Pilled.Dark"),
    BadgeClearXsPilledLight("BadgeClear.Xs.Pilled.Light"),
    BadgeSolidLDefault("BadgeSolid.L.Default"),
    BadgeSolidLAccent("BadgeSolid.L.Accent"),
    BadgeSolidLNegative("BadgeSolid.L.Negative"),
    BadgeSolidLPositive("BadgeSolid.L.Positive"),
    BadgeSolidLWarning("BadgeSolid.L.Warning"),
    BadgeSolidLDark("BadgeSolid.L.Dark"),
    BadgeSolidLLight("BadgeSolid.L.Light"),
    BadgeSolidLPilledDefault("BadgeSolid.L.Pilled.Default"),
    BadgeSolidLPilledAccent("BadgeSolid.L.Pilled.Accent"),
    BadgeSolidLPilledNegative("BadgeSolid.L.Pilled.Negative"),
    BadgeSolidLPilledPositive("BadgeSolid.L.Pilled.Positive"),
    BadgeSolidLPilledWarning("BadgeSolid.L.Pilled.Warning"),
    BadgeSolidLPilledDark("BadgeSolid.L.Pilled.Dark"),
    BadgeSolidLPilledLight("BadgeSolid.L.Pilled.Light"),
    BadgeSolidMDefault("BadgeSolid.M.Default"),
    BadgeSolidMAccent("BadgeSolid.M.Accent"),
    BadgeSolidMNegative("BadgeSolid.M.Negative"),
    BadgeSolidMPositive("BadgeSolid.M.Positive"),
    BadgeSolidMWarning("BadgeSolid.M.Warning"),
    BadgeSolidMDark("BadgeSolid.M.Dark"),
    BadgeSolidMLight("BadgeSolid.M.Light"),
    BadgeSolidMPilledDefault("BadgeSolid.M.Pilled.Default"),
    BadgeSolidMPilledAccent("BadgeSolid.M.Pilled.Accent"),
    BadgeSolidMPilledNegative("BadgeSolid.M.Pilled.Negative"),
    BadgeSolidMPilledPositive("BadgeSolid.M.Pilled.Positive"),
    BadgeSolidMPilledWarning("BadgeSolid.M.Pilled.Warning"),
    BadgeSolidMPilledDark("BadgeSolid.M.Pilled.Dark"),
    BadgeSolidMPilledLight("BadgeSolid.M.Pilled.Light"),
    BadgeSolidSDefault("BadgeSolid.S.Default"),
    BadgeSolidSAccent("BadgeSolid.S.Accent"),
    BadgeSolidSNegative("BadgeSolid.S.Negative"),
    BadgeSolidSPositive("BadgeSolid.S.Positive"),
    BadgeSolidSWarning("BadgeSolid.S.Warning"),
    BadgeSolidSDark("BadgeSolid.S.Dark"),
    BadgeSolidSLight("BadgeSolid.S.Light"),
    BadgeSolidSPilledDefault("BadgeSolid.S.Pilled.Default"),
    BadgeSolidSPilledAccent("BadgeSolid.S.Pilled.Accent"),
    BadgeSolidSPilledNegative("BadgeSolid.S.Pilled.Negative"),
    BadgeSolidSPilledPositive("BadgeSolid.S.Pilled.Positive"),
    BadgeSolidSPilledWarning("BadgeSolid.S.Pilled.Warning"),
    BadgeSolidSPilledDark("BadgeSolid.S.Pilled.Dark"),
    BadgeSolidSPilledLight("BadgeSolid.S.Pilled.Light"),
    BadgeSolidXsDefault("BadgeSolid.Xs.Default"),
    BadgeSolidXsAccent("BadgeSolid.Xs.Accent"),
    BadgeSolidXsNegative("BadgeSolid.Xs.Negative"),
    BadgeSolidXsPositive("BadgeSolid.Xs.Positive"),
    BadgeSolidXsWarning("BadgeSolid.Xs.Warning"),
    BadgeSolidXsDark("BadgeSolid.Xs.Dark"),
    BadgeSolidXsLight("BadgeSolid.Xs.Light"),
    BadgeSolidXsPilledDefault("BadgeSolid.Xs.Pilled.Default"),
    BadgeSolidXsPilledAccent("BadgeSolid.Xs.Pilled.Accent"),
    BadgeSolidXsPilledNegative("BadgeSolid.Xs.Pilled.Negative"),
    BadgeSolidXsPilledPositive("BadgeSolid.Xs.Pilled.Positive"),
    BadgeSolidXsPilledWarning("BadgeSolid.Xs.Pilled.Warning"),
    BadgeSolidXsPilledDark("BadgeSolid.Xs.Pilled.Dark"),
    BadgeSolidXsPilledLight("BadgeSolid.Xs.Pilled.Light"),
    BadgeTransparentLDefault("BadgeTransparent.L.Default"),
    BadgeTransparentLAccent("BadgeTransparent.L.Accent"),
    BadgeTransparentLNegative("BadgeTransparent.L.Negative"),
    BadgeTransparentLPositive("BadgeTransparent.L.Positive"),
    BadgeTransparentLWarning("BadgeTransparent.L.Warning"),
    BadgeTransparentLDark("BadgeTransparent.L.Dark"),
    BadgeTransparentLLight("BadgeTransparent.L.Light"),
    BadgeTransparentLPilledDefault("BadgeTransparent.L.Pilled.Default"),
    BadgeTransparentLPilledAccent("BadgeTransparent.L.Pilled.Accent"),
    BadgeTransparentLPilledNegative("BadgeTransparent.L.Pilled.Negative"),
    BadgeTransparentLPilledPositive("BadgeTransparent.L.Pilled.Positive"),
    BadgeTransparentLPilledWarning("BadgeTransparent.L.Pilled.Warning"),
    BadgeTransparentLPilledDark("BadgeTransparent.L.Pilled.Dark"),
    BadgeTransparentLPilledLight("BadgeTransparent.L.Pilled.Light"),
    BadgeTransparentMDefault("BadgeTransparent.M.Default"),
    BadgeTransparentMAccent("BadgeTransparent.M.Accent"),
    BadgeTransparentMNegative("BadgeTransparent.M.Negative"),
    BadgeTransparentMPositive("BadgeTransparent.M.Positive"),
    BadgeTransparentMWarning("BadgeTransparent.M.Warning"),
    BadgeTransparentMDark("BadgeTransparent.M.Dark"),
    BadgeTransparentMLight("BadgeTransparent.M.Light"),
    BadgeTransparentMPilledDefault("BadgeTransparent.M.Pilled.Default"),
    BadgeTransparentMPilledAccent("BadgeTransparent.M.Pilled.Accent"),
    BadgeTransparentMPilledNegative("BadgeTransparent.M.Pilled.Negative"),
    BadgeTransparentMPilledPositive("BadgeTransparent.M.Pilled.Positive"),
    BadgeTransparentMPilledWarning("BadgeTransparent.M.Pilled.Warning"),
    BadgeTransparentMPilledDark("BadgeTransparent.M.Pilled.Dark"),
    BadgeTransparentMPilledLight("BadgeTransparent.M.Pilled.Light"),
    BadgeTransparentSDefault("BadgeTransparent.S.Default"),
    BadgeTransparentSAccent("BadgeTransparent.S.Accent"),
    BadgeTransparentSNegative("BadgeTransparent.S.Negative"),
    BadgeTransparentSPositive("BadgeTransparent.S.Positive"),
    BadgeTransparentSWarning("BadgeTransparent.S.Warning"),
    BadgeTransparentSDark("BadgeTransparent.S.Dark"),
    BadgeTransparentSLight("BadgeTransparent.S.Light"),
    BadgeTransparentSPilledDefault("BadgeTransparent.S.Pilled.Default"),
    BadgeTransparentSPilledAccent("BadgeTransparent.S.Pilled.Accent"),
    BadgeTransparentSPilledNegative("BadgeTransparent.S.Pilled.Negative"),
    BadgeTransparentSPilledPositive("BadgeTransparent.S.Pilled.Positive"),
    BadgeTransparentSPilledWarning("BadgeTransparent.S.Pilled.Warning"),
    BadgeTransparentSPilledDark("BadgeTransparent.S.Pilled.Dark"),
    BadgeTransparentSPilledLight("BadgeTransparent.S.Pilled.Light"),
    BadgeTransparentXsDefault("BadgeTransparent.Xs.Default"),
    BadgeTransparentXsAccent("BadgeTransparent.Xs.Accent"),
    BadgeTransparentXsNegative("BadgeTransparent.Xs.Negative"),
    BadgeTransparentXsPositive("BadgeTransparent.Xs.Positive"),
    BadgeTransparentXsWarning("BadgeTransparent.Xs.Warning"),
    BadgeTransparentXsDark("BadgeTransparent.Xs.Dark"),
    BadgeTransparentXsLight("BadgeTransparent.Xs.Light"),
    BadgeTransparentXsPilledDefault("BadgeTransparent.Xs.Pilled.Default"),
    BadgeTransparentXsPilledAccent("BadgeTransparent.Xs.Pilled.Accent"),
    BadgeTransparentXsPilledNegative("BadgeTransparent.Xs.Pilled.Negative"),
    BadgeTransparentXsPilledPositive("BadgeTransparent.Xs.Pilled.Positive"),
    BadgeTransparentXsPilledWarning("BadgeTransparent.Xs.Pilled.Warning"),
    BadgeTransparentXsPilledDark("BadgeTransparent.Xs.Pilled.Dark"),
    BadgeTransparentXsPilledLight("BadgeTransparent.Xs.Pilled.Light"),
}

/**
 * Возвращает [BadgeStyle] для [BadgeStyles]
 */
@Composable
public fun BadgeStyles.style(modifyAction: @Composable BadgeStyleBuilder.() -> Unit = {}): BadgeStyle {
    val builder = when (this) {
        BadgeStyles.BadgeClearLDefault -> BadgeClear.L.Default
        BadgeStyles.BadgeClearLAccent -> BadgeClear.L.Accent
        BadgeStyles.BadgeClearLNegative -> BadgeClear.L.Negative
        BadgeStyles.BadgeClearLPositive -> BadgeClear.L.Positive
        BadgeStyles.BadgeClearLWarning -> BadgeClear.L.Warning
        BadgeStyles.BadgeClearLDark -> BadgeClear.L.Dark
        BadgeStyles.BadgeClearLLight -> BadgeClear.L.Light
        BadgeStyles.BadgeClearLPilledDefault -> BadgeClear.L.Pilled.Default
        BadgeStyles.BadgeClearLPilledAccent -> BadgeClear.L.Pilled.Accent
        BadgeStyles.BadgeClearLPilledNegative -> BadgeClear.L.Pilled.Negative
        BadgeStyles.BadgeClearLPilledPositive -> BadgeClear.L.Pilled.Positive
        BadgeStyles.BadgeClearLPilledWarning -> BadgeClear.L.Pilled.Warning
        BadgeStyles.BadgeClearLPilledDark -> BadgeClear.L.Pilled.Dark
        BadgeStyles.BadgeClearLPilledLight -> BadgeClear.L.Pilled.Light
        BadgeStyles.BadgeClearMDefault -> BadgeClear.M.Default
        BadgeStyles.BadgeClearMAccent -> BadgeClear.M.Accent
        BadgeStyles.BadgeClearMNegative -> BadgeClear.M.Negative
        BadgeStyles.BadgeClearMPositive -> BadgeClear.M.Positive
        BadgeStyles.BadgeClearMWarning -> BadgeClear.M.Warning
        BadgeStyles.BadgeClearMDark -> BadgeClear.M.Dark
        BadgeStyles.BadgeClearMLight -> BadgeClear.M.Light
        BadgeStyles.BadgeClearMPilledDefault -> BadgeClear.M.Pilled.Default
        BadgeStyles.BadgeClearMPilledAccent -> BadgeClear.M.Pilled.Accent
        BadgeStyles.BadgeClearMPilledNegative -> BadgeClear.M.Pilled.Negative
        BadgeStyles.BadgeClearMPilledPositive -> BadgeClear.M.Pilled.Positive
        BadgeStyles.BadgeClearMPilledWarning -> BadgeClear.M.Pilled.Warning
        BadgeStyles.BadgeClearMPilledDark -> BadgeClear.M.Pilled.Dark
        BadgeStyles.BadgeClearMPilledLight -> BadgeClear.M.Pilled.Light
        BadgeStyles.BadgeClearSDefault -> BadgeClear.S.Default
        BadgeStyles.BadgeClearSAccent -> BadgeClear.S.Accent
        BadgeStyles.BadgeClearSNegative -> BadgeClear.S.Negative
        BadgeStyles.BadgeClearSPositive -> BadgeClear.S.Positive
        BadgeStyles.BadgeClearSWarning -> BadgeClear.S.Warning
        BadgeStyles.BadgeClearSDark -> BadgeClear.S.Dark
        BadgeStyles.BadgeClearSLight -> BadgeClear.S.Light
        BadgeStyles.BadgeClearSPilledDefault -> BadgeClear.S.Pilled.Default
        BadgeStyles.BadgeClearSPilledAccent -> BadgeClear.S.Pilled.Accent
        BadgeStyles.BadgeClearSPilledNegative -> BadgeClear.S.Pilled.Negative
        BadgeStyles.BadgeClearSPilledPositive -> BadgeClear.S.Pilled.Positive
        BadgeStyles.BadgeClearSPilledWarning -> BadgeClear.S.Pilled.Warning
        BadgeStyles.BadgeClearSPilledDark -> BadgeClear.S.Pilled.Dark
        BadgeStyles.BadgeClearSPilledLight -> BadgeClear.S.Pilled.Light
        BadgeStyles.BadgeClearXsDefault -> BadgeClear.Xs.Default
        BadgeStyles.BadgeClearXsAccent -> BadgeClear.Xs.Accent
        BadgeStyles.BadgeClearXsNegative -> BadgeClear.Xs.Negative
        BadgeStyles.BadgeClearXsPositive -> BadgeClear.Xs.Positive
        BadgeStyles.BadgeClearXsWarning -> BadgeClear.Xs.Warning
        BadgeStyles.BadgeClearXsDark -> BadgeClear.Xs.Dark
        BadgeStyles.BadgeClearXsLight -> BadgeClear.Xs.Light
        BadgeStyles.BadgeClearXsPilledDefault -> BadgeClear.Xs.Pilled.Default
        BadgeStyles.BadgeClearXsPilledAccent -> BadgeClear.Xs.Pilled.Accent
        BadgeStyles.BadgeClearXsPilledNegative -> BadgeClear.Xs.Pilled.Negative
        BadgeStyles.BadgeClearXsPilledPositive -> BadgeClear.Xs.Pilled.Positive
        BadgeStyles.BadgeClearXsPilledWarning -> BadgeClear.Xs.Pilled.Warning
        BadgeStyles.BadgeClearXsPilledDark -> BadgeClear.Xs.Pilled.Dark
        BadgeStyles.BadgeClearXsPilledLight -> BadgeClear.Xs.Pilled.Light
        BadgeStyles.BadgeSolidLDefault -> BadgeSolid.L.Default
        BadgeStyles.BadgeSolidLAccent -> BadgeSolid.L.Accent
        BadgeStyles.BadgeSolidLNegative -> BadgeSolid.L.Negative
        BadgeStyles.BadgeSolidLPositive -> BadgeSolid.L.Positive
        BadgeStyles.BadgeSolidLWarning -> BadgeSolid.L.Warning
        BadgeStyles.BadgeSolidLDark -> BadgeSolid.L.Dark
        BadgeStyles.BadgeSolidLLight -> BadgeSolid.L.Light
        BadgeStyles.BadgeSolidLPilledDefault -> BadgeSolid.L.Pilled.Default
        BadgeStyles.BadgeSolidLPilledAccent -> BadgeSolid.L.Pilled.Accent
        BadgeStyles.BadgeSolidLPilledNegative -> BadgeSolid.L.Pilled.Negative
        BadgeStyles.BadgeSolidLPilledPositive -> BadgeSolid.L.Pilled.Positive
        BadgeStyles.BadgeSolidLPilledWarning -> BadgeSolid.L.Pilled.Warning
        BadgeStyles.BadgeSolidLPilledDark -> BadgeSolid.L.Pilled.Dark
        BadgeStyles.BadgeSolidLPilledLight -> BadgeSolid.L.Pilled.Light
        BadgeStyles.BadgeSolidMDefault -> BadgeSolid.M.Default
        BadgeStyles.BadgeSolidMAccent -> BadgeSolid.M.Accent
        BadgeStyles.BadgeSolidMNegative -> BadgeSolid.M.Negative
        BadgeStyles.BadgeSolidMPositive -> BadgeSolid.M.Positive
        BadgeStyles.BadgeSolidMWarning -> BadgeSolid.M.Warning
        BadgeStyles.BadgeSolidMDark -> BadgeSolid.M.Dark
        BadgeStyles.BadgeSolidMLight -> BadgeSolid.M.Light
        BadgeStyles.BadgeSolidMPilledDefault -> BadgeSolid.M.Pilled.Default
        BadgeStyles.BadgeSolidMPilledAccent -> BadgeSolid.M.Pilled.Accent
        BadgeStyles.BadgeSolidMPilledNegative -> BadgeSolid.M.Pilled.Negative
        BadgeStyles.BadgeSolidMPilledPositive -> BadgeSolid.M.Pilled.Positive
        BadgeStyles.BadgeSolidMPilledWarning -> BadgeSolid.M.Pilled.Warning
        BadgeStyles.BadgeSolidMPilledDark -> BadgeSolid.M.Pilled.Dark
        BadgeStyles.BadgeSolidMPilledLight -> BadgeSolid.M.Pilled.Light
        BadgeStyles.BadgeSolidSDefault -> BadgeSolid.S.Default
        BadgeStyles.BadgeSolidSAccent -> BadgeSolid.S.Accent
        BadgeStyles.BadgeSolidSNegative -> BadgeSolid.S.Negative
        BadgeStyles.BadgeSolidSPositive -> BadgeSolid.S.Positive
        BadgeStyles.BadgeSolidSWarning -> BadgeSolid.S.Warning
        BadgeStyles.BadgeSolidSDark -> BadgeSolid.S.Dark
        BadgeStyles.BadgeSolidSLight -> BadgeSolid.S.Light
        BadgeStyles.BadgeSolidSPilledDefault -> BadgeSolid.S.Pilled.Default
        BadgeStyles.BadgeSolidSPilledAccent -> BadgeSolid.S.Pilled.Accent
        BadgeStyles.BadgeSolidSPilledNegative -> BadgeSolid.S.Pilled.Negative
        BadgeStyles.BadgeSolidSPilledPositive -> BadgeSolid.S.Pilled.Positive
        BadgeStyles.BadgeSolidSPilledWarning -> BadgeSolid.S.Pilled.Warning
        BadgeStyles.BadgeSolidSPilledDark -> BadgeSolid.S.Pilled.Dark
        BadgeStyles.BadgeSolidSPilledLight -> BadgeSolid.S.Pilled.Light
        BadgeStyles.BadgeSolidXsDefault -> BadgeSolid.Xs.Default
        BadgeStyles.BadgeSolidXsAccent -> BadgeSolid.Xs.Accent
        BadgeStyles.BadgeSolidXsNegative -> BadgeSolid.Xs.Negative
        BadgeStyles.BadgeSolidXsPositive -> BadgeSolid.Xs.Positive
        BadgeStyles.BadgeSolidXsWarning -> BadgeSolid.Xs.Warning
        BadgeStyles.BadgeSolidXsDark -> BadgeSolid.Xs.Dark
        BadgeStyles.BadgeSolidXsLight -> BadgeSolid.Xs.Light
        BadgeStyles.BadgeSolidXsPilledDefault -> BadgeSolid.Xs.Pilled.Default
        BadgeStyles.BadgeSolidXsPilledAccent -> BadgeSolid.Xs.Pilled.Accent
        BadgeStyles.BadgeSolidXsPilledNegative -> BadgeSolid.Xs.Pilled.Negative
        BadgeStyles.BadgeSolidXsPilledPositive -> BadgeSolid.Xs.Pilled.Positive
        BadgeStyles.BadgeSolidXsPilledWarning -> BadgeSolid.Xs.Pilled.Warning
        BadgeStyles.BadgeSolidXsPilledDark -> BadgeSolid.Xs.Pilled.Dark
        BadgeStyles.BadgeSolidXsPilledLight -> BadgeSolid.Xs.Pilled.Light
        BadgeStyles.BadgeTransparentLDefault -> BadgeTransparent.L.Default
        BadgeStyles.BadgeTransparentLAccent -> BadgeTransparent.L.Accent
        BadgeStyles.BadgeTransparentLNegative -> BadgeTransparent.L.Negative
        BadgeStyles.BadgeTransparentLPositive -> BadgeTransparent.L.Positive
        BadgeStyles.BadgeTransparentLWarning -> BadgeTransparent.L.Warning
        BadgeStyles.BadgeTransparentLDark -> BadgeTransparent.L.Dark
        BadgeStyles.BadgeTransparentLLight -> BadgeTransparent.L.Light
        BadgeStyles.BadgeTransparentLPilledDefault -> BadgeTransparent.L.Pilled.Default
        BadgeStyles.BadgeTransparentLPilledAccent -> BadgeTransparent.L.Pilled.Accent
        BadgeStyles.BadgeTransparentLPilledNegative -> BadgeTransparent.L.Pilled.Negative
        BadgeStyles.BadgeTransparentLPilledPositive -> BadgeTransparent.L.Pilled.Positive
        BadgeStyles.BadgeTransparentLPilledWarning -> BadgeTransparent.L.Pilled.Warning
        BadgeStyles.BadgeTransparentLPilledDark -> BadgeTransparent.L.Pilled.Dark
        BadgeStyles.BadgeTransparentLPilledLight -> BadgeTransparent.L.Pilled.Light
        BadgeStyles.BadgeTransparentMDefault -> BadgeTransparent.M.Default
        BadgeStyles.BadgeTransparentMAccent -> BadgeTransparent.M.Accent
        BadgeStyles.BadgeTransparentMNegative -> BadgeTransparent.M.Negative
        BadgeStyles.BadgeTransparentMPositive -> BadgeTransparent.M.Positive
        BadgeStyles.BadgeTransparentMWarning -> BadgeTransparent.M.Warning
        BadgeStyles.BadgeTransparentMDark -> BadgeTransparent.M.Dark
        BadgeStyles.BadgeTransparentMLight -> BadgeTransparent.M.Light
        BadgeStyles.BadgeTransparentMPilledDefault -> BadgeTransparent.M.Pilled.Default
        BadgeStyles.BadgeTransparentMPilledAccent -> BadgeTransparent.M.Pilled.Accent
        BadgeStyles.BadgeTransparentMPilledNegative -> BadgeTransparent.M.Pilled.Negative
        BadgeStyles.BadgeTransparentMPilledPositive -> BadgeTransparent.M.Pilled.Positive
        BadgeStyles.BadgeTransparentMPilledWarning -> BadgeTransparent.M.Pilled.Warning
        BadgeStyles.BadgeTransparentMPilledDark -> BadgeTransparent.M.Pilled.Dark
        BadgeStyles.BadgeTransparentMPilledLight -> BadgeTransparent.M.Pilled.Light
        BadgeStyles.BadgeTransparentSDefault -> BadgeTransparent.S.Default
        BadgeStyles.BadgeTransparentSAccent -> BadgeTransparent.S.Accent
        BadgeStyles.BadgeTransparentSNegative -> BadgeTransparent.S.Negative
        BadgeStyles.BadgeTransparentSPositive -> BadgeTransparent.S.Positive
        BadgeStyles.BadgeTransparentSWarning -> BadgeTransparent.S.Warning
        BadgeStyles.BadgeTransparentSDark -> BadgeTransparent.S.Dark
        BadgeStyles.BadgeTransparentSLight -> BadgeTransparent.S.Light
        BadgeStyles.BadgeTransparentSPilledDefault -> BadgeTransparent.S.Pilled.Default
        BadgeStyles.BadgeTransparentSPilledAccent -> BadgeTransparent.S.Pilled.Accent
        BadgeStyles.BadgeTransparentSPilledNegative -> BadgeTransparent.S.Pilled.Negative
        BadgeStyles.BadgeTransparentSPilledPositive -> BadgeTransparent.S.Pilled.Positive
        BadgeStyles.BadgeTransparentSPilledWarning -> BadgeTransparent.S.Pilled.Warning
        BadgeStyles.BadgeTransparentSPilledDark -> BadgeTransparent.S.Pilled.Dark
        BadgeStyles.BadgeTransparentSPilledLight -> BadgeTransparent.S.Pilled.Light
        BadgeStyles.BadgeTransparentXsDefault -> BadgeTransparent.Xs.Default
        BadgeStyles.BadgeTransparentXsAccent -> BadgeTransparent.Xs.Accent
        BadgeStyles.BadgeTransparentXsNegative -> BadgeTransparent.Xs.Negative
        BadgeStyles.BadgeTransparentXsPositive -> BadgeTransparent.Xs.Positive
        BadgeStyles.BadgeTransparentXsWarning -> BadgeTransparent.Xs.Warning
        BadgeStyles.BadgeTransparentXsDark -> BadgeTransparent.Xs.Dark
        BadgeStyles.BadgeTransparentXsLight -> BadgeTransparent.Xs.Light
        BadgeStyles.BadgeTransparentXsPilledDefault -> BadgeTransparent.Xs.Pilled.Default
        BadgeStyles.BadgeTransparentXsPilledAccent -> BadgeTransparent.Xs.Pilled.Accent
        BadgeStyles.BadgeTransparentXsPilledNegative -> BadgeTransparent.Xs.Pilled.Negative
        BadgeStyles.BadgeTransparentXsPilledPositive -> BadgeTransparent.Xs.Pilled.Positive
        BadgeStyles.BadgeTransparentXsPilledWarning -> BadgeTransparent.Xs.Pilled.Warning
        BadgeStyles.BadgeTransparentXsPilledDark -> BadgeTransparent.Xs.Pilled.Dark
        BadgeStyles.BadgeTransparentXsPilledLight -> BadgeTransparent.Xs.Pilled.Light
    }
    return builder.modify(modifyAction).style()
}
