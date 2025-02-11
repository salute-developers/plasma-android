package com.sdds.playground.sandbox.stylessalute.integration.textfield

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s
import com.sdds.uikit.colorstate.ColorState
import com.stylessalute.colorstate.TextFieldColorState

internal object StylesSaluteTextFieldVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState> = mapOf(
        "Default" to TextFieldColorState.DEFAULT,
        "Success" to TextFieldColorState.SUCCESS,
        "Warning" to TextFieldColorState.WARNING,
        "Error" to TextFieldColorState.ERROR,
    )

    override val variations: Map<String, Int> = mapOf(
        "L" to s.Salute_StylesSalute_ComponentOverlays_TextFieldL,
        "LRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldLRequiredStart,
        "LRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldLRequiredEnd,
        "LOuterLabel" to s.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabel,
        "LOuterLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
        "LOuterLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabelRequiredEnd,
        "LInnerLabel" to s.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabel,
        "LInnerLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
        "LInnerLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabelRequiredEnd,
        "M" to s.Salute_StylesSalute_ComponentOverlays_TextFieldM,
        "MRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldMRequiredStart,
        "MRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldMRequiredEnd,
        "MOuterLabel" to s.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabel,
        "MOuterLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabelRequiredStart,
        "MOuterLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabelRequiredEnd,
        "MInnerLabel" to s.Salute_StylesSalute_ComponentOverlays_TextFieldMInnerLabel,
        "MInnerLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldMInnerLabelRequiredStart,
        "MInnerLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldMInnerLabelRequiredEnd,
        "S" to s.Salute_StylesSalute_ComponentOverlays_TextFieldS,
        "SRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldSRequiredStart,
        "SRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldSRequiredEnd,
        "SOuterLabel" to s.Salute_StylesSalute_ComponentOverlays_TextFieldSOuterLabel,
        "SOuterLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldSOuterLabelRequiredStart,
        "SOuterLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
        "SInnerLabel" to s.Salute_StylesSalute_ComponentOverlays_TextFieldSInnerLabel,
        "SInnerLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldSInnerLabelRequiredStart,
        "SInnerLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
        "Xs" to s.Salute_StylesSalute_ComponentOverlays_TextFieldXs,
        "XsRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldXsRequiredStart,
        "XsRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldXsRequiredEnd,
        "XsOuterLabel" to s.Salute_StylesSalute_ComponentOverlays_TextFieldXsOuterLabel,
        "XsOuterLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextFieldXsOuterLabelRequiredStart,
        "XsOuterLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextFieldXsOuterLabelRequiredEnd,
    )
}
