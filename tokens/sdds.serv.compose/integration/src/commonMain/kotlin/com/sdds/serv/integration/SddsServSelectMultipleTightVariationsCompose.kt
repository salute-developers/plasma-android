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
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.select.L
import com.sdds.serv.styles.select.M
import com.sdds.serv.styles.select.S
import com.sdds.serv.styles.select.SelectMultipleTight
import com.sdds.serv.styles.select.SelectMultipleTightSize
import com.sdds.serv.styles.select.SelectStyles
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs
import com.sdds.serv.styles.select.resolve

internal object SddsServSelectMultipleTightVariationsCompose : ComposeStyleProvider<SelectStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectStyle>> =
        mapOf(
            "SelectMultipleTight.Xl" to ComposeStyleReference { SelectMultipleTight.Xl.style() },
            "SelectMultipleTight.L" to ComposeStyleReference { SelectMultipleTight.L.style() },
            "SelectMultipleTight.M" to ComposeStyleReference { SelectMultipleTight.M.style() },
            "SelectMultipleTight.S" to ComposeStyleReference { SelectMultipleTight.S.style() },
            "SelectMultipleTight.Xs" to ComposeStyleReference { SelectMultipleTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectStyles.MultipleTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SelectMultipleTightSize.Xl
                "L" -> SelectMultipleTightSize.L
                "M" -> SelectMultipleTightSize.M
                "S" -> SelectMultipleTightSize.S
                "Xs" -> SelectMultipleTightSize.Xs
                else -> SelectMultipleTightSize.Xl
            },
        ).key
    }
}
