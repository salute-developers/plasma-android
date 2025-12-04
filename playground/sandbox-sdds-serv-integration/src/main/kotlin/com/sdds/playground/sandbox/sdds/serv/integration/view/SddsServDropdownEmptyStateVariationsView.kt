package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServDropdownEmptyStateVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateXs,
            "Xs.HasButton" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateXsHasButton,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateS,
            "S.HasButton" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateSHasButton,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateM,
            "M.HasButton" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateMHasButton,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateL,
            "L.HasButton" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateLHasButton,
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateXl,
            "Xl.HasButton" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownEmptyStateXlHasButton,
        )
}
