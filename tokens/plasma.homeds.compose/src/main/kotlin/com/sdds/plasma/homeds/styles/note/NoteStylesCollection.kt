// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.note

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.NoteStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Note
 */
public enum class NoteStyles(
    public val key: String,
) {
    NoteContentBeforeScalableDefault("Note.ContentBeforeScalable.Default"),
    NoteContentBeforeScalablePositive("Note.ContentBeforeScalable.Positive"),
    NoteContentBeforeScalableNegative("Note.ContentBeforeScalable.Negative"),
    NoteContentBeforeScalableWarning("Note.ContentBeforeScalable.Warning"),
    NoteContentBeforeScalableInfo("Note.ContentBeforeScalable.Info"),
    NoteContentBeforeScalableHasCloseDefault("Note.ContentBeforeScalable.HasClose.Default"),
    NoteContentBeforeScalableHasClosePositive("Note.ContentBeforeScalable.HasClose.Positive"),
    NoteContentBeforeScalableHasCloseNegative("Note.ContentBeforeScalable.HasClose.Negative"),
    NoteContentBeforeScalableHasCloseWarning("Note.ContentBeforeScalable.HasClose.Warning"),
    NoteContentBeforeScalableHasCloseInfo("Note.ContentBeforeScalable.HasClose.Info"),
    NoteContentBeforeFixedDefault("Note.ContentBeforeFixed.Default"),
    NoteContentBeforeFixedPositive("Note.ContentBeforeFixed.Positive"),
    NoteContentBeforeFixedNegative("Note.ContentBeforeFixed.Negative"),
    NoteContentBeforeFixedWarning("Note.ContentBeforeFixed.Warning"),
    NoteContentBeforeFixedInfo("Note.ContentBeforeFixed.Info"),
    NoteContentBeforeFixedHasCloseDefault("Note.ContentBeforeFixed.HasClose.Default"),
    NoteContentBeforeFixedHasClosePositive("Note.ContentBeforeFixed.HasClose.Positive"),
    NoteContentBeforeFixedHasCloseNegative("Note.ContentBeforeFixed.HasClose.Negative"),
    NoteContentBeforeFixedHasCloseWarning("Note.ContentBeforeFixed.HasClose.Warning"),
    NoteContentBeforeFixedHasCloseInfo("Note.ContentBeforeFixed.HasClose.Info"),
}

/**
 * Возвращает [NoteStyle] для [NoteStyles]
 */
@Composable
public fun NoteStyles.style(modifyAction: @Composable NoteStyleBuilder.() -> Unit = {}): NoteStyle {
    val builder = when (this) {
        NoteStyles.NoteContentBeforeScalableDefault -> Note.ContentBeforeScalable.Default
        NoteStyles.NoteContentBeforeScalablePositive -> Note.ContentBeforeScalable.Positive
        NoteStyles.NoteContentBeforeScalableNegative -> Note.ContentBeforeScalable.Negative
        NoteStyles.NoteContentBeforeScalableWarning -> Note.ContentBeforeScalable.Warning
        NoteStyles.NoteContentBeforeScalableInfo -> Note.ContentBeforeScalable.Info
        NoteStyles.NoteContentBeforeScalableHasCloseDefault ->
            Note.ContentBeforeScalable.HasClose.Default
        NoteStyles.NoteContentBeforeScalableHasClosePositive ->
            Note.ContentBeforeScalable.HasClose.Positive
        NoteStyles.NoteContentBeforeScalableHasCloseNegative ->
            Note.ContentBeforeScalable.HasClose.Negative
        NoteStyles.NoteContentBeforeScalableHasCloseWarning ->
            Note.ContentBeforeScalable.HasClose.Warning
        NoteStyles.NoteContentBeforeScalableHasCloseInfo -> Note.ContentBeforeScalable.HasClose.Info
        NoteStyles.NoteContentBeforeFixedDefault -> Note.ContentBeforeFixed.Default
        NoteStyles.NoteContentBeforeFixedPositive -> Note.ContentBeforeFixed.Positive
        NoteStyles.NoteContentBeforeFixedNegative -> Note.ContentBeforeFixed.Negative
        NoteStyles.NoteContentBeforeFixedWarning -> Note.ContentBeforeFixed.Warning
        NoteStyles.NoteContentBeforeFixedInfo -> Note.ContentBeforeFixed.Info
        NoteStyles.NoteContentBeforeFixedHasCloseDefault -> Note.ContentBeforeFixed.HasClose.Default
        NoteStyles.NoteContentBeforeFixedHasClosePositive ->
            Note.ContentBeforeFixed.HasClose.Positive
        NoteStyles.NoteContentBeforeFixedHasCloseNegative ->
            Note.ContentBeforeFixed.HasClose.Negative
        NoteStyles.NoteContentBeforeFixedHasCloseWarning -> Note.ContentBeforeFixed.HasClose.Warning
        NoteStyles.NoteContentBeforeFixedHasCloseInfo -> Note.ContentBeforeFixed.HasClose.Info
    }
    return builder.modify(modifyAction).style()
}
