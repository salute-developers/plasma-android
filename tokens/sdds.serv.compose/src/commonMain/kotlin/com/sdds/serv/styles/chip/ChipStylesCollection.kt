// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.chip

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
    ChipLAccent("Chip.L.Accent"),
    ChipLNegative("Chip.L.Negative"),
    ChipLPositive("Chip.L.Positive"),
    ChipLSecondary("Chip.L.Secondary"),
    ChipLWarning("Chip.L.Warning"),
    ChipLPilledDefault("Chip.L.Pilled.Default"),
    ChipLPilledAccent("Chip.L.Pilled.Accent"),
    ChipLPilledNegative("Chip.L.Pilled.Negative"),
    ChipLPilledPositive("Chip.L.Pilled.Positive"),
    ChipLPilledSecondary("Chip.L.Pilled.Secondary"),
    ChipLPilledWarning("Chip.L.Pilled.Warning"),
    ChipMDefault("Chip.M.Default"),
    ChipMAccent("Chip.M.Accent"),
    ChipMNegative("Chip.M.Negative"),
    ChipMPositive("Chip.M.Positive"),
    ChipMSecondary("Chip.M.Secondary"),
    ChipMWarning("Chip.M.Warning"),
    ChipMPilledDefault("Chip.M.Pilled.Default"),
    ChipMPilledAccent("Chip.M.Pilled.Accent"),
    ChipMPilledNegative("Chip.M.Pilled.Negative"),
    ChipMPilledPositive("Chip.M.Pilled.Positive"),
    ChipMPilledSecondary("Chip.M.Pilled.Secondary"),
    ChipMPilledWarning("Chip.M.Pilled.Warning"),
    ChipSDefault("Chip.S.Default"),
    ChipSAccent("Chip.S.Accent"),
    ChipSNegative("Chip.S.Negative"),
    ChipSPositive("Chip.S.Positive"),
    ChipSSecondary("Chip.S.Secondary"),
    ChipSWarning("Chip.S.Warning"),
    ChipSPilledDefault("Chip.S.Pilled.Default"),
    ChipSPilledAccent("Chip.S.Pilled.Accent"),
    ChipSPilledNegative("Chip.S.Pilled.Negative"),
    ChipSPilledPositive("Chip.S.Pilled.Positive"),
    ChipSPilledSecondary("Chip.S.Pilled.Secondary"),
    ChipSPilledWarning("Chip.S.Pilled.Warning"),
    ChipXsDefault("Chip.Xs.Default"),
    ChipXsAccent("Chip.Xs.Accent"),
    ChipXsNegative("Chip.Xs.Negative"),
    ChipXsPositive("Chip.Xs.Positive"),
    ChipXsSecondary("Chip.Xs.Secondary"),
    ChipXsWarning("Chip.Xs.Warning"),
    ChipXsPilledDefault("Chip.Xs.Pilled.Default"),
    ChipXsPilledAccent("Chip.Xs.Pilled.Accent"),
    ChipXsPilledNegative("Chip.Xs.Pilled.Negative"),
    ChipXsPilledPositive("Chip.Xs.Pilled.Positive"),
    ChipXsPilledSecondary("Chip.Xs.Pilled.Secondary"),
    ChipXsPilledWarning("Chip.Xs.Pilled.Warning"),
    EmbeddedChipXlDefault("EmbeddedChip.Xl.Default"),
    EmbeddedChipXlAccent("EmbeddedChip.Xl.Accent"),
    EmbeddedChipXlNegative("EmbeddedChip.Xl.Negative"),
    EmbeddedChipXlPositive("EmbeddedChip.Xl.Positive"),
    EmbeddedChipXlSecondary("EmbeddedChip.Xl.Secondary"),
    EmbeddedChipXlWarning("EmbeddedChip.Xl.Warning"),
    EmbeddedChipLDefault("EmbeddedChip.L.Default"),
    EmbeddedChipLAccent("EmbeddedChip.L.Accent"),
    EmbeddedChipLNegative("EmbeddedChip.L.Negative"),
    EmbeddedChipLPositive("EmbeddedChip.L.Positive"),
    EmbeddedChipLSecondary("EmbeddedChip.L.Secondary"),
    EmbeddedChipLWarning("EmbeddedChip.L.Warning"),
    EmbeddedChipMDefault("EmbeddedChip.M.Default"),
    EmbeddedChipMAccent("EmbeddedChip.M.Accent"),
    EmbeddedChipMNegative("EmbeddedChip.M.Negative"),
    EmbeddedChipMPositive("EmbeddedChip.M.Positive"),
    EmbeddedChipMSecondary("EmbeddedChip.M.Secondary"),
    EmbeddedChipMWarning("EmbeddedChip.M.Warning"),
    EmbeddedChipSDefault("EmbeddedChip.S.Default"),
    EmbeddedChipSAccent("EmbeddedChip.S.Accent"),
    EmbeddedChipSNegative("EmbeddedChip.S.Negative"),
    EmbeddedChipSPositive("EmbeddedChip.S.Positive"),
    EmbeddedChipSSecondary("EmbeddedChip.S.Secondary"),
    EmbeddedChipSWarning("EmbeddedChip.S.Warning"),
    EmbeddedChipXsDefault("EmbeddedChip.Xs.Default"),
    EmbeddedChipXsAccent("EmbeddedChip.Xs.Accent"),
    EmbeddedChipXsNegative("EmbeddedChip.Xs.Negative"),
    EmbeddedChipXsPositive("EmbeddedChip.Xs.Positive"),
    EmbeddedChipXsSecondary("EmbeddedChip.Xs.Secondary"),
    EmbeddedChipXsWarning("EmbeddedChip.Xs.Warning"),
    ;

    /**
     * Typed API для подбора стиля chip
     */
    public object Default

    /**
     * Typed API для подбора стиля embedded-chip
     */
    public object EmbeddedChip
}

