package com.sdds.playground.sandbox.plasma.stards.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Sdkit_StarDs_ComponentOverlays_ChipLDefault,
            "MDefault" to s.Sdkit_StarDs_ComponentOverlays_ChipMDefault,
            "SDefault" to s.Sdkit_StarDs_ComponentOverlays_ChipSDefault,
            "XsDefault" to s.Sdkit_StarDs_ComponentOverlays_ChipXSDefault,

            "LDefaultPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipLPilledDefault,
            "MDefaultPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipMPilledDefault,
            "SDefaultPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipSPilledDefault,
            "XsDefaultPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipXSPilledDefault,

            "LSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipLSecondary,
            "MSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipMSecondary,
            "SSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipSSecondary,
            "XsSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipXSSecondary,

            "LSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipLPilledSecondary,
            "MSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipMPilledSecondary,
            "SSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipSPilledSecondary,
            "XsSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipXSPilledSecondary,

            "LAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipLAccent,
            "MAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipMAccent,
            "SAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipSAccent,
            "XsAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipXSAccent,

            "LAccentPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipLPilledAccent,
            "MAccentPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipMPilledAccent,
            "SAccentPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipSPilledAccent,
            "XsAccentPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipXSPilledAccent,
        )
}
