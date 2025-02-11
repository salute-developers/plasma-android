package com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object PlasmaSdServiceRadioBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_RadioBoxM,
            "S" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_RadioBoxS,
        )
}
