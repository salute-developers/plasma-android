package com.sdds.playground.sandbox.stylessalute.integration.avatar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "S" to s.Salute_StylesSalute_ComponentOverlays_AvatarS,
        "M" to s.Salute_StylesSalute_ComponentOverlays_AvatarM,
        "L" to s.Salute_StylesSalute_ComponentOverlays_AvatarL,
        "Xxl" to s.Salute_StylesSalute_ComponentOverlays_AvatarXXL,
    )
}
