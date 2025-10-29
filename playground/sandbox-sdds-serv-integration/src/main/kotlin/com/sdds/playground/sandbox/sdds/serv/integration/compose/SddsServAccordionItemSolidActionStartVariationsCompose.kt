package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.accordionitem.AccordionItemSolidActionStart
import com.sdds.serv.styles.accordionitem.H2
import com.sdds.serv.styles.accordionitem.H3
import com.sdds.serv.styles.accordionitem.H4
import com.sdds.serv.styles.accordionitem.H5
import com.sdds.serv.styles.accordionitem.L
import com.sdds.serv.styles.accordionitem.M
import com.sdds.serv.styles.accordionitem.S
import com.sdds.serv.styles.accordionitem.Xs

internal object SddsServAccordionItemSolidActionStartVariationsCompose : ComposeStyleProvider<String, AccordionItemStyle>() {
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
