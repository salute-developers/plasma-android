// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.sandbox.AndroidViewStyleProvider
import com.sdds.sandbox.AndroidViewStyleReference
import com.sdds.sandbox.viewStyleReference
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsProgressBarVariationsView : AndroidViewStyleProvider() {
    override val variations: Map<String, AndroidViewStyleReference> =
        mapOf(
            ".Default" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarDefault),
            ".Secondary" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarSecondary),
            ".Accent" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarAccent),
            ".Gradient" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarGradient),
            ".Info" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarInfo),
            ".Negative" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarNegative),
            ".Positive" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarPositive),
            ".Warning" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarWarning),
        )
}
