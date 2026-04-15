// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.dropdownmenu.DropdownMenuTight
import com.sdds.serv.styles.dropdownmenu.L
import com.sdds.serv.styles.dropdownmenu.M
import com.sdds.serv.styles.dropdownmenu.S
import com.sdds.serv.styles.dropdownmenu.Xl
import com.sdds.serv.styles.dropdownmenu.Xs

internal object SddsServDropdownMenuTightVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {
    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { DropdownMenuTight.Xl.style() },
            "L" to ComposeStyleReference { DropdownMenuTight.L.style() },
            "M" to ComposeStyleReference { DropdownMenuTight.M.style() },
            "S" to ComposeStyleReference { DropdownMenuTight.S.style() },
            "Xs" to ComposeStyleReference { DropdownMenuTight.Xs.style() },
        )
}
