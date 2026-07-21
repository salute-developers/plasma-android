// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.accordion.AccordionClearActionEnd
import com.sdds.serv.styles.accordion.AccordionClearActionEndSize
import com.sdds.serv.styles.accordion.AccordionStyles
import com.sdds.serv.styles.accordion.H2
import com.sdds.serv.styles.accordion.H3
import com.sdds.serv.styles.accordion.H4
import com.sdds.serv.styles.accordion.H5
import com.sdds.serv.styles.accordion.L
import com.sdds.serv.styles.accordion.M
import com.sdds.serv.styles.accordion.S
import com.sdds.serv.styles.accordion.Xs
import com.sdds.serv.styles.accordion.resolve

internal object SddsServAccordionClearActionEndVariationsCompose : ComposeStyleProvider<AccordionStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Xs",
                variants = listOf("Xs", "S", "M", "L", "H2", "H3", "H4", "H5"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<AccordionStyle>> =
        mapOf(
            "AccordionClearActionEnd.Xs" to ComposeStyleReference { AccordionClearActionEnd.Xs.style() },
            "AccordionClearActionEnd.S" to ComposeStyleReference { AccordionClearActionEnd.S.style() },
            "AccordionClearActionEnd.M" to ComposeStyleReference { AccordionClearActionEnd.M.style() },
            "AccordionClearActionEnd.L" to ComposeStyleReference { AccordionClearActionEnd.L.style() },
            "AccordionClearActionEnd.H2" to ComposeStyleReference { AccordionClearActionEnd.H2.style() },
            "AccordionClearActionEnd.H3" to ComposeStyleReference { AccordionClearActionEnd.H3.style() },
            "AccordionClearActionEnd.H4" to ComposeStyleReference { AccordionClearActionEnd.H4.style() },
            "AccordionClearActionEnd.H5" to ComposeStyleReference { AccordionClearActionEnd.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AccordionStyles.ClearActionEnd.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AccordionClearActionEndSize.Xs
                "S" -> AccordionClearActionEndSize.S
                "M" -> AccordionClearActionEndSize.M
                "L" -> AccordionClearActionEndSize.L
                "H2" -> AccordionClearActionEndSize.H2
                "H3" -> AccordionClearActionEndSize.H3
                "H4" -> AccordionClearActionEndSize.H4
                "H5" -> AccordionClearActionEndSize.H5
                else -> AccordionClearActionEndSize.Xs
            },
        ).key
    }
}
