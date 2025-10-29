package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.chip.Accent
import com.sdds.plasma.giga.app.styles.chip.Default
import com.sdds.plasma.giga.app.styles.chip.EmbeddedChip
import com.sdds.plasma.giga.app.styles.chip.L
import com.sdds.plasma.giga.app.styles.chip.M
import com.sdds.plasma.giga.app.styles.chip.Negative
import com.sdds.plasma.giga.app.styles.chip.Positive
import com.sdds.plasma.giga.app.styles.chip.S
import com.sdds.plasma.giga.app.styles.chip.Secondary
import com.sdds.plasma.giga.app.styles.chip.Warning
import com.sdds.plasma.giga.app.styles.chip.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppEmbeddedChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {
    override val variations: Map<String, @Composable () -> ChipStyle> =
        mapOf(
            "L.Default" to { EmbeddedChip.L.Default.style() },
            "L.Accent" to { EmbeddedChip.L.Accent.style() },
            "L.Negative" to { EmbeddedChip.L.Negative.style() },
            "L.Positive" to { EmbeddedChip.L.Positive.style() },
            "L.Secondary" to { EmbeddedChip.L.Secondary.style() },
            "L.Warning" to { EmbeddedChip.L.Warning.style() },
            "M.Default" to { EmbeddedChip.M.Default.style() },
            "M.Accent" to { EmbeddedChip.M.Accent.style() },
            "M.Negative" to { EmbeddedChip.M.Negative.style() },
            "M.Positive" to { EmbeddedChip.M.Positive.style() },
            "M.Secondary" to { EmbeddedChip.M.Secondary.style() },
            "M.Warning" to { EmbeddedChip.M.Warning.style() },
            "S.Default" to { EmbeddedChip.S.Default.style() },
            "S.Accent" to { EmbeddedChip.S.Accent.style() },
            "S.Negative" to { EmbeddedChip.S.Negative.style() },
            "S.Positive" to { EmbeddedChip.S.Positive.style() },
            "S.Secondary" to { EmbeddedChip.S.Secondary.style() },
            "S.Warning" to { EmbeddedChip.S.Warning.style() },
            "Xs.Default" to { EmbeddedChip.Xs.Default.style() },
            "Xs.Accent" to { EmbeddedChip.Xs.Accent.style() },
            "Xs.Negative" to { EmbeddedChip.Xs.Negative.style() },
            "Xs.Positive" to { EmbeddedChip.Xs.Positive.style() },
            "Xs.Secondary" to { EmbeddedChip.Xs.Secondary.style() },
            "Xs.Warning" to { EmbeddedChip.Xs.Warning.style() },
        )
}
