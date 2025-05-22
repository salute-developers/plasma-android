package com.sdds.playground.sandbox.stylessalute.integration.popover

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.popover.Accent
import com.sdds.stylessalute.styles.popover.Default
import com.sdds.stylessalute.styles.popover.M
import com.sdds.stylessalute.styles.popover.Popover
import com.sdds.stylessalute.styles.popover.S

internal object StylesSalutePopoverVariationsCompose :
    ComposeStyleProvider<String, PopoverStyle>() {
    override val variations: Map<String, @Composable () -> PopoverStyle> =
        mapOf(
            "MDefault" to { Popover.M.Default.style() },
            "SDefault" to { Popover.S.Default.style() },
            "MAccent" to { Popover.M.Accent.style() },
            "SAccent" to { Popover.S.Accent.style() },
        )
}
