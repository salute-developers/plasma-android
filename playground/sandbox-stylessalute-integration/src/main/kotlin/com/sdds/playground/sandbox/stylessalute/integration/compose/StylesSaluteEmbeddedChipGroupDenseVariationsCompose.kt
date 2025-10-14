package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chipgroup.Accent
import com.sdds.stylessalute.styles.chipgroup.Default
import com.sdds.stylessalute.styles.chipgroup.EmbeddedChipGroupDense
import com.sdds.stylessalute.styles.chipgroup.L
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.chipgroup.S
import com.sdds.stylessalute.styles.chipgroup.Secondary
import com.sdds.stylessalute.styles.chipgroup.Xs

internal object StylesSaluteEmbeddedChipGroupDenseVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { EmbeddedChipGroupDense.L.Default.style() },
            "L.Accent" to { EmbeddedChipGroupDense.L.Accent.style() },
            "L.Secondary" to { EmbeddedChipGroupDense.L.Secondary.style() },
            "M.Default" to { EmbeddedChipGroupDense.M.Default.style() },
            "M.Accent" to { EmbeddedChipGroupDense.M.Accent.style() },
            "M.Secondary" to { EmbeddedChipGroupDense.M.Secondary.style() },
            "S.Default" to { EmbeddedChipGroupDense.S.Default.style() },
            "S.Accent" to { EmbeddedChipGroupDense.S.Accent.style() },
            "S.Secondary" to { EmbeddedChipGroupDense.S.Secondary.style() },
            "Xs.Default" to { EmbeddedChipGroupDense.Xs.Default.style() },
            "Xs.Accent" to { EmbeddedChipGroupDense.Xs.Accent.style() },
            "Xs.Secondary" to { EmbeddedChipGroupDense.Xs.Secondary.style() },
        )
}
