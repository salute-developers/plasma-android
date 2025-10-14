package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.listitem.Default
import com.sdds.plasma.giga.styles.listitem.DropdownMenuItemTight
import com.sdds.plasma.giga.styles.listitem.L
import com.sdds.plasma.giga.styles.listitem.M
import com.sdds.plasma.giga.styles.listitem.Negative
import com.sdds.plasma.giga.styles.listitem.Positive
import com.sdds.plasma.giga.styles.listitem.S
import com.sdds.plasma.giga.styles.listitem.Xl
import com.sdds.plasma.giga.styles.listitem.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaDropdownMenuItemTightVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "Xl.Default" to { DropdownMenuItemTight.Xl.Default.style() },
            "Xl.Positive" to { DropdownMenuItemTight.Xl.Positive.style() },
            "Xl.Negative" to { DropdownMenuItemTight.Xl.Negative.style() },
            "L.Default" to { DropdownMenuItemTight.L.Default.style() },
            "L.Positive" to { DropdownMenuItemTight.L.Positive.style() },
            "L.Negative" to { DropdownMenuItemTight.L.Negative.style() },
            "M.Default" to { DropdownMenuItemTight.M.Default.style() },
            "M.Positive" to { DropdownMenuItemTight.M.Positive.style() },
            "M.Negative" to { DropdownMenuItemTight.M.Negative.style() },
            "S.Default" to { DropdownMenuItemTight.S.Default.style() },
            "S.Positive" to { DropdownMenuItemTight.S.Positive.style() },
            "S.Negative" to { DropdownMenuItemTight.S.Negative.style() },
            "Xs.Default" to { DropdownMenuItemTight.Xs.Default.style() },
            "Xs.Positive" to { DropdownMenuItemTight.Xs.Positive.style() },
            "Xs.Negative" to { DropdownMenuItemTight.Xs.Negative.style() },
        )
}
