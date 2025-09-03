package com.sdds.playground.sandbox.sdds.serv.integration.drawer

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServDrawerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "MCloseInner" to s.Serv_Sdds_ComponentOverlays_DrawerCloseInnerM,
            "MCloseOuter" to s.Serv_Sdds_ComponentOverlays_DrawerCloseOuterM,
            "MCloseNone" to s.Serv_Sdds_ComponentOverlays_DrawerCloseNoneM,
            "MCloseInnerHasShadow" to s.Serv_Sdds_ComponentOverlays_DrawerCloseInnerMHasShadow,
            "MCloseOuterHasShadow" to s.Serv_Sdds_ComponentOverlays_DrawerCloseOuterMHasShadow,
            "MCloseNoneHasShadow" to s.Serv_Sdds_ComponentOverlays_DrawerCloseNoneMHasShadow,
        )
}
