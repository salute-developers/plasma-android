package com.sdds.playground.sandbox.plasma.sd.service.integration.avatar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object PlasmaSdServiceAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "S" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_AvatarS,
            "M" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_AvatarM,
            "L" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_AvatarL,
            "Xxl" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_AvatarXXL,
        )
}