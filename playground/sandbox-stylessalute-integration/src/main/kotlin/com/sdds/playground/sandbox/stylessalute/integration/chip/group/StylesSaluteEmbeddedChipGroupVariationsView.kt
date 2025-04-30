package com.sdds.playground.sandbox.stylessalute.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s
import com.sdds.stylessalute.colorstate.ChipColorState
import com.sdds.uikit.colorstate.ColorState

internal object StylesSaluteEmbeddedChipGroupVariationsView : ViewStyleProvider<String>() {
    override val colorVariations: Map<String, ColorState> = mapOf(
        "Accent" to ChipColorState.ACCENT,
        "Secondary" to ChipColorState.SECONDARY,
    )

    override val variations: Map<String, Int> = mapOf(
        "WideL" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideLDefault,
        "WideLSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideLSecondary,
        "WideLAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideLAccent,

        "WideM" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideMDefault,
        "WideMSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideMSecondary,
        "WideMAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideMAccent,

        "WideS" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideSDefault,
        "WideSSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideSSecondary,
        "WideSAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideSAccent,

        "WideXs" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideXsDefault,
        "WideXsSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideXsSecondary,
        "WideXsAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupWideXsAccent,

        "DenseL" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseLDefault,
        "DenseLSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseLSecondary,
        "DenseLAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseLAccent,

        "DenseM" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseMDefault,
        "DenseMSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseMSecondary,
        "DenseMAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseMAccent,

        "DenseS" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseSDefault,
        "DenseSSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseSSecondary,
        "DenseSAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseSAccent,

        "DenseXs" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseXsDefault,
        "DenseXsSecondary" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseXsSecondary,
        "DenseXsAccent" to s.Salute_StylesSalute_ComponentOverlays_EmbeddedChipGroupDenseXsAccent,
    )
}
