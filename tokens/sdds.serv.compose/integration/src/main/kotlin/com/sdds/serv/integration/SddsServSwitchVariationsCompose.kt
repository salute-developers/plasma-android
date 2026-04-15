// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.switcher.L
import com.sdds.serv.styles.switcher.M
import com.sdds.serv.styles.switcher.S
import com.sdds.serv.styles.switcher.Switch
import com.sdds.serv.styles.switcher.ToggleS

internal object SddsServSwitchVariationsCompose : ComposeStyleProvider<SwitchStyle>() {
    override val variations: Map<String, ComposeStyleReference<SwitchStyle>> =
        mapOf(
            "L" to ComposeStyleReference { Switch.L.style() },
            "L.ToggleS" to ComposeStyleReference { Switch.L.ToggleS.style() },
            "M" to ComposeStyleReference { Switch.M.style() },
            "M.ToggleS" to ComposeStyleReference { Switch.M.ToggleS.style() },
            "S" to ComposeStyleReference { Switch.S.style() },
            "S.ToggleS" to ComposeStyleReference { Switch.S.ToggleS.style() },
        )
}
