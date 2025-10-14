package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsDropdownMenuItemVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemXl,
            "Xl.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemXlDefault,
            "Xl.Positive" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemXlPositive,
            "Xl.Negative" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemXlNegative,
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemL,
            "L.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemLDefault,
            "L.Positive" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemLPositive,
            "L.Negative" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemLNegative,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemM,
            "M.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemMDefault,
            "M.Positive" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemMPositive,
            "M.Negative" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemMNegative,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemS,
            "S.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemSDefault,
            "S.Positive" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemSPositive,
            "S.Negative" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemSNegative,
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemXs,
            "Xs.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemXsDefault,
            "Xs.Positive" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemXsPositive,
            "Xs.Negative" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuItemXsNegative,
        )
}
