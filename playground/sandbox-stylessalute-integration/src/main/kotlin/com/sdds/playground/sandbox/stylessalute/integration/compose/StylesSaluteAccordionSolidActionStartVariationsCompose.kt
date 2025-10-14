package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.accordion.AccordionSolidActionStart
import com.sdds.stylessalute.styles.accordion.H2
import com.sdds.stylessalute.styles.accordion.H3
import com.sdds.stylessalute.styles.accordion.H4
import com.sdds.stylessalute.styles.accordion.H5
import com.sdds.stylessalute.styles.accordion.L
import com.sdds.stylessalute.styles.accordion.M
import com.sdds.stylessalute.styles.accordion.S
import com.sdds.stylessalute.styles.accordion.Xs

internal object StylesSaluteAccordionSolidActionStartVariationsCompose : ComposeStyleProvider<String, AccordionStyle>() {
    override val variations: Map<String, @Composable () -> AccordionStyle> =
        mapOf(
            "Xs" to { AccordionSolidActionStart.Xs.style() },
            "S" to { AccordionSolidActionStart.S.style() },
            "M" to { AccordionSolidActionStart.M.style() },
            "L" to { AccordionSolidActionStart.L.style() },
            "H2" to { AccordionSolidActionStart.H2.style() },
            "H3" to { AccordionSolidActionStart.H3.style() },
            "H4" to { AccordionSolidActionStart.H4.style() },
            "H5" to { AccordionSolidActionStart.H5.style() },
        )
}
