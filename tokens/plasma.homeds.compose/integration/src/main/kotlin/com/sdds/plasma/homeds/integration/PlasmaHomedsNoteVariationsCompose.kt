// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
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
import com.sdds.plasma.homeds.styles.note.NoteContentBefore
import com.sdds.plasma.homeds.styles.note.NoteStyles
import com.sdds.plasma.homeds.styles.note.NoteView
import com.sdds.plasma.homeds.styles.note.Positive
import com.sdds.plasma.homeds.styles.note.Warning
import com.sdds.plasma.homeds.styles.note.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsNoteVariationsCompose : ComposeStyleProvider<NoteStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "contentBefore",
                value = "Fixed",
                variants = listOf("Fixed", "Scalable"),
            ),
            Property.BooleanProperty(name = "hasClose", value = false),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Positive", "Negative", "Warning", "Info"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<NoteStyle>> =
        mapOf(
            "Note.ContentBeforeScalable.Default" to ComposeStyleReference { Note.ContentBeforeScalable.Default.style() },
            "Note.ContentBeforeScalable.Positive" to ComposeStyleReference { Note.ContentBeforeScalable.Positive.style() },
            "Note.ContentBeforeScalable.Negative" to ComposeStyleReference { Note.ContentBeforeScalable.Negative.style() },
            "Note.ContentBeforeScalable.Warning" to ComposeStyleReference { Note.ContentBeforeScalable.Warning.style() },
            "Note.ContentBeforeScalable.Info" to ComposeStyleReference { Note.ContentBeforeScalable.Info.style() },
            "Note.ContentBeforeScalable.HasClose.Default" to ComposeStyleReference {
                Note.ContentBeforeScalable.HasClose.Default.style()
            },
            "Note.ContentBeforeScalable.HasClose.Positive" to ComposeStyleReference {
                Note.ContentBeforeScalable.HasClose.Positive.style()
            },
            "Note.ContentBeforeScalable.HasClose.Negative" to ComposeStyleReference {
                Note.ContentBeforeScalable.HasClose.Negative.style()
            },
            "Note.ContentBeforeScalable.HasClose.Warning" to ComposeStyleReference {
                Note.ContentBeforeScalable.HasClose.Warning.style()
            },
            "Note.ContentBeforeScalable.HasClose.Info" to ComposeStyleReference {
                Note.ContentBeforeScalable.HasClose.Info.style()
            },
            "Note.ContentBeforeFixed.Default" to ComposeStyleReference { Note.ContentBeforeFixed.Default.style() },
            "Note.ContentBeforeFixed.Positive" to ComposeStyleReference { Note.ContentBeforeFixed.Positive.style() },
            "Note.ContentBeforeFixed.Negative" to ComposeStyleReference { Note.ContentBeforeFixed.Negative.style() },
            "Note.ContentBeforeFixed.Warning" to ComposeStyleReference { Note.ContentBeforeFixed.Warning.style() },
            "Note.ContentBeforeFixed.Info" to ComposeStyleReference { Note.ContentBeforeFixed.Info.style() },
            "Note.ContentBeforeFixed.HasClose.Default" to ComposeStyleReference {
                Note.ContentBeforeFixed.HasClose.Default.style()
            },
            "Note.ContentBeforeFixed.HasClose.Positive" to ComposeStyleReference {
                Note.ContentBeforeFixed.HasClose.Positive.style()
            },
            "Note.ContentBeforeFixed.HasClose.Negative" to ComposeStyleReference {
                Note.ContentBeforeFixed.HasClose.Negative.style()
            },
            "Note.ContentBeforeFixed.HasClose.Warning" to ComposeStyleReference {
                Note.ContentBeforeFixed.HasClose.Warning.style()
            },
            "Note.ContentBeforeFixed.HasClose.Info" to ComposeStyleReference { Note.ContentBeforeFixed.HasClose.Info.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return NoteStyles.resolve(
            contentBefore = when (bindings["contentBefore"]?.toString()) {
                "Fixed" -> NoteContentBefore.Fixed
                "Scalable" -> NoteContentBefore.Scalable
                else -> NoteContentBefore.Fixed
            },
            hasClose = booleanBindingValue(bindings, "hasClose", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> NoteView.Default
                "Positive" -> NoteView.Positive
                "Negative" -> NoteView.Negative
                "Warning" -> NoteView.Warning
                "Info" -> NoteView.Info
                else -> NoteView.Default
            },
        ).key
    }
}
