package com.sdds.playground.sandbox.plasma.stards.integration.buttongroup

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsBasicButtonGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LWideDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupLWideDefault,
            "LWideSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupLWideSegmented,
            "LDenseDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupLDenseDefault,
            "LDenseSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupLDenseSegmented,
            "LNoGapDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupLNoGapDefault,
            "LNoGapSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupLNoGapSegmented,

            "MWideDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupMWideDefault,
            "MWideSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupMWideSegmented,
            "MDenseDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupMDenseDefault,
            "MDenseSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupMDenseSegmented,
            "MNoGapDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupMNoGapDefault,
            "MNoGapSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupMNoGapSegmented,

            "SWideDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupSWideDefault,
            "SWideSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupSWideSegmented,
            "SDenseDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupSDenseDefault,
            "SDenseSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupSDenseSegmented,
            "SNoGapDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupSNoGapDefault,
            "SNoGapSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupSNoGapSegmented,

            "XsWideDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupXsWideDefault,
            "XsWideSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupXsWideSegmented,
            "XsDenseDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupXsDenseDefault,
            "XsDenseSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupXsDenseSegmented,
            "XsNoGapDefault" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupXsNoGapDefault,
            "XsNoGapSegmented" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonGroupXsNoGapSegmented,
        )
}
