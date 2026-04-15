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
import com.sdds.serv.styles.select.SelectMultipleNormal
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs

internal object SddsServSelectMultipleNormalVariationsCompose : ComposeStyleProvider<SelectStyle>() {
    override val variations: Map<String, ComposeStyleReference<SelectStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { SelectMultipleNormal.Xl.style() },
            "L" to ComposeStyleReference { SelectMultipleNormal.L.style() },
            "M" to ComposeStyleReference { SelectMultipleNormal.M.style() },
            "S" to ComposeStyleReference { SelectMultipleNormal.S.style() },
            "Xs" to ComposeStyleReference { SelectMultipleNormal.Xs.style() },
        )
}
