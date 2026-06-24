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
import com.sdds.plasma.sd.service.styles.accordionitem.AccordionItemClearActionEnd
import com.sdds.plasma.sd.service.styles.accordionitem.AccordionItemClearActionEndSize
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

internal object PlasmaB2cAccordionItemClearActionEndVariationsCompose : ComposeStyleProvider<AccordionItemStyle>() {
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
            "AccordionItemClearActionEnd.Xs" to ComposeStyleReference { AccordionItemClearActionEnd.Xs.style() },
            "AccordionItemClearActionEnd.S" to ComposeStyleReference { AccordionItemClearActionEnd.S.style() },
            "AccordionItemClearActionEnd.M" to ComposeStyleReference { AccordionItemClearActionEnd.M.style() },
            "AccordionItemClearActionEnd.L" to ComposeStyleReference { AccordionItemClearActionEnd.L.style() },
            "AccordionItemClearActionEnd.H2" to ComposeStyleReference { AccordionItemClearActionEnd.H2.style() },
            "AccordionItemClearActionEnd.H3" to ComposeStyleReference { AccordionItemClearActionEnd.H3.style() },
            "AccordionItemClearActionEnd.H4" to ComposeStyleReference { AccordionItemClearActionEnd.H4.style() },
            "AccordionItemClearActionEnd.H5" to ComposeStyleReference { AccordionItemClearActionEnd.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AccordionItemStyles.ClearActionEnd.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AccordionItemClearActionEndSize.Xs
                "S" -> AccordionItemClearActionEndSize.S
                "M" -> AccordionItemClearActionEndSize.M
                "L" -> AccordionItemClearActionEndSize.L
                "H2" -> AccordionItemClearActionEndSize.H2
                "H3" -> AccordionItemClearActionEndSize.H3
                "H4" -> AccordionItemClearActionEndSize.H4
                "H5" -> AccordionItemClearActionEndSize.H5
                else -> AccordionItemClearActionEndSize.Xs
            },
        ).key
    }
}
