package com.sdds.playground.sandbox.plasma.stards.integration.segment.item

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsSegmentItemVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "XlPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemXlPrimary,
        "LPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemLPrimary,
        "MPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemMPrimary,
        "SPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemSPrimary,
        "XsPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemXsPrimary,
        "XlPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemXlPilledPrimary,
        "LPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemLPilledPrimary,
        "MPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemMPilledPrimary,
        "SPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemSPilledPrimary,
        "XsPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemXsPilledPrimary,
        "XlSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemXlSecondary,
        "LSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemLSecondary,
        "MSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemMSecondary,
        "SSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemSSecondary,
        "XsSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemXsSecondary,
        "XlSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemXlPilledSecondary,
        "LSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemLPilledSecondary,
        "MSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemMPilledSecondary,
        "SSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemSPilledSecondary,
        "XsSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentItemXsPilledSecondary,
    )
}
