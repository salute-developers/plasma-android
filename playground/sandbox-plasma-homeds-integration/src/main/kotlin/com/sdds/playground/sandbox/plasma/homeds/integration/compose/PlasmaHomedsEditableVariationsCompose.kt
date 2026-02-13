package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
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
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsEditableVariationsCompose : ComposeStyleProvider<String, EditableStyle>() {
    override val variations: Map<String, @Composable () -> EditableStyle> =
        mapOf(
            "H1" to { Editable.H1.style() },
            "H2" to { Editable.H2.style() },
            "H3" to { Editable.H3.style() },
            "H4" to { Editable.H4.style() },
            "H5" to { Editable.H5.style() },
            "H6" to { Editable.H6.style() },
            "BodyL" to { Editable.BodyL.style() },
            "BodyM" to { Editable.BodyM.style() },
            "BodyS" to { Editable.BodyS.style() },
            "BodyXs" to { Editable.BodyXs.style() },
            "BodyXxs" to { Editable.BodyXxs.style() },
        )
}
