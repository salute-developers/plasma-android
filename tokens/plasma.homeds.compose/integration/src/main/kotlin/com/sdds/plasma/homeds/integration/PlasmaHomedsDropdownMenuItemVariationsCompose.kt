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
import com.sdds.plasma.homeds.styles.listitem.Default
import com.sdds.plasma.homeds.styles.listitem.DropdownMenuItem
import com.sdds.plasma.homeds.styles.listitem.ListItemDropdownMenuItemView
import com.sdds.plasma.homeds.styles.listitem.ListItemStyles
import com.sdds.plasma.homeds.styles.listitem.Negative
import com.sdds.plasma.homeds.styles.listitem.Positive
import com.sdds.plasma.homeds.styles.listitem.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsDropdownMenuItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Positive", "Negative"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "DropdownMenuItem.Default" to ComposeStyleReference { DropdownMenuItem.Default.style() },
            "DropdownMenuItem.Positive" to ComposeStyleReference { DropdownMenuItem.Positive.style() },
            "DropdownMenuItem.Negative" to ComposeStyleReference { DropdownMenuItem.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.DropdownMenuItem.resolve(
            view = when (bindings["view"]?.toString()) {
                "Default" -> ListItemDropdownMenuItemView.Default
                "Positive" -> ListItemDropdownMenuItemView.Positive
                "Negative" -> ListItemDropdownMenuItemView.Negative
                else -> ListItemDropdownMenuItemView.Default
            },
        ).key
    }
}
