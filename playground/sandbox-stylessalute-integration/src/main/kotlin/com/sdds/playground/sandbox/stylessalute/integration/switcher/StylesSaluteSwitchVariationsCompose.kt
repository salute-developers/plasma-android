package com.sdds.playground.sandbox.stylessalute.integration.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.switcher.L
import com.sdds.stylessalute.styles.switcher.M
import com.sdds.stylessalute.styles.switcher.S
import com.sdds.stylessalute.styles.switcher.Switch

internal object StylesSaluteSwitchVariationsCompose :
    ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle> = mapOf(
        "L" to { Switch.L.style() },
        "M" to { Switch.M.style() },
        "S" to { Switch.S.style() },
    )
}
