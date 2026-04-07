// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.popover.Accent
import com.sdds.plasma.sd.service.styles.popover.Default
import com.sdds.plasma.sd.service.styles.popover.M
import com.sdds.plasma.sd.service.styles.popover.Popover
import com.sdds.plasma.sd.service.styles.popover.S

internal object PlasmaB2cPopoverVariationsCompose : ComposeStyleProvider<PopoverStyle>() {
    override val variations: Map<String, ComposeStyleReference<PopoverStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { Popover.M.Default.style() },
            "M.Accent" to ComposeStyleReference { Popover.M.Accent.style() },
            "S.Default" to ComposeStyleReference { Popover.S.Default.style() },
            "S.Accent" to ComposeStyleReference { Popover.S.Accent.style() },
        )
}
