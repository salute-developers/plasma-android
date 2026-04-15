// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.listitem.L
import com.sdds.serv.styles.listitem.ListItemTight
import com.sdds.serv.styles.listitem.M
import com.sdds.serv.styles.listitem.S
import com.sdds.serv.styles.listitem.Xl
import com.sdds.serv.styles.listitem.Xs

internal object SddsServListItemTightVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { ListItemTight.Xl.style() },
            "L" to ComposeStyleReference { ListItemTight.L.style() },
            "M" to ComposeStyleReference { ListItemTight.M.style() },
            "S" to ComposeStyleReference { ListItemTight.S.style() },
            "Xs" to ComposeStyleReference { ListItemTight.Xs.style() },
        )
}
