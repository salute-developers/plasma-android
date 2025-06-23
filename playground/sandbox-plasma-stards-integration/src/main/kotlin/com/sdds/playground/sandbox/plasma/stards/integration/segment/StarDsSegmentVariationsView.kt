package com.sdds.playground.sandbox.plasma.stards.integration.segment

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsSegmentVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "XlPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentXlPrimary,
        "LPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentLPrimary,
        "MPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentMPrimary,
        "SPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentSPrimary,
        "XsPrimary" to s.Sdkit_StarDs_ComponentOverlays_SegmentXsPrimary,
        "XlPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentXlPilledPrimary,
        "LPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentLPilledPrimary,
        "MPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentMPilledPrimary,
        "SPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentSPilledPrimary,
        "XsPrimaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentXsPilledPrimary,
        "XlSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentXlSecondary,
        "LSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentLSecondary,
        "MSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentMSecondary,
        "SSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentSSecondary,
        "XsSecondary" to s.Sdkit_StarDs_ComponentOverlays_SegmentXsSecondary,
        "XlSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentXlPilledSecondary,
        "LSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentLPilledSecondary,
        "MSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentMPilledSecondary,
        "SSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentSPilledSecondary,
        "XsSecondaryPilled" to s.Sdkit_StarDs_ComponentOverlays_SegmentXsPilledSecondary,
    )
}
