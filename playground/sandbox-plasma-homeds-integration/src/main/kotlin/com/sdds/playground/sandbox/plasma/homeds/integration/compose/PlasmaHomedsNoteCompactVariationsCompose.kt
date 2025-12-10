package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.notecompact.ContentBeforeFixed
import com.sdds.plasma.homeds.styles.notecompact.ContentBeforeScalable
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
            "ContentBeforeFixed.Default" to { NoteCompact.ContentBeforeFixed.Default.style() },
            "ContentBeforeFixed.Positive" to { NoteCompact.ContentBeforeFixed.Positive.style() },
            "ContentBeforeFixed.Negative" to { NoteCompact.ContentBeforeFixed.Negative.style() },
            "ContentBeforeFixed.Warning" to { NoteCompact.ContentBeforeFixed.Warning.style() },
            "ContentBeforeFixed.Info" to { NoteCompact.ContentBeforeFixed.Info.style() },
            "ContentBeforeFixed.HasClose.Default" to { NoteCompact.ContentBeforeFixed.HasClose.Default.style() },
            "ContentBeforeFixed.HasClose.Positive" to { NoteCompact.ContentBeforeFixed.HasClose.Positive.style() },
            "ContentBeforeFixed.HasClose.Negative" to { NoteCompact.ContentBeforeFixed.HasClose.Negative.style() },
            "ContentBeforeFixed.HasClose.Warning" to { NoteCompact.ContentBeforeFixed.HasClose.Warning.style() },
            "ContentBeforeFixed.HasClose.Info" to { NoteCompact.ContentBeforeFixed.HasClose.Info.style() },
            "ContentBeforeScalable.Default" to { NoteCompact.ContentBeforeScalable.Default.style() },
            "ContentBeforeScalable.Positive" to { NoteCompact.ContentBeforeScalable.Positive.style() },
            "ContentBeforeScalable.Negative" to { NoteCompact.ContentBeforeScalable.Negative.style() },
            "ContentBeforeScalable.Warning" to { NoteCompact.ContentBeforeScalable.Warning.style() },
            "ContentBeforeScalable.Info" to { NoteCompact.ContentBeforeScalable.Info.style() },
            "ContentBeforeScalable.HasClose.Default" to { NoteCompact.ContentBeforeScalable.HasClose.Default.style() },
            "ContentBeforeScalable.HasClose.Positive" to { NoteCompact.ContentBeforeScalable.HasClose.Positive.style() },
            "ContentBeforeScalable.HasClose.Negative" to { NoteCompact.ContentBeforeScalable.HasClose.Negative.style() },
            "ContentBeforeScalable.HasClose.Warning" to { NoteCompact.ContentBeforeScalable.HasClose.Warning.style() },
            "ContentBeforeScalable.HasClose.Info" to { NoteCompact.ContentBeforeScalable.HasClose.Info.style() },
        )
}
