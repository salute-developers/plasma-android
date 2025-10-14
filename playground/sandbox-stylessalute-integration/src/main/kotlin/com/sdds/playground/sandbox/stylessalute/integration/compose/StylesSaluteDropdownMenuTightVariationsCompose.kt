package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.dropdownmenu.DropdownMenuTight
import com.sdds.stylessalute.styles.dropdownmenu.L
import com.sdds.stylessalute.styles.dropdownmenu.M
import com.sdds.stylessalute.styles.dropdownmenu.S
import com.sdds.stylessalute.styles.dropdownmenu.Xs

internal object StylesSaluteDropdownMenuTightVariationsCompose : ComposeStyleProvider<String, DropdownMenuStyle>() {
    override val variations: Map<String, @Composable () -> DropdownMenuStyle> =
        mapOf(
            "L" to { DropdownMenuTight.L.style() },
            "M" to { DropdownMenuTight.M.style() },
            "S" to { DropdownMenuTight.S.style() },
            "Xs" to { DropdownMenuTight.Xs.style() },
        )
}
