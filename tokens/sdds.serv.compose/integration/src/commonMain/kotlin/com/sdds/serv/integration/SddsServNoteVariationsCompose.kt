// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.note.ContentScalable
import com.sdds.serv.styles.note.Default
import com.sdds.serv.styles.note.HasClose
import com.sdds.serv.styles.note.HasCloseContentScalable
import com.sdds.serv.styles.note.Info
import com.sdds.serv.styles.note.L
import com.sdds.serv.styles.note.M
import com.sdds.serv.styles.note.Negative
import com.sdds.serv.styles.note.Note
import com.sdds.serv.styles.note.NoteContentBefore
import com.sdds.serv.styles.note.NoteSize
import com.sdds.serv.styles.note.NoteStyles
import com.sdds.serv.styles.note.NoteView
import com.sdds.serv.styles.note.Positive
import com.sdds.serv.styles.note.S
import com.sdds.serv.styles.note.Warning
import com.sdds.serv.styles.note.Xs
import com.sdds.serv.styles.note.resolve

internal object SddsServNoteVariationsCompose : ComposeStyleProvider<NoteStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
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
            "Note.L.Default" to ComposeStyleReference { Note.L.Default.style() },
            "Note.L.Positive" to ComposeStyleReference { Note.L.Positive.style() },
            "Note.L.Negative" to ComposeStyleReference { Note.L.Negative.style() },
            "Note.L.Warning" to ComposeStyleReference { Note.L.Warning.style() },
            "Note.L.Info" to ComposeStyleReference { Note.L.Info.style() },
            "Note.L.HasClose.Default" to ComposeStyleReference { Note.L.HasClose.Default.style() },
            "Note.L.HasClose.Positive" to ComposeStyleReference { Note.L.HasClose.Positive.style() },
            "Note.L.HasClose.Negative" to ComposeStyleReference { Note.L.HasClose.Negative.style() },
            "Note.L.HasClose.Warning" to ComposeStyleReference { Note.L.HasClose.Warning.style() },
            "Note.L.HasClose.Info" to ComposeStyleReference { Note.L.HasClose.Info.style() },
            "Note.L.ContentScalable.Default" to ComposeStyleReference { Note.L.ContentScalable.Default.style() },
            "Note.L.ContentScalable.Positive" to ComposeStyleReference { Note.L.ContentScalable.Positive.style() },
            "Note.L.ContentScalable.Negative" to ComposeStyleReference { Note.L.ContentScalable.Negative.style() },
            "Note.L.ContentScalable.Warning" to ComposeStyleReference { Note.L.ContentScalable.Warning.style() },
            "Note.L.ContentScalable.Info" to ComposeStyleReference { Note.L.ContentScalable.Info.style() },
            "Note.L.HasCloseContentScalable.Default" to ComposeStyleReference { Note.L.HasCloseContentScalable.Default.style() },
            "Note.L.HasCloseContentScalable.Positive" to ComposeStyleReference { Note.L.HasCloseContentScalable.Positive.style() },
            "Note.L.HasCloseContentScalable.Negative" to ComposeStyleReference { Note.L.HasCloseContentScalable.Negative.style() },
            "Note.L.HasCloseContentScalable.Warning" to ComposeStyleReference { Note.L.HasCloseContentScalable.Warning.style() },
            "Note.L.HasCloseContentScalable.Info" to ComposeStyleReference { Note.L.HasCloseContentScalable.Info.style() },
            "Note.M.Default" to ComposeStyleReference { Note.M.Default.style() },
            "Note.M.Positive" to ComposeStyleReference { Note.M.Positive.style() },
            "Note.M.Negative" to ComposeStyleReference { Note.M.Negative.style() },
            "Note.M.Warning" to ComposeStyleReference { Note.M.Warning.style() },
            "Note.M.Info" to ComposeStyleReference { Note.M.Info.style() },
            "Note.M.HasClose.Default" to ComposeStyleReference { Note.M.HasClose.Default.style() },
            "Note.M.HasClose.Positive" to ComposeStyleReference { Note.M.HasClose.Positive.style() },
            "Note.M.HasClose.Negative" to ComposeStyleReference { Note.M.HasClose.Negative.style() },
            "Note.M.HasClose.Warning" to ComposeStyleReference { Note.M.HasClose.Warning.style() },
            "Note.M.HasClose.Info" to ComposeStyleReference { Note.M.HasClose.Info.style() },
            "Note.M.ContentScalable.Default" to ComposeStyleReference { Note.M.ContentScalable.Default.style() },
            "Note.M.ContentScalable.Positive" to ComposeStyleReference { Note.M.ContentScalable.Positive.style() },
            "Note.M.ContentScalable.Negative" to ComposeStyleReference { Note.M.ContentScalable.Negative.style() },
            "Note.M.ContentScalable.Warning" to ComposeStyleReference { Note.M.ContentScalable.Warning.style() },
            "Note.M.ContentScalable.Info" to ComposeStyleReference { Note.M.ContentScalable.Info.style() },
            "Note.M.HasCloseContentScalable.Default" to ComposeStyleReference { Note.M.HasCloseContentScalable.Default.style() },
            "Note.M.HasCloseContentScalable.Positive" to ComposeStyleReference { Note.M.HasCloseContentScalable.Positive.style() },
            "Note.M.HasCloseContentScalable.Negative" to ComposeStyleReference { Note.M.HasCloseContentScalable.Negative.style() },
            "Note.M.HasCloseContentScalable.Warning" to ComposeStyleReference { Note.M.HasCloseContentScalable.Warning.style() },
            "Note.M.HasCloseContentScalable.Info" to ComposeStyleReference { Note.M.HasCloseContentScalable.Info.style() },
            "Note.S.Default" to ComposeStyleReference { Note.S.Default.style() },
            "Note.S.Positive" to ComposeStyleReference { Note.S.Positive.style() },
            "Note.S.Negative" to ComposeStyleReference { Note.S.Negative.style() },
            "Note.S.Warning" to ComposeStyleReference { Note.S.Warning.style() },
            "Note.S.Info" to ComposeStyleReference { Note.S.Info.style() },
            "Note.S.HasClose.Default" to ComposeStyleReference { Note.S.HasClose.Default.style() },
            "Note.S.HasClose.Positive" to ComposeStyleReference { Note.S.HasClose.Positive.style() },
            "Note.S.HasClose.Negative" to ComposeStyleReference { Note.S.HasClose.Negative.style() },
            "Note.S.HasClose.Warning" to ComposeStyleReference { Note.S.HasClose.Warning.style() },
            "Note.S.HasClose.Info" to ComposeStyleReference { Note.S.HasClose.Info.style() },
            "Note.S.ContentScalable.Default" to ComposeStyleReference { Note.S.ContentScalable.Default.style() },
            "Note.S.ContentScalable.Positive" to ComposeStyleReference { Note.S.ContentScalable.Positive.style() },
            "Note.S.ContentScalable.Negative" to ComposeStyleReference { Note.S.ContentScalable.Negative.style() },
            "Note.S.ContentScalable.Warning" to ComposeStyleReference { Note.S.ContentScalable.Warning.style() },
            "Note.S.ContentScalable.Info" to ComposeStyleReference { Note.S.ContentScalable.Info.style() },
            "Note.S.HasCloseContentScalable.Default" to ComposeStyleReference { Note.S.HasCloseContentScalable.Default.style() },
            "Note.S.HasCloseContentScalable.Positive" to ComposeStyleReference { Note.S.HasCloseContentScalable.Positive.style() },
            "Note.S.HasCloseContentScalable.Negative" to ComposeStyleReference { Note.S.HasCloseContentScalable.Negative.style() },
            "Note.S.HasCloseContentScalable.Warning" to ComposeStyleReference { Note.S.HasCloseContentScalable.Warning.style() },
            "Note.S.HasCloseContentScalable.Info" to ComposeStyleReference { Note.S.HasCloseContentScalable.Info.style() },
            "Note.Xs.Default" to ComposeStyleReference { Note.Xs.Default.style() },
            "Note.Xs.Positive" to ComposeStyleReference { Note.Xs.Positive.style() },
            "Note.Xs.Negative" to ComposeStyleReference { Note.Xs.Negative.style() },
            "Note.Xs.Warning" to ComposeStyleReference { Note.Xs.Warning.style() },
            "Note.Xs.Info" to ComposeStyleReference { Note.Xs.Info.style() },
            "Note.Xs.HasClose.Default" to ComposeStyleReference { Note.Xs.HasClose.Default.style() },
            "Note.Xs.HasClose.Positive" to ComposeStyleReference { Note.Xs.HasClose.Positive.style() },
            "Note.Xs.HasClose.Negative" to ComposeStyleReference { Note.Xs.HasClose.Negative.style() },
            "Note.Xs.HasClose.Warning" to ComposeStyleReference { Note.Xs.HasClose.Warning.style() },
            "Note.Xs.HasClose.Info" to ComposeStyleReference { Note.Xs.HasClose.Info.style() },
            "Note.Xs.ContentScalable.Default" to ComposeStyleReference { Note.Xs.ContentScalable.Default.style() },
            "Note.Xs.ContentScalable.Positive" to ComposeStyleReference { Note.Xs.ContentScalable.Positive.style() },
            "Note.Xs.ContentScalable.Negative" to ComposeStyleReference { Note.Xs.ContentScalable.Negative.style() },
            "Note.Xs.ContentScalable.Warning" to ComposeStyleReference { Note.Xs.ContentScalable.Warning.style() },
            "Note.Xs.ContentScalable.Info" to ComposeStyleReference { Note.Xs.ContentScalable.Info.style() },
            "Note.Xs.HasCloseContentScalable.Default" to ComposeStyleReference { Note.Xs.HasCloseContentScalable.Default.style() },
            "Note.Xs.HasCloseContentScalable.Positive" to ComposeStyleReference {
                Note.Xs.HasCloseContentScalable.Positive.style()
            },
            "Note.Xs.HasCloseContentScalable.Negative" to ComposeStyleReference {
                Note.Xs.HasCloseContentScalable.Negative.style()
            },
            "Note.Xs.HasCloseContentScalable.Warning" to ComposeStyleReference { Note.Xs.HasCloseContentScalable.Warning.style() },
            "Note.Xs.HasCloseContentScalable.Info" to ComposeStyleReference { Note.Xs.HasCloseContentScalable.Info.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return NoteStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> NoteSize.L
                "M" -> NoteSize.M
                "S" -> NoteSize.S
                "Xs" -> NoteSize.Xs
                else -> NoteSize.L
            },
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
