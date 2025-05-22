package com.sdds.playground.sandbox.stylessalute.integration.tooltip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.tooltip.M
import com.sdds.stylessalute.styles.tooltip.S
import com.sdds.stylessalute.styles.tooltip.Tooltip

internal object StylesSaluteTooltipVariationsCompose :
    ComposeStyleProvider<String, TooltipStyle>() {
    override val variations: Map<String, @Composable () -> TooltipStyle> =
        mapOf(
            "M" to { Tooltip.M.style() },
            "S" to { Tooltip.S.style() },
        )
}
