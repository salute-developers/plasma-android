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
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.editable.BodyL
import com.sdds.plasma.homeds.styles.editable.BodyM
import com.sdds.plasma.homeds.styles.editable.BodyS
import com.sdds.plasma.homeds.styles.editable.BodyXs
import com.sdds.plasma.homeds.styles.editable.BodyXxs
import com.sdds.plasma.homeds.styles.editable.Editable
import com.sdds.plasma.homeds.styles.editable.EditableSize
import com.sdds.plasma.homeds.styles.editable.EditableStyles
import com.sdds.plasma.homeds.styles.editable.H1
import com.sdds.plasma.homeds.styles.editable.H2
import com.sdds.plasma.homeds.styles.editable.H3
import com.sdds.plasma.homeds.styles.editable.H4
import com.sdds.plasma.homeds.styles.editable.H5
import com.sdds.plasma.homeds.styles.editable.H6
import com.sdds.plasma.homeds.styles.editable.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsEditableVariationsCompose : ComposeStyleProvider<EditableStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "H1",
                variants = listOf("H1", "H2", "H3", "H4", "H5", "H6", "BodyL", "BodyM", "BodyS", "BodyXs", "BodyXxs"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<EditableStyle>> =
        mapOf(
            "Editable.H1" to ComposeStyleReference { Editable.H1.style() },
            "Editable.H2" to ComposeStyleReference { Editable.H2.style() },
            "Editable.H3" to ComposeStyleReference { Editable.H3.style() },
            "Editable.H4" to ComposeStyleReference { Editable.H4.style() },
            "Editable.H5" to ComposeStyleReference { Editable.H5.style() },
            "Editable.H6" to ComposeStyleReference { Editable.H6.style() },
            "Editable.BodyL" to ComposeStyleReference { Editable.BodyL.style() },
            "Editable.BodyM" to ComposeStyleReference { Editable.BodyM.style() },
            "Editable.BodyS" to ComposeStyleReference { Editable.BodyS.style() },
            "Editable.BodyXs" to ComposeStyleReference { Editable.BodyXs.style() },
            "Editable.BodyXxs" to ComposeStyleReference { Editable.BodyXxs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return EditableStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "H1" -> EditableSize.H1
                "H2" -> EditableSize.H2
                "H3" -> EditableSize.H3
                "H4" -> EditableSize.H4
                "H5" -> EditableSize.H5
                "H6" -> EditableSize.H6
                "BodyL" -> EditableSize.BodyL
                "BodyM" -> EditableSize.BodyM
                "BodyS" -> EditableSize.BodyS
                "BodyXs" -> EditableSize.BodyXs
                "BodyXxs" -> EditableSize.BodyXxs
                else -> EditableSize.H1
            },
        ).key
    }
}
