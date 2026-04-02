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
import com.sdds.serv.styles.icontabitem.IconTabItem
import com.sdds.serv.styles.icontabitem.L
import com.sdds.serv.styles.icontabitem.M
import com.sdds.serv.styles.icontabitem.S
import com.sdds.serv.styles.icontabitem.Xs

internal object SddsServIconTabItemVariationsCompose : ComposeStyleProvider<TabItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<TabItemStyle>> =
        mapOf(
            "L" to ComposeStyleReference { IconTabItem.L.style() },
            "M" to ComposeStyleReference { IconTabItem.M.style() },
            "S" to ComposeStyleReference { IconTabItem.S.style() },
            "Xs" to ComposeStyleReference { IconTabItem.Xs.style() },
        )
}
