// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.listitem.Default
import com.sdds.plasma.sd.service.styles.listitem.DropdownMenuItemNormal
import com.sdds.plasma.sd.service.styles.listitem.L
import com.sdds.plasma.sd.service.styles.listitem.ListItemDropdownMenuItemNormalSize
import com.sdds.plasma.sd.service.styles.listitem.ListItemDropdownMenuItemNormalView
import com.sdds.plasma.sd.service.styles.listitem.ListItemStyles
import com.sdds.plasma.sd.service.styles.listitem.M
import com.sdds.plasma.sd.service.styles.listitem.Negative
import com.sdds.plasma.sd.service.styles.listitem.Positive
import com.sdds.plasma.sd.service.styles.listitem.S
import com.sdds.plasma.sd.service.styles.listitem.Xl
import com.sdds.plasma.sd.service.styles.listitem.Xs
import com.sdds.plasma.sd.service.styles.listitem.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cDropdownMenuItemNormalVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Positive", "Negative"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ListItemStyle>> =
        mapOf(
            "DropdownMenuItemNormal.Xl.Default" to ComposeStyleReference { DropdownMenuItemNormal.Xl.Default.style() },
            "DropdownMenuItemNormal.Xl.Positive" to ComposeStyleReference { DropdownMenuItemNormal.Xl.Positive.style() },
            "DropdownMenuItemNormal.Xl.Negative" to ComposeStyleReference { DropdownMenuItemNormal.Xl.Negative.style() },
            "DropdownMenuItemNormal.L.Default" to ComposeStyleReference { DropdownMenuItemNormal.L.Default.style() },
            "DropdownMenuItemNormal.L.Positive" to ComposeStyleReference { DropdownMenuItemNormal.L.Positive.style() },
            "DropdownMenuItemNormal.L.Negative" to ComposeStyleReference { DropdownMenuItemNormal.L.Negative.style() },
            "DropdownMenuItemNormal.M.Default" to ComposeStyleReference { DropdownMenuItemNormal.M.Default.style() },
            "DropdownMenuItemNormal.M.Positive" to ComposeStyleReference { DropdownMenuItemNormal.M.Positive.style() },
            "DropdownMenuItemNormal.M.Negative" to ComposeStyleReference { DropdownMenuItemNormal.M.Negative.style() },
            "DropdownMenuItemNormal.S.Default" to ComposeStyleReference { DropdownMenuItemNormal.S.Default.style() },
            "DropdownMenuItemNormal.S.Positive" to ComposeStyleReference { DropdownMenuItemNormal.S.Positive.style() },
            "DropdownMenuItemNormal.S.Negative" to ComposeStyleReference { DropdownMenuItemNormal.S.Negative.style() },
            "DropdownMenuItemNormal.Xs.Default" to ComposeStyleReference { DropdownMenuItemNormal.Xs.Default.style() },
            "DropdownMenuItemNormal.Xs.Positive" to ComposeStyleReference { DropdownMenuItemNormal.Xs.Positive.style() },
            "DropdownMenuItemNormal.Xs.Negative" to ComposeStyleReference { DropdownMenuItemNormal.Xs.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.DropdownMenuItemNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ListItemDropdownMenuItemNormalSize.Xl
                "L" -> ListItemDropdownMenuItemNormalSize.L
                "M" -> ListItemDropdownMenuItemNormalSize.M
                "S" -> ListItemDropdownMenuItemNormalSize.S
                "Xs" -> ListItemDropdownMenuItemNormalSize.Xs
                else -> ListItemDropdownMenuItemNormalSize.Xl
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ListItemDropdownMenuItemNormalView.Default
                "Positive" -> ListItemDropdownMenuItemNormalView.Positive
                "Negative" -> ListItemDropdownMenuItemNormalView.Negative
                else -> ListItemDropdownMenuItemNormalView.Default
            },
        ).key
    }
}
