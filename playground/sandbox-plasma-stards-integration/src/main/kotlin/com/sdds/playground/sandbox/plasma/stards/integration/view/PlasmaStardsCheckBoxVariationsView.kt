package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_CheckBoxL,
            "L.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_CheckBoxLDefault,
            "L.Negative" to DsR.style.Sdkit_StarDs_ComponentOverlays_CheckBoxLNegative,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_CheckBoxM,
            "M.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_CheckBoxMDefault,
            "M.Negative" to DsR.style.Sdkit_StarDs_ComponentOverlays_CheckBoxMNegative,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_CheckBoxS,
            "S.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_CheckBoxSDefault,
            "S.Negative" to DsR.style.Sdkit_StarDs_ComponentOverlays_CheckBoxSNegative,
        )
}
