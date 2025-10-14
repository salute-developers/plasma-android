package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chip.Accent
import com.sdds.stylessalute.styles.chip.Chip
import com.sdds.stylessalute.styles.chip.Default
import com.sdds.stylessalute.styles.chip.L
import com.sdds.stylessalute.styles.chip.M
import com.sdds.stylessalute.styles.chip.Pilled
import com.sdds.stylessalute.styles.chip.S
import com.sdds.stylessalute.styles.chip.Secondary
import com.sdds.stylessalute.styles.chip.Xs

internal object StylesSaluteChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {
    override val variations: Map<String, @Composable () -> ChipStyle> =
        mapOf(
            "L.Default" to { Chip.L.Default.style() },
            "L.Accent" to { Chip.L.Accent.style() },
            "L.Secondary" to { Chip.L.Secondary.style() },
            "L.Pilled.Default" to { Chip.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { Chip.L.Pilled.Accent.style() },
            "L.Pilled.Secondary" to { Chip.L.Pilled.Secondary.style() },
            "M.Default" to { Chip.M.Default.style() },
            "M.Accent" to { Chip.M.Accent.style() },
            "M.Secondary" to { Chip.M.Secondary.style() },
            "M.Pilled.Default" to { Chip.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { Chip.M.Pilled.Accent.style() },
            "M.Pilled.Secondary" to { Chip.M.Pilled.Secondary.style() },
            "S.Default" to { Chip.S.Default.style() },
            "S.Accent" to { Chip.S.Accent.style() },
            "S.Secondary" to { Chip.S.Secondary.style() },
            "S.Pilled.Default" to { Chip.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { Chip.S.Pilled.Accent.style() },
            "S.Pilled.Secondary" to { Chip.S.Pilled.Secondary.style() },
            "Xs.Default" to { Chip.Xs.Default.style() },
            "Xs.Accent" to { Chip.Xs.Accent.style() },
            "Xs.Secondary" to { Chip.Xs.Secondary.style() },
            "Xs.Pilled.Default" to { Chip.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { Chip.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Secondary" to { Chip.Xs.Pilled.Secondary.style() },
        )
}
