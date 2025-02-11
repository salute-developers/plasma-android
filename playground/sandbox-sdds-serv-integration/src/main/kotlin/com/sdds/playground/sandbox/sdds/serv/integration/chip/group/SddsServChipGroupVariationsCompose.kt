package com.sdds.playground.sandbox.sdds.serv.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.chip.group.Dense
import com.sdds.serv.styles.chip.group.Wide

internal object SddsServChipGroupVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle>
        get() = mapOf(
            "Wide" to { ChipGroup.Wide.style() },
            "Dense" to { ChipGroup.Dense.style() },
        )
}
