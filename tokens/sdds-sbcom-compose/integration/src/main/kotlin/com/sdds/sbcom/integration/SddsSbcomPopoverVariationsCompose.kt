// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.popover.Accent
import com.sdds.sbcom.styles.popover.Default
import com.sdds.sbcom.styles.popover.M
import com.sdds.sbcom.styles.popover.Popover
import com.sdds.sbcom.styles.popover.S

internal object SddsSbcomPopoverVariationsCompose : ComposeStyleProvider<PopoverStyle>() {
    override val variations: Map<String, ComposeStyleReference<PopoverStyle>> =
        mapOf(
            "M.Default" to ComposeStyleReference { Popover.M.Default.style() },
            "M.Accent" to ComposeStyleReference { Popover.M.Accent.style() },
            "S.Default" to ComposeStyleReference { Popover.S.Default.style() },
            "S.Accent" to ComposeStyleReference { Popover.S.Accent.style() },
        )
}
