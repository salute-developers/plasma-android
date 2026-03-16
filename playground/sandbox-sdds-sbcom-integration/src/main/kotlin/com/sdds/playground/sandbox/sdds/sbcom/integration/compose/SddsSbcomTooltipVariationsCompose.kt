package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.tooltip.Default
import com.sdds.sbcom.styles.tooltip.Tooltip

internal object SddsSbcomTooltipVariationsCompose : ComposeStyleProvider<String, TooltipStyle>() {
    override val variations: Map<String, @Composable () -> TooltipStyle> =
        mapOf(
            "Default" to { Tooltip.Default.style() },
        )
}
