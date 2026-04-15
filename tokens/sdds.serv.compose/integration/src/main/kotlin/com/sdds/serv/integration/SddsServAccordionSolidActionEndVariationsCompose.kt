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
import com.sdds.serv.styles.accordion.AccordionSolidActionEnd
import com.sdds.serv.styles.accordion.H2
import com.sdds.serv.styles.accordion.H3
import com.sdds.serv.styles.accordion.H4
import com.sdds.serv.styles.accordion.H5
import com.sdds.serv.styles.accordion.L
import com.sdds.serv.styles.accordion.M
import com.sdds.serv.styles.accordion.S
import com.sdds.serv.styles.accordion.Xs

internal object SddsServAccordionSolidActionEndVariationsCompose : ComposeStyleProvider<AccordionStyle>() {
    override val variations: Map<String, ComposeStyleReference<AccordionStyle>> =
        mapOf(
            "Xs" to ComposeStyleReference { AccordionSolidActionEnd.Xs.style() },
            "S" to ComposeStyleReference { AccordionSolidActionEnd.S.style() },
            "M" to ComposeStyleReference { AccordionSolidActionEnd.M.style() },
            "L" to ComposeStyleReference { AccordionSolidActionEnd.L.style() },
            "H2" to ComposeStyleReference { AccordionSolidActionEnd.H2.style() },
            "H3" to ComposeStyleReference { AccordionSolidActionEnd.H3.style() },
            "H4" to ComposeStyleReference { AccordionSolidActionEnd.H4.style() },
            "H5" to ComposeStyleReference { AccordionSolidActionEnd.H5.style() },
        )
}
