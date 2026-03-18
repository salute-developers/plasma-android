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

internal object PlasmaStardsDrawerVariationsView : AndroidViewStyleProvider() {
    override val variations: Map<String, AndroidViewStyleReference> =
        mapOf(
            "HasBackground" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_DrawerHasBackground),
            "NoBackground" to viewStyleReference(DsR.style.Sdkit_StarDs_ComponentOverlays_DrawerNoBackground),
        )
}
