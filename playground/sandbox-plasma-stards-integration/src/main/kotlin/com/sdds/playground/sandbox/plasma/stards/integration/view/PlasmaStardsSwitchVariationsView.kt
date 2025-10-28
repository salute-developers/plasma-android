package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_SwitchL,
            "L.HasBackground" to DsR.style.Sdkit_StarDs_ComponentOverlays_SwitchLHasBackground,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_SwitchM,
            "M.HasBackground" to DsR.style.Sdkit_StarDs_ComponentOverlays_SwitchMHasBackground,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_SwitchS,
            "S.HasBackground" to DsR.style.Sdkit_StarDs_ComponentOverlays_SwitchSHasBackground,
        )
}
