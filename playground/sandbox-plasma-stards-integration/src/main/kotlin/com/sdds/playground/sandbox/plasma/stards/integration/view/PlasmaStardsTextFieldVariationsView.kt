package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsTextFieldVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldXs,
            "Xs.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldXsOuterLabel,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldS,
            "S.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSOuterLabel,
            "S.InnerLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldSInnerLabel,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldM,
            "M.OuterLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabel,
            "M.InnerLabel" to DsR.style.Sdkit_StarDs_ComponentOverlays_TextFieldMInnerLabel,
        )
}
