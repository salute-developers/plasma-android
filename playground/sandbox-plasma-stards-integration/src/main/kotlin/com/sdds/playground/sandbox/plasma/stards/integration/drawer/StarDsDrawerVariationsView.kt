package com.sdds.playground.sandbox.plasma.stards.integration.drawer

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsDrawerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "NoBackground" to s.Sdkit_StarDs_ComponentOverlays_DrawerNoBackground,
            "HasBackground" to s.Sdkit_StarDs_ComponentOverlays_DrawerHasBackground,
        )
}
