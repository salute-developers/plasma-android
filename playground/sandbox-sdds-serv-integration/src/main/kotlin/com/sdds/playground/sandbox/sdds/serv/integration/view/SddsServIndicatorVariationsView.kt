package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServIndicatorVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorL,
            "L.Default" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorLDefault,
            "L.Accent" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorLAccent,
            "L.Inactive" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorLInactive,
            "L.Positive" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorLPositive,
            "L.Warning" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorLWarning,
            "L.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorLNegative,
            "L.Dark" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorLDark,
            "L.Black" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorLBlack,
            "L.White" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorLWhite,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorM,
            "M.Default" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorMDefault,
            "M.Accent" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorMAccent,
            "M.Inactive" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorMInactive,
            "M.Positive" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorMPositive,
            "M.Warning" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorMWarning,
            "M.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorMNegative,
            "M.Dark" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorMDark,
            "M.Black" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorMBlack,
            "M.White" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorMWhite,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorS,
            "S.Default" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorSDefault,
            "S.Accent" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorSAccent,
            "S.Inactive" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorSInactive,
            "S.Positive" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorSPositive,
            "S.Warning" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorSWarning,
            "S.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorSNegative,
            "S.Dark" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorSDark,
            "S.Black" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorSBlack,
            "S.White" to DsR.style.Serv_Sdds_ComponentOverlays_IndicatorSWhite,
        )
}
