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
import com.sdds.plasma.homeds.styles.listitem.HasBackground
import com.sdds.plasma.homeds.styles.listitem.ListItem
import com.sdds.plasma.homeds.styles.listitem.S

internal object PlasmaHomedsListItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "S" to ComposeStyleReference { ListItem.S.style() },
            "S.HasBackground" to ComposeStyleReference { ListItem.S.HasBackground.style() },
        )
}
