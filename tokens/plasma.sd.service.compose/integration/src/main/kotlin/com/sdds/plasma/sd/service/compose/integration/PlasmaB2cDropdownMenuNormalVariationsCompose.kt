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
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuNormalSize
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuStyles
import com.sdds.plasma.sd.service.styles.dropdownmenu.L
import com.sdds.plasma.sd.service.styles.dropdownmenu.M
import com.sdds.plasma.sd.service.styles.dropdownmenu.S
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xl
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xs
import com.sdds.plasma.sd.service.styles.dropdownmenu.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cDropdownMenuNormalVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {
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
