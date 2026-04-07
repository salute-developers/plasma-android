// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.tabitem.H1
import com.sdds.serv.styles.tabitem.H2
import com.sdds.serv.styles.tabitem.H3
import com.sdds.serv.styles.tabitem.H4
import com.sdds.serv.styles.tabitem.H5
import com.sdds.serv.styles.tabitem.TabItemHeader

internal object SddsServTabItemHeaderVariationsCompose : ComposeStyleProvider<TabItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabItemStyle>> =
        mapOf(
            "H1" to ComposeStyleReference { TabItemHeader.H1.style() },
            "H2" to ComposeStyleReference { TabItemHeader.H2.style() },
            "H3" to ComposeStyleReference { TabItemHeader.H3.style() },
            "H4" to ComposeStyleReference { TabItemHeader.H4.style() },
            "H5" to ComposeStyleReference { TabItemHeader.H5.style() },
        )
}
