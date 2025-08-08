package com.sdds.playground.sandbox.plasma.homeds.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupWide
import com.sdds.plasma.homeds.styles.chipgroup.Default
import com.sdds.plasma.homeds.styles.chipgroup.L
import com.sdds.plasma.homeds.styles.chipgroup.M
import com.sdds.plasma.homeds.styles.chipgroup.Pilled
import com.sdds.plasma.homeds.styles.chipgroup.S
import com.sdds.plasma.homeds.styles.chipgroup.Secondary
import com.sdds.plasma.homeds.styles.chipgroup.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsChipGroupWideVariationsCompose :
    ComposeStyleProvider<String, ChipGroupStyle>() {

    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "LDefault" to { ChipGroupWide.L.Default.style() },
            "MDefault" to { ChipGroupWide.M.Default.style() },
            "SDefault" to { ChipGroupWide.S.Default.style() },
            "XsDefault" to { ChipGroupWide.Xs.Default.style() },

            "LDefaultPilled" to { ChipGroupWide.L.Pilled.Default.style() },
            "MDefaultPilled" to { ChipGroupWide.M.Pilled.Default.style() },
            "SDefaultPilled" to { ChipGroupWide.S.Pilled.Default.style() },
            "XsDefaultPilled" to { ChipGroupWide.Xs.Pilled.Default.style() },

            "LSecondary" to { ChipGroupWide.L.Secondary.style() },
            "MSecondary" to { ChipGroupWide.M.Secondary.style() },
            "SSecondary" to { ChipGroupWide.S.Secondary.style() },
            "XsSecondary" to { ChipGroupWide.Xs.Secondary.style() },

            "LSecondaryPilled" to { ChipGroupWide.L.Pilled.Secondary.style() },
            "MSecondaryPilled" to { ChipGroupWide.M.Pilled.Secondary.style() },
            "SSecondaryPilled" to { ChipGroupWide.S.Pilled.Secondary.style() },
            "XsSecondaryPilled" to { ChipGroupWide.Xs.Pilled.Secondary.style() },
        )
}
