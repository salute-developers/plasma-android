package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.dropdownmenu.DropdownMenuTight
import com.sdds.serv.styles.dropdownmenu.L
import com.sdds.serv.styles.dropdownmenu.M
import com.sdds.serv.styles.dropdownmenu.S
import com.sdds.serv.styles.dropdownmenu.Xl
import com.sdds.serv.styles.dropdownmenu.Xs

internal object SddsServDropdownMenuTightVariationsCompose : ComposeStyleProvider<String, DropdownMenuStyle>() {
    override val variations: Map<String, @Composable () -> DropdownMenuStyle> =
        mapOf(
            "Xl" to { DropdownMenuTight.Xl.style() },
            "L" to { DropdownMenuTight.L.style() },
            "M" to { DropdownMenuTight.M.style() },
            "S" to { DropdownMenuTight.S.style() },
            "Xs" to { DropdownMenuTight.Xs.style() },
        )
}
