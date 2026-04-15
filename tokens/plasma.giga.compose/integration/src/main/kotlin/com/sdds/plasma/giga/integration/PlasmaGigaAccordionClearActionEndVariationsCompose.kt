// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
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

internal object PlasmaGigaAccordionClearActionEndVariationsCompose : ComposeStyleProvider<AccordionStyle>() {
    override val variations: Map<String, ComposeStyleReference<AccordionStyle>> =
        mapOf(
            "Xs" to ComposeStyleReference { AccordionClearActionEnd.Xs.style() },
            "S" to ComposeStyleReference { AccordionClearActionEnd.S.style() },
            "M" to ComposeStyleReference { AccordionClearActionEnd.M.style() },
            "L" to ComposeStyleReference { AccordionClearActionEnd.L.style() },
            "H2" to ComposeStyleReference { AccordionClearActionEnd.H2.style() },
            "H3" to ComposeStyleReference { AccordionClearActionEnd.H3.style() },
            "H4" to ComposeStyleReference { AccordionClearActionEnd.H4.style() },
            "H5" to ComposeStyleReference { AccordionClearActionEnd.H5.style() },
        )
}
