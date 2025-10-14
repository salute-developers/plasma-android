package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsAvatarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xxl" to DsR.style.Sdkit_StarDs_ComponentOverlays_AvatarXxl,
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_AvatarL,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_AvatarM,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_AvatarS,
        )
}
