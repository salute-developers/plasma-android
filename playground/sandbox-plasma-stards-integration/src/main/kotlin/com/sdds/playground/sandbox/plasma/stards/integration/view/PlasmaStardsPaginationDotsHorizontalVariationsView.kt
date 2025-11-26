package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsPaginationDotsHorizontalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_PaginationDotsHorizontalM,
            "M.ActiveTypeLine" to DsR.style.Sdkit_StarDs_ComponentOverlays_PaginationDotsHorizontalMActiveTypeLine,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_PaginationDotsHorizontalS,
            "S.ActiveTypeLine" to DsR.style.Sdkit_StarDs_ComponentOverlays_PaginationDotsHorizontalSActiveTypeLine,
        )
}
