// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
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

internal object PlasmaHomedsNoteCompactVariationsCompose : ComposeStyleProvider<NoteCompactStyle>() {
    override val variations: Map<String, ComposeStyleReference<NoteCompactStyle>> =
        mapOf(
            "ContentBeforeFixed.Default" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Default.style() },
            "ContentBeforeFixed.Positive" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Positive.style() },
            "ContentBeforeFixed.Negative" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Negative.style() },
            "ContentBeforeFixed.Warning" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Warning.style() },
            "ContentBeforeFixed.Info" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Info.style() },
            "ContentBeforeFixed.HasClose.Default" to ComposeStyleReference {
                NoteCompact.ContentBeforeFixed.HasClose.Default.style()
            },
            "ContentBeforeFixed.HasClose.Positive" to ComposeStyleReference {
                NoteCompact.ContentBeforeFixed.HasClose.Positive.style()
            },
            "ContentBeforeFixed.HasClose.Negative" to ComposeStyleReference {
                NoteCompact.ContentBeforeFixed.HasClose.Negative.style()
            },
            "ContentBeforeFixed.HasClose.Warning" to ComposeStyleReference {
                NoteCompact.ContentBeforeFixed.HasClose.Warning.style()
            },
            "ContentBeforeFixed.HasClose.Info" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.HasClose.Info.style() },
            "ContentBeforeScalable.Default" to ComposeStyleReference { NoteCompact.ContentBeforeScalable.Default.style() },
            "ContentBeforeScalable.Positive" to ComposeStyleReference { NoteCompact.ContentBeforeScalable.Positive.style() },
            "ContentBeforeScalable.Negative" to ComposeStyleReference { NoteCompact.ContentBeforeScalable.Negative.style() },
            "ContentBeforeScalable.Warning" to ComposeStyleReference { NoteCompact.ContentBeforeScalable.Warning.style() },
            "ContentBeforeScalable.Info" to ComposeStyleReference { NoteCompact.ContentBeforeScalable.Info.style() },
            "ContentBeforeScalable.HasClose.Default" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Default.style()
            },
            "ContentBeforeScalable.HasClose.Positive" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Positive.style()
            },
            "ContentBeforeScalable.HasClose.Negative" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Negative.style()
            },
            "ContentBeforeScalable.HasClose.Warning" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Warning.style()
            },
            "ContentBeforeScalable.HasClose.Info" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Info.style()
            },
        )
}
