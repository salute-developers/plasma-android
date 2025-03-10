package com.sdds.playground.sandbox.plasma.stards.integration.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.switcher.L
import com.sdkit.star.designsystem.styles.switcher.M
import com.sdkit.star.designsystem.styles.switcher.S

internal object StarDsSwitchVariationsCompose :
    ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle> =
        mapOf(
            "L" to { Switch.L.style() },
            "M" to { Switch.M.style() },
            "S" to { Switch.S.style() },
        )
}
