// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.dropdownmenu.DropdownMenu
import com.sdkit.star.designsystem.styles.dropdownmenu.L
import com.sdkit.star.designsystem.styles.dropdownmenu.M
import com.sdkit.star.designsystem.styles.dropdownmenu.S
import com.sdkit.star.designsystem.styles.dropdownmenu.Xl
import com.sdkit.star.designsystem.styles.dropdownmenu.Xs

internal object PlasmaStardsDropdownMenuVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {
    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { DropdownMenu.Xl.style() },
            "L" to ComposeStyleReference { DropdownMenu.L.style() },
            "M" to ComposeStyleReference { DropdownMenu.M.style() },
            "S" to ComposeStyleReference { DropdownMenu.S.style() },
            "Xs" to ComposeStyleReference { DropdownMenu.Xs.style() },
        )
}
