package com.sdds.playground.sandbox.sdds.serv.integration.codefield

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServCodeFieldVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Serv_Sdds_ComponentOverlays_CodeFieldL,
            "MDefault" to s.Serv_Sdds_ComponentOverlays_CodeFieldM,
            "LSegmented" to s.Serv_Sdds_ComponentOverlays_CodeFieldLSegmented,
            "MSegmented" to s.Serv_Sdds_ComponentOverlays_CodeFieldMSegmented,
        )
}
