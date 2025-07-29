package com.sdds.playground.sandbox.plasma.homeds.integration.divider

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.divider.Default
import com.sdds.plasma.homeds.styles.divider.Divider
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsDividerVariationsCompose :
    ComposeStyleProvider<String, DividerStyle>() {
    override val variations: Map<String, @Composable () -> DividerStyle> =
        mapOf(
            "Default" to { Divider.Default.style() },
        )
}
