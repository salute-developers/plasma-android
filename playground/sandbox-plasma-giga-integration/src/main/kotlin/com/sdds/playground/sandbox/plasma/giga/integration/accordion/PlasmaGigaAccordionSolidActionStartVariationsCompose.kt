package com.sdds.playground.sandbox.plasma.giga.integration.accordion

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.accordion.AccordionSolidActionStart
import com.sdds.plasma.giga.styles.accordion.H2
import com.sdds.plasma.giga.styles.accordion.H3
import com.sdds.plasma.giga.styles.accordion.H4
import com.sdds.plasma.giga.styles.accordion.H5
import com.sdds.plasma.giga.styles.accordion.L
import com.sdds.plasma.giga.styles.accordion.M
import com.sdds.plasma.giga.styles.accordion.S
import com.sdds.plasma.giga.styles.accordion.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAccordionSolidActionStartVariationsCompose :
    ComposeStyleProvider<String, AccordionStyle>() {
    override val variations: Map<String, @Composable () -> AccordionStyle> =
        mapOf(
            "L" to { AccordionSolidActionStart.L.style() },
            "M" to { AccordionSolidActionStart.M.style() },
            "S" to { AccordionSolidActionStart.S.style() },
            "Xs" to { AccordionSolidActionStart.Xs.style() },
            "H5" to { AccordionSolidActionStart.H5.style() },
            "H4" to { AccordionSolidActionStart.H4.style() },
            "H3" to { AccordionSolidActionStart.H3.style() },
            "H2" to { AccordionSolidActionStart.H2.style() },
        )
}
