package com.sdds.playground.sandbox.plasma.sd.service.integration.popover

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.popover.Accent
import com.sdds.plasma.sd.service.styles.popover.Default
import com.sdds.plasma.sd.service.styles.popover.M
import com.sdds.plasma.sd.service.styles.popover.Popover
import com.sdds.plasma.sd.service.styles.popover.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServicePopoverVariationsCompose :
    ComposeStyleProvider<String, PopoverStyle>() {
    override val variations: Map<String, @Composable () -> PopoverStyle> =
        mapOf(
            "MDefault" to { Popover.M.Default.style() },
            "SDefault" to { Popover.S.Default.style() },
            "MAccent" to { Popover.M.Accent.style() },
            "SAccent" to { Popover.S.Accent.style() },
        )
}
