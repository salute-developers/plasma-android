// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.chipgroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ChipGroup
 */
public enum class ChipGroupStyles(
    public val key: String,
) {
    ChipGroupDenseLDefault("ChipGroupDense.L.Default"),
    ChipGroupDenseLAccent("ChipGroupDense.L.Accent"),
    ChipGroupDenseLNegative("ChipGroupDense.L.Negative"),
    ChipGroupDenseLPositive("ChipGroupDense.L.Positive"),
    ChipGroupDenseLSecondary("ChipGroupDense.L.Secondary"),
    ChipGroupDenseLWarning("ChipGroupDense.L.Warning"),
    ChipGroupDenseLPilledDefault("ChipGroupDense.L.Pilled.Default"),
    ChipGroupDenseLPilledAccent("ChipGroupDense.L.Pilled.Accent"),
    ChipGroupDenseLPilledNegative("ChipGroupDense.L.Pilled.Negative"),
    ChipGroupDenseLPilledPositive("ChipGroupDense.L.Pilled.Positive"),
    ChipGroupDenseLPilledSecondary("ChipGroupDense.L.Pilled.Secondary"),
    ChipGroupDenseLPilledWarning("ChipGroupDense.L.Pilled.Warning"),
    ChipGroupDenseMDefault("ChipGroupDense.M.Default"),
    ChipGroupDenseMAccent("ChipGroupDense.M.Accent"),
    ChipGroupDenseMNegative("ChipGroupDense.M.Negative"),
    ChipGroupDenseMPositive("ChipGroupDense.M.Positive"),
    ChipGroupDenseMSecondary("ChipGroupDense.M.Secondary"),
    ChipGroupDenseMWarning("ChipGroupDense.M.Warning"),
    ChipGroupDenseMPilledDefault("ChipGroupDense.M.Pilled.Default"),
    ChipGroupDenseMPilledAccent("ChipGroupDense.M.Pilled.Accent"),
    ChipGroupDenseMPilledNegative("ChipGroupDense.M.Pilled.Negative"),
    ChipGroupDenseMPilledPositive("ChipGroupDense.M.Pilled.Positive"),
    ChipGroupDenseMPilledSecondary("ChipGroupDense.M.Pilled.Secondary"),
    ChipGroupDenseMPilledWarning("ChipGroupDense.M.Pilled.Warning"),
    ChipGroupDenseSDefault("ChipGroupDense.S.Default"),
    ChipGroupDenseSAccent("ChipGroupDense.S.Accent"),
    ChipGroupDenseSNegative("ChipGroupDense.S.Negative"),
    ChipGroupDenseSPositive("ChipGroupDense.S.Positive"),
    ChipGroupDenseSSecondary("ChipGroupDense.S.Secondary"),
    ChipGroupDenseSWarning("ChipGroupDense.S.Warning"),
    ChipGroupDenseSPilledDefault("ChipGroupDense.S.Pilled.Default"),
    ChipGroupDenseSPilledAccent("ChipGroupDense.S.Pilled.Accent"),
    ChipGroupDenseSPilledNegative("ChipGroupDense.S.Pilled.Negative"),
    ChipGroupDenseSPilledPositive("ChipGroupDense.S.Pilled.Positive"),
    ChipGroupDenseSPilledSecondary("ChipGroupDense.S.Pilled.Secondary"),
    ChipGroupDenseSPilledWarning("ChipGroupDense.S.Pilled.Warning"),
    ChipGroupDenseXsDefault("ChipGroupDense.Xs.Default"),
    ChipGroupDenseXsAccent("ChipGroupDense.Xs.Accent"),
    ChipGroupDenseXsNegative("ChipGroupDense.Xs.Negative"),
    ChipGroupDenseXsPositive("ChipGroupDense.Xs.Positive"),
    ChipGroupDenseXsSecondary("ChipGroupDense.Xs.Secondary"),
    ChipGroupDenseXsWarning("ChipGroupDense.Xs.Warning"),
    ChipGroupDenseXsPilledDefault("ChipGroupDense.Xs.Pilled.Default"),
    ChipGroupDenseXsPilledAccent("ChipGroupDense.Xs.Pilled.Accent"),
    ChipGroupDenseXsPilledNegative("ChipGroupDense.Xs.Pilled.Negative"),
    ChipGroupDenseXsPilledPositive("ChipGroupDense.Xs.Pilled.Positive"),
    ChipGroupDenseXsPilledSecondary("ChipGroupDense.Xs.Pilled.Secondary"),
    ChipGroupDenseXsPilledWarning("ChipGroupDense.Xs.Pilled.Warning"),
    ChipGroupWideLDefault("ChipGroupWide.L.Default"),
    ChipGroupWideLAccent("ChipGroupWide.L.Accent"),
    ChipGroupWideLNegative("ChipGroupWide.L.Negative"),
    ChipGroupWideLPositive("ChipGroupWide.L.Positive"),
    ChipGroupWideLSecondary("ChipGroupWide.L.Secondary"),
    ChipGroupWideLWarning("ChipGroupWide.L.Warning"),
    ChipGroupWideLPilledDefault("ChipGroupWide.L.Pilled.Default"),
    ChipGroupWideLPilledAccent("ChipGroupWide.L.Pilled.Accent"),
    ChipGroupWideLPilledNegative("ChipGroupWide.L.Pilled.Negative"),
    ChipGroupWideLPilledPositive("ChipGroupWide.L.Pilled.Positive"),
    ChipGroupWideLPilledSecondary("ChipGroupWide.L.Pilled.Secondary"),
    ChipGroupWideLPilledWarning("ChipGroupWide.L.Pilled.Warning"),
    ChipGroupWideMDefault("ChipGroupWide.M.Default"),
    ChipGroupWideMAccent("ChipGroupWide.M.Accent"),
    ChipGroupWideMNegative("ChipGroupWide.M.Negative"),
    ChipGroupWideMPositive("ChipGroupWide.M.Positive"),
    ChipGroupWideMSecondary("ChipGroupWide.M.Secondary"),
    ChipGroupWideMWarning("ChipGroupWide.M.Warning"),
    ChipGroupWideMPilledDefault("ChipGroupWide.M.Pilled.Default"),
    ChipGroupWideMPilledAccent("ChipGroupWide.M.Pilled.Accent"),
    ChipGroupWideMPilledNegative("ChipGroupWide.M.Pilled.Negative"),
    ChipGroupWideMPilledPositive("ChipGroupWide.M.Pilled.Positive"),
    ChipGroupWideMPilledSecondary("ChipGroupWide.M.Pilled.Secondary"),
    ChipGroupWideMPilledWarning("ChipGroupWide.M.Pilled.Warning"),
    ChipGroupWideSDefault("ChipGroupWide.S.Default"),
    ChipGroupWideSAccent("ChipGroupWide.S.Accent"),
    ChipGroupWideSNegative("ChipGroupWide.S.Negative"),
    ChipGroupWideSPositive("ChipGroupWide.S.Positive"),
    ChipGroupWideSSecondary("ChipGroupWide.S.Secondary"),
    ChipGroupWideSWarning("ChipGroupWide.S.Warning"),
    ChipGroupWideSPilledDefault("ChipGroupWide.S.Pilled.Default"),
    ChipGroupWideSPilledAccent("ChipGroupWide.S.Pilled.Accent"),
    ChipGroupWideSPilledNegative("ChipGroupWide.S.Pilled.Negative"),
    ChipGroupWideSPilledPositive("ChipGroupWide.S.Pilled.Positive"),
    ChipGroupWideSPilledSecondary("ChipGroupWide.S.Pilled.Secondary"),
    ChipGroupWideSPilledWarning("ChipGroupWide.S.Pilled.Warning"),
    ChipGroupWideXsDefault("ChipGroupWide.Xs.Default"),
    ChipGroupWideXsAccent("ChipGroupWide.Xs.Accent"),
    ChipGroupWideXsNegative("ChipGroupWide.Xs.Negative"),
    ChipGroupWideXsPositive("ChipGroupWide.Xs.Positive"),
    ChipGroupWideXsSecondary("ChipGroupWide.Xs.Secondary"),
    ChipGroupWideXsWarning("ChipGroupWide.Xs.Warning"),
    ChipGroupWideXsPilledDefault("ChipGroupWide.Xs.Pilled.Default"),
    ChipGroupWideXsPilledAccent("ChipGroupWide.Xs.Pilled.Accent"),
    ChipGroupWideXsPilledNegative("ChipGroupWide.Xs.Pilled.Negative"),
    ChipGroupWideXsPilledPositive("ChipGroupWide.Xs.Pilled.Positive"),
    ChipGroupWideXsPilledSecondary("ChipGroupWide.Xs.Pilled.Secondary"),
    ChipGroupWideXsPilledWarning("ChipGroupWide.Xs.Pilled.Warning"),
    EmbeddedChipGroupDenseXlDefault("EmbeddedChipGroupDense.Xl.Default"),
    EmbeddedChipGroupDenseXlAccent("EmbeddedChipGroupDense.Xl.Accent"),
    EmbeddedChipGroupDenseXlNegative("EmbeddedChipGroupDense.Xl.Negative"),
    EmbeddedChipGroupDenseXlPositive("EmbeddedChipGroupDense.Xl.Positive"),
    EmbeddedChipGroupDenseXlSecondary("EmbeddedChipGroupDense.Xl.Secondary"),
    EmbeddedChipGroupDenseXlWarning("EmbeddedChipGroupDense.Xl.Warning"),
    EmbeddedChipGroupDenseLDefault("EmbeddedChipGroupDense.L.Default"),
    EmbeddedChipGroupDenseLAccent("EmbeddedChipGroupDense.L.Accent"),
    EmbeddedChipGroupDenseLNegative("EmbeddedChipGroupDense.L.Negative"),
    EmbeddedChipGroupDenseLPositive("EmbeddedChipGroupDense.L.Positive"),
    EmbeddedChipGroupDenseLSecondary("EmbeddedChipGroupDense.L.Secondary"),
    EmbeddedChipGroupDenseLWarning("EmbeddedChipGroupDense.L.Warning"),
    EmbeddedChipGroupDenseMDefault("EmbeddedChipGroupDense.M.Default"),
    EmbeddedChipGroupDenseMAccent("EmbeddedChipGroupDense.M.Accent"),
    EmbeddedChipGroupDenseMNegative("EmbeddedChipGroupDense.M.Negative"),
    EmbeddedChipGroupDenseMPositive("EmbeddedChipGroupDense.M.Positive"),
    EmbeddedChipGroupDenseMSecondary("EmbeddedChipGroupDense.M.Secondary"),
    EmbeddedChipGroupDenseMWarning("EmbeddedChipGroupDense.M.Warning"),
    EmbeddedChipGroupDenseSDefault("EmbeddedChipGroupDense.S.Default"),
    EmbeddedChipGroupDenseSAccent("EmbeddedChipGroupDense.S.Accent"),
    EmbeddedChipGroupDenseSNegative("EmbeddedChipGroupDense.S.Negative"),
    EmbeddedChipGroupDenseSPositive("EmbeddedChipGroupDense.S.Positive"),
    EmbeddedChipGroupDenseSSecondary("EmbeddedChipGroupDense.S.Secondary"),
    EmbeddedChipGroupDenseSWarning("EmbeddedChipGroupDense.S.Warning"),
    EmbeddedChipGroupDenseXsDefault("EmbeddedChipGroupDense.Xs.Default"),
    EmbeddedChipGroupDenseXsAccent("EmbeddedChipGroupDense.Xs.Accent"),
    EmbeddedChipGroupDenseXsNegative("EmbeddedChipGroupDense.Xs.Negative"),
    EmbeddedChipGroupDenseXsPositive("EmbeddedChipGroupDense.Xs.Positive"),
    EmbeddedChipGroupDenseXsSecondary("EmbeddedChipGroupDense.Xs.Secondary"),
    EmbeddedChipGroupDenseXsWarning("EmbeddedChipGroupDense.Xs.Warning"),
    EmbeddedChipGroupWideXlDefault("EmbeddedChipGroupWide.Xl.Default"),
    EmbeddedChipGroupWideXlAccent("EmbeddedChipGroupWide.Xl.Accent"),
    EmbeddedChipGroupWideXlNegative("EmbeddedChipGroupWide.Xl.Negative"),
    EmbeddedChipGroupWideXlPositive("EmbeddedChipGroupWide.Xl.Positive"),
    EmbeddedChipGroupWideXlSecondary("EmbeddedChipGroupWide.Xl.Secondary"),
    EmbeddedChipGroupWideXlWarning("EmbeddedChipGroupWide.Xl.Warning"),
    EmbeddedChipGroupWideLDefault("EmbeddedChipGroupWide.L.Default"),
    EmbeddedChipGroupWideLAccent("EmbeddedChipGroupWide.L.Accent"),
    EmbeddedChipGroupWideLNegative("EmbeddedChipGroupWide.L.Negative"),
    EmbeddedChipGroupWideLPositive("EmbeddedChipGroupWide.L.Positive"),
    EmbeddedChipGroupWideLSecondary("EmbeddedChipGroupWide.L.Secondary"),
    EmbeddedChipGroupWideLWarning("EmbeddedChipGroupWide.L.Warning"),
    EmbeddedChipGroupWideMDefault("EmbeddedChipGroupWide.M.Default"),
    EmbeddedChipGroupWideMAccent("EmbeddedChipGroupWide.M.Accent"),
    EmbeddedChipGroupWideMNegative("EmbeddedChipGroupWide.M.Negative"),
    EmbeddedChipGroupWideMPositive("EmbeddedChipGroupWide.M.Positive"),
    EmbeddedChipGroupWideMSecondary("EmbeddedChipGroupWide.M.Secondary"),
    EmbeddedChipGroupWideMWarning("EmbeddedChipGroupWide.M.Warning"),
    EmbeddedChipGroupWideSDefault("EmbeddedChipGroupWide.S.Default"),
    EmbeddedChipGroupWideSAccent("EmbeddedChipGroupWide.S.Accent"),
    EmbeddedChipGroupWideSNegative("EmbeddedChipGroupWide.S.Negative"),
    EmbeddedChipGroupWideSPositive("EmbeddedChipGroupWide.S.Positive"),
    EmbeddedChipGroupWideSSecondary("EmbeddedChipGroupWide.S.Secondary"),
    EmbeddedChipGroupWideSWarning("EmbeddedChipGroupWide.S.Warning"),
    EmbeddedChipGroupWideXsDefault("EmbeddedChipGroupWide.Xs.Default"),
    EmbeddedChipGroupWideXsAccent("EmbeddedChipGroupWide.Xs.Accent"),
    EmbeddedChipGroupWideXsNegative("EmbeddedChipGroupWide.Xs.Negative"),
    EmbeddedChipGroupWideXsPositive("EmbeddedChipGroupWide.Xs.Positive"),
    EmbeddedChipGroupWideXsSecondary("EmbeddedChipGroupWide.Xs.Secondary"),
    EmbeddedChipGroupWideXsWarning("EmbeddedChipGroupWide.Xs.Warning"),
    ;

    /**
     * Typed API для подбора стиля chip-group-dense
     */
    public object Dense

    /**
     * Typed API для подбора стиля chip-group-wide
     */
    public object Wide

    /**
     * Typed API для подбора стиля embedded-chip-group-dense
     */
    public object EmbeddedChipGroupDense

    /**
     * Typed API для подбора стиля embedded-chip-group-wide
     */
    public object EmbeddedChipGroupWide
}

