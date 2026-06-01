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
import com.sdds.serv.styles.autocomplete.AutocompleteStyles
import com.sdds.serv.styles.autocomplete.AutocompleteTight
import com.sdds.serv.styles.autocomplete.AutocompleteTightSize
import com.sdds.serv.styles.autocomplete.L
import com.sdds.serv.styles.autocomplete.M
import com.sdds.serv.styles.autocomplete.S
import com.sdds.serv.styles.autocomplete.Xl
import com.sdds.serv.styles.autocomplete.Xs
import com.sdds.serv.styles.autocomplete.resolve

internal object SddsServAutocompleteTightVariationsCompose : ComposeStyleProvider<AutocompleteStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<AutocompleteStyle>> =
        mapOf(
            "AutocompleteTight.Xl" to ComposeStyleReference { AutocompleteTight.Xl.style() },
            "AutocompleteTight.L" to ComposeStyleReference { AutocompleteTight.L.style() },
            "AutocompleteTight.M" to ComposeStyleReference { AutocompleteTight.M.style() },
            "AutocompleteTight.S" to ComposeStyleReference { AutocompleteTight.S.style() },
            "AutocompleteTight.Xs" to ComposeStyleReference { AutocompleteTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AutocompleteStyles.Tight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> AutocompleteTightSize.Xl
                "L" -> AutocompleteTightSize.L
                "M" -> AutocompleteTightSize.M
                "S" -> AutocompleteTightSize.S
                "Xs" -> AutocompleteTightSize.Xs
                else -> AutocompleteTightSize.Xl
            },
        ).key
    }
}
