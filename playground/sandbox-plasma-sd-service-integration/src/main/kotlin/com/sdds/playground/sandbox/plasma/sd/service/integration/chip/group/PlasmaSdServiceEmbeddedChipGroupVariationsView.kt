package com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group

import com.sdds.plasma.sd.service.colorstate.ChipColorState
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s
import com.sdds.uikit.colorstate.ColorState

internal object PlasmaSdServiceEmbeddedChipGroupVariationsView : ViewStyleProvider<String>() {
    override val colorVariations: Map<String, ColorState> = mapOf(
        "Accent" to ChipColorState.ACCENT,
        "Secondary" to ChipColorState.SECONDARY,
        "Negative" to ChipColorState.NEGATIVE,
        "Positive" to ChipColorState.POSITIVE,
        "Warning" to ChipColorState.WARNING,
    )
    override val variations: Map<String, Int> =
        mapOf(
            "WideL" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideLDefault,
            "WideLSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideLSecondary,
            "WideLAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideLAccent,
            "WideLNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideLNegative,
            "WideLPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideLPositive,
            "WideLWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideLWarning,

            "WideM" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideMDefault,
            "WideMSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideMSecondary,
            "WideMAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideMAccent,
            "WideMNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideMNegative,
            "WideMPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideMPositive,
            "WideMWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideMWarning,

            "WideS" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideSDefault,
            "WideSSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideSSecondary,
            "WideSAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideSAccent,
            "WideSNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideSNegative,
            "WideSPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideSPositive,
            "WideSWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideSWarning,

            "WideXs" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideXsDefault,
            "WideXsSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideXsSecondary,
            "WideXsAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideXsAccent,
            "WideXsNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideXsNegative,
            "WideXsPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideXsPositive,
            "WideXsWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupWideXsWarning,

            "DenseL" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseLDefault,
            "DenseLSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseLSecondary,
            "DenseLAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseLAccent,
            "DenseLNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseLNegative,
            "DenseLPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseLPositive,
            "DenseLWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseLWarning,

            "DenseM" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseMDefault,
            "DenseMSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseMSecondary,
            "DenseMAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseMAccent,
            "DenseMNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseMNegative,
            "DenseMPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseMPositive,
            "DenseMWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseMWarning,

            "DenseS" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseSDefault,
            "DenseSSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseSSecondary,
            "DenseSAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseSAccent,
            "DenseSNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseSNegative,
            "DenseSPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseSPositive,
            "DenseSWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseSWarning,

            "DenseXs" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseXsDefault,
            "DenseXsSecondary" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseXsSecondary,
            "DenseXsAccent" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseXsAccent,
            "DenseXsNegative" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseXsNegative,
            "DenseXsPositive" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseXsPositive,
            "DenseXsWarning" to s.Plasma_SdService_ComponentOverlays_EmbeddedChipGroupDenseXsWarning,
        )
}
