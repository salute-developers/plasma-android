package com.sdds.playground.sandbox.plasma.stards.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.chipgroup.ChipGroup
import com.sdkit.star.designsystem.styles.chipgroup.Dense
import com.sdkit.star.designsystem.styles.chipgroup.Wide

internal object StarDsChipGroupVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "Wide" to { ChipGroup.Wide.style() },
            "Dense" to { ChipGroup.Dense.style() },
        )
}
