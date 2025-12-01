package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cDropdownEmptyStateVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateXs,
            "Xs.HasButton" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateXsHasButton,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateS,
            "S.HasButton" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateSHasButton,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateM,
            "M.HasButton" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateMHasButton,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateL,
            "L.HasButton" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateLHasButton,
            "Xl" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateXl,
            "Xl.HasButton" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownEmptyStateXlHasButton,
        )
}
