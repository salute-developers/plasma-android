package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.progressbar.Accent
import com.sdds.serv.styles.progressbar.Default
import com.sdds.serv.styles.progressbar.Gradient
import com.sdds.serv.styles.progressbar.Info
import com.sdds.serv.styles.progressbar.Negative
import com.sdds.serv.styles.progressbar.Positive
import com.sdds.serv.styles.progressbar.ProgressBar
import com.sdds.serv.styles.progressbar.Secondary
import com.sdds.serv.styles.progressbar.Warning

internal object SddsServProgressBarVariationsCompose : ComposeStyleProvider<String, ProgressBarStyle>() {
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
