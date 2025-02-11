package com.sdds.playground.sandbox.plasma.sd.service.integration.progress

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object PlasmaSdServiceProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "Default" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ProgressBarDefault,
            "Secondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ProgressBarSecondary,
            "Accent" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ProgressBarAccent,
            "GradientAccent" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ProgressBarGradientAccent,
            "Positive" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ProgressBarPositive,
            "Warning" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ProgressBarWarning,
            "Negative" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ProgressBarNegative,
        )
}
