// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.chipgroup

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
    ChipGroupDenseLSecondary("ChipGroupDense.L.Secondary"),
    ChipGroupDenseLPilledDefault("ChipGroupDense.L.Pilled.Default"),
    ChipGroupDenseLPilledSecondary("ChipGroupDense.L.Pilled.Secondary"),
    ChipGroupDenseMDefault("ChipGroupDense.M.Default"),
    ChipGroupDenseMSecondary("ChipGroupDense.M.Secondary"),
    ChipGroupDenseMPilledDefault("ChipGroupDense.M.Pilled.Default"),
    ChipGroupDenseMPilledSecondary("ChipGroupDense.M.Pilled.Secondary"),
    ChipGroupDenseSDefault("ChipGroupDense.S.Default"),
    ChipGroupDenseSSecondary("ChipGroupDense.S.Secondary"),
    ChipGroupDenseSPilledDefault("ChipGroupDense.S.Pilled.Default"),
    ChipGroupDenseSPilledSecondary("ChipGroupDense.S.Pilled.Secondary"),
    ChipGroupDenseXsDefault("ChipGroupDense.Xs.Default"),
    ChipGroupDenseXsSecondary("ChipGroupDense.Xs.Secondary"),
    ChipGroupDenseXsPilledDefault("ChipGroupDense.Xs.Pilled.Default"),
    ChipGroupDenseXsPilledSecondary("ChipGroupDense.Xs.Pilled.Secondary"),
    ChipGroupDenseXxsDefault("ChipGroupDense.Xxs.Default"),
    ChipGroupDenseXxsSecondary("ChipGroupDense.Xxs.Secondary"),
    ChipGroupDenseXxsPilledDefault("ChipGroupDense.Xxs.Pilled.Default"),
    ChipGroupDenseXxsPilledSecondary("ChipGroupDense.Xxs.Pilled.Secondary"),
    ChipGroupWideLDefault("ChipGroupWide.L.Default"),
    ChipGroupWideLSecondary("ChipGroupWide.L.Secondary"),
    ChipGroupWideLPilledDefault("ChipGroupWide.L.Pilled.Default"),
    ChipGroupWideLPilledSecondary("ChipGroupWide.L.Pilled.Secondary"),
    ChipGroupWideMDefault("ChipGroupWide.M.Default"),
    ChipGroupWideMSecondary("ChipGroupWide.M.Secondary"),
    ChipGroupWideMPilledDefault("ChipGroupWide.M.Pilled.Default"),
    ChipGroupWideMPilledSecondary("ChipGroupWide.M.Pilled.Secondary"),
    ChipGroupWideSDefault("ChipGroupWide.S.Default"),
    ChipGroupWideSSecondary("ChipGroupWide.S.Secondary"),
    ChipGroupWideSPilledDefault("ChipGroupWide.S.Pilled.Default"),
    ChipGroupWideSPilledSecondary("ChipGroupWide.S.Pilled.Secondary"),
    ChipGroupWideXsDefault("ChipGroupWide.Xs.Default"),
    ChipGroupWideXsSecondary("ChipGroupWide.Xs.Secondary"),
    ChipGroupWideXsPilledDefault("ChipGroupWide.Xs.Pilled.Default"),
    ChipGroupWideXsPilledSecondary("ChipGroupWide.Xs.Pilled.Secondary"),
    ChipGroupWideXxsDefault("ChipGroupWide.Xxs.Default"),
    ChipGroupWideXxsSecondary("ChipGroupWide.Xxs.Secondary"),
    ChipGroupWideXxsPilledDefault("ChipGroupWide.Xxs.Pilled.Default"),
    ChipGroupWideXxsPilledSecondary("ChipGroupWide.Xxs.Pilled.Secondary"),
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
    Xxs,
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
    Secondary,
}

/**
 * Возможные значения свойства size для chip-group-wide
 */
public enum class ChipGroupWideSize {
    L,
    M,
    S,
    Xs,
    Xxs,
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
    Secondary,
}

/**
 * Возвращает [ChipGroupStyle] для [ChipGroupStyles]
 */
