package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.segmentitem.Accent
import com.sdds.serv.styles.segmentitem.L
import com.sdds.serv.styles.segmentitem.M
import com.sdds.serv.styles.segmentitem.Pilled
import com.sdds.serv.styles.segmentitem.Primary
import com.sdds.serv.styles.segmentitem.S
import com.sdds.serv.styles.segmentitem.Secondary
import com.sdds.serv.styles.segmentitem.SegmentItem
import com.sdds.serv.styles.segmentitem.Xl
import com.sdds.serv.styles.segmentitem.Xs

internal object SddsServSegmentItemVariationsCompose : ComposeStyleProvider<String, SegmentItemStyle>() {
    override val variations: Map<String, @Composable () -> SegmentItemStyle> =
        mapOf(
            "Xl.Primary" to { SegmentItem.Xl.Primary.style() },
            "Xl.Secondary" to { SegmentItem.Xl.Secondary.style() },
            "Xl.Accent" to { SegmentItem.Xl.Accent.style() },
            "Xl.Pilled.Primary" to { SegmentItem.Xl.Pilled.Primary.style() },
            "Xl.Pilled.Secondary" to { SegmentItem.Xl.Pilled.Secondary.style() },
            "Xl.Pilled.Accent" to { SegmentItem.Xl.Pilled.Accent.style() },
            "L.Primary" to { SegmentItem.L.Primary.style() },
            "L.Secondary" to { SegmentItem.L.Secondary.style() },
            "L.Accent" to { SegmentItem.L.Accent.style() },
            "L.Pilled.Primary" to { SegmentItem.L.Pilled.Primary.style() },
            "L.Pilled.Secondary" to { SegmentItem.L.Pilled.Secondary.style() },
            "L.Pilled.Accent" to { SegmentItem.L.Pilled.Accent.style() },
            "M.Primary" to { SegmentItem.M.Primary.style() },
            "M.Secondary" to { SegmentItem.M.Secondary.style() },
            "M.Accent" to { SegmentItem.M.Accent.style() },
            "M.Pilled.Primary" to { SegmentItem.M.Pilled.Primary.style() },
            "M.Pilled.Secondary" to { SegmentItem.M.Pilled.Secondary.style() },
            "M.Pilled.Accent" to { SegmentItem.M.Pilled.Accent.style() },
            "S.Primary" to { SegmentItem.S.Primary.style() },
            "S.Secondary" to { SegmentItem.S.Secondary.style() },
            "S.Accent" to { SegmentItem.S.Accent.style() },
            "S.Pilled.Primary" to { SegmentItem.S.Pilled.Primary.style() },
            "S.Pilled.Secondary" to { SegmentItem.S.Pilled.Secondary.style() },
            "S.Pilled.Accent" to { SegmentItem.S.Pilled.Accent.style() },
            "Xs.Primary" to { SegmentItem.Xs.Primary.style() },
            "Xs.Secondary" to { SegmentItem.Xs.Secondary.style() },
            "Xs.Accent" to { SegmentItem.Xs.Accent.style() },
            "Xs.Pilled.Primary" to { SegmentItem.Xs.Pilled.Primary.style() },
            "Xs.Pilled.Secondary" to { SegmentItem.Xs.Pilled.Secondary.style() },
            "Xs.Pilled.Accent" to { SegmentItem.Xs.Pilled.Accent.style() },
        )
}
