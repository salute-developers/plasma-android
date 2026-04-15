// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.autocomplete.AutocompleteTight
import com.sdds.plasma.sd.service.styles.autocomplete.L
import com.sdds.plasma.sd.service.styles.autocomplete.M
import com.sdds.plasma.sd.service.styles.autocomplete.S
import com.sdds.plasma.sd.service.styles.autocomplete.Xl
import com.sdds.plasma.sd.service.styles.autocomplete.Xs

internal object PlasmaB2cAutocompleteTightVariationsCompose : ComposeStyleProvider<AutocompleteStyle>() {
    override val variations: Map<String, ComposeStyleReference<AutocompleteStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { AutocompleteTight.Xl.style() },
            "L" to ComposeStyleReference { AutocompleteTight.L.style() },
            "M" to ComposeStyleReference { AutocompleteTight.M.style() },
            "S" to ComposeStyleReference { AutocompleteTight.S.style() },
            "Xs" to ComposeStyleReference { AutocompleteTight.Xs.style() },
        )
}
