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
import com.sdds.finai.styles.listitem.DropdownMenuItemNormal
import com.sdds.finai.styles.listitem.ListItemDropdownMenuItemNormalSize
import com.sdds.finai.styles.listitem.ListItemDropdownMenuItemNormalView
import com.sdds.finai.styles.listitem.ListItemStyles
import com.sdds.finai.styles.listitem.M
import com.sdds.finai.styles.listitem.Negative
import com.sdds.finai.styles.listitem.S
import com.sdds.finai.styles.listitem.Xs
import com.sdds.finai.styles.listitem.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiDropdownMenuItemNormalVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Negative")),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "DropdownMenuItemNormal.M.Default" to ComposeStyleReference { DropdownMenuItemNormal.M.Default.style() },
            "DropdownMenuItemNormal.M.Negative" to ComposeStyleReference { DropdownMenuItemNormal.M.Negative.style() },
            "DropdownMenuItemNormal.S.Default" to ComposeStyleReference { DropdownMenuItemNormal.S.Default.style() },
            "DropdownMenuItemNormal.S.Negative" to ComposeStyleReference { DropdownMenuItemNormal.S.Negative.style() },
            "DropdownMenuItemNormal.Xs.Default" to ComposeStyleReference { DropdownMenuItemNormal.Xs.Default.style() },
            "DropdownMenuItemNormal.Xs.Negative" to ComposeStyleReference { DropdownMenuItemNormal.Xs.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.DropdownMenuItemNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> ListItemDropdownMenuItemNormalSize.M
                "S" -> ListItemDropdownMenuItemNormalSize.S
                "Xs" -> ListItemDropdownMenuItemNormalSize.Xs
                else -> ListItemDropdownMenuItemNormalSize.M
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ListItemDropdownMenuItemNormalView.Default
                "Negative" -> ListItemDropdownMenuItemNormalView.Negative
                else -> ListItemDropdownMenuItemNormalView.Default
            },
        ).key
    }
}
