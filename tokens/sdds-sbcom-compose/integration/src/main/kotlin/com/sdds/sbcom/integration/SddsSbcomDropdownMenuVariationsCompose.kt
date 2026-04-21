// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.dropdownmenu.Default
import com.sdds.sbcom.styles.dropdownmenu.DropdownMenu

internal object SddsSbcomDropdownMenuVariationsCompose : ComposeStyleProvider<DropdownMenuStyle>() {

    override val variations: Map<String, ComposeStyleReference<DropdownMenuStyle>> =
        mapOf(
            "DropdownMenu.Default" to ComposeStyleReference { DropdownMenu.Default.style() },
        )
}
