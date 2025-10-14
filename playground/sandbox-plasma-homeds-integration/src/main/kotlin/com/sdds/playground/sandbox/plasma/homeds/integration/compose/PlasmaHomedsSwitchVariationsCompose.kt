package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.switcher.L
import com.sdds.plasma.homeds.styles.switcher.M
import com.sdds.plasma.homeds.styles.switcher.S
import com.sdds.plasma.homeds.styles.switcher.Switch
import com.sdds.plasma.homeds.styles.switcher.ToggleS
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsSwitchVariationsCompose : ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle> =
        mapOf(
            "L" to { Switch.L.style() },
            "L.ToggleS" to { Switch.L.ToggleS.style() },
            "M" to { Switch.M.style() },
            "M.ToggleS" to { Switch.M.ToggleS.style() },
            "S" to { Switch.S.style() },
            "S.ToggleS" to { Switch.S.ToggleS.style() },
        )
}
