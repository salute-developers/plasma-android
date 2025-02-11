package com.sdds.playground.sandbox.stylessalute.integration.chip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chip.Accent
import com.sdds.stylessalute.styles.chip.Default
import com.sdds.stylessalute.styles.chip.L
import com.sdds.stylessalute.styles.chip.M
import com.sdds.stylessalute.styles.chip.Pilled
import com.sdds.stylessalute.styles.chip.S
import com.sdds.stylessalute.styles.chip.Secondary
import com.sdds.stylessalute.styles.chip.Xs

internal object StylesSaluteChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {

    override val variations: Map<String, @Composable () -> ChipStyle>
        get() = mapOf(
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