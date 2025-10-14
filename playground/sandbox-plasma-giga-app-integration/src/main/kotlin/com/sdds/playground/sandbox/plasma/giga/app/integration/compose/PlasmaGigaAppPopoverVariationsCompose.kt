package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.popover.Accent
import com.sdds.plasma.giga.app.styles.popover.Default
import com.sdds.plasma.giga.app.styles.popover.M
import com.sdds.plasma.giga.app.styles.popover.Popover
import com.sdds.plasma.giga.app.styles.popover.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppPopoverVariationsCompose : ComposeStyleProvider<String, PopoverStyle>() {
    override val variations: Map<String, @Composable () -> PopoverStyle> =
        mapOf(
            "M.Default" to { Popover.M.Default.style() },
            "M.Accent" to { Popover.M.Accent.style() },
            "S.Default" to { Popover.S.Default.style() },
            "S.Accent" to { Popover.S.Accent.style() },
        )
}
