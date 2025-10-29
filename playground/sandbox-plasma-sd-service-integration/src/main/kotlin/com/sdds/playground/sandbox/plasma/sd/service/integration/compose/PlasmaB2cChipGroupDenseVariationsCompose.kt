package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.chipgroup.Accent
import com.sdds.plasma.sd.service.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.sd.service.styles.chipgroup.Default
import com.sdds.plasma.sd.service.styles.chipgroup.L
import com.sdds.plasma.sd.service.styles.chipgroup.M
import com.sdds.plasma.sd.service.styles.chipgroup.Negative
import com.sdds.plasma.sd.service.styles.chipgroup.Pilled
import com.sdds.plasma.sd.service.styles.chipgroup.Positive
import com.sdds.plasma.sd.service.styles.chipgroup.S
import com.sdds.plasma.sd.service.styles.chipgroup.Secondary
import com.sdds.plasma.sd.service.styles.chipgroup.Warning
import com.sdds.plasma.sd.service.styles.chipgroup.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cChipGroupDenseVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { ChipGroupDense.L.Default.style() },
            "L.Accent" to { ChipGroupDense.L.Accent.style() },
            "L.Negative" to { ChipGroupDense.L.Negative.style() },
            "L.Positive" to { ChipGroupDense.L.Positive.style() },
            "L.Secondary" to { ChipGroupDense.L.Secondary.style() },
            "L.Warning" to { ChipGroupDense.L.Warning.style() },
            "L.Pilled.Default" to { ChipGroupDense.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { ChipGroupDense.L.Pilled.Accent.style() },
            "L.Pilled.Negative" to { ChipGroupDense.L.Pilled.Negative.style() },
            "L.Pilled.Positive" to { ChipGroupDense.L.Pilled.Positive.style() },
            "L.Pilled.Secondary" to { ChipGroupDense.L.Pilled.Secondary.style() },
            "L.Pilled.Warning" to { ChipGroupDense.L.Pilled.Warning.style() },
            "M.Default" to { ChipGroupDense.M.Default.style() },
            "M.Accent" to { ChipGroupDense.M.Accent.style() },
            "M.Negative" to { ChipGroupDense.M.Negative.style() },
            "M.Positive" to { ChipGroupDense.M.Positive.style() },
            "M.Secondary" to { ChipGroupDense.M.Secondary.style() },
            "M.Warning" to { ChipGroupDense.M.Warning.style() },
            "M.Pilled.Default" to { ChipGroupDense.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { ChipGroupDense.M.Pilled.Accent.style() },
            "M.Pilled.Negative" to { ChipGroupDense.M.Pilled.Negative.style() },
            "M.Pilled.Positive" to { ChipGroupDense.M.Pilled.Positive.style() },
            "M.Pilled.Secondary" to { ChipGroupDense.M.Pilled.Secondary.style() },
            "M.Pilled.Warning" to { ChipGroupDense.M.Pilled.Warning.style() },
            "S.Default" to { ChipGroupDense.S.Default.style() },
            "S.Accent" to { ChipGroupDense.S.Accent.style() },
            "S.Negative" to { ChipGroupDense.S.Negative.style() },
            "S.Positive" to { ChipGroupDense.S.Positive.style() },
            "S.Secondary" to { ChipGroupDense.S.Secondary.style() },
            "S.Warning" to { ChipGroupDense.S.Warning.style() },
            "S.Pilled.Default" to { ChipGroupDense.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { ChipGroupDense.S.Pilled.Accent.style() },
            "S.Pilled.Negative" to { ChipGroupDense.S.Pilled.Negative.style() },
            "S.Pilled.Positive" to { ChipGroupDense.S.Pilled.Positive.style() },
            "S.Pilled.Secondary" to { ChipGroupDense.S.Pilled.Secondary.style() },
            "S.Pilled.Warning" to { ChipGroupDense.S.Pilled.Warning.style() },
            "Xs.Default" to { ChipGroupDense.Xs.Default.style() },
            "Xs.Accent" to { ChipGroupDense.Xs.Accent.style() },
            "Xs.Negative" to { ChipGroupDense.Xs.Negative.style() },
            "Xs.Positive" to { ChipGroupDense.Xs.Positive.style() },
            "Xs.Secondary" to { ChipGroupDense.Xs.Secondary.style() },
            "Xs.Warning" to { ChipGroupDense.Xs.Warning.style() },
            "Xs.Pilled.Default" to { ChipGroupDense.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { ChipGroupDense.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Negative" to { ChipGroupDense.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Positive" to { ChipGroupDense.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Secondary" to { ChipGroupDense.Xs.Pilled.Secondary.style() },
            "Xs.Pilled.Warning" to { ChipGroupDense.Xs.Pilled.Warning.style() },
        )
}
