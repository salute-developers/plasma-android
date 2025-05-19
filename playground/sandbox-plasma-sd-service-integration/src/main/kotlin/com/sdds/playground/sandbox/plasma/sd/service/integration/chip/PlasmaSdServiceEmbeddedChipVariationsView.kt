package com.sdds.playground.sandbox.plasma.sd.service.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceEmbeddedChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipLDefault,
            "MDefault" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipMDefault,
            "SDefault" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipSDefault,
            "XsDefault" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipXsDefault,

            "LSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipLSecondary,
            "MSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipMSecondary,
            "SSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipSSecondary,
            "XsSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipXsSecondary,

            "LAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipLAccent,
            "MAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipMAccent,
            "SAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipSAccent,
            "XsAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipXsAccent,

            "LNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipLNegative,
            "MNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipMNegative,
            "SNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipSNegative,
            "XsNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipXsNegative,

            "LPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipLPositive,
            "MPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipMPositive,
            "SPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipSPositive,
            "XsPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipXsPositive,

            "LWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipLWarning,
            "MWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipMWarning,
            "SWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipSWarning,
            "XsWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipXsWarning,
        )
}
