package com.sdds.playground.sandbox.plasma.stards.integration.textfield

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s
import com.sdds.uikit.colorstate.ColorState
import com.sdkit.star.designsystem.colorstate.TextFieldColorState

internal object StarDsTextFieldVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState> =
        mapOf(
            "Default" to TextFieldColorState.DEFAULT,
            "Error" to TextFieldColorState.ERROR,
        )

    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Sdkit_StarDs_ComponentOverlays_TextFieldM,
            "MOuterLabel" to s.Sdkit_StarDs_ComponentOverlays_TextFieldMOuterLabel,
            "MInnerLabel" to s.Sdkit_StarDs_ComponentOverlays_TextFieldMInnerLabel,
            "S" to s.Sdkit_StarDs_ComponentOverlays_TextFieldS,
            "SOuterLabel" to s.Sdkit_StarDs_ComponentOverlays_TextFieldSOuterLabel,
            "SInnerLabel" to s.Sdkit_StarDs_ComponentOverlays_TextFieldSInnerLabel,
            "Xs" to s.Sdkit_StarDs_ComponentOverlays_TextFieldXs,
            "XsOuterLabel" to s.Sdkit_StarDs_ComponentOverlays_TextFieldXsOuterLabel,
        )
}
