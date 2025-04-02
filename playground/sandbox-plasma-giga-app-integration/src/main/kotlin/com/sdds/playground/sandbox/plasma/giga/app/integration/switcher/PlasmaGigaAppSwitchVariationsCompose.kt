package com.sdds.playground.sandbox.plasma.giga.app.integration.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.plasma.giga.app.styles.switcher.L
import com.sdds.plasma.giga.app.styles.switcher.M
import com.sdds.plasma.giga.app.styles.switcher.S
import com.sdds.plasma.giga.app.styles.switcher.Switch
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppSwitchVariationsCompose : ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle> =
        mapOf(
            "L" to { Switch.L.style() },
            "M" to { Switch.M.style() },
            "S" to { Switch.S.style() },
        )
}
