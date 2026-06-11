// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.accordion.AccordionClearActionStart
import com.sdds.plasma.giga.styles.accordion.AccordionClearActionStartSize
import com.sdds.plasma.giga.styles.accordion.AccordionStyles
import com.sdds.plasma.giga.styles.accordion.H2
import com.sdds.plasma.giga.styles.accordion.H3
import com.sdds.plasma.giga.styles.accordion.H4
import com.sdds.plasma.giga.styles.accordion.H5
import com.sdds.plasma.giga.styles.accordion.L
import com.sdds.plasma.giga.styles.accordion.M
import com.sdds.plasma.giga.styles.accordion.S
import com.sdds.plasma.giga.styles.accordion.Xs
import com.sdds.plasma.giga.styles.accordion.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaAccordionClearActionStartVariationsCompose : ComposeStyleProvider<AccordionStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "L",
                variants = listOf("L", "M", "S", "Xs", "H2", "H3", "H4", "H5"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<AccordionStyle>> =
        mapOf(
            "AccordionClearActionStart.Xs" to ComposeStyleReference { AccordionClearActionStart.Xs.style() },
            "AccordionClearActionStart.S" to ComposeStyleReference { AccordionClearActionStart.S.style() },
            "AccordionClearActionStart.M" to ComposeStyleReference { AccordionClearActionStart.M.style() },
            "AccordionClearActionStart.L" to ComposeStyleReference { AccordionClearActionStart.L.style() },
            "AccordionClearActionStart.H2" to ComposeStyleReference { AccordionClearActionStart.H2.style() },
            "AccordionClearActionStart.H3" to ComposeStyleReference { AccordionClearActionStart.H3.style() },
            "AccordionClearActionStart.H4" to ComposeStyleReference { AccordionClearActionStart.H4.style() },
            "AccordionClearActionStart.H5" to ComposeStyleReference { AccordionClearActionStart.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AccordionStyles.ClearActionStart.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> AccordionClearActionStartSize.L
                "M" -> AccordionClearActionStartSize.M
                "S" -> AccordionClearActionStartSize.S
                "Xs" -> AccordionClearActionStartSize.Xs
                "H2" -> AccordionClearActionStartSize.H2
                "H3" -> AccordionClearActionStartSize.H3
                "H4" -> AccordionClearActionStartSize.H4
                "H5" -> AccordionClearActionStartSize.H5
                else -> AccordionClearActionStartSize.L
            },
        ).key
    }
}
