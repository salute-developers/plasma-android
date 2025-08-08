package com.sdds.playground.sandbox.plasma.homeds.integration.chip

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

internal object PlasmaHomeDsChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {

    override val variations: Map<String, @Composable () -> ChipStyle> =
        mapOf(
            "LDefault" to { Chip.L.Default.style() },
            "MDefault" to { Chip.M.Default.style() },
            "SDefault" to { Chip.S.Default.style() },
            "XsDefault" to { Chip.Xs.Default.style() },
            "XxsDefault" to { Chip.Xxs.Default.style() },

            "LDefaultPilled" to { Chip.L.Pilled.Default.style() },
            "MDefaultPilled" to { Chip.M.Pilled.Default.style() },
            "SDefaultPilled" to { Chip.S.Pilled.Default.style() },
            "XsDefaultPilled" to { Chip.Xs.Pilled.Default.style() },
            "XxsDefaultPilled" to { Chip.Xxs.Pilled.Default.style() },

            "LSecondary" to { Chip.L.Secondary.style() },
            "MSecondary" to { Chip.M.Secondary.style() },
            "SSecondary" to { Chip.S.Secondary.style() },
            "XsSecondary" to { Chip.Xs.Secondary.style() },
            "XxsSecondary" to { Chip.Xxs.Secondary.style() },

            "LSecondaryPilled" to { Chip.L.Pilled.Secondary.style() },
            "MSecondaryPilled" to { Chip.M.Pilled.Secondary.style() },
            "SSecondaryPilled" to { Chip.S.Pilled.Secondary.style() },
            "XsSecondaryPilled" to { Chip.Xs.Pilled.Secondary.style() },
            "XxsSecondaryPilled" to { Chip.Xxs.Pilled.Secondary.style() },
        )
}
