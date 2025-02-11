package com.sdds.playground.sandbox.stylessalute.integration.checkbox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object StylesSaluteCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_CheckBoxM,
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_CheckBoxS,
        )
}
