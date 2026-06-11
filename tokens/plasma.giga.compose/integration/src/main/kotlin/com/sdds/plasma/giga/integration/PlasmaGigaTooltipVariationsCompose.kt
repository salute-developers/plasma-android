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
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.tooltip.M
import com.sdds.plasma.giga.styles.tooltip.S
import com.sdds.plasma.giga.styles.tooltip.Tooltip
import com.sdds.plasma.giga.styles.tooltip.TooltipSize
import com.sdds.plasma.giga.styles.tooltip.TooltipStyles
import com.sdds.plasma.giga.styles.tooltip.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTooltipVariationsCompose : ComposeStyleProvider<TooltipStyle>() {
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
