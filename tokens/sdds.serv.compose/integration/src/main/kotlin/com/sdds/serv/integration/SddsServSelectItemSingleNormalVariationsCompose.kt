// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.selectitem.L
import com.sdds.serv.styles.selectitem.M
import com.sdds.serv.styles.selectitem.S
import com.sdds.serv.styles.selectitem.SelectItemSingleNormal
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs

internal object SddsServSelectItemSingleNormalVariationsCompose : ComposeStyleProvider<SelectItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<SelectItemStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { SelectItemSingleNormal.Xl.style() },
            "L" to ComposeStyleReference { SelectItemSingleNormal.L.style() },
            "M" to ComposeStyleReference { SelectItemSingleNormal.M.style() },
            "S" to ComposeStyleReference { SelectItemSingleNormal.S.style() },
            "Xs" to ComposeStyleReference { SelectItemSingleNormal.Xs.style() },
        )
}
