package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xxl" to DsR.style.Serv_Sdds_ComponentOverlays_AvatarXxl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AvatarL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AvatarM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AvatarS,
        )
}
