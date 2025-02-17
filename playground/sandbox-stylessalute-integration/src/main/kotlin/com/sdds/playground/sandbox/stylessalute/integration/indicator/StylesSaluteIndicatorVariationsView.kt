package com.sdds.playground.sandbox.stylessalute.integration.indicator

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteIndicatorVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "DefaultL" to s.Salute_StylesSalute_ComponentOverlays_IndicatorLDefault,
        "InactiveL" to s.Salute_StylesSalute_ComponentOverlays_IndicatorLInactive,
        "AccentL" to s.Salute_StylesSalute_ComponentOverlays_IndicatorLAccent,
        "PositiveL" to s.Salute_StylesSalute_ComponentOverlays_IndicatorLPositive,
        "NegativeL" to s.Salute_StylesSalute_ComponentOverlays_IndicatorLNegative,
        "WarningL" to s.Salute_StylesSalute_ComponentOverlays_IndicatorLWarning,
        "DarkL" to s.Salute_StylesSalute_ComponentOverlays_IndicatorLDark,
        "BlackL" to s.Salute_StylesSalute_ComponentOverlays_IndicatorLBlack,
        "WhiteL" to s.Salute_StylesSalute_ComponentOverlays_IndicatorLWhite,

        "DefaultM" to s.Salute_StylesSalute_ComponentOverlays_IndicatorMDefault,
        "InactiveM" to s.Salute_StylesSalute_ComponentOverlays_IndicatorMInactive,
        "AccentM" to s.Salute_StylesSalute_ComponentOverlays_IndicatorMAccent,
        "PositiveM" to s.Salute_StylesSalute_ComponentOverlays_IndicatorMPositive,
        "NegativeM" to s.Salute_StylesSalute_ComponentOverlays_IndicatorMNegative,
        "WarningM" to s.Salute_StylesSalute_ComponentOverlays_IndicatorMWarning,
        "DarkM" to s.Salute_StylesSalute_ComponentOverlays_IndicatorMDark,
        "BlackM" to s.Salute_StylesSalute_ComponentOverlays_IndicatorMBlack,
        "WhiteM" to s.Salute_StylesSalute_ComponentOverlays_IndicatorMWhite,

        "DefaultS" to s.Salute_StylesSalute_ComponentOverlays_IndicatorSDefault,
        "InactiveS" to s.Salute_StylesSalute_ComponentOverlays_IndicatorSInactive,
        "AccentS" to s.Salute_StylesSalute_ComponentOverlays_IndicatorSAccent,
        "PositiveS" to s.Salute_StylesSalute_ComponentOverlays_IndicatorSPositive,
        "NegativeS" to s.Salute_StylesSalute_ComponentOverlays_IndicatorSNegative,
        "WarningS" to s.Salute_StylesSalute_ComponentOverlays_IndicatorSWarning,
        "DarkS" to s.Salute_StylesSalute_ComponentOverlays_IndicatorSDark,
        "BlackS" to s.Salute_StylesSalute_ComponentOverlays_IndicatorSBlack,
        "WhiteS" to s.Salute_StylesSalute_ComponentOverlays_IndicatorSWhite,
    )
}
