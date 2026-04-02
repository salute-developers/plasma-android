// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.progressbar.Accent
import com.sdkit.star.designsystem.styles.progressbar.Default
import com.sdkit.star.designsystem.styles.progressbar.Gradient
import com.sdkit.star.designsystem.styles.progressbar.Info
import com.sdkit.star.designsystem.styles.progressbar.Negative
import com.sdkit.star.designsystem.styles.progressbar.Positive
import com.sdkit.star.designsystem.styles.progressbar.ProgressBar
import com.sdkit.star.designsystem.styles.progressbar.Secondary
import com.sdkit.star.designsystem.styles.progressbar.Warning

internal object PlasmaStardsProgressBarVariationsCompose : ComposeStyleProvider<ProgressBarStyle>() {
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
