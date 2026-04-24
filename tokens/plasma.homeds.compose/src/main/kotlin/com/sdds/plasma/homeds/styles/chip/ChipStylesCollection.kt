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
    Xxs,
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
    Secondary,
}

/**
 * Возвращает [ChipStyle] для [ChipStyles]
 */
@Composable
public fun ChipStyles.style(modify: @Composable ChipStyleBuilder.() -> Unit = {}): ChipStyle {
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
    size == ChipSize.L && shape == ChipShape.Pilled && view == ChipView.Secondary ->
        ChipStyles.ChipLPilledSecondary
    size == ChipSize.M && shape == ChipShape.Pilled && view == ChipView.Default ->
        ChipStyles.ChipMPilledDefault
    size == ChipSize.M && shape == ChipShape.Pilled && view == ChipView.Secondary ->
        ChipStyles.ChipMPilledSecondary
    size == ChipSize.S && shape == ChipShape.Pilled && view == ChipView.Default ->
        ChipStyles.ChipSPilledDefault
    size == ChipSize.S && shape == ChipShape.Pilled && view == ChipView.Secondary ->
        ChipStyles.ChipSPilledSecondary
    size == ChipSize.Xs && shape == ChipShape.Pilled && view == ChipView.Default ->
        ChipStyles.ChipXsPilledDefault
    size == ChipSize.Xs && shape == ChipShape.Pilled && view == ChipView.Secondary ->
        ChipStyles.ChipXsPilledSecondary
    size == ChipSize.Xxs && shape == ChipShape.Pilled && view == ChipView.Default ->
        ChipStyles.ChipXxsPilledDefault
    size == ChipSize.Xxs && shape == ChipShape.Pilled && view == ChipView.Secondary ->
        ChipStyles.ChipXxsPilledSecondary
    size == ChipSize.L && view == ChipView.Default -> ChipStyles.ChipLDefault
    size == ChipSize.L && view == ChipView.Secondary -> ChipStyles.ChipLSecondary
    size == ChipSize.M && view == ChipView.Default -> ChipStyles.ChipMDefault
    size == ChipSize.M && view == ChipView.Secondary -> ChipStyles.ChipMSecondary
    size == ChipSize.S && view == ChipView.Default -> ChipStyles.ChipSDefault
    size == ChipSize.S && view == ChipView.Secondary -> ChipStyles.ChipSSecondary
    size == ChipSize.Xs && view == ChipView.Default -> ChipStyles.ChipXsDefault
    size == ChipSize.Xs && view == ChipView.Secondary -> ChipStyles.ChipXsSecondary
    size == ChipSize.Xxs && view == ChipView.Default -> ChipStyles.ChipXxsDefault
    size == ChipSize.Xxs && view == ChipView.Secondary -> ChipStyles.ChipXxsSecondary
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
