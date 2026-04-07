// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.editable.BodyL
import com.sdds.serv.styles.editable.BodyM
import com.sdds.serv.styles.editable.BodyS
import com.sdds.serv.styles.editable.BodyXs
import com.sdds.serv.styles.editable.BodyXxs
import com.sdds.serv.styles.editable.Editable
import com.sdds.serv.styles.editable.H1
import com.sdds.serv.styles.editable.H2
import com.sdds.serv.styles.editable.H3
import com.sdds.serv.styles.editable.H4
import com.sdds.serv.styles.editable.H5

internal object SddsServEditableVariationsCompose : ComposeStyleProvider<EditableStyle>() {
    override val variations: Map<String, ComposeStyleReference<EditableStyle>> =
        mapOf(
            "H1" to ComposeStyleReference { Editable.H1.style() },
            "H2" to ComposeStyleReference { Editable.H2.style() },
            "H3" to ComposeStyleReference { Editable.H3.style() },
            "H4" to ComposeStyleReference { Editable.H4.style() },
            "H5" to ComposeStyleReference { Editable.H5.style() },
            "BodyL" to ComposeStyleReference { Editable.BodyL.style() },
            "BodyM" to ComposeStyleReference { Editable.BodyM.style() },
            "BodyS" to ComposeStyleReference { Editable.BodyS.style() },
            "BodyXs" to ComposeStyleReference { Editable.BodyXs.style() },
            "BodyXxs" to ComposeStyleReference { Editable.BodyXxs.style() },
        )
}
