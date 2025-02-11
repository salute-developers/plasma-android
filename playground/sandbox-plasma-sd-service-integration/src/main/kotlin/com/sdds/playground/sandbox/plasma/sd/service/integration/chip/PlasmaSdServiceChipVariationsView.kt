package com.sdds.playground.sandbox.plasma.sd.service.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object PlasmaSdServiceChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "LDefault" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipLDefault,
            "MDefault" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipMDefault,
            "SDefault" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipSDefault,
            "XsDefault" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipXSDefault,

            "LDefaultPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipLPilledDefault,
            "MDefaultPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipMPilledDefault,
            "SDefaultPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipSPilledDefault,
            "XsDefaultPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipXSPilledDefault,

            "LSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipLSecondary,
            "MSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipMSecondary,
            "SSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipSSecondary,
            "XsSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipXSSecondary,

            "LSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipLPilledSecondary,
            "MSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipMPilledSecondary,
            "SSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipSPilledSecondary,
            "XsSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipXSPilledSecondary,

            "LAccent" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipLAccent,
            "MAccent" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipMAccent,
            "SAccent" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipSAccent,
            "XsAccent" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipXSAccent,

            "LAccentPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipLPilledAccent,
            "MAccentPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipMPilledAccent,
            "SAccentPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipSPilledAccent,
            "XsAccentPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_ChipXSPilledAccent,
        )
}
