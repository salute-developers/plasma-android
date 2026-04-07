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
import com.sdds.sbcom.styles.chip.Default
import com.sdds.sbcom.styles.chip.HasContentStart

internal object SddsSbcomChipVariationsCompose : ComposeStyleProvider<ChipStyle>() {
    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Chip.Default.style() },
            "HasContentStart" to ComposeStyleReference { Chip.HasContentStart.style() },
        )
}
