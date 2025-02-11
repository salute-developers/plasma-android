package com.sdds.playground.sandbox.stylessalute.integration.textfield

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.uikit.colorstate.ColorState
import com.stylessalute.colorstate.TextFieldColorState

@Suppress("MaxLineLength")
internal object StylesSaluteTextFieldVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState>
        get() = mapOf(
            "Default" to TextFieldColorState.DEFAULT,
            "Success" to TextFieldColorState.SUCCESS,
            "Warning" to TextFieldColorState.WARNING,
            "Error" to TextFieldColorState.ERROR,
        )

    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldL,
            "LRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLRequiredStart,
            "LRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLRequiredEnd,
            "LOuterLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabel,
            "LOuterLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
            "LOuterLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLOuterLabelRequiredEnd,
            "LInnerLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabel,
            "LInnerLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
            "LInnerLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldLInnerLabelRequiredEnd,
            "M" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldM,
            "MRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMRequiredStart,
            "MRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMRequiredEnd,
            "MOuterLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabel,
            "MOuterLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabelRequiredStart,
            "MOuterLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMOuterLabelRequiredEnd,
            "MInnerLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMInnerLabel,
            "MInnerLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMInnerLabelRequiredStart,
            "MInnerLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldMInnerLabelRequiredEnd,
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldS,
            "SRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSRequiredStart,
            "SRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSRequiredEnd,
            "SOuterLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSOuterLabel,
            "SOuterLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSOuterLabelRequiredStart,
            "SOuterLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
            "SInnerLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSInnerLabel,
            "SInnerLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSInnerLabelRequiredStart,
            "SInnerLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
            "Xs" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXs,
            "XsRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXsRequiredStart,
            "XsRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXsRequiredEnd,
            "XsOuterLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXsOuterLabel,
            "XsOuterLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXsOuterLabelRequiredStart,
            "XsOuterLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextFieldXsOuterLabelRequiredEnd,
        )
}