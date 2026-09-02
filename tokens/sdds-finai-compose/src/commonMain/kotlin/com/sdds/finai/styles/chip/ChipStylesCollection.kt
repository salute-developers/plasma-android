// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.finai.styles.chip

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
    ChipSolidMDefault("ChipSolid.M.Default"),
    ChipSolidMAccent("ChipSolid.M.Accent"),
    ChipSolidMNegative("ChipSolid.M.Negative"),
    ChipSolidMPositive("ChipSolid.M.Positive"),
    ChipSolidMWarning("ChipSolid.M.Warning"),
    ChipSolidMClear("ChipSolid.M.Clear"),
    ChipSolidMPilledDefault("ChipSolid.M.Pilled.Default"),
    ChipSolidMPilledAccent("ChipSolid.M.Pilled.Accent"),
    ChipSolidMPilledNegative("ChipSolid.M.Pilled.Negative"),
    ChipSolidMPilledPositive("ChipSolid.M.Pilled.Positive"),
    ChipSolidMPilledWarning("ChipSolid.M.Pilled.Warning"),
    ChipSolidMPilledClear("ChipSolid.M.Pilled.Clear"),
    ChipSolidSDefault("ChipSolid.S.Default"),
    ChipSolidSAccent("ChipSolid.S.Accent"),
    ChipSolidSNegative("ChipSolid.S.Negative"),
    ChipSolidSPositive("ChipSolid.S.Positive"),
    ChipSolidSWarning("ChipSolid.S.Warning"),
    ChipSolidSClear("ChipSolid.S.Clear"),
    ChipSolidSPilledDefault("ChipSolid.S.Pilled.Default"),
    ChipSolidSPilledAccent("ChipSolid.S.Pilled.Accent"),
    ChipSolidSPilledNegative("ChipSolid.S.Pilled.Negative"),
    ChipSolidSPilledPositive("ChipSolid.S.Pilled.Positive"),
    ChipSolidSPilledWarning("ChipSolid.S.Pilled.Warning"),
    ChipSolidSPilledClear("ChipSolid.S.Pilled.Clear"),
    ChipSolidXsDefault("ChipSolid.Xs.Default"),
    ChipSolidXsAccent("ChipSolid.Xs.Accent"),
    ChipSolidXsNegative("ChipSolid.Xs.Negative"),
    ChipSolidXsPositive("ChipSolid.Xs.Positive"),
    ChipSolidXsWarning("ChipSolid.Xs.Warning"),
    ChipSolidXsClear("ChipSolid.Xs.Clear"),
    ChipSolidXsPilledDefault("ChipSolid.Xs.Pilled.Default"),
    ChipSolidXsPilledAccent("ChipSolid.Xs.Pilled.Accent"),
    ChipSolidXsPilledNegative("ChipSolid.Xs.Pilled.Negative"),
    ChipSolidXsPilledPositive("ChipSolid.Xs.Pilled.Positive"),
    ChipSolidXsPilledWarning("ChipSolid.Xs.Pilled.Warning"),
    ChipSolidXsPilledClear("ChipSolid.Xs.Pilled.Clear"),
    ChipSolidXxsDefault("ChipSolid.Xxs.Default"),
    ChipSolidXxsAccent("ChipSolid.Xxs.Accent"),
    ChipSolidXxsNegative("ChipSolid.Xxs.Negative"),
    ChipSolidXxsPositive("ChipSolid.Xxs.Positive"),
    ChipSolidXxsWarning("ChipSolid.Xxs.Warning"),
    ChipSolidXxsClear("ChipSolid.Xxs.Clear"),
    ChipSolidXxsPilledDefault("ChipSolid.Xxs.Pilled.Default"),
    ChipSolidXxsPilledAccent("ChipSolid.Xxs.Pilled.Accent"),
    ChipSolidXxsPilledNegative("ChipSolid.Xxs.Pilled.Negative"),
    ChipSolidXxsPilledPositive("ChipSolid.Xxs.Pilled.Positive"),
    ChipSolidXxsPilledWarning("ChipSolid.Xxs.Pilled.Warning"),
    ChipSolidXxsPilledClear("ChipSolid.Xxs.Pilled.Clear"),
    ChipTransparentMDefault("ChipTransparent.M.Default"),
    ChipTransparentMAccent("ChipTransparent.M.Accent"),
    ChipTransparentMNegative("ChipTransparent.M.Negative"),
    ChipTransparentMPositive("ChipTransparent.M.Positive"),
    ChipTransparentMWarning("ChipTransparent.M.Warning"),
    ChipTransparentMPilledDefault("ChipTransparent.M.Pilled.Default"),
    ChipTransparentMPilledAccent("ChipTransparent.M.Pilled.Accent"),
    ChipTransparentMPilledNegative("ChipTransparent.M.Pilled.Negative"),
    ChipTransparentMPilledPositive("ChipTransparent.M.Pilled.Positive"),
    ChipTransparentMPilledWarning("ChipTransparent.M.Pilled.Warning"),
    ChipTransparentSDefault("ChipTransparent.S.Default"),
    ChipTransparentSAccent("ChipTransparent.S.Accent"),
    ChipTransparentSNegative("ChipTransparent.S.Negative"),
    ChipTransparentSPositive("ChipTransparent.S.Positive"),
    ChipTransparentSWarning("ChipTransparent.S.Warning"),
    ChipTransparentSPilledDefault("ChipTransparent.S.Pilled.Default"),
    ChipTransparentSPilledAccent("ChipTransparent.S.Pilled.Accent"),
    ChipTransparentSPilledNegative("ChipTransparent.S.Pilled.Negative"),
    ChipTransparentSPilledPositive("ChipTransparent.S.Pilled.Positive"),
    ChipTransparentSPilledWarning("ChipTransparent.S.Pilled.Warning"),
    ChipTransparentXsDefault("ChipTransparent.Xs.Default"),
    ChipTransparentXsAccent("ChipTransparent.Xs.Accent"),
    ChipTransparentXsNegative("ChipTransparent.Xs.Negative"),
    ChipTransparentXsPositive("ChipTransparent.Xs.Positive"),
    ChipTransparentXsWarning("ChipTransparent.Xs.Warning"),
    ChipTransparentXsPilledDefault("ChipTransparent.Xs.Pilled.Default"),
    ChipTransparentXsPilledAccent("ChipTransparent.Xs.Pilled.Accent"),
    ChipTransparentXsPilledNegative("ChipTransparent.Xs.Pilled.Negative"),
    ChipTransparentXsPilledPositive("ChipTransparent.Xs.Pilled.Positive"),
    ChipTransparentXsPilledWarning("ChipTransparent.Xs.Pilled.Warning"),
    ChipTransparentXxsDefault("ChipTransparent.Xxs.Default"),
    ChipTransparentXxsAccent("ChipTransparent.Xxs.Accent"),
    ChipTransparentXxsNegative("ChipTransparent.Xxs.Negative"),
    ChipTransparentXxsPositive("ChipTransparent.Xxs.Positive"),
    ChipTransparentXxsWarning("ChipTransparent.Xxs.Warning"),
    ChipTransparentXxsPilledDefault("ChipTransparent.Xxs.Pilled.Default"),
    ChipTransparentXxsPilledAccent("ChipTransparent.Xxs.Pilled.Accent"),
    ChipTransparentXxsPilledNegative("ChipTransparent.Xxs.Pilled.Negative"),
    ChipTransparentXxsPilledPositive("ChipTransparent.Xxs.Pilled.Positive"),
    ChipTransparentXxsPilledWarning("ChipTransparent.Xxs.Pilled.Warning"),
    EmbeddedChipSDefault("EmbeddedChip.S.Default"),
    EmbeddedChipSSecondary("EmbeddedChip.S.Secondary"),
    EmbeddedChipSAccent("EmbeddedChip.S.Accent"),
    EmbeddedChipSNegative("EmbeddedChip.S.Negative"),
    EmbeddedChipSPositive("EmbeddedChip.S.Positive"),
    EmbeddedChipSWarning("EmbeddedChip.S.Warning"),
    EmbeddedChipXsDefault("EmbeddedChip.Xs.Default"),
    EmbeddedChipXsSecondary("EmbeddedChip.Xs.Secondary"),
    EmbeddedChipXsAccent("EmbeddedChip.Xs.Accent"),
    EmbeddedChipXsNegative("EmbeddedChip.Xs.Negative"),
    EmbeddedChipXsPositive("EmbeddedChip.Xs.Positive"),
    EmbeddedChipXsWarning("EmbeddedChip.Xs.Warning"),
    ;

    /**
     * Typed API для подбора стиля chip-solid
     */
    public object Solid

    /**
     * Typed API для подбора стиля chip-transparent
     */
    public object Transparent

    /**
     * Typed API для подбора стиля embedded-chip
     */
    public object EmbeddedChip
}

