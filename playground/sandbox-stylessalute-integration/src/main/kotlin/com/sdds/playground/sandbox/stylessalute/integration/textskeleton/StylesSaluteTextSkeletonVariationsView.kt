package com.sdds.playground.sandbox.stylessalute.integration.textskeleton

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteTextSkeletonVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to s.Salute_StylesSalute_ComponentOverlays_TextSkeleton,
        )
}
