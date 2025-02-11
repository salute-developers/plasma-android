package com.sdds.playground.sandbox.sdds.serv.integration.textfield

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.colorstate.TextFieldColorState
import com.sdds.uikit.colorstate.ColorState

@Suppress("MaxLineLength")
internal object SddsServTextFieldVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState>
        get() = mapOf(
            "Default" to TextFieldColorState.DEFAULT,
            "Success" to TextFieldColorState.SUCCESS,
            "Warning" to TextFieldColorState.WARNING,
            "Error" to TextFieldColorState.ERROR,
        )

    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldL,
            "LRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldLRequiredStart,
            "LRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldLRequiredEnd,
            "LOuterLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabel,
            "LOuterLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
            "LOuterLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabelRequiredEnd,
            "LInnerLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabel,
            "LInnerLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
            "LInnerLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabelRequiredEnd,
            "M" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldM,
            "MRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldMRequiredStart,
            "MRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldMRequiredEnd,
            "MOuterLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabel,
            "MOuterLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabelRequiredStart,
            "MOuterLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabelRequiredEnd,
            "MInnerLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabel,
            "MInnerLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabelRequiredStart,
            "MInnerLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabelRequiredEnd,
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldS,
            "SRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldSRequiredStart,
            "SRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldSRequiredEnd,
            "SOuterLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabel,
            "SOuterLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabelRequiredStart,
            "SOuterLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
            "SInnerLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabel,
            "SInnerLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabelRequiredStart,
            "SInnerLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
            "Xs" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldXs,
            "XsRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldXsRequiredStart,
            "XsRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldXsRequiredEnd,
            "XsOuterLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabel,
            "XsOuterLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabelRequiredStart,
            "XsOuterLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabelRequiredEnd,
        )
}