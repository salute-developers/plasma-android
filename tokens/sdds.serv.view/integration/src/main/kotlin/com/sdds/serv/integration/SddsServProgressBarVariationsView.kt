// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.sandbox.AndroidViewStyleProvider
import com.sdds.sandbox.AndroidViewStyleReference
import com.sdds.sandbox.viewStyleReference
import com.sdds.serv.R as DsR

internal object SddsServProgressBarVariationsView : AndroidViewStyleProvider() {
    override val variations: Map<String, AndroidViewStyleReference> =
        mapOf(
            ".Default" to viewStyleReference(DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarDefault),
            ".Secondary" to viewStyleReference(DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarSecondary),
            ".Accent" to viewStyleReference(DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarAccent),
            ".Gradient" to viewStyleReference(DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarGradient),
            ".Info" to viewStyleReference(DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarInfo),
            ".Negative" to viewStyleReference(DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarNegative),
            ".Positive" to viewStyleReference(DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarPositive),
            ".Warning" to viewStyleReference(DsR.style.Serv_Sdds_ComponentOverlays_ProgressBarWarning),
        )
}
