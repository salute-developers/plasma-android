// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.notecompact

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.NoteCompactStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента NoteCompact
 */
public enum class NoteCompactStyles(
    public val key: String,
) {
    NoteCompactContentBeforeFixedDefault("NoteCompact.ContentBeforeFixed.Default"),
    NoteCompactContentBeforeFixedPositive("NoteCompact.ContentBeforeFixed.Positive"),
    NoteCompactContentBeforeFixedNegative("NoteCompact.ContentBeforeFixed.Negative"),
    NoteCompactContentBeforeFixedWarning("NoteCompact.ContentBeforeFixed.Warning"),
    NoteCompactContentBeforeFixedInfo("NoteCompact.ContentBeforeFixed.Info"),
    NoteCompactContentBeforeFixedHasCloseDefault("NoteCompact.ContentBeforeFixed.HasClose.Default"),
    NoteCompactContentBeforeFixedHasClosePositive("NoteCompact.ContentBeforeFixed.HasClose.Positive"),
    NoteCompactContentBeforeFixedHasCloseNegative("NoteCompact.ContentBeforeFixed.HasClose.Negative"),
    NoteCompactContentBeforeFixedHasCloseWarning("NoteCompact.ContentBeforeFixed.HasClose.Warning"),
    NoteCompactContentBeforeFixedHasCloseInfo("NoteCompact.ContentBeforeFixed.HasClose.Info"),
    NoteCompactContentBeforeScalableDefault("NoteCompact.ContentBeforeScalable.Default"),
    NoteCompactContentBeforeScalablePositive("NoteCompact.ContentBeforeScalable.Positive"),
    NoteCompactContentBeforeScalableNegative("NoteCompact.ContentBeforeScalable.Negative"),
    NoteCompactContentBeforeScalableWarning("NoteCompact.ContentBeforeScalable.Warning"),
    NoteCompactContentBeforeScalableInfo("NoteCompact.ContentBeforeScalable.Info"),
    NoteCompactContentBeforeScalableHasCloseDefault("NoteCompact.ContentBeforeScalable.HasClose.Default"),
    NoteCompactContentBeforeScalableHasClosePositive("NoteCompact.ContentBeforeScalable.HasClose.Positive"),
    NoteCompactContentBeforeScalableHasCloseNegative("NoteCompact.ContentBeforeScalable.HasClose.Negative"),
    NoteCompactContentBeforeScalableHasCloseWarning("NoteCompact.ContentBeforeScalable.HasClose.Warning"),
    NoteCompactContentBeforeScalableHasCloseInfo("NoteCompact.ContentBeforeScalable.HasClose.Info"),
}

/**
 * Возвращает [NoteCompactStyle] для [NoteCompactStyles]
 */
@Composable
public fun NoteCompactStyles.style(
    modifyAction: @Composable NoteCompactStyleBuilder.() -> Unit =
        {},
): NoteCompactStyle {
    val builder = when (this) {
        NoteCompactStyles.NoteCompactContentBeforeFixedDefault ->
            NoteCompact.ContentBeforeFixed.Default
        NoteCompactStyles.NoteCompactContentBeforeFixedPositive ->
            NoteCompact.ContentBeforeFixed.Positive
        NoteCompactStyles.NoteCompactContentBeforeFixedNegative ->
            NoteCompact.ContentBeforeFixed.Negative
        NoteCompactStyles.NoteCompactContentBeforeFixedWarning ->
            NoteCompact.ContentBeforeFixed.Warning
        NoteCompactStyles.NoteCompactContentBeforeFixedInfo -> NoteCompact.ContentBeforeFixed.Info
        NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseDefault ->
            NoteCompact.ContentBeforeFixed.HasClose.Default
        NoteCompactStyles.NoteCompactContentBeforeFixedHasClosePositive ->
            NoteCompact.ContentBeforeFixed.HasClose.Positive
        NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseNegative ->
            NoteCompact.ContentBeforeFixed.HasClose.Negative
        NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseWarning ->
            NoteCompact.ContentBeforeFixed.HasClose.Warning
        NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseInfo ->
            NoteCompact.ContentBeforeFixed.HasClose.Info
        NoteCompactStyles.NoteCompactContentBeforeScalableDefault ->
            NoteCompact.ContentBeforeScalable.Default
        NoteCompactStyles.NoteCompactContentBeforeScalablePositive ->
            NoteCompact.ContentBeforeScalable.Positive
        NoteCompactStyles.NoteCompactContentBeforeScalableNegative ->
            NoteCompact.ContentBeforeScalable.Negative
        NoteCompactStyles.NoteCompactContentBeforeScalableWarning ->
            NoteCompact.ContentBeforeScalable.Warning
        NoteCompactStyles.NoteCompactContentBeforeScalableInfo ->
            NoteCompact.ContentBeforeScalable.Info
        NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseDefault ->
            NoteCompact.ContentBeforeScalable.HasClose.Default
        NoteCompactStyles.NoteCompactContentBeforeScalableHasClosePositive ->
            NoteCompact.ContentBeforeScalable.HasClose.Positive
        NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseNegative ->
            NoteCompact.ContentBeforeScalable.HasClose.Negative
        NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseWarning ->
            NoteCompact.ContentBeforeScalable.HasClose.Warning
        NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseInfo ->
            NoteCompact.ContentBeforeScalable.HasClose.Info
    }
    return builder.modify(modifyAction).style()
}
