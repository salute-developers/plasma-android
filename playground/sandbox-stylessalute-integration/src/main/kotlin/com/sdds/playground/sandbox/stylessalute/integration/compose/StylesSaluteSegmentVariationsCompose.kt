package com.sdds.playground.sandbox.stylessalute.integration.compose

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

internal object StylesSaluteSegmentVariationsCompose : ComposeStyleProvider<String, SegmentStyle>() {
    override val variations: Map<String, @Composable () -> SegmentStyle> =
        mapOf(
            "L.Primary" to { Segment.L.Primary.style() },
            "L.Secondary" to { Segment.L.Secondary.style() },
            "L.Pilled.Primary" to { Segment.L.Pilled.Primary.style() },
            "L.Pilled.Secondary" to { Segment.L.Pilled.Secondary.style() },
            "M.Primary" to { Segment.M.Primary.style() },
            "M.Secondary" to { Segment.M.Secondary.style() },
            "M.Pilled.Primary" to { Segment.M.Pilled.Primary.style() },
            "M.Pilled.Secondary" to { Segment.M.Pilled.Secondary.style() },
            "S.Primary" to { Segment.S.Primary.style() },
            "S.Secondary" to { Segment.S.Secondary.style() },
            "S.Pilled.Primary" to { Segment.S.Pilled.Primary.style() },
            "S.Pilled.Secondary" to { Segment.S.Pilled.Secondary.style() },
            "Xs.Primary" to { Segment.Xs.Primary.style() },
            "Xs.Secondary" to { Segment.Xs.Secondary.style() },
            "Xs.Pilled.Primary" to { Segment.Xs.Pilled.Primary.style() },
            "Xs.Pilled.Secondary" to { Segment.Xs.Pilled.Secondary.style() },
        )
}
