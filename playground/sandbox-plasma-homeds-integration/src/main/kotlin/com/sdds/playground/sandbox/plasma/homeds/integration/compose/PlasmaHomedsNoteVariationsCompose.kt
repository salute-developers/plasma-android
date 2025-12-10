package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.note.ContentBeforeFixed
import com.sdds.plasma.homeds.styles.note.ContentBeforeScalable
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
            "ContentBeforeScalable.Default" to { Note.ContentBeforeScalable.Default.style() },
            "ContentBeforeScalable.Positive" to { Note.ContentBeforeScalable.Positive.style() },
            "ContentBeforeScalable.Negative" to { Note.ContentBeforeScalable.Negative.style() },
            "ContentBeforeScalable.Warning" to { Note.ContentBeforeScalable.Warning.style() },
            "ContentBeforeScalable.Info" to { Note.ContentBeforeScalable.Info.style() },
            "ContentBeforeScalable.HasClose.Default" to { Note.ContentBeforeScalable.HasClose.Default.style() },
            "ContentBeforeScalable.HasClose.Positive" to { Note.ContentBeforeScalable.HasClose.Positive.style() },
            "ContentBeforeScalable.HasClose.Negative" to { Note.ContentBeforeScalable.HasClose.Negative.style() },
            "ContentBeforeScalable.HasClose.Warning" to { Note.ContentBeforeScalable.HasClose.Warning.style() },
            "ContentBeforeScalable.HasClose.Info" to { Note.ContentBeforeScalable.HasClose.Info.style() },
            "ContentBeforeFixed.Default" to { Note.ContentBeforeFixed.Default.style() },
            "ContentBeforeFixed.Positive" to { Note.ContentBeforeFixed.Positive.style() },
            "ContentBeforeFixed.Negative" to { Note.ContentBeforeFixed.Negative.style() },
            "ContentBeforeFixed.Warning" to { Note.ContentBeforeFixed.Warning.style() },
            "ContentBeforeFixed.Info" to { Note.ContentBeforeFixed.Info.style() },
            "ContentBeforeFixed.HasClose.Default" to { Note.ContentBeforeFixed.HasClose.Default.style() },
            "ContentBeforeFixed.HasClose.Positive" to { Note.ContentBeforeFixed.HasClose.Positive.style() },
            "ContentBeforeFixed.HasClose.Negative" to { Note.ContentBeforeFixed.HasClose.Negative.style() },
            "ContentBeforeFixed.HasClose.Warning" to { Note.ContentBeforeFixed.HasClose.Warning.style() },
            "ContentBeforeFixed.HasClose.Info" to { Note.ContentBeforeFixed.HasClose.Info.style() },
        )
}
