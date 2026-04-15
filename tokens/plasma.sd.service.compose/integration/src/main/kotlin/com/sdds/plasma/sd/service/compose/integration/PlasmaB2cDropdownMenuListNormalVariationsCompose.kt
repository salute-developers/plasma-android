// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.list.DropdownMenuListNormal
import com.sdds.plasma.sd.service.styles.list.L
import com.sdds.plasma.sd.service.styles.list.M
import com.sdds.plasma.sd.service.styles.list.S
import com.sdds.plasma.sd.service.styles.list.Xl
import com.sdds.plasma.sd.service.styles.list.Xs

internal object PlasmaB2cDropdownMenuListNormalVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { DropdownMenuListNormal.Xl.style() },
            "L" to ComposeStyleReference { DropdownMenuListNormal.L.style() },
            "M" to ComposeStyleReference { DropdownMenuListNormal.M.style() },
            "S" to ComposeStyleReference { DropdownMenuListNormal.S.style() },
            "Xs" to ComposeStyleReference { DropdownMenuListNormal.Xs.style() },
        )
}
