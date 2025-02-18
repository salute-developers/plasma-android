package com.sdds.playground.sandbox.sdds.serv.integration.counter

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServCounterVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Serv_Sdds_ComponentOverlays_CounterLDefault,
            "LAccent" to s.Serv_Sdds_ComponentOverlays_CounterLAccent,
            "LPositive" to s.Serv_Sdds_ComponentOverlays_CounterLPositive,
            "LWarning" to s.Serv_Sdds_ComponentOverlays_CounterLWarning,
            "LNegative" to s.Serv_Sdds_ComponentOverlays_CounterLNegative,
            "LBlack" to s.Serv_Sdds_ComponentOverlays_CounterLBlack,
            "LWhite" to s.Serv_Sdds_ComponentOverlays_CounterLWhite,
            "MDefault" to s.Serv_Sdds_ComponentOverlays_CounterMDefault,
            "MAccent" to s.Serv_Sdds_ComponentOverlays_CounterMAccent,
            "MPositive" to s.Serv_Sdds_ComponentOverlays_CounterMPositive,
            "MWarning" to s.Serv_Sdds_ComponentOverlays_CounterMWarning,
            "MNegative" to s.Serv_Sdds_ComponentOverlays_CounterMNegative,
            "MBlack" to s.Serv_Sdds_ComponentOverlays_CounterMBlack,
            "MWhite" to s.Serv_Sdds_ComponentOverlays_CounterMWhite,
            "SDefault" to s.Serv_Sdds_ComponentOverlays_CounterSDefault,
            "SAccent" to s.Serv_Sdds_ComponentOverlays_CounterSAccent,
            "SPositive" to s.Serv_Sdds_ComponentOverlays_CounterSPositive,
            "SWarning" to s.Serv_Sdds_ComponentOverlays_CounterSWarning,
            "SNegative" to s.Serv_Sdds_ComponentOverlays_CounterSNegative,
            "SBlack" to s.Serv_Sdds_ComponentOverlays_CounterSBlack,
            "SWhite" to s.Serv_Sdds_ComponentOverlays_CounterSWhite,
            "XsDefault" to s.Serv_Sdds_ComponentOverlays_CounterXsDefault,
            "XsAccent" to s.Serv_Sdds_ComponentOverlays_CounterXsAccent,
            "XsPositive" to s.Serv_Sdds_ComponentOverlays_CounterXsPositive,
            "XsWarning" to s.Serv_Sdds_ComponentOverlays_CounterXsWarning,
            "XsNegative" to s.Serv_Sdds_ComponentOverlays_CounterXsNegative,
            "XsBlack" to s.Serv_Sdds_ComponentOverlays_CounterXsBlack,
            "XsWhite" to s.Serv_Sdds_ComponentOverlays_CounterXsWhite,
            "XxsDefault" to s.Serv_Sdds_ComponentOverlays_CounterXxsDefault,
            "XxsAccent" to s.Serv_Sdds_ComponentOverlays_CounterXxsAccent,
            "XxsPositive" to s.Serv_Sdds_ComponentOverlays_CounterXxsPositive,
            "XxsWarning" to s.Serv_Sdds_ComponentOverlays_CounterXxsWarning,
            "XxsNegative" to s.Serv_Sdds_ComponentOverlays_CounterXxsNegative,
            "XxsBlack" to s.Serv_Sdds_ComponentOverlays_CounterXxsBlack,
            "XxsWhite" to s.Serv_Sdds_ComponentOverlays_CounterXxsWhite,
        )
}