/**
 * Возможные значения свойства size для chip-solid
 */
public enum class ChipSolidSize {
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства shape для chip-solid
 */
public enum class ChipSolidShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для chip-solid
 */
public enum class ChipSolidView {
    Default,
    Accent,
    Negative,
    Positive,
    Warning,
    Clear,
}

/**
 * Возможные значения свойства size для chip-transparent
 */
public enum class ChipTransparentSize {
    M,
    S,
    Xs,
    Xxs,
}

/**
 * Возможные значения свойства shape для chip-transparent
 */
public enum class ChipTransparentShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для chip-transparent
 */
public enum class ChipTransparentView {
    Default,
    Accent,
    Negative,
    Positive,
    Warning,
}

/**
 * Возможные значения свойства size для embedded-chip
 */
public enum class EmbeddedChipSize {
    S,
    Xs,
}

/**
 * Возможные значения свойства view для embedded-chip
 */
public enum class EmbeddedChipView {
    Default,
    Secondary,
    Accent,
    Negative,
    Positive,
    Warning,
}

/**
 * Возвращает [ChipStyle] для [ChipStyles]
 */
@Composable
public fun ChipStyles.style(modify: @Composable ChipStyleBuilder.() -> Unit = {}): ChipStyle {
    val builder = when (this) {
        ChipStyles.ChipSolidMDefault -> ChipSolid.M.Default
        ChipStyles.ChipSolidMAccent -> ChipSolid.M.Accent
        ChipStyles.ChipSolidMNegative -> ChipSolid.M.Negative
        ChipStyles.ChipSolidMPositive -> ChipSolid.M.Positive
        ChipStyles.ChipSolidMWarning -> ChipSolid.M.Warning
        ChipStyles.ChipSolidMClear -> ChipSolid.M.Clear
        ChipStyles.ChipSolidMPilledDefault -> ChipSolid.M.Pilled.Default
        ChipStyles.ChipSolidMPilledAccent -> ChipSolid.M.Pilled.Accent
        ChipStyles.ChipSolidMPilledNegative -> ChipSolid.M.Pilled.Negative
        ChipStyles.ChipSolidMPilledPositive -> ChipSolid.M.Pilled.Positive
        ChipStyles.ChipSolidMPilledWarning -> ChipSolid.M.Pilled.Warning
        ChipStyles.ChipSolidMPilledClear -> ChipSolid.M.Pilled.Clear
        ChipStyles.ChipSolidSDefault -> ChipSolid.S.Default
        ChipStyles.ChipSolidSAccent -> ChipSolid.S.Accent
        ChipStyles.ChipSolidSNegative -> ChipSolid.S.Negative
        ChipStyles.ChipSolidSPositive -> ChipSolid.S.Positive
        ChipStyles.ChipSolidSWarning -> ChipSolid.S.Warning
        ChipStyles.ChipSolidSClear -> ChipSolid.S.Clear
        ChipStyles.ChipSolidSPilledDefault -> ChipSolid.S.Pilled.Default
        ChipStyles.ChipSolidSPilledAccent -> ChipSolid.S.Pilled.Accent
        ChipStyles.ChipSolidSPilledNegative -> ChipSolid.S.Pilled.Negative
        ChipStyles.ChipSolidSPilledPositive -> ChipSolid.S.Pilled.Positive
        ChipStyles.ChipSolidSPilledWarning -> ChipSolid.S.Pilled.Warning
        ChipStyles.ChipSolidSPilledClear -> ChipSolid.S.Pilled.Clear
        ChipStyles.ChipSolidXsDefault -> ChipSolid.Xs.Default
        ChipStyles.ChipSolidXsAccent -> ChipSolid.Xs.Accent
        ChipStyles.ChipSolidXsNegative -> ChipSolid.Xs.Negative
        ChipStyles.ChipSolidXsPositive -> ChipSolid.Xs.Positive
        ChipStyles.ChipSolidXsWarning -> ChipSolid.Xs.Warning
        ChipStyles.ChipSolidXsClear -> ChipSolid.Xs.Clear
        ChipStyles.ChipSolidXsPilledDefault -> ChipSolid.Xs.Pilled.Default
        ChipStyles.ChipSolidXsPilledAccent -> ChipSolid.Xs.Pilled.Accent
        ChipStyles.ChipSolidXsPilledNegative -> ChipSolid.Xs.Pilled.Negative
        ChipStyles.ChipSolidXsPilledPositive -> ChipSolid.Xs.Pilled.Positive
        ChipStyles.ChipSolidXsPilledWarning -> ChipSolid.Xs.Pilled.Warning
        ChipStyles.ChipSolidXsPilledClear -> ChipSolid.Xs.Pilled.Clear
        ChipStyles.ChipSolidXxsDefault -> ChipSolid.Xxs.Default
        ChipStyles.ChipSolidXxsAccent -> ChipSolid.Xxs.Accent
        ChipStyles.ChipSolidXxsNegative -> ChipSolid.Xxs.Negative
        ChipStyles.ChipSolidXxsPositive -> ChipSolid.Xxs.Positive
        ChipStyles.ChipSolidXxsWarning -> ChipSolid.Xxs.Warning
        ChipStyles.ChipSolidXxsClear -> ChipSolid.Xxs.Clear
        ChipStyles.ChipSolidXxsPilledDefault -> ChipSolid.Xxs.Pilled.Default
        ChipStyles.ChipSolidXxsPilledAccent -> ChipSolid.Xxs.Pilled.Accent
        ChipStyles.ChipSolidXxsPilledNegative -> ChipSolid.Xxs.Pilled.Negative
        ChipStyles.ChipSolidXxsPilledPositive -> ChipSolid.Xxs.Pilled.Positive
        ChipStyles.ChipSolidXxsPilledWarning -> ChipSolid.Xxs.Pilled.Warning
        ChipStyles.ChipSolidXxsPilledClear -> ChipSolid.Xxs.Pilled.Clear
        ChipStyles.ChipTransparentMDefault -> ChipTransparent.M.Default
        ChipStyles.ChipTransparentMAccent -> ChipTransparent.M.Accent
        ChipStyles.ChipTransparentMNegative -> ChipTransparent.M.Negative
        ChipStyles.ChipTransparentMPositive -> ChipTransparent.M.Positive
        ChipStyles.ChipTransparentMWarning -> ChipTransparent.M.Warning
        ChipStyles.ChipTransparentMPilledDefault -> ChipTransparent.M.Pilled.Default
        ChipStyles.ChipTransparentMPilledAccent -> ChipTransparent.M.Pilled.Accent
        ChipStyles.ChipTransparentMPilledNegative -> ChipTransparent.M.Pilled.Negative
        ChipStyles.ChipTransparentMPilledPositive -> ChipTransparent.M.Pilled.Positive
        ChipStyles.ChipTransparentMPilledWarning -> ChipTransparent.M.Pilled.Warning
        ChipStyles.ChipTransparentSDefault -> ChipTransparent.S.Default
        ChipStyles.ChipTransparentSAccent -> ChipTransparent.S.Accent
        ChipStyles.ChipTransparentSNegative -> ChipTransparent.S.Negative
        ChipStyles.ChipTransparentSPositive -> ChipTransparent.S.Positive
        ChipStyles.ChipTransparentSWarning -> ChipTransparent.S.Warning
        ChipStyles.ChipTransparentSPilledDefault -> ChipTransparent.S.Pilled.Default
        ChipStyles.ChipTransparentSPilledAccent -> ChipTransparent.S.Pilled.Accent
        ChipStyles.ChipTransparentSPilledNegative -> ChipTransparent.S.Pilled.Negative
        ChipStyles.ChipTransparentSPilledPositive -> ChipTransparent.S.Pilled.Positive
        ChipStyles.ChipTransparentSPilledWarning -> ChipTransparent.S.Pilled.Warning
        ChipStyles.ChipTransparentXsDefault -> ChipTransparent.Xs.Default
        ChipStyles.ChipTransparentXsAccent -> ChipTransparent.Xs.Accent
        ChipStyles.ChipTransparentXsNegative -> ChipTransparent.Xs.Negative
        ChipStyles.ChipTransparentXsPositive -> ChipTransparent.Xs.Positive
        ChipStyles.ChipTransparentXsWarning -> ChipTransparent.Xs.Warning
        ChipStyles.ChipTransparentXsPilledDefault -> ChipTransparent.Xs.Pilled.Default
        ChipStyles.ChipTransparentXsPilledAccent -> ChipTransparent.Xs.Pilled.Accent
        ChipStyles.ChipTransparentXsPilledNegative -> ChipTransparent.Xs.Pilled.Negative
        ChipStyles.ChipTransparentXsPilledPositive -> ChipTransparent.Xs.Pilled.Positive
        ChipStyles.ChipTransparentXsPilledWarning -> ChipTransparent.Xs.Pilled.Warning
        ChipStyles.ChipTransparentXxsDefault -> ChipTransparent.Xxs.Default
        ChipStyles.ChipTransparentXxsAccent -> ChipTransparent.Xxs.Accent
        ChipStyles.ChipTransparentXxsNegative -> ChipTransparent.Xxs.Negative
        ChipStyles.ChipTransparentXxsPositive -> ChipTransparent.Xxs.Positive
        ChipStyles.ChipTransparentXxsWarning -> ChipTransparent.Xxs.Warning
        ChipStyles.ChipTransparentXxsPilledDefault -> ChipTransparent.Xxs.Pilled.Default
        ChipStyles.ChipTransparentXxsPilledAccent -> ChipTransparent.Xxs.Pilled.Accent
        ChipStyles.ChipTransparentXxsPilledNegative -> ChipTransparent.Xxs.Pilled.Negative
        ChipStyles.ChipTransparentXxsPilledPositive -> ChipTransparent.Xxs.Pilled.Positive
        ChipStyles.ChipTransparentXxsPilledWarning -> ChipTransparent.Xxs.Pilled.Warning
        ChipStyles.EmbeddedChipSDefault -> EmbeddedChip.S.Default
        ChipStyles.EmbeddedChipSSecondary -> EmbeddedChip.S.Secondary
        ChipStyles.EmbeddedChipSAccent -> EmbeddedChip.S.Accent
        ChipStyles.EmbeddedChipSNegative -> EmbeddedChip.S.Negative
        ChipStyles.EmbeddedChipSPositive -> EmbeddedChip.S.Positive
        ChipStyles.EmbeddedChipSWarning -> EmbeddedChip.S.Warning
        ChipStyles.EmbeddedChipXsDefault -> EmbeddedChip.Xs.Default
        ChipStyles.EmbeddedChipXsSecondary -> EmbeddedChip.Xs.Secondary
        ChipStyles.EmbeddedChipXsAccent -> EmbeddedChip.Xs.Accent
        ChipStyles.EmbeddedChipXsNegative -> EmbeddedChip.Xs.Negative
        ChipStyles.EmbeddedChipXsPositive -> EmbeddedChip.Xs.Positive
        ChipStyles.EmbeddedChipXsWarning -> EmbeddedChip.Xs.Warning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ChipStyles] для chip-solid
 */
public fun ChipStyles.Solid.resolve(
    size: ChipSolidSize = ChipSolidSize.M,
    shape: ChipSolidShape = ChipSolidShape.Default,
    view: ChipSolidView = ChipSolidView.Default,
): ChipStyles = when {
    size == ChipSolidSize.M && shape == ChipSolidShape.Pilled && view == ChipSolidView.Default ->
        ChipStyles.ChipSolidMPilledDefault
    size == ChipSolidSize.M && shape == ChipSolidShape.Pilled && view == ChipSolidView.Accent ->
        ChipStyles.ChipSolidMPilledAccent
    size == ChipSolidSize.M && shape == ChipSolidShape.Pilled && view == ChipSolidView.Negative ->
        ChipStyles.ChipSolidMPilledNegative
    size == ChipSolidSize.M && shape == ChipSolidShape.Pilled && view == ChipSolidView.Positive ->
        ChipStyles.ChipSolidMPilledPositive
    size == ChipSolidSize.M && shape == ChipSolidShape.Pilled && view == ChipSolidView.Warning ->
        ChipStyles.ChipSolidMPilledWarning
    size == ChipSolidSize.M && shape == ChipSolidShape.Pilled && view == ChipSolidView.Warning ->
        ChipStyles.ChipSolidMPilledClear
    size == ChipSolidSize.S && shape == ChipSolidShape.Pilled && view == ChipSolidView.Default ->
        ChipStyles.ChipSolidSPilledDefault
    size == ChipSolidSize.S && shape == ChipSolidShape.Pilled && view == ChipSolidView.Accent ->
        ChipStyles.ChipSolidSPilledAccent
    size == ChipSolidSize.S && shape == ChipSolidShape.Pilled && view == ChipSolidView.Negative ->
        ChipStyles.ChipSolidSPilledNegative
    size == ChipSolidSize.S && shape == ChipSolidShape.Pilled && view == ChipSolidView.Positive ->
        ChipStyles.ChipSolidSPilledPositive
    size == ChipSolidSize.S && shape == ChipSolidShape.Pilled && view == ChipSolidView.Warning ->
        ChipStyles.ChipSolidSPilledWarning
    size == ChipSolidSize.S && shape == ChipSolidShape.Pilled && view == ChipSolidView.Warning ->
        ChipStyles.ChipSolidSPilledClear
    size == ChipSolidSize.Xs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Default ->
        ChipStyles.ChipSolidXsPilledDefault
    size == ChipSolidSize.Xs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Accent ->
        ChipStyles.ChipSolidXsPilledAccent
    size == ChipSolidSize.Xs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Negative ->
        ChipStyles.ChipSolidXsPilledNegative
    size == ChipSolidSize.Xs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Positive ->
        ChipStyles.ChipSolidXsPilledPositive
    size == ChipSolidSize.Xs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Warning ->
        ChipStyles.ChipSolidXsPilledWarning
    size == ChipSolidSize.Xs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Warning ->
        ChipStyles.ChipSolidXsPilledClear
    size == ChipSolidSize.Xxs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Default ->
        ChipStyles.ChipSolidXxsPilledDefault
    size == ChipSolidSize.Xxs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Accent ->
        ChipStyles.ChipSolidXxsPilledAccent
    size == ChipSolidSize.Xxs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Negative ->
        ChipStyles.ChipSolidXxsPilledNegative
    size == ChipSolidSize.Xxs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Positive ->
        ChipStyles.ChipSolidXxsPilledPositive
    size == ChipSolidSize.Xxs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Warning ->
        ChipStyles.ChipSolidXxsPilledWarning
    size == ChipSolidSize.Xxs && shape == ChipSolidShape.Pilled && view == ChipSolidView.Warning ->
        ChipStyles.ChipSolidXxsPilledClear
    size == ChipSolidSize.M && view == ChipSolidView.Default -> ChipStyles.ChipSolidMDefault
    size == ChipSolidSize.M && view == ChipSolidView.Accent -> ChipStyles.ChipSolidMAccent
    size == ChipSolidSize.M && view == ChipSolidView.Negative -> ChipStyles.ChipSolidMNegative
    size == ChipSolidSize.M && view == ChipSolidView.Positive -> ChipStyles.ChipSolidMPositive
    size == ChipSolidSize.M && view == ChipSolidView.Warning -> ChipStyles.ChipSolidMWarning
    size == ChipSolidSize.M && view == ChipSolidView.Warning -> ChipStyles.ChipSolidMClear
    size == ChipSolidSize.S && view == ChipSolidView.Default -> ChipStyles.ChipSolidSDefault
    size == ChipSolidSize.S && view == ChipSolidView.Accent -> ChipStyles.ChipSolidSAccent
    size == ChipSolidSize.S && view == ChipSolidView.Negative -> ChipStyles.ChipSolidSNegative
    size == ChipSolidSize.S && view == ChipSolidView.Positive -> ChipStyles.ChipSolidSPositive
    size == ChipSolidSize.S && view == ChipSolidView.Warning -> ChipStyles.ChipSolidSWarning
    size == ChipSolidSize.S && view == ChipSolidView.Warning -> ChipStyles.ChipSolidSClear
    size == ChipSolidSize.Xs && view == ChipSolidView.Default -> ChipStyles.ChipSolidXsDefault
    size == ChipSolidSize.Xs && view == ChipSolidView.Accent -> ChipStyles.ChipSolidXsAccent
    size == ChipSolidSize.Xs && view == ChipSolidView.Negative -> ChipStyles.ChipSolidXsNegative
    size == ChipSolidSize.Xs && view == ChipSolidView.Positive -> ChipStyles.ChipSolidXsPositive
    size == ChipSolidSize.Xs && view == ChipSolidView.Warning -> ChipStyles.ChipSolidXsWarning
    size == ChipSolidSize.Xs && view == ChipSolidView.Warning -> ChipStyles.ChipSolidXsClear
    size == ChipSolidSize.Xxs && view == ChipSolidView.Default -> ChipStyles.ChipSolidXxsDefault
    size == ChipSolidSize.Xxs && view == ChipSolidView.Accent -> ChipStyles.ChipSolidXxsAccent
    size == ChipSolidSize.Xxs && view == ChipSolidView.Negative -> ChipStyles.ChipSolidXxsNegative
    size == ChipSolidSize.Xxs && view == ChipSolidView.Positive -> ChipStyles.ChipSolidXxsPositive
    size == ChipSolidSize.Xxs && view == ChipSolidView.Warning -> ChipStyles.ChipSolidXxsWarning
    size == ChipSolidSize.Xxs && view == ChipSolidView.Warning -> ChipStyles.ChipSolidXxsClear
    else -> error("Unsupported chip-solid style combination")
}

/**
 * Возвращает [ChipStyle] для chip-solid
 */
@Composable
public fun ChipStyles.Solid.style(
    size: ChipSolidSize = ChipSolidSize.M,
    shape: ChipSolidShape = ChipSolidShape.Default,
    view: ChipSolidView = ChipSolidView.Default,
    modify: @Composable ChipStyleBuilder.() -> Unit = {},
): ChipStyle = resolve(size, shape, view).style(modify)

/**
 * Возвращает экземпляр [ChipStyles] для chip-transparent
 */
public fun ChipStyles.Transparent.resolve(
    size: ChipTransparentSize = ChipTransparentSize.M,
    shape: ChipTransparentShape = ChipTransparentShape.Default,
    view: ChipTransparentView = ChipTransparentView.Default,
): ChipStyles = when {
    size == ChipTransparentSize.M && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Default -> ChipStyles.ChipTransparentMPilledDefault
    size == ChipTransparentSize.M && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Accent -> ChipStyles.ChipTransparentMPilledAccent
    size == ChipTransparentSize.M && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Negative -> ChipStyles.ChipTransparentMPilledNegative
    size == ChipTransparentSize.M && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Positive -> ChipStyles.ChipTransparentMPilledPositive
    size == ChipTransparentSize.M && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Warning -> ChipStyles.ChipTransparentMPilledWarning
    size == ChipTransparentSize.S && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Default -> ChipStyles.ChipTransparentSPilledDefault
    size == ChipTransparentSize.S && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Accent -> ChipStyles.ChipTransparentSPilledAccent
    size == ChipTransparentSize.S && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Negative -> ChipStyles.ChipTransparentSPilledNegative
    size == ChipTransparentSize.S && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Positive -> ChipStyles.ChipTransparentSPilledPositive
    size == ChipTransparentSize.S && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Warning -> ChipStyles.ChipTransparentSPilledWarning
    size == ChipTransparentSize.Xs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Default -> ChipStyles.ChipTransparentXsPilledDefault
    size == ChipTransparentSize.Xs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Accent -> ChipStyles.ChipTransparentXsPilledAccent
    size == ChipTransparentSize.Xs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Negative -> ChipStyles.ChipTransparentXsPilledNegative
    size == ChipTransparentSize.Xs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Positive -> ChipStyles.ChipTransparentXsPilledPositive
    size == ChipTransparentSize.Xs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Warning -> ChipStyles.ChipTransparentXsPilledWarning
    size == ChipTransparentSize.Xxs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Default -> ChipStyles.ChipTransparentXxsPilledDefault
    size == ChipTransparentSize.Xxs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Accent -> ChipStyles.ChipTransparentXxsPilledAccent
    size == ChipTransparentSize.Xxs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Negative -> ChipStyles.ChipTransparentXxsPilledNegative
    size == ChipTransparentSize.Xxs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Positive -> ChipStyles.ChipTransparentXxsPilledPositive
    size == ChipTransparentSize.Xxs && shape == ChipTransparentShape.Pilled && view ==
        ChipTransparentView.Warning -> ChipStyles.ChipTransparentXxsPilledWarning
    size == ChipTransparentSize.M && view == ChipTransparentView.Default ->
        ChipStyles.ChipTransparentMDefault
    size == ChipTransparentSize.M && view == ChipTransparentView.Accent ->
        ChipStyles.ChipTransparentMAccent
    size == ChipTransparentSize.M && view == ChipTransparentView.Negative ->
        ChipStyles.ChipTransparentMNegative
    size == ChipTransparentSize.M && view == ChipTransparentView.Positive ->
        ChipStyles.ChipTransparentMPositive
    size == ChipTransparentSize.M && view == ChipTransparentView.Warning ->
        ChipStyles.ChipTransparentMWarning
    size == ChipTransparentSize.S && view == ChipTransparentView.Default ->
        ChipStyles.ChipTransparentSDefault
    size == ChipTransparentSize.S && view == ChipTransparentView.Accent ->
        ChipStyles.ChipTransparentSAccent
    size == ChipTransparentSize.S && view == ChipTransparentView.Negative ->
        ChipStyles.ChipTransparentSNegative
    size == ChipTransparentSize.S && view == ChipTransparentView.Positive ->
        ChipStyles.ChipTransparentSPositive
    size == ChipTransparentSize.S && view == ChipTransparentView.Warning ->
        ChipStyles.ChipTransparentSWarning
    size == ChipTransparentSize.Xs && view == ChipTransparentView.Default ->
        ChipStyles.ChipTransparentXsDefault
    size == ChipTransparentSize.Xs && view == ChipTransparentView.Accent ->
        ChipStyles.ChipTransparentXsAccent
    size == ChipTransparentSize.Xs && view == ChipTransparentView.Negative ->
        ChipStyles.ChipTransparentXsNegative
    size == ChipTransparentSize.Xs && view == ChipTransparentView.Positive ->
        ChipStyles.ChipTransparentXsPositive
    size == ChipTransparentSize.Xs && view == ChipTransparentView.Warning ->
        ChipStyles.ChipTransparentXsWarning
    size == ChipTransparentSize.Xxs && view == ChipTransparentView.Default ->
        ChipStyles.ChipTransparentXxsDefault
    size == ChipTransparentSize.Xxs && view == ChipTransparentView.Accent ->
        ChipStyles.ChipTransparentXxsAccent
    size == ChipTransparentSize.Xxs && view == ChipTransparentView.Negative ->
        ChipStyles.ChipTransparentXxsNegative
    size == ChipTransparentSize.Xxs && view == ChipTransparentView.Positive ->
        ChipStyles.ChipTransparentXxsPositive
    size == ChipTransparentSize.Xxs && view == ChipTransparentView.Warning ->
        ChipStyles.ChipTransparentXxsWarning
    else -> error("Unsupported chip-transparent style combination")
}

/**
 * Возвращает [ChipStyle] для chip-transparent
 */
@Composable
public fun ChipStyles.Transparent.style(
    size: ChipTransparentSize = ChipTransparentSize.M,
    shape: ChipTransparentShape = ChipTransparentShape.Default,
    view: ChipTransparentView = ChipTransparentView.Default,
    modify: @Composable ChipStyleBuilder.() -> Unit = {},
): ChipStyle = resolve(size, shape, view).style(modify)

/**
 * Возвращает экземпляр [ChipStyles] для embedded-chip
 */
public fun ChipStyles.EmbeddedChip.resolve(
    size: EmbeddedChipSize = EmbeddedChipSize.S,
    view: EmbeddedChipView = EmbeddedChipView.Default,
): ChipStyles = when {
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Default ->
        ChipStyles.EmbeddedChipSDefault
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Secondary ->
        ChipStyles.EmbeddedChipSSecondary
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Accent -> ChipStyles.EmbeddedChipSAccent
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Negative ->
        ChipStyles.EmbeddedChipSNegative
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Positive ->
        ChipStyles.EmbeddedChipSPositive
    size == EmbeddedChipSize.S && view == EmbeddedChipView.Warning ->
        ChipStyles.EmbeddedChipSWarning
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Default ->
        ChipStyles.EmbeddedChipXsDefault
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Secondary ->
        ChipStyles.EmbeddedChipXsSecondary
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Accent ->
        ChipStyles.EmbeddedChipXsAccent
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Negative ->
        ChipStyles.EmbeddedChipXsNegative
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Positive ->
        ChipStyles.EmbeddedChipXsPositive
    size == EmbeddedChipSize.Xs && view == EmbeddedChipView.Warning ->
        ChipStyles.EmbeddedChipXsWarning
    else -> error("Unsupported embedded-chip style combination")
}

/**
 * Возвращает [ChipStyle] для embedded-chip
 */
@Composable
public fun ChipStyles.EmbeddedChip.style(
    size: EmbeddedChipSize = EmbeddedChipSize.S,
    view: EmbeddedChipView = EmbeddedChipView.Default,
    modify: @Composable ChipStyleBuilder.() -> Unit = {},
): ChipStyle = resolve(size, view).style(modify)
