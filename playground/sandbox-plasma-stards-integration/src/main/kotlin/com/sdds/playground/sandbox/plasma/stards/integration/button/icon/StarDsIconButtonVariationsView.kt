package com.sdds.playground.sandbox.plasma.stards.integration.button.icon

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsIconButtonVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Sdkit_StarDs_ComponentOverlays_IconButtonL,
            "LPilled" to s.Sdkit_StarDs_ComponentOverlays_IconButtonLPilled,
            "M" to s.Sdkit_StarDs_ComponentOverlays_IconButtonM,
            "MPilled" to s.Sdkit_StarDs_ComponentOverlays_IconButtonMPilled,
            "S" to s.Sdkit_StarDs_ComponentOverlays_IconButtonS,
            "SPilled" to s.Sdkit_StarDs_ComponentOverlays_IconButtonSPilled,
            "Xs" to s.Sdkit_StarDs_ComponentOverlays_IconButtonXs,
            "XsPilled" to s.Sdkit_StarDs_ComponentOverlays_IconButtonXsPilled,
        )
}
