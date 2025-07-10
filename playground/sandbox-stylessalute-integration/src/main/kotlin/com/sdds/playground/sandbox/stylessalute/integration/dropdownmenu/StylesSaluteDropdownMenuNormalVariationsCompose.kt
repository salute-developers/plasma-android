package com.sdds.playground.sandbox.stylessalute.integration.dropdownmenu

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.stylessalute.styles.dropdownmenu.L
import com.sdds.stylessalute.styles.dropdownmenu.M
import com.sdds.stylessalute.styles.dropdownmenu.S
import com.sdds.stylessalute.styles.dropdownmenu.Xs

internal object StylesSaluteDropdownMenuNormalVariationsCompose :
    ComposeStyleProvider<String, DropdownMenuStyle>() {
    override val variations: Map<String, @Composable () -> DropdownMenuStyle> =
        mapOf(
            "L" to { DropdownMenuNormal.L.style() },
            "M" to { DropdownMenuNormal.M.style() },
            "S" to { DropdownMenuNormal.S.style() },
            "Xs" to { DropdownMenuNormal.Xs.style() },
        )
}
