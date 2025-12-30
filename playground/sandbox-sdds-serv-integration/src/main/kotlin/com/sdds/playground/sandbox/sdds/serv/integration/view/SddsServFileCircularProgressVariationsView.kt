package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServFileCircularProgressVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressXs,
            "Xs.Default" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressXsDefault,
            "Xs.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressXsNegative,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressS,
            "S.Default" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressSDefault,
            "S.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressSNegative,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressM,
            "M.Default" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressMDefault,
            "M.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressMNegative,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressL,
            "L.Default" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressLDefault,
            "L.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_FileCircularProgressLNegative,
        )
}
