package com.sdds.playground.sandbox.stylessalute.integration.chip

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

    override val variations: Map<String, @Composable () -> ChipStyle> = mapOf(
        "LDefault" to { Chip.L.Default.style() },
        "MDefault" to { Chip.M.Default.style() },
        "SDefault" to { Chip.S.Default.style() },
        "XsDefault" to { Chip.Xs.Default.style() },

        "LDefaultPilled" to { Chip.L.Pilled.Default.style() },
        "MDefaultPilled" to { Chip.M.Pilled.Default.style() },
        "SDefaultPilled" to { Chip.S.Pilled.Default.style() },
        "XsDefaultPilled" to { Chip.Xs.Pilled.Default.style() },

        "LSecondary" to { Chip.L.Secondary.style() },
        "MSecondary" to { Chip.M.Secondary.style() },
        "SSecondary" to { Chip.S.Secondary.style() },
        "XsSecondary" to { Chip.Xs.Secondary.style() },

        "LSecondaryPilled" to { Chip.L.Pilled.Secondary.style() },
        "MSecondaryPilled" to { Chip.M.Pilled.Secondary.style() },
        "SSecondaryPilled" to { Chip.S.Pilled.Secondary.style() },
        "XsSecondaryPilled" to { Chip.Xs.Pilled.Secondary.style() },

        "LAccent" to { Chip.L.Accent.style() },
        "MAccent" to { Chip.M.Accent.style() },
        "SAccent" to { Chip.S.Accent.style() },
        "XsAccent" to { Chip.Xs.Accent.style() },

        "LAccentPilled" to { Chip.L.Pilled.Accent.style() },
        "MAccentPilled" to { Chip.M.Pilled.Accent.style() },
        "SAccentPilled" to { Chip.S.Pilled.Accent.style() },
        "XsAccentPilled" to { Chip.Xs.Pilled.Accent.style() },
    )
}