/**
 * Возможные значения свойства size для chip-group-dense
 */
public enum class ChipGroupDenseSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для chip-group-dense
 */
public enum class ChipGroupDenseShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для chip-group-dense
 */
public enum class ChipGroupDenseView {
    Default,
    Accent,
    Negative,
    Positive,
    Secondary,
    Warning,
}

/**
 * Возможные значения свойства size для chip-group-wide
 */
public enum class ChipGroupWideSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для chip-group-wide
 */
public enum class ChipGroupWideShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для chip-group-wide
 */
public enum class ChipGroupWideView {
    Default,
    Accent,
    Negative,
    Positive,
    Secondary,
    Warning,
}

/**
 * Возможные значения свойства size для embedded-chip-group-dense
 */
public enum class EmbeddedChipGroupDenseSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для embedded-chip-group-dense
 */
public enum class EmbeddedChipGroupDenseView {
    Default,
    Accent,
    Negative,
    Positive,
    Secondary,
    Warning,
}

/**
 * Возможные значения свойства size для embedded-chip-group-wide
 */
public enum class EmbeddedChipGroupWideSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для embedded-chip-group-wide
 */
public enum class EmbeddedChipGroupWideView {
    Default,
    Accent,
    Negative,
    Positive,
    Secondary,
    Warning,
}

