package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cFileCircularProgressVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressXs,
            "Xs.Default" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressXsDefault,
            "Xs.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressXsNegative,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressS,
            "S.Default" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressSDefault,
            "S.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressSNegative,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressM,
            "M.Default" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressMDefault,
            "M.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressMNegative,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressL,
            "L.Default" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressLDefault,
            "L.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_FileCircularProgressLNegative,
        )
}
