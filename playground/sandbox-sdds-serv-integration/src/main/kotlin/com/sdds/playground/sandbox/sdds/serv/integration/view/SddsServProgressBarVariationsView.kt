package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            ".Default" to DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarDefault,
            ".Secondary" to DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarSecondary,
            ".Accent" to DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarAccent,
            ".Gradient" to DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarGradient,
            ".Info" to DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarInfo,
            ".Negative" to DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarNegative,
            ".Positive" to DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarPositive,
            ".Warning" to DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarWarning,
        )
}
