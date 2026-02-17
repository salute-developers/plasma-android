package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cFileLinearProgressVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressXs,
            "Xs.Default" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressXsDefault,
            "Xs.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressXsNegative,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressS,
            "S.Default" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressSDefault,
            "S.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressSNegative,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressM,
            "M.Default" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressMDefault,
            "M.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressMNegative,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressL,
            "L.Default" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressLDefault,
            "L.Negative" to DsR.style.Plasma_SdService_ComponentOverlays_FileLinearProgressLNegative,
        )
}
