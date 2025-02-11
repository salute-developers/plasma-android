package com.sdds.playground.sandbox.plasma.sd.service.integration.textarea

import com.sdds.plasma.sd.service.colorstate.TextAreaColorState
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s
import com.sdds.uikit.colorstate.ColorState

internal object PlasmaSdServiceTextAreaVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_TextAreaL,
            "LRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaLRequiredStart,
            "LRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaLRequiredEnd,
            "LOuterLabel" to s.Plasma_SdService_ComponentOverlays_TextAreaLOuterLabel,
            "LOuterLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaLOuterLabelRequiredStart,
            "LOuterLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaLOuterLabelRequiredEnd,
            "LInnerLabel" to s.Plasma_SdService_ComponentOverlays_TextAreaLInnerLabel,
            "LInnerLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
            "LInnerLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaLInnerLabelRequiredEnd,
            "M" to s.Plasma_SdService_ComponentOverlays_TextAreaM,
            "MRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaMRequiredStart,
            "MRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaMRequiredEnd,
            "MOuterLabel" to s.Plasma_SdService_ComponentOverlays_TextAreaMOuterLabel,
            "MOuterLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaMOuterLabelRequiredStart,
            "MOuterLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaMOuterLabelRequiredEnd,
            "MInnerLabel" to s.Plasma_SdService_ComponentOverlays_TextAreaMInnerLabel,
            "MInnerLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaMInnerLabelRequiredStart,
            "MInnerLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaMInnerLabelRequiredEnd,
            "S" to s.Plasma_SdService_ComponentOverlays_TextAreaS,
            "SRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaSRequiredStart,
            "SRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaSRequiredEnd,
            "SOuterLabel" to s.Plasma_SdService_ComponentOverlays_TextAreaSOuterLabel,
            "SOuterLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaSOuterLabelRequiredStart,
            "SOuterLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaSOuterLabelRequiredEnd,
            "SInnerLabel" to s.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabel,
            "SInnerLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabelRequiredStart,
            "SInnerLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
            "XS" to s.Plasma_SdService_ComponentOverlays_TextAreaXs,
            "XSRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaXsRequiredStart,
            "XSRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaXsRequiredEnd,
            "XSOuterLabel" to s.Plasma_SdService_ComponentOverlays_TextAreaXsOuterLabel,
            "XSOuterLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextAreaXsOuterLabelRequiredStart,
            "XSOuterLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextAreaXsOuterLabelRequiredEnd,
        )

    override val colorVariations: Map<String, ColorState> =
        mapOf(
            "Default" to TextAreaColorState.DEFAULT,
            "Warning" to TextAreaColorState.WARNING,
            "Error" to TextAreaColorState.ERROR,
        )
}
