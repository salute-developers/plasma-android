// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.style.style
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

internal object SddsServNoteCompactVariationsCompose : ComposeStyleProvider<NoteCompactStyle>() {
    override val variations: Map<String, ComposeStyleReference<NoteCompactStyle>> =
        mapOf(
            "L.Default" to ComposeStyleReference { NoteCompact.L.Default.style() },
            "L.Positive" to ComposeStyleReference { NoteCompact.L.Positive.style() },
            "L.Negative" to ComposeStyleReference { NoteCompact.L.Negative.style() },
            "L.Warning" to ComposeStyleReference { NoteCompact.L.Warning.style() },
            "L.Info" to ComposeStyleReference { NoteCompact.L.Info.style() },
            "L.HasClose.Default" to ComposeStyleReference { NoteCompact.L.HasClose.Default.style() },
            "L.HasClose.Positive" to ComposeStyleReference { NoteCompact.L.HasClose.Positive.style() },
            "L.HasClose.Negative" to ComposeStyleReference { NoteCompact.L.HasClose.Negative.style() },
            "L.HasClose.Warning" to ComposeStyleReference { NoteCompact.L.HasClose.Warning.style() },
            "L.HasClose.Info" to ComposeStyleReference { NoteCompact.L.HasClose.Info.style() },
            "L.ContentScalable.Default" to ComposeStyleReference { NoteCompact.L.ContentScalable.Default.style() },
            "L.ContentScalable.Positive" to ComposeStyleReference { NoteCompact.L.ContentScalable.Positive.style() },
            "L.ContentScalable.Negative" to ComposeStyleReference { NoteCompact.L.ContentScalable.Negative.style() },
            "L.ContentScalable.Warning" to ComposeStyleReference { NoteCompact.L.ContentScalable.Warning.style() },
            "L.ContentScalable.Info" to ComposeStyleReference { NoteCompact.L.ContentScalable.Info.style() },
            "L.HasCloseContentScalable.Default" to ComposeStyleReference { NoteCompact.L.HasCloseContentScalable.Default.style() },
            "L.HasCloseContentScalable.Positive" to ComposeStyleReference {
                NoteCompact.L.HasCloseContentScalable.Positive.style()
            },
            "L.HasCloseContentScalable.Negative" to ComposeStyleReference {
                NoteCompact.L.HasCloseContentScalable.Negative.style()
            },
            "L.HasCloseContentScalable.Warning" to ComposeStyleReference { NoteCompact.L.HasCloseContentScalable.Warning.style() },
            "L.HasCloseContentScalable.Info" to ComposeStyleReference { NoteCompact.L.HasCloseContentScalable.Info.style() },
            "M.Default" to ComposeStyleReference { NoteCompact.M.Default.style() },
            "M.Positive" to ComposeStyleReference { NoteCompact.M.Positive.style() },
            "M.Negative" to ComposeStyleReference { NoteCompact.M.Negative.style() },
            "M.Warning" to ComposeStyleReference { NoteCompact.M.Warning.style() },
            "M.Info" to ComposeStyleReference { NoteCompact.M.Info.style() },
            "M.HasClose.Default" to ComposeStyleReference { NoteCompact.M.HasClose.Default.style() },
            "M.HasClose.Positive" to ComposeStyleReference { NoteCompact.M.HasClose.Positive.style() },
            "M.HasClose.Negative" to ComposeStyleReference { NoteCompact.M.HasClose.Negative.style() },
            "M.HasClose.Warning" to ComposeStyleReference { NoteCompact.M.HasClose.Warning.style() },
            "M.HasClose.Info" to ComposeStyleReference { NoteCompact.M.HasClose.Info.style() },
            "M.ContentScalable.Default" to ComposeStyleReference { NoteCompact.M.ContentScalable.Default.style() },
            "M.ContentScalable.Positive" to ComposeStyleReference { NoteCompact.M.ContentScalable.Positive.style() },
            "M.ContentScalable.Negative" to ComposeStyleReference { NoteCompact.M.ContentScalable.Negative.style() },
            "M.ContentScalable.Warning" to ComposeStyleReference { NoteCompact.M.ContentScalable.Warning.style() },
            "M.ContentScalable.Info" to ComposeStyleReference { NoteCompact.M.ContentScalable.Info.style() },
            "M.HasCloseContentScalable.Default" to ComposeStyleReference { NoteCompact.M.HasCloseContentScalable.Default.style() },
            "M.HasCloseContentScalable.Positive" to ComposeStyleReference {
                NoteCompact.M.HasCloseContentScalable.Positive.style()
            },
            "M.HasCloseContentScalable.Negative" to ComposeStyleReference {
                NoteCompact.M.HasCloseContentScalable.Negative.style()
            },
            "M.HasCloseContentScalable.Warning" to ComposeStyleReference { NoteCompact.M.HasCloseContentScalable.Warning.style() },
            "M.HasCloseContentScalable.Info" to ComposeStyleReference { NoteCompact.M.HasCloseContentScalable.Info.style() },
            "S.Default" to ComposeStyleReference { NoteCompact.S.Default.style() },
            "S.Positive" to ComposeStyleReference { NoteCompact.S.Positive.style() },
            "S.Negative" to ComposeStyleReference { NoteCompact.S.Negative.style() },
            "S.Warning" to ComposeStyleReference { NoteCompact.S.Warning.style() },
            "S.Info" to ComposeStyleReference { NoteCompact.S.Info.style() },
            "S.HasClose.Default" to ComposeStyleReference { NoteCompact.S.HasClose.Default.style() },
            "S.HasClose.Positive" to ComposeStyleReference { NoteCompact.S.HasClose.Positive.style() },
            "S.HasClose.Negative" to ComposeStyleReference { NoteCompact.S.HasClose.Negative.style() },
            "S.HasClose.Warning" to ComposeStyleReference { NoteCompact.S.HasClose.Warning.style() },
            "S.HasClose.Info" to ComposeStyleReference { NoteCompact.S.HasClose.Info.style() },
            "S.ContentScalable.Default" to ComposeStyleReference { NoteCompact.S.ContentScalable.Default.style() },
            "S.ContentScalable.Positive" to ComposeStyleReference { NoteCompact.S.ContentScalable.Positive.style() },
            "S.ContentScalable.Negative" to ComposeStyleReference { NoteCompact.S.ContentScalable.Negative.style() },
            "S.ContentScalable.Warning" to ComposeStyleReference { NoteCompact.S.ContentScalable.Warning.style() },
            "S.ContentScalable.Info" to ComposeStyleReference { NoteCompact.S.ContentScalable.Info.style() },
            "S.HasCloseContentScalable.Default" to ComposeStyleReference { NoteCompact.S.HasCloseContentScalable.Default.style() },
            "S.HasCloseContentScalable.Positive" to ComposeStyleReference {
                NoteCompact.S.HasCloseContentScalable.Positive.style()
            },
            "S.HasCloseContentScalable.Negative" to ComposeStyleReference {
                NoteCompact.S.HasCloseContentScalable.Negative.style()
            },
            "S.HasCloseContentScalable.Warning" to ComposeStyleReference { NoteCompact.S.HasCloseContentScalable.Warning.style() },
            "S.HasCloseContentScalable.Info" to ComposeStyleReference { NoteCompact.S.HasCloseContentScalable.Info.style() },
            "Xs.Default" to ComposeStyleReference { NoteCompact.Xs.Default.style() },
            "Xs.Positive" to ComposeStyleReference { NoteCompact.Xs.Positive.style() },
            "Xs.Negative" to ComposeStyleReference { NoteCompact.Xs.Negative.style() },
            "Xs.Warning" to ComposeStyleReference { NoteCompact.Xs.Warning.style() },
            "Xs.Info" to ComposeStyleReference { NoteCompact.Xs.Info.style() },
            "Xs.HasClose.Default" to ComposeStyleReference { NoteCompact.Xs.HasClose.Default.style() },
            "Xs.HasClose.Positive" to ComposeStyleReference { NoteCompact.Xs.HasClose.Positive.style() },
            "Xs.HasClose.Negative" to ComposeStyleReference { NoteCompact.Xs.HasClose.Negative.style() },
            "Xs.HasClose.Warning" to ComposeStyleReference { NoteCompact.Xs.HasClose.Warning.style() },
            "Xs.HasClose.Info" to ComposeStyleReference { NoteCompact.Xs.HasClose.Info.style() },
            "Xs.ContentScalable.Default" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Default.style() },
            "Xs.ContentScalable.Positive" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Positive.style() },
            "Xs.ContentScalable.Negative" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Negative.style() },
            "Xs.ContentScalable.Warning" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Warning.style() },
            "Xs.ContentScalable.Info" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Info.style() },
            "Xs.HasCloseContentScalable.Default" to ComposeStyleReference {
                NoteCompact.Xs.HasCloseContentScalable.Default.style()
            },
            "Xs.HasCloseContentScalable.Positive" to ComposeStyleReference {
                NoteCompact.Xs.HasCloseContentScalable.Positive.style()
            },
            "Xs.HasCloseContentScalable.Negative" to ComposeStyleReference {
                NoteCompact.Xs.HasCloseContentScalable.Negative.style()
            },
            "Xs.HasCloseContentScalable.Warning" to ComposeStyleReference {
                NoteCompact.Xs.HasCloseContentScalable.Warning.style()
            },
            "Xs.HasCloseContentScalable.Info" to ComposeStyleReference { NoteCompact.Xs.HasCloseContentScalable.Info.style() },
        )
}
