package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsCardVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Horizontal" to DsR.style.Sdkit_StarDs_ComponentOverlays_CardHorizontal,
            "Horizontal.S" to DsR.style.Sdkit_StarDs_ComponentOverlays_CardHorizontalS,
            "Horizontal.Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_CardHorizontalXs,
            "Vertical" to DsR.style.Sdkit_StarDs_ComponentOverlays_CardVertical,
            "Vertical.M" to DsR.style.Sdkit_StarDs_ComponentOverlays_CardVerticalM,
            "Vertical.S" to DsR.style.Sdkit_StarDs_ComponentOverlays_CardVerticalS,
            "Square" to DsR.style.Sdkit_StarDs_ComponentOverlays_CardSquare,
            "Square.L" to DsR.style.Sdkit_StarDs_ComponentOverlays_CardSquareL,
            "Square.Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_CardSquareXs,
        )
}
