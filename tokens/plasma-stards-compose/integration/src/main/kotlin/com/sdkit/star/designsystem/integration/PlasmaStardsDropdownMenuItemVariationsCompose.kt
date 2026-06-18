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
import com.sdkit.star.designsystem.styles.listitem.Default
import com.sdkit.star.designsystem.styles.listitem.DropdownMenuItem
import com.sdkit.star.designsystem.styles.listitem.L
import com.sdkit.star.designsystem.styles.listitem.ListItemDropdownMenuItemSize
import com.sdkit.star.designsystem.styles.listitem.ListItemDropdownMenuItemView
import com.sdkit.star.designsystem.styles.listitem.ListItemStyles
import com.sdkit.star.designsystem.styles.listitem.M
import com.sdkit.star.designsystem.styles.listitem.Negative
import com.sdkit.star.designsystem.styles.listitem.Positive
import com.sdkit.star.designsystem.styles.listitem.S
import com.sdkit.star.designsystem.styles.listitem.Xl
import com.sdkit.star.designsystem.styles.listitem.Xs
import com.sdkit.star.designsystem.styles.listitem.resolve

internal object PlasmaStardsDropdownMenuItemVariationsCompose : ComposeStyleProvider<ListItemStyle>() {
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
            "DropdownMenuItem.Xl.Default" to ComposeStyleReference { DropdownMenuItem.Xl.Default.style() },
            "DropdownMenuItem.Xl.Positive" to ComposeStyleReference { DropdownMenuItem.Xl.Positive.style() },
            "DropdownMenuItem.Xl.Negative" to ComposeStyleReference { DropdownMenuItem.Xl.Negative.style() },
            "DropdownMenuItem.L.Default" to ComposeStyleReference { DropdownMenuItem.L.Default.style() },
            "DropdownMenuItem.L.Positive" to ComposeStyleReference { DropdownMenuItem.L.Positive.style() },
            "DropdownMenuItem.L.Negative" to ComposeStyleReference { DropdownMenuItem.L.Negative.style() },
            "DropdownMenuItem.M.Default" to ComposeStyleReference { DropdownMenuItem.M.Default.style() },
            "DropdownMenuItem.M.Positive" to ComposeStyleReference { DropdownMenuItem.M.Positive.style() },
            "DropdownMenuItem.M.Negative" to ComposeStyleReference { DropdownMenuItem.M.Negative.style() },
            "DropdownMenuItem.S.Default" to ComposeStyleReference { DropdownMenuItem.S.Default.style() },
            "DropdownMenuItem.S.Positive" to ComposeStyleReference { DropdownMenuItem.S.Positive.style() },
            "DropdownMenuItem.S.Negative" to ComposeStyleReference { DropdownMenuItem.S.Negative.style() },
            "DropdownMenuItem.Xs.Default" to ComposeStyleReference { DropdownMenuItem.Xs.Default.style() },
            "DropdownMenuItem.Xs.Positive" to ComposeStyleReference { DropdownMenuItem.Xs.Positive.style() },
            "DropdownMenuItem.Xs.Negative" to ComposeStyleReference { DropdownMenuItem.Xs.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListItemStyles.DropdownMenuItem.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ListItemDropdownMenuItemSize.Xl
                "L" -> ListItemDropdownMenuItemSize.L
                "M" -> ListItemDropdownMenuItemSize.M
                "S" -> ListItemDropdownMenuItemSize.S
                "Xs" -> ListItemDropdownMenuItemSize.Xs
                else -> ListItemDropdownMenuItemSize.Xl
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ListItemDropdownMenuItemView.Default
                "Positive" -> ListItemDropdownMenuItemView.Positive
                "Negative" -> ListItemDropdownMenuItemView.Negative
                else -> ListItemDropdownMenuItemView.Default
            },
        ).key
    }
}
