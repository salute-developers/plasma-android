package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.chipgroup.Accent
import com.sdds.plasma.giga.styles.chipgroup.ChipGroupWide
import com.sdds.plasma.giga.styles.chipgroup.Default
import com.sdds.plasma.giga.styles.chipgroup.L
import com.sdds.plasma.giga.styles.chipgroup.M
import com.sdds.plasma.giga.styles.chipgroup.Negative
import com.sdds.plasma.giga.styles.chipgroup.Pilled
import com.sdds.plasma.giga.styles.chipgroup.Positive
import com.sdds.plasma.giga.styles.chipgroup.S
import com.sdds.plasma.giga.styles.chipgroup.Secondary
import com.sdds.plasma.giga.styles.chipgroup.Warning
import com.sdds.plasma.giga.styles.chipgroup.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaChipGroupWideVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { ChipGroupWide.L.Default.style() },
            "L.Accent" to { ChipGroupWide.L.Accent.style() },
            "L.Negative" to { ChipGroupWide.L.Negative.style() },
            "L.Positive" to { ChipGroupWide.L.Positive.style() },
            "L.Secondary" to { ChipGroupWide.L.Secondary.style() },
            "L.Warning" to { ChipGroupWide.L.Warning.style() },
            "L.Pilled.Default" to { ChipGroupWide.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { ChipGroupWide.L.Pilled.Accent.style() },
            "L.Pilled.Negative" to { ChipGroupWide.L.Pilled.Negative.style() },
            "L.Pilled.Positive" to { ChipGroupWide.L.Pilled.Positive.style() },
            "L.Pilled.Secondary" to { ChipGroupWide.L.Pilled.Secondary.style() },
            "L.Pilled.Warning" to { ChipGroupWide.L.Pilled.Warning.style() },
            "M.Default" to { ChipGroupWide.M.Default.style() },
            "M.Accent" to { ChipGroupWide.M.Accent.style() },
            "M.Negative" to { ChipGroupWide.M.Negative.style() },
            "M.Positive" to { ChipGroupWide.M.Positive.style() },
            "M.Secondary" to { ChipGroupWide.M.Secondary.style() },
            "M.Warning" to { ChipGroupWide.M.Warning.style() },
            "M.Pilled.Default" to { ChipGroupWide.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { ChipGroupWide.M.Pilled.Accent.style() },
            "M.Pilled.Negative" to { ChipGroupWide.M.Pilled.Negative.style() },
            "M.Pilled.Positive" to { ChipGroupWide.M.Pilled.Positive.style() },
            "M.Pilled.Secondary" to { ChipGroupWide.M.Pilled.Secondary.style() },
            "M.Pilled.Warning" to { ChipGroupWide.M.Pilled.Warning.style() },
            "S.Default" to { ChipGroupWide.S.Default.style() },
            "S.Accent" to { ChipGroupWide.S.Accent.style() },
            "S.Negative" to { ChipGroupWide.S.Negative.style() },
            "S.Positive" to { ChipGroupWide.S.Positive.style() },
            "S.Secondary" to { ChipGroupWide.S.Secondary.style() },
            "S.Warning" to { ChipGroupWide.S.Warning.style() },
            "S.Pilled.Default" to { ChipGroupWide.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { ChipGroupWide.S.Pilled.Accent.style() },
            "S.Pilled.Negative" to { ChipGroupWide.S.Pilled.Negative.style() },
            "S.Pilled.Positive" to { ChipGroupWide.S.Pilled.Positive.style() },
            "S.Pilled.Secondary" to { ChipGroupWide.S.Pilled.Secondary.style() },
            "S.Pilled.Warning" to { ChipGroupWide.S.Pilled.Warning.style() },
            "Xs.Default" to { ChipGroupWide.Xs.Default.style() },
            "Xs.Accent" to { ChipGroupWide.Xs.Accent.style() },
            "Xs.Negative" to { ChipGroupWide.Xs.Negative.style() },
            "Xs.Positive" to { ChipGroupWide.Xs.Positive.style() },
            "Xs.Secondary" to { ChipGroupWide.Xs.Secondary.style() },
            "Xs.Warning" to { ChipGroupWide.Xs.Warning.style() },
            "Xs.Pilled.Default" to { ChipGroupWide.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { ChipGroupWide.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Negative" to { ChipGroupWide.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Positive" to { ChipGroupWide.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Secondary" to { ChipGroupWide.Xs.Pilled.Secondary.style() },
            "Xs.Pilled.Warning" to { ChipGroupWide.Xs.Pilled.Warning.style() },
        )
}
