package com.sdds.playground.sandbox.plasma.giga.app.integration.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.list.L
import com.sdds.plasma.giga.app.styles.list.ListTight
import com.sdds.plasma.giga.app.styles.list.M
import com.sdds.plasma.giga.app.styles.list.S
import com.sdds.plasma.giga.app.styles.list.Xl
import com.sdds.plasma.giga.app.styles.list.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppListTightVariationsCompose :
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
