package com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.chipgroup.Accent
import com.sdds.plasma.sd.service.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.sd.service.styles.chipgroup.Default
import com.sdds.plasma.sd.service.styles.chipgroup.L
import com.sdds.plasma.sd.service.styles.chipgroup.M
import com.sdds.plasma.sd.service.styles.chipgroup.Negative
import com.sdds.plasma.sd.service.styles.chipgroup.Pilled
import com.sdds.plasma.sd.service.styles.chipgroup.Positive
import com.sdds.plasma.sd.service.styles.chipgroup.S
import com.sdds.plasma.sd.service.styles.chipgroup.Secondary
import com.sdds.plasma.sd.service.styles.chipgroup.Warning
import com.sdds.plasma.sd.service.styles.chipgroup.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceChipGroupDenseVariationsCompose :
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

            "LNegative" to { ChipGroupDense.L.Negative.style() },
            "MNegative" to { ChipGroupDense.M.Negative.style() },
            "SNegative" to { ChipGroupDense.S.Negative.style() },
            "XsNegative" to { ChipGroupDense.Xs.Negative.style() },

            "LNegativePilled" to { ChipGroupDense.L.Pilled.Negative.style() },
            "MNegativePilled" to { ChipGroupDense.M.Pilled.Negative.style() },
            "SNegativePilled" to { ChipGroupDense.S.Pilled.Negative.style() },
            "XsNegativePilled" to { ChipGroupDense.Xs.Pilled.Negative.style() },

            "LPositive" to { ChipGroupDense.L.Positive.style() },
            "MPositive" to { ChipGroupDense.M.Positive.style() },
            "SPositive" to { ChipGroupDense.S.Positive.style() },
            "XsPositive" to { ChipGroupDense.Xs.Positive.style() },

            "LPositivePilled" to { ChipGroupDense.L.Pilled.Positive.style() },
            "MPositivePilled" to { ChipGroupDense.M.Pilled.Positive.style() },
            "SPositivePilled" to { ChipGroupDense.S.Pilled.Positive.style() },
            "XsPositivePilled" to { ChipGroupDense.Xs.Pilled.Positive.style() },

            "LWarning" to { ChipGroupDense.L.Warning.style() },
            "MWarning" to { ChipGroupDense.M.Warning.style() },
            "SWarning" to { ChipGroupDense.S.Warning.style() },
            "XsWarning" to { ChipGroupDense.Xs.Warning.style() },

            "LWarningPilled" to { ChipGroupDense.L.Pilled.Warning.style() },
            "MWarningPilled" to { ChipGroupDense.M.Pilled.Warning.style() },
            "SWarningPilled" to { ChipGroupDense.S.Pilled.Warning.style() },
            "XsWarningPilled" to { ChipGroupDense.Xs.Pilled.Warning.style() },
        )
}
