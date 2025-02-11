package com.sdds.playground.sandbox.plasma.sd.service.integration.textfield

import com.sdds.plasma.sd.service.colorstate.TextFieldColorState
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s
import com.sdds.uikit.colorstate.ColorState

internal object PlasmaSdServiceTextFieldVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState> =
        mapOf(
            "Default" to TextFieldColorState.DEFAULT,
            "Success" to TextFieldColorState.SUCCESS,
            "Warning" to TextFieldColorState.WARNING,
            "Error" to TextFieldColorState.ERROR,
        )

    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_TextFieldL,
            "LRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldLRequiredStart,
            "LRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldLRequiredEnd,
            "LOuterLabel" to s.Plasma_SdService_ComponentOverlays_TextFieldLOuterLabel,
            "LOuterLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
            "LOuterLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldLOuterLabelRequiredEnd,
            "LInnerLabel" to s.Plasma_SdService_ComponentOverlays_TextFieldLInnerLabel,
            "LInnerLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
            "LInnerLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldLInnerLabelRequiredEnd,
            "M" to s.Plasma_SdService_ComponentOverlays_TextFieldM,
            "MRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldMRequiredStart,
            "MRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldMRequiredEnd,
            "MOuterLabel" to s.Plasma_SdService_ComponentOverlays_TextFieldMOuterLabel,
            "MOuterLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldMOuterLabelRequiredStart,
            "MOuterLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldMOuterLabelRequiredEnd,
            "MInnerLabel" to s.Plasma_SdService_ComponentOverlays_TextFieldMInnerLabel,
            "MInnerLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldMInnerLabelRequiredStart,
            "MInnerLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldMInnerLabelRequiredEnd,
            "S" to s.Plasma_SdService_ComponentOverlays_TextFieldS,
            "SRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldSRequiredStart,
            "SRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldSRequiredEnd,
            "SOuterLabel" to s.Plasma_SdService_ComponentOverlays_TextFieldSOuterLabel,
            "SOuterLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldSOuterLabelRequiredStart,
            "SOuterLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
            "SInnerLabel" to s.Plasma_SdService_ComponentOverlays_TextFieldSInnerLabel,
            "SInnerLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldSInnerLabelRequiredStart,
            "SInnerLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
            "Xs" to s.Plasma_SdService_ComponentOverlays_TextFieldXs,
            "XsRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldXsRequiredStart,
            "XsRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldXsRequiredEnd,
            "XsOuterLabel" to s.Plasma_SdService_ComponentOverlays_TextFieldXsOuterLabel,
            "XsOuterLabelRequiredStart" to s.Plasma_SdService_ComponentOverlays_TextFieldXsOuterLabelRequiredStart,
            "XsOuterLabelRequiredEnd" to s.Plasma_SdService_ComponentOverlays_TextFieldXsOuterLabelRequiredEnd,
        )
}
