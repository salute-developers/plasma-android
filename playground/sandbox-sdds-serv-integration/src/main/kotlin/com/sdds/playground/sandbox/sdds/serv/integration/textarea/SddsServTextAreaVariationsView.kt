package com.sdds.playground.sandbox.sdds.serv.integration.textarea

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.colorstate.TextAreaColorState
import com.sdds.uikit.colorstate.ColorState

@Suppress("MaxLineLength")
internal object SddsServTextAreaVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaL,
            "LRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaLRequiredStart,
            "LRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaLRequiredEnd,
            "LOuterLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaLOuterLabel,
            "LOuterLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaLOuterLabelRequiredStart,
            "LOuterLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaLOuterLabelRequiredEnd,
            "LInnerLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaLInnerLabel,
            "LInnerLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
            "LInnerLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaLInnerLabelRequiredEnd,
            "M" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaM,
            "MRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaMRequiredStart,
            "MRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaMRequiredEnd,
            "MOuterLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaMOuterLabel,
            "MOuterLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaMOuterLabelRequiredStart,
            "MOuterLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaMOuterLabelRequiredEnd,
            "MInnerLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaMInnerLabel,
            "MInnerLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaMInnerLabelRequiredStart,
            "MInnerLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaMInnerLabelRequiredEnd,
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaS,
            "SRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaSRequiredStart,
            "SRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaSRequiredEnd,
            "SOuterLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaSOuterLabel,
            "SOuterLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaSOuterLabelRequiredStart,
            "SOuterLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaSOuterLabelRequiredEnd,
            "SInnerLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaSInnerLabel,
            "SInnerLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaSInnerLabelRequiredStart,
            "SInnerLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
            "XS" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaXs,
            "XSRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaXsRequiredStart,
            "XSRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaXsRequiredEnd,
            "XSOuterLabel" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaXsOuterLabel,
            "XSOuterLabelRequiredStart" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaXsOuterLabelRequiredStart,
            "XSOuterLabelRequiredEnd" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_TextAreaXsOuterLabelRequiredEnd,
        )

    override val colorVariations: Map<String, ColorState>
        get() = mapOf(
            "Default" to TextAreaColorState.DEFAULT,
            "Warning" to TextAreaColorState.WARNING,
            "Error" to TextAreaColorState.ERROR,
        )
}