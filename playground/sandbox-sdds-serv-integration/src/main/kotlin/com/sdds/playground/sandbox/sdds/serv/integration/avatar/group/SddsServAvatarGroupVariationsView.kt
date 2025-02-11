package com.sdds.playground.sandbox.sdds.serv.integration.avatar.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServAvatarGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_AvatarS,
        )
}