// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.tooltip.Default
import com.sdds.sbcom.styles.tooltip.Tooltip

internal object SddsSbcomTooltipVariationsCompose : ComposeStyleProvider<TooltipStyle>() {
    override val variations: Map<String, ComposeStyleReference<TooltipStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Tooltip.Default.style() },
        )
}
