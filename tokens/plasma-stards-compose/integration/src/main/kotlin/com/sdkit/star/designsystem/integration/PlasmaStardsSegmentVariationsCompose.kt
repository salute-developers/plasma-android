// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.segment.L
import com.sdkit.star.designsystem.styles.segment.M
import com.sdkit.star.designsystem.styles.segment.Pilled
import com.sdkit.star.designsystem.styles.segment.Primary
import com.sdkit.star.designsystem.styles.segment.S
import com.sdkit.star.designsystem.styles.segment.Secondary
import com.sdkit.star.designsystem.styles.segment.Segment
import com.sdkit.star.designsystem.styles.segment.Xl
import com.sdkit.star.designsystem.styles.segment.Xs

internal object PlasmaStardsSegmentVariationsCompose : ComposeStyleProvider<SegmentStyle>() {
    override val variations: Map<String, ComposeStyleReference<SegmentStyle>> =
        mapOf(
            "Xl.Primary" to ComposeStyleReference { Segment.Xl.Primary.style() },
            "Xl.Secondary" to ComposeStyleReference { Segment.Xl.Secondary.style() },
            "Xl.Pilled.Primary" to ComposeStyleReference { Segment.Xl.Pilled.Primary.style() },
            "Xl.Pilled.Secondary" to ComposeStyleReference { Segment.Xl.Pilled.Secondary.style() },
            "L.Primary" to ComposeStyleReference { Segment.L.Primary.style() },
            "L.Secondary" to ComposeStyleReference { Segment.L.Secondary.style() },
            "L.Pilled.Primary" to ComposeStyleReference { Segment.L.Pilled.Primary.style() },
            "L.Pilled.Secondary" to ComposeStyleReference { Segment.L.Pilled.Secondary.style() },
            "M.Primary" to ComposeStyleReference { Segment.M.Primary.style() },
            "M.Secondary" to ComposeStyleReference { Segment.M.Secondary.style() },
            "M.Pilled.Primary" to ComposeStyleReference { Segment.M.Pilled.Primary.style() },
            "M.Pilled.Secondary" to ComposeStyleReference { Segment.M.Pilled.Secondary.style() },
            "S.Primary" to ComposeStyleReference { Segment.S.Primary.style() },
            "S.Secondary" to ComposeStyleReference { Segment.S.Secondary.style() },
            "S.Pilled.Primary" to ComposeStyleReference { Segment.S.Pilled.Primary.style() },
            "S.Pilled.Secondary" to ComposeStyleReference { Segment.S.Pilled.Secondary.style() },
            "Xs.Primary" to ComposeStyleReference { Segment.Xs.Primary.style() },
            "Xs.Secondary" to ComposeStyleReference { Segment.Xs.Secondary.style() },
            "Xs.Pilled.Primary" to ComposeStyleReference { Segment.Xs.Pilled.Primary.style() },
            "Xs.Pilled.Secondary" to ComposeStyleReference { Segment.Xs.Pilled.Secondary.style() },
        )
}
