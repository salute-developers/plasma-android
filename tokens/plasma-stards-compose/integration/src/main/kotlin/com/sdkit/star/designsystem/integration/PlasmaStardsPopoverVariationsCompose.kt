// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.popover.Accent
import com.sdkit.star.designsystem.styles.popover.Default
import com.sdkit.star.designsystem.styles.popover.M
import com.sdkit.star.designsystem.styles.popover.Popover
import com.sdkit.star.designsystem.styles.popover.S

internal object PlasmaStardsPopoverVariationsCompose : ComposeStyleProvider<PopoverStyle>() {
    override val variations: Map<String, ComposeStyleReference<PopoverStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { Popover.M.Default.style() },
            "M.Accent" to ComposeStyleReference { Popover.M.Accent.style() },
            "S.Default" to ComposeStyleReference { Popover.S.Default.style() },
            "S.Accent" to ComposeStyleReference { Popover.S.Accent.style() },
        )
}
