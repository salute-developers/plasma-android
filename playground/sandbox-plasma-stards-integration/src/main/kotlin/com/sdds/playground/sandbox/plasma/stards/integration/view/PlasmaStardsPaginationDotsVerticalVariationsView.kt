package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsPaginationDotsVerticalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_PaginationDotsVerticalM,
            "M.ActiveTypeLine" to DsR.style.Sdkit_StarDs_ComponentOverlays_PaginationDotsVerticalMActiveTypeLine,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_PaginationDotsVerticalS,
            "S.ActiveTypeLine" to DsR.style.Sdkit_StarDs_ComponentOverlays_PaginationDotsVerticalSActiveTypeLine,
        )
}
