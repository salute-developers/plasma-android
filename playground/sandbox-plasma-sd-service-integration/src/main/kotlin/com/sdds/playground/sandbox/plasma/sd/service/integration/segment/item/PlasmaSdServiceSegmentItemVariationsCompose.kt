package com.sdds.playground.sandbox.plasma.sd.service.integration.segment.item

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.segment.item.Accent
import com.sdds.plasma.sd.service.styles.segment.item.L
import com.sdds.plasma.sd.service.styles.segment.item.M
import com.sdds.plasma.sd.service.styles.segment.item.Pilled
import com.sdds.plasma.sd.service.styles.segment.item.Primary
import com.sdds.plasma.sd.service.styles.segment.item.S
import com.sdds.plasma.sd.service.styles.segment.item.Secondary
import com.sdds.plasma.sd.service.styles.segment.item.Xl
import com.sdds.plasma.sd.service.styles.segment.item.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceSegmentItemVariationsCompose :
    ComposeStyleProvider<String, SegmentItemStyle>() {
    override val variations: Map<String, @Composable () -> SegmentItemStyle> =
        mapOf(
            "XlPrimary" to { SegmentItem.Xl.Primary.style() },
            "XlSecondary" to { SegmentItem.Xl.Secondary.style() },
            "XlAccent" to { SegmentItem.Xl.Accent.style() },
            "XlPilledPrimary" to { SegmentItem.Xl.Pilled.Primary.style() },
            "XlPilledSecondary" to { SegmentItem.Xl.Pilled.Secondary.style() },
            "XlPilledAccent" to { SegmentItem.Xl.Pilled.Accent.style() },

            "LPrimary" to { SegmentItem.L.Primary.style() },
            "LSecondary" to { SegmentItem.L.Secondary.style() },
            "LAccent" to { SegmentItem.L.Accent.style() },
            "LPilledPrimary" to { SegmentItem.L.Pilled.Primary.style() },
            "LPilledSecondary" to { SegmentItem.L.Pilled.Secondary.style() },
            "LPilledAccent" to { SegmentItem.L.Pilled.Accent.style() },

            "MPrimary" to { SegmentItem.M.Primary.style() },
            "MSecondary" to { SegmentItem.M.Secondary.style() },
            "MAccent" to { SegmentItem.M.Accent.style() },
            "MPilledPrimary" to { SegmentItem.M.Pilled.Primary.style() },
            "MPilledSecondary" to { SegmentItem.M.Pilled.Secondary.style() },
            "MPilledAccent" to { SegmentItem.M.Pilled.Accent.style() },

            "SPrimary" to { SegmentItem.S.Primary.style() },
            "SSecondary" to { SegmentItem.S.Secondary.style() },
            "SAccent" to { SegmentItem.S.Accent.style() },
            "SPilledPrimary" to { SegmentItem.S.Pilled.Primary.style() },
            "SPilledSecondary" to { SegmentItem.S.Pilled.Secondary.style() },
            "SPilledAccent" to { SegmentItem.S.Pilled.Accent.style() },

            "XsPrimary" to { SegmentItem.Xs.Primary.style() },
            "XsSecondary" to { SegmentItem.Xs.Secondary.style() },
            "XsAccent" to { SegmentItem.Xs.Accent.style() },
            "XsPilledPrimary" to { SegmentItem.Xs.Pilled.Primary.style() },
            "XsPilledSecondary" to { SegmentItem.Xs.Pilled.Secondary.style() },
            "XsPilledAccent" to { SegmentItem.Xs.Pilled.Accent.style() },
        )
}
