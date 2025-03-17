package com.sdds.playground.sandbox.plasma.stards.integration.segment

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Segment
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.segment.L
import com.sdkit.star.designsystem.styles.segment.M
import com.sdkit.star.designsystem.styles.segment.Pilled
import com.sdkit.star.designsystem.styles.segment.Primary
import com.sdkit.star.designsystem.styles.segment.S
import com.sdkit.star.designsystem.styles.segment.Secondary
import com.sdkit.star.designsystem.styles.segment.Xl
import com.sdkit.star.designsystem.styles.segment.Xs

internal object StarDsSegmentVariationsCompose :
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
        )
}
