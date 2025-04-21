package com.sdds.playground.sandbox.sdds.serv.integration.avatar.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServAvatarGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to s.Serv_Sdds_ComponentOverlays_AvatarGroupS,
        )
}
