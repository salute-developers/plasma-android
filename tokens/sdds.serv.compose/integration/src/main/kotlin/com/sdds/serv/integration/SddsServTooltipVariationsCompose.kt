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
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.tooltip.M
import com.sdds.serv.styles.tooltip.S
import com.sdds.serv.styles.tooltip.Tooltip
import com.sdds.serv.styles.tooltip.TooltipSize
import com.sdds.serv.styles.tooltip.TooltipStyles
import com.sdds.serv.styles.tooltip.resolve

internal object SddsServTooltipVariationsCompose : ComposeStyleProvider<TooltipStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<TooltipStyle>> =
        mapOf(
            "Tooltip.M" to ComposeStyleReference { Tooltip.M.style() },
            "Tooltip.S" to ComposeStyleReference { Tooltip.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TooltipStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> TooltipSize.M
                "S" -> TooltipSize.S
                else -> TooltipSize.M
            },
        ).key
    }
}
