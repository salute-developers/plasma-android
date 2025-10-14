package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.accordionitem.AccordionItemSolidActionEnd
import com.sdds.plasma.sd.service.styles.accordionitem.H2
import com.sdds.plasma.sd.service.styles.accordionitem.H3
import com.sdds.plasma.sd.service.styles.accordionitem.H4
import com.sdds.plasma.sd.service.styles.accordionitem.H5
import com.sdds.plasma.sd.service.styles.accordionitem.L
import com.sdds.plasma.sd.service.styles.accordionitem.M
import com.sdds.plasma.sd.service.styles.accordionitem.S
import com.sdds.plasma.sd.service.styles.accordionitem.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cAccordionItemSolidActionEndVariationsCompose : ComposeStyleProvider<String, AccordionItemStyle>() {
    override val variations: Map<String, @Composable () -> AccordionItemStyle> =
        mapOf(
            "Xs" to { AccordionItemSolidActionEnd.Xs.style() },
            "S" to { AccordionItemSolidActionEnd.S.style() },
            "M" to { AccordionItemSolidActionEnd.M.style() },
            "L" to { AccordionItemSolidActionEnd.L.style() },
            "H2" to { AccordionItemSolidActionEnd.H2.style() },
            "H3" to { AccordionItemSolidActionEnd.H3.style() },
            "H4" to { AccordionItemSolidActionEnd.H4.style() },
            "H5" to { AccordionItemSolidActionEnd.H5.style() },
        )
}
