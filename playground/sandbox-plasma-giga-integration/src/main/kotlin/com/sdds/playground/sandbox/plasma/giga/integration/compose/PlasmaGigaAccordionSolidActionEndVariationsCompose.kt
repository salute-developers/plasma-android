package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.accordion.AccordionSolidActionEnd
import com.sdds.plasma.giga.styles.accordion.H2
import com.sdds.plasma.giga.styles.accordion.H3
import com.sdds.plasma.giga.styles.accordion.H4
import com.sdds.plasma.giga.styles.accordion.H5
import com.sdds.plasma.giga.styles.accordion.L
import com.sdds.plasma.giga.styles.accordion.M
import com.sdds.plasma.giga.styles.accordion.S
import com.sdds.plasma.giga.styles.accordion.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAccordionSolidActionEndVariationsCompose : ComposeStyleProvider<String, AccordionStyle>() {
    override val variations: Map<String, @Composable () -> AccordionStyle> =
        mapOf(
            "Xs" to { AccordionSolidActionEnd.Xs.style() },
            "S" to { AccordionSolidActionEnd.S.style() },
            "M" to { AccordionSolidActionEnd.M.style() },
            "L" to { AccordionSolidActionEnd.L.style() },
            "H2" to { AccordionSolidActionEnd.H2.style() },
            "H3" to { AccordionSolidActionEnd.H3.style() },
            "H4" to { AccordionSolidActionEnd.H4.style() },
            "H5" to { AccordionSolidActionEnd.H5.style() },
        )
}
