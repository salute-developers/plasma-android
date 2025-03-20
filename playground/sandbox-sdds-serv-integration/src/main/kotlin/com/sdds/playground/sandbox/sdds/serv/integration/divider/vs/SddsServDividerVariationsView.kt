package com.sdds.playground.sandbox.sdds.serv.integration.divider.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServDividerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to s.Serv_Sdds_ComponentOverlays_Divider,
        )
}
