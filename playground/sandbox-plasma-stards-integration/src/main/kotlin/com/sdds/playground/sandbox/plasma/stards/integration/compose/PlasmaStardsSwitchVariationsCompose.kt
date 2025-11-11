package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.switcher.HasBackground
import com.sdkit.star.designsystem.styles.switcher.L
import com.sdkit.star.designsystem.styles.switcher.M
import com.sdkit.star.designsystem.styles.switcher.S
import com.sdkit.star.designsystem.styles.switcher.Switch

internal object PlasmaStardsSwitchVariationsCompose : ComposeStyleProvider<String, SwitchStyle>() {
    override val variations: Map<String, @Composable () -> SwitchStyle> =
        mapOf(
            "L" to { Switch.L.style() },
            "L.HasBackground" to { Switch.L.HasBackground.style() },
            "M" to { Switch.M.style() },
            "M.HasBackground" to { Switch.M.HasBackground.style() },
            "S" to { Switch.S.style() },
            "S.HasBackground" to { Switch.S.HasBackground.style() },
        )
}
