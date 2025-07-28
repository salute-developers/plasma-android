package com.sdds.playground.sandbox.stylessalute.integration.scrollbar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteScrollBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Salute_StylesSalute_ComponentOverlays_ScrollBarM,
            "S" to s.Salute_StylesSalute_ComponentOverlays_ScrollBarS,
        )
}
