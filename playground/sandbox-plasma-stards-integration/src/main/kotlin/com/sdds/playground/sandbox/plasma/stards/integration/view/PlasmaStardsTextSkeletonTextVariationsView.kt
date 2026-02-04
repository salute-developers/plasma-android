package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsTextSkeletonTextVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonTextL,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonTextM,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonTextS,
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonTextXs,
        )
}
