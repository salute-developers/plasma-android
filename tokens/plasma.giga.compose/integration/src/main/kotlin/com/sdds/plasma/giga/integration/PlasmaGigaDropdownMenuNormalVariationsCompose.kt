// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.plasma.giga.styles.dropdownmenu.DropdownMenuNormalSize
import com.sdds.plasma.giga.styles.dropdownmenu.DropdownMenuStyles
import com.sdds.plasma.giga.styles.dropdownmenu.L
import com.sdds.plasma.giga.styles.dropdownmenu.M
import com.sdds.plasma.giga.styles.dropdownmenu.S
import com.sdds.plasma.giga.styles.dropdownmenu.Xl
import com.sdds.plasma.giga.styles.dropdownmenu.Xs
import com.sdds.plasma.giga.styles.dropdownmenu.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaDropdownMenuNormalVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "DropdownMenuNormal.Xl" to ComposeStyleReference { DropdownMenuNormal.Xl.style() },
            "DropdownMenuNormal.L" to ComposeStyleReference { DropdownMenuNormal.L.style() },
            "DropdownMenuNormal.M" to ComposeStyleReference { DropdownMenuNormal.M.style() },
            "DropdownMenuNormal.S" to ComposeStyleReference { DropdownMenuNormal.S.style() },
            "DropdownMenuNormal.Xs" to ComposeStyleReference { DropdownMenuNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DropdownMenuStyles.Normal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> DropdownMenuNormalSize.Xl
                "L" -> DropdownMenuNormalSize.L
                "M" -> DropdownMenuNormalSize.M
                "S" -> DropdownMenuNormalSize.S
                "Xs" -> DropdownMenuNormalSize.Xs
                else -> DropdownMenuNormalSize.Xl
            },
        ).key
    }
}
