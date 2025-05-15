package com.sdds.playground.sandbox.stylessalute.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "LDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipLDefault,
        "MDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipMDefault,
        "SDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipSDefault,
        "XsDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipXsDefault,

        "LPilledDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipLPilledDefault,
        "MPilledDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipMPilledDefault,
        "SPilledDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipSPilledDefault,
        "XsPilledDefault" to s.Salute_StylesSalute_ComponentOverlays_ChipXsPilledDefault,

        "LSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipLSecondary,
        "MSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipMSecondary,
        "SSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipSSecondary,
        "XsSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipXsSecondary,

        "LPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipLPilledSecondary,
        "MPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipMPilledSecondary,
        "SPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipSPilledSecondary,
        "XsPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipXsPilledSecondary,

        "LAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipLAccent,
        "MAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipMAccent,
        "SAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipSAccent,
        "XsAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipXsAccent,

        "LPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipLPilledAccent,
        "MPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipMPilledAccent,
        "SPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipSPilledAccent,
        "XsPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipXsPilledAccent,
    )
}
