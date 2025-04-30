package com.sdds.playground.sandbox.stylessalute.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s
import com.sdds.stylessalute.colorstate.ChipColorState
import com.sdds.uikit.colorstate.ColorState

internal object StylesSaluteChipGroupVariationsView : ViewStyleProvider<String>() {
    override val colorVariations: Map<String, ColorState> = mapOf(
        "Accent" to ChipColorState.ACCENT,
        "Secondary" to ChipColorState.SECONDARY,
    )

    override val variations: Map<String, Int> = mapOf(
        "WideL" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideLDefault,
        "WideLSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideLSecondary,
        "WideLAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideLAccent,

        "WideLPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideLPilledDefault,
        "WideLPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideLPilledSecondary,
        "WideLPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideLPilledAccent,

        "WideM" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideMDefault,
        "WideMSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideMSecondary,
        "WideMAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideMAccent,

        "WideMPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideMPilledDefault,
        "WideMPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideMPilledSecondary,
        "WideMPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideMPilledAccent,

        "WideS" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideSDefault,
        "WideSSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideSSecondary,
        "WideSAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideSAccent,

        "WideSPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideSPilledDefault,
        "WideSPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideSPilledSecondary,
        "WideSPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideSPilledAccent,

        "WideXs" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideXsDefault,
        "WideXsSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideXsSecondary,
        "WideXsAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideXsAccent,

        "WideXsPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideXsPilledDefault,
        "WideXsPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideXsPilledSecondary,
        "WideXsPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWideXsPilledAccent,

        "DenseL" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseLDefault,
        "DenseLSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseLSecondary,
        "DenseLAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseLAccent,

        "DenseLPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseLPilledDefault,
        "DenseLPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseLPilledSecondary,
        "DenseLPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseLPilledAccent,

        "DenseM" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseMDefault,
        "DenseMSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseMSecondary,
        "DenseMAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseMAccent,

        "DenseMPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseMPilledDefault,
        "DenseMPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseMPilledSecondary,
        "DenseMPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseMPilledAccent,

        "DenseS" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseSDefault,
        "DenseSSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseSSecondary,
        "DenseSAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseSAccent,

        "DenseSPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseSPilledDefault,
        "DenseSPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseSPilledSecondary,
        "DenseSPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseSPilledAccent,

        "DenseXs" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseXsDefault,
        "DenseXsSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseXsSecondary,
        "DenseXsAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseXsAccent,

        "DenseXsPilled" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseXsPilledDefault,
        "DenseXsPilledSecondary" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseXsPilledSecondary,
        "DenseXsPilledAccent" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDenseXsPilledAccent,
    )
}
