// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.accordion.AccordionSolidActionStart
import com.sdds.serv.styles.accordion.H2
import com.sdds.serv.styles.accordion.H3
import com.sdds.serv.styles.accordion.H4
import com.sdds.serv.styles.accordion.H5
import com.sdds.serv.styles.accordion.L
import com.sdds.serv.styles.accordion.M
import com.sdds.serv.styles.accordion.S
import com.sdds.serv.styles.accordion.Xs

internal object SddsServAccordionSolidActionStartVariationsCompose : ComposeStyleProvider<AccordionStyle>() {
    override val variations: Map<String, ComposeStyleReference<AccordionStyle>> =
        mapOf(
            "Xs" to ComposeStyleReference { AccordionSolidActionStart.Xs.style() },
            "S" to ComposeStyleReference { AccordionSolidActionStart.S.style() },
            "M" to ComposeStyleReference { AccordionSolidActionStart.M.style() },
            "L" to ComposeStyleReference { AccordionSolidActionStart.L.style() },
            "H2" to ComposeStyleReference { AccordionSolidActionStart.H2.style() },
            "H3" to ComposeStyleReference { AccordionSolidActionStart.H3.style() },
            "H4" to ComposeStyleReference { AccordionSolidActionStart.H4.style() },
            "H5" to ComposeStyleReference { AccordionSolidActionStart.H5.style() },
        )
}
