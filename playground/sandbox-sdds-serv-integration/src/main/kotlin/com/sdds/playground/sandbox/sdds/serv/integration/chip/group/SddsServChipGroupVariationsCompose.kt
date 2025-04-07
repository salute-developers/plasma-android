package com.sdds.playground.sandbox.sdds.serv.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.chipgroup.ChipGroup
import com.sdds.serv.styles.chipgroup.Dense
import com.sdds.serv.styles.chipgroup.Wide

internal object SddsServChipGroupVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "Wide" to { ChipGroup.Wide.style() },
            "Dense" to { ChipGroup.Dense.style() },
        )
}
