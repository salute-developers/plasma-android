package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chipgroup.Accent
import com.sdds.stylessalute.styles.chipgroup.Default
import com.sdds.stylessalute.styles.chipgroup.EmbeddedChipGroupWide
import com.sdds.stylessalute.styles.chipgroup.L
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.chipgroup.S
import com.sdds.stylessalute.styles.chipgroup.Secondary
import com.sdds.stylessalute.styles.chipgroup.Xs

internal object StylesSaluteEmbeddedChipGroupWideVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { EmbeddedChipGroupWide.L.Default.style() },
            "L.Accent" to { EmbeddedChipGroupWide.L.Accent.style() },
            "L.Secondary" to { EmbeddedChipGroupWide.L.Secondary.style() },
            "M.Default" to { EmbeddedChipGroupWide.M.Default.style() },
            "M.Accent" to { EmbeddedChipGroupWide.M.Accent.style() },
            "M.Secondary" to { EmbeddedChipGroupWide.M.Secondary.style() },
            "S.Default" to { EmbeddedChipGroupWide.S.Default.style() },
            "S.Accent" to { EmbeddedChipGroupWide.S.Accent.style() },
            "S.Secondary" to { EmbeddedChipGroupWide.S.Secondary.style() },
            "Xs.Default" to { EmbeddedChipGroupWide.Xs.Default.style() },
            "Xs.Accent" to { EmbeddedChipGroupWide.Xs.Accent.style() },
            "Xs.Secondary" to { EmbeddedChipGroupWide.Xs.Secondary.style() },
        )
}
