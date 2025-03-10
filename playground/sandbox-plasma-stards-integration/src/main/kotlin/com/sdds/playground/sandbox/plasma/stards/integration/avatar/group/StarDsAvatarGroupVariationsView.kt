package com.sdds.playground.sandbox.plasma.stards.integration.avatar.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsAvatarGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to s.Sdkit_StarDs_ComponentOverlays_AvatarS,
        )
}
