// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.listitem.L
import com.sdds.plasma.giga.styles.listitem.ListItemNormal
import com.sdds.plasma.giga.styles.listitem.M
import com.sdds.plasma.giga.styles.listitem.S
import com.sdds.plasma.giga.styles.listitem.Xl
import com.sdds.plasma.giga.styles.listitem.Xs

internal object PlasmaGigaListItemNormalVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { ListItemNormal.Xl.style() },
            "L" to ComposeStyleReference { ListItemNormal.L.style() },
            "M" to ComposeStyleReference { ListItemNormal.M.style() },
            "S" to ComposeStyleReference { ListItemNormal.S.style() },
            "Xs" to ComposeStyleReference { ListItemNormal.Xs.style() },
        )
}
