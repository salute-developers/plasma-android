package com.sdds.playground.sandbox.sdds.serv.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s
import com.sdds.serv.colorstate.ChipColorState
import com.sdds.uikit.colorstate.ColorState

internal object SddsServEmbeddedChipGroupVariationsView : ViewStyleProvider<String>() {
    override val colorVariations: Map<String, ColorState> = mapOf(
        "Accent" to ChipColorState.ACCENT,
        "Secondary" to ChipColorState.SECONDARY,
        "Negative" to ChipColorState.NEGATIVE,
        "Positive" to ChipColorState.POSITIVE,
        "Warning" to ChipColorState.WARNING,
    )
    override val variations: Map<String, Int> =
        mapOf(
            "WideL" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideLDefault,
            "WideLSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideLSecondary,
            "WideLAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideLAccent,
            "WideLNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideLNegative,
            "WideLPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideLPositive,
            "WideLWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideLWarning,

            "WideM" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideMDefault,
            "WideMSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideMSecondary,
            "WideMAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideMAccent,
            "WideMNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideMNegative,
            "WideMPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideMPositive,
            "WideMWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideMWarning,

            "WideS" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideSDefault,
            "WideSSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideSSecondary,
            "WideSAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideSAccent,
            "WideSNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideSNegative,
            "WideSPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideSPositive,
            "WideSWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideSWarning,

            "WideXs" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideXsDefault,
            "WideXsSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideXsSecondary,
            "WideXsAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideXsAccent,
            "WideXsNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideXsNegative,
            "WideXsPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideXsPositive,
            "WideXsWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupWideXsWarning,

            "DenseL" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseLDefault,
            "DenseLSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseLSecondary,
            "DenseLAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseLAccent,
            "DenseLNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseLNegative,
            "DenseLPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseLPositive,
            "DenseLWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseLWarning,

            "DenseM" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseMDefault,
            "DenseMSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseMSecondary,
            "DenseMAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseMAccent,
            "DenseMNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseMNegative,
            "DenseMPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseMPositive,
            "DenseMWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseMWarning,

            "DenseS" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseSDefault,
            "DenseSSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseSSecondary,
            "DenseSAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseSAccent,
            "DenseSNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseSNegative,
            "DenseSPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseSPositive,
            "DenseSWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseSWarning,

            "DenseXs" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseXsDefault,
            "DenseXsSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseXsSecondary,
            "DenseXsAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseXsAccent,
            "DenseXsNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseXsNegative,
            "DenseXsPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseXsPositive,
            "DenseXsWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipGroupDenseXsWarning,
        )
}
