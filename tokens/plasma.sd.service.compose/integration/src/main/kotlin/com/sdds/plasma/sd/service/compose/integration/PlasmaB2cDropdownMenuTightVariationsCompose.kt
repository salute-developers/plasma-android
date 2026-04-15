// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.dropdownmenu.DropdownMenuTight
import com.sdds.plasma.sd.service.styles.dropdownmenu.L
import com.sdds.plasma.sd.service.styles.dropdownmenu.M
import com.sdds.plasma.sd.service.styles.dropdownmenu.S
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xl
import com.sdds.plasma.sd.service.styles.dropdownmenu.Xs

internal object PlasmaB2cDropdownMenuTightVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {
    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { DropdownMenuTight.Xl.style() },
            "L" to ComposeStyleReference { DropdownMenuTight.L.style() },
            "M" to ComposeStyleReference { DropdownMenuTight.M.style() },
            "S" to ComposeStyleReference { DropdownMenuTight.S.style() },
            "Xs" to ComposeStyleReference { DropdownMenuTight.Xs.style() },
        )
}
