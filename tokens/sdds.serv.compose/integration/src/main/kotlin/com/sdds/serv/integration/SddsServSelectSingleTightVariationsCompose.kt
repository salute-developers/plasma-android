// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.select.L
import com.sdds.serv.styles.select.M
import com.sdds.serv.styles.select.S
import com.sdds.serv.styles.select.SelectSingleTight
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs

internal object SddsServSelectSingleTightVariationsCompose : ComposeStyleProvider<SelectStyle>() {
    override val variations: Map<String, ComposeStyleReference<SelectStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { SelectSingleTight.Xl.style() },
            "L" to ComposeStyleReference { SelectSingleTight.L.style() },
            "M" to ComposeStyleReference { SelectSingleTight.M.style() },
            "S" to ComposeStyleReference { SelectSingleTight.S.style() },
            "Xs" to ComposeStyleReference { SelectSingleTight.Xs.style() },
        )
}
