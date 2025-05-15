package com.sdds.playground.sandbox.sdds.serv.integration.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.switcher.L
import com.sdds.serv.styles.switcher.M
import com.sdds.serv.styles.switcher.S
import com.sdds.serv.styles.switcher.Switch
import com.sdds.serv.styles.switcher.ToggleS

internal object SddsServSwitchVariationsCompose : ComposeStyleProvider<String, SwitchStyle>() {
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
