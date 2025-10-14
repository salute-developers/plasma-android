package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.list.L
import com.sdds.serv.styles.list.ListNormal
import com.sdds.serv.styles.list.M
import com.sdds.serv.styles.list.S
import com.sdds.serv.styles.list.Xl
import com.sdds.serv.styles.list.Xs

internal object SddsServListNormalVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "Xl" to { ListNormal.Xl.style() },
            "L" to { ListNormal.L.style() },
            "M" to { ListNormal.M.style() },
            "S" to { ListNormal.S.style() },
            "Xs" to { ListNormal.Xs.style() },
        )
}
