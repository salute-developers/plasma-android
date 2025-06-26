package com.sdds.playground.sandbox.sdds.serv.integration.badge

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServBadgeClearVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "ClearLDefault" to s.Serv_Sdds_ComponentOverlays_BadgeClearLDefault,
            "ClearLAccent" to s.Serv_Sdds_ComponentOverlays_BadgeClearLAccent,
            "ClearLPositive" to s.Serv_Sdds_ComponentOverlays_BadgeClearLPositive,
            "ClearLWarning" to s.Serv_Sdds_ComponentOverlays_BadgeClearLWarning,
            "ClearLNegative" to s.Serv_Sdds_ComponentOverlays_BadgeClearLNegative,
            "ClearLLight" to s.Serv_Sdds_ComponentOverlays_BadgeClearLLight,
            "ClearLDark" to s.Serv_Sdds_ComponentOverlays_BadgeClearLDark,
            "ClearMDefault" to s.Serv_Sdds_ComponentOverlays_BadgeClearMDefault,
            "ClearMAccent" to s.Serv_Sdds_ComponentOverlays_BadgeClearMAccent,
            "ClearMPositive" to s.Serv_Sdds_ComponentOverlays_BadgeClearMPositive,
            "ClearMWarning" to s.Serv_Sdds_ComponentOverlays_BadgeClearMWarning,
            "ClearMNegative" to s.Serv_Sdds_ComponentOverlays_BadgeClearMNegative,
            "ClearMLight" to s.Serv_Sdds_ComponentOverlays_BadgeClearMLight,
            "ClearMDark" to s.Serv_Sdds_ComponentOverlays_BadgeClearMDark,
            "ClearSDefault" to s.Serv_Sdds_ComponentOverlays_BadgeClearSDefault,
            "ClearSAccent" to s.Serv_Sdds_ComponentOverlays_BadgeClearSAccent,
            "ClearSPositive" to s.Serv_Sdds_ComponentOverlays_BadgeClearSPositive,
            "ClearSWarning" to s.Serv_Sdds_ComponentOverlays_BadgeClearSNegative,
            "ClearSNegative" to s.Serv_Sdds_ComponentOverlays_BadgeClearSWarning,
            "ClearSLight" to s.Serv_Sdds_ComponentOverlays_BadgeClearSLight,
            "ClearSDark" to s.Serv_Sdds_ComponentOverlays_BadgeClearSDark,
            "ClearXsDefault" to s.Serv_Sdds_ComponentOverlays_BadgeClearXsDefault,
            "ClearXsAccent" to s.Serv_Sdds_ComponentOverlays_BadgeClearXsAccent,
            "ClearXsPositive" to s.Serv_Sdds_ComponentOverlays_BadgeClearXsPositive,
            "ClearXsWarning" to s.Serv_Sdds_ComponentOverlays_BadgeClearXsWarning,
            "ClearXsNegative" to s.Serv_Sdds_ComponentOverlays_BadgeClearXsNegative,
            "ClearXsLight" to s.Serv_Sdds_ComponentOverlays_BadgeClearXsLight,
            "ClearXsDark" to s.Serv_Sdds_ComponentOverlays_BadgeClearXsDark,
        )
}
