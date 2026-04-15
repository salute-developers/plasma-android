// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.list.DropdownMenuList
import com.sdkit.star.designsystem.styles.list.L
import com.sdkit.star.designsystem.styles.list.M
import com.sdkit.star.designsystem.styles.list.S
import com.sdkit.star.designsystem.styles.list.Xl
import com.sdkit.star.designsystem.styles.list.Xs

internal object PlasmaStardsDropdownMenuListVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { DropdownMenuList.Xl.style() },
            "L" to ComposeStyleReference { DropdownMenuList.L.style() },
            "M" to ComposeStyleReference { DropdownMenuList.M.style() },
            "S" to ComposeStyleReference { DropdownMenuList.S.style() },
            "Xs" to ComposeStyleReference { DropdownMenuList.Xs.style() },
        )
}
