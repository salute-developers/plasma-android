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
import com.sdds.serv.styles.select.SelectSingleNormal
import com.sdds.serv.styles.select.SelectSingleNormalSize
import com.sdds.serv.styles.select.SelectStyles
import com.sdds.serv.styles.select.Xl
import com.sdds.serv.styles.select.Xs
import com.sdds.serv.styles.select.resolve

internal object SddsServSelectSingleNormalVariationsCompose : ComposeStyleProvider<SelectStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectStyle>> =
        mapOf(
            "SelectSingleNormal.Xl" to ComposeStyleReference { SelectSingleNormal.Xl.style() },
            "SelectSingleNormal.L" to ComposeStyleReference { SelectSingleNormal.L.style() },
            "SelectSingleNormal.M" to ComposeStyleReference { SelectSingleNormal.M.style() },
            "SelectSingleNormal.S" to ComposeStyleReference { SelectSingleNormal.S.style() },
            "SelectSingleNormal.Xs" to ComposeStyleReference { SelectSingleNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectStyles.SingleNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SelectSingleNormalSize.Xl
                "L" -> SelectSingleNormalSize.L
                "M" -> SelectSingleNormalSize.M
                "S" -> SelectSingleNormalSize.S
                "Xs" -> SelectSingleNormalSize.Xs
                else -> SelectSingleNormalSize.Xl
            },
        ).key
    }
}
