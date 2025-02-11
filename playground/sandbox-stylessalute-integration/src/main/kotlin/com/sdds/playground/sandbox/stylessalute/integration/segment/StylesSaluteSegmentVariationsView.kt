package com.sdds.playground.sandbox.stylessalute.integration.segment

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object StylesSaluteSegmentVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "LPrimary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentLPrimary,
            "MPrimary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentMPrimary,
            "SPrimary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentSPrimary,
            "XsPrimary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentXsPrimary,
            "LPrimaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentLPrimaryPilled,
            "MPrimaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentMPrimaryPilled,
            "SPrimaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentSPrimaryPilled,
            "XsPrimaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentXsPrimaryPilled,
            "LSecondary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentLSecondary,
            "MSecondary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentMSecondary,
            "SSecondary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentSSecondary,
            "XsSecondary" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentXsSecondary,
            "LSecondaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentLSecondary,
            "MSecondaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentMSecondaryPilled,
            "SSecondaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentSSecondaryPilled,
            "XsSecondaryPilled" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SegmentXsSecondaryPilled,
        )
}
