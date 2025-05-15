package com.sdds.playground.sandbox.stylessalute.integration.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.switcher.L
import com.sdds.stylessalute.styles.switcher.M
import com.sdds.stylessalute.styles.switcher.S
import com.sdds.stylessalute.styles.switcher.Switch
import com.sdds.stylessalute.styles.switcher.ToggleS

internal object StylesSaluteSwitchVariationsCompose :
    ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle> = mapOf(
        "L" to { Switch.L.style() },
        "LToggleS" to { Switch.L.ToggleS.style() },
        "M" to { Switch.M.style() },
        "MToggleS" to { Switch.M.ToggleS.style() },
        "S" to { Switch.S.style() },
        "SToggleS" to { Switch.S.ToggleS.style() },
    )
}
