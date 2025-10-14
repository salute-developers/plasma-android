package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteSegmentItemVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemL,
            "L.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemLPrimary,
            "L.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemLSecondary,
            "L.Pilled" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemLPilled,
            "L.Pilled.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemLPilledPrimary,
            "L.Pilled.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemLPilledSecondary,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemM,
            "M.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemMPrimary,
            "M.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemMSecondary,
            "M.Pilled" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemMPilled,
            "M.Pilled.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemMPilledPrimary,
            "M.Pilled.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemMPilledSecondary,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemS,
            "S.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemSPrimary,
            "S.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemSSecondary,
            "S.Pilled" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemSPilled,
            "S.Pilled.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemSPilledPrimary,
            "S.Pilled.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemSPilledSecondary,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemXs,
            "Xs.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemXsPrimary,
            "Xs.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemXsSecondary,
            "Xs.Pilled" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemXsPilled,
            "Xs.Pilled.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemXsPilledPrimary,
            "Xs.Pilled.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentItemXsPilledSecondary,
        )
}
