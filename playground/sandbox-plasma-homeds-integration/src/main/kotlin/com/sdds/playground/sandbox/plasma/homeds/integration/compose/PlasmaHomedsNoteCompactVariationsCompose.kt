package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.notecompact.ContentScalable
import com.sdds.plasma.homeds.styles.notecompact.Default
import com.sdds.plasma.homeds.styles.notecompact.HasClose
import com.sdds.plasma.homeds.styles.notecompact.Info
import com.sdds.plasma.homeds.styles.notecompact.Negative
import com.sdds.plasma.homeds.styles.notecompact.NoteCompact
import com.sdds.plasma.homeds.styles.notecompact.Positive
import com.sdds.plasma.homeds.styles.notecompact.Warning
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsNoteCompactVariationsCompose : ComposeStyleProvider<String, NoteCompactStyle>() {
    override val variations: Map<String, @Composable () -> NoteCompactStyle> =
        mapOf(
            "HasClose.Default" to { NoteCompact.HasClose.Default.style() },
            "HasClose.Positive" to { NoteCompact.HasClose.Positive.style() },
            "HasClose.Negative" to { NoteCompact.HasClose.Negative.style() },
            "HasClose.Warning" to { NoteCompact.HasClose.Warning.style() },
            "HasClose.Info" to { NoteCompact.HasClose.Info.style() },
            "HasClose.ContentScalable.Default" to { NoteCompact.HasClose.ContentScalable.Default.style() },
            "HasClose.ContentScalable.Positive" to { NoteCompact.HasClose.ContentScalable.Positive.style() },
            "HasClose.ContentScalable.Negative" to { NoteCompact.HasClose.ContentScalable.Negative.style() },
            "HasClose.ContentScalable.Warning" to { NoteCompact.HasClose.ContentScalable.Warning.style() },
            "HasClose.ContentScalable.Info" to { NoteCompact.HasClose.ContentScalable.Info.style() },
            "ContentScalable.Default" to { NoteCompact.ContentScalable.Default.style() },
            "ContentScalable.Positive" to { NoteCompact.ContentScalable.Positive.style() },
            "ContentScalable.Negative" to { NoteCompact.ContentScalable.Negative.style() },
            "ContentScalable.Warning" to { NoteCompact.ContentScalable.Warning.style() },
            "ContentScalable.Info" to { NoteCompact.ContentScalable.Info.style() },
        )
}
