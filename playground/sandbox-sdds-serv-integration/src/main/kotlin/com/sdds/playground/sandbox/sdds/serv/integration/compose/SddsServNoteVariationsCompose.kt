package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
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

internal object SddsServNoteVariationsCompose : ComposeStyleProvider<String, NoteStyle>() {
    override val variations: Map<String, @Composable () -> NoteStyle> =
        mapOf(
            "L.Default" to { Note.L.Default.style() },
            "L.Positive" to { Note.L.Positive.style() },
            "L.Negative" to { Note.L.Negative.style() },
            "L.Warning" to { Note.L.Warning.style() },
            "L.Info" to { Note.L.Info.style() },
            "L.HasClose.Default" to { Note.L.HasClose.Default.style() },
            "L.HasClose.Positive" to { Note.L.HasClose.Positive.style() },
            "L.HasClose.Negative" to { Note.L.HasClose.Negative.style() },
            "L.HasClose.Warning" to { Note.L.HasClose.Warning.style() },
            "L.HasClose.Info" to { Note.L.HasClose.Info.style() },
            "L.ContentScalable.Default" to { Note.L.ContentScalable.Default.style() },
            "L.ContentScalable.Positive" to { Note.L.ContentScalable.Positive.style() },
            "L.ContentScalable.Negative" to { Note.L.ContentScalable.Negative.style() },
            "L.ContentScalable.Warning" to { Note.L.ContentScalable.Warning.style() },
            "L.ContentScalable.Info" to { Note.L.ContentScalable.Info.style() },
            "L.HasCloseContentScalable.Default" to { Note.L.HasCloseContentScalable.Default.style() },
            "L.HasCloseContentScalable.Positive" to { Note.L.HasCloseContentScalable.Positive.style() },
            "L.HasCloseContentScalable.Negative" to { Note.L.HasCloseContentScalable.Negative.style() },
            "L.HasCloseContentScalable.Warning" to { Note.L.HasCloseContentScalable.Warning.style() },
            "L.HasCloseContentScalable.Info" to { Note.L.HasCloseContentScalable.Info.style() },
            "M.Default" to { Note.M.Default.style() },
            "M.Positive" to { Note.M.Positive.style() },
            "M.Negative" to { Note.M.Negative.style() },
            "M.Warning" to { Note.M.Warning.style() },
            "M.Info" to { Note.M.Info.style() },
            "M.HasClose.Default" to { Note.M.HasClose.Default.style() },
            "M.HasClose.Positive" to { Note.M.HasClose.Positive.style() },
            "M.HasClose.Negative" to { Note.M.HasClose.Negative.style() },
            "M.HasClose.Warning" to { Note.M.HasClose.Warning.style() },
            "M.HasClose.Info" to { Note.M.HasClose.Info.style() },
            "M.ContentScalable.Default" to { Note.M.ContentScalable.Default.style() },
            "M.ContentScalable.Positive" to { Note.M.ContentScalable.Positive.style() },
            "M.ContentScalable.Negative" to { Note.M.ContentScalable.Negative.style() },
            "M.ContentScalable.Warning" to { Note.M.ContentScalable.Warning.style() },
            "M.ContentScalable.Info" to { Note.M.ContentScalable.Info.style() },
            "M.HasCloseContentScalable.Default" to { Note.M.HasCloseContentScalable.Default.style() },
            "M.HasCloseContentScalable.Positive" to { Note.M.HasCloseContentScalable.Positive.style() },
            "M.HasCloseContentScalable.Negative" to { Note.M.HasCloseContentScalable.Negative.style() },
            "M.HasCloseContentScalable.Warning" to { Note.M.HasCloseContentScalable.Warning.style() },
            "M.HasCloseContentScalable.Info" to { Note.M.HasCloseContentScalable.Info.style() },
            "S.Default" to { Note.S.Default.style() },
            "S.Positive" to { Note.S.Positive.style() },
            "S.Negative" to { Note.S.Negative.style() },
            "S.Warning" to { Note.S.Warning.style() },
            "S.Info" to { Note.S.Info.style() },
            "S.HasClose.Default" to { Note.S.HasClose.Default.style() },
            "S.HasClose.Positive" to { Note.S.HasClose.Positive.style() },
            "S.HasClose.Negative" to { Note.S.HasClose.Negative.style() },
            "S.HasClose.Warning" to { Note.S.HasClose.Warning.style() },
            "S.HasClose.Info" to { Note.S.HasClose.Info.style() },
            "S.ContentScalable.Default" to { Note.S.ContentScalable.Default.style() },
            "S.ContentScalable.Positive" to { Note.S.ContentScalable.Positive.style() },
            "S.ContentScalable.Negative" to { Note.S.ContentScalable.Negative.style() },
            "S.ContentScalable.Warning" to { Note.S.ContentScalable.Warning.style() },
            "S.ContentScalable.Info" to { Note.S.ContentScalable.Info.style() },
            "S.HasCloseContentScalable.Default" to { Note.S.HasCloseContentScalable.Default.style() },
            "S.HasCloseContentScalable.Positive" to { Note.S.HasCloseContentScalable.Positive.style() },
            "S.HasCloseContentScalable.Negative" to { Note.S.HasCloseContentScalable.Negative.style() },
            "S.HasCloseContentScalable.Warning" to { Note.S.HasCloseContentScalable.Warning.style() },
            "S.HasCloseContentScalable.Info" to { Note.S.HasCloseContentScalable.Info.style() },
            "Xs.Default" to { Note.Xs.Default.style() },
            "Xs.Positive" to { Note.Xs.Positive.style() },
            "Xs.Negative" to { Note.Xs.Negative.style() },
            "Xs.Warning" to { Note.Xs.Warning.style() },
            "Xs.Info" to { Note.Xs.Info.style() },
            "Xs.HasClose.Default" to { Note.Xs.HasClose.Default.style() },
            "Xs.HasClose.Positive" to { Note.Xs.HasClose.Positive.style() },
            "Xs.HasClose.Negative" to { Note.Xs.HasClose.Negative.style() },
            "Xs.HasClose.Warning" to { Note.Xs.HasClose.Warning.style() },
            "Xs.HasClose.Info" to { Note.Xs.HasClose.Info.style() },
            "Xs.ContentScalable.Default" to { Note.Xs.ContentScalable.Default.style() },
            "Xs.ContentScalable.Positive" to { Note.Xs.ContentScalable.Positive.style() },
            "Xs.ContentScalable.Negative" to { Note.Xs.ContentScalable.Negative.style() },
            "Xs.ContentScalable.Warning" to { Note.Xs.ContentScalable.Warning.style() },
            "Xs.ContentScalable.Info" to { Note.Xs.ContentScalable.Info.style() },
            "Xs.HasCloseContentScalable.Default" to { Note.Xs.HasCloseContentScalable.Default.style() },
            "Xs.HasCloseContentScalable.Positive" to { Note.Xs.HasCloseContentScalable.Positive.style() },
            "Xs.HasCloseContentScalable.Negative" to { Note.Xs.HasCloseContentScalable.Negative.style() },
            "Xs.HasCloseContentScalable.Warning" to { Note.Xs.HasCloseContentScalable.Warning.style() },
            "Xs.HasCloseContentScalable.Info" to { Note.Xs.HasCloseContentScalable.Info.style() },
        )
}
