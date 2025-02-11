package com.sdds.playground.sandbox.sdds.serv.integration.button.link

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServLinkButtonVariationsView : ViewStyleProvider<String>() {

    override val variations: Map<String, Int>
        get() = mapOf(
            "LDefault" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonLDefault,
            "MDefault" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonMDefault,
            "SDefault" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonSDefault,
            "XsDefault" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsDefault,
            "LSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonLSecondary,
            "MSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonMSecondary,
            "SSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonSSecondary,
            "XsSecondary" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsSecondary,
            "LAccent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonLAccent,
            "MAccent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonMAccent,
            "SAccent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonSAccent,
            "XsAccent" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsAccent,
            "LPositive" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonLPositive,
            "MPositive" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonMPositive,
            "SPositive" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonSPositive,
            "XsPositive" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsPositive,
            "LNegative" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonLNegative,
            "MNegative" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonMNegative,
            "SNegative" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonSNegative,
            "XsNegative" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsNegative,
            "LWarning" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonLWarning,
            "MWarning" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonMWarning,
            "SWarning" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonSWarning,
            "XsWarning" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsWarning,
        )
}