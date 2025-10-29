package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.segment.L
import com.sdkit.star.designsystem.styles.segment.M
import com.sdkit.star.designsystem.styles.segment.Pilled
import com.sdkit.star.designsystem.styles.segment.Primary
import com.sdkit.star.designsystem.styles.segment.S
import com.sdkit.star.designsystem.styles.segment.Secondary
import com.sdkit.star.designsystem.styles.segment.Segment
import com.sdkit.star.designsystem.styles.segment.Xl
import com.sdkit.star.designsystem.styles.segment.Xs

internal object PlasmaStardsSegmentVariationsCompose : ComposeStyleProvider<String, SegmentStyle>() {
    override val variations: Map<String, @Composable () -> SegmentStyle> =
        mapOf(
            "Xl.Primary" to { Segment.Xl.Primary.style() },
            "Xl.Secondary" to { Segment.Xl.Secondary.style() },
            "Xl.Pilled.Primary" to { Segment.Xl.Pilled.Primary.style() },
            "Xl.Pilled.Secondary" to { Segment.Xl.Pilled.Secondary.style() },
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
