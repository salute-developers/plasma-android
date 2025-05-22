package com.sdds.playground.sandbox.plasma.stards.integration.tooltip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.tooltip.M
import com.sdkit.star.designsystem.styles.tooltip.S
import com.sdkit.star.designsystem.styles.tooltip.Tooltip

internal object StarDsTooltipVariationsCompose :
    ComposeStyleProvider<String, TooltipStyle>() {
    override val variations: Map<String, @Composable () -> TooltipStyle> =
        mapOf(
            "M" to { Tooltip.M.style() },
            "S" to { Tooltip.S.style() },
        )
}
