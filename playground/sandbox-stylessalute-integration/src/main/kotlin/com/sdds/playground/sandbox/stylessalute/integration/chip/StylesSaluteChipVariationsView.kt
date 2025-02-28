package com.sdds.playground.sandbox.stylessalute.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "LDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipLDefault,
        "MDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipMDefault,
        "SDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipSDefault,
        "XsDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipXSDefault,

        "LDefaultPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipLPilledDefault,
        "MDefaultPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipMPilledDefault,
        "SDefaultPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipSPilledDefault,
        "XsDefaultPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipXSPilledDefault,

        "LSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipLSecondary,
        "MSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipMSecondary,
        "SSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipSSecondary,
        "XsSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipXSSecondary,

        "LSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipLPilledSecondary,
        "MSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipMPilledSecondary,
        "SSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipSPilledSecondary,
        "XsSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipXSPilledSecondary,

        "LAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipLAccent,
        "MAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipMAccent,
        "SAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipSAccent,
        "XsAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipXSAccent,

        "LAccentPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipLPilledAccent,
        "MAccentPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipMPilledAccent,
        "SAccentPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipSPilledAccent,
        "XsAccentPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipXSPilledAccent,
    )
}
