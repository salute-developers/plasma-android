package com.sdds.playground.sandbox.stylessalute.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chipgroup.Accent
import com.sdds.stylessalute.styles.chipgroup.ChipGroupDense
import com.sdds.stylessalute.styles.chipgroup.Default
import com.sdds.stylessalute.styles.chipgroup.L
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.chipgroup.Pilled
import com.sdds.stylessalute.styles.chipgroup.S
import com.sdds.stylessalute.styles.chipgroup.Secondary
import com.sdds.stylessalute.styles.chipgroup.Xs

internal object StylesSaluteChipGroupDenseVariationsCompose :
    ComposeStyleProvider<String, ChipGroupStyle>() {

    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "LDefault" to { ChipGroupDense.L.Default.style() },
            "MDefault" to { ChipGroupDense.M.Default.style() },
            "SDefault" to { ChipGroupDense.S.Default.style() },
            "XsDefault" to { ChipGroupDense.Xs.Default.style() },

            "LDefaultPilled" to { ChipGroupDense.L.Pilled.Default.style() },
            "MDefaultPilled" to { ChipGroupDense.M.Pilled.Default.style() },
            "SDefaultPilled" to { ChipGroupDense.S.Pilled.Default.style() },
            "XsDefaultPilled" to { ChipGroupDense.Xs.Pilled.Default.style() },

            "LSecondary" to { ChipGroupDense.L.Secondary.style() },
            "MSecondary" to { ChipGroupDense.M.Secondary.style() },
            "SSecondary" to { ChipGroupDense.S.Secondary.style() },
            "XsSecondary" to { ChipGroupDense.Xs.Secondary.style() },

            "LSecondaryPilled" to { ChipGroupDense.L.Pilled.Secondary.style() },
            "MSecondaryPilled" to { ChipGroupDense.M.Pilled.Secondary.style() },
            "SSecondaryPilled" to { ChipGroupDense.S.Pilled.Secondary.style() },
            "XsSecondaryPilled" to { ChipGroupDense.Xs.Pilled.Secondary.style() },

            "LAccent" to { ChipGroupDense.L.Accent.style() },
            "MAccent" to { ChipGroupDense.M.Accent.style() },
            "SAccent" to { ChipGroupDense.S.Accent.style() },
            "XsAccent" to { ChipGroupDense.Xs.Accent.style() },

            "LAccentPilled" to { ChipGroupDense.L.Pilled.Accent.style() },
            "MAccentPilled" to { ChipGroupDense.M.Pilled.Accent.style() },
            "SAccentPilled" to { ChipGroupDense.S.Pilled.Accent.style() },
            "XsAccentPilled" to { ChipGroupDense.Xs.Pilled.Accent.style() },
        )
}
