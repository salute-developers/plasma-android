package com.sdds.playground.sandbox.stylessalute.integration.checkbox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object StylesSaluteCheckBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_CheckBoxGroupM,
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_CheckBoxGroupS,
        )
}
