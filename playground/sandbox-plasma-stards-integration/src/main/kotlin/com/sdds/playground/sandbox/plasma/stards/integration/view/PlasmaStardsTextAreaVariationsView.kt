package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsTextAreaVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaXs,
            "Xs.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaXsOuterLabel,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaS,
            "S.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSOuterLabel,
            "S.InnerLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaSInnerLabel,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaM,
            "M.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMOuterLabel,
            "M.InnerLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextAreaMInnerLabel,
        )
}
