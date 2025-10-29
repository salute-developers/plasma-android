package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.segment.Accent
import com.sdds.plasma.giga.styles.segment.L
import com.sdds.plasma.giga.styles.segment.M
import com.sdds.plasma.giga.styles.segment.Pilled
import com.sdds.plasma.giga.styles.segment.Primary
import com.sdds.plasma.giga.styles.segment.S
import com.sdds.plasma.giga.styles.segment.Secondary
import com.sdds.plasma.giga.styles.segment.Segment
import com.sdds.plasma.giga.styles.segment.Xl
import com.sdds.plasma.giga.styles.segment.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaSegmentVariationsCompose : ComposeStyleProvider<String, SegmentStyle>() {
    override val variations: Map<String, @Composable () -> SegmentStyle> =
        mapOf(
            "Xl.Primary" to { Segment.Xl.Primary.style() },
            "Xl.Secondary" to { Segment.Xl.Secondary.style() },
            "Xl.Accent" to { Segment.Xl.Accent.style() },
            "Xl.Pilled.Primary" to { Segment.Xl.Pilled.Primary.style() },
            "Xl.Pilled.Secondary" to { Segment.Xl.Pilled.Secondary.style() },
            "Xl.Pilled.Accent" to { Segment.Xl.Pilled.Accent.style() },
            "L.Primary" to { Segment.L.Primary.style() },
            "L.Secondary" to { Segment.L.Secondary.style() },
            "L.Accent" to { Segment.L.Accent.style() },
            "L.Pilled.Primary" to { Segment.L.Pilled.Primary.style() },
            "L.Pilled.Secondary" to { Segment.L.Pilled.Secondary.style() },
            "L.Pilled.Accent" to { Segment.L.Pilled.Accent.style() },
            "M.Primary" to { Segment.M.Primary.style() },
            "M.Secondary" to { Segment.M.Secondary.style() },
            "M.Accent" to { Segment.M.Accent.style() },
            "M.Pilled.Primary" to { Segment.M.Pilled.Primary.style() },
            "M.Pilled.Secondary" to { Segment.M.Pilled.Secondary.style() },
            "M.Pilled.Accent" to { Segment.M.Pilled.Accent.style() },
            "S.Primary" to { Segment.S.Primary.style() },
            "S.Secondary" to { Segment.S.Secondary.style() },
            "S.Accent" to { Segment.S.Accent.style() },
            "S.Pilled.Primary" to { Segment.S.Pilled.Primary.style() },
            "S.Pilled.Secondary" to { Segment.S.Pilled.Secondary.style() },
            "S.Pilled.Accent" to { Segment.S.Pilled.Accent.style() },
            "Xs.Primary" to { Segment.Xs.Primary.style() },
            "Xs.Secondary" to { Segment.Xs.Secondary.style() },
            "Xs.Accent" to { Segment.Xs.Accent.style() },
            "Xs.Pilled.Primary" to { Segment.Xs.Pilled.Primary.style() },
            "Xs.Pilled.Secondary" to { Segment.Xs.Pilled.Secondary.style() },
            "Xs.Pilled.Accent" to { Segment.Xs.Pilled.Accent.style() },
        )
}
