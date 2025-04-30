package com.sdds.playground.sandbox.plasma.stards.integration.checkbox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Sdkit_StarDs_ComponentOverlays_CheckBoxL,
            "M" to s.Sdkit_StarDs_ComponentOverlays_CheckBoxM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_CheckBoxS,

            "LNegative" to s.Sdkit_StarDs_ComponentOverlays_CheckBoxLNegative,
            "MNegative" to s.Sdkit_StarDs_ComponentOverlays_CheckBoxMNegative,
            "SNegative" to s.Sdkit_StarDs_ComponentOverlays_CheckBoxSNegative,
        )
}
