// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
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

internal object PlasmaHomedsNoteVariationsCompose : ComposeStyleProvider<NoteStyle>() {
    override val variations: Map<String, ComposeStyleReference<NoteStyle>> =
        mapOf(
            "ContentBeforeScalable.Default" to ComposeStyleReference { Note.ContentBeforeScalable.Default.style() },
            "ContentBeforeScalable.Positive" to ComposeStyleReference { Note.ContentBeforeScalable.Positive.style() },
            "ContentBeforeScalable.Negative" to ComposeStyleReference { Note.ContentBeforeScalable.Negative.style() },
            "ContentBeforeScalable.Warning" to ComposeStyleReference { Note.ContentBeforeScalable.Warning.style() },
            "ContentBeforeScalable.Info" to ComposeStyleReference { Note.ContentBeforeScalable.Info.style() },
            "ContentBeforeScalable.HasClose.Default" to ComposeStyleReference {
                Note.ContentBeforeScalable.HasClose.Default.style()
            },
            "ContentBeforeScalable.HasClose.Positive" to ComposeStyleReference {
                Note.ContentBeforeScalable.HasClose.Positive.style()
            },
            "ContentBeforeScalable.HasClose.Negative" to ComposeStyleReference {
                Note.ContentBeforeScalable.HasClose.Negative.style()
            },
            "ContentBeforeScalable.HasClose.Warning" to ComposeStyleReference {
                Note.ContentBeforeScalable.HasClose.Warning.style()
            },
            "ContentBeforeScalable.HasClose.Info" to ComposeStyleReference { Note.ContentBeforeScalable.HasClose.Info.style() },
            "ContentBeforeFixed.Default" to ComposeStyleReference { Note.ContentBeforeFixed.Default.style() },
            "ContentBeforeFixed.Positive" to ComposeStyleReference { Note.ContentBeforeFixed.Positive.style() },
            "ContentBeforeFixed.Negative" to ComposeStyleReference { Note.ContentBeforeFixed.Negative.style() },
            "ContentBeforeFixed.Warning" to ComposeStyleReference { Note.ContentBeforeFixed.Warning.style() },
            "ContentBeforeFixed.Info" to ComposeStyleReference { Note.ContentBeforeFixed.Info.style() },
            "ContentBeforeFixed.HasClose.Default" to ComposeStyleReference { Note.ContentBeforeFixed.HasClose.Default.style() },
            "ContentBeforeFixed.HasClose.Positive" to ComposeStyleReference { Note.ContentBeforeFixed.HasClose.Positive.style() },
            "ContentBeforeFixed.HasClose.Negative" to ComposeStyleReference { Note.ContentBeforeFixed.HasClose.Negative.style() },
            "ContentBeforeFixed.HasClose.Warning" to ComposeStyleReference { Note.ContentBeforeFixed.HasClose.Warning.style() },
            "ContentBeforeFixed.HasClose.Info" to ComposeStyleReference { Note.ContentBeforeFixed.HasClose.Info.style() },
        )
}
