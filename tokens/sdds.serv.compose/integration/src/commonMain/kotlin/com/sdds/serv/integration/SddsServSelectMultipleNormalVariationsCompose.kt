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
import com.sdds.serv.styles.select.SelectMultipleNormal
import com.sdds.serv.styles.select.SelectMultipleNormalSize
import com.sdds.serv.styles.select.SelectStyles
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs
import com.sdds.serv.styles.select.resolve

internal object SddsServSelectMultipleNormalVariationsCompose : ComposeStyleProvider<SelectStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectStyle>> =
        mapOf(
            "SelectMultipleNormal.Xl" to ComposeStyleReference { SelectMultipleNormal.Xl.style() },
            "SelectMultipleNormal.L" to ComposeStyleReference { SelectMultipleNormal.L.style() },
            "SelectMultipleNormal.M" to ComposeStyleReference { SelectMultipleNormal.M.style() },
            "SelectMultipleNormal.S" to ComposeStyleReference { SelectMultipleNormal.S.style() },
            "SelectMultipleNormal.Xs" to ComposeStyleReference { SelectMultipleNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectStyles.MultipleNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SelectMultipleNormalSize.Xl
                "L" -> SelectMultipleNormalSize.L
                "M" -> SelectMultipleNormalSize.M
                "S" -> SelectMultipleNormalSize.S
                "Xs" -> SelectMultipleNormalSize.Xs
                else -> SelectMultipleNormalSize.Xl
            },
        ).key
    }
}
