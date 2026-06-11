// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.accordionitem.AccordionItemClearActionEnd
import com.sdds.plasma.giga.styles.accordionitem.AccordionItemClearActionEndSize
import com.sdds.plasma.giga.styles.accordionitem.AccordionItemStyles
import com.sdds.plasma.giga.styles.accordionitem.H2
import com.sdds.plasma.giga.styles.accordionitem.H3
import com.sdds.plasma.giga.styles.accordionitem.H4
import com.sdds.plasma.giga.styles.accordionitem.H5
import com.sdds.plasma.giga.styles.accordionitem.L
import com.sdds.plasma.giga.styles.accordionitem.M
import com.sdds.plasma.giga.styles.accordionitem.S
import com.sdds.plasma.giga.styles.accordionitem.Xs
import com.sdds.plasma.giga.styles.accordionitem.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaAccordionItemClearActionEndVariationsCompose : ComposeStyleProvider<AccordionItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "L",
                variants = listOf("L", "M", "S", "Xs", "H2", "H3", "H4", "H5"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<AccordionItemStyle>> =
        mapOf(
            "AccordionItemClearActionEnd.Xs" to ComposeStyleReference { AccordionItemClearActionEnd.Xs.style() },
            "AccordionItemClearActionEnd.S" to ComposeStyleReference { AccordionItemClearActionEnd.S.style() },
            "AccordionItemClearActionEnd.M" to ComposeStyleReference { AccordionItemClearActionEnd.M.style() },
            "AccordionItemClearActionEnd.L" to ComposeStyleReference { AccordionItemClearActionEnd.L.style() },
            "AccordionItemClearActionEnd.H2" to ComposeStyleReference { AccordionItemClearActionEnd.H2.style() },
            "AccordionItemClearActionEnd.H3" to ComposeStyleReference { AccordionItemClearActionEnd.H3.style() },
            "AccordionItemClearActionEnd.H4" to ComposeStyleReference { AccordionItemClearActionEnd.H4.style() },
            "AccordionItemClearActionEnd.H5" to ComposeStyleReference { AccordionItemClearActionEnd.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AccordionItemStyles.ClearActionEnd.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> AccordionItemClearActionEndSize.L
                "M" -> AccordionItemClearActionEndSize.M
                "S" -> AccordionItemClearActionEndSize.S
                "Xs" -> AccordionItemClearActionEndSize.Xs
                "H2" -> AccordionItemClearActionEndSize.H2
                "H3" -> AccordionItemClearActionEndSize.H3
                "H4" -> AccordionItemClearActionEndSize.H4
                "H5" -> AccordionItemClearActionEndSize.H5
                else -> AccordionItemClearActionEndSize.L
            },
        ).key
    }
}
