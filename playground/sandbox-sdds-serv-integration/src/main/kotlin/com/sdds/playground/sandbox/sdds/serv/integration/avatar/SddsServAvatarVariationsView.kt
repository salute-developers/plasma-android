package com.sdds.playground.sandbox.sdds.serv.integration.avatar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_AvatarS,
            "M" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_AvatarM,
            "L" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_AvatarL,
            "Xxl" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_AvatarXXL,
        )
}