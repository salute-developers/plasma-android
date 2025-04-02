package com.sdds.playground.sandbox.plasma.giga.app.integration.chip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.plasma.giga.app.styles.chip.Accent
import com.sdds.plasma.giga.app.styles.chip.Chip
import com.sdds.plasma.giga.app.styles.chip.Default
import com.sdds.plasma.giga.app.styles.chip.L
import com.sdds.plasma.giga.app.styles.chip.M
import com.sdds.plasma.giga.app.styles.chip.Pilled
import com.sdds.plasma.giga.app.styles.chip.S
import com.sdds.plasma.giga.app.styles.chip.Secondary
import com.sdds.plasma.giga.app.styles.chip.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {

    override val variations: Map<String, @Composable () -> ChipStyle> =
        mapOf(
            "LDefault" to { Chip.L.Default.style() },
            "MDefault" to { Chip.M.Default.style() },
            "SDefault" to { Chip.S.Default.style() },
            "XsDefault" to { Chip.Xs.Default.style() },

            "LDefaultPilled" to { Chip.L.Default.Pilled.style() },
            "MDefaultPilled" to { Chip.M.Default.Pilled.style() },
            "SDefaultPilled" to { Chip.S.Default.Pilled.style() },
            "XsDefaultPilled" to { Chip.Xs.Default.Pilled.style() },

            "LSecondary" to { Chip.L.Secondary.style() },
            "MSecondary" to { Chip.M.Secondary.style() },
            "SSecondary" to { Chip.S.Secondary.style() },
            "XsSecondary" to { Chip.Xs.Secondary.style() },

            "LSecondaryPilled" to { Chip.L.Secondary.Pilled.style() },
            "MSecondaryPilled" to { Chip.M.Secondary.Pilled.style() },
            "SSecondaryPilled" to { Chip.S.Secondary.Pilled.style() },
            "XsSecondaryPilled" to { Chip.Xs.Secondary.Pilled.style() },

            "LAccent" to { Chip.L.Accent.style() },
            "MAccent" to { Chip.M.Accent.style() },
            "SAccent" to { Chip.S.Accent.style() },
            "XsAccent" to { Chip.Xs.Accent.style() },

            "LAccentPilled" to { Chip.L.Accent.Pilled.style() },
            "MAccentPilled" to { Chip.M.Accent.Pilled.style() },
            "SAccentPilled" to { Chip.S.Accent.Pilled.style() },
            "XsAccentPilled" to { Chip.Xs.Accent.Pilled.style() },
        )
}
