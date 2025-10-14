package com.sdds.playground.sandbox.plasma.stards.integration.button.icon

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsIconButtonVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L.Default" to s.Sdkit_StarDs_ComponentOverlays_IconButtonLDefault,
            "L.Clear" to s.Sdkit_StarDs_ComponentOverlays_IconButtonLClear,
            "L.Pilled.Default" to s.Sdkit_StarDs_ComponentOverlays_IconButtonLPilledDefault,
            "L.Pilled.Clear" to s.Sdkit_StarDs_ComponentOverlays_IconButtonLPilledClear,
            "M.Default" to s.Sdkit_StarDs_ComponentOverlays_IconButtonMDefault,
            "M.Clear" to s.Sdkit_StarDs_ComponentOverlays_IconButtonMClear,
            "M.Pilled.Default" to s.Sdkit_StarDs_ComponentOverlays_IconButtonMPilledDefault,
            "M.Pilled.Clear" to s.Sdkit_StarDs_ComponentOverlays_IconButtonMPilledClear,
            "S.Default" to s.Sdkit_StarDs_ComponentOverlays_IconButtonSDefault,
            "S.Clear" to s.Sdkit_StarDs_ComponentOverlays_IconButtonSClear,
            "S.Pilled.Default" to s.Sdkit_StarDs_ComponentOverlays_IconButtonSPilledDefault,
            "S.Pilled.Clear" to s.Sdkit_StarDs_ComponentOverlays_IconButtonSPilledClear,
            "Xs.Default" to s.Sdkit_StarDs_ComponentOverlays_IconButtonXsDefault,
            "Xs.Clear" to s.Sdkit_StarDs_ComponentOverlays_IconButtonXsClear,
            "Xs.Pilled.Default" to s.Sdkit_StarDs_ComponentOverlays_IconButtonXsPilledDefault,
            "Xs.Pilled.Clear" to s.Sdkit_StarDs_ComponentOverlays_IconButtonXsPilledClear,
        )
}
