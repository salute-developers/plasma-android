package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteIndicatorVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorL,
            "L.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorLDefault,
            "L.Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorLAccent,
            "L.Inactive" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorLInactive,
            "L.Positive" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorLPositive,
            "L.Warning" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorLWarning,
            "L.Negative" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorLNegative,
            "L.Dark" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorLDark,
            "L.Black" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorLBlack,
            "L.White" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorLWhite,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorM,
            "M.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorMDefault,
            "M.Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorMAccent,
            "M.Inactive" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorMInactive,
            "M.Positive" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorMPositive,
            "M.Warning" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorMWarning,
            "M.Negative" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorMNegative,
            "M.Dark" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorMDark,
            "M.Black" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorMBlack,
            "M.White" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorMWhite,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorS,
            "S.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorSDefault,
            "S.Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorSAccent,
            "S.Inactive" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorSInactive,
            "S.Positive" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorSPositive,
            "S.Warning" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorSWarning,
            "S.Negative" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorSNegative,
            "S.Dark" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorSDark,
            "S.Black" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorSBlack,
            "S.White" to DsR.style.Salute_StylesSalute_ComponentOverlays_IndicatorSWhite,
        )
}
