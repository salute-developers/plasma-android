package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xxl" to DsR.style.Salute_StylesSalute_ComponentOverlays_AvatarXxl,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_AvatarL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_AvatarM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_AvatarS,
        )
}
