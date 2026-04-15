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
import com.sdds.plasma.giga.styles.accordionitem.AccordionItemSolidActionEnd
import com.sdds.plasma.giga.styles.accordionitem.H2
import com.sdds.plasma.giga.styles.accordionitem.H3
import com.sdds.plasma.giga.styles.accordionitem.H4
import com.sdds.plasma.giga.styles.accordionitem.H5
import com.sdds.plasma.giga.styles.accordionitem.L
import com.sdds.plasma.giga.styles.accordionitem.M
import com.sdds.plasma.giga.styles.accordionitem.S
import com.sdds.plasma.giga.styles.accordionitem.Xs

internal object PlasmaGigaAccordionItemSolidActionEndVariationsCompose : ComposeStyleProvider<AccordionItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<AccordionItemStyle>> =
        mapOf(
            "Xs" to ComposeStyleReference { AccordionItemSolidActionEnd.Xs.style() },
            "S" to ComposeStyleReference { AccordionItemSolidActionEnd.S.style() },
            "M" to ComposeStyleReference { AccordionItemSolidActionEnd.M.style() },
            "L" to ComposeStyleReference { AccordionItemSolidActionEnd.L.style() },
            "H2" to ComposeStyleReference { AccordionItemSolidActionEnd.H2.style() },
            "H3" to ComposeStyleReference { AccordionItemSolidActionEnd.H3.style() },
            "H4" to ComposeStyleReference { AccordionItemSolidActionEnd.H4.style() },
            "H5" to ComposeStyleReference { AccordionItemSolidActionEnd.H5.style() },
        )
}