/**
 * Возвращает [ChipGroupStyle] для [ChipGroupStyles]
 */
@Composable
public fun ChipGroupStyles.style(modify: @Composable ChipGroupStyleBuilder.() -> Unit = {}): ChipGroupStyle {
    val builder = when (this) {
        ChipGroupStyles.ChipGroupDenseLDefault -> ChipGroupDense.L.Default
        ChipGroupStyles.ChipGroupDenseLAccent -> ChipGroupDense.L.Accent
        ChipGroupStyles.ChipGroupDenseLNegative -> ChipGroupDense.L.Negative
        ChipGroupStyles.ChipGroupDenseLPositive -> ChipGroupDense.L.Positive
        ChipGroupStyles.ChipGroupDenseLSecondary -> ChipGroupDense.L.Secondary
        ChipGroupStyles.ChipGroupDenseLWarning -> ChipGroupDense.L.Warning
        ChipGroupStyles.ChipGroupDenseLPilledDefault -> ChipGroupDense.L.Pilled.Default
        ChipGroupStyles.ChipGroupDenseLPilledAccent -> ChipGroupDense.L.Pilled.Accent
        ChipGroupStyles.ChipGroupDenseLPilledNegative -> ChipGroupDense.L.Pilled.Negative
        ChipGroupStyles.ChipGroupDenseLPilledPositive -> ChipGroupDense.L.Pilled.Positive
        ChipGroupStyles.ChipGroupDenseLPilledSecondary -> ChipGroupDense.L.Pilled.Secondary
        ChipGroupStyles.ChipGroupDenseLPilledWarning -> ChipGroupDense.L.Pilled.Warning
        ChipGroupStyles.ChipGroupDenseMDefault -> ChipGroupDense.M.Default
        ChipGroupStyles.ChipGroupDenseMAccent -> ChipGroupDense.M.Accent
        ChipGroupStyles.ChipGroupDenseMNegative -> ChipGroupDense.M.Negative
        ChipGroupStyles.ChipGroupDenseMPositive -> ChipGroupDense.M.Positive
        ChipGroupStyles.ChipGroupDenseMSecondary -> ChipGroupDense.M.Secondary
        ChipGroupStyles.ChipGroupDenseMWarning -> ChipGroupDense.M.Warning
        ChipGroupStyles.ChipGroupDenseMPilledDefault -> ChipGroupDense.M.Pilled.Default
        ChipGroupStyles.ChipGroupDenseMPilledAccent -> ChipGroupDense.M.Pilled.Accent
        ChipGroupStyles.ChipGroupDenseMPilledNegative -> ChipGroupDense.M.Pilled.Negative
        ChipGroupStyles.ChipGroupDenseMPilledPositive -> ChipGroupDense.M.Pilled.Positive
        ChipGroupStyles.ChipGroupDenseMPilledSecondary -> ChipGroupDense.M.Pilled.Secondary
        ChipGroupStyles.ChipGroupDenseMPilledWarning -> ChipGroupDense.M.Pilled.Warning
        ChipGroupStyles.ChipGroupDenseSDefault -> ChipGroupDense.S.Default
        ChipGroupStyles.ChipGroupDenseSAccent -> ChipGroupDense.S.Accent
        ChipGroupStyles.ChipGroupDenseSNegative -> ChipGroupDense.S.Negative
        ChipGroupStyles.ChipGroupDenseSPositive -> ChipGroupDense.S.Positive
        ChipGroupStyles.ChipGroupDenseSSecondary -> ChipGroupDense.S.Secondary
        ChipGroupStyles.ChipGroupDenseSWarning -> ChipGroupDense.S.Warning
        ChipGroupStyles.ChipGroupDenseSPilledDefault -> ChipGroupDense.S.Pilled.Default
        ChipGroupStyles.ChipGroupDenseSPilledAccent -> ChipGroupDense.S.Pilled.Accent
        ChipGroupStyles.ChipGroupDenseSPilledNegative -> ChipGroupDense.S.Pilled.Negative
        ChipGroupStyles.ChipGroupDenseSPilledPositive -> ChipGroupDense.S.Pilled.Positive
        ChipGroupStyles.ChipGroupDenseSPilledSecondary -> ChipGroupDense.S.Pilled.Secondary
        ChipGroupStyles.ChipGroupDenseSPilledWarning -> ChipGroupDense.S.Pilled.Warning
        ChipGroupStyles.ChipGroupDenseXsDefault -> ChipGroupDense.Xs.Default
        ChipGroupStyles.ChipGroupDenseXsAccent -> ChipGroupDense.Xs.Accent
        ChipGroupStyles.ChipGroupDenseXsNegative -> ChipGroupDense.Xs.Negative
        ChipGroupStyles.ChipGroupDenseXsPositive -> ChipGroupDense.Xs.Positive
        ChipGroupStyles.ChipGroupDenseXsSecondary -> ChipGroupDense.Xs.Secondary
        ChipGroupStyles.ChipGroupDenseXsWarning -> ChipGroupDense.Xs.Warning
        ChipGroupStyles.ChipGroupDenseXsPilledDefault -> ChipGroupDense.Xs.Pilled.Default
        ChipGroupStyles.ChipGroupDenseXsPilledAccent -> ChipGroupDense.Xs.Pilled.Accent
        ChipGroupStyles.ChipGroupDenseXsPilledNegative -> ChipGroupDense.Xs.Pilled.Negative
        ChipGroupStyles.ChipGroupDenseXsPilledPositive -> ChipGroupDense.Xs.Pilled.Positive
        ChipGroupStyles.ChipGroupDenseXsPilledSecondary -> ChipGroupDense.Xs.Pilled.Secondary
        ChipGroupStyles.ChipGroupDenseXsPilledWarning -> ChipGroupDense.Xs.Pilled.Warning
        ChipGroupStyles.ChipGroupWideLDefault -> ChipGroupWide.L.Default
        ChipGroupStyles.ChipGroupWideLAccent -> ChipGroupWide.L.Accent
        ChipGroupStyles.ChipGroupWideLNegative -> ChipGroupWide.L.Negative
        ChipGroupStyles.ChipGroupWideLPositive -> ChipGroupWide.L.Positive
        ChipGroupStyles.ChipGroupWideLSecondary -> ChipGroupWide.L.Secondary
        ChipGroupStyles.ChipGroupWideLWarning -> ChipGroupWide.L.Warning
        ChipGroupStyles.ChipGroupWideLPilledDefault -> ChipGroupWide.L.Pilled.Default
        ChipGroupStyles.ChipGroupWideLPilledAccent -> ChipGroupWide.L.Pilled.Accent
        ChipGroupStyles.ChipGroupWideLPilledNegative -> ChipGroupWide.L.Pilled.Negative
        ChipGroupStyles.ChipGroupWideLPilledPositive -> ChipGroupWide.L.Pilled.Positive
        ChipGroupStyles.ChipGroupWideLPilledSecondary -> ChipGroupWide.L.Pilled.Secondary
        ChipGroupStyles.ChipGroupWideLPilledWarning -> ChipGroupWide.L.Pilled.Warning
        ChipGroupStyles.ChipGroupWideMDefault -> ChipGroupWide.M.Default
        ChipGroupStyles.ChipGroupWideMAccent -> ChipGroupWide.M.Accent
        ChipGroupStyles.ChipGroupWideMNegative -> ChipGroupWide.M.Negative
        ChipGroupStyles.ChipGroupWideMPositive -> ChipGroupWide.M.Positive
        ChipGroupStyles.ChipGroupWideMSecondary -> ChipGroupWide.M.Secondary
        ChipGroupStyles.ChipGroupWideMWarning -> ChipGroupWide.M.Warning
        ChipGroupStyles.ChipGroupWideMPilledDefault -> ChipGroupWide.M.Pilled.Default
        ChipGroupStyles.ChipGroupWideMPilledAccent -> ChipGroupWide.M.Pilled.Accent
        ChipGroupStyles.ChipGroupWideMPilledNegative -> ChipGroupWide.M.Pilled.Negative
        ChipGroupStyles.ChipGroupWideMPilledPositive -> ChipGroupWide.M.Pilled.Positive
        ChipGroupStyles.ChipGroupWideMPilledSecondary -> ChipGroupWide.M.Pilled.Secondary
        ChipGroupStyles.ChipGroupWideMPilledWarning -> ChipGroupWide.M.Pilled.Warning
        ChipGroupStyles.ChipGroupWideSDefault -> ChipGroupWide.S.Default
        ChipGroupStyles.ChipGroupWideSAccent -> ChipGroupWide.S.Accent
        ChipGroupStyles.ChipGroupWideSNegative -> ChipGroupWide.S.Negative
        ChipGroupStyles.ChipGroupWideSPositive -> ChipGroupWide.S.Positive
        ChipGroupStyles.ChipGroupWideSSecondary -> ChipGroupWide.S.Secondary
        ChipGroupStyles.ChipGroupWideSWarning -> ChipGroupWide.S.Warning
        ChipGroupStyles.ChipGroupWideSPilledDefault -> ChipGroupWide.S.Pilled.Default
        ChipGroupStyles.ChipGroupWideSPilledAccent -> ChipGroupWide.S.Pilled.Accent
        ChipGroupStyles.ChipGroupWideSPilledNegative -> ChipGroupWide.S.Pilled.Negative
        ChipGroupStyles.ChipGroupWideSPilledPositive -> ChipGroupWide.S.Pilled.Positive
        ChipGroupStyles.ChipGroupWideSPilledSecondary -> ChipGroupWide.S.Pilled.Secondary
        ChipGroupStyles.ChipGroupWideSPilledWarning -> ChipGroupWide.S.Pilled.Warning
        ChipGroupStyles.ChipGroupWideXsDefault -> ChipGroupWide.Xs.Default
        ChipGroupStyles.ChipGroupWideXsAccent -> ChipGroupWide.Xs.Accent
        ChipGroupStyles.ChipGroupWideXsNegative -> ChipGroupWide.Xs.Negative
        ChipGroupStyles.ChipGroupWideXsPositive -> ChipGroupWide.Xs.Positive
        ChipGroupStyles.ChipGroupWideXsSecondary -> ChipGroupWide.Xs.Secondary
        ChipGroupStyles.ChipGroupWideXsWarning -> ChipGroupWide.Xs.Warning
        ChipGroupStyles.ChipGroupWideXsPilledDefault -> ChipGroupWide.Xs.Pilled.Default
        ChipGroupStyles.ChipGroupWideXsPilledAccent -> ChipGroupWide.Xs.Pilled.Accent
        ChipGroupStyles.ChipGroupWideXsPilledNegative -> ChipGroupWide.Xs.Pilled.Negative
        ChipGroupStyles.ChipGroupWideXsPilledPositive -> ChipGroupWide.Xs.Pilled.Positive
        ChipGroupStyles.ChipGroupWideXsPilledSecondary -> ChipGroupWide.Xs.Pilled.Secondary
        ChipGroupStyles.ChipGroupWideXsPilledWarning -> ChipGroupWide.Xs.Pilled.Warning
        ChipGroupStyles.EmbeddedChipGroupDenseXlDefault -> EmbeddedChipGroupDense.Xl.Default
        ChipGroupStyles.EmbeddedChipGroupDenseXlAccent -> EmbeddedChipGroupDense.Xl.Accent
        ChipGroupStyles.EmbeddedChipGroupDenseXlNegative -> EmbeddedChipGroupDense.Xl.Negative
        ChipGroupStyles.EmbeddedChipGroupDenseXlPositive -> EmbeddedChipGroupDense.Xl.Positive
        ChipGroupStyles.EmbeddedChipGroupDenseXlSecondary -> EmbeddedChipGroupDense.Xl.Secondary
        ChipGroupStyles.EmbeddedChipGroupDenseXlWarning -> EmbeddedChipGroupDense.Xl.Warning
        ChipGroupStyles.EmbeddedChipGroupDenseLDefault -> EmbeddedChipGroupDense.L.Default
        ChipGroupStyles.EmbeddedChipGroupDenseLAccent -> EmbeddedChipGroupDense.L.Accent
        ChipGroupStyles.EmbeddedChipGroupDenseLNegative -> EmbeddedChipGroupDense.L.Negative
        ChipGroupStyles.EmbeddedChipGroupDenseLPositive -> EmbeddedChipGroupDense.L.Positive
        ChipGroupStyles.EmbeddedChipGroupDenseLSecondary -> EmbeddedChipGroupDense.L.Secondary
        ChipGroupStyles.EmbeddedChipGroupDenseLWarning -> EmbeddedChipGroupDense.L.Warning
        ChipGroupStyles.EmbeddedChipGroupDenseMDefault -> EmbeddedChipGroupDense.M.Default
        ChipGroupStyles.EmbeddedChipGroupDenseMAccent -> EmbeddedChipGroupDense.M.Accent
        ChipGroupStyles.EmbeddedChipGroupDenseMNegative -> EmbeddedChipGroupDense.M.Negative
        ChipGroupStyles.EmbeddedChipGroupDenseMPositive -> EmbeddedChipGroupDense.M.Positive
        ChipGroupStyles.EmbeddedChipGroupDenseMSecondary -> EmbeddedChipGroupDense.M.Secondary
        ChipGroupStyles.EmbeddedChipGroupDenseMWarning -> EmbeddedChipGroupDense.M.Warning
        ChipGroupStyles.EmbeddedChipGroupDenseSDefault -> EmbeddedChipGroupDense.S.Default
        ChipGroupStyles.EmbeddedChipGroupDenseSAccent -> EmbeddedChipGroupDense.S.Accent
        ChipGroupStyles.EmbeddedChipGroupDenseSNegative -> EmbeddedChipGroupDense.S.Negative
        ChipGroupStyles.EmbeddedChipGroupDenseSPositive -> EmbeddedChipGroupDense.S.Positive
        ChipGroupStyles.EmbeddedChipGroupDenseSSecondary -> EmbeddedChipGroupDense.S.Secondary
        ChipGroupStyles.EmbeddedChipGroupDenseSWarning -> EmbeddedChipGroupDense.S.Warning
        ChipGroupStyles.EmbeddedChipGroupDenseXsDefault -> EmbeddedChipGroupDense.Xs.Default
        ChipGroupStyles.EmbeddedChipGroupDenseXsAccent -> EmbeddedChipGroupDense.Xs.Accent
        ChipGroupStyles.EmbeddedChipGroupDenseXsNegative -> EmbeddedChipGroupDense.Xs.Negative
        ChipGroupStyles.EmbeddedChipGroupDenseXsPositive -> EmbeddedChipGroupDense.Xs.Positive
        ChipGroupStyles.EmbeddedChipGroupDenseXsSecondary -> EmbeddedChipGroupDense.Xs.Secondary
        ChipGroupStyles.EmbeddedChipGroupDenseXsWarning -> EmbeddedChipGroupDense.Xs.Warning
        ChipGroupStyles.EmbeddedChipGroupWideXlDefault -> EmbeddedChipGroupWide.Xl.Default
        ChipGroupStyles.EmbeddedChipGroupWideXlAccent -> EmbeddedChipGroupWide.Xl.Accent
        ChipGroupStyles.EmbeddedChipGroupWideXlNegative -> EmbeddedChipGroupWide.Xl.Negative
        ChipGroupStyles.EmbeddedChipGroupWideXlPositive -> EmbeddedChipGroupWide.Xl.Positive
        ChipGroupStyles.EmbeddedChipGroupWideXlSecondary -> EmbeddedChipGroupWide.Xl.Secondary
        ChipGroupStyles.EmbeddedChipGroupWideXlWarning -> EmbeddedChipGroupWide.Xl.Warning
        ChipGroupStyles.EmbeddedChipGroupWideLDefault -> EmbeddedChipGroupWide.L.Default
        ChipGroupStyles.EmbeddedChipGroupWideLAccent -> EmbeddedChipGroupWide.L.Accent
        ChipGroupStyles.EmbeddedChipGroupWideLNegative -> EmbeddedChipGroupWide.L.Negative
        ChipGroupStyles.EmbeddedChipGroupWideLPositive -> EmbeddedChipGroupWide.L.Positive
        ChipGroupStyles.EmbeddedChipGroupWideLSecondary -> EmbeddedChipGroupWide.L.Secondary
        ChipGroupStyles.EmbeddedChipGroupWideLWarning -> EmbeddedChipGroupWide.L.Warning
        ChipGroupStyles.EmbeddedChipGroupWideMDefault -> EmbeddedChipGroupWide.M.Default
        ChipGroupStyles.EmbeddedChipGroupWideMAccent -> EmbeddedChipGroupWide.M.Accent
        ChipGroupStyles.EmbeddedChipGroupWideMNegative -> EmbeddedChipGroupWide.M.Negative
        ChipGroupStyles.EmbeddedChipGroupWideMPositive -> EmbeddedChipGroupWide.M.Positive
        ChipGroupStyles.EmbeddedChipGroupWideMSecondary -> EmbeddedChipGroupWide.M.Secondary
        ChipGroupStyles.EmbeddedChipGroupWideMWarning -> EmbeddedChipGroupWide.M.Warning
        ChipGroupStyles.EmbeddedChipGroupWideSDefault -> EmbeddedChipGroupWide.S.Default
        ChipGroupStyles.EmbeddedChipGroupWideSAccent -> EmbeddedChipGroupWide.S.Accent
        ChipGroupStyles.EmbeddedChipGroupWideSNegative -> EmbeddedChipGroupWide.S.Negative
        ChipGroupStyles.EmbeddedChipGroupWideSPositive -> EmbeddedChipGroupWide.S.Positive
        ChipGroupStyles.EmbeddedChipGroupWideSSecondary -> EmbeddedChipGroupWide.S.Secondary
        ChipGroupStyles.EmbeddedChipGroupWideSWarning -> EmbeddedChipGroupWide.S.Warning
        ChipGroupStyles.EmbeddedChipGroupWideXsDefault -> EmbeddedChipGroupWide.Xs.Default
        ChipGroupStyles.EmbeddedChipGroupWideXsAccent -> EmbeddedChipGroupWide.Xs.Accent
        ChipGroupStyles.EmbeddedChipGroupWideXsNegative -> EmbeddedChipGroupWide.Xs.Negative
        ChipGroupStyles.EmbeddedChipGroupWideXsPositive -> EmbeddedChipGroupWide.Xs.Positive
        ChipGroupStyles.EmbeddedChipGroupWideXsSecondary -> EmbeddedChipGroupWide.Xs.Secondary
        ChipGroupStyles.EmbeddedChipGroupWideXsWarning -> EmbeddedChipGroupWide.Xs.Warning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ChipGroupStyles] для chip-group-dense
 */
public fun ChipGroupStyles.Dense.resolve(
    size: ChipGroupDenseSize = ChipGroupDenseSize.L,
    shape: ChipGroupDenseShape = ChipGroupDenseShape.Default,
    view: ChipGroupDenseView,
): ChipGroupStyles = when {
    size == ChipGroupDenseSize.L && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Default -> ChipGroupStyles.ChipGroupDenseLPilledDefault
    size == ChipGroupDenseSize.L && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Accent -> ChipGroupStyles.ChipGroupDenseLPilledAccent
    size == ChipGroupDenseSize.L && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Negative -> ChipGroupStyles.ChipGroupDenseLPilledNegative
    size == ChipGroupDenseSize.L && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Positive -> ChipGroupStyles.ChipGroupDenseLPilledPositive
    size == ChipGroupDenseSize.L && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Secondary -> ChipGroupStyles.ChipGroupDenseLPilledSecondary
    size == ChipGroupDenseSize.L && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Warning -> ChipGroupStyles.ChipGroupDenseLPilledWarning
    size == ChipGroupDenseSize.M && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Default -> ChipGroupStyles.ChipGroupDenseMPilledDefault
    size == ChipGroupDenseSize.M && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Accent -> ChipGroupStyles.ChipGroupDenseMPilledAccent
    size == ChipGroupDenseSize.M && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Negative -> ChipGroupStyles.ChipGroupDenseMPilledNegative
    size == ChipGroupDenseSize.M && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Positive -> ChipGroupStyles.ChipGroupDenseMPilledPositive
    size == ChipGroupDenseSize.M && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Secondary -> ChipGroupStyles.ChipGroupDenseMPilledSecondary
    size == ChipGroupDenseSize.M && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Warning -> ChipGroupStyles.ChipGroupDenseMPilledWarning
    size == ChipGroupDenseSize.S && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Default -> ChipGroupStyles.ChipGroupDenseSPilledDefault
    size == ChipGroupDenseSize.S && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Accent -> ChipGroupStyles.ChipGroupDenseSPilledAccent
    size == ChipGroupDenseSize.S && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Negative -> ChipGroupStyles.ChipGroupDenseSPilledNegative
    size == ChipGroupDenseSize.S && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Positive -> ChipGroupStyles.ChipGroupDenseSPilledPositive
    size == ChipGroupDenseSize.S && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Secondary -> ChipGroupStyles.ChipGroupDenseSPilledSecondary
    size == ChipGroupDenseSize.S && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Warning -> ChipGroupStyles.ChipGroupDenseSPilledWarning
    size == ChipGroupDenseSize.Xs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Default -> ChipGroupStyles.ChipGroupDenseXsPilledDefault
    size == ChipGroupDenseSize.Xs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Accent -> ChipGroupStyles.ChipGroupDenseXsPilledAccent
    size == ChipGroupDenseSize.Xs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Negative -> ChipGroupStyles.ChipGroupDenseXsPilledNegative
    size == ChipGroupDenseSize.Xs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Positive -> ChipGroupStyles.ChipGroupDenseXsPilledPositive
    size == ChipGroupDenseSize.Xs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Secondary -> ChipGroupStyles.ChipGroupDenseXsPilledSecondary
    size == ChipGroupDenseSize.Xs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Warning -> ChipGroupStyles.ChipGroupDenseXsPilledWarning
    size == ChipGroupDenseSize.L && view == ChipGroupDenseView.Default ->
        ChipGroupStyles.ChipGroupDenseLDefault
    size == ChipGroupDenseSize.L && view == ChipGroupDenseView.Accent ->
        ChipGroupStyles.ChipGroupDenseLAccent
    size == ChipGroupDenseSize.L && view == ChipGroupDenseView.Negative ->
        ChipGroupStyles.ChipGroupDenseLNegative
    size == ChipGroupDenseSize.L && view == ChipGroupDenseView.Positive ->
        ChipGroupStyles.ChipGroupDenseLPositive
    size == ChipGroupDenseSize.L && view == ChipGroupDenseView.Secondary ->
        ChipGroupStyles.ChipGroupDenseLSecondary
    size == ChipGroupDenseSize.L && view == ChipGroupDenseView.Warning ->
        ChipGroupStyles.ChipGroupDenseLWarning
    size == ChipGroupDenseSize.M && view == ChipGroupDenseView.Default ->
        ChipGroupStyles.ChipGroupDenseMDefault
    size == ChipGroupDenseSize.M && view == ChipGroupDenseView.Accent ->
        ChipGroupStyles.ChipGroupDenseMAccent
    size == ChipGroupDenseSize.M && view == ChipGroupDenseView.Negative ->
        ChipGroupStyles.ChipGroupDenseMNegative
    size == ChipGroupDenseSize.M && view == ChipGroupDenseView.Positive ->
        ChipGroupStyles.ChipGroupDenseMPositive
    size == ChipGroupDenseSize.M && view == ChipGroupDenseView.Secondary ->
        ChipGroupStyles.ChipGroupDenseMSecondary
    size == ChipGroupDenseSize.M && view == ChipGroupDenseView.Warning ->
        ChipGroupStyles.ChipGroupDenseMWarning
    size == ChipGroupDenseSize.S && view == ChipGroupDenseView.Default ->
        ChipGroupStyles.ChipGroupDenseSDefault
    size == ChipGroupDenseSize.S && view == ChipGroupDenseView.Accent ->
        ChipGroupStyles.ChipGroupDenseSAccent
    size == ChipGroupDenseSize.S && view == ChipGroupDenseView.Negative ->
        ChipGroupStyles.ChipGroupDenseSNegative
    size == ChipGroupDenseSize.S && view == ChipGroupDenseView.Positive ->
        ChipGroupStyles.ChipGroupDenseSPositive
    size == ChipGroupDenseSize.S && view == ChipGroupDenseView.Secondary ->
        ChipGroupStyles.ChipGroupDenseSSecondary
    size == ChipGroupDenseSize.S && view == ChipGroupDenseView.Warning ->
        ChipGroupStyles.ChipGroupDenseSWarning
    size == ChipGroupDenseSize.Xs && view == ChipGroupDenseView.Default ->
        ChipGroupStyles.ChipGroupDenseXsDefault
    size == ChipGroupDenseSize.Xs && view == ChipGroupDenseView.Accent ->
        ChipGroupStyles.ChipGroupDenseXsAccent
    size == ChipGroupDenseSize.Xs && view == ChipGroupDenseView.Negative ->
        ChipGroupStyles.ChipGroupDenseXsNegative
    size == ChipGroupDenseSize.Xs && view == ChipGroupDenseView.Positive ->
        ChipGroupStyles.ChipGroupDenseXsPositive
    size == ChipGroupDenseSize.Xs && view == ChipGroupDenseView.Secondary ->
        ChipGroupStyles.ChipGroupDenseXsSecondary
    size == ChipGroupDenseSize.Xs && view == ChipGroupDenseView.Warning ->
        ChipGroupStyles.ChipGroupDenseXsWarning
    else -> error("Unsupported chip-group-dense style combination")
}

/**
 * Возвращает [ChipGroupStyle] для chip-group-dense
 */
@Composable
public fun ChipGroupStyles.Dense.style(
    size: ChipGroupDenseSize = ChipGroupDenseSize.L,
    shape: ChipGroupDenseShape = ChipGroupDenseShape.Default,
    view: ChipGroupDenseView,
    modify: @Composable ChipGroupStyleBuilder.() -> Unit = {},
): ChipGroupStyle = resolve(size, shape, view).style(modify)

/**
 * Возвращает экземпляр [ChipGroupStyles] для chip-group-wide
 */
public fun ChipGroupStyles.Wide.resolve(
    size: ChipGroupWideSize = ChipGroupWideSize.L,
    shape: ChipGroupWideShape = ChipGroupWideShape.Default,
    view: ChipGroupWideView,
): ChipGroupStyles = when {
    size == ChipGroupWideSize.L && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Default -> ChipGroupStyles.ChipGroupWideLPilledDefault
    size == ChipGroupWideSize.L && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Accent -> ChipGroupStyles.ChipGroupWideLPilledAccent
    size == ChipGroupWideSize.L && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Negative -> ChipGroupStyles.ChipGroupWideLPilledNegative
    size == ChipGroupWideSize.L && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Positive -> ChipGroupStyles.ChipGroupWideLPilledPositive
    size == ChipGroupWideSize.L && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Secondary -> ChipGroupStyles.ChipGroupWideLPilledSecondary
    size == ChipGroupWideSize.L && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Warning -> ChipGroupStyles.ChipGroupWideLPilledWarning
    size == ChipGroupWideSize.M && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Default -> ChipGroupStyles.ChipGroupWideMPilledDefault
    size == ChipGroupWideSize.M && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Accent -> ChipGroupStyles.ChipGroupWideMPilledAccent
    size == ChipGroupWideSize.M && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Negative -> ChipGroupStyles.ChipGroupWideMPilledNegative
    size == ChipGroupWideSize.M && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Positive -> ChipGroupStyles.ChipGroupWideMPilledPositive
    size == ChipGroupWideSize.M && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Secondary -> ChipGroupStyles.ChipGroupWideMPilledSecondary
    size == ChipGroupWideSize.M && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Warning -> ChipGroupStyles.ChipGroupWideMPilledWarning
    size == ChipGroupWideSize.S && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Default -> ChipGroupStyles.ChipGroupWideSPilledDefault
    size == ChipGroupWideSize.S && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Accent -> ChipGroupStyles.ChipGroupWideSPilledAccent
    size == ChipGroupWideSize.S && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Negative -> ChipGroupStyles.ChipGroupWideSPilledNegative
    size == ChipGroupWideSize.S && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Positive -> ChipGroupStyles.ChipGroupWideSPilledPositive
    size == ChipGroupWideSize.S && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Secondary -> ChipGroupStyles.ChipGroupWideSPilledSecondary
    size == ChipGroupWideSize.S && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Warning -> ChipGroupStyles.ChipGroupWideSPilledWarning
    size == ChipGroupWideSize.Xs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Default -> ChipGroupStyles.ChipGroupWideXsPilledDefault
    size == ChipGroupWideSize.Xs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Accent -> ChipGroupStyles.ChipGroupWideXsPilledAccent
    size == ChipGroupWideSize.Xs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Negative -> ChipGroupStyles.ChipGroupWideXsPilledNegative
    size == ChipGroupWideSize.Xs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Positive -> ChipGroupStyles.ChipGroupWideXsPilledPositive
    size == ChipGroupWideSize.Xs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Secondary -> ChipGroupStyles.ChipGroupWideXsPilledSecondary
    size == ChipGroupWideSize.Xs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Warning -> ChipGroupStyles.ChipGroupWideXsPilledWarning
    size == ChipGroupWideSize.L && view == ChipGroupWideView.Default ->
        ChipGroupStyles.ChipGroupWideLDefault
    size == ChipGroupWideSize.L && view == ChipGroupWideView.Accent ->
        ChipGroupStyles.ChipGroupWideLAccent
    size == ChipGroupWideSize.L && view == ChipGroupWideView.Negative ->
        ChipGroupStyles.ChipGroupWideLNegative
    size == ChipGroupWideSize.L && view == ChipGroupWideView.Positive ->
        ChipGroupStyles.ChipGroupWideLPositive
    size == ChipGroupWideSize.L && view == ChipGroupWideView.Secondary ->
        ChipGroupStyles.ChipGroupWideLSecondary
    size == ChipGroupWideSize.L && view == ChipGroupWideView.Warning ->
        ChipGroupStyles.ChipGroupWideLWarning
    size == ChipGroupWideSize.M && view == ChipGroupWideView.Default ->
        ChipGroupStyles.ChipGroupWideMDefault
    size == ChipGroupWideSize.M && view == ChipGroupWideView.Accent ->
        ChipGroupStyles.ChipGroupWideMAccent
    size == ChipGroupWideSize.M && view == ChipGroupWideView.Negative ->
        ChipGroupStyles.ChipGroupWideMNegative
    size == ChipGroupWideSize.M && view == ChipGroupWideView.Positive ->
        ChipGroupStyles.ChipGroupWideMPositive
    size == ChipGroupWideSize.M && view == ChipGroupWideView.Secondary ->
        ChipGroupStyles.ChipGroupWideMSecondary
    size == ChipGroupWideSize.M && view == ChipGroupWideView.Warning ->
        ChipGroupStyles.ChipGroupWideMWarning
    size == ChipGroupWideSize.S && view == ChipGroupWideView.Default ->
        ChipGroupStyles.ChipGroupWideSDefault
    size == ChipGroupWideSize.S && view == ChipGroupWideView.Accent ->
        ChipGroupStyles.ChipGroupWideSAccent
    size == ChipGroupWideSize.S && view == ChipGroupWideView.Negative ->
        ChipGroupStyles.ChipGroupWideSNegative
    size == ChipGroupWideSize.S && view == ChipGroupWideView.Positive ->
        ChipGroupStyles.ChipGroupWideSPositive
    size == ChipGroupWideSize.S && view == ChipGroupWideView.Secondary ->
        ChipGroupStyles.ChipGroupWideSSecondary
    size == ChipGroupWideSize.S && view == ChipGroupWideView.Warning ->
        ChipGroupStyles.ChipGroupWideSWarning
    size == ChipGroupWideSize.Xs && view == ChipGroupWideView.Default ->
        ChipGroupStyles.ChipGroupWideXsDefault
    size == ChipGroupWideSize.Xs && view == ChipGroupWideView.Accent ->
        ChipGroupStyles.ChipGroupWideXsAccent
    size == ChipGroupWideSize.Xs && view == ChipGroupWideView.Negative ->
        ChipGroupStyles.ChipGroupWideXsNegative
    size == ChipGroupWideSize.Xs && view == ChipGroupWideView.Positive ->
        ChipGroupStyles.ChipGroupWideXsPositive
    size == ChipGroupWideSize.Xs && view == ChipGroupWideView.Secondary ->
        ChipGroupStyles.ChipGroupWideXsSecondary
    size == ChipGroupWideSize.Xs && view == ChipGroupWideView.Warning ->
        ChipGroupStyles.ChipGroupWideXsWarning
    else -> error("Unsupported chip-group-wide style combination")
}

/**
 * Возвращает [ChipGroupStyle] для chip-group-wide
 */
@Composable
public fun ChipGroupStyles.Wide.style(
    size: ChipGroupWideSize = ChipGroupWideSize.L,
    shape: ChipGroupWideShape = ChipGroupWideShape.Default,
    view: ChipGroupWideView,
    modify: @Composable ChipGroupStyleBuilder.() -> Unit = {},
): ChipGroupStyle = resolve(size, shape, view).style(modify)

/**
 * Возвращает экземпляр [ChipGroupStyles] для embedded-chip-group-dense
 */
public fun ChipGroupStyles.EmbeddedChipGroupDense.resolve(
    size: EmbeddedChipGroupDenseSize =
        EmbeddedChipGroupDenseSize.Xl,
    view: EmbeddedChipGroupDenseView,
): ChipGroupStyles = when {
    size == EmbeddedChipGroupDenseSize.Xl && view == EmbeddedChipGroupDenseView.Default ->
        ChipGroupStyles.EmbeddedChipGroupDenseXlDefault
    size == EmbeddedChipGroupDenseSize.Xl && view == EmbeddedChipGroupDenseView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupDenseXlAccent
    size == EmbeddedChipGroupDenseSize.Xl && view == EmbeddedChipGroupDenseView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupDenseXlNegative
    size == EmbeddedChipGroupDenseSize.Xl && view == EmbeddedChipGroupDenseView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupDenseXlPositive
    size == EmbeddedChipGroupDenseSize.Xl && view == EmbeddedChipGroupDenseView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupDenseXlSecondary
    size == EmbeddedChipGroupDenseSize.Xl && view == EmbeddedChipGroupDenseView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupDenseXlWarning
    size == EmbeddedChipGroupDenseSize.L && view == EmbeddedChipGroupDenseView.Default ->
        ChipGroupStyles.EmbeddedChipGroupDenseLDefault
    size == EmbeddedChipGroupDenseSize.L && view == EmbeddedChipGroupDenseView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupDenseLAccent
    size == EmbeddedChipGroupDenseSize.L && view == EmbeddedChipGroupDenseView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupDenseLNegative
    size == EmbeddedChipGroupDenseSize.L && view == EmbeddedChipGroupDenseView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupDenseLPositive
    size == EmbeddedChipGroupDenseSize.L && view == EmbeddedChipGroupDenseView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupDenseLSecondary
    size == EmbeddedChipGroupDenseSize.L && view == EmbeddedChipGroupDenseView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupDenseLWarning
    size == EmbeddedChipGroupDenseSize.M && view == EmbeddedChipGroupDenseView.Default ->
        ChipGroupStyles.EmbeddedChipGroupDenseMDefault
    size == EmbeddedChipGroupDenseSize.M && view == EmbeddedChipGroupDenseView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupDenseMAccent
    size == EmbeddedChipGroupDenseSize.M && view == EmbeddedChipGroupDenseView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupDenseMNegative
    size == EmbeddedChipGroupDenseSize.M && view == EmbeddedChipGroupDenseView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupDenseMPositive
    size == EmbeddedChipGroupDenseSize.M && view == EmbeddedChipGroupDenseView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupDenseMSecondary
    size == EmbeddedChipGroupDenseSize.M && view == EmbeddedChipGroupDenseView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupDenseMWarning
    size == EmbeddedChipGroupDenseSize.S && view == EmbeddedChipGroupDenseView.Default ->
        ChipGroupStyles.EmbeddedChipGroupDenseSDefault
    size == EmbeddedChipGroupDenseSize.S && view == EmbeddedChipGroupDenseView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupDenseSAccent
    size == EmbeddedChipGroupDenseSize.S && view == EmbeddedChipGroupDenseView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupDenseSNegative
    size == EmbeddedChipGroupDenseSize.S && view == EmbeddedChipGroupDenseView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupDenseSPositive
    size == EmbeddedChipGroupDenseSize.S && view == EmbeddedChipGroupDenseView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupDenseSSecondary
    size == EmbeddedChipGroupDenseSize.S && view == EmbeddedChipGroupDenseView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupDenseSWarning
    size == EmbeddedChipGroupDenseSize.Xs && view == EmbeddedChipGroupDenseView.Default ->
        ChipGroupStyles.EmbeddedChipGroupDenseXsDefault
    size == EmbeddedChipGroupDenseSize.Xs && view == EmbeddedChipGroupDenseView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupDenseXsAccent
    size == EmbeddedChipGroupDenseSize.Xs && view == EmbeddedChipGroupDenseView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupDenseXsNegative
    size == EmbeddedChipGroupDenseSize.Xs && view == EmbeddedChipGroupDenseView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupDenseXsPositive
    size == EmbeddedChipGroupDenseSize.Xs && view == EmbeddedChipGroupDenseView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupDenseXsSecondary
    size == EmbeddedChipGroupDenseSize.Xs && view == EmbeddedChipGroupDenseView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupDenseXsWarning
    else -> error("Unsupported embedded-chip-group-dense style combination")
}

/**
 * Возвращает [ChipGroupStyle] для embedded-chip-group-dense
 */
@Composable
public fun ChipGroupStyles.EmbeddedChipGroupDense.style(
    size: EmbeddedChipGroupDenseSize = EmbeddedChipGroupDenseSize.Xl,
    view: EmbeddedChipGroupDenseView,
    modify: @Composable ChipGroupStyleBuilder.() -> Unit = {},
): ChipGroupStyle = resolve(size, view).style(modify)

/**
 * Возвращает экземпляр [ChipGroupStyles] для embedded-chip-group-wide
 */
public fun ChipGroupStyles.EmbeddedChipGroupWide.resolve(
    size: EmbeddedChipGroupWideSize =
        EmbeddedChipGroupWideSize.Xl,
    view: EmbeddedChipGroupWideView,
): ChipGroupStyles = when {
    size == EmbeddedChipGroupWideSize.Xl && view == EmbeddedChipGroupWideView.Default ->
        ChipGroupStyles.EmbeddedChipGroupWideXlDefault
    size == EmbeddedChipGroupWideSize.Xl && view == EmbeddedChipGroupWideView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupWideXlAccent
    size == EmbeddedChipGroupWideSize.Xl && view == EmbeddedChipGroupWideView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupWideXlNegative
    size == EmbeddedChipGroupWideSize.Xl && view == EmbeddedChipGroupWideView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupWideXlPositive
    size == EmbeddedChipGroupWideSize.Xl && view == EmbeddedChipGroupWideView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupWideXlSecondary
    size == EmbeddedChipGroupWideSize.Xl && view == EmbeddedChipGroupWideView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupWideXlWarning
    size == EmbeddedChipGroupWideSize.L && view == EmbeddedChipGroupWideView.Default ->
        ChipGroupStyles.EmbeddedChipGroupWideLDefault
    size == EmbeddedChipGroupWideSize.L && view == EmbeddedChipGroupWideView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupWideLAccent
    size == EmbeddedChipGroupWideSize.L && view == EmbeddedChipGroupWideView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupWideLNegative
    size == EmbeddedChipGroupWideSize.L && view == EmbeddedChipGroupWideView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupWideLPositive
    size == EmbeddedChipGroupWideSize.L && view == EmbeddedChipGroupWideView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupWideLSecondary
    size == EmbeddedChipGroupWideSize.L && view == EmbeddedChipGroupWideView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupWideLWarning
    size == EmbeddedChipGroupWideSize.M && view == EmbeddedChipGroupWideView.Default ->
        ChipGroupStyles.EmbeddedChipGroupWideMDefault
    size == EmbeddedChipGroupWideSize.M && view == EmbeddedChipGroupWideView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupWideMAccent
    size == EmbeddedChipGroupWideSize.M && view == EmbeddedChipGroupWideView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupWideMNegative
    size == EmbeddedChipGroupWideSize.M && view == EmbeddedChipGroupWideView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupWideMPositive
    size == EmbeddedChipGroupWideSize.M && view == EmbeddedChipGroupWideView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupWideMSecondary
    size == EmbeddedChipGroupWideSize.M && view == EmbeddedChipGroupWideView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupWideMWarning
    size == EmbeddedChipGroupWideSize.S && view == EmbeddedChipGroupWideView.Default ->
        ChipGroupStyles.EmbeddedChipGroupWideSDefault
    size == EmbeddedChipGroupWideSize.S && view == EmbeddedChipGroupWideView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupWideSAccent
    size == EmbeddedChipGroupWideSize.S && view == EmbeddedChipGroupWideView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupWideSNegative
    size == EmbeddedChipGroupWideSize.S && view == EmbeddedChipGroupWideView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupWideSPositive
    size == EmbeddedChipGroupWideSize.S && view == EmbeddedChipGroupWideView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupWideSSecondary
    size == EmbeddedChipGroupWideSize.S && view == EmbeddedChipGroupWideView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupWideSWarning
    size == EmbeddedChipGroupWideSize.Xs && view == EmbeddedChipGroupWideView.Default ->
        ChipGroupStyles.EmbeddedChipGroupWideXsDefault
    size == EmbeddedChipGroupWideSize.Xs && view == EmbeddedChipGroupWideView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupWideXsAccent
    size == EmbeddedChipGroupWideSize.Xs && view == EmbeddedChipGroupWideView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupWideXsNegative
    size == EmbeddedChipGroupWideSize.Xs && view == EmbeddedChipGroupWideView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupWideXsPositive
    size == EmbeddedChipGroupWideSize.Xs && view == EmbeddedChipGroupWideView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupWideXsSecondary
    size == EmbeddedChipGroupWideSize.Xs && view == EmbeddedChipGroupWideView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupWideXsWarning
    else -> error("Unsupported embedded-chip-group-wide style combination")
}

/**
 * Возвращает [ChipGroupStyle] для embedded-chip-group-wide
 */
@Composable
public fun ChipGroupStyles.EmbeddedChipGroupWide.style(
    size: EmbeddedChipGroupWideSize = EmbeddedChipGroupWideSize.Xl,
    view: EmbeddedChipGroupWideView,
    modify: @Composable ChipGroupStyleBuilder.() -> Unit = {},
): ChipGroupStyle = resolve(size, view).style(modify)
