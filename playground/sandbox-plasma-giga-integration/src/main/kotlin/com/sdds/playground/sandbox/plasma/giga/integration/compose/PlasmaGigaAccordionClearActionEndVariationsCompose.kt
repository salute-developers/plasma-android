package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.accordion.AccordionClearActionEnd
import com.sdds.plasma.giga.styles.accordion.H2
import com.sdds.plasma.giga.styles.accordion.H3
import com.sdds.plasma.giga.styles.accordion.H4
import com.sdds.plasma.giga.styles.accordion.H5
import com.sdds.plasma.giga.styles.accordion.L
import com.sdds.plasma.giga.styles.accordion.M
import com.sdds.plasma.giga.styles.accordion.S
import com.sdds.plasma.giga.styles.accordion.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAccordionClearActionEndVariationsCompose : ComposeStyleProvider<String, AccordionStyle>() {
    override val variations: Map<String, @Composable () -> AccordionStyle> =
        mapOf(
            "Xs" to { AccordionClearActionEnd.Xs.style() },
            "S" to { AccordionClearActionEnd.S.style() },
            "M" to { AccordionClearActionEnd.M.style() },
            "L" to { AccordionClearActionEnd.L.style() },
            "H2" to { AccordionClearActionEnd.H2.style() },
            "H3" to { AccordionClearActionEnd.H3.style() },
            "H4" to { AccordionClearActionEnd.H4.style() },
            "H5" to { AccordionClearActionEnd.H5.style() },
        )
}
