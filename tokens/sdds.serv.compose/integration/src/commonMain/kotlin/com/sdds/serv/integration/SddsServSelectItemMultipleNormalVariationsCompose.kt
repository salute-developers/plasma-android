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
import com.sdds.serv.styles.selectitem.SelectItemMultipleNormal
import com.sdds.serv.styles.selectitem.SelectItemMultipleNormalSize
import com.sdds.serv.styles.selectitem.SelectItemStyles
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs
import com.sdds.serv.styles.selectitem.resolve

internal object SddsServSelectItemMultipleNormalVariationsCompose : ComposeStyleProvider<SelectItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectItemStyle>> =
        mapOf(
            "SelectItemMultipleNormal.Xl" to ComposeStyleReference { SelectItemMultipleNormal.Xl.style() },
            "SelectItemMultipleNormal.L" to ComposeStyleReference { SelectItemMultipleNormal.L.style() },
            "SelectItemMultipleNormal.M" to ComposeStyleReference { SelectItemMultipleNormal.M.style() },
            "SelectItemMultipleNormal.S" to ComposeStyleReference { SelectItemMultipleNormal.S.style() },
            "SelectItemMultipleNormal.Xs" to ComposeStyleReference { SelectItemMultipleNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectItemStyles.MultipleNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SelectItemMultipleNormalSize.Xl
                "L" -> SelectItemMultipleNormalSize.L
                "M" -> SelectItemMultipleNormalSize.M
                "S" -> SelectItemMultipleNormalSize.S
                "Xs" -> SelectItemMultipleNormalSize.Xs
                else -> SelectItemMultipleNormalSize.Xl
            },
        ).key
    }
}
