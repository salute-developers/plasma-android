package com.sdds.playground.sandbox.stylessalute.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chipgroup.Accent
import com.sdds.stylessalute.styles.chipgroup.Default
import com.sdds.stylessalute.styles.chipgroup.Secondary
import com.sdds.stylessalute.styles.chipgroup.EmbeddedChipGroupWide
import com.sdds.stylessalute.styles.chipgroup.L
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.chipgroup.S
import com.sdds.stylessalute.styles.chipgroup.Xs

internal object StylesSaluteEmbeddedChipGroupWideVariationsCompose :
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
        )
}
