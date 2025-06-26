package com.sdds.playground.sandbox.plasma.sd.service.integration.dropdownmenu

import com.sdds.plasma.sd.service.colorstate.ListItemViewColorState
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s
import com.sdds.uikit.colorstate.ColorState

internal object PlasmaSdServiceDropdownMenuNormalVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState> = mapOf(
        "Default" to ListItemViewColorState.DEFAULT,
        "Positive" to ListItemViewColorState.POSITIVE,
        "Negative" to ListItemViewColorState.NEGATIVE,
    )

    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to s.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXl,
            "L" to s.Plasma_SdService_ComponentOverlays_DropdownMenuNormalL,
            "M" to s.Plasma_SdService_ComponentOverlays_DropdownMenuNormalM,
            "S" to s.Plasma_SdService_ComponentOverlays_DropdownMenuNormalS,
            "Xs" to s.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXs,
        )
}
