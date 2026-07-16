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
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.selectitem.L
import com.sdds.serv.styles.selectitem.M
import com.sdds.serv.styles.selectitem.S
import com.sdds.serv.styles.selectitem.SelectItemSingleTight
import com.sdds.serv.styles.selectitem.SelectItemSingleTightSize
import com.sdds.serv.styles.selectitem.SelectItemStyles
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs
import com.sdds.serv.styles.selectitem.resolve

internal object SddsServSelectItemSingleTightVariationsCompose : ComposeStyleProvider<SelectItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectItemStyle>> =
        mapOf(
            "SelectItemSingleTight.Xl" to ComposeStyleReference { SelectItemSingleTight.Xl.style() },
            "SelectItemSingleTight.L" to ComposeStyleReference { SelectItemSingleTight.L.style() },
            "SelectItemSingleTight.M" to ComposeStyleReference { SelectItemSingleTight.M.style() },
            "SelectItemSingleTight.S" to ComposeStyleReference { SelectItemSingleTight.S.style() },
            "SelectItemSingleTight.Xs" to ComposeStyleReference { SelectItemSingleTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectItemStyles.SingleTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SelectItemSingleTightSize.Xl
                "L" -> SelectItemSingleTightSize.L
                "M" -> SelectItemSingleTightSize.M
                "S" -> SelectItemSingleTightSize.S
                "Xs" -> SelectItemSingleTightSize.Xs
                else -> SelectItemSingleTightSize.Xl
            },
        ).key
    }
}
