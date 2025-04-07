package com.sdds.playground.sandbox.sdds.serv.integration.avatar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to s.Serv_Sdds_ComponentOverlays_AvatarS,
            "M" to s.Serv_Sdds_ComponentOverlays_AvatarM,
            "L" to s.Serv_Sdds_ComponentOverlays_AvatarL,
            "Xxl" to s.Serv_Sdds_ComponentOverlays_AvatarXxl,
        )
}
