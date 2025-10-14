package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.list.DropdownMenuListTight
import com.sdds.serv.styles.list.L
import com.sdds.serv.styles.list.M
import com.sdds.serv.styles.list.S
import com.sdds.serv.styles.list.Xl
import com.sdds.serv.styles.list.Xs

internal object SddsServDropdownMenuListTightVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "Xl" to { DropdownMenuListTight.Xl.style() },
            "L" to { DropdownMenuListTight.L.style() },
            "M" to { DropdownMenuListTight.M.style() },
            "S" to { DropdownMenuListTight.S.style() },
            "Xs" to { DropdownMenuListTight.Xs.style() },
        )
}
