package com.sdds.playground.sandbox.plasma.stards.integration.divider

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsDividerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to s.Sdkit_StarDs_ComponentOverlays_Divider,
        )
}
