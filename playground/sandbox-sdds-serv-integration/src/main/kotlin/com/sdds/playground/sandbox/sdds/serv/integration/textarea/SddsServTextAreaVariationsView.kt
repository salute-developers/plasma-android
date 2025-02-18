package com.sdds.playground.sandbox.sdds.serv.integration.textarea

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s
import com.sdds.serv.colorstate.TextAreaColorState
import com.sdds.uikit.colorstate.ColorState

internal object SddsServTextAreaVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "L" to s.Serv_Sdds_ComponentOverlays_TextAreaL,
        "LRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaLRequiredStart,
        "LRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaLRequiredEnd,
        "LOuterLabel" to s.Serv_Sdds_ComponentOverlays_TextAreaLOuterLabel,
        "LOuterLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaLOuterLabelRequiredStart,
        "LOuterLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaLOuterLabelRequiredEnd,
        "LInnerLabel" to s.Serv_Sdds_ComponentOverlays_TextAreaLInnerLabel,
        "LInnerLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
        "LInnerLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaLInnerLabelRequiredEnd,
        "M" to s.Serv_Sdds_ComponentOverlays_TextAreaM,
        "MRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaMRequiredStart,
        "MRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaMRequiredEnd,
        "MOuterLabel" to s.Serv_Sdds_ComponentOverlays_TextAreaMOuterLabel,
        "MOuterLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaMOuterLabelRequiredStart,
        "MOuterLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaMOuterLabelRequiredEnd,
        "MInnerLabel" to s.Serv_Sdds_ComponentOverlays_TextAreaMInnerLabel,
        "MInnerLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaMInnerLabelRequiredStart,
        "MInnerLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaMInnerLabelRequiredEnd,
        "S" to s.Serv_Sdds_ComponentOverlays_TextAreaS,
        "SRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaSRequiredStart,
        "SRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaSRequiredEnd,
        "SOuterLabel" to s.Serv_Sdds_ComponentOverlays_TextAreaSOuterLabel,
        "SOuterLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaSOuterLabelRequiredStart,
        "SOuterLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaSOuterLabelRequiredEnd,
        "SInnerLabel" to s.Serv_Sdds_ComponentOverlays_TextAreaSInnerLabel,
        "SInnerLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaSInnerLabelRequiredStart,
        "SInnerLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
        "XS" to s.Serv_Sdds_ComponentOverlays_TextAreaXs,
        "XSRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaXsRequiredStart,
        "XSRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaXsRequiredEnd,
        "XSOuterLabel" to s.Serv_Sdds_ComponentOverlays_TextAreaXsOuterLabel,
        "XSOuterLabelRequiredStart" to s.Serv_Sdds_ComponentOverlays_TextAreaXsOuterLabelRequiredStart,
        "XSOuterLabelRequiredEnd" to s.Serv_Sdds_ComponentOverlays_TextAreaXsOuterLabelRequiredEnd,
    )

    override val colorVariations: Map<String, ColorState> = mapOf(
        "Default" to TextAreaColorState.DEFAULT,
        "Warning" to TextAreaColorState.WARNING,
        "Error" to TextAreaColorState.ERROR,
    )
}
