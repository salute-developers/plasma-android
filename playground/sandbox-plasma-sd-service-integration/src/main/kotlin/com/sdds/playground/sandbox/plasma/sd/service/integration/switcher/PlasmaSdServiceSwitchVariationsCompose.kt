package com.sdds.playground.sandbox.plasma.sd.service.integration.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.plasma.sd.service.styles.switcher.L
import com.sdds.plasma.sd.service.styles.switcher.M
import com.sdds.plasma.sd.service.styles.switcher.S
import com.sdds.plasma.sd.service.styles.switcher.Switch
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceSwitchVariationsCompose :
    ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle> =
        mapOf(
            "L" to { Switch.L.style() },
            "M" to { Switch.M.style() },
            "S" to { Switch.S.style() },
        )
}
