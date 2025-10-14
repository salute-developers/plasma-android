package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.chipgroup.Accent
import com.sdds.plasma.giga.app.styles.chipgroup.Default
import com.sdds.plasma.giga.app.styles.chipgroup.EmbeddedChipGroupDense
import com.sdds.plasma.giga.app.styles.chipgroup.L
import com.sdds.plasma.giga.app.styles.chipgroup.M
import com.sdds.plasma.giga.app.styles.chipgroup.Negative
import com.sdds.plasma.giga.app.styles.chipgroup.Positive
import com.sdds.plasma.giga.app.styles.chipgroup.S
import com.sdds.plasma.giga.app.styles.chipgroup.Secondary
import com.sdds.plasma.giga.app.styles.chipgroup.Warning
import com.sdds.plasma.giga.app.styles.chipgroup.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppEmbeddedChipGroupDenseVariationsCompose : ComposeStyleProvider<String, ChipGroupStyle>() {
    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "L.Default" to { EmbeddedChipGroupDense.L.Default.style() },
            "L.Accent" to { EmbeddedChipGroupDense.L.Accent.style() },
            "L.Negative" to { EmbeddedChipGroupDense.L.Negative.style() },
            "L.Positive" to { EmbeddedChipGroupDense.L.Positive.style() },
            "L.Secondary" to { EmbeddedChipGroupDense.L.Secondary.style() },
            "L.Warning" to { EmbeddedChipGroupDense.L.Warning.style() },
            "M.Default" to { EmbeddedChipGroupDense.M.Default.style() },
            "M.Accent" to { EmbeddedChipGroupDense.M.Accent.style() },
            "M.Negative" to { EmbeddedChipGroupDense.M.Negative.style() },
            "M.Positive" to { EmbeddedChipGroupDense.M.Positive.style() },
            "M.Secondary" to { EmbeddedChipGroupDense.M.Secondary.style() },
            "M.Warning" to { EmbeddedChipGroupDense.M.Warning.style() },
            "S.Default" to { EmbeddedChipGroupDense.S.Default.style() },
            "S.Accent" to { EmbeddedChipGroupDense.S.Accent.style() },
            "S.Negative" to { EmbeddedChipGroupDense.S.Negative.style() },
            "S.Positive" to { EmbeddedChipGroupDense.S.Positive.style() },
            "S.Secondary" to { EmbeddedChipGroupDense.S.Secondary.style() },
            "S.Warning" to { EmbeddedChipGroupDense.S.Warning.style() },
            "Xs.Default" to { EmbeddedChipGroupDense.Xs.Default.style() },
            "Xs.Accent" to { EmbeddedChipGroupDense.Xs.Accent.style() },
            "Xs.Negative" to { EmbeddedChipGroupDense.Xs.Negative.style() },
            "Xs.Positive" to { EmbeddedChipGroupDense.Xs.Positive.style() },
            "Xs.Secondary" to { EmbeddedChipGroupDense.Xs.Secondary.style() },
            "Xs.Warning" to { EmbeddedChipGroupDense.Xs.Warning.style() },
        )
}
