package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.chip.Accent
import com.sdds.plasma.giga.styles.chip.Chip
import com.sdds.plasma.giga.styles.chip.Default
import com.sdds.plasma.giga.styles.chip.L
import com.sdds.plasma.giga.styles.chip.M
import com.sdds.plasma.giga.styles.chip.Negative
import com.sdds.plasma.giga.styles.chip.Pilled
import com.sdds.plasma.giga.styles.chip.Positive
import com.sdds.plasma.giga.styles.chip.S
import com.sdds.plasma.giga.styles.chip.Secondary
import com.sdds.plasma.giga.styles.chip.Warning
import com.sdds.plasma.giga.styles.chip.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {
    override val variations: Map<String, @Composable () -> ChipStyle> =
        mapOf(
            "L.Default" to { Chip.L.Default.style() },
            "L.Accent" to { Chip.L.Accent.style() },
            "L.Negative" to { Chip.L.Negative.style() },
            "L.Positive" to { Chip.L.Positive.style() },
            "L.Secondary" to { Chip.L.Secondary.style() },
            "L.Warning" to { Chip.L.Warning.style() },
            "L.Pilled.Default" to { Chip.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { Chip.L.Pilled.Accent.style() },
            "L.Pilled.Negative" to { Chip.L.Pilled.Negative.style() },
            "L.Pilled.Positive" to { Chip.L.Pilled.Positive.style() },
            "L.Pilled.Secondary" to { Chip.L.Pilled.Secondary.style() },
            "L.Pilled.Warning" to { Chip.L.Pilled.Warning.style() },
            "M.Default" to { Chip.M.Default.style() },
            "M.Accent" to { Chip.M.Accent.style() },
            "M.Negative" to { Chip.M.Negative.style() },
            "M.Positive" to { Chip.M.Positive.style() },
            "M.Secondary" to { Chip.M.Secondary.style() },
            "M.Warning" to { Chip.M.Warning.style() },
            "M.Pilled.Default" to { Chip.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { Chip.M.Pilled.Accent.style() },
            "M.Pilled.Negative" to { Chip.M.Pilled.Negative.style() },
            "M.Pilled.Positive" to { Chip.M.Pilled.Positive.style() },
            "M.Pilled.Secondary" to { Chip.M.Pilled.Secondary.style() },
            "M.Pilled.Warning" to { Chip.M.Pilled.Warning.style() },
            "S.Default" to { Chip.S.Default.style() },
            "S.Accent" to { Chip.S.Accent.style() },
            "S.Negative" to { Chip.S.Negative.style() },
            "S.Positive" to { Chip.S.Positive.style() },
            "S.Secondary" to { Chip.S.Secondary.style() },
            "S.Warning" to { Chip.S.Warning.style() },
            "S.Pilled.Default" to { Chip.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { Chip.S.Pilled.Accent.style() },
            "S.Pilled.Negative" to { Chip.S.Pilled.Negative.style() },
            "S.Pilled.Positive" to { Chip.S.Pilled.Positive.style() },
            "S.Pilled.Secondary" to { Chip.S.Pilled.Secondary.style() },
            "S.Pilled.Warning" to { Chip.S.Pilled.Warning.style() },
            "Xs.Default" to { Chip.Xs.Default.style() },
            "Xs.Accent" to { Chip.Xs.Accent.style() },
            "Xs.Negative" to { Chip.Xs.Negative.style() },
            "Xs.Positive" to { Chip.Xs.Positive.style() },
            "Xs.Secondary" to { Chip.Xs.Secondary.style() },
            "Xs.Warning" to { Chip.Xs.Warning.style() },
            "Xs.Pilled.Default" to { Chip.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { Chip.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Negative" to { Chip.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Positive" to { Chip.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Secondary" to { Chip.Xs.Pilled.Secondary.style() },
            "Xs.Pilled.Warning" to { Chip.Xs.Pilled.Warning.style() },
        )
}
