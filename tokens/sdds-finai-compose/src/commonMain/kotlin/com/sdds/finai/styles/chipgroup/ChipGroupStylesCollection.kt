// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.finai.styles.chipgroup

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
    EmbeddedChipGroupSDefault("EmbeddedChipGroup.S.Default"),
    EmbeddedChipGroupSAccent("EmbeddedChipGroup.S.Accent"),
    EmbeddedChipGroupSNegative("EmbeddedChipGroup.S.Negative"),
    EmbeddedChipGroupSPositive("EmbeddedChipGroup.S.Positive"),
    EmbeddedChipGroupSSecondary("EmbeddedChipGroup.S.Secondary"),
    EmbeddedChipGroupSWarning("EmbeddedChipGroup.S.Warning"),
    EmbeddedChipGroupXsDefault("EmbeddedChipGroup.Xs.Default"),
    EmbeddedChipGroupXsAccent("EmbeddedChipGroup.Xs.Accent"),
    EmbeddedChipGroupXsNegative("EmbeddedChipGroup.Xs.Negative"),
    EmbeddedChipGroupXsPositive("EmbeddedChipGroup.Xs.Positive"),
    EmbeddedChipGroupXsSecondary("EmbeddedChipGroup.Xs.Secondary"),
    EmbeddedChipGroupXsWarning("EmbeddedChipGroup.Xs.Warning"),
    ;

    /**
     * Typed API для подбора стиля embedded-chip-group
     */
    public companion object
}

/**
 * Возможные значения свойства size для embedded-chip-group
 */
public enum class ChipGroupSize {
    S,
    Xs,
}

/**
 * Возможные значения свойства view для embedded-chip-group
 */
public enum class ChipGroupView {
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
        ChipGroupStyles.EmbeddedChipGroupSDefault -> EmbeddedChipGroup.S.Default
        ChipGroupStyles.EmbeddedChipGroupSAccent -> EmbeddedChipGroup.S.Accent
        ChipGroupStyles.EmbeddedChipGroupSNegative -> EmbeddedChipGroup.S.Negative
        ChipGroupStyles.EmbeddedChipGroupSPositive -> EmbeddedChipGroup.S.Positive
        ChipGroupStyles.EmbeddedChipGroupSSecondary -> EmbeddedChipGroup.S.Secondary
        ChipGroupStyles.EmbeddedChipGroupSWarning -> EmbeddedChipGroup.S.Warning
        ChipGroupStyles.EmbeddedChipGroupXsDefault -> EmbeddedChipGroup.Xs.Default
        ChipGroupStyles.EmbeddedChipGroupXsAccent -> EmbeddedChipGroup.Xs.Accent
        ChipGroupStyles.EmbeddedChipGroupXsNegative -> EmbeddedChipGroup.Xs.Negative
        ChipGroupStyles.EmbeddedChipGroupXsPositive -> EmbeddedChipGroup.Xs.Positive
        ChipGroupStyles.EmbeddedChipGroupXsSecondary -> EmbeddedChipGroup.Xs.Secondary
        ChipGroupStyles.EmbeddedChipGroupXsWarning -> EmbeddedChipGroup.Xs.Warning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ChipGroupStyles] для embedded-chip-group
 */
public fun ChipGroupStyles.Companion.resolve(
    size: ChipGroupSize = ChipGroupSize.S,
    view: ChipGroupView,
): ChipGroupStyles = when {
    size == ChipGroupSize.S && view == ChipGroupView.Default ->
        ChipGroupStyles.EmbeddedChipGroupSDefault
    size == ChipGroupSize.S && view == ChipGroupView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupSAccent
    size == ChipGroupSize.S && view == ChipGroupView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupSNegative
    size == ChipGroupSize.S && view == ChipGroupView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupSPositive
    size == ChipGroupSize.S && view == ChipGroupView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupSSecondary
    size == ChipGroupSize.S && view == ChipGroupView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupSWarning
    size == ChipGroupSize.Xs && view == ChipGroupView.Default ->
        ChipGroupStyles.EmbeddedChipGroupXsDefault
    size == ChipGroupSize.Xs && view == ChipGroupView.Accent ->
        ChipGroupStyles.EmbeddedChipGroupXsAccent
    size == ChipGroupSize.Xs && view == ChipGroupView.Negative ->
        ChipGroupStyles.EmbeddedChipGroupXsNegative
    size == ChipGroupSize.Xs && view == ChipGroupView.Positive ->
        ChipGroupStyles.EmbeddedChipGroupXsPositive
    size == ChipGroupSize.Xs && view == ChipGroupView.Secondary ->
        ChipGroupStyles.EmbeddedChipGroupXsSecondary
    size == ChipGroupSize.Xs && view == ChipGroupView.Warning ->
        ChipGroupStyles.EmbeddedChipGroupXsWarning
    else -> error("Unsupported embedded-chip-group style combination")
}

/**
 * Возвращает [ChipGroupStyle] для embedded-chip-group
 */
@Composable
public fun ChipGroupStyles.Companion.style(
    size: ChipGroupSize = ChipGroupSize.S,
    view: ChipGroupView,
    modify: @Composable ChipGroupStyleBuilder.() -> Unit = {},
): ChipGroupStyle = resolve(size, view).style(modify)
