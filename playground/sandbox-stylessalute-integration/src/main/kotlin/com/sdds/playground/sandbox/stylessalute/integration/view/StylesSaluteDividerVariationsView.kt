package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteDividerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_Divider,
        )
}
