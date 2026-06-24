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
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.accordionitem.AccordionItemSolidActionEnd
import com.sdds.plasma.sd.service.styles.accordionitem.AccordionItemSolidActionEndSize
import com.sdds.plasma.sd.service.styles.accordionitem.AccordionItemStyles
import com.sdds.plasma.sd.service.styles.accordionitem.H2
import com.sdds.plasma.sd.service.styles.accordionitem.H3
import com.sdds.plasma.sd.service.styles.accordionitem.H4
import com.sdds.plasma.sd.service.styles.accordionitem.H5
import com.sdds.plasma.sd.service.styles.accordionitem.L
import com.sdds.plasma.sd.service.styles.accordionitem.M
import com.sdds.plasma.sd.service.styles.accordionitem.S
import com.sdds.plasma.sd.service.styles.accordionitem.Xs
import com.sdds.plasma.sd.service.styles.accordionitem.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cAccordionItemSolidActionEndVariationsCompose : ComposeStyleProvider<AccordionItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Xs",
                variants = listOf("Xs", "S", "M", "L", "H2", "H3", "H4", "H5"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<AccordionItemStyle>> =
        mapOf(
            "AccordionItemSolidActionEnd.Xs" to ComposeStyleReference { AccordionItemSolidActionEnd.Xs.style() },
            "AccordionItemSolidActionEnd.S" to ComposeStyleReference { AccordionItemSolidActionEnd.S.style() },
            "AccordionItemSolidActionEnd.M" to ComposeStyleReference { AccordionItemSolidActionEnd.M.style() },
            "AccordionItemSolidActionEnd.L" to ComposeStyleReference { AccordionItemSolidActionEnd.L.style() },
            "AccordionItemSolidActionEnd.H2" to ComposeStyleReference { AccordionItemSolidActionEnd.H2.style() },
            "AccordionItemSolidActionEnd.H3" to ComposeStyleReference { AccordionItemSolidActionEnd.H3.style() },
            "AccordionItemSolidActionEnd.H4" to ComposeStyleReference { AccordionItemSolidActionEnd.H4.style() },
            "AccordionItemSolidActionEnd.H5" to ComposeStyleReference { AccordionItemSolidActionEnd.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AccordionItemStyles.SolidActionEnd.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AccordionItemSolidActionEndSize.Xs
                "S" -> AccordionItemSolidActionEndSize.S
                "M" -> AccordionItemSolidActionEndSize.M
                "L" -> AccordionItemSolidActionEndSize.L
                "H2" -> AccordionItemSolidActionEndSize.H2
                "H3" -> AccordionItemSolidActionEndSize.H3
                "H4" -> AccordionItemSolidActionEndSize.H4
                "H5" -> AccordionItemSolidActionEndSize.H5
                else -> AccordionItemSolidActionEndSize.Xs
            },
        ).key
    }
}
