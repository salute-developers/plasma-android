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
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.notecompact.ContentScalable
import com.sdds.serv.styles.notecompact.Default
import com.sdds.serv.styles.notecompact.HasClose
import com.sdds.serv.styles.notecompact.HasCloseContentScalable
import com.sdds.serv.styles.notecompact.Info
import com.sdds.serv.styles.notecompact.L
import com.sdds.serv.styles.notecompact.M
import com.sdds.serv.styles.notecompact.Negative
import com.sdds.serv.styles.notecompact.NoteCompact
import com.sdds.serv.styles.notecompact.NoteCompactContentBefore
import com.sdds.serv.styles.notecompact.NoteCompactSize
import com.sdds.serv.styles.notecompact.NoteCompactStyles
import com.sdds.serv.styles.notecompact.NoteCompactView
import com.sdds.serv.styles.notecompact.Positive
import com.sdds.serv.styles.notecompact.S
import com.sdds.serv.styles.notecompact.Warning
import com.sdds.serv.styles.notecompact.Xs
import com.sdds.serv.styles.notecompact.resolve

internal object SddsServNoteCompactVariationsCompose : ComposeStyleProvider<NoteCompactStyle>() {
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

    override val variations: Map<String, ComposeStyleReference<NoteCompactStyle>> =
        mapOf(
            "NoteCompact.L.Default" to ComposeStyleReference { NoteCompact.L.Default.style() },
            "NoteCompact.L.Positive" to ComposeStyleReference { NoteCompact.L.Positive.style() },
            "NoteCompact.L.Negative" to ComposeStyleReference { NoteCompact.L.Negative.style() },
            "NoteCompact.L.Warning" to ComposeStyleReference { NoteCompact.L.Warning.style() },
            "NoteCompact.L.Info" to ComposeStyleReference { NoteCompact.L.Info.style() },
            "NoteCompact.L.HasClose.Default" to ComposeStyleReference { NoteCompact.L.HasClose.Default.style() },
            "NoteCompact.L.HasClose.Positive" to ComposeStyleReference { NoteCompact.L.HasClose.Positive.style() },
            "NoteCompact.L.HasClose.Negative" to ComposeStyleReference { NoteCompact.L.HasClose.Negative.style() },
            "NoteCompact.L.HasClose.Warning" to ComposeStyleReference { NoteCompact.L.HasClose.Warning.style() },
            "NoteCompact.L.HasClose.Info" to ComposeStyleReference { NoteCompact.L.HasClose.Info.style() },
            "NoteCompact.L.ContentScalable.Default" to ComposeStyleReference { NoteCompact.L.ContentScalable.Default.style() },
            "NoteCompact.L.ContentScalable.Positive" to ComposeStyleReference { NoteCompact.L.ContentScalable.Positive.style() },
            "NoteCompact.L.ContentScalable.Negative" to ComposeStyleReference { NoteCompact.L.ContentScalable.Negative.style() },
            "NoteCompact.L.ContentScalable.Warning" to ComposeStyleReference { NoteCompact.L.ContentScalable.Warning.style() },
            "NoteCompact.L.ContentScalable.Info" to ComposeStyleReference { NoteCompact.L.ContentScalable.Info.style() },
            "NoteCompact.L.HasCloseContentScalable.Default" to ComposeStyleReference {
                NoteCompact.L.HasCloseContentScalable.Default.style()
            },
            "NoteCompact.L.HasCloseContentScalable.Positive" to ComposeStyleReference {
                NoteCompact.L.HasCloseContentScalable.Positive.style()
            },
            "NoteCompact.L.HasCloseContentScalable.Negative" to ComposeStyleReference {
                NoteCompact.L.HasCloseContentScalable.Negative.style()
            },
            "NoteCompact.L.HasCloseContentScalable.Warning" to ComposeStyleReference {
                NoteCompact.L.HasCloseContentScalable.Warning.style()
            },
            "NoteCompact.L.HasCloseContentScalable.Info" to ComposeStyleReference {
                NoteCompact.L.HasCloseContentScalable.Info.style()
            },
            "NoteCompact.M.Default" to ComposeStyleReference { NoteCompact.M.Default.style() },
            "NoteCompact.M.Positive" to ComposeStyleReference { NoteCompact.M.Positive.style() },
            "NoteCompact.M.Negative" to ComposeStyleReference { NoteCompact.M.Negative.style() },
            "NoteCompact.M.Warning" to ComposeStyleReference { NoteCompact.M.Warning.style() },
            "NoteCompact.M.Info" to ComposeStyleReference { NoteCompact.M.Info.style() },
            "NoteCompact.M.HasClose.Default" to ComposeStyleReference { NoteCompact.M.HasClose.Default.style() },
            "NoteCompact.M.HasClose.Positive" to ComposeStyleReference { NoteCompact.M.HasClose.Positive.style() },
            "NoteCompact.M.HasClose.Negative" to ComposeStyleReference { NoteCompact.M.HasClose.Negative.style() },
            "NoteCompact.M.HasClose.Warning" to ComposeStyleReference { NoteCompact.M.HasClose.Warning.style() },
            "NoteCompact.M.HasClose.Info" to ComposeStyleReference { NoteCompact.M.HasClose.Info.style() },
            "NoteCompact.M.ContentScalable.Default" to ComposeStyleReference { NoteCompact.M.ContentScalable.Default.style() },
            "NoteCompact.M.ContentScalable.Positive" to ComposeStyleReference { NoteCompact.M.ContentScalable.Positive.style() },
            "NoteCompact.M.ContentScalable.Negative" to ComposeStyleReference { NoteCompact.M.ContentScalable.Negative.style() },
            "NoteCompact.M.ContentScalable.Warning" to ComposeStyleReference { NoteCompact.M.ContentScalable.Warning.style() },
            "NoteCompact.M.ContentScalable.Info" to ComposeStyleReference { NoteCompact.M.ContentScalable.Info.style() },
            "NoteCompact.M.HasCloseContentScalable.Default" to ComposeStyleReference {
                NoteCompact.M.HasCloseContentScalable.Default.style()
            },
            "NoteCompact.M.HasCloseContentScalable.Positive" to ComposeStyleReference {
                NoteCompact.M.HasCloseContentScalable.Positive.style()
            },
            "NoteCompact.M.HasCloseContentScalable.Negative" to ComposeStyleReference {
                NoteCompact.M.HasCloseContentScalable.Negative.style()
            },
            "NoteCompact.M.HasCloseContentScalable.Warning" to ComposeStyleReference {
                NoteCompact.M.HasCloseContentScalable.Warning.style()
            },
            "NoteCompact.M.HasCloseContentScalable.Info" to ComposeStyleReference {
                NoteCompact.M.HasCloseContentScalable.Info.style()
            },
            "NoteCompact.S.Default" to ComposeStyleReference { NoteCompact.S.Default.style() },
            "NoteCompact.S.Positive" to ComposeStyleReference { NoteCompact.S.Positive.style() },
            "NoteCompact.S.Negative" to ComposeStyleReference { NoteCompact.S.Negative.style() },
            "NoteCompact.S.Warning" to ComposeStyleReference { NoteCompact.S.Warning.style() },
            "NoteCompact.S.Info" to ComposeStyleReference { NoteCompact.S.Info.style() },
            "NoteCompact.S.HasClose.Default" to ComposeStyleReference { NoteCompact.S.HasClose.Default.style() },
            "NoteCompact.S.HasClose.Positive" to ComposeStyleReference { NoteCompact.S.HasClose.Positive.style() },
            "NoteCompact.S.HasClose.Negative" to ComposeStyleReference { NoteCompact.S.HasClose.Negative.style() },
            "NoteCompact.S.HasClose.Warning" to ComposeStyleReference { NoteCompact.S.HasClose.Warning.style() },
            "NoteCompact.S.HasClose.Info" to ComposeStyleReference { NoteCompact.S.HasClose.Info.style() },
            "NoteCompact.S.ContentScalable.Default" to ComposeStyleReference { NoteCompact.S.ContentScalable.Default.style() },
            "NoteCompact.S.ContentScalable.Positive" to ComposeStyleReference { NoteCompact.S.ContentScalable.Positive.style() },
            "NoteCompact.S.ContentScalable.Negative" to ComposeStyleReference { NoteCompact.S.ContentScalable.Negative.style() },
            "NoteCompact.S.ContentScalable.Warning" to ComposeStyleReference { NoteCompact.S.ContentScalable.Warning.style() },
            "NoteCompact.S.ContentScalable.Info" to ComposeStyleReference { NoteCompact.S.ContentScalable.Info.style() },
            "NoteCompact.S.HasCloseContentScalable.Default" to ComposeStyleReference {
                NoteCompact.S.HasCloseContentScalable.Default.style()
            },
            "NoteCompact.S.HasCloseContentScalable.Positive" to ComposeStyleReference {
                NoteCompact.S.HasCloseContentScalable.Positive.style()
            },
            "NoteCompact.S.HasCloseContentScalable.Negative" to ComposeStyleReference {
                NoteCompact.S.HasCloseContentScalable.Negative.style()
            },
            "NoteCompact.S.HasCloseContentScalable.Warning" to ComposeStyleReference {
                NoteCompact.S.HasCloseContentScalable.Warning.style()
            },
            "NoteCompact.S.HasCloseContentScalable.Info" to ComposeStyleReference {
                NoteCompact.S.HasCloseContentScalable.Info.style()
            },
            "NoteCompact.Xs.Default" to ComposeStyleReference { NoteCompact.Xs.Default.style() },
            "NoteCompact.Xs.Positive" to ComposeStyleReference { NoteCompact.Xs.Positive.style() },
            "NoteCompact.Xs.Negative" to ComposeStyleReference { NoteCompact.Xs.Negative.style() },
            "NoteCompact.Xs.Warning" to ComposeStyleReference { NoteCompact.Xs.Warning.style() },
            "NoteCompact.Xs.Info" to ComposeStyleReference { NoteCompact.Xs.Info.style() },
            "NoteCompact.Xs.HasClose.Default" to ComposeStyleReference { NoteCompact.Xs.HasClose.Default.style() },
            "NoteCompact.Xs.HasClose.Positive" to ComposeStyleReference { NoteCompact.Xs.HasClose.Positive.style() },
            "NoteCompact.Xs.HasClose.Negative" to ComposeStyleReference { NoteCompact.Xs.HasClose.Negative.style() },
            "NoteCompact.Xs.HasClose.Warning" to ComposeStyleReference { NoteCompact.Xs.HasClose.Warning.style() },
            "NoteCompact.Xs.HasClose.Info" to ComposeStyleReference { NoteCompact.Xs.HasClose.Info.style() },
            "NoteCompact.Xs.ContentScalable.Default" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Default.style() },
            "NoteCompact.Xs.ContentScalable.Positive" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Positive.style() },
            "NoteCompact.Xs.ContentScalable.Negative" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Negative.style() },
            "NoteCompact.Xs.ContentScalable.Warning" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Warning.style() },
            "NoteCompact.Xs.ContentScalable.Info" to ComposeStyleReference { NoteCompact.Xs.ContentScalable.Info.style() },
            "NoteCompact.Xs.HasCloseContentScalable.Default" to ComposeStyleReference {
                NoteCompact.Xs.HasCloseContentScalable.Default.style()
            },
            "NoteCompact.Xs.HasCloseContentScalable.Positive" to ComposeStyleReference {
                NoteCompact.Xs.HasCloseContentScalable.Positive.style()
            },
            "NoteCompact.Xs.HasCloseContentScalable.Negative" to ComposeStyleReference {
                NoteCompact.Xs.HasCloseContentScalable.Negative.style()
            },
            "NoteCompact.Xs.HasCloseContentScalable.Warning" to ComposeStyleReference {
                NoteCompact.Xs.HasCloseContentScalable.Warning.style()
            },
            "NoteCompact.Xs.HasCloseContentScalable.Info" to ComposeStyleReference {
                NoteCompact.Xs.HasCloseContentScalable.Info.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return NoteCompactStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> NoteCompactSize.L
                "M" -> NoteCompactSize.M
                "S" -> NoteCompactSize.S
                "Xs" -> NoteCompactSize.Xs
                else -> NoteCompactSize.L
            },
            contentBefore = when (bindings["contentBefore"]?.toString()) {
                "Fixed" -> NoteCompactContentBefore.Fixed
                "Scalable" -> NoteCompactContentBefore.Scalable
                else -> NoteCompactContentBefore.Fixed
            },
            hasClose = booleanBindingValue(bindings, "hasClose", false),
            view = when (bindings["view"]?.toString()) {
                "Default" -> NoteCompactView.Default
                "Positive" -> NoteCompactView.Positive
                "Negative" -> NoteCompactView.Negative
                "Warning" -> NoteCompactView.Warning
                "Info" -> NoteCompactView.Info
                else -> NoteCompactView.Default
            },
        ).key
    }
}
