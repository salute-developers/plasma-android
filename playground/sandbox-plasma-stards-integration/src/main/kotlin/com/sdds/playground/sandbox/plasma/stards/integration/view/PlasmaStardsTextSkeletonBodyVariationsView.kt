package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsTextSkeletonBodyVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyL,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyM,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyS,
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyXs,
            "Xxs" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonBodyXxs,
        )
}
