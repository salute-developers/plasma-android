// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.listitem.L
import com.sdkit.star.designsystem.styles.listitem.ListItem
import com.sdkit.star.designsystem.styles.listitem.ListItemDefaultSize
import com.sdkit.star.designsystem.styles.listitem.ListItemStyles
import com.sdkit.star.designsystem.styles.listitem.M
import com.sdkit.star.designsystem.styles.listitem.S
import com.sdkit.star.designsystem.styles.listitem.Xs
import com.sdkit.star.designsystem.styles.listitem.resolve

internal object PlasmaStardsListItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "ListItem.L" to ComposeStyleReference { ListItem.L.style() },
            "ListItem.M" to ComposeStyleReference { ListItem.M.style() },
            "ListItem.S" to ComposeStyleReference { ListItem.S.style() },
            "ListItem.Xs" to ComposeStyleReference { ListItem.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ListItemDefaultSize.L
                "M" -> ListItemDefaultSize.M
                "S" -> ListItemDefaultSize.S
                "Xs" -> ListItemDefaultSize.Xs
                else -> ListItemDefaultSize.L
            },
        ).key
    }
}
