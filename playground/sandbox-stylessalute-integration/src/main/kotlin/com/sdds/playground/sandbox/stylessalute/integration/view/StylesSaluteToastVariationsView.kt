package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteToastVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Rounded" to DsR.style.Salute_StylesSalute_ComponentOverlays_ToastRounded,
            "Pilled" to DsR.style.Salute_StylesSalute_ComponentOverlays_ToastPilled,
        )
}
