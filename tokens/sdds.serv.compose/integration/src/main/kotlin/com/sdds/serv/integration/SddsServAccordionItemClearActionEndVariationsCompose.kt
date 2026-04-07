// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.accordionitem.AccordionItemClearActionEnd
import com.sdds.serv.styles.accordionitem.H2
import com.sdds.serv.styles.accordionitem.H3
import com.sdds.serv.styles.accordionitem.H4
import com.sdds.serv.styles.accordionitem.H5
import com.sdds.serv.styles.accordionitem.L
import com.sdds.serv.styles.accordionitem.M
import com.sdds.serv.styles.accordionitem.S
import com.sdds.serv.styles.accordionitem.Xs

internal object SddsServAccordionItemClearActionEndVariationsCompose : ComposeStyleProvider<AccordionItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<AccordionItemStyle>> =
        mapOf(
            "Xs" to ComposeStyleReference { AccordionItemClearActionEnd.Xs.style() },
            "S" to ComposeStyleReference { AccordionItemClearActionEnd.S.style() },
            "M" to ComposeStyleReference { AccordionItemClearActionEnd.M.style() },
            "L" to ComposeStyleReference { AccordionItemClearActionEnd.L.style() },
            "H2" to ComposeStyleReference { AccordionItemClearActionEnd.H2.style() },
            "H3" to ComposeStyleReference { AccordionItemClearActionEnd.H3.style() },
            "H4" to ComposeStyleReference { AccordionItemClearActionEnd.H4.style() },
            "H5" to ComposeStyleReference { AccordionItemClearActionEnd.H5.style() },
        )
}
