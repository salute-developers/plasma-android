package com.sdds.playground.sandbox.stylessalute.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chip.group.ChipGroup
import com.sdds.stylessalute.styles.chip.group.Dense
import com.sdds.stylessalute.styles.chip.group.Wide

internal object StylesSaluteChipGroupVariationsCompose :
    ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> = mapOf(
        "Wide" to { ChipGroup.Wide.style() },
        "Dense" to { ChipGroup.Dense.style() },
    )
}
