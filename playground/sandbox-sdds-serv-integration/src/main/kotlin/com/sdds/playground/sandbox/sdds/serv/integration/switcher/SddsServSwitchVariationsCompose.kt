package com.sdds.playground.sandbox.sdds.serv.integration.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.switcher.L
import com.sdds.serv.styles.switcher.M
import com.sdds.serv.styles.switcher.S

internal object SddsServSwitchVariationsCompose : ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle>
        get() = mapOf(
            "L" to { Switch.L.style() },
            "M" to { Switch.M.style() },
            "S" to { Switch.S.style() },
        )
}
