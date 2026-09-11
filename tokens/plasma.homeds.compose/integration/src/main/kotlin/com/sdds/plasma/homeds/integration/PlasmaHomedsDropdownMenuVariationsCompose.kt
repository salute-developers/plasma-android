// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.dropdownmenu.Default
import com.sdds.plasma.homeds.styles.dropdownmenu.DropdownMenu

internal object PlasmaHomedsDropdownMenuVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {

    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "DropdownMenu.Default" to ComposeStyleReference { DropdownMenu.Default.style() },
        )
}
