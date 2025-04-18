package com.sdds.playground.sandbox.plasma.stards.integration.checkbox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsCheckBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Sdkit_StarDs_ComponentOverlays_CheckBoxGroupM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_CheckBoxGroupS,
        )
}
