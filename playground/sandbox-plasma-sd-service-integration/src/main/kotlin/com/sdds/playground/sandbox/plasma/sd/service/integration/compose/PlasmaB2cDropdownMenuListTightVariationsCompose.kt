package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.list.DropdownMenuListTight
import com.sdds.plasma.sd.service.styles.list.L
import com.sdds.plasma.sd.service.styles.list.M
import com.sdds.plasma.sd.service.styles.list.S
import com.sdds.plasma.sd.service.styles.list.Xl
import com.sdds.plasma.sd.service.styles.list.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cDropdownMenuListTightVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "Xl" to { DropdownMenuListTight.Xl.style() },
            "L" to { DropdownMenuListTight.L.style() },
            "M" to { DropdownMenuListTight.M.style() },
            "S" to { DropdownMenuListTight.S.style() },
            "Xs" to { DropdownMenuListTight.Xs.style() },
        )
}
