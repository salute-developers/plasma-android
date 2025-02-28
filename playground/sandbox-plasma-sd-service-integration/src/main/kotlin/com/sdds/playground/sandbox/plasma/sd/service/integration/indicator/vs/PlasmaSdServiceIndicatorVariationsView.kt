package com.sdds.playground.sandbox.plasma.sd.service.integration.indicator.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceIndicatorVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "DefaultL" to s.Plasma_SdService_ComponentOverlays_IndicatorLDefault,
            "InactiveL" to s.Plasma_SdService_ComponentOverlays_IndicatorLInactive,
            "AccentL" to s.Plasma_SdService_ComponentOverlays_IndicatorLAccent,
            "PositiveL" to s.Plasma_SdService_ComponentOverlays_IndicatorLPositive,
            "NegativeL" to s.Plasma_SdService_ComponentOverlays_IndicatorLNegative,
            "WarningL" to s.Plasma_SdService_ComponentOverlays_IndicatorLWarning,
            "DarkL" to s.Plasma_SdService_ComponentOverlays_IndicatorLDark,
            "BlackL" to s.Plasma_SdService_ComponentOverlays_IndicatorLBlack,
            "WhiteL" to s.Plasma_SdService_ComponentOverlays_IndicatorLWhite,

            "DefaultM" to s.Plasma_SdService_ComponentOverlays_IndicatorMDefault,
            "InactiveM" to s.Plasma_SdService_ComponentOverlays_IndicatorMInactive,
            "AccentM" to s.Plasma_SdService_ComponentOverlays_IndicatorMAccent,
            "PositiveM" to s.Plasma_SdService_ComponentOverlays_IndicatorMPositive,
            "NegativeM" to s.Plasma_SdService_ComponentOverlays_IndicatorMNegative,
            "WarningM" to s.Plasma_SdService_ComponentOverlays_IndicatorMWarning,
            "DarkM" to s.Plasma_SdService_ComponentOverlays_IndicatorMDark,
            "BlackM" to s.Plasma_SdService_ComponentOverlays_IndicatorMBlack,
            "WhiteM" to s.Plasma_SdService_ComponentOverlays_IndicatorMWhite,

            "DefaultS" to s.Plasma_SdService_ComponentOverlays_IndicatorSDefault,
            "InactiveS" to s.Plasma_SdService_ComponentOverlays_IndicatorSInactive,
            "AccentS" to s.Plasma_SdService_ComponentOverlays_IndicatorSAccent,
            "PositiveS" to s.Plasma_SdService_ComponentOverlays_IndicatorSPositive,
            "NegativeS" to s.Plasma_SdService_ComponentOverlays_IndicatorSNegative,
            "WarningS" to s.Plasma_SdService_ComponentOverlays_IndicatorSWarning,
            "DarkS" to s.Plasma_SdService_ComponentOverlays_IndicatorSDark,
            "BlackS" to s.Plasma_SdService_ComponentOverlays_IndicatorSBlack,
            "WhiteS" to s.Plasma_SdService_ComponentOverlays_IndicatorSWhite,
        )
}
