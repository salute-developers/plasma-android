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
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.notecompact.ContentBeforeFixed
import com.sdds.plasma.homeds.styles.notecompact.ContentBeforeScalable
import com.sdds.plasma.homeds.styles.notecompact.Default
import com.sdds.plasma.homeds.styles.notecompact.HasClose
import com.sdds.plasma.homeds.styles.notecompact.Info
import com.sdds.plasma.homeds.styles.notecompact.Negative
import com.sdds.plasma.homeds.styles.notecompact.NoteCompact
import com.sdds.plasma.homeds.styles.notecompact.NoteCompactContentBefore
import com.sdds.plasma.homeds.styles.notecompact.NoteCompactStyles
import com.sdds.plasma.homeds.styles.notecompact.NoteCompactView
import com.sdds.plasma.homeds.styles.notecompact.Positive
import com.sdds.plasma.homeds.styles.notecompact.Warning
import com.sdds.plasma.homeds.styles.notecompact.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsNoteCompactVariationsCompose : ComposeStyleProvider<NoteCompactStyle>() {
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

    override val variations: Map<String, ComposeStyleReference<NoteCompactStyle>> =
        mapOf(
            "NoteCompact.ContentBeforeFixed.Default" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Default.style() },
            "NoteCompact.ContentBeforeFixed.Positive" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Positive.style() },
            "NoteCompact.ContentBeforeFixed.Negative" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Negative.style() },
            "NoteCompact.ContentBeforeFixed.Warning" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Warning.style() },
            "NoteCompact.ContentBeforeFixed.Info" to ComposeStyleReference { NoteCompact.ContentBeforeFixed.Info.style() },
            "NoteCompact.ContentBeforeFixed.HasClose.Default" to ComposeStyleReference {
                NoteCompact.ContentBeforeFixed.HasClose.Default.style()
            },
            "NoteCompact.ContentBeforeFixed.HasClose.Positive" to ComposeStyleReference {
                NoteCompact.ContentBeforeFixed.HasClose.Positive.style()
            },
            "NoteCompact.ContentBeforeFixed.HasClose.Negative" to ComposeStyleReference {
                NoteCompact.ContentBeforeFixed.HasClose.Negative.style()
            },
            "NoteCompact.ContentBeforeFixed.HasClose.Warning" to ComposeStyleReference {
                NoteCompact.ContentBeforeFixed.HasClose.Warning.style()
            },
            "NoteCompact.ContentBeforeFixed.HasClose.Info" to ComposeStyleReference {
                NoteCompact.ContentBeforeFixed.HasClose.Info.style()
            },
            "NoteCompact.ContentBeforeScalable.Default" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.Default.style()
            },
            "NoteCompact.ContentBeforeScalable.Positive" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.Positive.style()
            },
            "NoteCompact.ContentBeforeScalable.Negative" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.Negative.style()
            },
            "NoteCompact.ContentBeforeScalable.Warning" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.Warning.style()
            },
            "NoteCompact.ContentBeforeScalable.Info" to ComposeStyleReference { NoteCompact.ContentBeforeScalable.Info.style() },
            "NoteCompact.ContentBeforeScalable.HasClose.Default" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Default.style()
            },
            "NoteCompact.ContentBeforeScalable.HasClose.Positive" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Positive.style()
            },
            "NoteCompact.ContentBeforeScalable.HasClose.Negative" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Negative.style()
            },
            "NoteCompact.ContentBeforeScalable.HasClose.Warning" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Warning.style()
            },
            "NoteCompact.ContentBeforeScalable.HasClose.Info" to ComposeStyleReference {
                NoteCompact.ContentBeforeScalable.HasClose.Info.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return NoteCompactStyles.resolve(
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
