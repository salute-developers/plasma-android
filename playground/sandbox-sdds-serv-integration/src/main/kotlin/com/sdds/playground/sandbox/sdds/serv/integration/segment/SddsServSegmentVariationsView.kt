package com.sdds.playground.sandbox.sdds.serv.integration.segment

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServSegmentVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentLPrimary,
            "MPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentMPrimary,
            "SPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentSPrimary,
            "XsPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentXsPrimary,
            "LPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentLPrimaryPilled,
            "MPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentMPrimaryPilled,
            "SPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentSPrimaryPilled,
            "XsPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentXsPrimaryPilled,
            "LSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentLSecondary,
            "MSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentMSecondary,
            "SSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentSSecondary,
            "XsSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentXsSecondary,
            "LSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentLSecondary,
            "MSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentMSecondaryPilled,
            "SSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentSSecondaryPilled,
            "XsSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentXsSecondaryPilled,
        )
}