/**
 * Возможные значения свойства size для chip
 */
public enum class ChipDefaultSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для chip
 */
public enum class ChipDefaultShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для chip
 */
public enum class ChipDefaultView {
    Default,
    Accent,
    Negative,
    Positive,
    Secondary,
    Warning,
}

/**
 * Возможные значения свойства size для embedded-chip
 */
public enum class EmbeddedChipSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для embedded-chip
 */
public enum class EmbeddedChipView {
    Default,
    Accent,
    Negative,
    Positive,
    Secondary,
    Warning,
}

/**
 * Возвращает [ChipStyle] для [ChipStyles]
 */
@Composable
public fun ChipStyles.style(modify: @Composable ChipStyleBuilder.() -> Unit = {}): ChipStyle {
    val builder = when (this) {
        ChipStyles.ChipLDefault -> Chip.L.Default
        ChipStyles.ChipLAccent -> Chip.L.Accent
        ChipStyles.ChipLNegative -> Chip.L.Negative
        ChipStyles.ChipLPositive -> Chip.L.Positive
        ChipStyles.ChipLSecondary -> Chip.L.Secondary
        ChipStyles.ChipLWarning -> Chip.L.Warning
        ChipStyles.ChipLPilledDefault -> Chip.L.Pilled.Default
        ChipStyles.ChipLPilledAccent -> Chip.L.Pilled.Accent
        ChipStyles.ChipLPilledNegative -> Chip.L.Pilled.Negative
        ChipStyles.ChipLPilledPositive -> Chip.L.Pilled.Positive
        ChipStyles.ChipLPilledSecondary -> Chip.L.Pilled.Secondary
        ChipStyles.ChipLPilledWarning -> Chip.L.Pilled.Warning
        ChipStyles.ChipMDefault -> Chip.M.Default
        ChipStyles.ChipMAccent -> Chip.M.Accent
        ChipStyles.ChipMNegative -> Chip.M.Negative
        ChipStyles.ChipMPositive -> Chip.M.Positive
        ChipStyles.ChipMSecondary -> Chip.M.Secondary
        ChipStyles.ChipMWarning -> Chip.M.Warning
        ChipStyles.ChipMPilledDefault -> Chip.M.Pilled.Default
        ChipStyles.ChipMPilledAccent -> Chip.M.Pilled.Accent
        ChipStyles.ChipMPilledNegative -> Chip.M.Pilled.Negative
        ChipStyles.ChipMPilledPositive -> Chip.M.Pilled.Positive
        ChipStyles.ChipMPilledSecondary -> Chip.M.Pilled.Secondary
        ChipStyles.ChipMPilledWarning -> Chip.M.Pilled.Warning
        ChipStyles.ChipSDefault -> Chip.S.Default
        ChipStyles.ChipSAccent -> Chip.S.Accent
        ChipStyles.ChipSNegative -> Chip.S.Negative
        ChipStyles.ChipSPositive -> Chip.S.Positive
        ChipStyles.ChipSSecondary -> Chip.S.Secondary
        ChipStyles.ChipSWarning -> Chip.S.Warning
        ChipStyles.ChipSPilledDefault -> Chip.S.Pilled.Default
        ChipStyles.ChipSPilledAccent -> Chip.S.Pilled.Accent
        ChipStyles.ChipSPilledNegative -> Chip.S.Pilled.Negative
        ChipStyles.ChipSPilledPositive -> Chip.S.Pilled.Positive
        ChipStyles.ChipSPilledSecondary -> Chip.S.Pilled.Secondary
        ChipStyles.ChipSPilledWarning -> Chip.S.Pilled.Warning
        ChipStyles.ChipXsDefault -> Chip.Xs.Default
        ChipStyles.ChipXsAccent -> Chip.Xs.Accent
        ChipStyles.ChipXsNegative -> Chip.Xs.Negative
        ChipStyles.ChipXsPositive -> Chip.Xs.Positive
        ChipStyles.ChipXsSecondary -> Chip.Xs.Secondary
        ChipStyles.ChipXsWarning -> Chip.Xs.Warning
        ChipStyles.ChipXsPilledDefault -> Chip.Xs.Pilled.Default
        ChipStyles.ChipXsPilledAccent -> Chip.Xs.Pilled.Accent
        ChipStyles.ChipXsPilledNegative -> Chip.Xs.Pilled.Negative
        ChipStyles.ChipXsPilledPositive -> Chip.Xs.Pilled.Positive
        ChipStyles.ChipXsPilledSecondary -> Chip.Xs.Pilled.Secondary
        ChipStyles.ChipXsPilledWarning -> Chip.Xs.Pilled.Warning
        ChipStyles.EmbeddedChipXlDefault -> EmbeddedChip.Xl.Default
        ChipStyles.EmbeddedChipXlAccent -> EmbeddedChip.Xl.Accent
        ChipStyles.EmbeddedChipXlNegative -> EmbeddedChip.Xl.Negative
        ChipStyles.EmbeddedChipXlPositive -> EmbeddedChip.Xl.Positive
        ChipStyles.EmbeddedChipXlSecondary -> EmbeddedChip.Xl.Secondary
        ChipStyles.EmbeddedChipXlWarning -> EmbeddedChip.Xl.Warning
        ChipStyles.EmbeddedChipLDefault -> EmbeddedChip.L.Default
        ChipStyles.EmbeddedChipLAccent -> EmbeddedChip.L.Accent
        ChipStyles.EmbeddedChipLNegative -> EmbeddedChip.L.Negative
        ChipStyles.EmbeddedChipLPositive -> EmbeddedChip.L.Positive
        ChipStyles.EmbeddedChipLSecondary -> EmbeddedChip.L.Secondary
        ChipStyles.EmbeddedChipLWarning -> EmbeddedChip.L.Warning
        ChipStyles.EmbeddedChipMDefault -> EmbeddedChip.M.Default
        ChipStyles.EmbeddedChipMAccent -> EmbeddedChip.M.Accent
        ChipStyles.EmbeddedChipMNegative -> EmbeddedChip.M.Negative
        ChipStyles.EmbeddedChipMPositive -> EmbeddedChip.M.Positive
        ChipStyles.EmbeddedChipMSecondary -> EmbeddedChip.M.Secondary
        ChipStyles.EmbeddedChipMWarning -> EmbeddedChip.M.Warning
        ChipStyles.EmbeddedChipSDefault -> EmbeddedChip.S.Default
        ChipStyles.EmbeddedChipSAccent -> EmbeddedChip.S.Accent
        ChipStyles.EmbeddedChipSNegative -> EmbeddedChip.S.Negative
        ChipStyles.EmbeddedChipSPositive -> EmbeddedChip.S.Positive
        ChipStyles.EmbeddedChipSSecondary -> EmbeddedChip.S.Secondary
        ChipStyles.EmbeddedChipSWarning -> EmbeddedChip.S.Warning
        ChipStyles.EmbeddedChipXsDefault -> EmbeddedChip.Xs.Default
        ChipStyles.EmbeddedChipXsAccent -> EmbeddedChip.Xs.Accent
        ChipStyles.EmbeddedChipXsNegative -> EmbeddedChip.Xs.Negative
        ChipStyles.EmbeddedChipXsPositive -> EmbeddedChip.Xs.Positive
        ChipStyles.EmbeddedChipXsSecondary -> EmbeddedChip.Xs.Secondary
        ChipStyles.EmbeddedChipXsWarning -> EmbeddedChip.Xs.Warning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ChipStyles] для chip
 */
public fun ChipStyles.Default.resolve(
    size: ChipDefaultSize = ChipDefaultSize.L,
    shape: ChipDefaultShape = ChipDefaultShape.Default,
    view: ChipDefaultView = ChipDefaultView.Default,
): ChipStyles = when {
    size == ChipDefaultSize.L && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Default -> ChipStyles.ChipLPilledDefault
    size == ChipDefaultSize.L && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Accent -> ChipStyles.ChipLPilledAccent
    size == ChipDefaultSize.L && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Negative -> ChipStyles.ChipLPilledNegative
    size == ChipDefaultSize.L && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Positive -> ChipStyles.ChipLPilledPositive
    size == ChipDefaultSize.L && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Secondary -> ChipStyles.ChipLPilledSecondary
    size == ChipDefaultSize.L && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Warning -> ChipStyles.ChipLPilledWarning
    size == ChipDefaultSize.M && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Default -> ChipStyles.ChipMPilledDefault
    size == ChipDefaultSize.M && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Accent -> ChipStyles.ChipMPilledAccent
    size == ChipDefaultSize.M && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Negative -> ChipStyles.ChipMPilledNegative
    size == ChipDefaultSize.M && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Positive -> ChipStyles.ChipMPilledPositive
    size == ChipDefaultSize.M && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Secondary -> ChipStyles.ChipMPilledSecondary
    size == ChipDefaultSize.M && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Warning -> ChipStyles.ChipMPilledWarning
    size == ChipDefaultSize.S && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Default -> ChipStyles.ChipSPilledDefault
    size == ChipDefaultSize.S && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Accent -> ChipStyles.ChipSPilledAccent
    size == ChipDefaultSize.S && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Negative -> ChipStyles.ChipSPilledNegative
    size == ChipDefaultSize.S && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Positive -> ChipStyles.ChipSPilledPositive
    size == ChipDefaultSize.S && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Secondary -> ChipStyles.ChipSPilledSecondary
    size == ChipDefaultSize.S && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Warning -> ChipStyles.ChipSPilledWarning
    size == ChipDefaultSize.Xs && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Default -> ChipStyles.ChipXsPilledDefault
    size == ChipDefaultSize.Xs && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Accent -> ChipStyles.ChipXsPilledAccent
    size == ChipDefaultSize.Xs && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Negative -> ChipStyles.ChipXsPilledNegative
    size == ChipDefaultSize.Xs && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Positive -> ChipStyles.ChipXsPilledPositive
    size == ChipDefaultSize.Xs && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Secondary -> ChipStyles.ChipXsPilledSecondary
    size == ChipDefaultSize.Xs && shape == ChipDefaultShape.Pilled && view ==
        ChipDefaultView.Warning -> ChipStyles.ChipXsPilledWarning
    size == ChipDefaultSize.L && view == ChipDefaultView.Default -> ChipStyles.ChipLDefault
    size == ChipDefaultSize.L && view == ChipDefaultView.Accent -> ChipStyles.ChipLAccent
    size == ChipDefaultSize.L && view == ChipDefaultView.Negative -> ChipStyles.ChipLNegative
    size == ChipDefaultSize.L && view == ChipDefaultView.Positive -> ChipStyles.ChipLPositive
    size == ChipDefaultSize.L && view == ChipDefaultView.Secondary -> ChipStyles.ChipLSecondary
    size == ChipDefaultSize.L && view == ChipDefaultView.Warning -> ChipStyles.ChipLWarning
    size == ChipDefaultSize.M && view == ChipDefaultView.Default -> ChipStyles.ChipMDefault
    size == ChipDefaultSize.M && view == ChipDefaultView.Accent -> ChipStyles.ChipMAccent
    size == ChipDefaultSize.M && view == ChipDefaultView.Negative -> ChipStyles.ChipMNegative
    size == ChipDefaultSize.M && view == ChipDefaultView.Positive -> ChipStyles.ChipMPositive
    size == ChipDefaultSize.M && view == ChipDefaultView.Secondary -> ChipStyles.ChipMSecondary
    size == ChipDefaultSize.M && view == ChipDefaultView.Warning -> ChipStyles.ChipMWarning
    size == ChipDefaultSize.S && view == ChipDefaultView.Default -> ChipStyles.ChipSDefault
    size == ChipDefaultSize.S && view == ChipDefaultView.Accent -> ChipStyles.ChipSAccent
    size == ChipDefaultSize.S && view == ChipDefaultView.Negative -> ChipStyles.ChipSNegative
    size == ChipDefaultSize.S && view == ChipDefaultView.Positive -> ChipStyles.ChipSPositive
    size == ChipDefaultSize.S && view == ChipDefaultView.Secondary -> ChipStyles.ChipSSecondary
    size == ChipDefaultSize.S && view == ChipDefaultView.Warning -> ChipStyles.ChipSWarning
    size == ChipDefaultSize.Xs && view == ChipDefaultView.Default -> ChipStyles.ChipXsDefault
    size == ChipDefaultSize.Xs && view == ChipDefaultView.Accent -> ChipStyles.ChipXsAccent
    size == ChipDefaultSize.Xs && view == ChipDefaultView.Negative -> ChipStyles.ChipXsNegative
    size == ChipDefaultSize.Xs && view == ChipDefaultView.Positive -> ChipStyles.ChipXsPositive
    size == ChipDefaultSize.Xs && view == ChipDefaultView.Secondary -> ChipStyles.ChipXsSecondary
    size == ChipDefaultSize.Xs && view == ChipDefaultView.Warning -> ChipStyles.ChipXsWarning
    else -> error("Unsupported chip style combination")
}

/**
 * Возвращает [ChipStyle] для chip
 */
@Composable
public fun ChipStyles.Default.style(
    size: ChipDefaultSize = ChipDefaultSize.L,
    shape: ChipDefaultShape = ChipDefaultShape.Default,
    view: ChipDefaultView = ChipDefaultView.Default,
    modify: @Composable ChipStyleBuilder.() -> Unit = {},
): ChipStyle = resolve(size, shape, view).style(modify)

/**
 * Возвращает экземпляр [ChipStyles] для embedded-chip
 */
public fun ChipStyles.EmbeddedChip.resolve(
    size: EmbeddedChipSize = EmbeddedChipSize.Xl,
    view: EmbeddedChipView = EmbeddedChipView.Default,
): ChipStyles = when {
    size == EmbeddedChipSize.Xl && view == EmbeddedChipView.Default ->
        ChipStyles.EmbeddedChipXlDefault
    size == EmbeddedChipSize.Xl && view == EmbeddedChipView.Accent ->
        ChipStyles.EmbeddedChipXlAccent
    size == EmbeddedChipSize.Xl && view == EmbeddedChipView.Negative ->
        ChipStyles.EmbeddedChipXlNegative
    size == EmbeddedChipSize.Xl && view == EmbeddedChipView.Positive ->
        ChipStyles.EmbeddedChipXlPositive
    size == EmbeddedChipSize.Xl && view == EmbeddedChipView.Secondary ->
        ChipStyles.EmbeddedChipXlSecondary
    size == EmbeddedChipSize.Xl && view == EmbeddedChipView.Warning ->
        ChipStyles.EmbeddedChipXlWarning
    size == EmbeddedChipSize.L && view == EmbeddedChipView.Default ->
        ChipStyles.EmbeddedChipLDefault
    size == EmbeddedChipSize.L && view == EmbeddedChipView.Accent -> ChipStyles.EmbeddedChipLAccent
    size == EmbeddedChipSize.L && view == EmbeddedChipView.Negative ->
        ChipStyles.EmbeddedChipLNegative
    size == EmbeddedChipSize.L && view == EmbeddedChipView.Positive ->
        ChipStyles.EmbeddedChipLPositive
    size == EmbeddedChipSize.L && view == EmbeddedChipView.Secondary ->
        ChipStyles.EmbeddedChipLSecondary
    size == EmbeddedChipSize.L && view == EmbeddedChipView.Warning ->
        ChipStyles.EmbeddedChipLWarning
    size == EmbeddedChipSize.M && view == EmbeddedChipView.Default ->
        ChipStyles.EmbeddedChipMDefault
    size == EmbeddedChipSize.M && view == EmbeddedChipView.Accent -> ChipStyles.EmbeddedChipMAccent
    size == EmbeddedChipSize.M && view == EmbeddedChipView.Negative ->
        ChipStyles.EmbeddedChipMNegative
    size == EmbeddedChipSize.M && view == EmbeddedChipView.Positive ->
        ChipStyles.EmbeddedChipMPositive
    size == EmbeddedChipSize.M && view == EmbeddedChipView.Secondary ->
        ChipStyles.EmbeddedChipMSecondary
    size == EmbeddedChipSize.M && view == EmbeddedChipView.Warning ->
        ChipStyles.EmbeddedChipMWarning
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Default ->
        ChipStyles.EmbeddedChipSDefault
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Accent -> ChipStyles.EmbeddedChipSAccent
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Negative ->
        ChipStyles.EmbeddedChipSNegative
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Positive ->
        ChipStyles.EmbeddedChipSPositive
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Secondary ->
        ChipStyles.EmbeddedChipSSecondary
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Warning ->
        ChipStyles.EmbeddedChipSWarning
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Default ->
        ChipStyles.EmbeddedChipXsDefault
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Accent ->
        ChipStyles.EmbeddedChipXsAccent
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Negative ->
        ChipStyles.EmbeddedChipXsNegative
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Positive ->
        ChipStyles.EmbeddedChipXsPositive
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Secondary ->
        ChipStyles.EmbeddedChipXsSecondary
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Warning ->
        ChipStyles.EmbeddedChipXsWarning
    else -> error("Unsupported embedded-chip style combination")
}

/**
 * Возвращает [ChipStyle] для embedded-chip
 */
@Composable
public fun ChipStyles.EmbeddedChip.style(
    size: EmbeddedChipSize = EmbeddedChipSize.Xl,
    view: EmbeddedChipView = EmbeddedChipView.Default,
    modify: @Composable ChipStyleBuilder.() -> Unit = {},
): ChipStyle = resolve(size, view).style(modify)
