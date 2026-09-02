// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.listitem.Default
import com.sdds.finai.styles.listitem.DropdownMenuItemTight
import com.sdds.finai.styles.listitem.ListItemDropdownMenuItemTightSize
import com.sdds.finai.styles.listitem.ListItemDropdownMenuItemTightView
import com.sdds.finai.styles.listitem.ListItemStyles
import com.sdds.finai.styles.listitem.M
import com.sdds.finai.styles.listitem.Negative
import com.sdds.finai.styles.listitem.S
import com.sdds.finai.styles.listitem.Xs
import com.sdds.finai.styles.listitem.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiDropdownMenuItemTightVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Negative")),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "DropdownMenuItemTight.M.Default" to ComposeStyleReference { DropdownMenuItemTight.M.Default.style() },
            "DropdownMenuItemTight.M.Negative" to ComposeStyleReference { DropdownMenuItemTight.M.Negative.style() },
            "DropdownMenuItemTight.S.Default" to ComposeStyleReference { DropdownMenuItemTight.S.Default.style() },
            "DropdownMenuItemTight.S.Negative" to ComposeStyleReference { DropdownMenuItemTight.S.Negative.style() },
            "DropdownMenuItemTight.Xs.Default" to ComposeStyleReference { DropdownMenuItemTight.Xs.Default.style() },
            "DropdownMenuItemTight.Xs.Negative" to ComposeStyleReference { DropdownMenuItemTight.Xs.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.DropdownMenuItemTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> ListItemDropdownMenuItemTightSize.M
                "S" -> ListItemDropdownMenuItemTightSize.S
                "Xs" -> ListItemDropdownMenuItemTightSize.Xs
                else -> ListItemDropdownMenuItemTightSize.M
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ListItemDropdownMenuItemTightView.Default
                "Negative" -> ListItemDropdownMenuItemTightView.Negative
                else -> ListItemDropdownMenuItemTightView.Default
            },
        ).key
    }
}
