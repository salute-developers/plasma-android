// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.iconbadge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента IconBadge
 */
public enum class IconBadgeStyles(
    public val key: String,
) {
    IconBadgeClearLDefault("IconBadgeClear.L.Default"),
    IconBadgeClearLAccent("IconBadgeClear.L.Accent"),
    IconBadgeClearLNegative("IconBadgeClear.L.Negative"),
    IconBadgeClearLPositive("IconBadgeClear.L.Positive"),
    IconBadgeClearLWarning("IconBadgeClear.L.Warning"),
    IconBadgeClearLDark("IconBadgeClear.L.Dark"),
    IconBadgeClearLLight("IconBadgeClear.L.Light"),
    IconBadgeClearLPilledDefault("IconBadgeClear.L.Pilled.Default"),
    IconBadgeClearLPilledAccent("IconBadgeClear.L.Pilled.Accent"),
    IconBadgeClearLPilledNegative("IconBadgeClear.L.Pilled.Negative"),
    IconBadgeClearLPilledPositive("IconBadgeClear.L.Pilled.Positive"),
    IconBadgeClearLPilledWarning("IconBadgeClear.L.Pilled.Warning"),
    IconBadgeClearLPilledDark("IconBadgeClear.L.Pilled.Dark"),
    IconBadgeClearLPilledLight("IconBadgeClear.L.Pilled.Light"),
    IconBadgeClearMDefault("IconBadgeClear.M.Default"),
    IconBadgeClearMAccent("IconBadgeClear.M.Accent"),
    IconBadgeClearMNegative("IconBadgeClear.M.Negative"),
    IconBadgeClearMPositive("IconBadgeClear.M.Positive"),
    IconBadgeClearMWarning("IconBadgeClear.M.Warning"),
    IconBadgeClearMDark("IconBadgeClear.M.Dark"),
    IconBadgeClearMLight("IconBadgeClear.M.Light"),
    IconBadgeClearMPilledDefault("IconBadgeClear.M.Pilled.Default"),
    IconBadgeClearMPilledAccent("IconBadgeClear.M.Pilled.Accent"),
    IconBadgeClearMPilledNegative("IconBadgeClear.M.Pilled.Negative"),
    IconBadgeClearMPilledPositive("IconBadgeClear.M.Pilled.Positive"),
    IconBadgeClearMPilledWarning("IconBadgeClear.M.Pilled.Warning"),
    IconBadgeClearMPilledDark("IconBadgeClear.M.Pilled.Dark"),
    IconBadgeClearMPilledLight("IconBadgeClear.M.Pilled.Light"),
    IconBadgeClearSDefault("IconBadgeClear.S.Default"),
    IconBadgeClearSAccent("IconBadgeClear.S.Accent"),
    IconBadgeClearSNegative("IconBadgeClear.S.Negative"),
    IconBadgeClearSPositive("IconBadgeClear.S.Positive"),
    IconBadgeClearSWarning("IconBadgeClear.S.Warning"),
    IconBadgeClearSDark("IconBadgeClear.S.Dark"),
    IconBadgeClearSLight("IconBadgeClear.S.Light"),
    IconBadgeClearSPilledDefault("IconBadgeClear.S.Pilled.Default"),
    IconBadgeClearSPilledAccent("IconBadgeClear.S.Pilled.Accent"),
    IconBadgeClearSPilledNegative("IconBadgeClear.S.Pilled.Negative"),
    IconBadgeClearSPilledPositive("IconBadgeClear.S.Pilled.Positive"),
    IconBadgeClearSPilledWarning("IconBadgeClear.S.Pilled.Warning"),
    IconBadgeClearSPilledDark("IconBadgeClear.S.Pilled.Dark"),
    IconBadgeClearSPilledLight("IconBadgeClear.S.Pilled.Light"),
    IconBadgeClearXsDefault("IconBadgeClear.Xs.Default"),
    IconBadgeClearXsAccent("IconBadgeClear.Xs.Accent"),
    IconBadgeClearXsNegative("IconBadgeClear.Xs.Negative"),
    IconBadgeClearXsPositive("IconBadgeClear.Xs.Positive"),
    IconBadgeClearXsWarning("IconBadgeClear.Xs.Warning"),
    IconBadgeClearXsDark("IconBadgeClear.Xs.Dark"),
    IconBadgeClearXsLight("IconBadgeClear.Xs.Light"),
    IconBadgeClearXsPilledDefault("IconBadgeClear.Xs.Pilled.Default"),
    IconBadgeClearXsPilledAccent("IconBadgeClear.Xs.Pilled.Accent"),
    IconBadgeClearXsPilledNegative("IconBadgeClear.Xs.Pilled.Negative"),
    IconBadgeClearXsPilledPositive("IconBadgeClear.Xs.Pilled.Positive"),
    IconBadgeClearXsPilledWarning("IconBadgeClear.Xs.Pilled.Warning"),
    IconBadgeClearXsPilledDark("IconBadgeClear.Xs.Pilled.Dark"),
    IconBadgeClearXsPilledLight("IconBadgeClear.Xs.Pilled.Light"),
    IconBadgeSolidLDefault("IconBadgeSolid.L.Default"),
    IconBadgeSolidLAccent("IconBadgeSolid.L.Accent"),
    IconBadgeSolidLNegative("IconBadgeSolid.L.Negative"),
    IconBadgeSolidLPositive("IconBadgeSolid.L.Positive"),
    IconBadgeSolidLWarning("IconBadgeSolid.L.Warning"),
    IconBadgeSolidLDark("IconBadgeSolid.L.Dark"),
    IconBadgeSolidLLight("IconBadgeSolid.L.Light"),
    IconBadgeSolidLPilledDefault("IconBadgeSolid.L.Pilled.Default"),
    IconBadgeSolidLPilledAccent("IconBadgeSolid.L.Pilled.Accent"),
    IconBadgeSolidLPilledNegative("IconBadgeSolid.L.Pilled.Negative"),
    IconBadgeSolidLPilledPositive("IconBadgeSolid.L.Pilled.Positive"),
    IconBadgeSolidLPilledWarning("IconBadgeSolid.L.Pilled.Warning"),
    IconBadgeSolidLPilledDark("IconBadgeSolid.L.Pilled.Dark"),
    IconBadgeSolidLPilledLight("IconBadgeSolid.L.Pilled.Light"),
    IconBadgeSolidMDefault("IconBadgeSolid.M.Default"),
    IconBadgeSolidMAccent("IconBadgeSolid.M.Accent"),
    IconBadgeSolidMNegative("IconBadgeSolid.M.Negative"),
    IconBadgeSolidMPositive("IconBadgeSolid.M.Positive"),
    IconBadgeSolidMWarning("IconBadgeSolid.M.Warning"),
    IconBadgeSolidMDark("IconBadgeSolid.M.Dark"),
    IconBadgeSolidMLight("IconBadgeSolid.M.Light"),
    IconBadgeSolidMPilledDefault("IconBadgeSolid.M.Pilled.Default"),
    IconBadgeSolidMPilledAccent("IconBadgeSolid.M.Pilled.Accent"),
    IconBadgeSolidMPilledNegative("IconBadgeSolid.M.Pilled.Negative"),
    IconBadgeSolidMPilledPositive("IconBadgeSolid.M.Pilled.Positive"),
    IconBadgeSolidMPilledWarning("IconBadgeSolid.M.Pilled.Warning"),
    IconBadgeSolidMPilledDark("IconBadgeSolid.M.Pilled.Dark"),
    IconBadgeSolidMPilledLight("IconBadgeSolid.M.Pilled.Light"),
    IconBadgeSolidSDefault("IconBadgeSolid.S.Default"),
    IconBadgeSolidSAccent("IconBadgeSolid.S.Accent"),
    IconBadgeSolidSNegative("IconBadgeSolid.S.Negative"),
    IconBadgeSolidSPositive("IconBadgeSolid.S.Positive"),
    IconBadgeSolidSWarning("IconBadgeSolid.S.Warning"),
    IconBadgeSolidSDark("IconBadgeSolid.S.Dark"),
    IconBadgeSolidSLight("IconBadgeSolid.S.Light"),
    IconBadgeSolidSPilledDefault("IconBadgeSolid.S.Pilled.Default"),
    IconBadgeSolidSPilledAccent("IconBadgeSolid.S.Pilled.Accent"),
    IconBadgeSolidSPilledNegative("IconBadgeSolid.S.Pilled.Negative"),
    IconBadgeSolidSPilledPositive("IconBadgeSolid.S.Pilled.Positive"),
    IconBadgeSolidSPilledWarning("IconBadgeSolid.S.Pilled.Warning"),
    IconBadgeSolidSPilledDark("IconBadgeSolid.S.Pilled.Dark"),
    IconBadgeSolidSPilledLight("IconBadgeSolid.S.Pilled.Light"),
    IconBadgeSolidXsDefault("IconBadgeSolid.Xs.Default"),
    IconBadgeSolidXsAccent("IconBadgeSolid.Xs.Accent"),
    IconBadgeSolidXsNegative("IconBadgeSolid.Xs.Negative"),
    IconBadgeSolidXsPositive("IconBadgeSolid.Xs.Positive"),
    IconBadgeSolidXsWarning("IconBadgeSolid.Xs.Warning"),
    IconBadgeSolidXsDark("IconBadgeSolid.Xs.Dark"),
    IconBadgeSolidXsLight("IconBadgeSolid.Xs.Light"),
    IconBadgeSolidXsPilledDefault("IconBadgeSolid.Xs.Pilled.Default"),
    IconBadgeSolidXsPilledAccent("IconBadgeSolid.Xs.Pilled.Accent"),
    IconBadgeSolidXsPilledNegative("IconBadgeSolid.Xs.Pilled.Negative"),
    IconBadgeSolidXsPilledPositive("IconBadgeSolid.Xs.Pilled.Positive"),
    IconBadgeSolidXsPilledWarning("IconBadgeSolid.Xs.Pilled.Warning"),
    IconBadgeSolidXsPilledDark("IconBadgeSolid.Xs.Pilled.Dark"),
    IconBadgeSolidXsPilledLight("IconBadgeSolid.Xs.Pilled.Light"),
    IconBadgeTransparentLDefault("IconBadgeTransparent.L.Default"),
    IconBadgeTransparentLAccent("IconBadgeTransparent.L.Accent"),
    IconBadgeTransparentLNegative("IconBadgeTransparent.L.Negative"),
    IconBadgeTransparentLPositive("IconBadgeTransparent.L.Positive"),
    IconBadgeTransparentLWarning("IconBadgeTransparent.L.Warning"),
    IconBadgeTransparentLDark("IconBadgeTransparent.L.Dark"),
    IconBadgeTransparentLLight("IconBadgeTransparent.L.Light"),
    IconBadgeTransparentLPilledDefault("IconBadgeTransparent.L.Pilled.Default"),
    IconBadgeTransparentLPilledAccent("IconBadgeTransparent.L.Pilled.Accent"),
    IconBadgeTransparentLPilledNegative("IconBadgeTransparent.L.Pilled.Negative"),
    IconBadgeTransparentLPilledPositive("IconBadgeTransparent.L.Pilled.Positive"),
    IconBadgeTransparentLPilledWarning("IconBadgeTransparent.L.Pilled.Warning"),
    IconBadgeTransparentLPilledDark("IconBadgeTransparent.L.Pilled.Dark"),
    IconBadgeTransparentLPilledLight("IconBadgeTransparent.L.Pilled.Light"),
    IconBadgeTransparentMDefault("IconBadgeTransparent.M.Default"),
    IconBadgeTransparentMAccent("IconBadgeTransparent.M.Accent"),
    IconBadgeTransparentMNegative("IconBadgeTransparent.M.Negative"),
    IconBadgeTransparentMPositive("IconBadgeTransparent.M.Positive"),
    IconBadgeTransparentMWarning("IconBadgeTransparent.M.Warning"),
    IconBadgeTransparentMDark("IconBadgeTransparent.M.Dark"),
    IconBadgeTransparentMLight("IconBadgeTransparent.M.Light"),
    IconBadgeTransparentMPilledDefault("IconBadgeTransparent.M.Pilled.Default"),
    IconBadgeTransparentMPilledAccent("IconBadgeTransparent.M.Pilled.Accent"),
    IconBadgeTransparentMPilledNegative("IconBadgeTransparent.M.Pilled.Negative"),
    IconBadgeTransparentMPilledPositive("IconBadgeTransparent.M.Pilled.Positive"),
    IconBadgeTransparentMPilledWarning("IconBadgeTransparent.M.Pilled.Warning"),
    IconBadgeTransparentMPilledDark("IconBadgeTransparent.M.Pilled.Dark"),
    IconBadgeTransparentMPilledLight("IconBadgeTransparent.M.Pilled.Light"),
    IconBadgeTransparentSDefault("IconBadgeTransparent.S.Default"),
    IconBadgeTransparentSAccent("IconBadgeTransparent.S.Accent"),
    IconBadgeTransparentSNegative("IconBadgeTransparent.S.Negative"),
    IconBadgeTransparentSPositive("IconBadgeTransparent.S.Positive"),
    IconBadgeTransparentSWarning("IconBadgeTransparent.S.Warning"),
    IconBadgeTransparentSDark("IconBadgeTransparent.S.Dark"),
    IconBadgeTransparentSLight("IconBadgeTransparent.S.Light"),
    IconBadgeTransparentSPilledDefault("IconBadgeTransparent.S.Pilled.Default"),
    IconBadgeTransparentSPilledAccent("IconBadgeTransparent.S.Pilled.Accent"),
    IconBadgeTransparentSPilledNegative("IconBadgeTransparent.S.Pilled.Negative"),
    IconBadgeTransparentSPilledPositive("IconBadgeTransparent.S.Pilled.Positive"),
    IconBadgeTransparentSPilledWarning("IconBadgeTransparent.S.Pilled.Warning"),
    IconBadgeTransparentSPilledDark("IconBadgeTransparent.S.Pilled.Dark"),
    IconBadgeTransparentSPilledLight("IconBadgeTransparent.S.Pilled.Light"),
    IconBadgeTransparentXsDefault("IconBadgeTransparent.Xs.Default"),
    IconBadgeTransparentXsAccent("IconBadgeTransparent.Xs.Accent"),
    IconBadgeTransparentXsNegative("IconBadgeTransparent.Xs.Negative"),
    IconBadgeTransparentXsPositive("IconBadgeTransparent.Xs.Positive"),
    IconBadgeTransparentXsWarning("IconBadgeTransparent.Xs.Warning"),
    IconBadgeTransparentXsDark("IconBadgeTransparent.Xs.Dark"),
    IconBadgeTransparentXsLight("IconBadgeTransparent.Xs.Light"),
    IconBadgeTransparentXsPilledDefault("IconBadgeTransparent.Xs.Pilled.Default"),
    IconBadgeTransparentXsPilledAccent("IconBadgeTransparent.Xs.Pilled.Accent"),
    IconBadgeTransparentXsPilledNegative("IconBadgeTransparent.Xs.Pilled.Negative"),
    IconBadgeTransparentXsPilledPositive("IconBadgeTransparent.Xs.Pilled.Positive"),
    IconBadgeTransparentXsPilledWarning("IconBadgeTransparent.Xs.Pilled.Warning"),
    IconBadgeTransparentXsPilledDark("IconBadgeTransparent.Xs.Pilled.Dark"),
    IconBadgeTransparentXsPilledLight("IconBadgeTransparent.Xs.Pilled.Light"),
}

