package com.sdds.playground.sandbox.plasma.stards.integration.dropdownmenu

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s
import com.sdds.uikit.colorstate.ColorState
import com.sdkit.star.designsystem.colorstate.ListItemViewColorState

internal object StarDsDropdownMenuVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState> = mapOf(
        "Default" to ListItemViewColorState.DEFAULT,
        "Positive" to ListItemViewColorState.POSITIVE,
        "Negative" to ListItemViewColorState.NEGATIVE,
    )

    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Sdkit_StarDs_ComponentOverlays_DropdownMenuL,
            "M" to s.Sdkit_StarDs_ComponentOverlays_DropdownMenuM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_DropdownMenuS,
            "Xs" to s.Sdkit_StarDs_ComponentOverlays_DropdownMenuXs,
        )
}
