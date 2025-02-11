package com.sdds.playground.sandbox.sdds.serv.integration.segment.item

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServSegmentItemVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentItem_LPrimary,
            "LSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentItem_LSecondary,
            "LDefault" to s.Serv_Sdds_ComponentOverlays_SegmentItem_LDefault,
            "LPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentItem_LPrimaryPilled,
            "LSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentItem_LSecondaryPilled,
            "MPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentItem_MPrimary,
            "MSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentItem_MSecondary,
            "MDefault" to s.Serv_Sdds_ComponentOverlays_SegmentItem_MDefault,
            "MPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentItem_MPrimaryPilled,
            "MSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentItem_MSecondaryPilled,
            "SPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentItem_SPrimary,
            "SSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentItem_SSecondary,
            "SDefault" to s.Serv_Sdds_ComponentOverlays_SegmentItem_SDefault,
            "SPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentItem_SPrimaryPilled,
            "SSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentItem_SSecondaryPilled,
            "XsPrimary" to s.Serv_Sdds_ComponentOverlays_SegmentItem_XsPrimary,
            "XsSecondary" to s.Serv_Sdds_ComponentOverlays_SegmentItem_XsSecondary,
            "XsDefault" to s.Serv_Sdds_ComponentOverlays_SegmentItem_XsDefault,
            "XsPrimaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentItem_XsPrimaryPilled,
            "XsSecondaryPilled" to s.Serv_Sdds_ComponentOverlays_SegmentItem_XsSecondaryPilled,
        )
}
