package com.sdds.playground.sandbox.sdds.serv.integration.compose

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

internal object SddsServEmbeddedChipGroupWideVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { EmbeddedChipGroupWide.L.Default.style() },
            "L.Accent" to { EmbeddedChipGroupWide.L.Accent.style() },
            "L.Negative" to { EmbeddedChipGroupWide.L.Negative.style() },
            "L.Positive" to { EmbeddedChipGroupWide.L.Positive.style() },
            "L.Secondary" to { EmbeddedChipGroupWide.L.Secondary.style() },
            "L.Warning" to { EmbeddedChipGroupWide.L.Warning.style() },
            "M.Default" to { EmbeddedChipGroupWide.M.Default.style() },
            "M.Accent" to { EmbeddedChipGroupWide.M.Accent.style() },
            "M.Negative" to { EmbeddedChipGroupWide.M.Negative.style() },
            "M.Positive" to { EmbeddedChipGroupWide.M.Positive.style() },
            "M.Secondary" to { EmbeddedChipGroupWide.M.Secondary.style() },
            "M.Warning" to { EmbeddedChipGroupWide.M.Warning.style() },
            "S.Default" to { EmbeddedChipGroupWide.S.Default.style() },
            "S.Accent" to { EmbeddedChipGroupWide.S.Accent.style() },
            "S.Negative" to { EmbeddedChipGroupWide.S.Negative.style() },
            "S.Positive" to { EmbeddedChipGroupWide.S.Positive.style() },
            "S.Secondary" to { EmbeddedChipGroupWide.S.Secondary.style() },
            "S.Warning" to { EmbeddedChipGroupWide.S.Warning.style() },
            "Xs.Default" to { EmbeddedChipGroupWide.Xs.Default.style() },
            "Xs.Accent" to { EmbeddedChipGroupWide.Xs.Accent.style() },
            "Xs.Negative" to { EmbeddedChipGroupWide.Xs.Negative.style() },
            "Xs.Positive" to { EmbeddedChipGroupWide.Xs.Positive.style() },
            "Xs.Secondary" to { EmbeddedChipGroupWide.Xs.Secondary.style() },
            "Xs.Warning" to { EmbeddedChipGroupWide.Xs.Warning.style() },
        )
}
