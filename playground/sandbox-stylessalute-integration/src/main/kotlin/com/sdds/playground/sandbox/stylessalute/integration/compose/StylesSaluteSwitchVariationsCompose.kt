package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.switcher.L
import com.sdds.stylessalute.styles.switcher.M
import com.sdds.stylessalute.styles.switcher.S
import com.sdds.stylessalute.styles.switcher.Switch
import com.sdds.stylessalute.styles.switcher.ToggleS

internal object StylesSaluteSwitchVariationsCompose : ComposeStyleProvider<String, SwitchStyle>() {
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
