// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.accordion.AccordionSolidActionStart
import com.sdds.plasma.sd.service.styles.accordion.AccordionSolidActionStartSize
import com.sdds.plasma.sd.service.styles.accordion.AccordionStyles
import com.sdds.plasma.sd.service.styles.accordion.H2
import com.sdds.plasma.sd.service.styles.accordion.H3
import com.sdds.plasma.sd.service.styles.accordion.H4
import com.sdds.plasma.sd.service.styles.accordion.H5
import com.sdds.plasma.sd.service.styles.accordion.L
import com.sdds.plasma.sd.service.styles.accordion.M
import com.sdds.plasma.sd.service.styles.accordion.S
import com.sdds.plasma.sd.service.styles.accordion.Xs
import com.sdds.plasma.sd.service.styles.accordion.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cAccordionSolidActionStartVariationsCompose : ComposeStyleProvider<AccordionStyle>() {
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
            "AccordionSolidActionStart.Xs" to ComposeStyleReference { AccordionSolidActionStart.Xs.style() },
            "AccordionSolidActionStart.S" to ComposeStyleReference { AccordionSolidActionStart.S.style() },
            "AccordionSolidActionStart.M" to ComposeStyleReference { AccordionSolidActionStart.M.style() },
            "AccordionSolidActionStart.L" to ComposeStyleReference { AccordionSolidActionStart.L.style() },
            "AccordionSolidActionStart.H2" to ComposeStyleReference { AccordionSolidActionStart.H2.style() },
            "AccordionSolidActionStart.H3" to ComposeStyleReference { AccordionSolidActionStart.H3.style() },
            "AccordionSolidActionStart.H4" to ComposeStyleReference { AccordionSolidActionStart.H4.style() },
            "AccordionSolidActionStart.H5" to ComposeStyleReference { AccordionSolidActionStart.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AccordionStyles.SolidActionStart.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AccordionSolidActionStartSize.Xs
                "S" -> AccordionSolidActionStartSize.S
                "M" -> AccordionSolidActionStartSize.M
                "L" -> AccordionSolidActionStartSize.L
                "H2" -> AccordionSolidActionStartSize.H2
                "H3" -> AccordionSolidActionStartSize.H3
                "H4" -> AccordionSolidActionStartSize.H4
                "H5" -> AccordionSolidActionStartSize.H5
                else -> AccordionSolidActionStartSize.Xs
            },
        ).key
    }
}
