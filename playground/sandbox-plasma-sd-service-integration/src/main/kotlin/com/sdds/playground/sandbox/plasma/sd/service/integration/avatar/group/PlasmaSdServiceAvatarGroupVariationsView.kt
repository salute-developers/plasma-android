package com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceAvatarGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to s.Plasma_SdService_ComponentOverlays_AvatarS,
        )
}
