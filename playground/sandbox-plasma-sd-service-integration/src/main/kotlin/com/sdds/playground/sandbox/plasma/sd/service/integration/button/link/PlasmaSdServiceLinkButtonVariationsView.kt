package com.sdds.playground.sandbox.plasma.sd.service.integration.button.link

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceLinkButtonVariationsView : ViewStyleProvider<String>() {

    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Plasma_SdService_ComponentOverlays_LinkButtonLDefault,
            "MDefault" to s.Plasma_SdService_ComponentOverlays_LinkButtonMDefault,
            "SDefault" to s.Plasma_SdService_ComponentOverlays_LinkButtonSDefault,
            "XsDefault" to s.Plasma_SdService_ComponentOverlays_LinkButtonXsDefault,
            "LSecondary" to s.Plasma_SdService_ComponentOverlays_LinkButtonLSecondary,
            "MSecondary" to s.Plasma_SdService_ComponentOverlays_LinkButtonMSecondary,
            "SSecondary" to s.Plasma_SdService_ComponentOverlays_LinkButtonSSecondary,
            "XsSecondary" to s.Plasma_SdService_ComponentOverlays_LinkButtonXsSecondary,
            "LAccent" to s.Plasma_SdService_ComponentOverlays_LinkButtonLAccent,
            "MAccent" to s.Plasma_SdService_ComponentOverlays_LinkButtonMAccent,
            "SAccent" to s.Plasma_SdService_ComponentOverlays_LinkButtonSAccent,
            "XsAccent" to s.Plasma_SdService_ComponentOverlays_LinkButtonXsAccent,
            "LPositive" to s.Plasma_SdService_ComponentOverlays_LinkButtonLPositive,
            "MPositive" to s.Plasma_SdService_ComponentOverlays_LinkButtonMPositive,
            "SPositive" to s.Plasma_SdService_ComponentOverlays_LinkButtonSPositive,
            "XsPositive" to s.Plasma_SdService_ComponentOverlays_LinkButtonXsPositive,
            "LNegative" to s.Plasma_SdService_ComponentOverlays_LinkButtonLNegative,
            "MNegative" to s.Plasma_SdService_ComponentOverlays_LinkButtonMNegative,
            "SNegative" to s.Plasma_SdService_ComponentOverlays_LinkButtonSNegative,
            "XsNegative" to s.Plasma_SdService_ComponentOverlays_LinkButtonXsNegative,
            "LWarning" to s.Plasma_SdService_ComponentOverlays_LinkButtonLWarning,
            "MWarning" to s.Plasma_SdService_ComponentOverlays_LinkButtonMWarning,
            "SWarning" to s.Plasma_SdService_ComponentOverlays_LinkButtonSWarning,
            "XsWarning" to s.Plasma_SdService_ComponentOverlays_LinkButtonXsWarning,
        )
}
