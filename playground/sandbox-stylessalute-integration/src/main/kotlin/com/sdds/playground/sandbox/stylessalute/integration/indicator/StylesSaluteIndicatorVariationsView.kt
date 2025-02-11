package com.sdds.playground.sandbox.stylessalute.integration.indicator

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object StylesSaluteIndicatorVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "DefaultL" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLDefault,
            "InactiveL" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLInactive,
            "AccentL" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLAccent,
            "PositiveL" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLPositive,
            "NegativeL" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLNegative,
            "WarningL" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLWarning,
            "DarkL" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLDark,
            "BlackL" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLBlack,
            "WhiteL" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorLWhite,

            "DefaultM" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMDefault,
            "InactiveM" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMInactive,
            "AccentM" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMAccent,
            "PositiveM" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMPositive,
            "NegativeM" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMNegative,
            "WarningM" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMWarning,
            "DarkM" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMDark,
            "BlackM" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMBlack,
            "WhiteM" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorMWhite,

            "DefaultS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSDefault,
            "InactiveS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSInactive,
            "AccentS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSAccent,
            "PositiveS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSPositive,
            "NegativeS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSNegative,
            "WarningS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSWarning,
            "DarkS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSDark,
            "BlackS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSBlack,
            "WhiteS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_IndicatorSWhite,
        )
}
