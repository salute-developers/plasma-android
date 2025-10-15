package com.sdds.playground.sandbox.plasma.stards.integration.button.basic

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsBasicButtonVariationsView : ViewStyleProvider<String>() {

    override val variations: Map<String, Int> =
        mapOf(
            "L.Default" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonLDefault,
            "L.Clear" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonLClear,
            "M.Default" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonMDefault,
            "M.Clear" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonMClear,
            "S.Default" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonSDefault,
            "S.Clear" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonSClear,
            "Xs.Default" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonXsDefault,
            "Xs.Clear" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonXsClear,
        )
}
