package com.sdds.playground.sandbox.sdds.serv.integration.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.progress.Accent
import com.sdds.serv.styles.progress.Default
import com.sdds.serv.styles.progress.GradientAccent
import com.sdds.serv.styles.progress.Negative
import com.sdds.serv.styles.progress.Positive
import com.sdds.serv.styles.progress.Secondary
import com.sdds.serv.styles.progress.Warning

internal object SddsServProgressVariationsCompose :
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
