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
import com.sdds.plasma.giga.styles.accordionitem.AccordionItemSolidActionStart
import com.sdds.plasma.giga.styles.accordionitem.AccordionItemSolidActionStartSize
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

internal object PlasmaGigaAccordionItemSolidActionStartVariationsCompose : ComposeStyleProvider<AccordionItemStyle>() {
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
            "AccordionItemSolidActionStart.Xs" to ComposeStyleReference { AccordionItemSolidActionStart.Xs.style() },
            "AccordionItemSolidActionStart.S" to ComposeStyleReference { AccordionItemSolidActionStart.S.style() },
            "AccordionItemSolidActionStart.M" to ComposeStyleReference { AccordionItemSolidActionStart.M.style() },
            "AccordionItemSolidActionStart.L" to ComposeStyleReference { AccordionItemSolidActionStart.L.style() },
            "AccordionItemSolidActionStart.H2" to ComposeStyleReference { AccordionItemSolidActionStart.H2.style() },
            "AccordionItemSolidActionStart.H3" to ComposeStyleReference { AccordionItemSolidActionStart.H3.style() },
            "AccordionItemSolidActionStart.H4" to ComposeStyleReference { AccordionItemSolidActionStart.H4.style() },
            "AccordionItemSolidActionStart.H5" to ComposeStyleReference { AccordionItemSolidActionStart.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AccordionItemStyles.SolidActionStart.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> AccordionItemSolidActionStartSize.L
                "M" -> AccordionItemSolidActionStartSize.M
                "S" -> AccordionItemSolidActionStartSize.S
                "Xs" -> AccordionItemSolidActionStartSize.Xs
                "H2" -> AccordionItemSolidActionStartSize.H2
                "H3" -> AccordionItemSolidActionStartSize.H3
                "H4" -> AccordionItemSolidActionStartSize.H4
                "H5" -> AccordionItemSolidActionStartSize.H5
                else -> AccordionItemSolidActionStartSize.L
            },
        ).key
    }
}
