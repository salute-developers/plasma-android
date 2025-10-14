package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.dropdownmenu.DropdownMenu
import com.sdkit.star.designsystem.styles.dropdownmenu.L
import com.sdkit.star.designsystem.styles.dropdownmenu.M
import com.sdkit.star.designsystem.styles.dropdownmenu.S
import com.sdkit.star.designsystem.styles.dropdownmenu.Xl
import com.sdkit.star.designsystem.styles.dropdownmenu.Xs

internal object PlasmaStardsDropdownMenuVariationsCompose : ComposeStyleProvider<String, DropdownMenuStyle>() {
    override val variations: Map<String, @Composable () -> DropdownMenuStyle> =
        mapOf(
            "Xl" to { DropdownMenu.Xl.style() },
            "L" to { DropdownMenu.L.style() },
            "M" to { DropdownMenu.M.style() },
            "S" to { DropdownMenu.S.style() },
            "Xs" to { DropdownMenu.Xs.style() },
        )
}
