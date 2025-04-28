package com.sdds.playground.sandbox.sdds.serv.integration.checkbox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Serv_Sdds_ComponentOverlays_CheckBoxLDefault,
            "M" to s.Serv_Sdds_ComponentOverlays_CheckBoxMDefault,
            "S" to s.Serv_Sdds_ComponentOverlays_CheckBoxSDefault,

            "LNegative" to s.Serv_Sdds_ComponentOverlays_CheckBoxLNegative,
            "MNegative" to s.Serv_Sdds_ComponentOverlays_CheckBoxMNegative,
            "SNegative" to s.Serv_Sdds_ComponentOverlays_CheckBoxSNegative,
        )
}
