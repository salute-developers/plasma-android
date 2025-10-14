package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.list.L
import com.sdds.plasma.giga.styles.list.ListNormal
import com.sdds.plasma.giga.styles.list.M
import com.sdds.plasma.giga.styles.list.S
import com.sdds.plasma.giga.styles.list.Xl
import com.sdds.plasma.giga.styles.list.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaListNormalVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "Xl" to { ListNormal.Xl.style() },
            "L" to { ListNormal.L.style() },
            "M" to { ListNormal.M.style() },
            "S" to { ListNormal.S.style() },
            "Xs" to { ListNormal.Xs.style() },
        )
}
