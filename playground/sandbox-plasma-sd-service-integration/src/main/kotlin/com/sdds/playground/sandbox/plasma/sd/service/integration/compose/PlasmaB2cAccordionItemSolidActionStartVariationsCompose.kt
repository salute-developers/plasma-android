package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.accordionitem.AccordionItemSolidActionStart
import com.sdds.plasma.sd.service.styles.accordionitem.H2
import com.sdds.plasma.sd.service.styles.accordionitem.H3
import com.sdds.plasma.sd.service.styles.accordionitem.H4
import com.sdds.plasma.sd.service.styles.accordionitem.H5
import com.sdds.plasma.sd.service.styles.accordionitem.L
import com.sdds.plasma.sd.service.styles.accordionitem.M
import com.sdds.plasma.sd.service.styles.accordionitem.S
import com.sdds.plasma.sd.service.styles.accordionitem.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cAccordionItemSolidActionStartVariationsCompose : ComposeStyleProvider<String, AccordionItemStyle>() {
    override val variations: Map<String, @Composable () -> AccordionItemStyle> =
        mapOf(
            "Xs" to { AccordionItemSolidActionStart.Xs.style() },
            "S" to { AccordionItemSolidActionStart.S.style() },
            "M" to { AccordionItemSolidActionStart.M.style() },
            "L" to { AccordionItemSolidActionStart.L.style() },
            "H2" to { AccordionItemSolidActionStart.H2.style() },
            "H3" to { AccordionItemSolidActionStart.H3.style() },
            "H4" to { AccordionItemSolidActionStart.H4.style() },
            "H5" to { AccordionItemSolidActionStart.H5.style() },
        )
}
