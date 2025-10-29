package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsBasicButtonVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonL,
            "L.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonLDefault,
            "L.Clear" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonLClear,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonM,
            "M.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonMDefault,
            "M.Clear" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonMClear,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonS,
            "S.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonSDefault,
            "S.Clear" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonSClear,
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonXs,
            "Xs.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonXsDefault,
            "Xs.Clear" to DsR.style.Sdkit_StarDs_ComponentOverlays_BasicButtonXsClear,
        )
}
