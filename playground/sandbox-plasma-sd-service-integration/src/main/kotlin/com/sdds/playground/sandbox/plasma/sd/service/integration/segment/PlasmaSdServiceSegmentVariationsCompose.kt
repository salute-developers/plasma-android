package com.sdds.playground.sandbox.plasma.sd.service.integration.segment

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.segment.Accent
import com.sdds.plasma.sd.service.styles.segment.L
import com.sdds.plasma.sd.service.styles.segment.M
import com.sdds.plasma.sd.service.styles.segment.Pilled
import com.sdds.plasma.sd.service.styles.segment.Primary
import com.sdds.plasma.sd.service.styles.segment.S
import com.sdds.plasma.sd.service.styles.segment.Secondary
import com.sdds.plasma.sd.service.styles.segment.Segment
import com.sdds.plasma.sd.service.styles.segment.Xl
import com.sdds.plasma.sd.service.styles.segment.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceSegmentVariationsCompose :
    ComposeStyleProvider<String, SegmentStyle>() {

    override val variations: Map<String, @Composable () -> SegmentStyle> =
        mapOf(
            "XlPrimary" to { Segment.Xl.Primary.style() },
            "LPrimary" to { Segment.L.Primary.style() },
            "MPrimary" to { Segment.M.Primary.style() },
            "SPrimary" to { Segment.S.Primary.style() },
            "XsPrimary" to { Segment.Xs.Primary.style() },
            "XlPilledPrimary" to { Segment.Xl.Pilled.Primary.style() },
            "LPilledPrimary" to { Segment.L.Pilled.Primary.style() },
            "MPilledPrimary" to { Segment.M.Pilled.Primary.style() },
            "SPilledPrimary" to { Segment.S.Pilled.Primary.style() },
            "XsPilledPrimary" to { Segment.Xs.Pilled.Primary.style() },
            "XlSecondary" to { Segment.Xl.Secondary.style() },
            "LSecondary" to { Segment.L.Secondary.style() },
            "MSecondary" to { Segment.M.Secondary.style() },
            "SSecondary" to { Segment.S.Secondary.style() },
            "XsSecondary" to { Segment.Xs.Secondary.style() },
            "XlPilledSecondary" to { Segment.Xl.Pilled.Secondary.style() },
            "LPilledSecondary" to { Segment.L.Pilled.Secondary.style() },
            "MPilledSecondary" to { Segment.M.Pilled.Secondary.style() },
            "SPilledSecondary" to { Segment.S.Pilled.Secondary.style() },
            "XsPilledSecondary" to { Segment.Xs.Pilled.Secondary.style() },
            "XlAccent" to { Segment.Xl.Accent.style() },
            "LAccent" to { Segment.L.Accent.style() },
            "MAccent" to { Segment.M.Accent.style() },
            "SAccent" to { Segment.S.Accent.style() },
            "XsAccent" to { Segment.Xs.Accent.style() },
            "XlPilledAccent" to { Segment.Xl.Pilled.Accent.style() },
            "LPilledAccent" to { Segment.L.Pilled.Accent.style() },
            "MPilledAccent" to { Segment.M.Pilled.Accent.style() },
            "SPilledAccent" to { Segment.S.Pilled.Accent.style() },
            "XsPilledAccent" to { Segment.Xs.Pilled.Accent.style() },
        )
}
