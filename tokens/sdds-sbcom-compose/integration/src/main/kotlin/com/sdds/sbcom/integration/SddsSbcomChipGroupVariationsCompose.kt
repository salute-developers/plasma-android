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
import com.sdds.sbcom.styles.chipgroup.Default
import com.sdds.sbcom.styles.chipgroup.HasContentStart

internal object SddsSbcomChipGroupVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { ChipGroup.Default.style() },
            "HasContentStart" to ComposeStyleReference { ChipGroup.HasContentStart.style() },
        )
}
