package com.sdds.playground.sandbox.sdds.serv.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s
import com.sdds.serv.colorstate.ChipColorState
import com.sdds.uikit.colorstate.ColorState

internal object SddsServChipGroupVariationsView : ViewStyleProvider<String>() {
    override val colorVariations: Map<String, ColorState> = mapOf(
        "Accent" to ChipColorState.ACCENT,
        "Secondary" to ChipColorState.SECONDARY,
        "Negative" to ChipColorState.NEGATIVE,
        "Positive" to ChipColorState.POSITIVE,
        "Warning" to ChipColorState.WARNING,
    )
    override val variations: Map<String, Int> =
        mapOf(
            "WideL" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLDefault,
            "WideLSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLSecondary,
            "WideLAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLAccent,
            "WideLNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLNegative,
            "WideLPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLPositive,
            "WideLWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLWarning,

            "WideLPilled" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLPilledDefault,
            "WideLPilledSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLPilledSecondary,
            "WideLPilledAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLPilledAccent,
            "WideLPilledNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLPilledNegative,
            "WideLPilledPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLPilledPositive,
            "WideLPilledWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideLPilledWarning,

            "WideM" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMDefault,
            "WideMSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMSecondary,
            "WideMAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMAccent,
            "WideMNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMNegative,
            "WideMPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMPositive,
            "WideMWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMWarning,

            "WideMPilled" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMPilledDefault,
            "WideMPilledSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMPilledSecondary,
            "WideMPilledAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMPilledAccent,
            "WideMPilledNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMPilledNegative,
            "WideMPilledPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMPilledPositive,
            "WideMPilledWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideMPilledWarning,

            "WideS" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSDefault,
            "WideSSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSSecondary,
            "WideSAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSAccent,
            "WideSNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSNegative,
            "WideSPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSPositive,
            "WideSWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSWarning,

            "WideSPilled" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSPilledDefault,
            "WideSPilledSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSPilledSecondary,
            "WideSPilledAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSPilledAccent,
            "WideSPilledNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSPilledNegative,
            "WideSPilledPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSPilledPositive,
            "WideSPilledWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideSPilledWarning,

            "WideXs" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsDefault,
            "WideXsSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsSecondary,
            "WideXsAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsAccent,
            "WideXsNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsNegative,
            "WideXsPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsPositive,
            "WideXsWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsWarning,

            "WideXsPilled" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsPilledDefault,
            "WideXsPilledSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsPilledSecondary,
            "WideXsPilledAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsPilledAccent,
            "WideXsPilledNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsPilledNegative,
            "WideXsPilledPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsPilledPositive,
            "WideXsPilledWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupWideXsPilledWarning,

            "DenseL" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLDefault,
            "DenseLSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLSecondary,
            "DenseLAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLAccent,
            "DenseLNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLNegative,
            "DenseLPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLPositive,
            "DenseLWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLWarning,

            "DenseLPilled" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLPilledDefault,
            "DenseLPilledSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLPilledSecondary,
            "DenseLPilledAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLPilledAccent,
            "DenseLPilledNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLPilledNegative,
            "DenseLPilledPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLPilledPositive,
            "DenseLPilledWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseLPilledWarning,

            "DenseM" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMDefault,
            "DenseMSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMSecondary,
            "DenseMAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMAccent,
            "DenseMNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMNegative,
            "DenseMPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMPositive,
            "DenseMWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMWarning,

            "DenseMPilled" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMPilledDefault,
            "DenseMPilledSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMPilledSecondary,
            "DenseMPilledAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMPilledAccent,
            "DenseMPilledNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMPilledNegative,
            "DenseMPilledPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMPilledPositive,
            "DenseMPilledWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseMPilledWarning,

            "DenseS" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSDefault,
            "DenseSSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSSecondary,
            "DenseSAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSAccent,
            "DenseSNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSNegative,
            "DenseSPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSPositive,
            "DenseSWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSWarning,

            "DenseSPilled" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSPilledDefault,
            "DenseSPilledSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSPilledSecondary,
            "DenseSPilledAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSPilledAccent,
            "DenseSPilledNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSPilledNegative,
            "DenseSPilledPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSPilledPositive,
            "DenseSPilledWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseSPilledWarning,

            "DenseXs" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsDefault,
            "DenseXsSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsSecondary,
            "DenseXsAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsAccent,
            "DenseXsNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsNegative,
            "DenseXsPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsPositive,
            "DenseXsWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsWarning,

            "DenseXsPilled" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsPilledDefault,
            "DenseXsPilledSecondary" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsPilledSecondary,
            "DenseXsPilledAccent" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsPilledAccent,
            "DenseXsPilledNegative" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsPilledNegative,
            "DenseXsPilledPositive" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsPilledPositive,
            "DenseXsPilledWarning" to s.Serv_Sdds_ComponentOverlays_ChipGroupDenseXsPilledWarning,
        )
}
