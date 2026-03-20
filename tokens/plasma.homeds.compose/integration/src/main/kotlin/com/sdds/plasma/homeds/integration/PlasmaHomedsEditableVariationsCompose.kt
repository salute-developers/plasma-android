// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
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
import com.sdds.plasma.homeds.styles.editable.H1
import com.sdds.plasma.homeds.styles.editable.H2
import com.sdds.plasma.homeds.styles.editable.H3
import com.sdds.plasma.homeds.styles.editable.H4
import com.sdds.plasma.homeds.styles.editable.H5
import com.sdds.plasma.homeds.styles.editable.H6

internal object PlasmaHomedsEditableVariationsCompose : ComposeStyleProvider<EditableStyle>() {
    override val variations: Map<String, ComposeStyleReference<EditableStyle>> =
        mapOf(
            "H1" to ComposeStyleReference { Editable.H1.style() },
            "H2" to ComposeStyleReference { Editable.H2.style() },
            "H3" to ComposeStyleReference { Editable.H3.style() },
            "H4" to ComposeStyleReference { Editable.H4.style() },
            "H5" to ComposeStyleReference { Editable.H5.style() },
            "H6" to ComposeStyleReference { Editable.H6.style() },
            "BodyL" to ComposeStyleReference { Editable.BodyL.style() },
            "BodyM" to ComposeStyleReference { Editable.BodyM.style() },
            "BodyS" to ComposeStyleReference { Editable.BodyS.style() },
            "BodyXs" to ComposeStyleReference { Editable.BodyXs.style() },
            "BodyXxs" to ComposeStyleReference { Editable.BodyXxs.style() },
        )
}
