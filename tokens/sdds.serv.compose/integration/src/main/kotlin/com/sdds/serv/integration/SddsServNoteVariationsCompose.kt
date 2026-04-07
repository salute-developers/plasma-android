// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.note.ContentScalable
import com.sdds.serv.styles.note.Default
import com.sdds.serv.styles.note.HasClose
import com.sdds.serv.styles.note.HasCloseContentScalable
import com.sdds.serv.styles.note.Info
import com.sdds.serv.styles.note.L
import com.sdds.serv.styles.note.M
import com.sdds.serv.styles.note.Negative
import com.sdds.serv.styles.note.Note
import com.sdds.serv.styles.note.Positive
import com.sdds.serv.styles.note.S
import com.sdds.serv.styles.note.Warning
import com.sdds.serv.styles.note.Xs

internal object SddsServNoteVariationsCompose : ComposeStyleProvider<NoteStyle>() {
    override val variations: Map<String, ComposeStyleReference<NoteStyle>> =
        mapOf(
            "L.Default" to ComposeStyleReference { Note.L.Default.style() },
            "L.Positive" to ComposeStyleReference { Note.L.Positive.style() },
            "L.Negative" to ComposeStyleReference { Note.L.Negative.style() },
            "L.Warning" to ComposeStyleReference { Note.L.Warning.style() },
            "L.Info" to ComposeStyleReference { Note.L.Info.style() },
            "L.HasClose.Default" to ComposeStyleReference { Note.L.HasClose.Default.style() },
            "L.HasClose.Positive" to ComposeStyleReference { Note.L.HasClose.Positive.style() },
            "L.HasClose.Negative" to ComposeStyleReference { Note.L.HasClose.Negative.style() },
            "L.HasClose.Warning" to ComposeStyleReference { Note.L.HasClose.Warning.style() },
            "L.HasClose.Info" to ComposeStyleReference { Note.L.HasClose.Info.style() },
            "L.ContentScalable.Default" to ComposeStyleReference { Note.L.ContentScalable.Default.style() },
            "L.ContentScalable.Positive" to ComposeStyleReference { Note.L.ContentScalable.Positive.style() },
            "L.ContentScalable.Negative" to ComposeStyleReference { Note.L.ContentScalable.Negative.style() },
            "L.ContentScalable.Warning" to ComposeStyleReference { Note.L.ContentScalable.Warning.style() },
            "L.ContentScalable.Info" to ComposeStyleReference { Note.L.ContentScalable.Info.style() },
            "L.HasCloseContentScalable.Default" to ComposeStyleReference { Note.L.HasCloseContentScalable.Default.style() },
            "L.HasCloseContentScalable.Positive" to ComposeStyleReference { Note.L.HasCloseContentScalable.Positive.style() },
            "L.HasCloseContentScalable.Negative" to ComposeStyleReference { Note.L.HasCloseContentScalable.Negative.style() },
            "L.HasCloseContentScalable.Warning" to ComposeStyleReference { Note.L.HasCloseContentScalable.Warning.style() },
            "L.HasCloseContentScalable.Info" to ComposeStyleReference { Note.L.HasCloseContentScalable.Info.style() },
            "M.Default" to ComposeStyleReference { Note.M.Default.style() },
            "M.Positive" to ComposeStyleReference { Note.M.Positive.style() },
            "M.Negative" to ComposeStyleReference { Note.M.Negative.style() },
            "M.Warning" to ComposeStyleReference { Note.M.Warning.style() },
            "M.Info" to ComposeStyleReference { Note.M.Info.style() },
            "M.HasClose.Default" to ComposeStyleReference { Note.M.HasClose.Default.style() },
            "M.HasClose.Positive" to ComposeStyleReference { Note.M.HasClose.Positive.style() },
            "M.HasClose.Negative" to ComposeStyleReference { Note.M.HasClose.Negative.style() },
            "M.HasClose.Warning" to ComposeStyleReference { Note.M.HasClose.Warning.style() },
            "M.HasClose.Info" to ComposeStyleReference { Note.M.HasClose.Info.style() },
            "M.ContentScalable.Default" to ComposeStyleReference { Note.M.ContentScalable.Default.style() },
            "M.ContentScalable.Positive" to ComposeStyleReference { Note.M.ContentScalable.Positive.style() },
            "M.ContentScalable.Negative" to ComposeStyleReference { Note.M.ContentScalable.Negative.style() },
            "M.ContentScalable.Warning" to ComposeStyleReference { Note.M.ContentScalable.Warning.style() },
            "M.ContentScalable.Info" to ComposeStyleReference { Note.M.ContentScalable.Info.style() },
            "M.HasCloseContentScalable.Default" to ComposeStyleReference { Note.M.HasCloseContentScalable.Default.style() },
            "M.HasCloseContentScalable.Positive" to ComposeStyleReference { Note.M.HasCloseContentScalable.Positive.style() },
            "M.HasCloseContentScalable.Negative" to ComposeStyleReference { Note.M.HasCloseContentScalable.Negative.style() },
            "M.HasCloseContentScalable.Warning" to ComposeStyleReference { Note.M.HasCloseContentScalable.Warning.style() },
            "M.HasCloseContentScalable.Info" to ComposeStyleReference { Note.M.HasCloseContentScalable.Info.style() },
            "S.Default" to ComposeStyleReference { Note.S.Default.style() },
            "S.Positive" to ComposeStyleReference { Note.S.Positive.style() },
            "S.Negative" to ComposeStyleReference { Note.S.Negative.style() },
            "S.Warning" to ComposeStyleReference { Note.S.Warning.style() },
            "S.Info" to ComposeStyleReference { Note.S.Info.style() },
            "S.HasClose.Default" to ComposeStyleReference { Note.S.HasClose.Default.style() },
            "S.HasClose.Positive" to ComposeStyleReference { Note.S.HasClose.Positive.style() },
            "S.HasClose.Negative" to ComposeStyleReference { Note.S.HasClose.Negative.style() },
            "S.HasClose.Warning" to ComposeStyleReference { Note.S.HasClose.Warning.style() },
            "S.HasClose.Info" to ComposeStyleReference { Note.S.HasClose.Info.style() },
            "S.ContentScalable.Default" to ComposeStyleReference { Note.S.ContentScalable.Default.style() },
            "S.ContentScalable.Positive" to ComposeStyleReference { Note.S.ContentScalable.Positive.style() },
            "S.ContentScalable.Negative" to ComposeStyleReference { Note.S.ContentScalable.Negative.style() },
            "S.ContentScalable.Warning" to ComposeStyleReference { Note.S.ContentScalable.Warning.style() },
            "S.ContentScalable.Info" to ComposeStyleReference { Note.S.ContentScalable.Info.style() },
            "S.HasCloseContentScalable.Default" to ComposeStyleReference { Note.S.HasCloseContentScalable.Default.style() },
            "S.HasCloseContentScalable.Positive" to ComposeStyleReference { Note.S.HasCloseContentScalable.Positive.style() },
            "S.HasCloseContentScalable.Negative" to ComposeStyleReference { Note.S.HasCloseContentScalable.Negative.style() },
            "S.HasCloseContentScalable.Warning" to ComposeStyleReference { Note.S.HasCloseContentScalable.Warning.style() },
            "S.HasCloseContentScalable.Info" to ComposeStyleReference { Note.S.HasCloseContentScalable.Info.style() },
            "Xs.Default" to ComposeStyleReference { Note.Xs.Default.style() },
            "Xs.Positive" to ComposeStyleReference { Note.Xs.Positive.style() },
            "Xs.Negative" to ComposeStyleReference { Note.Xs.Negative.style() },
            "Xs.Warning" to ComposeStyleReference { Note.Xs.Warning.style() },
            "Xs.Info" to ComposeStyleReference { Note.Xs.Info.style() },
            "Xs.HasClose.Default" to ComposeStyleReference { Note.Xs.HasClose.Default.style() },
            "Xs.HasClose.Positive" to ComposeStyleReference { Note.Xs.HasClose.Positive.style() },
            "Xs.HasClose.Negative" to ComposeStyleReference { Note.Xs.HasClose.Negative.style() },
            "Xs.HasClose.Warning" to ComposeStyleReference { Note.Xs.HasClose.Warning.style() },
            "Xs.HasClose.Info" to ComposeStyleReference { Note.Xs.HasClose.Info.style() },
            "Xs.ContentScalable.Default" to ComposeStyleReference { Note.Xs.ContentScalable.Default.style() },
            "Xs.ContentScalable.Positive" to ComposeStyleReference { Note.Xs.ContentScalable.Positive.style() },
            "Xs.ContentScalable.Negative" to ComposeStyleReference { Note.Xs.ContentScalable.Negative.style() },
            "Xs.ContentScalable.Warning" to ComposeStyleReference { Note.Xs.ContentScalable.Warning.style() },
            "Xs.ContentScalable.Info" to ComposeStyleReference { Note.Xs.ContentScalable.Info.style() },
            "Xs.HasCloseContentScalable.Default" to ComposeStyleReference { Note.Xs.HasCloseContentScalable.Default.style() },
            "Xs.HasCloseContentScalable.Positive" to ComposeStyleReference { Note.Xs.HasCloseContentScalable.Positive.style() },
            "Xs.HasCloseContentScalable.Negative" to ComposeStyleReference { Note.Xs.HasCloseContentScalable.Negative.style() },
            "Xs.HasCloseContentScalable.Warning" to ComposeStyleReference { Note.Xs.HasCloseContentScalable.Warning.style() },
            "Xs.HasCloseContentScalable.Info" to ComposeStyleReference { Note.Xs.HasCloseContentScalable.Info.style() },
        )
}
