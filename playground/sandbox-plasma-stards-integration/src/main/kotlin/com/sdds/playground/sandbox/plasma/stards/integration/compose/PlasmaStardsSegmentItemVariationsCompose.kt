package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.segmentitem.L
import com.sdkit.star.designsystem.styles.segmentitem.M
import com.sdkit.star.designsystem.styles.segmentitem.Pilled
import com.sdkit.star.designsystem.styles.segmentitem.Primary
import com.sdkit.star.designsystem.styles.segmentitem.S
import com.sdkit.star.designsystem.styles.segmentitem.Secondary
import com.sdkit.star.designsystem.styles.segmentitem.SegmentItem
import com.sdkit.star.designsystem.styles.segmentitem.Xl
import com.sdkit.star.designsystem.styles.segmentitem.Xs

internal object PlasmaStardsSegmentItemVariationsCompose : ComposeStyleProvider<String, SegmentItemStyle>() {
    override val variations: Map<String, @Composable () -> SegmentItemStyle> =
        mapOf(
            "Xl.Primary" to { SegmentItem.Xl.Primary.style() },
            "Xl.Secondary" to { SegmentItem.Xl.Secondary.style() },
            "Xl.Pilled.Primary" to { SegmentItem.Xl.Pilled.Primary.style() },
            "Xl.Pilled.Secondary" to { SegmentItem.Xl.Pilled.Secondary.style() },
            "L.Primary" to { SegmentItem.L.Primary.style() },
            "L.Secondary" to { SegmentItem.L.Secondary.style() },
            "L.Pilled.Primary" to { SegmentItem.L.Pilled.Primary.style() },
            "L.Pilled.Secondary" to { SegmentItem.L.Pilled.Secondary.style() },
            "M.Primary" to { SegmentItem.M.Primary.style() },
            "M.Secondary" to { SegmentItem.M.Secondary.style() },
            "M.Pilled.Primary" to { SegmentItem.M.Pilled.Primary.style() },
            "M.Pilled.Secondary" to { SegmentItem.M.Pilled.Secondary.style() },
            "S.Primary" to { SegmentItem.S.Primary.style() },
            "S.Secondary" to { SegmentItem.S.Secondary.style() },
            "S.Pilled.Primary" to { SegmentItem.S.Pilled.Primary.style() },
            "S.Pilled.Secondary" to { SegmentItem.S.Pilled.Secondary.style() },
            "Xs.Primary" to { SegmentItem.Xs.Primary.style() },
            "Xs.Secondary" to { SegmentItem.Xs.Secondary.style() },
            "Xs.Pilled.Primary" to { SegmentItem.Xs.Pilled.Primary.style() },
            "Xs.Pilled.Secondary" to { SegmentItem.Xs.Pilled.Secondary.style() },
        )
}
