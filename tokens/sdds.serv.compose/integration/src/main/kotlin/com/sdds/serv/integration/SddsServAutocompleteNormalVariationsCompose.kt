// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.autocomplete.AutocompleteNormal
import com.sdds.serv.styles.autocomplete.L
import com.sdds.serv.styles.autocomplete.M
import com.sdds.serv.styles.autocomplete.S
import com.sdds.serv.styles.autocomplete.Xl
import com.sdds.serv.styles.autocomplete.Xs

internal object SddsServAutocompleteNormalVariationsCompose : ComposeStyleProvider<AutocompleteStyle>() {
    override val variations: Map<String, ComposeStyleReference<AutocompleteStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { AutocompleteNormal.Xl.style() },
            "L" to ComposeStyleReference { AutocompleteNormal.L.style() },
            "M" to ComposeStyleReference { AutocompleteNormal.M.style() },
            "S" to ComposeStyleReference { AutocompleteNormal.S.style() },
            "Xs" to ComposeStyleReference { AutocompleteNormal.Xs.style() },
        )
}
