// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.chip.Chip
import com.sdds.sbcom.styles.chip.ChipSlotAvatar
import com.sdds.sbcom.styles.chip.ChipSlotPadding

internal object SddsSbcomChipVariationsCompose : ComposeStyleProvider<ChipStyle>() {
    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "ChipSlotPadding" to ComposeStyleReference { Chip.ChipSlotPadding.style() },
            "ChipSlotAvatar" to ComposeStyleReference { Chip.ChipSlotAvatar.style() },
        )
}
