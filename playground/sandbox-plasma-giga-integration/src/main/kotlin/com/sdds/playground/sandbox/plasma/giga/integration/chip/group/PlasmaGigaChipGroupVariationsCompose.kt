package com.sdds.playground.sandbox.plasma.giga.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.plasma.giga.styles.chipgroup.ChipGroup
import com.sdds.plasma.giga.styles.chipgroup.Dense
import com.sdds.plasma.giga.styles.chipgroup.Wide
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaChipGroupVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "Wide" to { ChipGroup.Wide.style() },
            "Dense" to { ChipGroup.Dense.style() },
        )
}
