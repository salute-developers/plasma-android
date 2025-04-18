package com.sdds.playground.sandbox.sdds.serv.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.chipgroup.Accent
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.EmbeddedChipGroupDense
import com.sdds.serv.styles.chipgroup.L
import com.sdds.serv.styles.chipgroup.M
import com.sdds.serv.styles.chipgroup.Negative
import com.sdds.serv.styles.chipgroup.Positive
import com.sdds.serv.styles.chipgroup.S
import com.sdds.serv.styles.chipgroup.Secondary
import com.sdds.serv.styles.chipgroup.Warning
import com.sdds.serv.styles.chipgroup.Xs

internal object SddsServEmbeddedChipGroupDenseVariationsCompose :
    ComposeStyleProvider<String, ChipGroupStyle>() {

    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "LDefault" to { EmbeddedChipGroupDense.L.Default.style() },
            "MDefault" to { EmbeddedChipGroupDense.M.Default.style() },
            "SDefault" to { EmbeddedChipGroupDense.S.Default.style() },
            "XsDefault" to { EmbeddedChipGroupDense.Xs.Default.style() },

            "LSecondary" to { EmbeddedChipGroupDense.L.Secondary.style() },
            "MSecondary" to { EmbeddedChipGroupDense.M.Secondary.style() },
            "SSecondary" to { EmbeddedChipGroupDense.S.Secondary.style() },
            "XsSecondary" to { EmbeddedChipGroupDense.Xs.Secondary.style() },

            "LAccent" to { EmbeddedChipGroupDense.L.Accent.style() },
            "MAccent" to { EmbeddedChipGroupDense.M.Accent.style() },
            "SAccent" to { EmbeddedChipGroupDense.S.Accent.style() },
            "XsAccent" to { EmbeddedChipGroupDense.Xs.Accent.style() },

            "LNegative" to { EmbeddedChipGroupDense.L.Negative.style() },
            "MNegative" to { EmbeddedChipGroupDense.M.Negative.style() },
            "SNegative" to { EmbeddedChipGroupDense.S.Negative.style() },
            "XsNegative" to { EmbeddedChipGroupDense.Xs.Negative.style() },

            "LPositive" to { EmbeddedChipGroupDense.L.Positive.style() },
            "MPositive" to { EmbeddedChipGroupDense.M.Positive.style() },
            "SPositive" to { EmbeddedChipGroupDense.S.Positive.style() },
            "XsPositive" to { EmbeddedChipGroupDense.Xs.Positive.style() },

            "LWarning" to { EmbeddedChipGroupDense.L.Warning.style() },
            "MWarning" to { EmbeddedChipGroupDense.M.Warning.style() },
            "SWarning" to { EmbeddedChipGroupDense.S.Warning.style() },
            "XsWarning" to { EmbeddedChipGroupDense.Xs.Warning.style() },
        )
}
