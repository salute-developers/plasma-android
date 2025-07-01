package com.sdds.playground.sandbox.stylessalute.integration.accordion

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.accordion.AccordionSolidActionEnd
import com.sdds.stylessalute.styles.accordion.H2
import com.sdds.stylessalute.styles.accordion.H3
import com.sdds.stylessalute.styles.accordion.H4
import com.sdds.stylessalute.styles.accordion.H5
import com.sdds.stylessalute.styles.accordion.L
import com.sdds.stylessalute.styles.accordion.M
import com.sdds.stylessalute.styles.accordion.S
import com.sdds.stylessalute.styles.accordion.Xs

internal object StylesSaluteAccordionSolidActionEndVariationsCompose :
    ComposeStyleProvider<String, AccordionStyle>() {
    override val variations: Map<String, @Composable () -> AccordionStyle> =
        mapOf(
            "L" to { AccordionSolidActionEnd.L.style() },
            "M" to { AccordionSolidActionEnd.M.style() },
            "S" to { AccordionSolidActionEnd.S.style() },
            "Xs" to { AccordionSolidActionEnd.Xs.style() },
            "H5" to { AccordionSolidActionEnd.H5.style() },
            "H4" to { AccordionSolidActionEnd.H4.style() },
            "H3" to { AccordionSolidActionEnd.H3.style() },
            "H2" to { AccordionSolidActionEnd.H2.style() },
        )
}
