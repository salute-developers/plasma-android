// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.switcher.L
import com.sdds.plasma.sd.service.styles.switcher.M
import com.sdds.plasma.sd.service.styles.switcher.S
import com.sdds.plasma.sd.service.styles.switcher.Switch
import com.sdds.plasma.sd.service.styles.switcher.ToggleS

internal object PlasmaB2cSwitchVariationsCompose : ComposeStyleProvider<SwitchStyle>() {
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
