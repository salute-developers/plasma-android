package com.sdds.playground.sandbox.plasma.sd.service.integration.progress

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to s.Plasma_SdService_ComponentOverlays_ProgressBarDefault,
            "Secondary" to s.Plasma_SdService_ComponentOverlays_ProgressBarSecondary,
            "Accent" to s.Plasma_SdService_ComponentOverlays_ProgressBarAccent,
            "GradientAccent" to s.Plasma_SdService_ComponentOverlays_ProgressBarGradientAccent,
            "Positive" to s.Plasma_SdService_ComponentOverlays_ProgressBarPositive,
            "Warning" to s.Plasma_SdService_ComponentOverlays_ProgressBarWarning,
            "Negative" to s.Plasma_SdService_ComponentOverlays_ProgressBarNegative,
        )
}
