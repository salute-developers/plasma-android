package com.sdds.playground.sandbox.plasma.giga.app.integration.dropdownmenu

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.dropdownmenu.DropdownMenuTight
import com.sdds.plasma.giga.app.styles.dropdownmenu.L
import com.sdds.plasma.giga.app.styles.dropdownmenu.M
import com.sdds.plasma.giga.app.styles.dropdownmenu.S
import com.sdds.plasma.giga.app.styles.dropdownmenu.Xl
import com.sdds.plasma.giga.app.styles.dropdownmenu.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppDropdownMenuTightVariationsCompose :
    ComposeStyleProvider<String, DropdownMenuStyle>() {
    override val variations: Map<String, @Composable () -> DropdownMenuStyle> =
        mapOf(
            "Xl" to { DropdownMenuTight.Xl.style() },
            "L" to { DropdownMenuTight.L.style() },
            "M" to { DropdownMenuTight.M.style() },
            "S" to { DropdownMenuTight.S.style() },
            "Xs" to { DropdownMenuTight.Xs.style() },
        )
}
