package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.tabitem.H1
import com.sdds.serv.styles.tabitem.H2
import com.sdds.serv.styles.tabitem.H3
import com.sdds.serv.styles.tabitem.H4
import com.sdds.serv.styles.tabitem.H5
import com.sdds.serv.styles.tabitem.TabItemHeader

internal object SddsServTabItemHeaderVariationsCompose : ComposeStyleProvider<String, TabItemStyle>() {
    override val variations: Map<String, @Composable () -> TabItemStyle> =
        mapOf(
            "H1" to { TabItemHeader.H1.style() },
            "H2" to { TabItemHeader.H2.style() },
            "H3" to { TabItemHeader.H3.style() },
            "H4" to { TabItemHeader.H4.style() },
            "H5" to { TabItemHeader.H5.style() },
        )
}
