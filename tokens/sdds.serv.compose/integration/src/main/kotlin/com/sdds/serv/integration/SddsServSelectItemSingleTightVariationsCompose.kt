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
import com.sdds.serv.styles.selectitem.SelectItemSingleTight
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs

internal object SddsServSelectItemSingleTightVariationsCompose : ComposeStyleProvider<SelectItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<SelectItemStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { SelectItemSingleTight.Xl.style() },
            "L" to ComposeStyleReference { SelectItemSingleTight.L.style() },
            "M" to ComposeStyleReference { SelectItemSingleTight.M.style() },
            "S" to ComposeStyleReference { SelectItemSingleTight.S.style() },
            "Xs" to ComposeStyleReference { SelectItemSingleTight.Xs.style() },
        )
}
