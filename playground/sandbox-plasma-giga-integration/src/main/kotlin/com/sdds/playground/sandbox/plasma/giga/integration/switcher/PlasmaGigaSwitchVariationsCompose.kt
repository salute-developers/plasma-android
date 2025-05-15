package com.sdds.playground.sandbox.plasma.giga.integration.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.switcher.L
import com.sdds.plasma.giga.styles.switcher.M
import com.sdds.plasma.giga.styles.switcher.S
import com.sdds.plasma.giga.styles.switcher.Switch
import com.sdds.plasma.giga.styles.switcher.ToggleS
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaSwitchVariationsCompose : ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle> =
        mapOf(
            "L" to { Switch.L.style() },
            "LToggleS" to { Switch.L.ToggleS.style() },
            "M" to { Switch.M.style() },
            "MToggleS" to { Switch.M.ToggleS.style() },
            "S" to { Switch.S.style() },
            "SToggleS" to { Switch.S.ToggleS.style() },
        )
}
