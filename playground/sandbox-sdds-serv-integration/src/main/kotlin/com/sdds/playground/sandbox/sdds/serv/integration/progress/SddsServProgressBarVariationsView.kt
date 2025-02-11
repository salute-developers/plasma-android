package com.sdds.playground.sandbox.sdds.serv.integration.progress

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to s.Serv_Sdds_ComponentOverlays_ProgressBarDefault,
            "Secondary" to s.Serv_Sdds_ComponentOverlays_ProgressBarSecondary,
            "Accent" to s.Serv_Sdds_ComponentOverlays_ProgressBarAccent,
            "GradientAccent" to s.Serv_Sdds_ComponentOverlays_ProgressBarGradientAccent,
            "Positive" to s.Serv_Sdds_ComponentOverlays_ProgressBarPositive,
            "Warning" to s.Serv_Sdds_ComponentOverlays_ProgressBarWarning,
            "Negative" to s.Serv_Sdds_ComponentOverlays_ProgressBarNegative,
        )
}
