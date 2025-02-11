package com.sdds.playground.sandbox.plasma.sd.service.integration.indicator

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object PlasmaSdServiceIndicatorVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "DefaultL" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorLDefault,
            "InactiveL" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorLInactive,
            "AccentL" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorLAccent,
            "PositiveL" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorLPositive,
            "NegativeL" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorLNegative,
            "WarningL" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorLWarning,
            "DarkL" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorLDark,
            "BlackL" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorLBlack,
            "WhiteL" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorLWhite,

            "DefaultM" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorMDefault,
            "InactiveM" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorMInactive,
            "AccentM" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorMAccent,
            "PositiveM" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorMPositive,
            "NegativeM" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorMNegative,
            "WarningM" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorMWarning,
            "DarkM" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorMDark,
            "BlackM" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorMBlack,
            "WhiteM" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorMWhite,

            "DefaultS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorSDefault,
            "InactiveS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorSInactive,
            "AccentS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorSAccent,
            "PositiveS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorSPositive,
            "NegativeS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorSNegative,
            "WarningS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorSWarning,
            "DarkS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorSDark,
            "BlackS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorSBlack,
            "WhiteS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_IndicatorSWhite,
        )
}
