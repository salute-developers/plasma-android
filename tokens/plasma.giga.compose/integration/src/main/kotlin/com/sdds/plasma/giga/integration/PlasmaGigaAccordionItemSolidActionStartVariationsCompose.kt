// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.accordionitem.AccordionItemSolidActionStart
import com.sdds.plasma.giga.styles.accordionitem.H2
import com.sdds.plasma.giga.styles.accordionitem.H3
import com.sdds.plasma.giga.styles.accordionitem.H4
import com.sdds.plasma.giga.styles.accordionitem.H5
import com.sdds.plasma.giga.styles.accordionitem.L
import com.sdds.plasma.giga.styles.accordionitem.M
import com.sdds.plasma.giga.styles.accordionitem.S
import com.sdds.plasma.giga.styles.accordionitem.Xs

internal object PlasmaGigaAccordionItemSolidActionStartVariationsCompose : ComposeStyleProvider<AccordionItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<AccordionItemStyle>> =
        mapOf(
            "Xs" to ComposeStyleReference { AccordionItemSolidActionStart.Xs.style() },
            "S" to ComposeStyleReference { AccordionItemSolidActionStart.S.style() },
            "M" to ComposeStyleReference { AccordionItemSolidActionStart.M.style() },
            "L" to ComposeStyleReference { AccordionItemSolidActionStart.L.style() },
            "H2" to ComposeStyleReference { AccordionItemSolidActionStart.H2.style() },
            "H3" to ComposeStyleReference { AccordionItemSolidActionStart.H3.style() },
            "H4" to ComposeStyleReference { AccordionItemSolidActionStart.H4.style() },
            "H5" to ComposeStyleReference { AccordionItemSolidActionStart.H5.style() },
        )
}
