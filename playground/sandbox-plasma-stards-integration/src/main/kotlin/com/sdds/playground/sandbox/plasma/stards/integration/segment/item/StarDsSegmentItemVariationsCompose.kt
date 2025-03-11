package com.sdds.playground.sandbox.plasma.stards.integration.segment.item

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.segment.item.L
import com.sdkit.star.designsystem.styles.segment.item.M
import com.sdkit.star.designsystem.styles.segment.item.Pilled
import com.sdkit.star.designsystem.styles.segment.item.Primary
import com.sdkit.star.designsystem.styles.segment.item.S
import com.sdkit.star.designsystem.styles.segment.item.Secondary
import com.sdkit.star.designsystem.styles.segment.item.Xl
import com.sdkit.star.designsystem.styles.segment.item.Xs

internal object StarDsSegmentItemVariationsCompose :
    ComposeStyleProvider<String, SegmentItemStyle>() {
    override val variations: Map<String, @Composable () -> SegmentItemStyle> =
        mapOf(
            "XlPrimary" to { SegmentItem.Xl.Primary.style() },
            "XlSecondary" to { SegmentItem.Xl.Secondary.style() },
            "XlPilledPrimary" to { SegmentItem.Xl.Pilled.Primary.style() },
            "XlPilledSecondary" to { SegmentItem.Xl.Pilled.Secondary.style() },

            "LPrimary" to { SegmentItem.L.Primary.style() },
            "LSecondary" to { SegmentItem.L.Secondary.style() },
            "LPilledPrimary" to { SegmentItem.L.Pilled.Primary.style() },
            "LPilledSecondary" to { SegmentItem.L.Pilled.Secondary.style() },

            "MPrimary" to { SegmentItem.M.Primary.style() },
            "MSecondary" to { SegmentItem.M.Secondary.style() },
            "MPilledPrimary" to { SegmentItem.M.Pilled.Primary.style() },
            "MPilledSecondary" to { SegmentItem.M.Pilled.Secondary.style() },

            "SPrimary" to { SegmentItem.S.Primary.style() },
            "SSecondary" to { SegmentItem.S.Secondary.style() },
            "SPilledPrimary" to { SegmentItem.S.Pilled.Primary.style() },
            "SPilledSecondary" to { SegmentItem.S.Pilled.Secondary.style() },

            "XsPrimary" to { SegmentItem.Xs.Primary.style() },
            "XsSecondary" to { SegmentItem.Xs.Secondary.style() },
            "XsPilledPrimary" to { SegmentItem.Xs.Pilled.Primary.style() },
            "XsPilledSecondary" to { SegmentItem.Xs.Pilled.Secondary.style() },
        )
}
