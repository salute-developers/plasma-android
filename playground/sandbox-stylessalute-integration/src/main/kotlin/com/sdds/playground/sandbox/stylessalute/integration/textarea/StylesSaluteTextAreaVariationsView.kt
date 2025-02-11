package com.sdds.playground.sandbox.stylessalute.integration.textarea

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s
import com.sdds.uikit.colorstate.ColorState
import com.stylessalute.colorstate.TextAreaColorState

internal object StylesSaluteTextAreaVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "L" to s.Salute_StylesSalute_ComponentOverlays_TextAreaL,
        "LRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaLRequiredStart,
        "LRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaLRequiredEnd,
        "LOuterLabel" to s.Salute_StylesSalute_ComponentOverlays_TextAreaLOuterLabel,
        "LOuterLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaLOuterLabelRequiredStart,
        "LOuterLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaLOuterLabelRequiredEnd,
        "LInnerLabel" to s.Salute_StylesSalute_ComponentOverlays_TextAreaLInnerLabel,
        "LInnerLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
        "LInnerLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaLInnerLabelRequiredEnd,
        "M" to s.Salute_StylesSalute_ComponentOverlays_TextAreaM,
        "MRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaMRequiredStart,
        "MRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaMRequiredEnd,
        "MOuterLabel" to s.Salute_StylesSalute_ComponentOverlays_TextAreaMOuterLabel,
        "MOuterLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaMOuterLabelRequiredStart,
        "MOuterLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaMOuterLabelRequiredEnd,
        "MInnerLabel" to s.Salute_StylesSalute_ComponentOverlays_TextAreaMInnerLabel,
        "MInnerLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaMInnerLabelRequiredStart,
        "MInnerLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaMInnerLabelRequiredEnd,
        "S" to s.Salute_StylesSalute_ComponentOverlays_TextAreaS,
        "SRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaSRequiredStart,
        "SRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaSRequiredEnd,
        "SOuterLabel" to s.Salute_StylesSalute_ComponentOverlays_TextAreaSOuterLabel,
        "SOuterLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaSOuterLabelRequiredStart,
        "SOuterLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaSOuterLabelRequiredEnd,
        "SInnerLabel" to s.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabel,
        "SInnerLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabelRequiredStart,
        "SInnerLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
        "XS" to s.Salute_StylesSalute_ComponentOverlays_TextAreaXs,
        "XSRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaXsRequiredStart,
        "XSRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaXsRequiredEnd,
        "XSOuterLabel" to s.Salute_StylesSalute_ComponentOverlays_TextAreaXsOuterLabel,
        "XSOuterLabelRequiredStart" to s.Salute_StylesSalute_ComponentOverlays_TextAreaXsOuterLabelRequiredStart,
        "XSOuterLabelRequiredEnd" to s.Salute_StylesSalute_ComponentOverlays_TextAreaXsOuterLabelRequiredEnd,
    )

    override val colorVariations: Map<String, ColorState>
        get() = mapOf(
            "Default" to TextAreaColorState.DEFAULT,
            "Warning" to TextAreaColorState.WARNING,
            "Error" to TextAreaColorState.ERROR,
        )
}
