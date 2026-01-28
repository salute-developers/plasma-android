package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsTextSkeletonHeaderVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "H1" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH1,
            "H2" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH2,
            "H3" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH3,
            "H4" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH4,
            "H5" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextSkeletonHeaderH5,
        )
}
