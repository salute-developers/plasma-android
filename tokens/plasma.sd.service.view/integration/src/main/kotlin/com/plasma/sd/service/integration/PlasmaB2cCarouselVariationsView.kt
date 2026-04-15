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

internal object PlasmaB2cCarouselVariationsView : AndroidViewStyleProvider() {
    override val variations: Map<String, AndroidViewStyleReference> =
        mapOf(
            "ButtonsPlacementInner" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_CarouselButtonsPlacementInner),
            "ButtonsPlacementOuter" to viewStyleReference(DsR.style.Plasma_SdService_ComponentOverlays_CarouselButtonsPlacementOuter),
        )
}
