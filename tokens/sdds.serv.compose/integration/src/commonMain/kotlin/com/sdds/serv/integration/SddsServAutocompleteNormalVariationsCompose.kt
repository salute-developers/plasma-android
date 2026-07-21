// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.autocomplete.AutocompleteNormal
import com.sdds.serv.styles.autocomplete.AutocompleteNormalSize
import com.sdds.serv.styles.autocomplete.AutocompleteStyles
import com.sdds.serv.styles.autocomplete.L
import com.sdds.serv.styles.autocomplete.M
import com.sdds.serv.styles.autocomplete.S
import com.sdds.serv.styles.autocomplete.Xl
import com.sdds.serv.styles.autocomplete.Xs
import com.sdds.serv.styles.autocomplete.resolve

internal object SddsServAutocompleteNormalVariationsCompose : ComposeStyleProvider<AutocompleteStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<AutocompleteStyle>> =
        mapOf(
            "AutocompleteNormal.Xl" to ComposeStyleReference { AutocompleteNormal.Xl.style() },
            "AutocompleteNormal.L" to ComposeStyleReference { AutocompleteNormal.L.style() },
            "AutocompleteNormal.M" to ComposeStyleReference { AutocompleteNormal.M.style() },
            "AutocompleteNormal.S" to ComposeStyleReference { AutocompleteNormal.S.style() },
            "AutocompleteNormal.Xs" to ComposeStyleReference { AutocompleteNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AutocompleteStyles.Normal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> AutocompleteNormalSize.Xl
                "L" -> AutocompleteNormalSize.L
                "M" -> AutocompleteNormalSize.M
                "S" -> AutocompleteNormalSize.S
                "Xs" -> AutocompleteNormalSize.Xs
                else -> AutocompleteNormalSize.Xl
            },
        ).key
    }
}
