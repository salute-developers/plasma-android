package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.listitem.Default
import com.sdkit.star.designsystem.styles.listitem.DropdownMenuItem
import com.sdkit.star.designsystem.styles.listitem.L
import com.sdkit.star.designsystem.styles.listitem.M
import com.sdkit.star.designsystem.styles.listitem.Negative
import com.sdkit.star.designsystem.styles.listitem.Positive
import com.sdkit.star.designsystem.styles.listitem.S
import com.sdkit.star.designsystem.styles.listitem.Xl
import com.sdkit.star.designsystem.styles.listitem.Xs

internal object PlasmaStardsDropdownMenuItemVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "Xl.Default" to { DropdownMenuItem.Xl.Default.style() },
            "Xl.Positive" to { DropdownMenuItem.Xl.Positive.style() },
            "Xl.Negative" to { DropdownMenuItem.Xl.Negative.style() },
            "L.Default" to { DropdownMenuItem.L.Default.style() },
            "L.Positive" to { DropdownMenuItem.L.Positive.style() },
            "L.Negative" to { DropdownMenuItem.L.Negative.style() },
            "M.Default" to { DropdownMenuItem.M.Default.style() },
            "M.Positive" to { DropdownMenuItem.M.Positive.style() },
            "M.Negative" to { DropdownMenuItem.M.Negative.style() },
            "S.Default" to { DropdownMenuItem.S.Default.style() },
            "S.Positive" to { DropdownMenuItem.S.Positive.style() },
            "S.Negative" to { DropdownMenuItem.S.Negative.style() },
            "Xs.Default" to { DropdownMenuItem.Xs.Default.style() },
            "Xs.Positive" to { DropdownMenuItem.Xs.Positive.style() },
            "Xs.Negative" to { DropdownMenuItem.Xs.Negative.style() },
        )
}
