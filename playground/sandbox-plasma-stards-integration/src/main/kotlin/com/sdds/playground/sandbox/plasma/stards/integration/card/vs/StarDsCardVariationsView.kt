package com.sdds.playground.sandbox.plasma.stards.integration.card.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsCardVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "HorizontalXs" to s.Sdkit_StarDs_ComponentOverlays_CardHorizontalXs,
            "HorizontalS" to s.Sdkit_StarDs_ComponentOverlays_CardHorizontalS,
            "SquareXs" to s.Sdkit_StarDs_ComponentOverlays_CardSquareXs,
            "SquareL" to s.Sdkit_StarDs_ComponentOverlays_CardSquareL,
            "VerticalS" to s.Sdkit_StarDs_ComponentOverlays_CardVerticalS,
            "VerticalM" to s.Sdkit_StarDs_ComponentOverlays_CardVerticalM,
        )
}
