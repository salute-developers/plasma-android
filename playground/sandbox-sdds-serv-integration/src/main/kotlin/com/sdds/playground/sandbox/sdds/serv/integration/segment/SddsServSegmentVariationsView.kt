package com.sdds.playground.sandbox.sdds.serv.integration.segment

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object SddsServSegmentVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "LPrimary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentLPrimary,
            "MPrimary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentMPrimary,
            "SPrimary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentSPrimary,
            "XsPrimary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentXsPrimary,
            "LPrimaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentLPrimaryPilled,
            "MPrimaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentMPrimaryPilled,
            "SPrimaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentSPrimaryPilled,
            "XsPrimaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentXsPrimaryPilled,
            "LSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentLSecondary,
            "MSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentMSecondary,
            "SSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentSSecondary,
            "XsSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentXsSecondary,
            "LSecondaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentLSecondary,
            "MSecondaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentMSecondaryPilled,
            "SSecondaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentSSecondaryPilled,
            "XsSecondaryPilled" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SegmentXsSecondaryPilled,
        )
}
