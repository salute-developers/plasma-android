package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupWide
import com.sdds.plasma.homeds.styles.chipgroup.Default
import com.sdds.plasma.homeds.styles.chipgroup.L
import com.sdds.plasma.homeds.styles.chipgroup.M
import com.sdds.plasma.homeds.styles.chipgroup.Pilled
import com.sdds.plasma.homeds.styles.chipgroup.S
import com.sdds.plasma.homeds.styles.chipgroup.Secondary
import com.sdds.plasma.homeds.styles.chipgroup.Xs
import com.sdds.plasma.homeds.styles.chipgroup.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsChipGroupWideVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { ChipGroupWide.L.Default.style() },
            "L.Secondary" to { ChipGroupWide.L.Secondary.style() },
            "L.Pilled.Default" to { ChipGroupWide.L.Pilled.Default.style() },
            "L.Pilled.Secondary" to { ChipGroupWide.L.Pilled.Secondary.style() },
            "M.Default" to { ChipGroupWide.M.Default.style() },
            "M.Secondary" to { ChipGroupWide.M.Secondary.style() },
            "M.Pilled.Default" to { ChipGroupWide.M.Pilled.Default.style() },
            "M.Pilled.Secondary" to { ChipGroupWide.M.Pilled.Secondary.style() },
            "S.Default" to { ChipGroupWide.S.Default.style() },
            "S.Secondary" to { ChipGroupWide.S.Secondary.style() },
            "S.Pilled.Default" to { ChipGroupWide.S.Pilled.Default.style() },
            "S.Pilled.Secondary" to { ChipGroupWide.S.Pilled.Secondary.style() },
            "Xs.Default" to { ChipGroupWide.Xs.Default.style() },
            "Xs.Secondary" to { ChipGroupWide.Xs.Secondary.style() },
            "Xs.Pilled.Default" to { ChipGroupWide.Xs.Pilled.Default.style() },
            "Xs.Pilled.Secondary" to { ChipGroupWide.Xs.Pilled.Secondary.style() },
            "Xxs.Default" to { ChipGroupWide.Xxs.Default.style() },
            "Xxs.Secondary" to { ChipGroupWide.Xxs.Secondary.style() },
            "Xxs.Pilled.Default" to { ChipGroupWide.Xxs.Pilled.Default.style() },
            "Xxs.Pilled.Secondary" to { ChipGroupWide.Xxs.Pilled.Secondary.style() },
        )
}
