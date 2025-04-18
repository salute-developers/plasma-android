package com.sdds.playground.sandbox.plasma.sd.service.integration.chip

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.chip.Accent
import com.sdds.plasma.sd.service.styles.chip.Chip
import com.sdds.plasma.sd.service.styles.chip.Default
import com.sdds.plasma.sd.service.styles.chip.L
import com.sdds.plasma.sd.service.styles.chip.M
import com.sdds.plasma.sd.service.styles.chip.Negative
import com.sdds.plasma.sd.service.styles.chip.Pilled
import com.sdds.plasma.sd.service.styles.chip.Positive
import com.sdds.plasma.sd.service.styles.chip.S
import com.sdds.plasma.sd.service.styles.chip.Secondary
import com.sdds.plasma.sd.service.styles.chip.Warning
import com.sdds.plasma.sd.service.styles.chip.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceChipVariationsCompose : ComposeStyleProvider<String, ChipStyle>() {

    override val variations: Map<String, @Composable () -> ChipStyle> =
        mapOf(
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

            "LNegative" to { Chip.L.Negative.style() },
            "MNegative" to { Chip.M.Negative.style() },
            "SNegative" to { Chip.S.Negative.style() },
            "XsNegative" to { Chip.Xs.Negative.style() },

            "LNegativePilled" to { Chip.L.Pilled.Negative.style() },
            "MNegativePilled" to { Chip.M.Pilled.Negative.style() },
            "SNegativePilled" to { Chip.S.Pilled.Negative.style() },
            "XsNegativePilled" to { Chip.Xs.Pilled.Negative.style() },

            "LPositive" to { Chip.L.Positive.style() },
            "MNegative" to { Chip.M.Positive.style() },
            "SNegative" to { Chip.S.Positive.style() },
            "XsPositive" to { Chip.Xs.Positive.style() },

            "LPositivePilled" to { Chip.L.Pilled.Positive.style() },
            "MPositivePilled" to { Chip.M.Pilled.Positive.style() },
            "SPositivePilled" to { Chip.S.Pilled.Positive.style() },
            "XsPositivePilled" to { Chip.Xs.Pilled.Positive.style() },

            "LWarning" to { Chip.L.Warning.style() },
            "MNegative" to { Chip.M.Warning.style() },
            "SNegative" to { Chip.S.Warning.style() },
            "XsWarning" to { Chip.Xs.Warning.style() },

            "LWarningPilled" to { Chip.L.Pilled.Warning.style() },
            "MWarningPilled" to { Chip.M.Pilled.Warning.style() },
            "SWarningPilled" to { Chip.S.Pilled.Warning.style() },
            "XsWarningPilled" to { Chip.Xs.Pilled.Warning.style() },
        )
}
