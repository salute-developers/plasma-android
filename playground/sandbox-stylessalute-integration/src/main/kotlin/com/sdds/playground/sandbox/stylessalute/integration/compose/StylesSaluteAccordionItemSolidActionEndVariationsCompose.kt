package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.accordionitem.AccordionItemSolidActionEnd
import com.sdds.stylessalute.styles.accordionitem.H2
import com.sdds.stylessalute.styles.accordionitem.H3
import com.sdds.stylessalute.styles.accordionitem.H4
import com.sdds.stylessalute.styles.accordionitem.H5
import com.sdds.stylessalute.styles.accordionitem.L
import com.sdds.stylessalute.styles.accordionitem.M
import com.sdds.stylessalute.styles.accordionitem.S
import com.sdds.stylessalute.styles.accordionitem.Xs

internal object StylesSaluteAccordionItemSolidActionEndVariationsCompose : ComposeStyleProvider<String, AccordionItemStyle>() {
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
