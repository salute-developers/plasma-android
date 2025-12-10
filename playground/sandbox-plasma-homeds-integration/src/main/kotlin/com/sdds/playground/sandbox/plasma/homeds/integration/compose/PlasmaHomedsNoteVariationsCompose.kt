package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.note.ContentScalable
import com.sdds.plasma.homeds.styles.note.Default
import com.sdds.plasma.homeds.styles.note.HasClose
import com.sdds.plasma.homeds.styles.note.Info
import com.sdds.plasma.homeds.styles.note.Negative
import com.sdds.plasma.homeds.styles.note.Note
import com.sdds.plasma.homeds.styles.note.Positive
import com.sdds.plasma.homeds.styles.note.Warning
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsNoteVariationsCompose : ComposeStyleProvider<String, NoteStyle>() {
    override val variations: Map<String, @Composable () -> NoteStyle> =
        mapOf(
            "HasClose.Default" to { Note.HasClose.Default.style() },
            "HasClose.Positive" to { Note.HasClose.Positive.style() },
            "HasClose.Negative" to { Note.HasClose.Negative.style() },
            "HasClose.Warning" to { Note.HasClose.Warning.style() },
            "HasClose.Info" to { Note.HasClose.Info.style() },
            "HasClose.ContentScalable.Default" to { Note.HasClose.ContentScalable.Default.style() },
            "HasClose.ContentScalable.Positive" to { Note.HasClose.ContentScalable.Positive.style() },
            "HasClose.ContentScalable.Negative" to { Note.HasClose.ContentScalable.Negative.style() },
            "HasClose.ContentScalable.Warning" to { Note.HasClose.ContentScalable.Warning.style() },
            "HasClose.ContentScalable.Info" to { Note.HasClose.ContentScalable.Info.style() },
            "ContentScalable.Default" to { Note.ContentScalable.Default.style() },
            "ContentScalable.Positive" to { Note.ContentScalable.Positive.style() },
            "ContentScalable.Negative" to { Note.ContentScalable.Negative.style() },
            "ContentScalable.Warning" to { Note.ContentScalable.Warning.style() },
            "ContentScalable.Info" to { Note.ContentScalable.Info.style() },
        )
}
