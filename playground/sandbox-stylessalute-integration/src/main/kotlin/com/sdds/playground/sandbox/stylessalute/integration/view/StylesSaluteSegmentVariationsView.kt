package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteSegmentVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentL,
            "L.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentLPrimary,
            "L.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentLSecondary,
            "L.Pilled" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentLPilled,
            "L.Pilled.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentLPilledPrimary,
            "L.Pilled.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentLPilledSecondary,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentM,
            "M.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentMPrimary,
            "M.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentMSecondary,
            "M.Pilled" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentMPilled,
            "M.Pilled.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentMPilledPrimary,
            "M.Pilled.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentMPilledSecondary,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentS,
            "S.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentSPrimary,
            "S.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentSSecondary,
            "S.Pilled" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentSPilled,
            "S.Pilled.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentSPilledPrimary,
            "S.Pilled.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentSPilledSecondary,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentXs,
            "Xs.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentXsPrimary,
            "Xs.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentXsSecondary,
            "Xs.Pilled" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentXsPilled,
            "Xs.Pilled.Primary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentXsPilledPrimary,
            "Xs.Pilled.Secondary" to DsR.style.Salute_StylesSalute_ComponentOverlays_SegmentXsPilledSecondary,
        )
}
