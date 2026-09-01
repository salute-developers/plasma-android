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
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.dropdownmenu.DropdownMenuStyles
import com.sdds.finai.styles.dropdownmenu.DropdownMenuTight
import com.sdds.finai.styles.dropdownmenu.DropdownMenuTightSize
import com.sdds.finai.styles.dropdownmenu.M
import com.sdds.finai.styles.dropdownmenu.S
import com.sdds.finai.styles.dropdownmenu.Xs
import com.sdds.finai.styles.dropdownmenu.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiDropdownMenuTightVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "DropdownMenuTight.M" to ComposeStyleReference { DropdownMenuTight.M.style() },
            "DropdownMenuTight.S" to ComposeStyleReference { DropdownMenuTight.S.style() },
            "DropdownMenuTight.Xs" to ComposeStyleReference { DropdownMenuTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DropdownMenuStyles.Tight.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> DropdownMenuTightSize.M
                "S" -> DropdownMenuTightSize.S
                "Xs" -> DropdownMenuTightSize.Xs
                else -> DropdownMenuTightSize.M
            },
        ).key
    }
}
