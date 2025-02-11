package com.sdds.playground.sandbox.stylessalute.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object StylesSaluteChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "LDefault" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipLDefault,
            "MDefault" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipMDefault,
            "SDefault" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipSDefault,
            "XsDefault" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipXSDefault,

            "LDefaultPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipLPilledDefault,
            "MDefaultPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipMPilledDefault,
            "SDefaultPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipSPilledDefault,
            "XsDefaultPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipXSPilledDefault,

            "LSecondary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipLSecondary,
            "MSecondary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipMSecondary,
            "SSecondary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipSSecondary,
            "XsSecondary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipXSSecondary,

            "LSecondaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipLPilledSecondary,
            "MSecondaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipMPilledSecondary,
            "SSecondaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipSPilledSecondary,
            "XsSecondaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipXSPilledSecondary,

            "LAccent" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipLAccent,
            "MAccent" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipMAccent,
            "SAccent" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipSAccent,
            "XsAccent" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipXSAccent,

            "LAccentPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipLPilledAccent,
            "MAccentPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipMPilledAccent,
            "SAccentPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipSPilledAccent,
            "XsAccentPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipXSPilledAccent,
        )
}
