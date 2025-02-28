package com.sdds.playground.sandbox.plasma.sd.service.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Plasma_SdService_ComponentOverlays_ChipLDefault,
            "MDefault" to s.Plasma_SdService_ComponentOverlays_ChipMDefault,
            "SDefault" to s.Plasma_SdService_ComponentOverlays_ChipSDefault,
            "XsDefault" to s.Plasma_SdService_ComponentOverlays_ChipXSDefault,

            "LDefaultPilled" to s.Plasma_SdService_ComponentOverlays_ChipLPilledDefault,
            "MDefaultPilled" to s.Plasma_SdService_ComponentOverlays_ChipMPilledDefault,
            "SDefaultPilled" to s.Plasma_SdService_ComponentOverlays_ChipSPilledDefault,
            "XsDefaultPilled" to s.Plasma_SdService_ComponentOverlays_ChipXSPilledDefault,

            "LSecondary" to s.Plasma_SdService_ComponentOverlays_ChipLSecondary,
            "MSecondary" to s.Plasma_SdService_ComponentOverlays_ChipMSecondary,
            "SSecondary" to s.Plasma_SdService_ComponentOverlays_ChipSSecondary,
            "XsSecondary" to s.Plasma_SdService_ComponentOverlays_ChipXSSecondary,

            "LSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_ChipLPilledSecondary,
            "MSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_ChipMPilledSecondary,
            "SSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_ChipSPilledSecondary,
            "XsSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_ChipXSPilledSecondary,

            "LAccent" to s.Plasma_SdService_ComponentOverlays_ChipLAccent,
            "MAccent" to s.Plasma_SdService_ComponentOverlays_ChipMAccent,
            "SAccent" to s.Plasma_SdService_ComponentOverlays_ChipSAccent,
            "XsAccent" to s.Plasma_SdService_ComponentOverlays_ChipXSAccent,

            "LAccentPilled" to s.Plasma_SdService_ComponentOverlays_ChipLPilledAccent,
            "MAccentPilled" to s.Plasma_SdService_ComponentOverlays_ChipMPilledAccent,
            "SAccentPilled" to s.Plasma_SdService_ComponentOverlays_ChipSPilledAccent,
            "XsAccentPilled" to s.Plasma_SdService_ComponentOverlays_ChipXSPilledAccent,
        )
}
