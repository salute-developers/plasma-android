package com.sdds.playground.sandbox.sdds.serv.integration.segment

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServSegmentVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "XlPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentXlPrimary,
            "LPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentLPrimary,
            "MPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentMPrimary,
            "SPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentSPrimary,
            "XsPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentXsPrimary,
            "XlPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentXlPilledPrimary,
            "LPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentLPilledPrimary,
            "MPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentMPilledPrimary,
            "SPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentSPilledPrimary,
            "XsPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentXsPilledPrimary,
            "XlSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentXlSecondary,
            "LSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentLSecondary,
            "MSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentMSecondary,
            "SSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentSSecondary,
            "XsSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentXsSecondary,
            "XlSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentXlPilledSecondary,
            "LSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentLPilledSecondary,
            "MSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentMPilledSecondary,
            "SSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentSPilledSecondary,
            "XsSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentXsPilledSecondary,
            "XlAccent" to s.Serv_Sdds_ComponentOverlays_SegmentXlAccent,
            "LAccent" to s.Serv_Sdds_ComponentOverlays_SegmentLAccent,
            "MAccent" to s.Serv_Sdds_ComponentOverlays_SegmentMAccent,
            "SAccent" to s.Serv_Sdds_ComponentOverlays_SegmentSAccent,
            "XsAccent" to s.Serv_Sdds_ComponentOverlays_SegmentXsAccent,
            "XlAccentPilled" to s.Serv_Sdds_ComponentOverlays_SegmentXlPilledAccent,
            "LAccentPilled" to s.Serv_Sdds_ComponentOverlays_SegmentLPilledAccent,
            "MAccentPilled" to s.Serv_Sdds_ComponentOverlays_SegmentMPilledAccent,
            "SAccentPilled" to s.Serv_Sdds_ComponentOverlays_SegmentSPilledAccent,
            "XsAccentPilled" to s.Serv_Sdds_ComponentOverlays_SegmentXsPilledAccent,
        )
}
