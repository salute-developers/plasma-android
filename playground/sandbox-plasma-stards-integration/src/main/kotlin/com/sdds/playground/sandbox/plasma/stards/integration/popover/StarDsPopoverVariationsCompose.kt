package com.sdds.playground.sandbox.plasma.stards.integration.popover

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.popover.Accent
import com.sdkit.star.designsystem.styles.popover.Default
import com.sdkit.star.designsystem.styles.popover.M
import com.sdkit.star.designsystem.styles.popover.Popover
import com.sdkit.star.designsystem.styles.popover.S

internal object StarDsPopoverVariationsCompose :
    ComposeStyleProvider<String, PopoverStyle>() {
    override val variations: Map<String, @Composable () -> PopoverStyle> =
        mapOf(
            "MDefault" to { Popover.M.Default.style() },
            "SDefault" to { Popover.S.Default.style() },
            "MAccent" to { Popover.M.Accent.style() },
            "SAccent" to { Popover.S.Accent.style() },
        )
}
