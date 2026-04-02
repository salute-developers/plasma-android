// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
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

internal object PlasmaGigaProgressBarVariationsCompose : ComposeStyleProvider<ProgressBarStyle>() {
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
