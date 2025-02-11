package com.sdds.playground.sandbox.plasma.sd.service.integration.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.plasma.sd.service.styles.progress.Accent
import com.sdds.plasma.sd.service.styles.progress.Default
import com.sdds.plasma.sd.service.styles.progress.GradientAccent
import com.sdds.plasma.sd.service.styles.progress.Negative
import com.sdds.plasma.sd.service.styles.progress.Positive
import com.sdds.plasma.sd.service.styles.progress.Secondary
import com.sdds.plasma.sd.service.styles.progress.Warning

internal object PlasmaSdServiceProgressVariationsCompose :
    ComposeStyleProvider<String, ProgressBarStyle>() {
    override val variations: Map<String, @Composable () -> ProgressBarStyle>
        get() = mapOf(
            "Default" to { ProgressBar.Default.style() },
            "Secondary" to { ProgressBar.Secondary.style() },
            "Accent" to { ProgressBar.Accent.style() },
            "GradientAccent" to { ProgressBar.GradientAccent.style() },
            "Positive" to { ProgressBar.Positive.style() },
            "Warning" to { ProgressBar.Warning.style() },
            "Negative" to { ProgressBar.Negative.style() },
        )
}
