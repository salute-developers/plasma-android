package com.sdds.playground.sandbox.sdds.serv.integration.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.list.L
import com.sdds.serv.styles.list.ListTight
import com.sdds.serv.styles.list.M
import com.sdds.serv.styles.list.S
import com.sdds.serv.styles.list.Xl
import com.sdds.serv.styles.list.Xs

internal object SddsServListTightVariationsCompose :
    ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "Xl" to { ListTight.Xl.style() },
            "L" to { ListTight.L.style() },
            "M" to { ListTight.M.style() },
            "S" to { ListTight.S.style() },
            "Xs" to { ListTight.Xs.style() },
        )
}
