package com.sdds.playground.sandbox.plasma.sd.service.integration.textskeleton

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceTextSkeletonVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to s.Plasma_SdService_ComponentOverlays_TextSkeleton,
        )
}