@Composable
public fun ChipGroupStyles.style(modify: @Composable ChipGroupStyleBuilder.() -> Unit = {}): ChipGroupStyle {
    val builder = when (this) {
        ChipGroupStyles.ChipGroupDenseLDefault -> ChipGroupDense.L.Default
        ChipGroupStyles.ChipGroupDenseLSecondary -> ChipGroupDense.L.Secondary
        ChipGroupStyles.ChipGroupDenseLPilledDefault -> ChipGroupDense.L.Pilled.Default
        ChipGroupStyles.ChipGroupDenseLPilledSecondary -> ChipGroupDense.L.Pilled.Secondary
        ChipGroupStyles.ChipGroupDenseMDefault -> ChipGroupDense.M.Default
        ChipGroupStyles.ChipGroupDenseMSecondary -> ChipGroupDense.M.Secondary
        ChipGroupStyles.ChipGroupDenseMPilledDefault -> ChipGroupDense.M.Pilled.Default
        ChipGroupStyles.ChipGroupDenseMPilledSecondary -> ChipGroupDense.M.Pilled.Secondary
        ChipGroupStyles.ChipGroupDenseSDefault -> ChipGroupDense.S.Default
        ChipGroupStyles.ChipGroupDenseSSecondary -> ChipGroupDense.S.Secondary
        ChipGroupStyles.ChipGroupDenseSPilledDefault -> ChipGroupDense.S.Pilled.Default
        ChipGroupStyles.ChipGroupDenseSPilledSecondary -> ChipGroupDense.S.Pilled.Secondary
        ChipGroupStyles.ChipGroupDenseXsDefault -> ChipGroupDense.Xs.Default
        ChipGroupStyles.ChipGroupDenseXsSecondary -> ChipGroupDense.Xs.Secondary
        ChipGroupStyles.ChipGroupDenseXsPilledDefault -> ChipGroupDense.Xs.Pilled.Default
        ChipGroupStyles.ChipGroupDenseXsPilledSecondary -> ChipGroupDense.Xs.Pilled.Secondary
        ChipGroupStyles.ChipGroupDenseXxsDefault -> ChipGroupDense.Xxs.Default
        ChipGroupStyles.ChipGroupDenseXxsSecondary -> ChipGroupDense.Xxs.Secondary
        ChipGroupStyles.ChipGroupDenseXxsPilledDefault -> ChipGroupDense.Xxs.Pilled.Default
        ChipGroupStyles.ChipGroupDenseXxsPilledSecondary -> ChipGroupDense.Xxs.Pilled.Secondary
        ChipGroupStyles.ChipGroupWideLDefault -> ChipGroupWide.L.Default
        ChipGroupStyles.ChipGroupWideLSecondary -> ChipGroupWide.L.Secondary
        ChipGroupStyles.ChipGroupWideLPilledDefault -> ChipGroupWide.L.Pilled.Default
        ChipGroupStyles.ChipGroupWideLPilledSecondary -> ChipGroupWide.L.Pilled.Secondary
        ChipGroupStyles.ChipGroupWideMDefault -> ChipGroupWide.M.Default
        ChipGroupStyles.ChipGroupWideMSecondary -> ChipGroupWide.M.Secondary
        ChipGroupStyles.ChipGroupWideMPilledDefault -> ChipGroupWide.M.Pilled.Default
        ChipGroupStyles.ChipGroupWideMPilledSecondary -> ChipGroupWide.M.Pilled.Secondary
        ChipGroupStyles.ChipGroupWideSDefault -> ChipGroupWide.S.Default
        ChipGroupStyles.ChipGroupWideSSecondary -> ChipGroupWide.S.Secondary
        ChipGroupStyles.ChipGroupWideSPilledDefault -> ChipGroupWide.S.Pilled.Default
        ChipGroupStyles.ChipGroupWideSPilledSecondary -> ChipGroupWide.S.Pilled.Secondary
        ChipGroupStyles.ChipGroupWideXsDefault -> ChipGroupWide.Xs.Default
        ChipGroupStyles.ChipGroupWideXsSecondary -> ChipGroupWide.Xs.Secondary
        ChipGroupStyles.ChipGroupWideXsPilledDefault -> ChipGroupWide.Xs.Pilled.Default
        ChipGroupStyles.ChipGroupWideXsPilledSecondary -> ChipGroupWide.Xs.Pilled.Secondary
        ChipGroupStyles.ChipGroupWideXxsDefault -> ChipGroupWide.Xxs.Default
        ChipGroupStyles.ChipGroupWideXxsSecondary -> ChipGroupWide.Xxs.Secondary
        ChipGroupStyles.ChipGroupWideXxsPilledDefault -> ChipGroupWide.Xxs.Pilled.Default
        ChipGroupStyles.ChipGroupWideXxsPilledSecondary -> ChipGroupWide.Xxs.Pilled.Secondary
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
        ChipGroupDenseView.Secondary -> ChipGroupStyles.ChipGroupDenseLPilledSecondary
    size == ChipGroupDenseSize.M && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Default -> ChipGroupStyles.ChipGroupDenseMPilledDefault
    size == ChipGroupDenseSize.M && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Secondary -> ChipGroupStyles.ChipGroupDenseMPilledSecondary
    size == ChipGroupDenseSize.S && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Default -> ChipGroupStyles.ChipGroupDenseSPilledDefault
    size == ChipGroupDenseSize.S && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Secondary -> ChipGroupStyles.ChipGroupDenseSPilledSecondary
    size == ChipGroupDenseSize.Xs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Default -> ChipGroupStyles.ChipGroupDenseXsPilledDefault
    size == ChipGroupDenseSize.Xs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Secondary -> ChipGroupStyles.ChipGroupDenseXsPilledSecondary
    size == ChipGroupDenseSize.Xxs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Default -> ChipGroupStyles.ChipGroupDenseXxsPilledDefault
    size == ChipGroupDenseSize.Xxs && shape == ChipGroupDenseShape.Pilled && view ==
        ChipGroupDenseView.Secondary -> ChipGroupStyles.ChipGroupDenseXxsPilledSecondary
    size == ChipGroupDenseSize.L && view == ChipGroupDenseView.Default ->
        ChipGroupStyles.ChipGroupDenseLDefault
    size == ChipGroupDenseSize.L && view == ChipGroupDenseView.Secondary ->
        ChipGroupStyles.ChipGroupDenseLSecondary
    size == ChipGroupDenseSize.M && view == ChipGroupDenseView.Default ->
        ChipGroupStyles.ChipGroupDenseMDefault
    size == ChipGroupDenseSize.M && view == ChipGroupDenseView.Secondary ->
        ChipGroupStyles.ChipGroupDenseMSecondary
    size == ChipGroupDenseSize.S && view == ChipGroupDenseView.Default ->
        ChipGroupStyles.ChipGroupDenseSDefault
    size == ChipGroupDenseSize.S && view == ChipGroupDenseView.Secondary ->
        ChipGroupStyles.ChipGroupDenseSSecondary
    size == ChipGroupDenseSize.Xs && view == ChipGroupDenseView.Default ->
        ChipGroupStyles.ChipGroupDenseXsDefault
    size == ChipGroupDenseSize.Xs && view == ChipGroupDenseView.Secondary ->
        ChipGroupStyles.ChipGroupDenseXsSecondary
    size == ChipGroupDenseSize.Xxs && view == ChipGroupDenseView.Default ->
        ChipGroupStyles.ChipGroupDenseXxsDefault
    size == ChipGroupDenseSize.Xxs && view == ChipGroupDenseView.Secondary ->
        ChipGroupStyles.ChipGroupDenseXxsSecondary
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
        ChipGroupWideView.Secondary -> ChipGroupStyles.ChipGroupWideLPilledSecondary
    size == ChipGroupWideSize.M && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Default -> ChipGroupStyles.ChipGroupWideMPilledDefault
    size == ChipGroupWideSize.M && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Secondary -> ChipGroupStyles.ChipGroupWideMPilledSecondary
    size == ChipGroupWideSize.S && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Default -> ChipGroupStyles.ChipGroupWideSPilledDefault
    size == ChipGroupWideSize.S && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Secondary -> ChipGroupStyles.ChipGroupWideSPilledSecondary
    size == ChipGroupWideSize.Xs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Default -> ChipGroupStyles.ChipGroupWideXsPilledDefault
    size == ChipGroupWideSize.Xs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Secondary -> ChipGroupStyles.ChipGroupWideXsPilledSecondary
    size == ChipGroupWideSize.Xxs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Default -> ChipGroupStyles.ChipGroupWideXxsPilledDefault
    size == ChipGroupWideSize.Xxs && shape == ChipGroupWideShape.Pilled && view ==
        ChipGroupWideView.Secondary -> ChipGroupStyles.ChipGroupWideXxsPilledSecondary
    size == ChipGroupWideSize.L && view == ChipGroupWideView.Default ->
        ChipGroupStyles.ChipGroupWideLDefault
    size == ChipGroupWideSize.L && view == ChipGroupWideView.Secondary ->
        ChipGroupStyles.ChipGroupWideLSecondary
    size == ChipGroupWideSize.M && view == ChipGroupWideView.Default ->
        ChipGroupStyles.ChipGroupWideMDefault
    size == ChipGroupWideSize.M && view == ChipGroupWideView.Secondary ->
        ChipGroupStyles.ChipGroupWideMSecondary
    size == ChipGroupWideSize.S && view == ChipGroupWideView.Default ->
        ChipGroupStyles.ChipGroupWideSDefault
    size == ChipGroupWideSize.S && view == ChipGroupWideView.Secondary ->
        ChipGroupStyles.ChipGroupWideSSecondary
    size == ChipGroupWideSize.Xs && view == ChipGroupWideView.Default ->
        ChipGroupStyles.ChipGroupWideXsDefault
    size == ChipGroupWideSize.Xs && view == ChipGroupWideView.Secondary ->
        ChipGroupStyles.ChipGroupWideXsSecondary
    size == ChipGroupWideSize.Xxs && view == ChipGroupWideView.Default ->
        ChipGroupStyles.ChipGroupWideXxsDefault
    size == ChipGroupWideSize.Xxs && view == ChipGroupWideView.Secondary ->
        ChipGroupStyles.ChipGroupWideXxsSecondary
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
