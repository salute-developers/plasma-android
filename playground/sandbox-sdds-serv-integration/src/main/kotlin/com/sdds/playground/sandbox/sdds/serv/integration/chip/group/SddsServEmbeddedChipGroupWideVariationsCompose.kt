package com.sdds.playground.sandbox.sdds.serv.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.chipgroup.Accent
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.EmbeddedChipGroupWide
import com.sdds.serv.styles.chipgroup.L
import com.sdds.serv.styles.chipgroup.M
import com.sdds.serv.styles.chipgroup.Negative
import com.sdds.serv.styles.chipgroup.Positive
import com.sdds.serv.styles.chipgroup.S
import com.sdds.serv.styles.chipgroup.Secondary
import com.sdds.serv.styles.chipgroup.Warning
import com.sdds.serv.styles.chipgroup.Xs

internal object SddsServEmbeddedChipGroupWideVariationsCompose :
    ComposeStyleProvider<String, ChipGroupStyle>() {

    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "LDefault" to { EmbeddedChipGroupWide.L.Default.style() },
            "MDefault" to { EmbeddedChipGroupWide.M.Default.style() },
            "SDefault" to { EmbeddedChipGroupWide.S.Default.style() },
            "XsDefault" to { EmbeddedChipGroupWide.Xs.Default.style() },

            "LSecondary" to { EmbeddedChipGroupWide.L.Secondary.style() },
            "MSecondary" to { EmbeddedChipGroupWide.M.Secondary.style() },
            "SSecondary" to { EmbeddedChipGroupWide.S.Secondary.style() },
            "XsSecondary" to { EmbeddedChipGroupWide.Xs.Secondary.style() },

            "LAccent" to { EmbeddedChipGroupWide.L.Accent.style() },
            "MAccent" to { EmbeddedChipGroupWide.M.Accent.style() },
            "SAccent" to { EmbeddedChipGroupWide.S.Accent.style() },
            "XsAccent" to { EmbeddedChipGroupWide.Xs.Accent.style() },

            "LNegative" to { EmbeddedChipGroupWide.L.Negative.style() },
            "MNegative" to { EmbeddedChipGroupWide.M.Negative.style() },
            "SNegative" to { EmbeddedChipGroupWide.S.Negative.style() },
            "XsNegative" to { EmbeddedChipGroupWide.Xs.Negative.style() },

            "LPositive" to { EmbeddedChipGroupWide.L.Positive.style() },
            "MPositive" to { EmbeddedChipGroupWide.M.Positive.style() },
            "SPositive" to { EmbeddedChipGroupWide.S.Positive.style() },
            "XsPositive" to { EmbeddedChipGroupWide.Xs.Positive.style() },

            "LWarning" to { EmbeddedChipGroupWide.L.Warning.style() },
            "MWarning" to { EmbeddedChipGroupWide.M.Warning.style() },
            "SWarning" to { EmbeddedChipGroupWide.S.Warning.style() },
            "XsWarning" to { EmbeddedChipGroupWide.Xs.Warning.style() },
        )
}
