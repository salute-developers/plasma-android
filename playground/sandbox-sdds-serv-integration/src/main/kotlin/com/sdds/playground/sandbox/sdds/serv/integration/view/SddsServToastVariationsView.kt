package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServToastVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Rounded" to DsR.style.Serv_Sdds_ComponentOverlays_ToastRounded,
            "Rounded.Default" to DsR.style.Serv_Sdds_ComponentOverlays_ToastRoundedDefault,
            "Rounded.Positive" to DsR.style.Serv_Sdds_ComponentOverlays_ToastRoundedPositive,
            "Rounded.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_ToastRoundedNegative,
            "Pilled" to DsR.style.Serv_Sdds_ComponentOverlays_ToastPilled,
            "Pilled.Default" to DsR.style.Serv_Sdds_ComponentOverlays_ToastPilledDefault,
            "Pilled.Positive" to DsR.style.Serv_Sdds_ComponentOverlays_ToastPilledPositive,
            "Pilled.Negative" to DsR.style.Serv_Sdds_ComponentOverlays_ToastPilledNegative,
        )
}
