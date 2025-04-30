package com.sdds.playground.sandbox.plasma.stards.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s
import com.sdds.uikit.colorstate.ColorState
import com.sdkit.star.designsystem.colorstate.ChipColorState

internal object StarDsChipGroupVariationsView : ViewStyleProvider<String>() {
    override val colorVariations: Map<String, ColorState> = mapOf(
        "Accent" to ChipColorState.ACCENT,
        "Secondary" to ChipColorState.SECONDARY,
        "Negative" to ChipColorState.NEGATIVE,
        "Positive" to ChipColorState.POSITIVE,
        "Warning" to ChipColorState.WARNING,
    )
    override val variations: Map<String, Int> =
        mapOf(
            "WideL" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLDefault,
            "WideLSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLSecondary,
            "WideLAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLAccent,
            "WideLNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLNegative,
            "WideLPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLPositive,
            "WideLWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLWarning,

            "WideLPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLPilledDefault,
            "WideLPilledSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLPilledSecondary,
            "WideLPilledAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLPilledAccent,
            "WideLPilledNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLPilledNegative,
            "WideLPilledPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLPilledPositive,
            "WideLPilledWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideLPilledWarning,

            "WideM" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMDefault,
            "WideMSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMSecondary,
            "WideMAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMAccent,
            "WideMNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMNegative,
            "WideMPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMPositive,
            "WideMWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMWarning,

            "WideMPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMPilledDefault,
            "WideMPilledSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMPilledSecondary,
            "WideMPilledAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMPilledAccent,
            "WideMPilledNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMPilledNegative,
            "WideMPilledPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMPilledPositive,
            "WideMPilledWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideMPilledWarning,

            "WideS" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSDefault,
            "WideSSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSSecondary,
            "WideSAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSAccent,
            "WideSNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSNegative,
            "WideSPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSPositive,
            "WideSWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSWarning,

            "WideSPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSPilledDefault,
            "WideSPilledSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSPilledSecondary,
            "WideSPilledAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSPilledAccent,
            "WideSPilledNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSPilledNegative,
            "WideSPilledPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSPilledPositive,
            "WideSPilledWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideSPilledWarning,

            "WideXs" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsDefault,
            "WideXsSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsSecondary,
            "WideXsAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsAccent,
            "WideXsNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsNegative,
            "WideXsPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsPositive,
            "WideXsWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsWarning,

            "WideXsPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsPilledDefault,
            "WideXsPilledSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsPilledSecondary,
            "WideXsPilledAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsPilledAccent,
            "WideXsPilledNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsPilledNegative,
            "WideXsPilledPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsPilledPositive,
            "WideXsPilledWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupWideXsPilledWarning,

            "DenseL" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLDefault,
            "DenseLSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLSecondary,
            "DenseLAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLAccent,
            "DenseLNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLNegative,
            "DenseLPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLPositive,
            "DenseLWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLWarning,

            "DenseLPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLPilledDefault,
            "DenseLPilledSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLPilledSecondary,
            "DenseLPilledAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLPilledAccent,
            "DenseLPilledNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLPilledNegative,
            "DenseLPilledPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLPilledPositive,
            "DenseLPilledWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseLPilledWarning,

            "DenseM" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMDefault,
            "DenseMSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMSecondary,
            "DenseMAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMAccent,
            "DenseMNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMNegative,
            "DenseMPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMPositive,
            "DenseMWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMWarning,

            "DenseMPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMPilledDefault,
            "DenseMPilledSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMPilledSecondary,
            "DenseMPilledAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMPilledAccent,
            "DenseMPilledNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMPilledNegative,
            "DenseMPilledPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMPilledPositive,
            "DenseMPilledWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseMPilledWarning,

            "DenseS" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSDefault,
            "DenseSSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSSecondary,
            "DenseSAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSAccent,
            "DenseSNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSNegative,
            "DenseSPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSPositive,
            "DenseSWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSWarning,

            "DenseSPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSPilledDefault,
            "DenseSPilledSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSPilledSecondary,
            "DenseSPilledAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSPilledAccent,
            "DenseSPilledNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSPilledNegative,
            "DenseSPilledPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSPilledPositive,
            "DenseSPilledWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseSPilledWarning,

            "DenseXs" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsDefault,
            "DenseXsSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsSecondary,
            "DenseXsAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsAccent,
            "DenseXsNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsNegative,
            "DenseXsPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsPositive,
            "DenseXsWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsWarning,

            "DenseXsPilled" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsPilledDefault,
            "DenseXsPilledSecondary" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsPilledSecondary,
            "DenseXsPilledAccent" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsPilledAccent,
            "DenseXsPilledNegative" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsPilledNegative,
            "DenseXsPilledPositive" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsPilledPositive,
            "DenseXsPilledWarning" to s.Sdkit_StarDs_ComponentOverlays_ChipGroupDenseXsPilledWarning,
        )
}
