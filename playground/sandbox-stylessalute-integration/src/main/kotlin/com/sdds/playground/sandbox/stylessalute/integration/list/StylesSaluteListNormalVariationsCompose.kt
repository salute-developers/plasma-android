package com.sdds.playground.sandbox.stylessalute.integration.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.list.L
import com.sdds.stylessalute.styles.list.ListNormal
import com.sdds.stylessalute.styles.list.M
import com.sdds.stylessalute.styles.list.S
import com.sdds.stylessalute.styles.list.Xl
import com.sdds.stylessalute.styles.list.Xs

internal object StylesSaluteListNormalVariationsCompose :
    ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "Xl" to { ListNormal.Xl.style() },
            "L" to { ListNormal.L.style() },
            "M" to { ListNormal.M.style() },
            "S" to { ListNormal.S.style() },
            "Xs" to { ListNormal.Xs.style() },
        )
}
