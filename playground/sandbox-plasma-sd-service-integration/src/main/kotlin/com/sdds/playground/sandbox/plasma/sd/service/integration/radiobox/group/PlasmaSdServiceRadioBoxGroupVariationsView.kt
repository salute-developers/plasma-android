package com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object PlasmaSdServiceRadioBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_RadioBoxGroupM,
            "S" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_RadioBoxGroupS,
        )
}
