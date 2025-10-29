package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.list.DropdownMenuListNormal
import com.sdds.stylessalute.styles.list.L
import com.sdds.stylessalute.styles.list.M
import com.sdds.stylessalute.styles.list.S
import com.sdds.stylessalute.styles.list.Xs

internal object StylesSaluteDropdownMenuListNormalVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "L" to { DropdownMenuListNormal.L.style() },
            "M" to { DropdownMenuListNormal.M.style() },
            "S" to { DropdownMenuListNormal.S.style() },
            "Xs" to { DropdownMenuListNormal.Xs.style() },
        )
}
