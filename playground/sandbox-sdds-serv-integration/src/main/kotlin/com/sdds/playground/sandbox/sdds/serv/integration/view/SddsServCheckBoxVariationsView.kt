package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxL,
            "L.Default" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxLDefault,
            "L.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxLNegative,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxM,
            "M.Default" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxMDefault,
            "M.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxMNegative,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxS,
            "S.Default" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxSDefault,
            "S.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxSNegative,
        )
}
