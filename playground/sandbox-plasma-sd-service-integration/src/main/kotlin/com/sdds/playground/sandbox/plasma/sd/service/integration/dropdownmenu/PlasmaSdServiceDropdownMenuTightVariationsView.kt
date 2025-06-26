package com.sdds.playground.sandbox.plasma.sd.service.integration.dropdownmenu

import com.sdds.plasma.sd.service.colorstate.ListItemViewColorState
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s
import com.sdds.uikit.colorstate.ColorState

internal object PlasmaSdServiceDropdownMenuTightVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState> = mapOf(
        "Default" to ListItemViewColorState.DEFAULT,
        "Positive" to ListItemViewColorState.POSITIVE,
        "Negative" to ListItemViewColorState.NEGATIVE,
    )

    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to s.Plasma_SdService_ComponentOverlays_DropdownMenuTightXl,
            "Xl" to s.Plasma_SdService_ComponentOverlays_DropdownMenuTightXl,
            "L" to s.Plasma_SdService_ComponentOverlays_DropdownMenuTightL,
            "M" to s.Plasma_SdService_ComponentOverlays_DropdownMenuTightM,
            "S" to s.Plasma_SdService_ComponentOverlays_DropdownMenuTightS,
            "Xs" to s.Plasma_SdService_ComponentOverlays_DropdownMenuTightXs,
        )
}
