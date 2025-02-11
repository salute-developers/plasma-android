package com.sdds.playground.sandbox.plasma.sd.service.integration.segment.item

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object PlasmaSdServiceSegmentItemVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "LPrimary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_LPrimary,
            "LSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_LSecondary,
            "LDefault" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_LDefault,
            "LPrimaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_LPrimaryPilled,
            "LSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_LSecondaryPilled,
            "MPrimary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_MPrimary,
            "MSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_MSecondary,
            "MDefault" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_MDefault,
            "MPrimaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_MPrimaryPilled,
            "MSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_MSecondaryPilled,
            "SPrimary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_SPrimary,
            "SSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_SSecondary,
            "SDefault" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_SDefault,
            "SPrimaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_SPrimaryPilled,
            "SSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_SSecondaryPilled,
            "XsPrimary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_XsPrimary,
            "XsSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_XsSecondary,
            "XsDefault" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_XsDefault,
            "XsPrimaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_XsPrimaryPilled,
            "XsSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentItem_XsSecondaryPilled,
        )
}
