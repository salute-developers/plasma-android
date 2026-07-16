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
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.accordionitem.AccordionItemClearActionStart
import com.sdds.serv.styles.accordionitem.AccordionItemClearActionStartSize
import com.sdds.serv.styles.accordionitem.AccordionItemStyles
import com.sdds.serv.styles.accordionitem.H2
import com.sdds.serv.styles.accordionitem.H3
import com.sdds.serv.styles.accordionitem.H4
import com.sdds.serv.styles.accordionitem.H5
import com.sdds.serv.styles.accordionitem.L
import com.sdds.serv.styles.accordionitem.M
import com.sdds.serv.styles.accordionitem.S
import com.sdds.serv.styles.accordionitem.Xs
import com.sdds.serv.styles.accordionitem.resolve

internal object SddsServAccordionItemClearActionStartVariationsCompose : ComposeStyleProvider<AccordionItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Xs",
                variants = listOf("Xs", "S", "M", "L", "H2", "H3", "H4", "H5"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<AccordionItemStyle>> =
        mapOf(
            "AccordionItemClearActionStart.Xs" to ComposeStyleReference { AccordionItemClearActionStart.Xs.style() },
            "AccordionItemClearActionStart.S" to ComposeStyleReference { AccordionItemClearActionStart.S.style() },
            "AccordionItemClearActionStart.M" to ComposeStyleReference { AccordionItemClearActionStart.M.style() },
            "AccordionItemClearActionStart.L" to ComposeStyleReference { AccordionItemClearActionStart.L.style() },
            "AccordionItemClearActionStart.H2" to ComposeStyleReference { AccordionItemClearActionStart.H2.style() },
            "AccordionItemClearActionStart.H3" to ComposeStyleReference { AccordionItemClearActionStart.H3.style() },
            "AccordionItemClearActionStart.H4" to ComposeStyleReference { AccordionItemClearActionStart.H4.style() },
            "AccordionItemClearActionStart.H5" to ComposeStyleReference { AccordionItemClearActionStart.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AccordionItemStyles.ClearActionStart.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AccordionItemClearActionStartSize.Xs
                "S" -> AccordionItemClearActionStartSize.S
                "M" -> AccordionItemClearActionStartSize.M
                "L" -> AccordionItemClearActionStartSize.L
                "H2" -> AccordionItemClearActionStartSize.H2
                "H3" -> AccordionItemClearActionStartSize.H3
                "H4" -> AccordionItemClearActionStartSize.H4
                "H5" -> AccordionItemClearActionStartSize.H5
                else -> AccordionItemClearActionStartSize.Xs
            },
        ).key
    }
}
