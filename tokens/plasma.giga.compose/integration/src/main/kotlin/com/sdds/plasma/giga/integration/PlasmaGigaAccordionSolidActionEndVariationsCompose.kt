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
import com.sdds.plasma.giga.styles.accordion.AccordionSolidActionEnd
import com.sdds.plasma.giga.styles.accordion.AccordionSolidActionEndSize
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

internal object PlasmaGigaAccordionSolidActionEndVariationsCompose : ComposeStyleProvider<AccordionStyle>() {
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
            "AccordionSolidActionEnd.Xs" to ComposeStyleReference { AccordionSolidActionEnd.Xs.style() },
            "AccordionSolidActionEnd.S" to ComposeStyleReference { AccordionSolidActionEnd.S.style() },
            "AccordionSolidActionEnd.M" to ComposeStyleReference { AccordionSolidActionEnd.M.style() },
            "AccordionSolidActionEnd.L" to ComposeStyleReference { AccordionSolidActionEnd.L.style() },
            "AccordionSolidActionEnd.H2" to ComposeStyleReference { AccordionSolidActionEnd.H2.style() },
            "AccordionSolidActionEnd.H3" to ComposeStyleReference { AccordionSolidActionEnd.H3.style() },
            "AccordionSolidActionEnd.H4" to ComposeStyleReference { AccordionSolidActionEnd.H4.style() },
            "AccordionSolidActionEnd.H5" to ComposeStyleReference { AccordionSolidActionEnd.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AccordionStyles.SolidActionEnd.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> AccordionSolidActionEndSize.L
                "M" -> AccordionSolidActionEndSize.M
                "S" -> AccordionSolidActionEndSize.S
                "Xs" -> AccordionSolidActionEndSize.Xs
                "H2" -> AccordionSolidActionEndSize.H2
                "H3" -> AccordionSolidActionEndSize.H3
                "H4" -> AccordionSolidActionEndSize.H4
                "H5" -> AccordionSolidActionEndSize.H5
                else -> AccordionSolidActionEndSize.L
            },
        ).key
    }
}
