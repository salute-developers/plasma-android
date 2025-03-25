package com.sdds.playground.sandbox.plasma.stards.integration.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.progressbar.Accent
import com.sdkit.star.designsystem.styles.progressbar.Default
import com.sdkit.star.designsystem.styles.progressbar.GradientAccent
import com.sdkit.star.designsystem.styles.progressbar.Info
import com.sdkit.star.designsystem.styles.progressbar.Negative
import com.sdkit.star.designsystem.styles.progressbar.Positive
import com.sdkit.star.designsystem.styles.progressbar.ProgressBar
import com.sdkit.star.designsystem.styles.progressbar.Secondary
import com.sdkit.star.designsystem.styles.progressbar.Warning

internal object StarDsProgressVariationsCompose : ComposeStyleProvider<String, ProgressBarStyle>() {
    override val variations: Map<String, @Composable () -> ProgressBarStyle> =
        mapOf(
            "Default" to { ProgressBar.Default.style() },
            "Secondary" to { ProgressBar.Secondary.style() },
            "Accent" to { ProgressBar.Accent.style() },
            "GradientAccent" to { ProgressBar.GradientAccent.style() },
            "Positive" to { ProgressBar.Positive.style() },
            "Warning" to { ProgressBar.Warning.style() },
            "Negative" to { ProgressBar.Negative.style() },
            "Info" to { ProgressBar.Info.style() },
        )
}
