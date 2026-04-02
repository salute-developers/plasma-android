// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
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

internal object PlasmaB2cSegmentVariationsCompose : ComposeStyleProvider<SegmentStyle>() {
    override val variations: Map<String, ComposeStyleReference<SegmentStyle>> =
        mapOf(
            "Xl.Primary" to ComposeStyleReference { Segment.Xl.Primary.style() },
            "Xl.Secondary" to ComposeStyleReference { Segment.Xl.Secondary.style() },
            "Xl.Accent" to ComposeStyleReference { Segment.Xl.Accent.style() },
            "Xl.Pilled.Primary" to ComposeStyleReference { Segment.Xl.Pilled.Primary.style() },
            "Xl.Pilled.Secondary" to ComposeStyleReference { Segment.Xl.Pilled.Secondary.style() },
            "Xl.Pilled.Accent" to ComposeStyleReference { Segment.Xl.Pilled.Accent.style() },
            "L.Primary" to ComposeStyleReference { Segment.L.Primary.style() },
            "L.Secondary" to ComposeStyleReference { Segment.L.Secondary.style() },
            "L.Accent" to ComposeStyleReference { Segment.L.Accent.style() },
            "L.Pilled.Primary" to ComposeStyleReference { Segment.L.Pilled.Primary.style() },
            "L.Pilled.Secondary" to ComposeStyleReference { Segment.L.Pilled.Secondary.style() },
            "L.Pilled.Accent" to ComposeStyleReference { Segment.L.Pilled.Accent.style() },
            "M.Primary" to ComposeStyleReference { Segment.M.Primary.style() },
            "M.Secondary" to ComposeStyleReference { Segment.M.Secondary.style() },
            "M.Accent" to ComposeStyleReference { Segment.M.Accent.style() },
            "M.Pilled.Primary" to ComposeStyleReference { Segment.M.Pilled.Primary.style() },
            "M.Pilled.Secondary" to ComposeStyleReference { Segment.M.Pilled.Secondary.style() },
            "M.Pilled.Accent" to ComposeStyleReference { Segment.M.Pilled.Accent.style() },
            "S.Primary" to ComposeStyleReference { Segment.S.Primary.style() },
            "S.Secondary" to ComposeStyleReference { Segment.S.Secondary.style() },
            "S.Accent" to ComposeStyleReference { Segment.S.Accent.style() },
            "S.Pilled.Primary" to ComposeStyleReference { Segment.S.Pilled.Primary.style() },
            "S.Pilled.Secondary" to ComposeStyleReference { Segment.S.Pilled.Secondary.style() },
            "S.Pilled.Accent" to ComposeStyleReference { Segment.S.Pilled.Accent.style() },
            "Xs.Primary" to ComposeStyleReference { Segment.Xs.Primary.style() },
            "Xs.Secondary" to ComposeStyleReference { Segment.Xs.Secondary.style() },
            "Xs.Accent" to ComposeStyleReference { Segment.Xs.Accent.style() },
            "Xs.Pilled.Primary" to ComposeStyleReference { Segment.Xs.Pilled.Primary.style() },
            "Xs.Pilled.Secondary" to ComposeStyleReference { Segment.Xs.Pilled.Secondary.style() },
            "Xs.Pilled.Accent" to ComposeStyleReference { Segment.Xs.Pilled.Accent.style() },
        )
}
