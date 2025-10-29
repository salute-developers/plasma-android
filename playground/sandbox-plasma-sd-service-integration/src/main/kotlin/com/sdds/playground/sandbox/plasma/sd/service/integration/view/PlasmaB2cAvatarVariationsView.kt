package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xxl" to DsR.style.Plasma_SdService_ComponentOverlays_AvatarXxl,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AvatarL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AvatarM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AvatarS,
        )
}
