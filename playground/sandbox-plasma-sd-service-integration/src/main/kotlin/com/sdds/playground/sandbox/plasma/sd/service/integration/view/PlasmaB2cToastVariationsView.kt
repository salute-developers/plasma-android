package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cToastVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Rounded" to DsR.style.Plasma_SdService_ComponentOverlays_ToastRounded,
            "Rounded.Default" to DsR.style.Plasma_SdService_ComponentOverlays_ToastRoundedDefault,
            "Rounded.Positive" to DsR.style.Plasma_SdService_ComponentOverlays_ToastRoundedPositive,
            "Rounded.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_ToastRoundedNegative,
            "Pilled" to DsR.style.Plasma_SdService_ComponentOverlays_ToastPilled,
            "Pilled.Default" to DsR.style.Plasma_SdService_ComponentOverlays_ToastPilledDefault,
            "Pilled.Positive" to DsR.style.Plasma_SdService_ComponentOverlays_ToastPilledPositive,
            "Pilled.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_ToastPilledNegative,
        )
}
