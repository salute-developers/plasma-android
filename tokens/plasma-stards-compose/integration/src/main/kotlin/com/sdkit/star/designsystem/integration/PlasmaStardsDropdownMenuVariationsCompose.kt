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
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.dropdownmenu.DropdownMenu
import com.sdkit.star.designsystem.styles.dropdownmenu.DropdownMenuSize
import com.sdkit.star.designsystem.styles.dropdownmenu.DropdownMenuStyles
import com.sdkit.star.designsystem.styles.dropdownmenu.L
import com.sdkit.star.designsystem.styles.dropdownmenu.M
import com.sdkit.star.designsystem.styles.dropdownmenu.S
import com.sdkit.star.designsystem.styles.dropdownmenu.Xl
import com.sdkit.star.designsystem.styles.dropdownmenu.Xs
import com.sdkit.star.designsystem.styles.dropdownmenu.resolve

internal object PlasmaStardsDropdownMenuVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "DropdownMenu.Xl" to ComposeStyleReference { DropdownMenu.Xl.style() },
            "DropdownMenu.L" to ComposeStyleReference { DropdownMenu.L.style() },
            "DropdownMenu.M" to ComposeStyleReference { DropdownMenu.M.style() },
            "DropdownMenu.S" to ComposeStyleReference { DropdownMenu.S.style() },
            "DropdownMenu.Xs" to ComposeStyleReference { DropdownMenu.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DropdownMenuStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> DropdownMenuSize.Xl
                "L" -> DropdownMenuSize.L
                "M" -> DropdownMenuSize.M
                "S" -> DropdownMenuSize.S
                "Xs" -> DropdownMenuSize.Xs
                else -> DropdownMenuSize.Xl
            },
        ).key
    }
}
