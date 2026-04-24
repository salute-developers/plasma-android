// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.listitem.Default
import com.sdds.sbcom.styles.listitem.ListItem

internal object SddsSbcomListItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "ListItem.Default" to ComposeStyleReference { ListItem.Default.style() },
        )
}
