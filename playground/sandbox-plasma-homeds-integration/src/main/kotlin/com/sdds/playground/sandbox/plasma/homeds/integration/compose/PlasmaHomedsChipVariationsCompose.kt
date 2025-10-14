package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chip.Chip
import com.sdds.plasma.homeds.styles.chip.Default
import com.sdds.plasma.homeds.styles.chip.L
import com.sdds.plasma.homeds.styles.chip.M
import com.sdds.plasma.homeds.styles.chip.Pilled
import com.sdds.plasma.homeds.styles.chip.S
import com.sdds.plasma.homeds.styles.chip.Secondary
import com.sdds.plasma.homeds.styles.chip.Xs
import com.sdds.plasma.homeds.styles.chip.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {
    override val variations: Map<String, @Composable () -> ChipStyle> =
        mapOf(
            "L.Default" to { Chip.L.Default.style() },
            "L.Secondary" to { Chip.L.Secondary.style() },
            "L.Pilled.Default" to { Chip.L.Pilled.Default.style() },
            "L.Pilled.Secondary" to { Chip.L.Pilled.Secondary.style() },
            "M.Default" to { Chip.M.Default.style() },
            "M.Secondary" to { Chip.M.Secondary.style() },
            "M.Pilled.Default" to { Chip.M.Pilled.Default.style() },
            "M.Pilled.Secondary" to { Chip.M.Pilled.Secondary.style() },
            "S.Default" to { Chip.S.Default.style() },
            "S.Secondary" to { Chip.S.Secondary.style() },
            "S.Pilled.Default" to { Chip.S.Pilled.Default.style() },
            "S.Pilled.Secondary" to { Chip.S.Pilled.Secondary.style() },
            "Xs.Default" to { Chip.Xs.Default.style() },
            "Xs.Secondary" to { Chip.Xs.Secondary.style() },
            "Xs.Pilled.Default" to { Chip.Xs.Pilled.Default.style() },
            "Xs.Pilled.Secondary" to { Chip.Xs.Pilled.Secondary.style() },
            "Xxs.Default" to { Chip.Xxs.Default.style() },
            "Xxs.Secondary" to { Chip.Xxs.Secondary.style() },
            "Xxs.Pilled.Default" to { Chip.Xxs.Pilled.Default.style() },
            "Xxs.Pilled.Secondary" to { Chip.Xxs.Pilled.Secondary.style() },
        )
}
