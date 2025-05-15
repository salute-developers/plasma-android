package com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group

import com.sdds.plasma.sd.service.colorstate.ChipColorState
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s
import com.sdds.uikit.colorstate.ColorState

internal object PlasmaSdServiceChipGroupVariationsView : ViewStyleProvider<String>() {
    override val colorVariations: Map<String, ColorState> = mapOf(
        "Accent" to ChipColorState.ACCENT,
        "Secondary" to ChipColorState.SECONDARY,
        "Negative" to ChipColorState.NEGATIVE,
        "Positive" to ChipColorState.POSITIVE,
        "Warning" to ChipColorState.WARNING,
    )
    override val variations: Map<String, Int> =
        mapOf(
            "WideL" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLDefault,
            "WideLSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLSecondary,
            "WideLAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLAccent,
            "WideLNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLNegative,
            "WideLPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLPositive,
            "WideLWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLWarning,

            "WideLPilled" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLPilledDefault,
            "WideLPilledSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLPilledSecondary,
            "WideLPilledAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLPilledAccent,
            "WideLPilledNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLPilledNegative,
            "WideLPilledPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLPilledPositive,
            "WideLPilledWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideLPilledWarning,

            "WideM" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMDefault,
            "WideMSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMSecondary,
            "WideMAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMAccent,
            "WideMNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMNegative,
            "WideMPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMPositive,
            "WideMWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMWarning,

            "WideMPilled" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMPilledDefault,
            "WideMPilledSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMPilledSecondary,
            "WideMPilledAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMPilledAccent,
            "WideMPilledNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMPilledNegative,
            "WideMPilledPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMPilledPositive,
            "WideMPilledWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideMPilledWarning,

            "WideS" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSDefault,
            "WideSSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSSecondary,
            "WideSAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSAccent,
            "WideSNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSNegative,
            "WideSPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSPositive,
            "WideSWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSWarning,

            "WideSPilled" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSPilledDefault,
            "WideSPilledSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSPilledSecondary,
            "WideSPilledAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSPilledAccent,
            "WideSPilledNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSPilledNegative,
            "WideSPilledPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSPilledPositive,
            "WideSPilledWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideSPilledWarning,

            "WideXs" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsDefault,
            "WideXsSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsSecondary,
            "WideXsAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsAccent,
            "WideXsNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsNegative,
            "WideXsPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsPositive,
            "WideXsWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsWarning,

            "WideXsPilled" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsPilledDefault,
            "WideXsPilledSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsPilledSecondary,
            "WideXsPilledAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsPilledAccent,
            "WideXsPilledNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsPilledNegative,
            "WideXsPilledPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsPilledPositive,
            "WideXsPilledWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupWideXsPilledWarning,

            "DenseL" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLDefault,
            "DenseLSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLSecondary,
            "DenseLAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLAccent,
            "DenseLNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLNegative,
            "DenseLPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLPositive,
            "DenseLWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLWarning,

            "DenseLPilled" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLPilledDefault,
            "DenseLPilledSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLPilledSecondary,
            "DenseLPilledAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLPilledAccent,
            "DenseLPilledNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLPilledNegative,
            "DenseLPilledPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLPilledPositive,
            "DenseLPilledWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseLPilledWarning,

            "DenseM" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMDefault,
            "DenseMSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMSecondary,
            "DenseMAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMAccent,
            "DenseMNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMNegative,
            "DenseMPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMPositive,
            "DenseMWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMWarning,

            "DenseMPilled" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMPilledDefault,
            "DenseMPilledSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMPilledSecondary,
            "DenseMPilledAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMPilledAccent,
            "DenseMPilledNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMPilledNegative,
            "DenseMPilledPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMPilledPositive,
            "DenseMPilledWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseMPilledWarning,

            "DenseS" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSDefault,
            "DenseSSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSSecondary,
            "DenseSAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSAccent,
            "DenseSNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSNegative,
            "DenseSPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSPositive,
            "DenseSWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSWarning,

            "DenseSPilled" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSPilledDefault,
            "DenseSPilledSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSPilledSecondary,
            "DenseSPilledAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSPilledAccent,
            "DenseSPilledNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSPilledNegative,
            "DenseSPilledPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSPilledPositive,
            "DenseSPilledWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseSPilledWarning,

            "DenseXs" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsDefault,
            "DenseXsSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsSecondary,
            "DenseXsAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsAccent,
            "DenseXsNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsNegative,
            "DenseXsPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsPositive,
            "DenseXsWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsWarning,

            "DenseXsPilled" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsPilledDefault,
            "DenseXsPilledSecondary" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsPilledSecondary,
            "DenseXsPilledAccent" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsPilledAccent,
            "DenseXsPilledNegative" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsPilledNegative,
            "DenseXsPilledPositive" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsPilledPositive,
            "DenseXsPilledWarning" to s.Plasma_SdService_ComponentOverlays_ChipGroupDenseXsPilledWarning,
        )
}
