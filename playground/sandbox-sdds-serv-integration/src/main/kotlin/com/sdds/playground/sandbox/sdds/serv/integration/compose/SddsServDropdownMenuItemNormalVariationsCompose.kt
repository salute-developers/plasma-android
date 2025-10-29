package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.listitem.Default
import com.sdds.serv.styles.listitem.DropdownMenuItemNormal
import com.sdds.serv.styles.listitem.L
import com.sdds.serv.styles.listitem.M
import com.sdds.serv.styles.listitem.Negative
import com.sdds.serv.styles.listitem.Positive
import com.sdds.serv.styles.listitem.S
import com.sdds.serv.styles.listitem.Xl
import com.sdds.serv.styles.listitem.Xs

internal object SddsServDropdownMenuItemNormalVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "Xl.Default" to { DropdownMenuItemNormal.Xl.Default.style() },
            "Xl.Positive" to { DropdownMenuItemNormal.Xl.Positive.style() },
            "Xl.Negative" to { DropdownMenuItemNormal.Xl.Negative.style() },
            "L.Default" to { DropdownMenuItemNormal.L.Default.style() },
            "L.Positive" to { DropdownMenuItemNormal.L.Positive.style() },
            "L.Negative" to { DropdownMenuItemNormal.L.Negative.style() },
            "M.Default" to { DropdownMenuItemNormal.M.Default.style() },
            "M.Positive" to { DropdownMenuItemNormal.M.Positive.style() },
            "M.Negative" to { DropdownMenuItemNormal.M.Negative.style() },
            "S.Default" to { DropdownMenuItemNormal.S.Default.style() },
            "S.Positive" to { DropdownMenuItemNormal.S.Positive.style() },
            "S.Negative" to { DropdownMenuItemNormal.S.Negative.style() },
            "Xs.Default" to { DropdownMenuItemNormal.Xs.Default.style() },
            "Xs.Positive" to { DropdownMenuItemNormal.Xs.Positive.style() },
            "Xs.Negative" to { DropdownMenuItemNormal.Xs.Negative.style() },
        )
}
