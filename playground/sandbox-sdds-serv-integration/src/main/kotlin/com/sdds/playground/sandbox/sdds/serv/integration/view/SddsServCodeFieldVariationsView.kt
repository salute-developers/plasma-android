package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServCodeFieldVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_CodeFieldL,
            "L.Segmented" to DsR.style.Serv_Sdds_ComponentOverlays_CodeFieldLSegmented,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_CodeFieldM,
            "M.Segmented" to DsR.style.Serv_Sdds_ComponentOverlays_CodeFieldMSegmented,
        )
}
