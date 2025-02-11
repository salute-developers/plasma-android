package com.sdds.playground.sandbox.sdds.serv.integration.progress

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object SddsServProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "Default" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ProgressBarDefault,
            "Secondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ProgressBarSecondary,
            "Accent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ProgressBarAccent,
            "GradientAccent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ProgressBarGradientAccent,
            "Positive" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ProgressBarPositive,
            "Warning" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ProgressBarWarning,
            "Negative" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ProgressBarNegative,
        )
}
