package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.accordionitem.AccordionItemSolidActionStart
import com.sdds.stylessalute.styles.accordionitem.H2
import com.sdds.stylessalute.styles.accordionitem.H3
import com.sdds.stylessalute.styles.accordionitem.H4
import com.sdds.stylessalute.styles.accordionitem.H5
import com.sdds.stylessalute.styles.accordionitem.L
import com.sdds.stylessalute.styles.accordionitem.M
import com.sdds.stylessalute.styles.accordionitem.S
import com.sdds.stylessalute.styles.accordionitem.Xs

internal object StylesSaluteAccordionItemSolidActionStartVariationsCompose : ComposeStyleProvider<String, AccordionItemStyle>() {
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
