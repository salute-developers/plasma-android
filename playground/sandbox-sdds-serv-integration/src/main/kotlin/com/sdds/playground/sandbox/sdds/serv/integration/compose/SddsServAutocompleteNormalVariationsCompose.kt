package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.autocomplete.AutocompleteNormal
import com.sdds.serv.styles.autocomplete.L
import com.sdds.serv.styles.autocomplete.M
import com.sdds.serv.styles.autocomplete.S
import com.sdds.serv.styles.autocomplete.Xl
import com.sdds.serv.styles.autocomplete.Xs

internal object SddsServAutocompleteNormalVariationsCompose : ComposeStyleProvider<String, AutocompleteStyle>() {
    override val variations: Map<String, @Composable () -> AutocompleteStyle> =
        mapOf(
            "Xl" to { AutocompleteNormal.Xl.style() },
            "L" to { AutocompleteNormal.L.style() },
            "M" to { AutocompleteNormal.M.style() },
            "S" to { AutocompleteNormal.S.style() },
            "Xs" to { AutocompleteNormal.Xs.style() },
        )
}
