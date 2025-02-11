package com.sdds.playground.sandbox.plasma.sd.service.integration.avatar.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object PlasmaSdServiceAvatarGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "S" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_AvatarS,
        )
}