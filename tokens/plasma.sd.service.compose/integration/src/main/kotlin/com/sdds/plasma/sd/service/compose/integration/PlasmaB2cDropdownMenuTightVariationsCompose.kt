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
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuStyles
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuTight
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuTightSize
import com.sdds.plasma.sd.service.styles.dropdownmenu.L
import com.sdds.plasma.sd.service.styles.dropdownmenu.M
import com.sdds.plasma.sd.service.styles.dropdownmenu.S
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xl
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xs
import com.sdds.plasma.sd.service.styles.dropdownmenu.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cDropdownMenuTightVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "DropdownMenuTight.Xl" to ComposeStyleReference { DropdownMenuTight.Xl.style() },
            "DropdownMenuTight.L" to ComposeStyleReference { DropdownMenuTight.L.style() },
            "DropdownMenuTight.M" to ComposeStyleReference { DropdownMenuTight.M.style() },
            "DropdownMenuTight.S" to ComposeStyleReference { DropdownMenuTight.S.style() },
            "DropdownMenuTight.Xs" to ComposeStyleReference { DropdownMenuTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DropdownMenuStyles.Tight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> DropdownMenuTightSize.Xl
                "L" -> DropdownMenuTightSize.L
                "M" -> DropdownMenuTightSize.M
                "S" -> DropdownMenuTightSize.S
                "Xs" -> DropdownMenuTightSize.Xs
                else -> DropdownMenuTightSize.Xl
            },
        ).key
    }
}
