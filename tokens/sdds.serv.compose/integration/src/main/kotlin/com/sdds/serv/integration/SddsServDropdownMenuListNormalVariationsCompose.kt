// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.list.DropdownMenuListNormal
import com.sdds.serv.styles.list.L
import com.sdds.serv.styles.list.M
import com.sdds.serv.styles.list.S
import com.sdds.serv.styles.list.Xl
import com.sdds.serv.styles.list.Xs

internal object SddsServDropdownMenuListNormalVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { DropdownMenuListNormal.Xl.style() },
            "L" to ComposeStyleReference { DropdownMenuListNormal.L.style() },
            "M" to ComposeStyleReference { DropdownMenuListNormal.M.style() },
            "S" to ComposeStyleReference { DropdownMenuListNormal.S.style() },
            "Xs" to ComposeStyleReference { DropdownMenuListNormal.Xs.style() },
        )
}
