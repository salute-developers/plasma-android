package com.sdds.playground.sandbox.sdds.serv.integration.popover

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.popover.Accent
import com.sdds.serv.styles.popover.Default
import com.sdds.serv.styles.popover.M
import com.sdds.serv.styles.popover.Popover
import com.sdds.serv.styles.popover.S

internal object SddsServPopoverVariationsCompose :
    ComposeStyleProvider<String, PopoverStyle>() {
    override val variations: Map<String, @Composable () -> PopoverStyle> =
        mapOf(
            "MDefault" to { Popover.M.Default.style() },
            "SDefault" to { Popover.S.Default.style() },
            "MAccent" to { Popover.M.Accent.style() },
            "SAccent" to { Popover.S.Accent.style() },
        )
}
