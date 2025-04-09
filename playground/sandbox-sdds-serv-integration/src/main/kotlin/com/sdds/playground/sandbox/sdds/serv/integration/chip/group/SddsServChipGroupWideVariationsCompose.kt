package com.sdds.playground.sandbox.sdds.serv.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.chipgroup.Accent
import com.sdds.serv.styles.chipgroup.ChipGroupWide
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.L
import com.sdds.serv.styles.chipgroup.M
import com.sdds.serv.styles.chipgroup.Negative
import com.sdds.serv.styles.chipgroup.Pilled
import com.sdds.serv.styles.chipgroup.Positive
import com.sdds.serv.styles.chipgroup.S
import com.sdds.serv.styles.chipgroup.Secondary
import com.sdds.serv.styles.chipgroup.Warning
import com.sdds.serv.styles.chipgroup.Xs

internal object SddsServChipGroupWideVariationsCompose :
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

            "LAccent" to { ChipGroupWide.L.Accent.style() },
            "MAccent" to { ChipGroupWide.M.Accent.style() },
            "SAccent" to { ChipGroupWide.S.Accent.style() },
            "XsAccent" to { ChipGroupWide.Xs.Accent.style() },

            "LAccentPilled" to { ChipGroupWide.L.Pilled.Accent.style() },
            "MAccentPilled" to { ChipGroupWide.M.Pilled.Accent.style() },
            "SAccentPilled" to { ChipGroupWide.S.Pilled.Accent.style() },
            "XsAccentPilled" to { ChipGroupWide.Xs.Pilled.Accent.style() },

            "LNegative" to { ChipGroupWide.L.Negative.style() },
            "MNegative" to { ChipGroupWide.M.Negative.style() },
            "SNegative" to { ChipGroupWide.S.Negative.style() },
            "XsNegative" to { ChipGroupWide.Xs.Negative.style() },

            "LNegativePilled" to { ChipGroupWide.L.Pilled.Negative.style() },
            "MNegativePilled" to { ChipGroupWide.M.Pilled.Negative.style() },
            "SNegativePilled" to { ChipGroupWide.S.Pilled.Negative.style() },
            "XsNegativePilled" to { ChipGroupWide.Xs.Pilled.Negative.style() },

            "LPositive" to { ChipGroupWide.L.Positive.style() },
            "MPositive" to { ChipGroupWide.M.Positive.style() },
            "SPositive" to { ChipGroupWide.S.Positive.style() },
            "XsPositive" to { ChipGroupWide.Xs.Positive.style() },

            "LPositivePilled" to { ChipGroupWide.L.Pilled.Positive.style() },
            "MPositivePilled" to { ChipGroupWide.M.Pilled.Positive.style() },
            "SPositivePilled" to { ChipGroupWide.S.Pilled.Positive.style() },
            "XsPositivePilled" to { ChipGroupWide.Xs.Pilled.Positive.style() },

            "LWarning" to { ChipGroupWide.L.Warning.style() },
            "MWarning" to { ChipGroupWide.M.Warning.style() },
            "SWarning" to { ChipGroupWide.S.Warning.style() },
            "XsWarning" to { ChipGroupWide.Xs.Warning.style() },

            "LWarningPilled" to { ChipGroupWide.L.Pilled.Warning.style() },
            "MWarningPilled" to { ChipGroupWide.M.Pilled.Warning.style() },
            "SWarningPilled" to { ChipGroupWide.S.Pilled.Warning.style() },
            "XsWarningPilled" to { ChipGroupWide.Xs.Pilled.Warning.style() },
        )
}
