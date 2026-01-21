package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServFileLinearProgressVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressXs,
            "Xs.Default" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressXsDefault,
            "Xs.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressXsNegative,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressS,
            "S.Default" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressSDefault,
            "S.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressSNegative,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressM,
            "M.Default" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressMDefault,
            "M.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressMNegative,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressL,
            "L.Default" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressLDefault,
            "L.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_FileLinearProgressLNegative,
        )
}
