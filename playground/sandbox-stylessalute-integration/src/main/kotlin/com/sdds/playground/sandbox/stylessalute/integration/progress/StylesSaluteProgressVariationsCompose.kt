package com.sdds.playground.sandbox.stylessalute.integration.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.progress.Accent
import com.sdds.stylessalute.styles.progress.Default
import com.sdds.stylessalute.styles.progress.GradientAccent
import com.sdds.stylessalute.styles.progress.Negative
import com.sdds.stylessalute.styles.progress.Positive
import com.sdds.stylessalute.styles.progress.ProgressBar
import com.sdds.stylessalute.styles.progress.Secondary
import com.sdds.stylessalute.styles.progress.Warning

internal object StylesSaluteProgressVariationsCompose :
    ComposeStyleProvider<String, ProgressBarStyle>() {
    override val variations: Map<String, @Composable () -> ProgressBarStyle> = mapOf(
        "Default" to { ProgressBar.Default.style() },
        "Secondary" to { ProgressBar.Secondary.style() },
        "Accent" to { ProgressBar.Accent.style() },
        "GradientAccent" to { ProgressBar.GradientAccent.style() },
        "Positive" to { ProgressBar.Positive.style() },
        "Warning" to { ProgressBar.Warning.style() },
        "Negative" to { ProgressBar.Negative.style() },
    )
}
