package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.progressbar.Accent
import com.sdds.plasma.giga.styles.progressbar.Default
import com.sdds.plasma.giga.styles.progressbar.Gradient
import com.sdds.plasma.giga.styles.progressbar.Info
import com.sdds.plasma.giga.styles.progressbar.Negative
import com.sdds.plasma.giga.styles.progressbar.Positive
import com.sdds.plasma.giga.styles.progressbar.ProgressBar
import com.sdds.plasma.giga.styles.progressbar.Secondary
import com.sdds.plasma.giga.styles.progressbar.Warning
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaProgressBarVariationsCompose : ComposeStyleProvider<String, ProgressBarStyle>() {
    override val variations: Map<String, @Composable () -> ProgressBarStyle> =
        mapOf(
            "Default" to { ProgressBar.Default.style() },
            "Secondary" to { ProgressBar.Secondary.style() },
            "Accent" to { ProgressBar.Accent.style() },
            "Gradient" to { ProgressBar.Gradient.style() },
            "Info" to { ProgressBar.Info.style() },
            "Negative" to { ProgressBar.Negative.style() },
            "Positive" to { ProgressBar.Positive.style() },
            "Warning" to { ProgressBar.Warning.style() },
        )
}
