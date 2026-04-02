// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.segmentitem.Default
import com.sdds.sbcom.styles.segmentitem.SegmentItem

internal object SddsSbcomSegmentItemVariationsCompose : ComposeStyleProvider<SegmentItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<SegmentItemStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { SegmentItem.Default.style() },
        )
}
