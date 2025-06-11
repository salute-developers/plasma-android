package com.sdds.playground.sandbox.plasma.sd.service.integration.toast

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceToastVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "RoundedDefault" to s.Plasma_SdService_ComponentOverlays_ToastRoundedDefault,
            "RoundedPositive" to s.Plasma_SdService_ComponentOverlays_ToastRoundedPositive,
            "RoundedNegative" to s.Plasma_SdService_ComponentOverlays_ToastRoundedNegative,
            "PilledDefault" to s.Plasma_SdService_ComponentOverlays_ToastPilledDefault,
            "PilledPositive" to s.Plasma_SdService_ComponentOverlays_ToastPilledPositive,
            "PilledNegative" to s.Plasma_SdService_ComponentOverlays_ToastPilledNegative,
        )
}
