package com.sdds.playground.sandbox.stylessalute.integration.segment

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteSegmentVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "LPrimary" to s.Salute_StylesSalute_ComponentOverlays_SegmentLPrimary,
        "MPrimary" to s.Salute_StylesSalute_ComponentOverlays_SegmentMPrimary,
        "SPrimary" to s.Salute_StylesSalute_ComponentOverlays_SegmentSPrimary,
        "XsPrimary" to s.Salute_StylesSalute_ComponentOverlays_SegmentXsPrimary,
        "LPrimaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentLPilledPrimary,
        "MPrimaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentMPilledPrimary,
        "SPrimaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentSPilledPrimary,
        "XsPrimaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentXsPilledPrimary,
        "LSecondary" to s.Salute_StylesSalute_ComponentOverlays_SegmentLSecondary,
        "MSecondary" to s.Salute_StylesSalute_ComponentOverlays_SegmentMSecondary,
        "SSecondary" to s.Salute_StylesSalute_ComponentOverlays_SegmentSSecondary,
        "XsSecondary" to s.Salute_StylesSalute_ComponentOverlays_SegmentXsSecondary,
        "LSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentLPilledSecondary,
        "MSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentMPilledSecondary,
        "SSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentSPilledSecondary,
        "XsSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentXsPilledSecondary,
    )
}
