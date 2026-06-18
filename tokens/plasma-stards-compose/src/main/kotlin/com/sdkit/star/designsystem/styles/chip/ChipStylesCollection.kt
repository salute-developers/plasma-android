// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.chip

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
    ;

    /**
     * Typed API для подбора стиля chip
     */
    public companion object
}

/**
 * Возможные значения свойства size для chip
 */
public enum class ChipSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для chip
 */
public enum class ChipShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для chip
 */
public enum class ChipView {
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
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ChipStyles] для chip
 */
public fun ChipStyles.Companion.resolve(
    size: ChipSize = ChipSize.L,
    shape: ChipShape = ChipShape.Default,
    view: ChipView = ChipView.Default,
): ChipStyles = when {
    size == ChipSize.L && shape == ChipShape.Pilled && view == ChipView.Default ->
        ChipStyles.ChipLPilledDefault
    size == ChipSize.L && shape == ChipShape.Pilled && view == ChipView.Accent ->
        ChipStyles.ChipLPilledAccent
    size == ChipSize.L && shape == ChipShape.Pilled && view == ChipView.Negative ->
        ChipStyles.ChipLPilledNegative
    size == ChipSize.L && shape == ChipShape.Pilled && view == ChipView.Positive ->
        ChipStyles.ChipLPilledPositive
    size == ChipSize.L && shape == ChipShape.Pilled && view == ChipView.Secondary ->
        ChipStyles.ChipLPilledSecondary
    size == ChipSize.L && shape == ChipShape.Pilled && view == ChipView.Warning ->
        ChipStyles.ChipLPilledWarning
    size == ChipSize.M && shape == ChipShape.Pilled && view == ChipView.Default ->
        ChipStyles.ChipMPilledDefault
    size == ChipSize.M && shape == ChipShape.Pilled && view == ChipView.Accent ->
        ChipStyles.ChipMPilledAccent
    size == ChipSize.M && shape == ChipShape.Pilled && view == ChipView.Negative ->
        ChipStyles.ChipMPilledNegative
    size == ChipSize.M && shape == ChipShape.Pilled && view == ChipView.Positive ->
        ChipStyles.ChipMPilledPositive
    size == ChipSize.M && shape == ChipShape.Pilled && view == ChipView.Secondary ->
        ChipStyles.ChipMPilledSecondary
    size == ChipSize.M && shape == ChipShape.Pilled && view == ChipView.Warning ->
        ChipStyles.ChipMPilledWarning
    size == ChipSize.S && shape == ChipShape.Pilled && view == ChipView.Default ->
        ChipStyles.ChipSPilledDefault
    size == ChipSize.S && shape == ChipShape.Pilled && view == ChipView.Accent ->
        ChipStyles.ChipSPilledAccent
    size == ChipSize.S && shape == ChipShape.Pilled && view == ChipView.Negative ->
        ChipStyles.ChipSPilledNegative
    size == ChipSize.S && shape == ChipShape.Pilled && view == ChipView.Positive ->
        ChipStyles.ChipSPilledPositive
    size == ChipSize.S && shape == ChipShape.Pilled && view == ChipView.Secondary ->
        ChipStyles.ChipSPilledSecondary
    size == ChipSize.S && shape == ChipShape.Pilled && view == ChipView.Warning ->
        ChipStyles.ChipSPilledWarning
    size == ChipSize.Xs && shape == ChipShape.Pilled && view == ChipView.Default ->
        ChipStyles.ChipXsPilledDefault
    size == ChipSize.Xs && shape == ChipShape.Pilled && view == ChipView.Accent ->
        ChipStyles.ChipXsPilledAccent
    size == ChipSize.Xs && shape == ChipShape.Pilled && view == ChipView.Negative ->
        ChipStyles.ChipXsPilledNegative
    size == ChipSize.Xs && shape == ChipShape.Pilled && view == ChipView.Positive ->
        ChipStyles.ChipXsPilledPositive
    size == ChipSize.Xs && shape == ChipShape.Pilled && view == ChipView.Secondary ->
        ChipStyles.ChipXsPilledSecondary
    size == ChipSize.Xs && shape == ChipShape.Pilled && view == ChipView.Warning ->
        ChipStyles.ChipXsPilledWarning
    size == ChipSize.L && view == ChipView.Default -> ChipStyles.ChipLDefault
    size == ChipSize.L && view == ChipView.Accent -> ChipStyles.ChipLAccent
    size == ChipSize.L && view == ChipView.Negative -> ChipStyles.ChipLNegative
    size == ChipSize.L && view == ChipView.Positive -> ChipStyles.ChipLPositive
    size == ChipSize.L && view == ChipView.Secondary -> ChipStyles.ChipLSecondary
    size == ChipSize.L && view == ChipView.Warning -> ChipStyles.ChipLWarning
    size == ChipSize.M && view == ChipView.Default -> ChipStyles.ChipMDefault
    size == ChipSize.M && view == ChipView.Accent -> ChipStyles.ChipMAccent
    size == ChipSize.M && view == ChipView.Negative -> ChipStyles.ChipMNegative
    size == ChipSize.M && view == ChipView.Positive -> ChipStyles.ChipMPositive
    size == ChipSize.M && view == ChipView.Secondary -> ChipStyles.ChipMSecondary
    size == ChipSize.M && view == ChipView.Warning -> ChipStyles.ChipMWarning
    size == ChipSize.S && view == ChipView.Default -> ChipStyles.ChipSDefault
    size == ChipSize.S && view == ChipView.Accent -> ChipStyles.ChipSAccent
    size == ChipSize.S && view == ChipView.Negative -> ChipStyles.ChipSNegative
    size == ChipSize.S && view == ChipView.Positive -> ChipStyles.ChipSPositive
    size == ChipSize.S && view == ChipView.Secondary -> ChipStyles.ChipSSecondary
    size == ChipSize.S && view == ChipView.Warning -> ChipStyles.ChipSWarning
    size == ChipSize.Xs && view == ChipView.Default -> ChipStyles.ChipXsDefault
    size == ChipSize.Xs && view == ChipView.Accent -> ChipStyles.ChipXsAccent
    size == ChipSize.Xs && view == ChipView.Negative -> ChipStyles.ChipXsNegative
    size == ChipSize.Xs && view == ChipView.Positive -> ChipStyles.ChipXsPositive
    size == ChipSize.Xs && view == ChipView.Secondary -> ChipStyles.ChipXsSecondary
    size == ChipSize.Xs && view == ChipView.Warning -> ChipStyles.ChipXsWarning
    else -> error("Unsupported chip style combination")
}

/**
 * Возвращает [ChipStyle] для chip
 */
@Composable
public fun ChipStyles.Companion.style(
    size: ChipSize = ChipSize.L,
    shape: ChipShape = ChipShape.Default,
    view: ChipView = ChipView.Default,
    modify: @Composable ChipStyleBuilder.() -> Unit = {},
): ChipStyle = resolve(size, shape, view).style(modify)
