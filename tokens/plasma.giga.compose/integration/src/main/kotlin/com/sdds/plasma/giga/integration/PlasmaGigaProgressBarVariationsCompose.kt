// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
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
import com.sdds.plasma.giga.styles.progressbar.ProgressBarStyles
import com.sdds.plasma.giga.styles.progressbar.ProgressBarView
import com.sdds.plasma.giga.styles.progressbar.Secondary
import com.sdds.plasma.giga.styles.progressbar.Warning
import com.sdds.plasma.giga.styles.progressbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaProgressBarVariationsCompose : ComposeStyleProvider<ProgressBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf(
                    "Default",
                    "Secondary",
                    "Accent",
                    "Gradient",
                    "Info",
                    "Negative",
                    "Positive",
                    "Warning",
                ),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ProgressBarStyle>> =
        mapOf(
            "ProgressBar.Default" to ComposeStyleReference { ProgressBar.Default.style() },
            "ProgressBar.Secondary" to ComposeStyleReference { ProgressBar.Secondary.style() },
            "ProgressBar.Accent" to ComposeStyleReference { ProgressBar.Accent.style() },
            "ProgressBar.Gradient" to ComposeStyleReference { ProgressBar.Gradient.style() },
            "ProgressBar.Info" to ComposeStyleReference { ProgressBar.Info.style() },
            "ProgressBar.Negative" to ComposeStyleReference { ProgressBar.Negative.style() },
            "ProgressBar.Positive" to ComposeStyleReference { ProgressBar.Positive.style() },
            "ProgressBar.Warning" to ComposeStyleReference { ProgressBar.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ProgressBarStyles.resolve(
            view = when (bindings["view"]?.toString()) {
                "Default" -> ProgressBarView.Default
                "Secondary" -> ProgressBarView.Secondary
                "Accent" -> ProgressBarView.Accent
                "Gradient" -> ProgressBarView.Gradient
                "Info" -> ProgressBarView.Info
                "Negative" -> ProgressBarView.Negative
                "Positive" -> ProgressBarView.Positive
                "Warning" -> ProgressBarView.Warning
                else -> ProgressBarView.Default
            },
        ).key
    }
}
