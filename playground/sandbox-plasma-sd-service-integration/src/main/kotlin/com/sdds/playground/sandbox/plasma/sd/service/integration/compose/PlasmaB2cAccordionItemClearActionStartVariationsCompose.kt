package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
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
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cAccordionItemClearActionStartVariationsCompose : ComposeStyleProvider<String, AccordionItemStyle>() {
    override val variations: Map<String, @Composable () -> AccordionItemStyle> =
        mapOf(
            "Xs" to { AccordionItemClearActionStart.Xs.style() },
            "S" to { AccordionItemClearActionStart.S.style() },
            "M" to { AccordionItemClearActionStart.M.style() },
            "L" to { AccordionItemClearActionStart.L.style() },
            "H2" to { AccordionItemClearActionStart.H2.style() },
            "H3" to { AccordionItemClearActionStart.H3.style() },
            "H4" to { AccordionItemClearActionStart.H4.style() },
            "H5" to { AccordionItemClearActionStart.H5.style() },
        )
}
