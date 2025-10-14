package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chipgroup.Accent
import com.sdds.stylessalute.styles.chipgroup.ChipGroupWide
import com.sdds.stylessalute.styles.chipgroup.Default
import com.sdds.stylessalute.styles.chipgroup.L
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.chipgroup.Pilled
import com.sdds.stylessalute.styles.chipgroup.S
import com.sdds.stylessalute.styles.chipgroup.Secondary
import com.sdds.stylessalute.styles.chipgroup.Xs

internal object StylesSaluteChipGroupWideVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { ChipGroupWide.L.Default.style() },
            "L.Accent" to { ChipGroupWide.L.Accent.style() },
            "L.Secondary" to { ChipGroupWide.L.Secondary.style() },
            "L.Pilled.Default" to { ChipGroupWide.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { ChipGroupWide.L.Pilled.Accent.style() },
            "L.Pilled.Secondary" to { ChipGroupWide.L.Pilled.Secondary.style() },
            "M.Default" to { ChipGroupWide.M.Default.style() },
            "M.Accent" to { ChipGroupWide.M.Accent.style() },
            "M.Secondary" to { ChipGroupWide.M.Secondary.style() },
            "M.Pilled.Default" to { ChipGroupWide.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { ChipGroupWide.M.Pilled.Accent.style() },
            "M.Pilled.Secondary" to { ChipGroupWide.M.Pilled.Secondary.style() },
            "S.Default" to { ChipGroupWide.S.Default.style() },
            "S.Accent" to { ChipGroupWide.S.Accent.style() },
            "S.Secondary" to { ChipGroupWide.S.Secondary.style() },
            "S.Pilled.Default" to { ChipGroupWide.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { ChipGroupWide.S.Pilled.Accent.style() },
            "S.Pilled.Secondary" to { ChipGroupWide.S.Pilled.Secondary.style() },
            "Xs.Default" to { ChipGroupWide.Xs.Default.style() },
            "Xs.Accent" to { ChipGroupWide.Xs.Accent.style() },
            "Xs.Secondary" to { ChipGroupWide.Xs.Secondary.style() },
            "Xs.Pilled.Default" to { ChipGroupWide.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { ChipGroupWide.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Secondary" to { ChipGroupWide.Xs.Pilled.Secondary.style() },
        )
}
