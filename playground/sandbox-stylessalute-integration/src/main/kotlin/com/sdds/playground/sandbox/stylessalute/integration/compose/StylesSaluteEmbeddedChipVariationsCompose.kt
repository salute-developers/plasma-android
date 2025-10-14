package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chip.Accent
import com.sdds.stylessalute.styles.chip.Default
import com.sdds.stylessalute.styles.chip.EmbeddedChip
import com.sdds.stylessalute.styles.chip.L
import com.sdds.stylessalute.styles.chip.M
import com.sdds.stylessalute.styles.chip.S
import com.sdds.stylessalute.styles.chip.Secondary
import com.sdds.stylessalute.styles.chip.Xs

internal object StylesSaluteEmbeddedChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {
    override val variations: Map<String, @Composable () -> ChipStyle> =
        mapOf(
            "L.Default" to { EmbeddedChip.L.Default.style() },
            "L.Accent" to { EmbeddedChip.L.Accent.style() },
            "L.Secondary" to { EmbeddedChip.L.Secondary.style() },
            "M.Default" to { EmbeddedChip.M.Default.style() },
            "M.Accent" to { EmbeddedChip.M.Accent.style() },
            "M.Secondary" to { EmbeddedChip.M.Secondary.style() },
            "S.Default" to { EmbeddedChip.S.Default.style() },
            "S.Accent" to { EmbeddedChip.S.Accent.style() },
            "S.Secondary" to { EmbeddedChip.S.Secondary.style() },
            "Xs.Default" to { EmbeddedChip.Xs.Default.style() },
            "Xs.Accent" to { EmbeddedChip.Xs.Accent.style() },
            "Xs.Secondary" to { EmbeddedChip.Xs.Secondary.style() },
        )
}
