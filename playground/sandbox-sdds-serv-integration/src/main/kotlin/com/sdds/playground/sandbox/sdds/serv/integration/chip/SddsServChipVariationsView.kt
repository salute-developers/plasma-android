package com.sdds.playground.sandbox.sdds.serv.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Serv_Sdds_ComponentOverlays_ChipLDefault,
            "MDefault" to s.Serv_Sdds_ComponentOverlays_ChipMDefault,
            "SDefault" to s.Serv_Sdds_ComponentOverlays_ChipSDefault,
            "XsDefault" to s.Serv_Sdds_ComponentOverlays_ChipXSDefault,

            "LDefaultPilled" to s.Serv_Sdds_ComponentOverlays_ChipLPilledDefault,
            "MDefaultPilled" to s.Serv_Sdds_ComponentOverlays_ChipMPilledDefault,
            "SDefaultPilled" to s.Serv_Sdds_ComponentOverlays_ChipSPilledDefault,
            "XsDefaultPilled" to s.Serv_Sdds_ComponentOverlays_ChipXSPilledDefault,

            "LSecondary" to s.Serv_Sdds_ComponentOverlays_ChipLSecondary,
            "MSecondary" to s.Serv_Sdds_ComponentOverlays_ChipMSecondary,
            "SSecondary" to s.Serv_Sdds_ComponentOverlays_ChipSSecondary,
            "XsSecondary" to s.Serv_Sdds_ComponentOverlays_ChipXSSecondary,

            "LSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_ChipLPilledSecondary,
            "MSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_ChipMPilledSecondary,
            "SSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_ChipSPilledSecondary,
            "XsSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_ChipXSPilledSecondary,

            "LAccent" to s.Serv_Sdds_ComponentOverlays_ChipLAccent,
            "MAccent" to s.Serv_Sdds_ComponentOverlays_ChipMAccent,
            "SAccent" to s.Serv_Sdds_ComponentOverlays_ChipSAccent,
            "XsAccent" to s.Serv_Sdds_ComponentOverlays_ChipXSAccent,

            "LAccentPilled" to s.Serv_Sdds_ComponentOverlays_ChipLPilledAccent,
            "MAccentPilled" to s.Serv_Sdds_ComponentOverlays_ChipMPilledAccent,
            "SAccentPilled" to s.Serv_Sdds_ComponentOverlays_ChipSPilledAccent,
            "XsAccentPilled" to s.Serv_Sdds_ComponentOverlays_ChipXSPilledAccent,
        )
}
