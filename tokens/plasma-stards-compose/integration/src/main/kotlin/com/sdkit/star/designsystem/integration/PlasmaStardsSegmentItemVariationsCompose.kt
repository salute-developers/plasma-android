// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.segmentitem.L
import com.sdkit.star.designsystem.styles.segmentitem.M
import com.sdkit.star.designsystem.styles.segmentitem.Pilled
import com.sdkit.star.designsystem.styles.segmentitem.Primary
import com.sdkit.star.designsystem.styles.segmentitem.S
import com.sdkit.star.designsystem.styles.segmentitem.Secondary
import com.sdkit.star.designsystem.styles.segmentitem.SegmentItem
import com.sdkit.star.designsystem.styles.segmentitem.Xl
import com.sdkit.star.designsystem.styles.segmentitem.Xs

internal object PlasmaStardsSegmentItemVariationsCompose : ComposeStyleProvider<SegmentItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<SegmentItemStyle>> =
        mapOf(
            "Xl.Primary" to ComposeStyleReference { SegmentItem.Xl.Primary.style() },
            "Xl.Secondary" to ComposeStyleReference { SegmentItem.Xl.Secondary.style() },
            "Xl.Pilled.Primary" to ComposeStyleReference { SegmentItem.Xl.Pilled.Primary.style() },
            "Xl.Pilled.Secondary" to ComposeStyleReference { SegmentItem.Xl.Pilled.Secondary.style() },
            "L.Primary" to ComposeStyleReference { SegmentItem.L.Primary.style() },
            "L.Secondary" to ComposeStyleReference { SegmentItem.L.Secondary.style() },
            "L.Pilled.Primary" to ComposeStyleReference { SegmentItem.L.Pilled.Primary.style() },
            "L.Pilled.Secondary" to ComposeStyleReference { SegmentItem.L.Pilled.Secondary.style() },
            "M.Primary" to ComposeStyleReference { SegmentItem.M.Primary.style() },
            "M.Secondary" to ComposeStyleReference { SegmentItem.M.Secondary.style() },
            "M.Pilled.Primary" to ComposeStyleReference { SegmentItem.M.Pilled.Primary.style() },
            "M.Pilled.Secondary" to ComposeStyleReference { SegmentItem.M.Pilled.Secondary.style() },
            "S.Primary" to ComposeStyleReference { SegmentItem.S.Primary.style() },
            "S.Secondary" to ComposeStyleReference { SegmentItem.S.Secondary.style() },
            "S.Pilled.Primary" to ComposeStyleReference { SegmentItem.S.Pilled.Primary.style() },
            "S.Pilled.Secondary" to ComposeStyleReference { SegmentItem.S.Pilled.Secondary.style() },
            "Xs.Primary" to ComposeStyleReference { SegmentItem.Xs.Primary.style() },
            "Xs.Secondary" to ComposeStyleReference { SegmentItem.Xs.Secondary.style() },
            "Xs.Pilled.Primary" to ComposeStyleReference { SegmentItem.Xs.Pilled.Primary.style() },
            "Xs.Pilled.Secondary" to ComposeStyleReference { SegmentItem.Xs.Pilled.Secondary.style() },
        )
}
