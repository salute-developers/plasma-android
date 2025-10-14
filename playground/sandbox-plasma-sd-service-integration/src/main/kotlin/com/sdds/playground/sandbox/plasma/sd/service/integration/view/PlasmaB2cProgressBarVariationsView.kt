package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            ".Default" to DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarDefault,
            ".Secondary" to DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarSecondary,
            ".Accent" to DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarAccent,
            ".Gradient" to DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarGradient,
            ".Info" to DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarInfo,
            ".Negative" to DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarNegative,
            ".Positive" to DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarPositive,
            ".Warning" to DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarWarning,
        )
}
