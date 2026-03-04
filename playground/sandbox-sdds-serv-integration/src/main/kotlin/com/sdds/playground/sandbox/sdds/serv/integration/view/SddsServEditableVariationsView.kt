package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServEditableVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "H1" to DsR.style.Serv_Sdds_ComponentOverlays_EditableH1,
            "H2" to DsR.style.Serv_Sdds_ComponentOverlays_EditableH2,
            "H3" to DsR.style.Serv_Sdds_ComponentOverlays_EditableH3,
            "H4" to DsR.style.Serv_Sdds_ComponentOverlays_EditableH4,
            "H5" to DsR.style.Serv_Sdds_ComponentOverlays_EditableH5,
            "BodyL" to DsR.style.Serv_Sdds_ComponentOverlays_EditableBodyL,
            "BodyM" to DsR.style.Serv_Sdds_ComponentOverlays_EditableBodyM,
            "BodyS" to DsR.style.Serv_Sdds_ComponentOverlays_EditableBodyS,
            "BodyXs" to DsR.style.Serv_Sdds_ComponentOverlays_EditableBodyXs,
            "BodyXxs" to DsR.style.Serv_Sdds_ComponentOverlays_EditableBodyXxs,
        )
}
