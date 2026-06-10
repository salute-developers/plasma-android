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
import com.sdds.serv.styles.select.SelectSingleTight
import com.sdds.serv.styles.select.SelectSingleTightSize
import com.sdds.serv.styles.select.SelectStyles
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs
import com.sdds.serv.styles.select.resolve

internal object SddsServSelectSingleTightVariationsCompose : ComposeStyleProvider<SelectStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectStyle>> =
        mapOf(
            "SelectSingleTight.Xl" to ComposeStyleReference { SelectSingleTight.Xl.style() },
            "SelectSingleTight.L" to ComposeStyleReference { SelectSingleTight.L.style() },
            "SelectSingleTight.M" to ComposeStyleReference { SelectSingleTight.M.style() },
            "SelectSingleTight.S" to ComposeStyleReference { SelectSingleTight.S.style() },
            "SelectSingleTight.Xs" to ComposeStyleReference { SelectSingleTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectStyles.SingleTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SelectSingleTightSize.Xl
                "L" -> SelectSingleTightSize.L
                "M" -> SelectSingleTightSize.M
                "S" -> SelectSingleTightSize.S
                "Xs" -> SelectSingleTightSize.Xs
                else -> SelectSingleTightSize.Xl
            },
        ).key
    }
}
