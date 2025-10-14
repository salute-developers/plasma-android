package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteEmbeddedChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipL,
            "L.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipLDefault,
            "L.Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipLAccent,
            "L.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipLSecondary,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipM,
            "M.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipMDefault,
            "M.Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipMAccent,
            "M.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipMSecondary,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipS,
            "S.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipSDefault,
            "S.Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipSAccent,
            "S.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipSSecondary,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipXs,
            "Xs.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipXsDefault,
            "Xs.Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipXsAccent,
            "Xs.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_EmbeddedChipXsSecondary,
        )
}
