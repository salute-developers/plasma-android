package com.sdds.playground.sandbox.sdds.serv.integration.modal

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServModalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to s.Serv_Sdds_ComponentOverlays_Modal,
        )
}
