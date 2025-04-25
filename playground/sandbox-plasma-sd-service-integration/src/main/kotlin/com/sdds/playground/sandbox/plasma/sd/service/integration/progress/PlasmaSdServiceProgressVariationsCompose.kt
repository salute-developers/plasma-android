package com.sdds.playground.sandbox.plasma.sd.service.integration.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.progressbar.Accent
import com.sdds.plasma.sd.service.styles.progressbar.Default
import com.sdds.plasma.sd.service.styles.progressbar.Gradient
import com.sdds.plasma.sd.service.styles.progressbar.Info
import com.sdds.plasma.sd.service.styles.progressbar.Negative
import com.sdds.plasma.sd.service.styles.progressbar.Positive
import com.sdds.plasma.sd.service.styles.progressbar.ProgressBar
import com.sdds.plasma.sd.service.styles.progressbar.Secondary
import com.sdds.plasma.sd.service.styles.progressbar.Warning
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceProgressVariationsCompose :
    ComposeStyleProvider<String, ProgressBarStyle>() {
    override val variations: Map<String, @Composable () -> ProgressBarStyle> =
        mapOf(
            "Default" to { ProgressBar.Default.style() },
            "Secondary" to { ProgressBar.Secondary.style() },
            "Accent" to { ProgressBar.Accent.style() },
            "GradientAccent" to { ProgressBar.Gradient.style() },
            "Positive" to { ProgressBar.Positive.style() },
            "Warning" to { ProgressBar.Warning.style() },
            "Negative" to { ProgressBar.Negative.style() },
            "Info" to { ProgressBar.Info.style() },
        )
}
