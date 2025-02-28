package com.sdds.playground.sandbox.sdds.serv.integration.indicator.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServIndicatorVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "DefaultL" to s.Serv_Sdds_ComponentOverlays_IndicatorLDefault,
            "InactiveL" to s.Serv_Sdds_ComponentOverlays_IndicatorLInactive,
            "AccentL" to s.Serv_Sdds_ComponentOverlays_IndicatorLAccent,
            "PositiveL" to s.Serv_Sdds_ComponentOverlays_IndicatorLPositive,
            "NegativeL" to s.Serv_Sdds_ComponentOverlays_IndicatorLNegative,
            "WarningL" to s.Serv_Sdds_ComponentOverlays_IndicatorLWarning,
            "DarkL" to s.Serv_Sdds_ComponentOverlays_IndicatorLDark,
            "BlackL" to s.Serv_Sdds_ComponentOverlays_IndicatorLBlack,
            "WhiteL" to s.Serv_Sdds_ComponentOverlays_IndicatorLWhite,

            "DefaultM" to s.Serv_Sdds_ComponentOverlays_IndicatorMDefault,
            "InactiveM" to s.Serv_Sdds_ComponentOverlays_IndicatorMInactive,
            "AccentM" to s.Serv_Sdds_ComponentOverlays_IndicatorMAccent,
            "PositiveM" to s.Serv_Sdds_ComponentOverlays_IndicatorMPositive,
            "NegativeM" to s.Serv_Sdds_ComponentOverlays_IndicatorMNegative,
            "WarningM" to s.Serv_Sdds_ComponentOverlays_IndicatorMWarning,
            "DarkM" to s.Serv_Sdds_ComponentOverlays_IndicatorMDark,
            "BlackM" to s.Serv_Sdds_ComponentOverlays_IndicatorMBlack,
            "WhiteM" to s.Serv_Sdds_ComponentOverlays_IndicatorMWhite,

            "DefaultS" to s.Serv_Sdds_ComponentOverlays_IndicatorSDefault,
            "InactiveS" to s.Serv_Sdds_ComponentOverlays_IndicatorSInactive,
            "AccentS" to s.Serv_Sdds_ComponentOverlays_IndicatorSAccent,
            "PositiveS" to s.Serv_Sdds_ComponentOverlays_IndicatorSPositive,
            "NegativeS" to s.Serv_Sdds_ComponentOverlays_IndicatorSNegative,
            "WarningS" to s.Serv_Sdds_ComponentOverlays_IndicatorSWarning,
            "DarkS" to s.Serv_Sdds_ComponentOverlays_IndicatorSDark,
            "BlackS" to s.Serv_Sdds_ComponentOverlays_IndicatorSBlack,
            "WhiteS" to s.Serv_Sdds_ComponentOverlays_IndicatorSWhite,
        )
}
