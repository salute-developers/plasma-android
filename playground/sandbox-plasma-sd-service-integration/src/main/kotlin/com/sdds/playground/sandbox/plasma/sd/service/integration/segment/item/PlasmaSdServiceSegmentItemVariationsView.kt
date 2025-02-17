package com.sdds.playground.sandbox.plasma.sd.service.integration.segment.item

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceSegmentItemVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LPrimary" to s.Plasma_SdService_ComponentOverlays_SegmentItem_LPrimary,
            "LSecondary" to s.Plasma_SdService_ComponentOverlays_SegmentItem_LSecondary,
            "LDefault" to s.Plasma_SdService_ComponentOverlays_SegmentItem_LDefault,
            "LPrimaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentItem_LPrimaryPilled,
            "LSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentItem_LSecondaryPilled,
            "MPrimary" to s.Plasma_SdService_ComponentOverlays_SegmentItem_MPrimary,
            "MSecondary" to s.Plasma_SdService_ComponentOverlays_SegmentItem_MSecondary,
            "MDefault" to s.Plasma_SdService_ComponentOverlays_SegmentItem_MDefault,
            "MPrimaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentItem_MPrimaryPilled,
            "MSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentItem_MSecondaryPilled,
            "SPrimary" to s.Plasma_SdService_ComponentOverlays_SegmentItem_SPrimary,
            "SSecondary" to s.Plasma_SdService_ComponentOverlays_SegmentItem_SSecondary,
            "SDefault" to s.Plasma_SdService_ComponentOverlays_SegmentItem_SDefault,
            "SPrimaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentItem_SPrimaryPilled,
            "SSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentItem_SSecondaryPilled,
            "XsPrimary" to s.Plasma_SdService_ComponentOverlays_SegmentItem_XsPrimary,
            "XsSecondary" to s.Plasma_SdService_ComponentOverlays_SegmentItem_XsSecondary,
            "XsDefault" to s.Plasma_SdService_ComponentOverlays_SegmentItem_XsDefault,
            "XsPrimaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentItem_XsPrimaryPilled,
            "XsSecondaryPilled" to s.Plasma_SdService_ComponentOverlays_SegmentItem_XsSecondaryPilled,
        )
}
