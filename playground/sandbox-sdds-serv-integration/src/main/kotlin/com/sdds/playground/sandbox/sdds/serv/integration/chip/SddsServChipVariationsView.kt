package com.sdds.playground.sandbox.sdds.serv.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "LDefault" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipLDefault,
            "MDefault" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipMDefault,
            "SDefault" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipSDefault,
            "XsDefault" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipXSDefault,

            "LDefaultPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipLPilledDefault,
            "MDefaultPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipMPilledDefault,
            "SDefaultPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipSPilledDefault,
            "XsDefaultPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipXSPilledDefault,

            "LSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipLSecondary,
            "MSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipMSecondary,
            "SSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipSSecondary,
            "XsSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipXSSecondary,

            "LSecondaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipLPilledSecondary,
            "MSecondaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipMPilledSecondary,
            "SSecondaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipSPilledSecondary,
            "XsSecondaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipXSPilledSecondary,

            "LAccent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipLAccent,
            "MAccent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipMAccent,
            "SAccent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipSAccent,
            "XsAccent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipXSAccent,

            "LAccentPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipLPilledAccent,
            "MAccentPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipMPilledAccent,
            "SAccentPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipSPilledAccent,
            "XsAccentPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipXSPilledAccent,
        )
}
