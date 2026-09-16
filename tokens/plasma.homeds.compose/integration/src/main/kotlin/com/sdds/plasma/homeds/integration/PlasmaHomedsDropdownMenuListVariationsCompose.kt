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
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.list.Default
import com.sdds.plasma.homeds.styles.list.DropdownMenuList

internal object PlasmaHomedsDropdownMenuListVariationsCompose : ComposeStyleProvider<ListStyle>() {

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "DropdownMenuList.Default" to ComposeStyleReference { DropdownMenuList.Default.style() },
        )
}
