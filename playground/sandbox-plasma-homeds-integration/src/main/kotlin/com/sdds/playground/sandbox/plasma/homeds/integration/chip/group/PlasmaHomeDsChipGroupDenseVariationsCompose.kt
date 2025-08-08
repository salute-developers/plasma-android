package com.sdds.playground.sandbox.plasma.homeds.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.homeds.styles.chipgroup.Default
import com.sdds.plasma.homeds.styles.chipgroup.L
import com.sdds.plasma.homeds.styles.chipgroup.M
import com.sdds.plasma.homeds.styles.chipgroup.Pilled
import com.sdds.plasma.homeds.styles.chipgroup.S
import com.sdds.plasma.homeds.styles.chipgroup.Secondary
import com.sdds.plasma.homeds.styles.chipgroup.Xs
import com.sdds.plasma.homeds.styles.chipgroup.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsChipGroupDenseVariationsCompose :
    ComposeStyleProvider<String, ChipGroupStyle>() {

    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "LDefault" to { ChipGroupDense.L.Default.style() },
            "MDefault" to { ChipGroupDense.M.Default.style() },
            "SDefault" to { ChipGroupDense.S.Default.style() },
            "XsDefault" to { ChipGroupDense.Xs.Default.style() },
            "XxsDefault" to { ChipGroupDense.Xxs.Default.style() },

            "LDefaultPilled" to { ChipGroupDense.L.Pilled.Default.style() },
            "MDefaultPilled" to { ChipGroupDense.M.Pilled.Default.style() },
            "SDefaultPilled" to { ChipGroupDense.S.Pilled.Default.style() },
            "XsDefaultPilled" to { ChipGroupDense.Xs.Pilled.Default.style() },
            "XxsDefaultPilled" to { ChipGroupDense.Xxs.Pilled.Default.style() },

            "LSecondary" to { ChipGroupDense.L.Secondary.style() },
            "MSecondary" to { ChipGroupDense.M.Secondary.style() },
            "SSecondary" to { ChipGroupDense.S.Secondary.style() },
            "XsSecondary" to { ChipGroupDense.Xs.Secondary.style() },
            "XxsSecondary" to { ChipGroupDense.Xxs.Secondary.style() },

            "LSecondaryPilled" to { ChipGroupDense.L.Pilled.Secondary.style() },
            "MSecondaryPilled" to { ChipGroupDense.M.Pilled.Secondary.style() },
            "SSecondaryPilled" to { ChipGroupDense.S.Pilled.Secondary.style() },
            "XsSecondaryPilled" to { ChipGroupDense.Xs.Pilled.Secondary.style() },
            "XxsSecondaryPilled" to { ChipGroupDense.Xxs.Pilled.Secondary.style() },
        )
}
