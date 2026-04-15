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

internal object PlasmaB2cProgressBarVariationsView : AndroidViewStyleProvider() {
    override val variations: Map<String, AndroidViewStyleReference> =
        mapOf(
            ".Default" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarDefault),
            ".Secondary" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarSecondary),
            ".Accent" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarAccent),
            ".Gradient" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarGradient),
            ".Info" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarInfo),
            ".Negative" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarNegative),
            ".Positive" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarPositive),
            ".Warning" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_ProgressBarWarning),
        )
}
