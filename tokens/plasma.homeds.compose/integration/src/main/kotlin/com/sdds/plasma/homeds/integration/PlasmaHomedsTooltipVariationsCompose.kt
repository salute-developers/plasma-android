// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.tooltip.M
import com.sdds.plasma.homeds.styles.tooltip.S
import com.sdds.plasma.homeds.styles.tooltip.Tooltip

internal object PlasmaHomedsTooltipVariationsCompose : ComposeStyleProvider<TooltipStyle>() {
    override val variations: Map<String, ComposeStyleReference<TooltipStyle>> =
        mapOf(
            "M" to ComposeStyleReference { Tooltip.M.style() },
            "S" to ComposeStyleReference { Tooltip.S.style() },
        )
}
