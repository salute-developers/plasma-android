package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsCodeInputVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_CodeInputS,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_CodeInputM,
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_CodeInputL,
        )
}
