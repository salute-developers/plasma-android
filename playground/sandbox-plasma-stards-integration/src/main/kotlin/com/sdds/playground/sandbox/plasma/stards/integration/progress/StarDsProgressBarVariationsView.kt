package com.sdds.playground.sandbox.plasma.stards.integration.progress

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to s.Sdkit_StarDs_ComponentOverlays_ProgressBarDefault,
            "Secondary" to s.Sdkit_StarDs_ComponentOverlays_ProgressBarSecondary,
            "Accent" to s.Sdkit_StarDs_ComponentOverlays_ProgressBarAccent,
            "GradientAccent" to s.Sdkit_StarDs_ComponentOverlays_ProgressBarGradientAccent,
            "Positive" to s.Sdkit_StarDs_ComponentOverlays_ProgressBarPositive,
            "Warning" to s.Sdkit_StarDs_ComponentOverlays_ProgressBarWarning,
            "Negative" to s.Sdkit_StarDs_ComponentOverlays_ProgressBarNegative,
            "Info" to s.Sdkit_StarDs_ComponentOverlays_ProgressBarInfo,
        )
}
