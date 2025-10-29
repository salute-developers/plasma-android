// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.chip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Chip
 */
public enum class ChipStyles(
    public val key: String,
) {
    ChipLDefault("Chip.L.Default"),
    ChipLSecondary("Chip.L.Secondary"),
    ChipLPilledDefault("Chip.L.Pilled.Default"),
    ChipLPilledSecondary("Chip.L.Pilled.Secondary"),
    ChipMDefault("Chip.M.Default"),
    ChipMSecondary("Chip.M.Secondary"),
    ChipMPilledDefault("Chip.M.Pilled.Default"),
    ChipMPilledSecondary("Chip.M.Pilled.Secondary"),
    ChipSDefault("Chip.S.Default"),
    ChipSSecondary("Chip.S.Secondary"),
    ChipSPilledDefault("Chip.S.Pilled.Default"),
    ChipSPilledSecondary("Chip.S.Pilled.Secondary"),
    ChipXsDefault("Chip.Xs.Default"),
    ChipXsSecondary("Chip.Xs.Secondary"),
    ChipXsPilledDefault("Chip.Xs.Pilled.Default"),
    ChipXsPilledSecondary("Chip.Xs.Pilled.Secondary"),
    ChipXxsDefault("Chip.Xxs.Default"),
    ChipXxsSecondary("Chip.Xxs.Secondary"),
    ChipXxsPilledDefault("Chip.Xxs.Pilled.Default"),
    ChipXxsPilledSecondary("Chip.Xxs.Pilled.Secondary"),
}

/**
 * Возвращает [ChipStyle] для [ChipStyles]
 */
@Composable
public fun ChipStyles.style(modifyAction: @Composable ChipStyleBuilder.() -> Unit = {}): ChipStyle {
    val builder = when (this) {
        ChipStyles.ChipLDefault -> Chip.L.Default
        ChipStyles.ChipLSecondary -> Chip.L.Secondary
        ChipStyles.ChipLPilledDefault -> Chip.L.Pilled.Default
        ChipStyles.ChipLPilledSecondary -> Chip.L.Pilled.Secondary
        ChipStyles.ChipMDefault -> Chip.M.Default
        ChipStyles.ChipMSecondary -> Chip.M.Secondary
        ChipStyles.ChipMPilledDefault -> Chip.M.Pilled.Default
        ChipStyles.ChipMPilledSecondary -> Chip.M.Pilled.Secondary
        ChipStyles.ChipSDefault -> Chip.S.Default
        ChipStyles.ChipSSecondary -> Chip.S.Secondary
        ChipStyles.ChipSPilledDefault -> Chip.S.Pilled.Default
        ChipStyles.ChipSPilledSecondary -> Chip.S.Pilled.Secondary
        ChipStyles.ChipXsDefault -> Chip.Xs.Default
        ChipStyles.ChipXsSecondary -> Chip.Xs.Secondary
        ChipStyles.ChipXsPilledDefault -> Chip.Xs.Pilled.Default
        ChipStyles.ChipXsPilledSecondary -> Chip.Xs.Pilled.Secondary
        ChipStyles.ChipXxsDefault -> Chip.Xxs.Default
        ChipStyles.ChipXxsSecondary -> Chip.Xxs.Secondary
        ChipStyles.ChipXxsPilledDefault -> Chip.Xxs.Pilled.Default
        ChipStyles.ChipXxsPilledSecondary -> Chip.Xxs.Pilled.Secondary
    }
    return builder.modify(modifyAction).style()
}
