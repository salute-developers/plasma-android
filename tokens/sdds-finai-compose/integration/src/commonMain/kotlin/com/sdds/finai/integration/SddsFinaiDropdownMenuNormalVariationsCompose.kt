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
import com.sdds.finai.styles.dropdownmenu.DropdownMenuNormal
import com.sdds.finai.styles.dropdownmenu.DropdownMenuNormalSize
import com.sdds.finai.styles.dropdownmenu.DropdownMenuStyles
import com.sdds.finai.styles.dropdownmenu.M
import com.sdds.finai.styles.dropdownmenu.S
import com.sdds.finai.styles.dropdownmenu.Xs
import com.sdds.finai.styles.dropdownmenu.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiDropdownMenuNormalVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "DropdownMenuNormal.M" to ComposeStyleReference { DropdownMenuNormal.M.style() },
            "DropdownMenuNormal.S" to ComposeStyleReference { DropdownMenuNormal.S.style() },
            "DropdownMenuNormal.Xs" to ComposeStyleReference { DropdownMenuNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DropdownMenuStyles.Normal.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> DropdownMenuNormalSize.M
                "S" -> DropdownMenuNormalSize.S
                "Xs" -> DropdownMenuNormalSize.Xs
                else -> DropdownMenuNormalSize.M
            },
        ).key
    }
}
