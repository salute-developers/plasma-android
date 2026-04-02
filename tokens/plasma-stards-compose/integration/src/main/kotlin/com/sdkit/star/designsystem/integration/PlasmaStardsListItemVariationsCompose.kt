// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.listitem.L
import com.sdkit.star.designsystem.styles.listitem.ListItem
import com.sdkit.star.designsystem.styles.listitem.M
import com.sdkit.star.designsystem.styles.listitem.S
import com.sdkit.star.designsystem.styles.listitem.Xs

internal object PlasmaStardsListItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "L" to ComposeStyleReference { ListItem.L.style() },
            "M" to ComposeStyleReference { ListItem.M.style() },
            "S" to ComposeStyleReference { ListItem.S.style() },
            "Xs" to ComposeStyleReference { ListItem.Xs.style() },
        )
}
