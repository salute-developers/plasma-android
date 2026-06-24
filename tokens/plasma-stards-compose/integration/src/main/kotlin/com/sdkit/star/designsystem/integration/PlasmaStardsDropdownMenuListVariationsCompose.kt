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
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.list.DropdownMenuList
import com.sdkit.star.designsystem.styles.list.DropdownMenuListSize
import com.sdkit.star.designsystem.styles.list.L
import com.sdkit.star.designsystem.styles.list.ListStyles
import com.sdkit.star.designsystem.styles.list.M
import com.sdkit.star.designsystem.styles.list.S
import com.sdkit.star.designsystem.styles.list.Xl
import com.sdkit.star.designsystem.styles.list.Xs
import com.sdkit.star.designsystem.styles.list.resolve

internal object PlasmaStardsDropdownMenuListVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "DropdownMenuList.Xl" to ComposeStyleReference { DropdownMenuList.Xl.style() },
            "DropdownMenuList.L" to ComposeStyleReference { DropdownMenuList.L.style() },
            "DropdownMenuList.M" to ComposeStyleReference { DropdownMenuList.M.style() },
            "DropdownMenuList.S" to ComposeStyleReference { DropdownMenuList.S.style() },
            "DropdownMenuList.Xs" to ComposeStyleReference { DropdownMenuList.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.DropdownMenuList.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> DropdownMenuListSize.Xl
                "L" -> DropdownMenuListSize.L
                "M" -> DropdownMenuListSize.M
                "S" -> DropdownMenuListSize.S
                "Xs" -> DropdownMenuListSize.Xs
                else -> DropdownMenuListSize.Xl
            },
        ).key
    }
}
