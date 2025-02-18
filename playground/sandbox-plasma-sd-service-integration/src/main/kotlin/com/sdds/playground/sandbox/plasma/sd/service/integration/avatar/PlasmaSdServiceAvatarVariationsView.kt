package com.sdds.playground.sandbox.plasma.sd.service.integration.avatar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to s.Plasma_SdService_ComponentOverlays_AvatarS,
            "M" to s.Plasma_SdService_ComponentOverlays_AvatarM,
            "L" to s.Plasma_SdService_ComponentOverlays_AvatarL,
            "Xxl" to s.Plasma_SdService_ComponentOverlays_AvatarXXL,
        )
}
