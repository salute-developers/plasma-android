package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.list.DropdownMenuListNormal
import com.sdds.plasma.giga.app.styles.list.L
import com.sdds.plasma.giga.app.styles.list.M
import com.sdds.plasma.giga.app.styles.list.S
import com.sdds.plasma.giga.app.styles.list.Xl
import com.sdds.plasma.giga.app.styles.list.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppDropdownMenuListNormalVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "Xl" to { DropdownMenuListNormal.Xl.style() },
            "L" to { DropdownMenuListNormal.L.style() },
            "M" to { DropdownMenuListNormal.M.style() },
            "S" to { DropdownMenuListNormal.S.style() },
            "Xs" to { DropdownMenuListNormal.Xs.style() },
        )
}
