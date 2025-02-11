package com.sdds.playground.sandbox.sdds.serv.integration.indicator

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object SddsServIndicatorVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "DefaultL" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorLDefault,
            "InactiveL" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorLInactive,
            "AccentL" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorLAccent,
            "PositiveL" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorLPositive,
            "NegativeL" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorLNegative,
            "WarningL" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorLWarning,
            "DarkL" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorLDark,
            "BlackL" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorLBlack,
            "WhiteL" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorLWhite,

            "DefaultM" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorMDefault,
            "InactiveM" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorMInactive,
            "AccentM" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorMAccent,
            "PositiveM" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorMPositive,
            "NegativeM" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorMNegative,
            "WarningM" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorMWarning,
            "DarkM" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorMDark,
            "BlackM" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorMBlack,
            "WhiteM" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorMWhite,

            "DefaultS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorSDefault,
            "InactiveS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorSInactive,
            "AccentS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorSAccent,
            "PositiveS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorSPositive,
            "NegativeS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorSNegative,
            "WarningS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorSWarning,
            "DarkS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorSDark,
            "BlackS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorSBlack,
            "WhiteS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_IndicatorSWhite,
        )
}
