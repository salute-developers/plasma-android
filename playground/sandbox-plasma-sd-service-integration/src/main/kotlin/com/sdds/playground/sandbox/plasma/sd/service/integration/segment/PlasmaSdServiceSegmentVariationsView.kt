package com.sdds.playground.sandbox.plasma.sd.service.integration.segment

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceSegmentVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LPrimary" to s.Plasma_SdService_ComponentOverlays_SegmentLPrimary,
            "MPrimary" to s.Plasma_SdService_ComponentOverlays_SegmentMPrimary,
            "SPrimary" to s.Plasma_SdService_ComponentOverlays_SegmentSPrimary,
            "XsPrimary" to s.Plasma_SdService_ComponentOverlays_SegmentXsPrimary,
            "LPrimaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentLPrimaryPilled,
            "MPrimaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentMPrimaryPilled,
            "SPrimaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentSPrimaryPilled,
            "XsPrimaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentXsPrimaryPilled,
            "LSecondary" to s.Plasma_SdService_ComponentOverlays_SegmentLSecondary,
            "MSecondary" to s.Plasma_SdService_ComponentOverlays_SegmentMSecondary,
            "SSecondary" to s.Plasma_SdService_ComponentOverlays_SegmentSSecondary,
            "XsSecondary" to s.Plasma_SdService_ComponentOverlays_SegmentXsSecondary,
            "LSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentLSecondary,
            "MSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentMSecondaryPilled,
            "SSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentSSecondaryPilled,
            "XsSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentXsSecondaryPilled,
        )
}
