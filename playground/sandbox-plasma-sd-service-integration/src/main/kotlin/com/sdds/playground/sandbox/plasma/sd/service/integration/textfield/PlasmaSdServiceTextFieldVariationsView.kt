package com.sdds.playground.sandbox.plasma.sd.service.integration.textfield

import com.plasma.sd.service.colorstate.TextFieldColorState
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.uikit.colorstate.ColorState

internal object PlasmaSdServiceTextFieldVariationsView : ViewStyleProvider<String>() {

    override val colorVariations: Map<String, ColorState>
        get() = mapOf(
            "Default" to TextFieldColorState.DEFAULT,
            "Success" to TextFieldColorState.SUCCESS,
            "Warning" to TextFieldColorState.WARNING,
            "Error" to TextFieldColorState.ERROR,
        )

    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldL,
            "LRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldLRequiredStart,
            "LRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldLRequiredEnd,
            "LOuterLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldLOuterLabel,
            "LOuterLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldLOuterLabelRequiredStart,
            "LOuterLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldLOuterLabelRequiredEnd,
            "LInnerLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldLInnerLabel,
            "LInnerLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldLInnerLabelRequiredStart,
            "LInnerLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldLInnerLabelRequiredEnd,
            "M" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldM,
            "MRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldMRequiredStart,
            "MRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldMRequiredEnd,
            "MOuterLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldMOuterLabel,
            "MOuterLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldMOuterLabelRequiredStart,
            "MOuterLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldMOuterLabelRequiredEnd,
            "MInnerLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldMInnerLabel,
            "MInnerLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldMInnerLabelRequiredStart,
            "MInnerLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldMInnerLabelRequiredEnd,
            "S" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldS,
            "SRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldSRequiredStart,
            "SRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldSRequiredEnd,
            "SOuterLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldSOuterLabel,
            "SOuterLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldSOuterLabelRequiredStart,
            "SOuterLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldSOuterLabelRequiredEnd,
            "SInnerLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldSInnerLabel,
            "SInnerLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldSInnerLabelRequiredStart,
            "SInnerLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldSInnerLabelRequiredEnd,
            "Xs" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldXs,
            "XsRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldXsRequiredStart,
            "XsRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldXsRequiredEnd,
            "XsOuterLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldXsOuterLabel,
            "XsOuterLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldXsOuterLabelRequiredStart,
            "XsOuterLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextFieldXsOuterLabelRequiredEnd,
        )
}