package com.sdds.playground.sandbox.stylessalute.integration.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.list.L
import com.sdds.stylessalute.styles.list.ListTight
import com.sdds.stylessalute.styles.list.M
import com.sdds.stylessalute.styles.list.S
import com.sdds.stylessalute.styles.list.Xl
import com.sdds.stylessalute.styles.list.Xs

internal object StylesSaluteListTightVariationsCompose :
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
