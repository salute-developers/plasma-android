package com.sdds.playground.sandbox.stylessalute.integration.progress

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "Default" to s.Salute_StylesSalute_ComponentOverlays_ProgressBarDefault,
        "Secondary" to s.Salute_StylesSalute_ComponentOverlays_ProgressBarSecondary,
        "Accent" to s.Salute_StylesSalute_ComponentOverlays_ProgressBarAccent,
        "GradientAccent" to s.Salute_StylesSalute_ComponentOverlays_ProgressBarGradientAccent,
        "Positive" to s.Salute_StylesSalute_ComponentOverlays_ProgressBarPositive,
        "Warning" to s.Salute_StylesSalute_ComponentOverlays_ProgressBarWarning,
        "Negative" to s.Salute_StylesSalute_ComponentOverlays_ProgressBarNegative,
    )
}
