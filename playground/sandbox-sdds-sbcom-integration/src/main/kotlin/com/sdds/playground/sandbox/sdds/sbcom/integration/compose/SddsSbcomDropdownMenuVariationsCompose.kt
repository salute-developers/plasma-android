package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.dropdownmenu.Default
import com.sdds.sbcom.styles.dropdownmenu.DropdownMenu

internal object SddsSbcomDropdownMenuVariationsCompose : ComposeStyleProvider<String, DropdownMenuStyle>() {
    override val variations: Map<String, @Composable () -> DropdownMenuStyle> =
        mapOf(
            "Default" to { DropdownMenu.Default.style() },
        )
}
