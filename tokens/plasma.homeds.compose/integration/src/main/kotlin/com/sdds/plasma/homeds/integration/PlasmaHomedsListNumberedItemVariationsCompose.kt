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
import com.sdds.plasma.homeds.styles.listitem.ListItemListNumberedItemSize
import com.sdds.plasma.homeds.styles.listitem.ListItemStyles
import com.sdds.plasma.homeds.styles.listitem.ListNumberedItem
import com.sdds.plasma.homeds.styles.listitem.S
import com.sdds.plasma.homeds.styles.listitem.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsListNumberedItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S")),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "ListNumberedItem.S" to ComposeStyleReference { ListNumberedItem.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.ListNumberedItem.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> ListItemListNumberedItemSize.S
                else -> ListItemListNumberedItemSize.S
            },
        ).key
    }
}
