// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.progressbar.Accent
import com.sdds.serv.styles.progressbar.Default
import com.sdds.serv.styles.progressbar.Gradient
import com.sdds.serv.styles.progressbar.Info
import com.sdds.serv.styles.progressbar.Negative
import com.sdds.serv.styles.progressbar.Positive
import com.sdds.serv.styles.progressbar.ProgressBar
import com.sdds.serv.styles.progressbar.Secondary
import com.sdds.serv.styles.progressbar.Warning

internal object SddsServProgressBarVariationsCompose : ComposeStyleProvider<ProgressBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<ProgressBarStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { ProgressBar.Default.style() },
            "Secondary" to ComposeStyleReference { ProgressBar.Secondary.style() },
            "Accent" to ComposeStyleReference { ProgressBar.Accent.style() },
            "Gradient" to ComposeStyleReference { ProgressBar.Gradient.style() },
            "Info" to ComposeStyleReference { ProgressBar.Info.style() },
            "Negative" to ComposeStyleReference { ProgressBar.Negative.style() },
            "Positive" to ComposeStyleReference { ProgressBar.Positive.style() },
            "Warning" to ComposeStyleReference { ProgressBar.Warning.style() },
        )
}
