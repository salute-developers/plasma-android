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
}

/**
 * Возвращает [ChipGroupStyle] для [ChipGroupStyles]
 */
@Composable
public fun ChipGroupStyles.style(modifyAction: @Composable ChipGroupStyleBuilder.() -> Unit = {}): ChipGroupStyle {
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
    return builder.modify(modifyAction).style()
}
