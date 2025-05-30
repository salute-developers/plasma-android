package com.sdds.playground.sandbox.sdds.serv.integration.toast

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServToastVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "RoundedDefault" to s.Serv_Sdds_ComponentOverlays_ToastRoundedDefault,
            "RoundedPositive" to s.Serv_Sdds_ComponentOverlays_ToastRoundedPositive,
            "RoundedNegative" to s.Serv_Sdds_ComponentOverlays_ToastRoundedNegative,
            "PilledDefault" to s.Serv_Sdds_ComponentOverlays_ToastPilledDefault,
            "PilledPositive" to s.Serv_Sdds_ComponentOverlays_ToastPilledPositive,
            "PilledNegative" to s.Serv_Sdds_ComponentOverlays_ToastPilledNegative,
        )
}
