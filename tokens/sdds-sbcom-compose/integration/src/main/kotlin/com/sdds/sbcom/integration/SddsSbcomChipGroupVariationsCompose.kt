// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.chipgroup.ChipGroup
import com.sdds.sbcom.styles.chipgroup.ChipSlotAvatar
import com.sdds.sbcom.styles.chipgroup.ChipSlotPadding

internal object SddsSbcomChipGroupVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "ChipSlotPadding" to ComposeStyleReference { ChipGroup.ChipSlotPadding.style() },
            "ChipSlotAvatar" to ComposeStyleReference { ChipGroup.ChipSlotAvatar.style() },
        )
}
