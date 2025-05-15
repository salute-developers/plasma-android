package com.sdds.playground.sandbox.sdds.serv.integration.chip

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServEmbeddedChipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipLDefault,
            "MDefault" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipMDefault,
            "SDefault" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipSDefault,
            "XsDefault" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipXsDefault,

            "LSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipLSecondary,
            "MSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipMSecondary,
            "SSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipSSecondary,
            "XsSecondary" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipXsSecondary,

            "LAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipLAccent,
            "MAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipMAccent,
            "SAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipSAccent,
            "XsAccent" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipXsAccent,

            "LNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipLNegative,
            "MNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipMNegative,
            "SNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipSNegative,
            "XsNegative" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipXsNegative,

            "LPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipLPositive,
            "MPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipMPositive,
            "SPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipSPositive,
            "XsPositive" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipXsPositive,

            "LWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipLWarning,
            "MWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipMWarning,
            "SWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipSWarning,
            "XsWarning" to s.Serv_Sdds_ComponentOverlays_EmbeddedChipXsWarning,
        )
}
