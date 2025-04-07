package com.sdds.playground.sandbox.plasma.giga.app.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.plasma.giga.app.styles.chipgroup.ChipGroup
import com.sdds.plasma.giga.app.styles.chipgroup.Dense
import com.sdds.plasma.giga.app.styles.chipgroup.Wide
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppChipGroupVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "Wide" to { ChipGroup.Wide.style() },
            "Dense" to { ChipGroup.Dense.style() },
        )
}
