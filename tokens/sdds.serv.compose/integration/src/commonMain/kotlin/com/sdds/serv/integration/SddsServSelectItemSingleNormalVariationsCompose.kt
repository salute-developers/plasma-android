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
import com.sdds.serv.styles.selectitem.SelectItemSingleNormal
import com.sdds.serv.styles.selectitem.SelectItemSingleNormalSize
import com.sdds.serv.styles.selectitem.SelectItemStyles
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs
import com.sdds.serv.styles.selectitem.resolve

internal object SddsServSelectItemSingleNormalVariationsCompose : ComposeStyleProvider<SelectItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectItemStyle>> =
        mapOf(
            "SelectItemSingleNormal.Xl" to ComposeStyleReference { SelectItemSingleNormal.Xl.style() },
            "SelectItemSingleNormal.L" to ComposeStyleReference { SelectItemSingleNormal.L.style() },
            "SelectItemSingleNormal.M" to ComposeStyleReference { SelectItemSingleNormal.M.style() },
            "SelectItemSingleNormal.S" to ComposeStyleReference { SelectItemSingleNormal.S.style() },
            "SelectItemSingleNormal.Xs" to ComposeStyleReference { SelectItemSingleNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectItemStyles.SingleNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SelectItemSingleNormalSize.Xl
                "L" -> SelectItemSingleNormalSize.L
                "M" -> SelectItemSingleNormalSize.M
                "S" -> SelectItemSingleNormalSize.S
                "Xs" -> SelectItemSingleNormalSize.Xs
                else -> SelectItemSingleNormalSize.Xl
            },
        ).key
    }
}
