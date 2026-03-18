package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.popover.Accent
import com.sdds.sbcom.styles.popover.Default
import com.sdds.sbcom.styles.popover.M
import com.sdds.sbcom.styles.popover.Popover
import com.sdds.sbcom.styles.popover.S

internal object SddsSbcomPopoverVariationsCompose : ComposeStyleProvider<String, PopoverStyle>() {
    override val variations: Map<String, @Composable () -> PopoverStyle> =
        mapOf(
            "M.Default" to { Popover.M.Default.style() },
            "M.Accent" to { Popover.M.Accent.style() },
            "S.Default" to { Popover.S.Default.style() },
            "S.Accent" to { Popover.S.Accent.style() },
        )
}
