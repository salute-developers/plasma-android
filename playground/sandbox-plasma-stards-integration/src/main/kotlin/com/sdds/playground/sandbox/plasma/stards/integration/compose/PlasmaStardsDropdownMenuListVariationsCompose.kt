package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.list.DropdownMenuList
import com.sdkit.star.designsystem.styles.list.L
import com.sdkit.star.designsystem.styles.list.M
import com.sdkit.star.designsystem.styles.list.S
import com.sdkit.star.designsystem.styles.list.Xl
import com.sdkit.star.designsystem.styles.list.Xs

internal object PlasmaStardsDropdownMenuListVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "Xl" to { DropdownMenuList.Xl.style() },
            "L" to { DropdownMenuList.L.style() },
            "M" to { DropdownMenuList.M.style() },
            "S" to { DropdownMenuList.S.style() },
            "Xs" to { DropdownMenuList.Xs.style() },
        )
}
