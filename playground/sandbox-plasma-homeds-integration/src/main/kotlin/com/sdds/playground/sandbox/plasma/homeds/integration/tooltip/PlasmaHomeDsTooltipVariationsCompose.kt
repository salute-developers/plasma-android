package com.sdds.playground.sandbox.plasma.homeds.integration.tooltip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.tooltip.M
import com.sdds.plasma.homeds.styles.tooltip.S
import com.sdds.plasma.homeds.styles.tooltip.Tooltip
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsTooltipVariationsCompose :
    ComposeStyleProvider<String, TooltipStyle>() {
    override val variations: Map<String, @Composable () -> TooltipStyle> =
        mapOf(
            "M" to { Tooltip.M.style() },
            "S" to { Tooltip.S.style() },
        )
}
