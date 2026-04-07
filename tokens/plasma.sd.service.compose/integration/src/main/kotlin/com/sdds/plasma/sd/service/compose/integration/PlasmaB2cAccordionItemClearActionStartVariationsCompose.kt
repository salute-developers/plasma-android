// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.accordionitem.AccordionItemClearActionStart
import com.sdds.plasma.sd.service.styles.accordionitem.H2
import com.sdds.plasma.sd.service.styles.accordionitem.H3
import com.sdds.plasma.sd.service.styles.accordionitem.H4
import com.sdds.plasma.sd.service.styles.accordionitem.H5
import com.sdds.plasma.sd.service.styles.accordionitem.L
import com.sdds.plasma.sd.service.styles.accordionitem.M
import com.sdds.plasma.sd.service.styles.accordionitem.S
import com.sdds.plasma.sd.service.styles.accordionitem.Xs

internal object PlasmaB2cAccordionItemClearActionStartVariationsCompose : ComposeStyleProvider<AccordionItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<AccordionItemStyle>> =
        mapOf(
            "Xs" to ComposeStyleReference { AccordionItemClearActionStart.Xs.style() },
            "S" to ComposeStyleReference { AccordionItemClearActionStart.S.style() },
            "M" to ComposeStyleReference { AccordionItemClearActionStart.M.style() },
            "L" to ComposeStyleReference { AccordionItemClearActionStart.L.style() },
            "H2" to ComposeStyleReference { AccordionItemClearActionStart.H2.style() },
            "H3" to ComposeStyleReference { AccordionItemClearActionStart.H3.style() },
            "H4" to ComposeStyleReference { AccordionItemClearActionStart.H4.style() },
            "H5" to ComposeStyleReference { AccordionItemClearActionStart.H5.style() },
        )
}
