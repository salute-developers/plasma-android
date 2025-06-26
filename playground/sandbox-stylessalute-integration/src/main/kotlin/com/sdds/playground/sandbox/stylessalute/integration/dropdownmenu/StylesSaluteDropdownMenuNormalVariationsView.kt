package com.sdds.playground.sandbox.stylessalute.integration.dropdownmenu

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s
import com.sdds.stylessalute.colorstate.ListItemViewColorState
import com.sdds.uikit.colorstate.ColorState

internal object StylesSaluteDropdownMenuNormalVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState> = mapOf(
        "Default" to ListItemViewColorState.DEFAULT,
        "Positive" to ListItemViewColorState.POSITIVE,
        "Negative" to ListItemViewColorState.NEGATIVE,
    )

    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Salute_StylesSalute_ComponentOverlays_DropdownMenuNormalL,
            "M" to s.Salute_StylesSalute_ComponentOverlays_DropdownMenuNormalM,
            "S" to s.Salute_StylesSalute_ComponentOverlays_DropdownMenuNormalS,
            "Xs" to s.Salute_StylesSalute_ComponentOverlays_DropdownMenuNormalXs,
        )
}
