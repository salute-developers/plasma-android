package com.sdds.playground.sandbox.stylessalute.integration.segment

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.segment.L
import com.sdds.stylessalute.styles.segment.M
import com.sdds.stylessalute.styles.segment.Pilled
import com.sdds.stylessalute.styles.segment.Primary
import com.sdds.stylessalute.styles.segment.S
import com.sdds.stylessalute.styles.segment.Secondary
import com.sdds.stylessalute.styles.segment.Segment
import com.sdds.stylessalute.styles.segment.Xs

internal object StylesSaluteSegmentVariationsCompose :
    ComposeStyleProvider<String, SegmentStyle>() {

    override val variations: Map<String, @Composable () -> SegmentStyle> =
        mapOf(
            "LPrimary" to { Segment.L.Primary.style() },
            "MPrimary" to { Segment.M.Primary.style() },
            "SPrimary" to { Segment.S.Primary.style() },
            "XsPrimary" to { Segment.Xs.Primary.style() },
            "LPilledPrimary" to { Segment.L.Pilled.Primary.style() },
            "MPilledPrimary" to { Segment.M.Pilled.Primary.style() },
            "SPilledPrimary" to { Segment.S.Pilled.Primary.style() },
            "XsPilledPrimary" to { Segment.Xs.Pilled.Primary.style() },
            "LSecondary" to { Segment.L.Secondary.style() },
            "MSecondary" to { Segment.M.Secondary.style() },
            "SSecondary" to { Segment.S.Secondary.style() },
            "XsSecondary" to { Segment.Xs.Secondary.style() },
            "LPilledSecondary" to { Segment.L.Pilled.Secondary.style() },
            "MPilledSecondary" to { Segment.M.Pilled.Secondary.style() },
            "SPilledSecondary" to { Segment.S.Pilled.Secondary.style() },
            "XsPilledSecondary" to { Segment.Xs.Pilled.Secondary.style() },
        )
}
