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
import com.sdds.plasma.sd.service.styles.listitem.DropdownMenuItemTight
import com.sdds.plasma.sd.service.styles.listitem.L
import com.sdds.plasma.sd.service.styles.listitem.ListItemDropdownMenuItemTightSize
import com.sdds.plasma.sd.service.styles.listitem.ListItemDropdownMenuItemTightView
import com.sdds.plasma.sd.service.styles.listitem.ListItemStyles
import com.sdds.plasma.sd.service.styles.listitem.M
import com.sdds.plasma.sd.service.styles.listitem.Negative
import com.sdds.plasma.sd.service.styles.listitem.Positive
import com.sdds.plasma.sd.service.styles.listitem.S
import com.sdds.plasma.sd.service.styles.listitem.Xl
import com.sdds.plasma.sd.service.styles.listitem.Xs
import com.sdds.plasma.sd.service.styles.listitem.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cDropdownMenuItemTightVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
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
            "DropdownMenuItemTight.Xl.Default" to ComposeStyleReference { DropdownMenuItemTight.Xl.Default.style() },
            "DropdownMenuItemTight.Xl.Positive" to ComposeStyleReference { DropdownMenuItemTight.Xl.Positive.style() },
            "DropdownMenuItemTight.Xl.Negative" to ComposeStyleReference { DropdownMenuItemTight.Xl.Negative.style() },
            "DropdownMenuItemTight.L.Default" to ComposeStyleReference { DropdownMenuItemTight.L.Default.style() },
            "DropdownMenuItemTight.L.Positive" to ComposeStyleReference { DropdownMenuItemTight.L.Positive.style() },
            "DropdownMenuItemTight.L.Negative" to ComposeStyleReference { DropdownMenuItemTight.L.Negative.style() },
            "DropdownMenuItemTight.M.Default" to ComposeStyleReference { DropdownMenuItemTight.M.Default.style() },
            "DropdownMenuItemTight.M.Positive" to ComposeStyleReference { DropdownMenuItemTight.M.Positive.style() },
            "DropdownMenuItemTight.M.Negative" to ComposeStyleReference { DropdownMenuItemTight.M.Negative.style() },
            "DropdownMenuItemTight.S.Default" to ComposeStyleReference { DropdownMenuItemTight.S.Default.style() },
            "DropdownMenuItemTight.S.Positive" to ComposeStyleReference { DropdownMenuItemTight.S.Positive.style() },
            "DropdownMenuItemTight.S.Negative" to ComposeStyleReference { DropdownMenuItemTight.S.Negative.style() },
            "DropdownMenuItemTight.Xs.Default" to ComposeStyleReference { DropdownMenuItemTight.Xs.Default.style() },
            "DropdownMenuItemTight.Xs.Positive" to ComposeStyleReference { DropdownMenuItemTight.Xs.Positive.style() },
            "DropdownMenuItemTight.Xs.Negative" to ComposeStyleReference { DropdownMenuItemTight.Xs.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.DropdownMenuItemTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ListItemDropdownMenuItemTightSize.Xl
                "L" -> ListItemDropdownMenuItemTightSize.L
                "M" -> ListItemDropdownMenuItemTightSize.M
                "S" -> ListItemDropdownMenuItemTightSize.S
                "Xs" -> ListItemDropdownMenuItemTightSize.Xs
                else -> ListItemDropdownMenuItemTightSize.Xl
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ListItemDropdownMenuItemTightView.Default
                "Positive" -> ListItemDropdownMenuItemTightView.Positive
                "Negative" -> ListItemDropdownMenuItemTightView.Negative
                else -> ListItemDropdownMenuItemTightView.Default
            },
        ).key
    }
}
