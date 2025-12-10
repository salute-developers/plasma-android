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
    NoteHasCloseDefault("Note.HasClose.Default"),
    NoteHasClosePositive("Note.HasClose.Positive"),
    NoteHasCloseNegative("Note.HasClose.Negative"),
    NoteHasCloseWarning("Note.HasClose.Warning"),
    NoteHasCloseInfo("Note.HasClose.Info"),
    NoteHasCloseContentScalableDefault("Note.HasClose.ContentScalable.Default"),
    NoteHasCloseContentScalablePositive("Note.HasClose.ContentScalable.Positive"),
    NoteHasCloseContentScalableNegative("Note.HasClose.ContentScalable.Negative"),
    NoteHasCloseContentScalableWarning("Note.HasClose.ContentScalable.Warning"),
    NoteHasCloseContentScalableInfo("Note.HasClose.ContentScalable.Info"),
    NoteContentScalableDefault("Note.ContentScalable.Default"),
    NoteContentScalablePositive("Note.ContentScalable.Positive"),
    NoteContentScalableNegative("Note.ContentScalable.Negative"),
    NoteContentScalableWarning("Note.ContentScalable.Warning"),
    NoteContentScalableInfo("Note.ContentScalable.Info"),
}

/**
 * Возвращает [NoteStyle] для [NoteStyles]
 */
@Composable
public fun NoteStyles.style(modifyAction: @Composable NoteStyleBuilder.() -> Unit = {}): NoteStyle {
    val builder = when (this) {
        NoteStyles.NoteHasCloseDefault -> Note.HasClose.Default
        NoteStyles.NoteHasClosePositive -> Note.HasClose.Positive
        NoteStyles.NoteHasCloseNegative -> Note.HasClose.Negative
        NoteStyles.NoteHasCloseWarning -> Note.HasClose.Warning
        NoteStyles.NoteHasCloseInfo -> Note.HasClose.Info
        NoteStyles.NoteHasCloseContentScalableDefault -> Note.HasClose.ContentScalable.Default
        NoteStyles.NoteHasCloseContentScalablePositive -> Note.HasClose.ContentScalable.Positive
        NoteStyles.NoteHasCloseContentScalableNegative -> Note.HasClose.ContentScalable.Negative
        NoteStyles.NoteHasCloseContentScalableWarning -> Note.HasClose.ContentScalable.Warning
        NoteStyles.NoteHasCloseContentScalableInfo -> Note.HasClose.ContentScalable.Info
        NoteStyles.NoteContentScalableDefault -> Note.ContentScalable.Default
        NoteStyles.NoteContentScalablePositive -> Note.ContentScalable.Positive
        NoteStyles.NoteContentScalableNegative -> Note.ContentScalable.Negative
        NoteStyles.NoteContentScalableWarning -> Note.ContentScalable.Warning
        NoteStyles.NoteContentScalableInfo -> Note.ContentScalable.Info
    }
    return builder.modify(modifyAction).style()
}
