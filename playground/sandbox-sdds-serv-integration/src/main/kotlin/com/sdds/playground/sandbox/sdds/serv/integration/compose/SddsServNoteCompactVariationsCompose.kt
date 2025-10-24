package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.notecompact.ContentScalable
import com.sdds.serv.styles.notecompact.Default
import com.sdds.serv.styles.notecompact.HasClose
import com.sdds.serv.styles.notecompact.HasCloseContentScalable
import com.sdds.serv.styles.notecompact.Info
import com.sdds.serv.styles.notecompact.L
import com.sdds.serv.styles.notecompact.M
import com.sdds.serv.styles.notecompact.Negative
import com.sdds.serv.styles.notecompact.NoteCompact
import com.sdds.serv.styles.notecompact.Positive
import com.sdds.serv.styles.notecompact.S
import com.sdds.serv.styles.notecompact.Warning
import com.sdds.serv.styles.notecompact.Xs

internal object SddsServNoteCompactVariationsCompose : ComposeStyleProvider<String, NoteCompactStyle>() {
    override val variations: Map<String, @Composable () -> NoteCompactStyle> =
        mapOf(
            "L.Default" to { NoteCompact.L.Default.style() },
            "L.Positive" to { NoteCompact.L.Positive.style() },
            "L.Negative" to { NoteCompact.L.Negative.style() },
            "L.Warning" to { NoteCompact.L.Warning.style() },
            "L.Info" to { NoteCompact.L.Info.style() },
            "L.HasClose.Default" to { NoteCompact.L.HasClose.Default.style() },
            "L.HasClose.Positive" to { NoteCompact.L.HasClose.Positive.style() },
            "L.HasClose.Negative" to { NoteCompact.L.HasClose.Negative.style() },
            "L.HasClose.Warning" to { NoteCompact.L.HasClose.Warning.style() },
            "L.HasClose.Info" to { NoteCompact.L.HasClose.Info.style() },
            "L.ContentScalable.Default" to { NoteCompact.L.ContentScalable.Default.style() },
            "L.ContentScalable.Positive" to { NoteCompact.L.ContentScalable.Positive.style() },
            "L.ContentScalable.Negative" to { NoteCompact.L.ContentScalable.Negative.style() },
            "L.ContentScalable.Warning" to { NoteCompact.L.ContentScalable.Warning.style() },
            "L.ContentScalable.Info" to { NoteCompact.L.ContentScalable.Info.style() },
            "L.HasCloseContentScalable.Default" to { NoteCompact.L.HasCloseContentScalable.Default.style() },
            "L.HasCloseContentScalable.Positive" to { NoteCompact.L.HasCloseContentScalable.Positive.style() },
            "L.HasCloseContentScalable.Negative" to { NoteCompact.L.HasCloseContentScalable.Negative.style() },
            "L.HasCloseContentScalable.Warning" to { NoteCompact.L.HasCloseContentScalable.Warning.style() },
            "L.HasCloseContentScalable.Info" to { NoteCompact.L.HasCloseContentScalable.Info.style() },
            "M.Default" to { NoteCompact.M.Default.style() },
            "M.Positive" to { NoteCompact.M.Positive.style() },
            "M.Negative" to { NoteCompact.M.Negative.style() },
            "M.Warning" to { NoteCompact.M.Warning.style() },
            "M.Info" to { NoteCompact.M.Info.style() },
            "M.HasClose.Default" to { NoteCompact.M.HasClose.Default.style() },
            "M.HasClose.Positive" to { NoteCompact.M.HasClose.Positive.style() },
            "M.HasClose.Negative" to { NoteCompact.M.HasClose.Negative.style() },
            "M.HasClose.Warning" to { NoteCompact.M.HasClose.Warning.style() },
            "M.HasClose.Info" to { NoteCompact.M.HasClose.Info.style() },
            "M.ContentScalable.Default" to { NoteCompact.M.ContentScalable.Default.style() },
            "M.ContentScalable.Positive" to { NoteCompact.M.ContentScalable.Positive.style() },
            "M.ContentScalable.Negative" to { NoteCompact.M.ContentScalable.Negative.style() },
            "M.ContentScalable.Warning" to { NoteCompact.M.ContentScalable.Warning.style() },
            "M.ContentScalable.Info" to { NoteCompact.M.ContentScalable.Info.style() },
            "M.HasCloseContentScalable.Default" to { NoteCompact.M.HasCloseContentScalable.Default.style() },
            "M.HasCloseContentScalable.Positive" to { NoteCompact.M.HasCloseContentScalable.Positive.style() },
            "M.HasCloseContentScalable.Negative" to { NoteCompact.M.HasCloseContentScalable.Negative.style() },
            "M.HasCloseContentScalable.Warning" to { NoteCompact.M.HasCloseContentScalable.Warning.style() },
            "M.HasCloseContentScalable.Info" to { NoteCompact.M.HasCloseContentScalable.Info.style() },
            "S.Default" to { NoteCompact.S.Default.style() },
            "S.Positive" to { NoteCompact.S.Positive.style() },
            "S.Negative" to { NoteCompact.S.Negative.style() },
            "S.Warning" to { NoteCompact.S.Warning.style() },
            "S.Info" to { NoteCompact.S.Info.style() },
            "S.HasClose.Default" to { NoteCompact.S.HasClose.Default.style() },
            "S.HasClose.Positive" to { NoteCompact.S.HasClose.Positive.style() },
            "S.HasClose.Negative" to { NoteCompact.S.HasClose.Negative.style() },
            "S.HasClose.Warning" to { NoteCompact.S.HasClose.Warning.style() },
            "S.HasClose.Info" to { NoteCompact.S.HasClose.Info.style() },
            "S.ContentScalable.Default" to { NoteCompact.S.ContentScalable.Default.style() },
            "S.ContentScalable.Positive" to { NoteCompact.S.ContentScalable.Positive.style() },
            "S.ContentScalable.Negative" to { NoteCompact.S.ContentScalable.Negative.style() },
            "S.ContentScalable.Warning" to { NoteCompact.S.ContentScalable.Warning.style() },
            "S.ContentScalable.Info" to { NoteCompact.S.ContentScalable.Info.style() },
            "S.HasCloseContentScalable.Default" to { NoteCompact.S.HasCloseContentScalable.Default.style() },
            "S.HasCloseContentScalable.Positive" to { NoteCompact.S.HasCloseContentScalable.Positive.style() },
            "S.HasCloseContentScalable.Negative" to { NoteCompact.S.HasCloseContentScalable.Negative.style() },
            "S.HasCloseContentScalable.Warning" to { NoteCompact.S.HasCloseContentScalable.Warning.style() },
            "S.HasCloseContentScalable.Info" to { NoteCompact.S.HasCloseContentScalable.Info.style() },
            "Xs.Default" to { NoteCompact.Xs.Default.style() },
            "Xs.Positive" to { NoteCompact.Xs.Positive.style() },
            "Xs.Negative" to { NoteCompact.Xs.Negative.style() },
            "Xs.Warning" to { NoteCompact.Xs.Warning.style() },
            "Xs.Info" to { NoteCompact.Xs.Info.style() },
            "Xs.HasClose.Default" to { NoteCompact.Xs.HasClose.Default.style() },
            "Xs.HasClose.Positive" to { NoteCompact.Xs.HasClose.Positive.style() },
            "Xs.HasClose.Negative" to { NoteCompact.Xs.HasClose.Negative.style() },
            "Xs.HasClose.Warning" to { NoteCompact.Xs.HasClose.Warning.style() },
            "Xs.HasClose.Info" to { NoteCompact.Xs.HasClose.Info.style() },
            "Xs.ContentScalable.Default" to { NoteCompact.Xs.ContentScalable.Default.style() },
            "Xs.ContentScalable.Positive" to { NoteCompact.Xs.ContentScalable.Positive.style() },
            "Xs.ContentScalable.Negative" to { NoteCompact.Xs.ContentScalable.Negative.style() },
            "Xs.ContentScalable.Warning" to { NoteCompact.Xs.ContentScalable.Warning.style() },
            "Xs.ContentScalable.Info" to { NoteCompact.Xs.ContentScalable.Info.style() },
            "Xs.HasCloseContentScalable.Default" to { NoteCompact.Xs.HasCloseContentScalable.Default.style() },
            "Xs.HasCloseContentScalable.Positive" to { NoteCompact.Xs.HasCloseContentScalable.Positive.style() },
            "Xs.HasCloseContentScalable.Negative" to { NoteCompact.Xs.HasCloseContentScalable.Negative.style() },
            "Xs.HasCloseContentScalable.Warning" to { NoteCompact.Xs.HasCloseContentScalable.Warning.style() },
            "Xs.HasCloseContentScalable.Info" to { NoteCompact.Xs.HasCloseContentScalable.Info.style() },
        )
}
