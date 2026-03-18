package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.listitem.Default
import com.sdds.sbcom.styles.listitem.DropdownMenuItem

internal object SddsSbcomDropdownMenuItemVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "Default" to { DropdownMenuItem.Default.style() },
        )
}
