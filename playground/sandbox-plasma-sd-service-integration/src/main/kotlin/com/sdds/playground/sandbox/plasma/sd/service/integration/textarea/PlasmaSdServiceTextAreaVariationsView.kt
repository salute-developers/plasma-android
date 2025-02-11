package com.sdds.playground.sandbox.plasma.sd.service.integration.textarea

import com.plasma.sd.service.colorstate.TextAreaColorState
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.uikit.colorstate.ColorState

@Suppress("MaxLineLength")
internal object PlasmaSdServiceTextAreaVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaL,
            "LRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaLRequiredStart,
            "LRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaLRequiredEnd,
            "LOuterLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaLOuterLabel,
            "LOuterLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaLOuterLabelRequiredStart,
            "LOuterLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaLOuterLabelRequiredEnd,
            "LInnerLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaLInnerLabel,
            "LInnerLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaLInnerLabelRequiredStart,
            "LInnerLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaLInnerLabelRequiredEnd,
            "M" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaM,
            "MRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaMRequiredStart,
            "MRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaMRequiredEnd,
            "MOuterLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaMOuterLabel,
            "MOuterLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaMOuterLabelRequiredStart,
            "MOuterLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaMOuterLabelRequiredEnd,
            "MInnerLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaMInnerLabel,
            "MInnerLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaMInnerLabelRequiredStart,
            "MInnerLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaMInnerLabelRequiredEnd,
            "S" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaS,
            "SRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaSRequiredStart,
            "SRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaSRequiredEnd,
            "SOuterLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaSOuterLabel,
            "SOuterLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaSOuterLabelRequiredStart,
            "SOuterLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaSOuterLabelRequiredEnd,
            "SInnerLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabel,
            "SInnerLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabelRequiredStart,
            "SInnerLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaSInnerLabelRequiredEnd,
            "XS" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaXs,
            "XSRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaXsRequiredStart,
            "XSRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaXsRequiredEnd,
            "XSOuterLabel" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaXsOuterLabel,
            "XSOuterLabelRequiredStart" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaXsOuterLabelRequiredStart,
            "XSOuterLabelRequiredEnd" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_TextAreaXsOuterLabelRequiredEnd,
        )

    override val colorVariations: Map<String, ColorState>
        get() = mapOf(
            "Default" to TextAreaColorState.DEFAULT,
            "Warning" to TextAreaColorState.WARNING,
            "Error" to TextAreaColorState.ERROR,
        )
}