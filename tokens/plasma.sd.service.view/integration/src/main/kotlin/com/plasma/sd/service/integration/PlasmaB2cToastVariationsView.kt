// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.plasma.sd.service.integration

import com.sdds.sandbox.AndroidViewStyleProvider
import com.sdds.sandbox.AndroidViewStyleReference
import com.sdds.sandbox.viewStyleReference
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cToastVariationsView : AndroidViewStyleProvider() {
    override val variations: Map<String, AndroidViewStyleReference> =
        mapOf(
            "Rounded" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ToastRounded),
            "Rounded.Default" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ToastRoundedDefault),
            "Rounded.Positive" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ToastRoundedPositive),
            "Rounded.Negative" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ToastRoundedNegative),
            "Pilled" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ToastPilled),
            "Pilled.Default" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ToastPilledDefault),
            "Pilled.Positive" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ToastPilledPositive),
            "Pilled.Negative" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ToastPilledNegative),
        )
}
