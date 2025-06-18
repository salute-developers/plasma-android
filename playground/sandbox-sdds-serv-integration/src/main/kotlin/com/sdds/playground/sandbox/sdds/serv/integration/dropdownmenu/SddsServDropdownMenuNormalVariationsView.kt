package com.sdds.playground.sandbox.sdds.serv.integration.dropdownmenu

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s
import com.sdds.serv.colorstate.ListItemViewColorState
import com.sdds.uikit.colorstate.ColorState

internal object SddsServDropdownMenuNormalVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState> = mapOf(
        "Default" to ListItemViewColorState.DEFAULT,
        "Positive" to ListItemViewColorState.POSITIVE,
        "Negative" to ListItemViewColorState.NEGATIVE,
    )

    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to s.Serv_Sdds_ComponentOverlays_DropdownMenuNormalXl,
            "L" to s.Serv_Sdds_ComponentOverlays_DropdownMenuNormalL,
            "M" to s.Serv_Sdds_ComponentOverlays_DropdownMenuNormalM,
            "S" to s.Serv_Sdds_ComponentOverlays_DropdownMenuNormalS,
            "Xs" to s.Serv_Sdds_ComponentOverlays_DropdownMenuNormalXs,
        )
}
