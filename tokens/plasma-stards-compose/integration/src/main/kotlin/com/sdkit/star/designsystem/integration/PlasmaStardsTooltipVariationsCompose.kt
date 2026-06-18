// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.tooltip.M
import com.sdkit.star.designsystem.styles.tooltip.S
import com.sdkit.star.designsystem.styles.tooltip.Tooltip
import com.sdkit.star.designsystem.styles.tooltip.TooltipSize
import com.sdkit.star.designsystem.styles.tooltip.TooltipStyles
import com.sdkit.star.designsystem.styles.tooltip.resolve

internal object PlasmaStardsTooltipVariationsCompose : ComposeStyleProvider<TooltipStyle>() {
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
