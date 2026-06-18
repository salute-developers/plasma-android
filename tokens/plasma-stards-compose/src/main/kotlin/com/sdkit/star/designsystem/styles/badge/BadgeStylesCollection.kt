// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.badge

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
    ;

    /**
     * Typed API для подбора стиля badge-solid
     */
    public object Solid

    /**
     * Typed API для подбора стиля badge-transparent
     */
    public object Transparent
}

/**
 * Возможные значения свойства size для badge-solid
 */
public enum class BadgeSolidSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для badge-solid
 */
public enum class BadgeSolidShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для badge-solid
 */
public enum class BadgeSolidView {
    Default,
    Accent,
    Negative,
    Positive,
    Warning,
    Dark,
    Light,
}

/**
 * Возможные значения свойства size для badge-transparent
 */
public enum class BadgeTransparentSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для badge-transparent
 */
public enum class BadgeTransparentShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для badge-transparent
 */
public enum class BadgeTransparentView {
    Default,
    Accent,
    Negative,
    Positive,
    Warning,
    Dark,
    Light,
}

/**
 * Возвращает [BadgeStyle] для [BadgeStyles]
 */
@Composable
public fun BadgeStyles.style(modify: @Composable BadgeStyleBuilder.() -> Unit = {}): BadgeStyle {
    val builder = when (this) {
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [BadgeStyles] для badge-solid
 */
public fun BadgeStyles.Solid.resolve(
    size: BadgeSolidSize = BadgeSolidSize.L,
    shape: BadgeSolidShape = BadgeSolidShape.Default,
    view: BadgeSolidView = BadgeSolidView.Default,
): BadgeStyles = when {
    size == BadgeSolidSize.L && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Default ->
        BadgeStyles.BadgeSolidLPilledDefault
    size == BadgeSolidSize.L && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Accent ->
        BadgeStyles.BadgeSolidLPilledAccent
    size == BadgeSolidSize.L && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Negative -> BadgeStyles.BadgeSolidLPilledNegative
    size == BadgeSolidSize.L && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Positive -> BadgeStyles.BadgeSolidLPilledPositive
    size == BadgeSolidSize.L && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Warning ->
        BadgeStyles.BadgeSolidLPilledWarning
    size == BadgeSolidSize.L && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Dark ->
        BadgeStyles.BadgeSolidLPilledDark
    size == BadgeSolidSize.L && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Light ->
        BadgeStyles.BadgeSolidLPilledLight
    size == BadgeSolidSize.M && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Default ->
        BadgeStyles.BadgeSolidMPilledDefault
    size == BadgeSolidSize.M && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Accent ->
        BadgeStyles.BadgeSolidMPilledAccent
    size == BadgeSolidSize.M && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Negative -> BadgeStyles.BadgeSolidMPilledNegative
    size == BadgeSolidSize.M && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Positive -> BadgeStyles.BadgeSolidMPilledPositive
    size == BadgeSolidSize.M && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Warning ->
        BadgeStyles.BadgeSolidMPilledWarning
    size == BadgeSolidSize.M && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Dark ->
        BadgeStyles.BadgeSolidMPilledDark
    size == BadgeSolidSize.M && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Light ->
        BadgeStyles.BadgeSolidMPilledLight
    size == BadgeSolidSize.S && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Default ->
        BadgeStyles.BadgeSolidSPilledDefault
    size == BadgeSolidSize.S && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Accent ->
        BadgeStyles.BadgeSolidSPilledAccent
    size == BadgeSolidSize.S && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Negative -> BadgeStyles.BadgeSolidSPilledNegative
    size == BadgeSolidSize.S && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Positive -> BadgeStyles.BadgeSolidSPilledPositive
    size == BadgeSolidSize.S && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Warning ->
        BadgeStyles.BadgeSolidSPilledWarning
    size == BadgeSolidSize.S && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Dark ->
        BadgeStyles.BadgeSolidSPilledDark
    size == BadgeSolidSize.S && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Light ->
        BadgeStyles.BadgeSolidSPilledLight
    size == BadgeSolidSize.Xs && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Default -> BadgeStyles.BadgeSolidXsPilledDefault
    size == BadgeSolidSize.Xs && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Accent ->
        BadgeStyles.BadgeSolidXsPilledAccent
    size == BadgeSolidSize.Xs && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Negative -> BadgeStyles.BadgeSolidXsPilledNegative
    size == BadgeSolidSize.Xs && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Positive -> BadgeStyles.BadgeSolidXsPilledPositive
    size == BadgeSolidSize.Xs && shape == BadgeSolidShape.Pilled && view ==
        BadgeSolidView.Warning -> BadgeStyles.BadgeSolidXsPilledWarning
    size == BadgeSolidSize.Xs && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Dark ->
        BadgeStyles.BadgeSolidXsPilledDark
    size == BadgeSolidSize.Xs && shape == BadgeSolidShape.Pilled && view == BadgeSolidView.Light ->
        BadgeStyles.BadgeSolidXsPilledLight
    size == BadgeSolidSize.L && view == BadgeSolidView.Default -> BadgeStyles.BadgeSolidLDefault
    size == BadgeSolidSize.L && view == BadgeSolidView.Accent -> BadgeStyles.BadgeSolidLAccent
    size == BadgeSolidSize.L && view == BadgeSolidView.Negative -> BadgeStyles.BadgeSolidLNegative
    size == BadgeSolidSize.L && view == BadgeSolidView.Positive -> BadgeStyles.BadgeSolidLPositive
    size == BadgeSolidSize.L && view == BadgeSolidView.Warning -> BadgeStyles.BadgeSolidLWarning
    size == BadgeSolidSize.L && view == BadgeSolidView.Dark -> BadgeStyles.BadgeSolidLDark
    size == BadgeSolidSize.L && view == BadgeSolidView.Light -> BadgeStyles.BadgeSolidLLight
    size == BadgeSolidSize.M && view == BadgeSolidView.Default -> BadgeStyles.BadgeSolidMDefault
    size == BadgeSolidSize.M && view == BadgeSolidView.Accent -> BadgeStyles.BadgeSolidMAccent
    size == BadgeSolidSize.M && view == BadgeSolidView.Negative -> BadgeStyles.BadgeSolidMNegative
    size == BadgeSolidSize.M && view == BadgeSolidView.Positive -> BadgeStyles.BadgeSolidMPositive
    size == BadgeSolidSize.M && view == BadgeSolidView.Warning -> BadgeStyles.BadgeSolidMWarning
    size == BadgeSolidSize.M && view == BadgeSolidView.Dark -> BadgeStyles.BadgeSolidMDark
    size == BadgeSolidSize.M && view == BadgeSolidView.Light -> BadgeStyles.BadgeSolidMLight
    size == BadgeSolidSize.S && view == BadgeSolidView.Default -> BadgeStyles.BadgeSolidSDefault
    size == BadgeSolidSize.S && view == BadgeSolidView.Accent -> BadgeStyles.BadgeSolidSAccent
    size == BadgeSolidSize.S && view == BadgeSolidView.Negative -> BadgeStyles.BadgeSolidSNegative
    size == BadgeSolidSize.S && view == BadgeSolidView.Positive -> BadgeStyles.BadgeSolidSPositive
    size == BadgeSolidSize.S && view == BadgeSolidView.Warning -> BadgeStyles.BadgeSolidSWarning
    size == BadgeSolidSize.S && view == BadgeSolidView.Dark -> BadgeStyles.BadgeSolidSDark
    size == BadgeSolidSize.S && view == BadgeSolidView.Light -> BadgeStyles.BadgeSolidSLight
    size == BadgeSolidSize.Xs && view == BadgeSolidView.Default -> BadgeStyles.BadgeSolidXsDefault
    size == BadgeSolidSize.Xs && view == BadgeSolidView.Accent -> BadgeStyles.BadgeSolidXsAccent
    size == BadgeSolidSize.Xs && view == BadgeSolidView.Negative -> BadgeStyles.BadgeSolidXsNegative
    size == BadgeSolidSize.Xs && view == BadgeSolidView.Positive -> BadgeStyles.BadgeSolidXsPositive
    size == BadgeSolidSize.Xs && view == BadgeSolidView.Warning -> BadgeStyles.BadgeSolidXsWarning
    size == BadgeSolidSize.Xs && view == BadgeSolidView.Dark -> BadgeStyles.BadgeSolidXsDark
    size == BadgeSolidSize.Xs && view == BadgeSolidView.Light -> BadgeStyles.BadgeSolidXsLight
    else -> error("Unsupported badge-solid style combination")
}

/**
 * Возвращает [BadgeStyle] для badge-solid
 */
@Composable
public fun BadgeStyles.Solid.style(
    size: BadgeSolidSize = BadgeSolidSize.L,
    shape: BadgeSolidShape = BadgeSolidShape.Default,
    view: BadgeSolidView = BadgeSolidView.Default,
    modify: @Composable BadgeStyleBuilder.() -> Unit = {},
): BadgeStyle = resolve(size, shape, view).style(modify)

/**
 * Возвращает экземпляр [BadgeStyles] для badge-transparent
 */
public fun BadgeStyles.Transparent.resolve(
    size: BadgeTransparentSize = BadgeTransparentSize.L,
    shape: BadgeTransparentShape = BadgeTransparentShape.Default,
    view: BadgeTransparentView = BadgeTransparentView.Default,
): BadgeStyles = when {
    size == BadgeTransparentSize.L && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Default -> BadgeStyles.BadgeTransparentLPilledDefault
    size == BadgeTransparentSize.L && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Accent -> BadgeStyles.BadgeTransparentLPilledAccent
    size == BadgeTransparentSize.L && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Negative -> BadgeStyles.BadgeTransparentLPilledNegative
    size == BadgeTransparentSize.L && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Positive -> BadgeStyles.BadgeTransparentLPilledPositive
    size == BadgeTransparentSize.L && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Warning -> BadgeStyles.BadgeTransparentLPilledWarning
    size == BadgeTransparentSize.L && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Dark -> BadgeStyles.BadgeTransparentLPilledDark
    size == BadgeTransparentSize.L && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Light -> BadgeStyles.BadgeTransparentLPilledLight
    size == BadgeTransparentSize.M && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Default -> BadgeStyles.BadgeTransparentMPilledDefault
    size == BadgeTransparentSize.M && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Accent -> BadgeStyles.BadgeTransparentMPilledAccent
    size == BadgeTransparentSize.M && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Negative -> BadgeStyles.BadgeTransparentMPilledNegative
    size == BadgeTransparentSize.M && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Positive -> BadgeStyles.BadgeTransparentMPilledPositive
    size == BadgeTransparentSize.M && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Warning -> BadgeStyles.BadgeTransparentMPilledWarning
    size == BadgeTransparentSize.M && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Dark -> BadgeStyles.BadgeTransparentMPilledDark
    size == BadgeTransparentSize.M && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Light -> BadgeStyles.BadgeTransparentMPilledLight
    size == BadgeTransparentSize.S && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Default -> BadgeStyles.BadgeTransparentSPilledDefault
    size == BadgeTransparentSize.S && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Accent -> BadgeStyles.BadgeTransparentSPilledAccent
    size == BadgeTransparentSize.S && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Negative -> BadgeStyles.BadgeTransparentSPilledNegative
    size == BadgeTransparentSize.S && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Positive -> BadgeStyles.BadgeTransparentSPilledPositive
    size == BadgeTransparentSize.S && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Warning -> BadgeStyles.BadgeTransparentSPilledWarning
    size == BadgeTransparentSize.S && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Dark -> BadgeStyles.BadgeTransparentSPilledDark
    size == BadgeTransparentSize.S && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Light -> BadgeStyles.BadgeTransparentSPilledLight
    size == BadgeTransparentSize.Xs && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Default -> BadgeStyles.BadgeTransparentXsPilledDefault
    size == BadgeTransparentSize.Xs && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Accent -> BadgeStyles.BadgeTransparentXsPilledAccent
    size == BadgeTransparentSize.Xs && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Negative -> BadgeStyles.BadgeTransparentXsPilledNegative
    size == BadgeTransparentSize.Xs && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Positive -> BadgeStyles.BadgeTransparentXsPilledPositive
    size == BadgeTransparentSize.Xs && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Warning -> BadgeStyles.BadgeTransparentXsPilledWarning
    size == BadgeTransparentSize.Xs && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Dark -> BadgeStyles.BadgeTransparentXsPilledDark
    size == BadgeTransparentSize.Xs && shape == BadgeTransparentShape.Pilled && view ==
        BadgeTransparentView.Light -> BadgeStyles.BadgeTransparentXsPilledLight
    size == BadgeTransparentSize.L && view == BadgeTransparentView.Default ->
        BadgeStyles.BadgeTransparentLDefault
    size == BadgeTransparentSize.L && view == BadgeTransparentView.Accent ->
        BadgeStyles.BadgeTransparentLAccent
    size == BadgeTransparentSize.L && view == BadgeTransparentView.Negative ->
        BadgeStyles.BadgeTransparentLNegative
    size == BadgeTransparentSize.L && view == BadgeTransparentView.Positive ->
        BadgeStyles.BadgeTransparentLPositive
    size == BadgeTransparentSize.L && view == BadgeTransparentView.Warning ->
        BadgeStyles.BadgeTransparentLWarning
    size == BadgeTransparentSize.L && view == BadgeTransparentView.Dark ->
        BadgeStyles.BadgeTransparentLDark
    size == BadgeTransparentSize.L && view == BadgeTransparentView.Light ->
        BadgeStyles.BadgeTransparentLLight
    size == BadgeTransparentSize.M && view == BadgeTransparentView.Default ->
        BadgeStyles.BadgeTransparentMDefault
    size == BadgeTransparentSize.M && view == BadgeTransparentView.Accent ->
        BadgeStyles.BadgeTransparentMAccent
    size == BadgeTransparentSize.M && view == BadgeTransparentView.Negative ->
        BadgeStyles.BadgeTransparentMNegative
    size == BadgeTransparentSize.M && view == BadgeTransparentView.Positive ->
        BadgeStyles.BadgeTransparentMPositive
    size == BadgeTransparentSize.M && view == BadgeTransparentView.Warning ->
        BadgeStyles.BadgeTransparentMWarning
    size == BadgeTransparentSize.M && view == BadgeTransparentView.Dark ->
        BadgeStyles.BadgeTransparentMDark
    size == BadgeTransparentSize.M && view == BadgeTransparentView.Light ->
        BadgeStyles.BadgeTransparentMLight
    size == BadgeTransparentSize.S && view == BadgeTransparentView.Default ->
        BadgeStyles.BadgeTransparentSDefault
    size == BadgeTransparentSize.S && view == BadgeTransparentView.Accent ->
        BadgeStyles.BadgeTransparentSAccent
    size == BadgeTransparentSize.S && view == BadgeTransparentView.Negative ->
        BadgeStyles.BadgeTransparentSNegative
    size == BadgeTransparentSize.S && view == BadgeTransparentView.Positive ->
        BadgeStyles.BadgeTransparentSPositive
    size == BadgeTransparentSize.S && view == BadgeTransparentView.Warning ->
        BadgeStyles.BadgeTransparentSWarning
    size == BadgeTransparentSize.S && view == BadgeTransparentView.Dark ->
        BadgeStyles.BadgeTransparentSDark
    size == BadgeTransparentSize.S && view == BadgeTransparentView.Light ->
        BadgeStyles.BadgeTransparentSLight
    size == BadgeTransparentSize.Xs && view == BadgeTransparentView.Default ->
        BadgeStyles.BadgeTransparentXsDefault
    size == BadgeTransparentSize.Xs && view == BadgeTransparentView.Accent ->
        BadgeStyles.BadgeTransparentXsAccent
    size == BadgeTransparentSize.Xs && view == BadgeTransparentView.Negative ->
        BadgeStyles.BadgeTransparentXsNegative
    size == BadgeTransparentSize.Xs && view == BadgeTransparentView.Positive ->
        BadgeStyles.BadgeTransparentXsPositive
    size == BadgeTransparentSize.Xs && view == BadgeTransparentView.Warning ->
        BadgeStyles.BadgeTransparentXsWarning
    size == BadgeTransparentSize.Xs && view == BadgeTransparentView.Dark ->
        BadgeStyles.BadgeTransparentXsDark
    size == BadgeTransparentSize.Xs && view == BadgeTransparentView.Light ->
        BadgeStyles.BadgeTransparentXsLight
    else -> error("Unsupported badge-transparent style combination")
}

/**
 * Возвращает [BadgeStyle] для badge-transparent
 */
@Composable
public fun BadgeStyles.Transparent.style(
    size: BadgeTransparentSize = BadgeTransparentSize.L,
    shape: BadgeTransparentShape = BadgeTransparentShape.Default,
    view: BadgeTransparentView = BadgeTransparentView.Default,
    modify: @Composable BadgeStyleBuilder.() -> Unit = {},
): BadgeStyle = resolve(size, shape, view).style(modify)
