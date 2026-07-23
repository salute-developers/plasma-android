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
import com.sdds.serv.styles.selectitem.SelectItemMultipleTight
import com.sdds.serv.styles.selectitem.SelectItemMultipleTightSize
import com.sdds.serv.styles.selectitem.SelectItemStyles
import com.sdds.serv.styles.selectitem.Xl
import com.sdds.serv.styles.selectitem.Xs
import com.sdds.serv.styles.selectitem.resolve

internal object SddsServSelectItemMultipleTightVariationsCompose : ComposeStyleProvider<SelectItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectItemStyle>> =
        mapOf(
            "SelectItemMultipleTight.Xl" to ComposeStyleReference { SelectItemMultipleTight.Xl.style() },
            "SelectItemMultipleTight.L" to ComposeStyleReference { SelectItemMultipleTight.L.style() },
            "SelectItemMultipleTight.M" to ComposeStyleReference { SelectItemMultipleTight.M.style() },
            "SelectItemMultipleTight.S" to ComposeStyleReference { SelectItemMultipleTight.S.style() },
            "SelectItemMultipleTight.Xs" to ComposeStyleReference { SelectItemMultipleTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectItemStyles.MultipleTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SelectItemMultipleTightSize.Xl
                "L" -> SelectItemMultipleTightSize.L
                "M" -> SelectItemMultipleTightSize.M
                "S" -> SelectItemMultipleTightSize.S
                "Xs" -> SelectItemMultipleTightSize.Xs
                else -> SelectItemMultipleTightSize.Xl
            },
        ).key
    }
}
