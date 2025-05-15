package com.sdds.playground.sandbox.stylessalute.integration.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.progressbar.Accent
import com.sdds.stylessalute.styles.progressbar.Default
import com.sdds.stylessalute.styles.progressbar.Gradient
import com.sdds.stylessalute.styles.progressbar.Negative
import com.sdds.stylessalute.styles.progressbar.Positive
import com.sdds.stylessalute.styles.progressbar.ProgressBar
import com.sdds.stylessalute.styles.progressbar.Secondary
import com.sdds.stylessalute.styles.progressbar.Warning

internal object StylesSaluteProgressVariationsCompose :
    ComposeStyleProvider<String, ProgressBarStyle>() {
    override val variations: Map<String, @Composable () -> ProgressBarStyle> = mapOf(
        "Default" to { ProgressBar.Default.style() },
        "Secondary" to { ProgressBar.Secondary.style() },
        "Accent" to { ProgressBar.Accent.style() },
        "GradientAccent" to { ProgressBar.Gradient.style() },
        "Positive" to { ProgressBar.Positive.style() },
        "Warning" to { ProgressBar.Warning.style() },
        "Negative" to { ProgressBar.Negative.style() },
    )
}
