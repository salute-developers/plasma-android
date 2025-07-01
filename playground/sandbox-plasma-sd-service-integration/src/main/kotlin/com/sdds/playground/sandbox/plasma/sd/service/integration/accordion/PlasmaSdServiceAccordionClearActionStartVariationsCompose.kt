package com.sdds.playground.sandbox.plasma.sd.service.integration.accordion

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.accordion.AccordionClearActionStart
import com.sdds.plasma.sd.service.styles.accordion.H2
import com.sdds.plasma.sd.service.styles.accordion.H3
import com.sdds.plasma.sd.service.styles.accordion.H4
import com.sdds.plasma.sd.service.styles.accordion.H5
import com.sdds.plasma.sd.service.styles.accordion.L
import com.sdds.plasma.sd.service.styles.accordion.M
import com.sdds.plasma.sd.service.styles.accordion.S
import com.sdds.plasma.sd.service.styles.accordion.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceAccordionClearActionStartVariationsCompose :
    ComposeStyleProvider<String, AccordionStyle>() {
    override val variations: Map<String, @Composable () -> AccordionStyle> =
        mapOf(
            "L" to { AccordionClearActionStart.L.style() },
            "M" to { AccordionClearActionStart.M.style() },
            "S" to { AccordionClearActionStart.S.style() },
            "Xs" to { AccordionClearActionStart.Xs.style() },
            "H5" to { AccordionClearActionStart.H5.style() },
            "H4" to { AccordionClearActionStart.H4.style() },
            "H3" to { AccordionClearActionStart.H3.style() },
            "H2" to { AccordionClearActionStart.H2.style() },
        )
}
