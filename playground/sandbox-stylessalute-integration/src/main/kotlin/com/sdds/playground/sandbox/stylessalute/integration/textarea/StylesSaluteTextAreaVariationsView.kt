package com.sdds.playground.sandbox.stylessalute.integration.textarea

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.uikit.colorstate.ColorState
import com.stylessalute.colorstate.TextAreaColorState

@Suppress("MaxLineLength")
internal object StylesSaluteTextAreaVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaL,
            "LRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLRequiredStart,
            "LRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLRequiredEnd,
            "LOuterLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLOuterLabel,
            "LOuterLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLOuterLabelRequiredStart,
            "LOuterLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLOuterLabelRequiredEnd,
            "LInnerLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLInnerLabel,
            "LInnerLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
            "LInnerLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaLInnerLabelRequiredEnd,
            "M" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaM,
            "MRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMRequiredStart,
            "MRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMRequiredEnd,
            "MOuterLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMOuterLabel,
            "MOuterLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMOuterLabelRequiredStart,
            "MOuterLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMOuterLabelRequiredEnd,
            "MInnerLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMInnerLabel,
            "MInnerLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMInnerLabelRequiredStart,
            "MInnerLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaMInnerLabelRequiredEnd,
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaS,
            "SRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSRequiredStart,
            "SRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSRequiredEnd,
            "SOuterLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSOuterLabel,
            "SOuterLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSOuterLabelRequiredStart,
            "SOuterLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSOuterLabelRequiredEnd,
            "SInnerLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabel,
            "SInnerLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabelRequiredStart,
            "SInnerLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
            "XS" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaXs,
            "XSRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaXsRequiredStart,
            "XSRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaXsRequiredEnd,
            "XSOuterLabel" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaXsOuterLabel,
            "XSOuterLabelRequiredStart" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaXsOuterLabelRequiredStart,
            "XSOuterLabelRequiredEnd" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_TextAreaXsOuterLabelRequiredEnd,
        )

    override val colorVariations: Map<String, ColorState>
        get() = mapOf(
            "Default" to TextAreaColorState.DEFAULT,
            "Warning" to TextAreaColorState.WARNING,
            "Error" to TextAreaColorState.ERROR,
        )
}