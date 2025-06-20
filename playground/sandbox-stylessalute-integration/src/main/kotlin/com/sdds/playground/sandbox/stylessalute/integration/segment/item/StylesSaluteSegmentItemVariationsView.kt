package com.sdds.playground.sandbox.stylessalute.integration.segment.item

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteSegmentItemVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "LPrimary" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemLPrimary,
        "MPrimary" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemMPrimary,
        "SPrimary" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemSPrimary,
        "XsPrimary" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemXsPrimary,
        "LPrimaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemLPilledPrimary,
        "MPrimaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemMPilledPrimary,
        "SPrimaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemSPilledPrimary,
        "XsPrimaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemXsPilledPrimary,
        "LSecondary" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemLSecondary,
        "MSecondary" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemMSecondary,
        "SSecondary" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemSSecondary,
        "XsSecondary" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemXsSecondary,
        "LSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemLPilledSecondary,
        "MSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemMPilledSecondary,
        "SSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemSPilledSecondary,
        "XsSecondaryPilled" to s.Salute_StylesSalute_ComponentOverlays_SegmentItemXsPilledSecondary,
    )
}
