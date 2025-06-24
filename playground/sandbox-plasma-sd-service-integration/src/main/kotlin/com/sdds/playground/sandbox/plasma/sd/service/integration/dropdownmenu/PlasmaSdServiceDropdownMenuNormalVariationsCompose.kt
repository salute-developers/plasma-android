package com.sdds.playground.sandbox.plasma.sd.service.integration.dropdownmenu

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.plasma.sd.service.styles.dropdownmenu.L
import com.sdds.plasma.sd.service.styles.dropdownmenu.M
import com.sdds.plasma.sd.service.styles.dropdownmenu.S
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xl
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceDropdownMenuNormalVariationsCompose :
    ComposeStyleProvider<String, DropdownMenuStyle>() {
    override val variations: Map<String, @Composable () -> DropdownMenuStyle> =
        mapOf(
            "Xl" to { DropdownMenuNormal.Xl.style() },
            "L" to { DropdownMenuNormal.L.style() },
            "M" to { DropdownMenuNormal.M.style() },
            "S" to { DropdownMenuNormal.S.style() },
            "Xs" to { DropdownMenuNormal.Xs.style() },
        )
}
