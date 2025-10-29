package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chipgroup.Accent
import com.sdds.stylessalute.styles.chipgroup.ChipGroupDense
import com.sdds.stylessalute.styles.chipgroup.Default
import com.sdds.stylessalute.styles.chipgroup.L
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.chipgroup.Pilled
import com.sdds.stylessalute.styles.chipgroup.S
import com.sdds.stylessalute.styles.chipgroup.Secondary
import com.sdds.stylessalute.styles.chipgroup.Xs

internal object StylesSaluteChipGroupDenseVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { ChipGroupDense.L.Default.style() },
            "L.Accent" to { ChipGroupDense.L.Accent.style() },
            "L.Secondary" to { ChipGroupDense.L.Secondary.style() },
            "L.Pilled.Default" to { ChipGroupDense.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { ChipGroupDense.L.Pilled.Accent.style() },
            "L.Pilled.Secondary" to { ChipGroupDense.L.Pilled.Secondary.style() },
            "M.Default" to { ChipGroupDense.M.Default.style() },
            "M.Accent" to { ChipGroupDense.M.Accent.style() },
            "M.Secondary" to { ChipGroupDense.M.Secondary.style() },
            "M.Pilled.Default" to { ChipGroupDense.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { ChipGroupDense.M.Pilled.Accent.style() },
            "M.Pilled.Secondary" to { ChipGroupDense.M.Pilled.Secondary.style() },
            "S.Default" to { ChipGroupDense.S.Default.style() },
            "S.Accent" to { ChipGroupDense.S.Accent.style() },
            "S.Secondary" to { ChipGroupDense.S.Secondary.style() },
            "S.Pilled.Default" to { ChipGroupDense.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { ChipGroupDense.S.Pilled.Accent.style() },
            "S.Pilled.Secondary" to { ChipGroupDense.S.Pilled.Secondary.style() },
            "Xs.Default" to { ChipGroupDense.Xs.Default.style() },
            "Xs.Accent" to { ChipGroupDense.Xs.Accent.style() },
            "Xs.Secondary" to { ChipGroupDense.Xs.Secondary.style() },
            "Xs.Pilled.Default" to { ChipGroupDense.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { ChipGroupDense.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Secondary" to { ChipGroupDense.Xs.Pilled.Secondary.style() },
        )
}
