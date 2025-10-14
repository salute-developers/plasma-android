package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsImageViewVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Ratio12" to DsR.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_1_2,
            "Ratio916" to DsR.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_9_16,
            "Ratio34" to DsR.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_3_4,
            "Ratio21" to DsR.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_2_1,
            "Ratio169" to DsR.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_16_9,
            "Ratio43" to DsR.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_4_3,
            "Ratio11" to DsR.style.Sdkit_StarDs_ComponentOverlays_ImageViewRatio_1_1,
        )
}
