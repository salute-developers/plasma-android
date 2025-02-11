package com.sdds.playground.sandbox.plasma.sd.service.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object PlasmaSdServiceSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SwitchL,
            "M" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SwitchM,
            "S" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SwitchS,
        )
}
