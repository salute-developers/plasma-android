package com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object PlasmaSdServiceChipGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "Wide" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipGroupWide,
            "Dense" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipGroupDense,
        )
}