/**
 * Возвращает [BadgeStyle] для [IconBadgeStyles]
 */
@Composable
public fun IconBadgeStyles.style(modifyAction: @Composable IconBadgeStyleBuilder.() -> Unit = {}): BadgeStyle {
    val builder = when (this) {
        IconBadgeStyles.IconBadgeClearLDefault -> IconBadgeClear.L.Default
        IconBadgeStyles.IconBadgeClearLAccent -> IconBadgeClear.L.Accent
        IconBadgeStyles.IconBadgeClearLNegative -> IconBadgeClear.L.Negative
        IconBadgeStyles.IconBadgeClearLPositive -> IconBadgeClear.L.Positive
        IconBadgeStyles.IconBadgeClearLWarning -> IconBadgeClear.L.Warning
        IconBadgeStyles.IconBadgeClearLDark -> IconBadgeClear.L.Dark
        IconBadgeStyles.IconBadgeClearLLight -> IconBadgeClear.L.Light
        IconBadgeStyles.IconBadgeClearLPilledDefault -> IconBadgeClear.L.Pilled.Default
        IconBadgeStyles.IconBadgeClearLPilledAccent -> IconBadgeClear.L.Pilled.Accent
        IconBadgeStyles.IconBadgeClearLPilledNegative -> IconBadgeClear.L.Pilled.Negative
        IconBadgeStyles.IconBadgeClearLPilledPositive -> IconBadgeClear.L.Pilled.Positive
        IconBadgeStyles.IconBadgeClearLPilledWarning -> IconBadgeClear.L.Pilled.Warning
        IconBadgeStyles.IconBadgeClearLPilledDark -> IconBadgeClear.L.Pilled.Dark
        IconBadgeStyles.IconBadgeClearLPilledLight -> IconBadgeClear.L.Pilled.Light
        IconBadgeStyles.IconBadgeClearMDefault -> IconBadgeClear.M.Default
        IconBadgeStyles.IconBadgeClearMAccent -> IconBadgeClear.M.Accent
        IconBadgeStyles.IconBadgeClearMNegative -> IconBadgeClear.M.Negative
        IconBadgeStyles.IconBadgeClearMPositive -> IconBadgeClear.M.Positive
        IconBadgeStyles.IconBadgeClearMWarning -> IconBadgeClear.M.Warning
        IconBadgeStyles.IconBadgeClearMDark -> IconBadgeClear.M.Dark
        IconBadgeStyles.IconBadgeClearMLight -> IconBadgeClear.M.Light
        IconBadgeStyles.IconBadgeClearMPilledDefault -> IconBadgeClear.M.Pilled.Default
        IconBadgeStyles.IconBadgeClearMPilledAccent -> IconBadgeClear.M.Pilled.Accent
        IconBadgeStyles.IconBadgeClearMPilledNegative -> IconBadgeClear.M.Pilled.Negative
        IconBadgeStyles.IconBadgeClearMPilledPositive -> IconBadgeClear.M.Pilled.Positive
        IconBadgeStyles.IconBadgeClearMPilledWarning -> IconBadgeClear.M.Pilled.Warning
        IconBadgeStyles.IconBadgeClearMPilledDark -> IconBadgeClear.M.Pilled.Dark
        IconBadgeStyles.IconBadgeClearMPilledLight -> IconBadgeClear.M.Pilled.Light
        IconBadgeStyles.IconBadgeClearSDefault -> IconBadgeClear.S.Default
        IconBadgeStyles.IconBadgeClearSAccent -> IconBadgeClear.S.Accent
        IconBadgeStyles.IconBadgeClearSNegative -> IconBadgeClear.S.Negative
        IconBadgeStyles.IconBadgeClearSPositive -> IconBadgeClear.S.Positive
        IconBadgeStyles.IconBadgeClearSWarning -> IconBadgeClear.S.Warning
        IconBadgeStyles.IconBadgeClearSDark -> IconBadgeClear.S.Dark
        IconBadgeStyles.IconBadgeClearSLight -> IconBadgeClear.S.Light
        IconBadgeStyles.IconBadgeClearSPilledDefault -> IconBadgeClear.S.Pilled.Default
        IconBadgeStyles.IconBadgeClearSPilledAccent -> IconBadgeClear.S.Pilled.Accent
        IconBadgeStyles.IconBadgeClearSPilledNegative -> IconBadgeClear.S.Pilled.Negative
        IconBadgeStyles.IconBadgeClearSPilledPositive -> IconBadgeClear.S.Pilled.Positive
        IconBadgeStyles.IconBadgeClearSPilledWarning -> IconBadgeClear.S.Pilled.Warning
        IconBadgeStyles.IconBadgeClearSPilledDark -> IconBadgeClear.S.Pilled.Dark
        IconBadgeStyles.IconBadgeClearSPilledLight -> IconBadgeClear.S.Pilled.Light
        IconBadgeStyles.IconBadgeClearXsDefault -> IconBadgeClear.Xs.Default
        IconBadgeStyles.IconBadgeClearXsAccent -> IconBadgeClear.Xs.Accent
        IconBadgeStyles.IconBadgeClearXsNegative -> IconBadgeClear.Xs.Negative
        IconBadgeStyles.IconBadgeClearXsPositive -> IconBadgeClear.Xs.Positive
        IconBadgeStyles.IconBadgeClearXsWarning -> IconBadgeClear.Xs.Warning
        IconBadgeStyles.IconBadgeClearXsDark -> IconBadgeClear.Xs.Dark
        IconBadgeStyles.IconBadgeClearXsLight -> IconBadgeClear.Xs.Light
        IconBadgeStyles.IconBadgeClearXsPilledDefault -> IconBadgeClear.Xs.Pilled.Default
        IconBadgeStyles.IconBadgeClearXsPilledAccent -> IconBadgeClear.Xs.Pilled.Accent
        IconBadgeStyles.IconBadgeClearXsPilledNegative -> IconBadgeClear.Xs.Pilled.Negative
        IconBadgeStyles.IconBadgeClearXsPilledPositive -> IconBadgeClear.Xs.Pilled.Positive
        IconBadgeStyles.IconBadgeClearXsPilledWarning -> IconBadgeClear.Xs.Pilled.Warning
        IconBadgeStyles.IconBadgeClearXsPilledDark -> IconBadgeClear.Xs.Pilled.Dark
        IconBadgeStyles.IconBadgeClearXsPilledLight -> IconBadgeClear.Xs.Pilled.Light
        IconBadgeStyles.IconBadgeSolidLDefault -> IconBadgeSolid.L.Default
        IconBadgeStyles.IconBadgeSolidLAccent -> IconBadgeSolid.L.Accent
        IconBadgeStyles.IconBadgeSolidLNegative -> IconBadgeSolid.L.Negative
        IconBadgeStyles.IconBadgeSolidLPositive -> IconBadgeSolid.L.Positive
        IconBadgeStyles.IconBadgeSolidLWarning -> IconBadgeSolid.L.Warning
        IconBadgeStyles.IconBadgeSolidLDark -> IconBadgeSolid.L.Dark
        IconBadgeStyles.IconBadgeSolidLLight -> IconBadgeSolid.L.Light
        IconBadgeStyles.IconBadgeSolidLPilledDefault -> IconBadgeSolid.L.Pilled.Default
        IconBadgeStyles.IconBadgeSolidLPilledAccent -> IconBadgeSolid.L.Pilled.Accent
        IconBadgeStyles.IconBadgeSolidLPilledNegative -> IconBadgeSolid.L.Pilled.Negative
        IconBadgeStyles.IconBadgeSolidLPilledPositive -> IconBadgeSolid.L.Pilled.Positive
        IconBadgeStyles.IconBadgeSolidLPilledWarning -> IconBadgeSolid.L.Pilled.Warning
        IconBadgeStyles.IconBadgeSolidLPilledDark -> IconBadgeSolid.L.Pilled.Dark
        IconBadgeStyles.IconBadgeSolidLPilledLight -> IconBadgeSolid.L.Pilled.Light
        IconBadgeStyles.IconBadgeSolidMDefault -> IconBadgeSolid.M.Default
        IconBadgeStyles.IconBadgeSolidMAccent -> IconBadgeSolid.M.Accent
        IconBadgeStyles.IconBadgeSolidMNegative -> IconBadgeSolid.M.Negative
        IconBadgeStyles.IconBadgeSolidMPositive -> IconBadgeSolid.M.Positive
        IconBadgeStyles.IconBadgeSolidMWarning -> IconBadgeSolid.M.Warning
        IconBadgeStyles.IconBadgeSolidMDark -> IconBadgeSolid.M.Dark
        IconBadgeStyles.IconBadgeSolidMLight -> IconBadgeSolid.M.Light
        IconBadgeStyles.IconBadgeSolidMPilledDefault -> IconBadgeSolid.M.Pilled.Default
        IconBadgeStyles.IconBadgeSolidMPilledAccent -> IconBadgeSolid.M.Pilled.Accent
        IconBadgeStyles.IconBadgeSolidMPilledNegative -> IconBadgeSolid.M.Pilled.Negative
        IconBadgeStyles.IconBadgeSolidMPilledPositive -> IconBadgeSolid.M.Pilled.Positive
        IconBadgeStyles.IconBadgeSolidMPilledWarning -> IconBadgeSolid.M.Pilled.Warning
        IconBadgeStyles.IconBadgeSolidMPilledDark -> IconBadgeSolid.M.Pilled.Dark
        IconBadgeStyles.IconBadgeSolidMPilledLight -> IconBadgeSolid.M.Pilled.Light
        IconBadgeStyles.IconBadgeSolidSDefault -> IconBadgeSolid.S.Default
        IconBadgeStyles.IconBadgeSolidSAccent -> IconBadgeSolid.S.Accent
        IconBadgeStyles.IconBadgeSolidSNegative -> IconBadgeSolid.S.Negative
        IconBadgeStyles.IconBadgeSolidSPositive -> IconBadgeSolid.S.Positive
        IconBadgeStyles.IconBadgeSolidSWarning -> IconBadgeSolid.S.Warning
        IconBadgeStyles.IconBadgeSolidSDark -> IconBadgeSolid.S.Dark
        IconBadgeStyles.IconBadgeSolidSLight -> IconBadgeSolid.S.Light
        IconBadgeStyles.IconBadgeSolidSPilledDefault -> IconBadgeSolid.S.Pilled.Default
        IconBadgeStyles.IconBadgeSolidSPilledAccent -> IconBadgeSolid.S.Pilled.Accent
        IconBadgeStyles.IconBadgeSolidSPilledNegative -> IconBadgeSolid.S.Pilled.Negative
        IconBadgeStyles.IconBadgeSolidSPilledPositive -> IconBadgeSolid.S.Pilled.Positive
        IconBadgeStyles.IconBadgeSolidSPilledWarning -> IconBadgeSolid.S.Pilled.Warning
        IconBadgeStyles.IconBadgeSolidSPilledDark -> IconBadgeSolid.S.Pilled.Dark
        IconBadgeStyles.IconBadgeSolidSPilledLight -> IconBadgeSolid.S.Pilled.Light
        IconBadgeStyles.IconBadgeSolidXsDefault -> IconBadgeSolid.Xs.Default
        IconBadgeStyles.IconBadgeSolidXsAccent -> IconBadgeSolid.Xs.Accent
        IconBadgeStyles.IconBadgeSolidXsNegative -> IconBadgeSolid.Xs.Negative
        IconBadgeStyles.IconBadgeSolidXsPositive -> IconBadgeSolid.Xs.Positive
        IconBadgeStyles.IconBadgeSolidXsWarning -> IconBadgeSolid.Xs.Warning
        IconBadgeStyles.IconBadgeSolidXsDark -> IconBadgeSolid.Xs.Dark
        IconBadgeStyles.IconBadgeSolidXsLight -> IconBadgeSolid.Xs.Light
        IconBadgeStyles.IconBadgeSolidXsPilledDefault -> IconBadgeSolid.Xs.Pilled.Default
        IconBadgeStyles.IconBadgeSolidXsPilledAccent -> IconBadgeSolid.Xs.Pilled.Accent
        IconBadgeStyles.IconBadgeSolidXsPilledNegative -> IconBadgeSolid.Xs.Pilled.Negative
        IconBadgeStyles.IconBadgeSolidXsPilledPositive -> IconBadgeSolid.Xs.Pilled.Positive
        IconBadgeStyles.IconBadgeSolidXsPilledWarning -> IconBadgeSolid.Xs.Pilled.Warning
        IconBadgeStyles.IconBadgeSolidXsPilledDark -> IconBadgeSolid.Xs.Pilled.Dark
        IconBadgeStyles.IconBadgeSolidXsPilledLight -> IconBadgeSolid.Xs.Pilled.Light
        IconBadgeStyles.IconBadgeTransparentLDefault -> IconBadgeTransparent.L.Default
        IconBadgeStyles.IconBadgeTransparentLAccent -> IconBadgeTransparent.L.Accent
        IconBadgeStyles.IconBadgeTransparentLNegative -> IconBadgeTransparent.L.Negative
        IconBadgeStyles.IconBadgeTransparentLPositive -> IconBadgeTransparent.L.Positive
        IconBadgeStyles.IconBadgeTransparentLWarning -> IconBadgeTransparent.L.Warning
        IconBadgeStyles.IconBadgeTransparentLDark -> IconBadgeTransparent.L.Dark
        IconBadgeStyles.IconBadgeTransparentLLight -> IconBadgeTransparent.L.Light
        IconBadgeStyles.IconBadgeTransparentLPilledDefault -> IconBadgeTransparent.L.Pilled.Default
        IconBadgeStyles.IconBadgeTransparentLPilledAccent -> IconBadgeTransparent.L.Pilled.Accent
        IconBadgeStyles.IconBadgeTransparentLPilledNegative -> IconBadgeTransparent.L.Pilled.Negative
        IconBadgeStyles.IconBadgeTransparentLPilledPositive -> IconBadgeTransparent.L.Pilled.Positive
        IconBadgeStyles.IconBadgeTransparentLPilledWarning -> IconBadgeTransparent.L.Pilled.Warning
        IconBadgeStyles.IconBadgeTransparentLPilledDark -> IconBadgeTransparent.L.Pilled.Dark
        IconBadgeStyles.IconBadgeTransparentLPilledLight -> IconBadgeTransparent.L.Pilled.Light
        IconBadgeStyles.IconBadgeTransparentMDefault -> IconBadgeTransparent.M.Default
        IconBadgeStyles.IconBadgeTransparentMAccent -> IconBadgeTransparent.M.Accent
        IconBadgeStyles.IconBadgeTransparentMNegative -> IconBadgeTransparent.M.Negative
        IconBadgeStyles.IconBadgeTransparentMPositive -> IconBadgeTransparent.M.Positive
        IconBadgeStyles.IconBadgeTransparentMWarning -> IconBadgeTransparent.M.Warning
        IconBadgeStyles.IconBadgeTransparentMDark -> IconBadgeTransparent.M.Dark
        IconBadgeStyles.IconBadgeTransparentMLight -> IconBadgeTransparent.M.Light
        IconBadgeStyles.IconBadgeTransparentMPilledDefault -> IconBadgeTransparent.M.Pilled.Default
        IconBadgeStyles.IconBadgeTransparentMPilledAccent -> IconBadgeTransparent.M.Pilled.Accent
        IconBadgeStyles.IconBadgeTransparentMPilledNegative -> IconBadgeTransparent.M.Pilled.Negative
        IconBadgeStyles.IconBadgeTransparentMPilledPositive -> IconBadgeTransparent.M.Pilled.Positive
        IconBadgeStyles.IconBadgeTransparentMPilledWarning -> IconBadgeTransparent.M.Pilled.Warning
        IconBadgeStyles.IconBadgeTransparentMPilledDark -> IconBadgeTransparent.M.Pilled.Dark
        IconBadgeStyles.IconBadgeTransparentMPilledLight -> IconBadgeTransparent.M.Pilled.Light
        IconBadgeStyles.IconBadgeTransparentSDefault -> IconBadgeTransparent.S.Default
        IconBadgeStyles.IconBadgeTransparentSAccent -> IconBadgeTransparent.S.Accent
        IconBadgeStyles.IconBadgeTransparentSNegative -> IconBadgeTransparent.S.Negative
        IconBadgeStyles.IconBadgeTransparentSPositive -> IconBadgeTransparent.S.Positive
        IconBadgeStyles.IconBadgeTransparentSWarning -> IconBadgeTransparent.S.Warning
        IconBadgeStyles.IconBadgeTransparentSDark -> IconBadgeTransparent.S.Dark
        IconBadgeStyles.IconBadgeTransparentSLight -> IconBadgeTransparent.S.Light
        IconBadgeStyles.IconBadgeTransparentSPilledDefault -> IconBadgeTransparent.S.Pilled.Default
        IconBadgeStyles.IconBadgeTransparentSPilledAccent -> IconBadgeTransparent.S.Pilled.Accent
        IconBadgeStyles.IconBadgeTransparentSPilledNegative -> IconBadgeTransparent.S.Pilled.Negative
        IconBadgeStyles.IconBadgeTransparentSPilledPositive -> IconBadgeTransparent.S.Pilled.Positive
        IconBadgeStyles.IconBadgeTransparentSPilledWarning -> IconBadgeTransparent.S.Pilled.Warning
        IconBadgeStyles.IconBadgeTransparentSPilledDark -> IconBadgeTransparent.S.Pilled.Dark
        IconBadgeStyles.IconBadgeTransparentSPilledLight -> IconBadgeTransparent.S.Pilled.Light
        IconBadgeStyles.IconBadgeTransparentXsDefault -> IconBadgeTransparent.Xs.Default
        IconBadgeStyles.IconBadgeTransparentXsAccent -> IconBadgeTransparent.Xs.Accent
        IconBadgeStyles.IconBadgeTransparentXsNegative -> IconBadgeTransparent.Xs.Negative
        IconBadgeStyles.IconBadgeTransparentXsPositive -> IconBadgeTransparent.Xs.Positive
        IconBadgeStyles.IconBadgeTransparentXsWarning -> IconBadgeTransparent.Xs.Warning
        IconBadgeStyles.IconBadgeTransparentXsDark -> IconBadgeTransparent.Xs.Dark
        IconBadgeStyles.IconBadgeTransparentXsLight -> IconBadgeTransparent.Xs.Light
        IconBadgeStyles.IconBadgeTransparentXsPilledDefault -> IconBadgeTransparent.Xs.Pilled.Default
        IconBadgeStyles.IconBadgeTransparentXsPilledAccent -> IconBadgeTransparent.Xs.Pilled.Accent
        IconBadgeStyles.IconBadgeTransparentXsPilledNegative ->
            IconBadgeTransparent.Xs.Pilled.Negative
        IconBadgeStyles.IconBadgeTransparentXsPilledPositive ->
            IconBadgeTransparent.Xs.Pilled.Positive
        IconBadgeStyles.IconBadgeTransparentXsPilledWarning -> IconBadgeTransparent.Xs.Pilled.Warning
        IconBadgeStyles.IconBadgeTransparentXsPilledDark -> IconBadgeTransparent.Xs.Pilled.Dark
        IconBadgeStyles.IconBadgeTransparentXsPilledLight -> IconBadgeTransparent.Xs.Pilled.Light
    }
    return builder.modify(modifyAction).style()
}
