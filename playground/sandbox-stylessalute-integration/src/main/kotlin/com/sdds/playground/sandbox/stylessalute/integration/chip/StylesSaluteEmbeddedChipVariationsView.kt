package com.sdds.playground.sandbox.stylessalute.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteEmbeddedChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "LDefault" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipLDefault,
        "MDefault" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipMDefault,
        "SDefault" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipSDefault,
        "XsDefault" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipXsDefault,

        "LSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipLSecondary,
        "MSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipMSecondary,
        "SSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipSSecondary,
        "XsSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipXsSecondary,

        "LAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipLAccent,
        "MAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipMAccent,
        "SAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipSAccent,
        "XsAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipXsAccent,

    )
}
