package com.sdds.playground.sandbox.stylessalute.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chipgroup.Accent
import com.sdds.stylessalute.styles.chipgroup.Default
import com.sdds.stylessalute.styles.chipgroup.EmbeddedChipGroupDense
import com.sdds.stylessalute.styles.chipgroup.L
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.chipgroup.S
import com.sdds.stylessalute.styles.chipgroup.Secondary
import com.sdds.stylessalute.styles.chipgroup.Xs

internal object StylesSaluteEmbeddedChipGroupDenseVariationsCompose :
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
        )
}
