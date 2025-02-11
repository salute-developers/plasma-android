package com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object PlasmaSdServiceCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_CheckBoxM,
            "S" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_CheckBoxS,
        )
}
