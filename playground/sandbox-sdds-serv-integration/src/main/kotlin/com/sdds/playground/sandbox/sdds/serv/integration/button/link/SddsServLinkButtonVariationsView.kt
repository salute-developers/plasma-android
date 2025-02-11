package com.sdds.playground.sandbox.sdds.serv.integration.button.link

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServLinkButtonVariationsView : ViewStyleProvider<String>() {

    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Serv_Sdds_ComponentOverlays_LinkButtonLDefault,
            "MDefault" to s.Serv_Sdds_ComponentOverlays_LinkButtonMDefault,
            "SDefault" to s.Serv_Sdds_ComponentOverlays_LinkButtonSDefault,
            "XsDefault" to s.Serv_Sdds_ComponentOverlays_LinkButtonXsDefault,
            "LSecondary" to s.Serv_Sdds_ComponentOverlays_LinkButtonLSecondary,
            "MSecondary" to s.Serv_Sdds_ComponentOverlays_LinkButtonMSecondary,
            "SSecondary" to s.Serv_Sdds_ComponentOverlays_LinkButtonSSecondary,
            "XsSecondary" to s.Serv_Sdds_ComponentOverlays_LinkButtonXsSecondary,
            "LAccent" to s.Serv_Sdds_ComponentOverlays_LinkButtonLAccent,
            "MAccent" to s.Serv_Sdds_ComponentOverlays_LinkButtonMAccent,
            "SAccent" to s.Serv_Sdds_ComponentOverlays_LinkButtonSAccent,
            "XsAccent" to s.Serv_Sdds_ComponentOverlays_LinkButtonXsAccent,
            "LPositive" to s.Serv_Sdds_ComponentOverlays_LinkButtonLPositive,
            "MPositive" to s.Serv_Sdds_ComponentOverlays_LinkButtonMPositive,
            "SPositive" to s.Serv_Sdds_ComponentOverlays_LinkButtonSPositive,
            "XsPositive" to s.Serv_Sdds_ComponentOverlays_LinkButtonXsPositive,
            "LNegative" to s.Serv_Sdds_ComponentOverlays_LinkButtonLNegative,
            "MNegative" to s.Serv_Sdds_ComponentOverlays_LinkButtonMNegative,
            "SNegative" to s.Serv_Sdds_ComponentOverlays_LinkButtonSNegative,
            "XsNegative" to s.Serv_Sdds_ComponentOverlays_LinkButtonXsNegative,
            "LWarning" to s.Serv_Sdds_ComponentOverlays_LinkButtonLWarning,
            "MWarning" to s.Serv_Sdds_ComponentOverlays_LinkButtonMWarning,
            "SWarning" to s.Serv_Sdds_ComponentOverlays_LinkButtonSWarning,
            "XsWarning" to s.Serv_Sdds_ComponentOverlays_LinkButtonXsWarning,
        )
}
