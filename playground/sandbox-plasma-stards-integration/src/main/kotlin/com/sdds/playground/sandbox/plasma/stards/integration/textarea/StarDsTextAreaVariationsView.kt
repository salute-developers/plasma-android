package com.sdds.playground.sandbox.plasma.stards.integration.textarea

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s
import com.sdds.uikit.colorstate.ColorState
import com.sdkit.star.designsystem.colorstate.TextAreaColorState

internal object StarDsTextAreaVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Sdkit_StarDs_ComponentOverlays_TextAreaM,
            "MOuterLabel" to s.Sdkit_StarDs_ComponentOverlays_TextAreaMOuterLabel,
            "MInnerLabel" to s.Sdkit_StarDs_ComponentOverlays_TextAreaMInnerLabel,
            "S" to s.Sdkit_StarDs_ComponentOverlays_TextAreaS,
            "SOuterLabel" to s.Sdkit_StarDs_ComponentOverlays_TextAreaSOuterLabel,
            "SInnerLabel" to s.Sdkit_StarDs_ComponentOverlays_TextAreaSInnerLabel,
            "XS" to s.Sdkit_StarDs_ComponentOverlays_TextAreaXs,
            "XSOuterLabel" to s.Sdkit_StarDs_ComponentOverlays_TextAreaXsOuterLabel,
        )

    override val colorVariations: Map<String, ColorState> =
        mapOf(
            "Default" to TextAreaColorState.DEFAULT,
            "Error" to TextAreaColorState.ERROR,
        )
}
