package com.sdds.playground.sandbox.plasma.stards.integration.indicator

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsIndicatorVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "DefaultL" to s.Sdkit_StarDs_ComponentOverlays_IndicatorLDefault,
            "InactiveL" to s.Sdkit_StarDs_ComponentOverlays_IndicatorLInactive,
            "AccentL" to s.Sdkit_StarDs_ComponentOverlays_IndicatorLAccent,
            "PositiveL" to s.Sdkit_StarDs_ComponentOverlays_IndicatorLPositive,
            "NegativeL" to s.Sdkit_StarDs_ComponentOverlays_IndicatorLNegative,
            "WarningL" to s.Sdkit_StarDs_ComponentOverlays_IndicatorLWarning,
            "DarkL" to s.Sdkit_StarDs_ComponentOverlays_IndicatorLDark,
            "BlackL" to s.Sdkit_StarDs_ComponentOverlays_IndicatorLBlack,
            "WhiteL" to s.Sdkit_StarDs_ComponentOverlays_IndicatorLWhite,

            "DefaultM" to s.Sdkit_StarDs_ComponentOverlays_IndicatorMDefault,
            "InactiveM" to s.Sdkit_StarDs_ComponentOverlays_IndicatorMInactive,
            "AccentM" to s.Sdkit_StarDs_ComponentOverlays_IndicatorMAccent,
            "PositiveM" to s.Sdkit_StarDs_ComponentOverlays_IndicatorMPositive,
            "NegativeM" to s.Sdkit_StarDs_ComponentOverlays_IndicatorMNegative,
            "WarningM" to s.Sdkit_StarDs_ComponentOverlays_IndicatorMWarning,
            "DarkM" to s.Sdkit_StarDs_ComponentOverlays_IndicatorMDark,
            "BlackM" to s.Sdkit_StarDs_ComponentOverlays_IndicatorMBlack,
            "WhiteM" to s.Sdkit_StarDs_ComponentOverlays_IndicatorMWhite,

            "DefaultS" to s.Sdkit_StarDs_ComponentOverlays_IndicatorSDefault,
            "InactiveS" to s.Sdkit_StarDs_ComponentOverlays_IndicatorSInactive,
            "AccentS" to s.Sdkit_StarDs_ComponentOverlays_IndicatorSAccent,
            "PositiveS" to s.Sdkit_StarDs_ComponentOverlays_IndicatorSPositive,
            "NegativeS" to s.Sdkit_StarDs_ComponentOverlays_IndicatorSNegative,
            "WarningS" to s.Sdkit_StarDs_ComponentOverlays_IndicatorSWarning,
            "DarkS" to s.Sdkit_StarDs_ComponentOverlays_IndicatorSDark,
            "BlackS" to s.Sdkit_StarDs_ComponentOverlays_IndicatorSBlack,
            "WhiteS" to s.Sdkit_StarDs_ComponentOverlays_IndicatorSWhite,
        )
}
