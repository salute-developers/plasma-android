package com.sdds.playground.sandbox.stylessalute.integration.avatar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object StylesSaluteAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_AvatarS,
            "M" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_AvatarM,
            "L" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_AvatarL,
            "Xxl" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_AvatarXXL,
        )
}