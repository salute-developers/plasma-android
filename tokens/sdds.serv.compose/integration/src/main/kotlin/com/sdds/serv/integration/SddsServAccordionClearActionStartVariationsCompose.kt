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
import com.sdds.serv.styles.accordion.AccordionClearActionStart
import com.sdds.serv.styles.accordion.H2
import com.sdds.serv.styles.accordion.H3
import com.sdds.serv.styles.accordion.H4
import com.sdds.serv.styles.accordion.H5
import com.sdds.serv.styles.accordion.L
import com.sdds.serv.styles.accordion.M
import com.sdds.serv.styles.accordion.S
import com.sdds.serv.styles.accordion.Xs

internal object SddsServAccordionClearActionStartVariationsCompose : ComposeStyleProvider<AccordionStyle>() {
    override val variations: Map<String, ComposeStyleReference<AccordionStyle>> =
        mapOf(
            "Xs" to ComposeStyleReference { AccordionClearActionStart.Xs.style() },
            "S" to ComposeStyleReference { AccordionClearActionStart.S.style() },
            "M" to ComposeStyleReference { AccordionClearActionStart.M.style() },
            "L" to ComposeStyleReference { AccordionClearActionStart.L.style() },
            "H2" to ComposeStyleReference { AccordionClearActionStart.H2.style() },
            "H3" to ComposeStyleReference { AccordionClearActionStart.H3.style() },
            "H4" to ComposeStyleReference { AccordionClearActionStart.H4.style() },
            "H5" to ComposeStyleReference { AccordionClearActionStart.H5.style() },
        )
}
