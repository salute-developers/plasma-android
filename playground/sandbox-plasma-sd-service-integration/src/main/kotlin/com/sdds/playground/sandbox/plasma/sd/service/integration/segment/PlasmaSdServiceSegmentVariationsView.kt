package com.sdds.playground.sandbox.plasma.sd.service.integration.segment

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object PlasmaSdServiceSegmentVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "LPrimary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentLPrimary,
            "MPrimary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentMPrimary,
            "SPrimary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentSPrimary,
            "XsPrimary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentXsPrimary,
            "LPrimaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentLPrimaryPilled,
            "MPrimaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentMPrimaryPilled,
            "SPrimaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentSPrimaryPilled,
            "XsPrimaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentXsPrimaryPilled,
            "LSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentLSecondary,
            "MSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentMSecondary,
            "SSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentSSecondary,
            "XsSecondary" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentXsSecondary,
            "LSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentLSecondary,
            "MSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentMSecondaryPilled,
            "SSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentSSecondaryPilled,
            "XsSecondaryPilled" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_SegmentXsSecondaryPilled,
        )
}
