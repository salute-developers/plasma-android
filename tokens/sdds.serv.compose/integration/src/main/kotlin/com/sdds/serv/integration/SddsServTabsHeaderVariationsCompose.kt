// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabs.H1
import com.sdds.serv.styles.tabs.H2
import com.sdds.serv.styles.tabs.H3
import com.sdds.serv.styles.tabs.H4
import com.sdds.serv.styles.tabs.H5
import com.sdds.serv.styles.tabs.TabsHeader

internal object SddsServTabsHeaderVariationsCompose : ComposeStyleProvider<TabsStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabsStyle>> =
        mapOf(
            "H1" to ComposeStyleReference { TabsHeader.H1.style() },
            "H2" to ComposeStyleReference { TabsHeader.H2.style() },
            "H3" to ComposeStyleReference { TabsHeader.H3.style() },
            "H4" to ComposeStyleReference { TabsHeader.H4.style() },
            "H5" to ComposeStyleReference { TabsHeader.H5.style() },
        )
}
