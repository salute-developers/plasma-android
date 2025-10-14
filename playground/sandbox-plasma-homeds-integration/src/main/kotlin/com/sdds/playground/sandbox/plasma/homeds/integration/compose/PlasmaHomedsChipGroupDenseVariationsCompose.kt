package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.homeds.styles.chipgroup.Default
import com.sdds.plasma.homeds.styles.chipgroup.L
import com.sdds.plasma.homeds.styles.chipgroup.M
import com.sdds.plasma.homeds.styles.chipgroup.Pilled
import com.sdds.plasma.homeds.styles.chipgroup.S
import com.sdds.plasma.homeds.styles.chipgroup.Secondary
import com.sdds.plasma.homeds.styles.chipgroup.Xs
import com.sdds.plasma.homeds.styles.chipgroup.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsChipGroupDenseVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { ChipGroupDense.L.Default.style() },
            "L.Secondary" to { ChipGroupDense.L.Secondary.style() },
            "L.Pilled.Default" to { ChipGroupDense.L.Pilled.Default.style() },
            "L.Pilled.Secondary" to { ChipGroupDense.L.Pilled.Secondary.style() },
            "M.Default" to { ChipGroupDense.M.Default.style() },
            "M.Secondary" to { ChipGroupDense.M.Secondary.style() },
            "M.Pilled.Default" to { ChipGroupDense.M.Pilled.Default.style() },
            "M.Pilled.Secondary" to { ChipGroupDense.M.Pilled.Secondary.style() },
            "S.Default" to { ChipGroupDense.S.Default.style() },
            "S.Secondary" to { ChipGroupDense.S.Secondary.style() },
            "S.Pilled.Default" to { ChipGroupDense.S.Pilled.Default.style() },
            "S.Pilled.Secondary" to { ChipGroupDense.S.Pilled.Secondary.style() },
            "Xs.Default" to { ChipGroupDense.Xs.Default.style() },
            "Xs.Secondary" to { ChipGroupDense.Xs.Secondary.style() },
            "Xs.Pilled.Default" to { ChipGroupDense.Xs.Pilled.Default.style() },
            "Xs.Pilled.Secondary" to { ChipGroupDense.Xs.Pilled.Secondary.style() },
            "Xxs.Default" to { ChipGroupDense.Xxs.Default.style() },
            "Xxs.Secondary" to { ChipGroupDense.Xxs.Secondary.style() },
            "Xxs.Pilled.Default" to { ChipGroupDense.Xxs.Pilled.Default.style() },
            "Xxs.Pilled.Secondary" to { ChipGroupDense.Xxs.Pilled.Secondary.style() },
        )
}
