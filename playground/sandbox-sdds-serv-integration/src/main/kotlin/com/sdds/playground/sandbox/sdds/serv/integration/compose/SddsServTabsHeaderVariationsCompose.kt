package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.tabs.H1
import com.sdds.serv.styles.tabs.H2
import com.sdds.serv.styles.tabs.H3
import com.sdds.serv.styles.tabs.H4
import com.sdds.serv.styles.tabs.H5
import com.sdds.serv.styles.tabs.TabsHeader

internal object SddsServTabsHeaderVariationsCompose : ComposeStyleProvider<String, TabsStyle>() {
    override val variations: Map<String, @Composable () -> TabsStyle> =
        mapOf(
            "H1" to { TabsHeader.H1.style() },
            "H2" to { TabsHeader.H2.style() },
            "H3" to { TabsHeader.H3.style() },
            "H4" to { TabsHeader.H4.style() },
            "H5" to { TabsHeader.H5.style() },
        )
}
