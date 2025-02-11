package com.sdds.playground.sandbox.stylessalute.integration.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.stylessalute.styles.switcher.L
import com.sdds.stylessalute.styles.switcher.M
import com.sdds.stylessalute.styles.switcher.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object StylesSaluteSwitchVariationsCompose :
    ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle>
        get() = mapOf(
            "L" to { Switch.L.style() },
            "M" to { Switch.M.style() },
            "S" to { Switch.S.style() },
        )
}
