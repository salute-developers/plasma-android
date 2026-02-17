package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
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

internal object SddsServEditableVariationsCompose : ComposeStyleProvider<String, EditableStyle>() {
    override val variations: Map<String, @Composable () -> EditableStyle> =
        mapOf(
            "H1" to { Editable.H1.style() },
            "H2" to { Editable.H2.style() },
            "H3" to { Editable.H3.style() },
            "H4" to { Editable.H4.style() },
            "H5" to { Editable.H5.style() },
            "BodyL" to { Editable.BodyL.style() },
            "BodyM" to { Editable.BodyM.style() },
            "BodyS" to { Editable.BodyS.style() },
            "BodyXs" to { Editable.BodyXs.style() },
            "BodyXxs" to { Editable.BodyXxs.style() },
        )
}
