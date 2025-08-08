package com.sdds.playground.sandbox.sdds.serv.integration.buttongroup

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServBasicButtonGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LWideDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupLWideDefault,
            "LWideSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupLWideSegmented,
            "LDenseDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupLDenseDefault,
            "LDenseSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupLDenseSegmented,
            "LNoGapDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupLNoGapDefault,
            "LNoGapSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupLNoGapSegmented,

            "MWideDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupMWideDefault,
            "MWideSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupMWideSegmented,
            "MDenseDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupMDenseDefault,
            "MDenseSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupMDenseSegmented,
            "MNoGapDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupMNoGapDefault,
            "MNoGapSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupMNoGapSegmented,

            "SWideDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupSWideDefault,
            "SWideSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupSWideSegmented,
            "SDenseDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupSDenseDefault,
            "SDenseSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupSDenseSegmented,
            "SNoGapDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupSNoGapDefault,
            "SNoGapSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupSNoGapSegmented,

            "XsWideDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXsWideDefault,
            "XsWideSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXsWideSegmented,
            "XsDenseDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXsDenseDefault,
            "XsDenseSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXsDenseSegmented,
            "XsNoGapDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXsNoGapDefault,
            "XsNoGapSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXsNoGapSegmented,

            "XxsWideDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXxsWideDefault,
            "XxsWideSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXxsWideSegmented,
            "XxsDenseDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXxsDenseDefault,
            "XxsDenseSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXxsDenseSegmented,
            "XxsNoGapDefault" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXxsNoGapDefault,
            "XxsNoGapSegmented" to s.Serv_Sdds_ComponentOverlays_BasicButtonGroupXxsNoGapSegmented,
        )
}
