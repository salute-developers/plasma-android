package com.sdds.playground.sandbox.sdds.serv.integration.textfield

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s
import com.sdds.serv.colorstate.TextFieldColorState
import com.sdds.uikit.colorstate.ColorState

internal object SddsServTextFieldVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState> = mapOf(
        "Default" to TextFieldColorState.DEFAULT,
        "Success" to TextFieldColorState.SUCCESS,
        "Warning" to TextFieldColorState.WARNING,
        "Error" to TextFieldColorState.ERROR,
    )

    override val variations: Map<String, Int> = mapOf(
        "XL" to s.Serv_Sdds_ComponentOverlays_TextFieldXl,
        "XLRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldXlRequiredStart,
        "XLRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldXlRequiredEnd,
        "XLOuterLabel" to s.Serv_Sdds_ComponentOverlays_TextFieldXlOuterLabel,
        "XLOuterLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldXlOuterLabelRequiredStart,
        "XLOuterLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldXlOuterLabelRequiredEnd,
        "XLInnerLabel" to s.Serv_Sdds_ComponentOverlays_TextFieldXlInnerLabel,
        "XLInnerLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldXlInnerLabelRequiredStart,
        "XLInnerLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldXlInnerLabelRequiredEnd,
        "L" to s.Serv_Sdds_ComponentOverlays_TextFieldL,
        "LRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldLRequiredStart,
        "LRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldLRequiredEnd,
        "LOuterLabel" to s.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabel,
        "LOuterLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
        "LOuterLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldLOuterLabelRequiredEnd,
        "LInnerLabel" to s.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabel,
        "LInnerLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
        "LInnerLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldLInnerLabelRequiredEnd,
        "M" to s.Serv_Sdds_ComponentOverlays_TextFieldM,
        "MRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldMRequiredStart,
        "MRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldMRequiredEnd,
        "MOuterLabel" to s.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabel,
        "MOuterLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabelRequiredStart,
        "MOuterLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldMOuterLabelRequiredEnd,
        "MInnerLabel" to s.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabel,
        "MInnerLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabelRequiredStart,
        "MInnerLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldMInnerLabelRequiredEnd,
        "S" to s.Serv_Sdds_ComponentOverlays_TextFieldS,
        "SRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldSRequiredStart,
        "SRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldSRequiredEnd,
        "SOuterLabel" to s.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabel,
        "SOuterLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabelRequiredStart,
        "SOuterLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
        "SInnerLabel" to s.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabel,
        "SInnerLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabelRequiredStart,
        "SInnerLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
        "Xs" to s.Serv_Sdds_ComponentOverlays_TextFieldXs,
        "XsRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldXsRequiredStart,
        "XsRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldXsRequiredEnd,
        "XsOuterLabel" to s.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabel,
        "XsOuterLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabelRequiredStart,
        "XsOuterLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextFieldXsOuterLabelRequiredEnd,
    )
}
