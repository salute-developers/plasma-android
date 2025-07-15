package com.sdds.playground.sandbox.plasma.sd.service.integration.image

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceImageVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Ratio1x1" to s.Plasma_SdService_ComponentOverlays_ImageViewRatio_1_1,
            "Ratio1x2" to s.Plasma_SdService_ComponentOverlays_ImageViewRatio_1_2,
            "Ratio3x4" to s.Plasma_SdService_ComponentOverlays_ImageViewRatio_3_4,
            "Ratio9x16" to s.Plasma_SdService_ComponentOverlays_ImageViewRatio_9_16,
            "Ratio2x1" to s.Plasma_SdService_ComponentOverlays_ImageViewRatio_2_1,
            "Ratio4x3" to s.Plasma_SdService_ComponentOverlays_ImageViewRatio_4_3,
            "Ratio16x9" to s.Plasma_SdService_ComponentOverlays_ImageViewRatio_16_9,
        )
}
