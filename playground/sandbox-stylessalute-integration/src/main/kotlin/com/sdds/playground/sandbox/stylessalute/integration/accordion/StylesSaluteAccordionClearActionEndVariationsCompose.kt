package com.sdds.playground.sandbox.stylessalute.integration.accordion

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.accordion.AccordionClearActionEnd
import com.sdds.stylessalute.styles.accordion.H2
import com.sdds.stylessalute.styles.accordion.H3
import com.sdds.stylessalute.styles.accordion.H4
import com.sdds.stylessalute.styles.accordion.H5
import com.sdds.stylessalute.styles.accordion.L
import com.sdds.stylessalute.styles.accordion.M
import com.sdds.stylessalute.styles.accordion.S
import com.sdds.stylessalute.styles.accordion.Xs

internal object StylesSaluteAccordionClearActionEndVariationsCompose :
    ComposeStyleProvider<String, AccordionStyle>() {
    override val variations: Map<String, @Composable () -> AccordionStyle> =
        mapOf(
            "L" to { AccordionClearActionEnd.L.style() },
            "M" to { AccordionClearActionEnd.M.style() },
            "S" to { AccordionClearActionEnd.S.style() },
            "Xs" to { AccordionClearActionEnd.Xs.style() },
            "H5" to { AccordionClearActionEnd.H5.style() },
            "H4" to { AccordionClearActionEnd.H4.style() },
            "H3" to { AccordionClearActionEnd.H3.style() },
            "H2" to { AccordionClearActionEnd.H2.style() },
        )
}
