package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.chip.Chip
import com.sdds.sbcom.styles.chip.Default
import com.sdds.sbcom.styles.chip.HasContentStart

internal object SddsSbcomChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {
    override val variations: Map<String, @Composable () -> ChipStyle> =
        mapOf(
            "Default" to { Chip.Default.style() },
            "HasContentStart" to { Chip.HasContentStart.style() },
        )
}
