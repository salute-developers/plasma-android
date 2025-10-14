package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            ".Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_ProgressBarDefault,
            ".Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_ProgressBarSecondary,
            ".Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_ProgressBarAccent,
            ".Gradient" to DsR.style.Salute_StylesSalute_ComponentOverlays_ProgressBarGradient,
            ".Negative" to DsR.style.Salute_StylesSalute_ComponentOverlays_ProgressBarNegative,
            ".Positive" to DsR.style.Salute_StylesSalute_ComponentOverlays_ProgressBarPositive,
            ".Warning" to DsR.style.Salute_StylesSalute_ComponentOverlays_ProgressBarWarning,
        )
}
