// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.popover.Accent
import com.sdds.serv.styles.popover.Default
import com.sdds.serv.styles.popover.M
import com.sdds.serv.styles.popover.Popover
import com.sdds.serv.styles.popover.S

internal object SddsServPopoverVariationsCompose : ComposeStyleProvider<PopoverStyle>() {
    override val variations: Map<String, ComposeStyleReference<PopoverStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { Popover.M.Default.style() },
            "M.Accent" to ComposeStyleReference { Popover.M.Accent.style() },
            "S.Default" to ComposeStyleReference { Popover.S.Default.style() },
            "S.Accent" to ComposeStyleReference { Popover.S.Accent.style() },
        )
}
