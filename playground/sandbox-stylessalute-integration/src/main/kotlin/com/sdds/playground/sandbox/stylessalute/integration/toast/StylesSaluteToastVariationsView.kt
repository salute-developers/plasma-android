package com.sdds.playground.sandbox.stylessalute.integration.toast

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteToastVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Rounded" to s.Salute_StylesSalute_ComponentOverlays_ToastRounded,
            "Pilled" to s.Salute_StylesSalute_ComponentOverlays_ToastPilled,
        )
}
