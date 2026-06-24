// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.chipgroup

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
    ;

    /**
     * Typed API для подбора стиля chip-group-dense
     */
    public object Dense

    /**
     * Typed API для подбора стиля chip-group-wide
     */
    public object Wide
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
