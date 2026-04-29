// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.listitem.HasBackground
import com.sdds.plasma.homeds.styles.listitem.ListItem
import com.sdds.plasma.homeds.styles.listitem.ListItemDefaultSize
import com.sdds.plasma.homeds.styles.listitem.ListItemStyles
import com.sdds.plasma.homeds.styles.listitem.M
import com.sdds.plasma.homeds.styles.listitem.S
import com.sdds.plasma.homeds.styles.listitem.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsListItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S", "M")),
            Property.BooleanProperty(name = "hasBackground", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "ListItem.S" to ComposeStyleReference { ListItem.S.style() },
            "ListItem.S.HasBackground" to ComposeStyleReference { ListItem.S.HasBackground.style() },
            "ListItem.M" to ComposeStyleReference { ListItem.M.style() },
            "ListItem.M.HasBackground" to ComposeStyleReference { ListItem.M.HasBackground.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> ListItemDefaultSize.S
                "M" -> ListItemDefaultSize.M
                else -> ListItemDefaultSize.S
            },
            hasBackground = booleanBindingValue(bindings, "hasBackground", false),
        ).key
    }
}
