// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.iconbadge

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
    ;

    /**
     * Typed API для подбора стиля icon-badge-solid
     */
    public object Solid

    /**
     * Typed API для подбора стиля icon-badge-transparent
     */
    public object Transparent
}

/**
 * Возможные значения свойства size для icon-badge-solid
 */
public enum class IconBadgeSolidSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для icon-badge-solid
 */
public enum class IconBadgeSolidShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для icon-badge-solid
 */
public enum class IconBadgeSolidView {
    Default,
    Accent,
    Negative,
    Positive,
    Warning,
    Dark,
    Light,
}

/**
 * Возможные значения свойства size для icon-badge-transparent
 */
public enum class IconBadgeTransparentSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для icon-badge-transparent
 */
public enum class IconBadgeTransparentShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для icon-badge-transparent
 */
public enum class IconBadgeTransparentView {
    Default,
    Accent,
    Negative,
    Positive,
    Warning,
    Dark,
    Light,
}

/**
 * Возвращает [BadgeStyle] для [IconBadgeStyles]
 */
@Composable
public fun IconBadgeStyles.style(modify: @Composable IconBadgeStyleBuilder.() -> Unit = {}): BadgeStyle {
    val builder = when (this) {
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IconBadgeStyles] для icon-badge-solid
 */
public fun IconBadgeStyles.Solid.resolve(
    size: IconBadgeSolidSize = IconBadgeSolidSize.L,
    shape: IconBadgeSolidShape = IconBadgeSolidShape.Default,
    view: IconBadgeSolidView = IconBadgeSolidView.Default,
): IconBadgeStyles = when {
    size == IconBadgeSolidSize.L && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Default -> IconBadgeStyles.IconBadgeSolidLPilledDefault
    size == IconBadgeSolidSize.L && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Accent -> IconBadgeStyles.IconBadgeSolidLPilledAccent
    size == IconBadgeSolidSize.L && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Negative -> IconBadgeStyles.IconBadgeSolidLPilledNegative
    size == IconBadgeSolidSize.L && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Positive -> IconBadgeStyles.IconBadgeSolidLPilledPositive
    size == IconBadgeSolidSize.L && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Warning -> IconBadgeStyles.IconBadgeSolidLPilledWarning
    size == IconBadgeSolidSize.L && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Dark -> IconBadgeStyles.IconBadgeSolidLPilledDark
    size == IconBadgeSolidSize.L && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Light -> IconBadgeStyles.IconBadgeSolidLPilledLight
    size == IconBadgeSolidSize.M && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Default -> IconBadgeStyles.IconBadgeSolidMPilledDefault
    size == IconBadgeSolidSize.M && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Accent -> IconBadgeStyles.IconBadgeSolidMPilledAccent
    size == IconBadgeSolidSize.M && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Negative -> IconBadgeStyles.IconBadgeSolidMPilledNegative
    size == IconBadgeSolidSize.M && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Positive -> IconBadgeStyles.IconBadgeSolidMPilledPositive
    size == IconBadgeSolidSize.M && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Warning -> IconBadgeStyles.IconBadgeSolidMPilledWarning
    size == IconBadgeSolidSize.M && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Dark -> IconBadgeStyles.IconBadgeSolidMPilledDark
    size == IconBadgeSolidSize.M && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Light -> IconBadgeStyles.IconBadgeSolidMPilledLight
    size == IconBadgeSolidSize.S && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Default -> IconBadgeStyles.IconBadgeSolidSPilledDefault
    size == IconBadgeSolidSize.S && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Accent -> IconBadgeStyles.IconBadgeSolidSPilledAccent
    size == IconBadgeSolidSize.S && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Negative -> IconBadgeStyles.IconBadgeSolidSPilledNegative
    size == IconBadgeSolidSize.S && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Positive -> IconBadgeStyles.IconBadgeSolidSPilledPositive
    size == IconBadgeSolidSize.S && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Warning -> IconBadgeStyles.IconBadgeSolidSPilledWarning
    size == IconBadgeSolidSize.S && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Dark -> IconBadgeStyles.IconBadgeSolidSPilledDark
    size == IconBadgeSolidSize.S && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Light -> IconBadgeStyles.IconBadgeSolidSPilledLight
    size == IconBadgeSolidSize.Xs && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Default -> IconBadgeStyles.IconBadgeSolidXsPilledDefault
    size == IconBadgeSolidSize.Xs && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Accent -> IconBadgeStyles.IconBadgeSolidXsPilledAccent
    size == IconBadgeSolidSize.Xs && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Negative -> IconBadgeStyles.IconBadgeSolidXsPilledNegative
    size == IconBadgeSolidSize.Xs && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Positive -> IconBadgeStyles.IconBadgeSolidXsPilledPositive
    size == IconBadgeSolidSize.Xs && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Warning -> IconBadgeStyles.IconBadgeSolidXsPilledWarning
    size == IconBadgeSolidSize.Xs && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Dark -> IconBadgeStyles.IconBadgeSolidXsPilledDark
    size == IconBadgeSolidSize.Xs && shape == IconBadgeSolidShape.Pilled && view ==
        IconBadgeSolidView.Light -> IconBadgeStyles.IconBadgeSolidXsPilledLight
    size == IconBadgeSolidSize.L && view == IconBadgeSolidView.Default ->
        IconBadgeStyles.IconBadgeSolidLDefault
    size == IconBadgeSolidSize.L && view == IconBadgeSolidView.Accent ->
        IconBadgeStyles.IconBadgeSolidLAccent
    size == IconBadgeSolidSize.L && view == IconBadgeSolidView.Negative ->
        IconBadgeStyles.IconBadgeSolidLNegative
    size == IconBadgeSolidSize.L && view == IconBadgeSolidView.Positive ->
        IconBadgeStyles.IconBadgeSolidLPositive
    size == IconBadgeSolidSize.L && view == IconBadgeSolidView.Warning ->
        IconBadgeStyles.IconBadgeSolidLWarning
    size == IconBadgeSolidSize.L && view == IconBadgeSolidView.Dark ->
        IconBadgeStyles.IconBadgeSolidLDark
    size == IconBadgeSolidSize.L && view == IconBadgeSolidView.Light ->
        IconBadgeStyles.IconBadgeSolidLLight
    size == IconBadgeSolidSize.M && view == IconBadgeSolidView.Default ->
        IconBadgeStyles.IconBadgeSolidMDefault
    size == IconBadgeSolidSize.M && view == IconBadgeSolidView.Accent ->
        IconBadgeStyles.IconBadgeSolidMAccent
    size == IconBadgeSolidSize.M && view == IconBadgeSolidView.Negative ->
        IconBadgeStyles.IconBadgeSolidMNegative
    size == IconBadgeSolidSize.M && view == IconBadgeSolidView.Positive ->
        IconBadgeStyles.IconBadgeSolidMPositive
    size == IconBadgeSolidSize.M && view == IconBadgeSolidView.Warning ->
        IconBadgeStyles.IconBadgeSolidMWarning
    size == IconBadgeSolidSize.M && view == IconBadgeSolidView.Dark ->
        IconBadgeStyles.IconBadgeSolidMDark
    size == IconBadgeSolidSize.M && view == IconBadgeSolidView.Light ->
        IconBadgeStyles.IconBadgeSolidMLight
    size == IconBadgeSolidSize.S && view == IconBadgeSolidView.Default ->
        IconBadgeStyles.IconBadgeSolidSDefault
    size == IconBadgeSolidSize.S && view == IconBadgeSolidView.Accent ->
        IconBadgeStyles.IconBadgeSolidSAccent
    size == IconBadgeSolidSize.S && view == IconBadgeSolidView.Negative ->
        IconBadgeStyles.IconBadgeSolidSNegative
    size == IconBadgeSolidSize.S && view == IconBadgeSolidView.Positive ->
        IconBadgeStyles.IconBadgeSolidSPositive
    size == IconBadgeSolidSize.S && view == IconBadgeSolidView.Warning ->
        IconBadgeStyles.IconBadgeSolidSWarning
    size == IconBadgeSolidSize.S && view == IconBadgeSolidView.Dark ->
        IconBadgeStyles.IconBadgeSolidSDark
    size == IconBadgeSolidSize.S && view == IconBadgeSolidView.Light ->
        IconBadgeStyles.IconBadgeSolidSLight
    size == IconBadgeSolidSize.Xs && view == IconBadgeSolidView.Default ->
        IconBadgeStyles.IconBadgeSolidXsDefault
    size == IconBadgeSolidSize.Xs && view == IconBadgeSolidView.Accent ->
        IconBadgeStyles.IconBadgeSolidXsAccent
    size == IconBadgeSolidSize.Xs && view == IconBadgeSolidView.Negative ->
        IconBadgeStyles.IconBadgeSolidXsNegative
    size == IconBadgeSolidSize.Xs && view == IconBadgeSolidView.Positive ->
        IconBadgeStyles.IconBadgeSolidXsPositive
    size == IconBadgeSolidSize.Xs && view == IconBadgeSolidView.Warning ->
        IconBadgeStyles.IconBadgeSolidXsWarning
    size == IconBadgeSolidSize.Xs && view == IconBadgeSolidView.Dark ->
        IconBadgeStyles.IconBadgeSolidXsDark
    size == IconBadgeSolidSize.Xs && view == IconBadgeSolidView.Light ->
        IconBadgeStyles.IconBadgeSolidXsLight
    else -> error("Unsupported icon-badge-solid style combination")
}

/**
 * Возвращает [BadgeStyle] для icon-badge-solid
 */
@Composable
public fun IconBadgeStyles.Solid.style(
    size: IconBadgeSolidSize = IconBadgeSolidSize.L,
    shape: IconBadgeSolidShape = IconBadgeSolidShape.Default,
    view: IconBadgeSolidView = IconBadgeSolidView.Default,
    modify: @Composable IconBadgeStyleBuilder.() -> Unit = {},
): BadgeStyle = resolve(size, shape, view).style(modify)

/**
 * Возвращает экземпляр [IconBadgeStyles] для icon-badge-transparent
 */
public fun IconBadgeStyles.Transparent.resolve(
    size: IconBadgeTransparentSize = IconBadgeTransparentSize.L,
    shape: IconBadgeTransparentShape = IconBadgeTransparentShape.Default,
    view: IconBadgeTransparentView = IconBadgeTransparentView.Default,
): IconBadgeStyles = when {
    size == IconBadgeTransparentSize.L && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Default -> IconBadgeStyles.IconBadgeTransparentLPilledDefault
    size == IconBadgeTransparentSize.L && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Accent -> IconBadgeStyles.IconBadgeTransparentLPilledAccent
    size == IconBadgeTransparentSize.L && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Negative -> IconBadgeStyles.IconBadgeTransparentLPilledNegative
    size == IconBadgeTransparentSize.L && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Positive -> IconBadgeStyles.IconBadgeTransparentLPilledPositive
    size == IconBadgeTransparentSize.L && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Warning -> IconBadgeStyles.IconBadgeTransparentLPilledWarning
    size == IconBadgeTransparentSize.L && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Dark -> IconBadgeStyles.IconBadgeTransparentLPilledDark
    size == IconBadgeTransparentSize.L && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Light -> IconBadgeStyles.IconBadgeTransparentLPilledLight
    size == IconBadgeTransparentSize.M && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Default -> IconBadgeStyles.IconBadgeTransparentMPilledDefault
    size == IconBadgeTransparentSize.M && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Accent -> IconBadgeStyles.IconBadgeTransparentMPilledAccent
    size == IconBadgeTransparentSize.M && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Negative -> IconBadgeStyles.IconBadgeTransparentMPilledNegative
    size == IconBadgeTransparentSize.M && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Positive -> IconBadgeStyles.IconBadgeTransparentMPilledPositive
    size == IconBadgeTransparentSize.M && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Warning -> IconBadgeStyles.IconBadgeTransparentMPilledWarning
    size == IconBadgeTransparentSize.M && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Dark -> IconBadgeStyles.IconBadgeTransparentMPilledDark
    size == IconBadgeTransparentSize.M && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Light -> IconBadgeStyles.IconBadgeTransparentMPilledLight
    size == IconBadgeTransparentSize.S && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Default -> IconBadgeStyles.IconBadgeTransparentSPilledDefault
    size == IconBadgeTransparentSize.S && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Accent -> IconBadgeStyles.IconBadgeTransparentSPilledAccent
    size == IconBadgeTransparentSize.S && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Negative -> IconBadgeStyles.IconBadgeTransparentSPilledNegative
    size == IconBadgeTransparentSize.S && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Positive -> IconBadgeStyles.IconBadgeTransparentSPilledPositive
    size == IconBadgeTransparentSize.S && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Warning -> IconBadgeStyles.IconBadgeTransparentSPilledWarning
    size == IconBadgeTransparentSize.S && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Dark -> IconBadgeStyles.IconBadgeTransparentSPilledDark
    size == IconBadgeTransparentSize.S && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Light -> IconBadgeStyles.IconBadgeTransparentSPilledLight
    size == IconBadgeTransparentSize.Xs && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Default -> IconBadgeStyles.IconBadgeTransparentXsPilledDefault
    size == IconBadgeTransparentSize.Xs && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Accent -> IconBadgeStyles.IconBadgeTransparentXsPilledAccent
    size == IconBadgeTransparentSize.Xs && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Negative -> IconBadgeStyles.IconBadgeTransparentXsPilledNegative
    size == IconBadgeTransparentSize.Xs && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Positive -> IconBadgeStyles.IconBadgeTransparentXsPilledPositive
    size == IconBadgeTransparentSize.Xs && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Warning -> IconBadgeStyles.IconBadgeTransparentXsPilledWarning
    size == IconBadgeTransparentSize.Xs && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Dark -> IconBadgeStyles.IconBadgeTransparentXsPilledDark
    size == IconBadgeTransparentSize.Xs && shape == IconBadgeTransparentShape.Pilled && view ==
        IconBadgeTransparentView.Light -> IconBadgeStyles.IconBadgeTransparentXsPilledLight
    size == IconBadgeTransparentSize.L && view == IconBadgeTransparentView.Default ->
        IconBadgeStyles.IconBadgeTransparentLDefault
    size == IconBadgeTransparentSize.L && view == IconBadgeTransparentView.Accent ->
        IconBadgeStyles.IconBadgeTransparentLAccent
    size == IconBadgeTransparentSize.L && view == IconBadgeTransparentView.Negative ->
        IconBadgeStyles.IconBadgeTransparentLNegative
    size == IconBadgeTransparentSize.L && view == IconBadgeTransparentView.Positive ->
        IconBadgeStyles.IconBadgeTransparentLPositive
    size == IconBadgeTransparentSize.L && view == IconBadgeTransparentView.Warning ->
        IconBadgeStyles.IconBadgeTransparentLWarning
    size == IconBadgeTransparentSize.L && view == IconBadgeTransparentView.Dark ->
        IconBadgeStyles.IconBadgeTransparentLDark
    size == IconBadgeTransparentSize.L && view == IconBadgeTransparentView.Light ->
        IconBadgeStyles.IconBadgeTransparentLLight
    size == IconBadgeTransparentSize.M && view == IconBadgeTransparentView.Default ->
        IconBadgeStyles.IconBadgeTransparentMDefault
    size == IconBadgeTransparentSize.M && view == IconBadgeTransparentView.Accent ->
        IconBadgeStyles.IconBadgeTransparentMAccent
    size == IconBadgeTransparentSize.M && view == IconBadgeTransparentView.Negative ->
        IconBadgeStyles.IconBadgeTransparentMNegative
    size == IconBadgeTransparentSize.M && view == IconBadgeTransparentView.Positive ->
        IconBadgeStyles.IconBadgeTransparentMPositive
    size == IconBadgeTransparentSize.M && view == IconBadgeTransparentView.Warning ->
        IconBadgeStyles.IconBadgeTransparentMWarning
    size == IconBadgeTransparentSize.M && view == IconBadgeTransparentView.Dark ->
        IconBadgeStyles.IconBadgeTransparentMDark
    size == IconBadgeTransparentSize.M && view == IconBadgeTransparentView.Light ->
        IconBadgeStyles.IconBadgeTransparentMLight
    size == IconBadgeTransparentSize.S && view == IconBadgeTransparentView.Default ->
        IconBadgeStyles.IconBadgeTransparentSDefault
    size == IconBadgeTransparentSize.S && view == IconBadgeTransparentView.Accent ->
        IconBadgeStyles.IconBadgeTransparentSAccent
    size == IconBadgeTransparentSize.S && view == IconBadgeTransparentView.Negative ->
        IconBadgeStyles.IconBadgeTransparentSNegative
    size == IconBadgeTransparentSize.S && view == IconBadgeTransparentView.Positive ->
        IconBadgeStyles.IconBadgeTransparentSPositive
    size == IconBadgeTransparentSize.S && view == IconBadgeTransparentView.Warning ->
        IconBadgeStyles.IconBadgeTransparentSWarning
    size == IconBadgeTransparentSize.S && view == IconBadgeTransparentView.Dark ->
        IconBadgeStyles.IconBadgeTransparentSDark
    size == IconBadgeTransparentSize.S && view == IconBadgeTransparentView.Light ->
        IconBadgeStyles.IconBadgeTransparentSLight
    size == IconBadgeTransparentSize.Xs && view == IconBadgeTransparentView.Default ->
        IconBadgeStyles.IconBadgeTransparentXsDefault
    size == IconBadgeTransparentSize.Xs && view == IconBadgeTransparentView.Accent ->
        IconBadgeStyles.IconBadgeTransparentXsAccent
    size == IconBadgeTransparentSize.Xs && view == IconBadgeTransparentView.Negative ->
        IconBadgeStyles.IconBadgeTransparentXsNegative
    size == IconBadgeTransparentSize.Xs && view == IconBadgeTransparentView.Positive ->
        IconBadgeStyles.IconBadgeTransparentXsPositive
    size == IconBadgeTransparentSize.Xs && view == IconBadgeTransparentView.Warning ->
        IconBadgeStyles.IconBadgeTransparentXsWarning
    size == IconBadgeTransparentSize.Xs && view == IconBadgeTransparentView.Dark ->
        IconBadgeStyles.IconBadgeTransparentXsDark
    size == IconBadgeTransparentSize.Xs && view == IconBadgeTransparentView.Light ->
        IconBadgeStyles.IconBadgeTransparentXsLight
    else -> error("Unsupported icon-badge-transparent style combination")
}

/**
 * Возвращает [BadgeStyle] для icon-badge-transparent
 */
@Composable
public fun IconBadgeStyles.Transparent.style(
    size: IconBadgeTransparentSize = IconBadgeTransparentSize.L,
    shape: IconBadgeTransparentShape = IconBadgeTransparentShape.Default,
    view: IconBadgeTransparentView = IconBadgeTransparentView.Default,
    modify: @Composable IconBadgeStyleBuilder.() -> Unit = {},
): BadgeStyle = resolve(size, shape, view).style(modify)
