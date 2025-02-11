package com.sdds.playground.sandbox.stylessalute.integration.progress

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object StylesSaluteProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "Default" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarDefault,
            "Secondary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarSecondary,
            "Accent" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarAccent,
            "GradientAccent" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarGradientAccent,
            "Positive" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarPositive,
            "Warning" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarWarning,
            "Negative" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ProgressBarNegative,
        )
}
