package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.autocomplete.AutocompleteTight
import com.sdds.plasma.sd.service.styles.autocomplete.L
import com.sdds.plasma.sd.service.styles.autocomplete.M
import com.sdds.plasma.sd.service.styles.autocomplete.S
import com.sdds.plasma.sd.service.styles.autocomplete.Xl
import com.sdds.plasma.sd.service.styles.autocomplete.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cAutocompleteTightVariationsCompose : ComposeStyleProvider<String, AutocompleteStyle>() {
    override val variations: Map<String, @Composable () -> AutocompleteStyle> =
        mapOf(
            "Xl" to { AutocompleteTight.Xl.style() },
            "L" to { AutocompleteTight.L.style() },
            "M" to { AutocompleteTight.M.style() },
            "S" to { AutocompleteTight.S.style() },
            "Xs" to { AutocompleteTight.Xs.style() },
        )
}
