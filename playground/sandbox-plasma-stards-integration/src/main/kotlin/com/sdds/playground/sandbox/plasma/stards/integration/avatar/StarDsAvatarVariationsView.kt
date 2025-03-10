package com.sdds.playground.sandbox.plasma.stards.integration.avatar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to s.Sdkit_StarDs_ComponentOverlays_AvatarS,
            "M" to s.Sdkit_StarDs_ComponentOverlays_AvatarM,
            "L" to s.Sdkit_StarDs_ComponentOverlays_AvatarL,
            "Xxl" to s.Sdkit_StarDs_ComponentOverlays_AvatarXXL,
        )
}
