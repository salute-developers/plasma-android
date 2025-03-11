package com.sdds.playground.sandbox.plasma.stards.integration.radiobox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsRadioBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Sdkit_StarDs_ComponentOverlays_RadioBoxGroupM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_RadioBoxGroupS,
        )
}
