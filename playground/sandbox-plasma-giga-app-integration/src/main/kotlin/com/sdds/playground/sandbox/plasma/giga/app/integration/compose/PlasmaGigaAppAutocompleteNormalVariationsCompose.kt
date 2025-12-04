package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.autocomplete.AutocompleteNormal
import com.sdds.plasma.giga.app.styles.autocomplete.L
import com.sdds.plasma.giga.app.styles.autocomplete.M
import com.sdds.plasma.giga.app.styles.autocomplete.S
import com.sdds.plasma.giga.app.styles.autocomplete.Xl
import com.sdds.plasma.giga.app.styles.autocomplete.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppAutocompleteNormalVariationsCompose : ComposeStyleProvider<String, AutocompleteStyle>() {
    override val variations: Map<String, @Composable () -> AutocompleteStyle> =
        mapOf(
            "Xl" to { AutocompleteNormal.Xl.style() },
            "L" to { AutocompleteNormal.L.style() },
            "M" to { AutocompleteNormal.M.style() },
            "S" to { AutocompleteNormal.S.style() },
            "Xs" to { AutocompleteNormal.Xs.style() },
        )
}
