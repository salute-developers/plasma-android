// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.listitem.ListNumberedItem
import com.sdds.plasma.homeds.styles.listitem.S

internal object PlasmaHomedsListNumberedItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "S" to ComposeStyleReference { ListNumberedItem.S.style() },
        )
}
