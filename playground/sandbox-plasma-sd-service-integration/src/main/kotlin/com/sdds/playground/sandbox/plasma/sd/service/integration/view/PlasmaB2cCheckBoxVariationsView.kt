package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_CheckBoxL,
            "L.Default" to DsR.style.Plasma_SdService_ComponentOverlays_CheckBoxLDefault,
            "L.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_CheckBoxLNegative,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_CheckBoxM,
            "M.Default" to DsR.style.Plasma_SdService_ComponentOverlays_CheckBoxMDefault,
            "M.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_CheckBoxMNegative,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_CheckBoxS,
            "S.Default" to DsR.style.Plasma_SdService_ComponentOverlays_CheckBoxSDefault,
            "S.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_CheckBoxSNegative,
        )
}
